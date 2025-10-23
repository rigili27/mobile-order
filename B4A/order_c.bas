B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Dim sql As SQL
	Dim rs As ResultSet
	
	Type ItemsData (ID As Int, IDPEDIDO As Int, CANTIDAD As Int, CODARTICULO As Int, ProductName As String, PRECIO As Double, IMPORTE As Double, PORDTO As String, COMENTARIO As String)
	
	'order_layout
	Private ftxtOrderId As B4XFloatTextField
	Private ftxtCustomerName As B4XFloatTextField
	Private hsvItems As HorizontalScrollView
	Private ftxtComent As String
	
	'order_list_item_layout
	Private clvItems As CustomListView
	
	'order_product_item_layout
	Private lblQuantity As Label
	Private lblProduct As Label
	Private lblPriceProduct As Label
	Private lblOffProduct As Label
	Private lblPriceItem As Label
	
	'products_add_order_item_layout
	Private dialog As B4XDialog
	Private txtQuantity As B4XFloatTextField
	Private txtPrecio As B4XFloatTextField
	Private txtOff As B4XFloatTextField
	Private txtComentario As B4XFloatTextField
	
	'global
	Public Order As OrdersData
	Public QuienRecibe As String
	Public Firma As Bitmap
	
	Dim phone As Phone
	
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("order_layout")
	Log("create order page")
	
	'menu items
	B4XPages.SetTitle(Me, "Pedido")
	B4XPages.AddMenuItem(Me, "Recibe")
	B4XPages.AddMenuItem(Me, "Comentarios")
	B4XPages.AddMenuItem(Me, "Firma")
	
	B4XPages.AddMenuItem(Me, "Ver remito")
	
	Dim addItem As B4AMenuItem = B4XPages.AddMenuItem(Me, "Agregar")
	addItem.AddToBar = True
	
	
	
	'asas
	Dim p As Panel
	p = xui.CreatePanel("")
	p.SetLayoutAnimated(100, 0 , 0, 190%x, hsvItems.Height)
	p.LoadLayout("order_list_items_layout")
	hsvItems.Panel.AddView(p, 0, 0, 200%x, 100%y)
	hsvItems.Panel.Width = 200%x
	
End Sub

Sub B4XPage_Appear
	txtSearch_TextChanged("", "", Order)
	B4XPages.SetTitle(Me, "Pedido nro: " & Order.ID)
	
	'pongo en 0 la variable
	Dim products_page As products_c = B4XPages.GetPage("products_page")
	products_page.CallOf = ""
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		If dialog.Close(xui.DialogResponse_Cancel) Then Return True
	End If
	Return False
End Sub

Private Sub txtSearch_TextChanged (Old As String, New As String, OD As OrdersData)
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM PedCMovil WHERE (ID = " & OD.ID  & ")")
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			
			Dim OD As OrdersData
			OD.Initialize
			OD.ID = rs.GetString("ID")
			OD.CODCLIENTE = rs.GetString("CODCLIENTE")
			OD.Customer = Starter.SelectCustomer(OD.CODCLIENTE).NOMBRE
			OD.CODVENDEDOR = rs.GetString("CODVENDEDOR")
			OD.FECHA = rs.GetString("FECHA")
			OD.COMENTARIOS = rs.GetString("COMENTARIOS")
			
			Dim Buffer() As Byte
			Buffer = rs.GetBlob("FIRMA")
			If Buffer = Null Then
				OD.FIRMA = Null
			Else
				Dim InputStream1 As InputStream
				InputStream1.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
				OD.FIRMA.Initialize2(InputStream1)
				InputStream1.Close
			End If
			
			OD.NROPEDIDO = rs.GetString("NROPEDIDO")
			OD.QUIENRECIBIO = rs.GetString("QUIENRECIBIO")
			OD.TotalOrder = sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO=" & OD.ID)
			
		Loop
	End If
	rs.Close

	ftxtOrderId.Text = OD.ID
	ftxtOrderId.TextField.Enabled = False
	ftxtCustomerName.Text = OD.Customer
	ftxtCustomerName.TextField.Enabled = False
	ftxtComent = OD.COMENTARIOS
	QuienRecibe = OD.QUIENRECIBIO
	Firma = OD.FIRMA
	
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	rs = sql.ExecQuery("SELECT * FROM PedDMovil WHERE (IDPEDIDO = " & OD.ID  & ")")
	
	clvItems.Clear
	
	Dim xui As XUI
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			
			Dim ID As ItemsData
			ID.Initialize
			ID.ID = rs.GetString("ID")
			ID.CODARTICULO = rs.GetString("CODARTICULO")
			ID.ProductName = Starter.SelectProduct(ID.CODARTICULO).DESCRIPCION
			ID.CANTIDAD = rs.GetString("CANTIDAD")
			ID.PRECIO = rs.GetString("PRECIO")
			ID.IMPORTE = rs.GetString("IMPORTE")
			ID.PORDTO = rs.GetString("PORDTO")
			
			Dim p As Panel
			p = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0, 0, clvItems.AsView.Width, 52dip)
			clvItems.Add(p, ID)
			
		Loop
	End If
	
	rs.Close
	
End Sub

Private Sub clvItems_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Log(FirstIndex & "   -   " & LastIndex)
	Dim extra As Int = 10
	For i = Max(0, FirstIndex - extra) To Min(LastIndex + extra, clvItems.Size - 1)
		Dim p As Panel = clvItems.GetPanel(i)
		If i > FirstIndex - extra And i < LastIndex + extra Then
			If p.NumberOfViews = 0 Then
				Dim ID As ItemsData = clvItems.GetValue(i)
				p.LoadLayout("order_product_item_layout")
				lblQuantity.Text = ID.CANTIDAD
				lblProduct.Text = ID.ProductName
				lblPriceProduct.Text = "$ " & ID.PRECIO
				lblOffProduct.Text = ID.PORDTO & " %"
				lblPriceItem.Text = "$ " & ID.IMPORTE
			End If
		Else
			If p.NumberOfViews > 0 Then
				p.RemoveAllViews
			End If
		End If
	Next
End Sub

'menu
Sub b4xpage_MenuClick (Tag As String)
	If Tag = "Agregar" Then
		
		Dim products_page As products_c = B4XPages.GetPage("products_page")
		products_page.CallOf = "order_page"
		products_page.Order = Order
'		Starter.OrderId = ftxtOrderId.Text
		B4XPages.ShowPage("products_page")
		
	Else If Tag = "Recibe" Then
		
		dialog.Initialize(Root)
		dialog.Title = "Recibe"
		
		Dim input As B4XInputTemplate
		input.Initialize
		input.lblTitle.Text = "Recibe el pedido"
		input.Text = QuienRecibe
		input.mBase.Width = 90%x
		input.TextField1.Width = 85%x
		Wait For (dialog.ShowTemplate(input, "OK", "", "CANCEL")) Complete (Result As Int)
		If Result = xui.DialogResponse_Positive Then
			sql.Initialize(Starter.Route, Starter.DataBase, True)
			sql.ExecNonQuery2("UPDATE PedCMovil SET QUIENRECIBIO=? WHERE ID=?", _
								Array As String(input.Text, ftxtOrderId.Text))
								
			B4XPage_Appear
		End If
		
	Else If Tag = "Comentarios" Then
		
		dialog.Initialize(Root)
		dialog.Title = "Comentarios"
		
		Dim input As B4XInputTemplate
		input.Initialize
		input.lblTitle.Text = "Comentarios"
		input.Text = ftxtComent
		input.mBase.Width = 90%x
		input.mBase.Height = 140dip
		input.TextField1.Width = 85%x
		input.TextField1.Height = 80dip
		input.TextField1.SetTextAlignment("TOP", "LEFT")
		Wait For (dialog.ShowTemplate(input, "OK", "", "CANCEL")) Complete (Result As Int)
		If Result = xui.DialogResponse_Positive Then
			sql.Initialize(Starter.Route, Starter.DataBase, True)
			sql.ExecNonQuery2("UPDATE PedCMovil SET COMENTARIOS=? WHERE ID=?", _
								Array As String(input.Text, ftxtOrderId.Text))
								
			B4XPage_Appear
		End If
		
	Else If Tag = "Firma" Then
		
		dialog.Initialize(Root)
		dialog.Title = "Firma"
		
		Dim signature As B4XSignatureTemplate
		signature.Initialize
'		signature.mBase.Height = 240dip
'		signature.mBase.Width = 90%x
		

		If Firma.IsInitialized Then
			Log("firma ok")
			signature.mBase.SetBitmap(Firma)
			Wait For (dialog.ShowTemplate(signature, "", "BORRAR", "CANCEL")) Complete (Result As Int)
			
		Else
			Wait For (dialog.ShowTemplate(signature, "OK", "", "CANCEL")) Complete (Result As Int)
		End If

		
		If Result = xui.DialogResponse_Positive Then
		
			'guardo la firma
			Dim OutputStream1 As OutputStream
			OutputStream1.InitializeToBytesArray(1000)
			Dim Buffer() As Byte
			signature.Bitmap.WriteToStream(OutputStream1, 90, "JPEG")
			Buffer = OutputStream1.ToBytesArray
			
			sql.Initialize(Starter.Route, Starter.DataBase, True)
			sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?", _
								Array As Object(Buffer, ftxtOrderId.Text))
								
			B4XPage_Appear
		
		Else If Result = xui.DialogResponse_Negative Then
			sql.Initialize(Starter.Route, Starter.DataBase, True)
			sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?", _
								Array As Object(Null, ftxtOrderId.Text))
								
			B4XPage_Appear
			b4xpage_MenuClick("Firma")
		End If
	
	' En el Sub b4xpage_MenuClick
	Else If Tag = "Ver remito" Then
		' Usa el ID del pedido actual
		CreateRemitoPDF(Order.ID)

	End If
End Sub


'delete item
Private Sub clvItems_ItemLongClick (Index As Int, Value As Object)
	
	Dim ID As ItemsData = Value
	
	Msgbox2Async("¿Estás seguro de que deseas quitar el item?", "Confirmación", "Sí", "", "No", Null, True)
	Wait For Msgbox_Result (Result As Int)
    
	If Result = DialogResponse.POSITIVE Then
		Log("El usuario eligió Sí.")
		sql.Initialize(Starter.Route, Starter.DataBase, True)
		sql.ExecNonQuery("DELETE FROM PedDMovil WHERE ID=" & ID.ID)
	Else
		Log("El usuario eligió No.")
		' No se realiza la acción
	End If
	
	B4XPage_Appear
	
End Sub

'edit item
Private Sub clvItems_ItemClick (Index As Int, Value As Object)
	
	dialog.Initialize(Root)
	dialog.Title = "Editar item"
	
	dialog.BackgroundColor = Colors.White
	dialog.ButtonsColor = Colors.Transparent
	dialog.ButtonsTextColor = Colors.Black
	
	Dim ID As ItemsData = Value
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 60dip, 0, Root.Width - 60dip, 320dip)
	p.LoadLayout("products_add_order_item_layout")
	dialog.PutAtTop = True 'put the dialog at the top of the screen
	
	txtQuantity.Text = ID.CANTIDAD
	txtPrecio.Text = ID.PRECIO
	txtOff.Text = ID.PORDTO
	txtComentario.Text = ID.COMENTARIO
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		sql.Initialize(Starter.Route, Starter.DataBase, True)
		sql.ExecNonQuery2("UPDATE PedDMovil SET CANTIDAD=?, PRECIO=?, IMPORTE=?, PORDTO=?, COMENTARIO=? WHERE ID=?", _
								Array As String(txtQuantity.Text, txtPrecio.Text, txtQuantity.Text * txtPrecio.Text - (txtQuantity.Text * txtPrecio.Text * txtOff.Text / 100), txtOff.Text, txtComentario.Text, ID.ID))
								
		B4XPage_Appear
		
	End If
	
End Sub



Private Sub btnAddProduct_Click
	b4xpage_MenuClick("Agregar")
End Sub



'   pdf




Sub CreateRemitoPDF(id As Int)
	Dim pdf As PdfDocument
	pdf.Initialize

	' Define el tamaño de la página (A4: 595 x 842 puntos)
	Dim pageWidth As Int = 595
	Dim pageHeight As Int = 842

	pdf.StartPage(pageWidth, pageHeight) ' A4
	
	Dim orderHeader As OrdersData = GetOrderHeader(id)
	Dim orderItems As List = GetOrderItems(id)

	' Variables para la posición y estilo
	Dim yPosition As Int = 50
	Dim xMargin As Int = 40
	Dim lineSpace As Int = 20
	Dim fontSize As Float
	
	If Starter.access.GetUserFontScale < 1 Then
		fontSize = 8
	else If Starter.access.GetUserFontScale > 1 And Starter.access.GetUserFontScale < 1.25  Then
		fontSize = 6
	else If Starter.access.GetUserFontScale > 1.25 Then
		fontSize = 5.2
	else if Starter.access.GetUserFontScale = 1 Then
		fontSize = 7
	End If
	
'	Log(Starter.access.GetUserFontScale)
'	Log(fontSize)
'	Log(fontSize - 7)
	
	' --- ENCABEZADO DEL REMITO ---
	
	pdf.canvas.DrawText("" & Starter.SelectBusiness.RAZONSOCIAL, xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace
	
	pdf.canvas.DrawText("CUIT: " & Starter.SelectBusiness.NRCUIT, xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace * 2
	
	pdf.canvas.DrawText("REMITO NRO: " & orderHeader.ID, xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace
	
	pdf.canvas.DrawText("Cliente: " & orderHeader.Customer & " (Cód: " & orderHeader.CODCLIENTE & ")", xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace
	
	DateTime.DateFormat = "dd/MM/yyyy"
	pdf.Canvas.DrawText("Fecha: " & DateTime.Date(orderHeader.FECHA), xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")

	pdf.canvas.DrawText("Vendedor: " & Starter.Seller.NOMBRE, pageWidth / 2, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace
	
	pdf.canvas.DrawLine(xMargin, yPosition, pageWidth - xMargin, yPosition, Colors.Gray, 1)
	yPosition = yPosition + lineSpace
	
	' --- DETALLE DE ITEMS (Tabla) ---
	Dim colWidths() As Int = Array As Int(30, 290, 90, 40, 90)
	Dim colPositions(colWidths.Length) As Int
	
	Dim currentX As Int = xMargin
	For i = 0 To colWidths.Length - 1
		colPositions(i) = currentX
		currentX = currentX + colWidths(i)
	Next
	
	Dim headers() As String = Array As String("Cant.", "Producto", "Precio Un.", "% Dto", "Subtotal")
	
	For i = 0 To headers.Length - 1
		pdf.canvas.DrawText(headers(i), colPositions(i), yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	Next
	
	yPosition = yPosition + lineSpace / 2
	pdf.canvas.DrawLine(xMargin, yPosition, pageWidth - xMargin, yPosition, Colors.Gray, 1)
	yPosition = yPosition + lineSpace
	
'	Log(pageHeight - 200)
	
	
	For Each item As ItemsData In orderItems
'		Log(yPosition)
		If yPosition > pageHeight - 200 Then ' Salto de página si es necesario
			pdf.FinishPage
			pdf.StartPage(pageWidth, pageHeight) ' A4
			yPosition = 50
			
			pdf.canvas.DrawLine(xMargin, yPosition, pageWidth - xMargin, yPosition, Colors.Gray, 1)
			yPosition = yPosition + lineSpace
			
			For i = 0 To headers.Length - 1
				pdf.canvas.DrawText(headers(i), colPositions(i), yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
			Next
			
			yPosition = yPosition + lineSpace / 2
			pdf.canvas.DrawLine(xMargin, yPosition, pageWidth - xMargin, yPosition, Colors.Gray, 1)
			yPosition = yPosition + lineSpace
		End If
		
		pdf.canvas.DrawText(item.CANTIDAD, colPositions(0), yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
		pdf.canvas.DrawText(item.ProductName, colPositions(1), yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
		pdf.canvas.DrawText("$ " & NumberFormat2(item.PRECIO, 1, 2, 2, False), colPositions(2), yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
		pdf.canvas.DrawText(item.PORDTO & " %", colPositions(3), yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
		pdf.canvas.DrawText("$ " & NumberFormat2(item.IMPORTE, 1, 2, 2, False), colPositions(4), yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
		yPosition = yPosition + lineSpace
		
	Next
	
	pdf.canvas.DrawLine(xMargin, yPosition, pageWidth - xMargin, yPosition, Colors.Black, 1)
	yPosition = yPosition + lineSpace
	
	
	' --- RESUMEN Y PIE DE PÁGINA ---
	
	pdf.canvas.DrawText("Total Pedido:", colPositions(2) + 20, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	
	pdf.canvas.DrawText("$ " & NumberFormat2(orderHeader.TotalOrder, 1, 2, 2, False), colPositions(3) + 20, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace * 2
	
	
	If yPosition > pageHeight - 300 Then ' Salto de página si es necesario
		pdf.FinishPage
		pdf.StartPage(pageWidth, pageHeight) ' A4
		yPosition = 50
	End If
	
	pdf.canvas.DrawText("Comentarios Generales:", xMargin, yPosition, Typeface.DEFAULT_BOLD, fontSize, Colors.Black, "LEFT")
	yPosition = yPosition + lineSpace
	pdf.canvas.DrawText(orderHeader.COMENTARIOS, xMargin, yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
'	yPosition = yPosition + lineSpace * 2
	
'	pdf.canvas.DrawText("Recibe: " & orderHeader.QUIENRECIBIO, xMargin, yPosition, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
'	yPosition = yPosition + lineSpace * 2
	
	' Firma
	If orderHeader.FIRMA.IsInitialized Then
		Dim bmp As Bitmap = orderHeader.FIRMA
		
		Dim rectFirma As Rect
		rectFirma.Initialize(pageWidth - 200, yPosition, pageWidth - xMargin - 10, yPosition + 70)
		pdf.canvas.DrawBitmap(bmp, Null, rectFirma)
		pdf.canvas.DrawLine(pageWidth - 200, yPosition + 75, pageWidth - xMargin, yPosition + 75, Colors.Black, 1)
		pdf.canvas.DrawText(orderHeader.QUIENRECIBIO, pageWidth - 150, yPosition + 90, Typeface.DEFAULT, fontSize, Colors.Black, "LEFT")
	End If
	
	
	pdf.FinishPage

	Dim filename As String = "Remito_" & id & ".pdf"
	Dim out As OutputStream = File.OpenOutput(Starter.Provider.SharedFolder, filename, False)
	pdf.WriteToStream(out)
	out.Close
	pdf.Close

'	Log("PDF creado: " & File.Combine(Starter.Provider.SharedFolder, filename))

	Dim intento As Intent
	Dim uri As Object

	If phone.SdkVersion >= 24 Then
		' Android 7 o superior: usar FileProvider
		uri = Starter.Provider.GetFileUri(filename)
		intento.Initialize(intento.ACTION_VIEW, uri)
		intento.Flags = Bit.Or(intento.Flags, 1)
		intento.SetType("application/pdf")
	Else
		' Android 6 o anterior: usar file://
		intento.Initialize(intento.ACTION_VIEW, "file://" & File.Combine(Starter.Provider.SharedFolder, filename))
		intento.SetType("application/pdf")
	End If

	Try
		StartActivity(intento)
	Catch
		ToastMessageShow("No hay aplicación para abrir PDF.", True)
	End Try
End Sub


Private Sub GetOrderHeader(OrderId As Int) As OrdersData
	Dim OD As OrdersData
	OD.Initialize
    
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM PedCMovil WHERE (ID = " & OrderId & ")")
	If rs.RowCount > 0 Then
		Do While rs.NextRow
            
			OD.ID = rs.GetString("ID")
			OD.CODCLIENTE = rs.GetString("CODCLIENTE")
			OD.Customer = ftxtCustomerName.Text ' Usar el valor del campo que ya está cargado
            
			OD.CODVENDEDOR = rs.GetString("CODVENDEDOR")
			OD.FECHA = rs.GetString("FECHA")
			OD.COMENTARIOS = rs.GetString("COMENTARIOS")
            
			' Manejo de la Firma
			Dim Buffer() As Byte
			Buffer = rs.GetBlob("FIRMA")
			If Buffer = Null Then
				OD.FIRMA = Null
			Else
				Dim InputStream1 As InputStream
				InputStream1.InitializeFromBytesArray(Buffer, 0, Buffer.Length)
                
				' El campo FIRMA en OrdersData es B4XBitmap (por tu declaración de Sub Class_Globals)
				' Inicializamos el B4XBitmap con el InputStream
				OD.FIRMA.Initialize2(InputStream1)
				InputStream1.Close
			End If
            
			OD.NROPEDIDO = rs.GetString("NROPEDIDO")
			OD.QUIENRECIBIO = rs.GetString("QUIENRECIBIO")
            
			' Calcular Total (usando la consulta a PedDMovil)
			Dim totalResult As String = sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO=" & OrderId)
			If totalResult = Null Or totalResult = "" Then totalResult = "0"
			OD.TotalOrder = totalResult
            
		Loop
	End If
	rs.Close
    
	Return OD
End Sub

Private Sub GetOrderItems(OrderId As Int) As List
	Dim itemsList As List
	itemsList.Initialize
    
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM PedDMovil WHERE (IDPEDIDO = " & OrderId & ")")
    
	If rs.RowCount > 0 Then
		Do While rs.NextRow
            
			Dim ID As ItemsData
			ID.Initialize
			ID.ID = rs.GetString("ID")
			ID.CODARTICULO = rs.GetString("CODARTICULO")
			ID.ProductName = Starter.SelectProduct(ID.CODARTICULO).DESCRIPCION
			ID.CANTIDAD = rs.GetString("CANTIDAD")
			ID.PRECIO = rs.GetString("PRECIO")
			ID.IMPORTE = rs.GetString("IMPORTE")
			ID.PORDTO = rs.GetString("PORDTO")
            
			' Asegúrate de que el campo COMENTARIO exista en tu tabla PedDMovil
			Try
				ID.COMENTARIO = rs.GetString("COMENTARIO")
			Catch
				ID.COMENTARIO = ""
			End Try
            
			itemsList.Add(ID)
            
		Loop
	End If
	rs.Close
    
	Return itemsList
End Sub