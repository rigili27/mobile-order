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
	
	Type ProductsData (CODIGO As Int, DESCRIPCION As String, SKU As String, PREVTAPUB1 As Double, PREVTAPUB2 As Double, PREVTAPUB3 As Double, ALICUTA As Int, MONEDA As Int, CODIGOBARRA As Int)
	
	'products_layout
	Private clvProducts As CustomListView
	Private txtSearch As B4XFloatTextField
	
	Private FondoOscuro As B4XView
	Private PanelDetailProduct As B4XView
	
	'product_item_layout
	Private lblSKU As B4XView
	Private lblDescription As B4XView
	Private lblPrecio As Label
	
	'products_add_order_item_layout
	Private dialog As B4XDialog
	Private txtQuantity As B4XFloatTextField
	Private txtPrecio As B4XFloatTextField
	Private txtOff As B4XFloatTextField
	Private txtComentario As B4XFloatTextField
	
	'globar
	Public CallOf As String
	Public Order As OrdersData
	Public Customer As CustomersData
	Public Barcode As String
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("products_layout")
	Log("create products page")
	
	'menu items
	B4XPages.SetTitle(Me, "Productos")
	B4XPages.AddMenuItem(Me, "Escanear")
	
	
End Sub

Sub B4XPage_Appear
	
	If Barcode = "" Then
		txtSearch_TextChanged("", "")
	Else
'		txtSearch_TextChanged("", Barcode)
		txtSearch.Text = Barcode
	End If
	
	Customer = Starter.SelectCustomer(Order.CODCLIENTE)
	
End Sub

Sub B4XPage_Disappear
	Barcode = ""
	txtSearch.Text = ""
End Sub

Private Sub txtSearch_TextChanged (Old As String, New As String)
	
	If New.Length = 1 Or New.Length = 2 Then Return
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	If New.Length > 0 Then
		rs = sql.ExecQuery("SELECT * FROM ArtMovil WHERE (SKU LIKE '%" & New.Trim & "%' OR DESCRIPCION LIKE '%" & New.Trim & "%' OR CODIGO LIKE '%" & New.Trim & "%' OR CODIGOBARRA LIKE '%" & New.Trim & "%')")
	Else
		rs = sql.ExecQuery("SELECT * FROM ArtMovil")
	End If
	
	clvProducts.Clear
	
	Dim xui As XUI
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			
			Dim PD As ProductsData
			PD.Initialize
			PD.DESCRIPCION = rs.GetString("DESCRIPCION")
			PD.CODIGO = rs.GetString("CODIGO")
			PD.SKU = rs.GetString("SKU")
			PD.PREVTAPUB1 = rs.GetString("PREVTAPUB1")
			PD.PREVTAPUB2 = rs.GetString("PREVTAPUB2")
			PD.PREVTAPUB3 = rs.GetString("PREVTAPUB3")
			
			Dim p As Panel
			p = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0, 0, clvProducts.AsView.Width, 112dip)
			clvProducts.Add(p, PD)
			
		Loop
	End If
	
	rs.Close
	
End Sub

Private Sub clvProducts_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Log(FirstIndex & "   -   " & LastIndex)
	Dim extra As Int = 10
	For i = Max(0, FirstIndex - extra) To Min(LastIndex + extra, clvProducts.Size - 1)
		Dim p As Panel = clvProducts.GetPanel(i)
		If i > FirstIndex - extra And i < LastIndex + extra Then
			If p.NumberOfViews = 0 Then
				Dim PD As ProductsData = clvProducts.GetValue(i)
				p.LoadLayout("product_item_layout")
				lblDescription.Text = PD.DESCRIPCION
				lblSKU.Text = "SKU: " & PD.SKU
				
				If Customer <> Null And Customer.NROLPRECIOS = 1 Then
					lblPrecio.Text = "$ " & PD.PREVTAPUB1
				Else If Customer <> Null And Customer.NROLPRECIOS = 2 Then
					lblPrecio.Text = "$ " & PD.PREVTAPUB2
				Else If	Customer <> Null And Customer.NROLPRECIOS = 3 Then
					lblPrecio.Text = "$ " & PD.PREVTAPUB3
				Else
					lblPrecio.Text = "$ " & PD.PREVTAPUB1
				End If
					
			End If
		Else
			If p.NumberOfViews > 0 Then
				p.RemoveAllViews
			End If
		End If
	Next
End Sub

Private Sub btnClearSearch_Click
	txtSearch.Text = ""
	txtSearch_TextChanged("", "")
End Sub

Private Sub clvProducts_ItemClick (Index As Int, Value As Object)
'	PanelDetailProduct.Visible = True
'	FondoOscuro.Visible = True
	If CallOf = "order_page" Then
		AddItem(Value)
	End If
End Sub


'panel agregar item en order_c
Private Sub AddItem(Value As Object)
	
	dialog.Initialize(Root)
	dialog.Title = "Entrada de datos"
	
	dialog.BackgroundColor = Colors.White
	dialog.ButtonsColor = Colors.Transparent
	dialog.ButtonsTextColor = Colors.Black
	
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 60dip, 0, Root.Width - 60dip, 320dip)
	p.LoadLayout("products_add_order_item_layout")
	dialog.PutAtTop = True 'put the dialog at the top of the screen
	
	Dim PD As ProductsData = Value
	
	If Customer.NROLPRECIOS = 1 Then
		txtPrecio.Text = PD.PREVTAPUB1
	Else If	Customer.NROLPRECIOS = 2 Then
		txtPrecio.Text = PD.PREVTAPUB2
	Else If	Customer.NROLPRECIOS = 3 Then
		txtPrecio.Text = PD.PREVTAPUB3
	Else
		txtPrecio.Text = PD.PREVTAPUB1
	End If
	
	txtQuantity.Text = 1
	txtOff.Text = 0
	
	Wait For (dialog.ShowCustom(p, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		
'		If txtQuantity.Text < 1 Then txtQuantity.Text = 1
		
		sql.Initialize(Starter.Route, Starter.DataBase, True)
		sql.ExecNonQuery2("INSERT INTO PedDMovil(IDPEDIDO, CODARTICULO, CANTIDAD, PRECIO, IMPORTE, UNIDAD, PORDTO, COMENTARIO) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", _
								 Array As Object(Order.ID, PD.CODIGO, txtQuantity.Text, txtPrecio.Text, txtQuantity.Text * txtPrecio.Text - (txtQuantity.Text * txtPrecio.Text * txtOff.Text / 100), 0, txtOff.Text, txtComentario.Text))
								 
		B4XPages.ClosePage(B4XPages.GetPage("products_page"))
		B4XPages.ShowPage("order_page")
		
	End If
	
	
End Sub


'Panel Detalle del producto
'solo se llama si no se esta creando un pedido


Private Sub btnDetailPanel_Volver_Click
	PanelDetailProduct.Visible = False
	FondoOscuro.Visible = False
End Sub

'menu
Sub b4xpage_MenuClick (Tag As String)
	
	If Tag = "Escanear" Then
		B4XPages.ShowPage("scan_page")
	End If
	
End Sub