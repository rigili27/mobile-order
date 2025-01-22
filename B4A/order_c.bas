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