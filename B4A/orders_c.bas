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
	
	Type OrdersData (ID As Int, CODCLIENTE As Int, CODVENDEDOR As Int, FECHA As String, COMENTARIOS As String, NROPEDIDO As String, QUIENRECIBIO As String, FIRMA As Bitmap, Customer As String, TotalOrder As String)
	
	'orders_layout
	Private clvOrders As CustomListView
	Private txtSearch As EditText
	Private lblOrderId As B4XView
	Private lblCustomer As Label
	Private lblTotalOrder As B4XView
	
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("orders_layout")
	Log("create orders page")
	
	B4XPages.SetTitle(Me, "Pedidos")
	Dim addOrder As B4AMenuItem = B4XPages.AddMenuItem(Me, "Nuevo")
	addOrder.AddToBar = True
	
End Sub

Sub B4XPage_Appear
	
	txtSearch_TextChanged("", "")
	
End Sub

Private Sub txtSearch_TextChanged (Old As String, New As String)
	
	If New.Length = 1 Or New.Length = 2 Then Return
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	If New.Length > 0 Then
'		rs = sql.ExecQuery("SELECT  * FROM ArtMovil WHERE (DESCRIPCION LIKE '%" & New & "%' OR CODIGO LIKE '%" & New & "%' OR CODIGOBARRA LIKE '%" & New & "%')")
	Else
		rs = sql.ExecQuery("SELECT * FROM PedCMovil")
	End If
	
	clvOrders.Clear
	
	Dim xui As XUI
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
			
			Dim p As Panel
			p = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0, 0, clvOrders.AsView.Width, 52dip)
			clvOrders.Add(p, OD)
			
		Loop
	End If
	
	rs.Close
	
End Sub

Private Sub clvOrders_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
'	Log(FirstIndex & "   -   " & LastIndex)
	Dim extra As Int = 10
	For i = Max(0, FirstIndex - extra) To Min(LastIndex + extra, clvOrders.Size - 1)
		Dim p As Panel = clvOrders.GetPanel(i)
		If i > FirstIndex - extra And i < LastIndex + extra Then
			If p.NumberOfViews = 0 Then
				Dim OD As OrdersData = clvOrders.GetValue(i)
				p.LoadLayout("order_item_layout")
				lblCustomer.Text = OD.Customer
				lblOrderId.Text = OD.ID
				lblTotalOrder.Text = "$ " & OD.TotalOrder
			End If
		Else
			If p.NumberOfViews > 0 Then
				p.RemoveAllViews
			End If
		End If
	Next
End Sub

'Add Order
Sub b4xpage_MenuClick (Tag As String)
	If Tag = "Nuevo" Then
		B4XPages.ShowPage("customers_page")
	End If
End Sub

'Edit Order
Private Sub clvOrders_ItemClick (Index As Int, Value As Object)
	
	Dim OD As OrdersData = Value
	Dim order_page As order_c = B4XPages.GetPage("order_page")
	order_page.Order = OD
	B4XPages.ShowPage("order_page")
	
End Sub

'delete order
Private Sub clvOrders_ItemLongClick (Index As Int, Value As Object)
	
	Dim OD As OrdersData = Value
	
	Msgbox2Async("¿Estás seguro de que deseas quitar el pedido?", "Confirmación", "Sí", "", "No", Null, True)
	Wait For Msgbox_Result (Result As Int)
    
	If Result = DialogResponse.POSITIVE Then
		Log("El usuario eligió Sí.")
		sql.Initialize(Starter.Route, Starter.DataBase, True)
		'elimino el encabezado
		sql.ExecNonQuery("DELETE FROM PedCMovil WHERE ID=" & OD.ID)
		'elimino los items
		sql.ExecNonQuery("DELETE FROM PedDMovil WHERE IDPEDIDO=" & OD.ID)
		
	Else
		Log("El usuario eligió No.")
		' No se realiza la acción
	End If
	
	B4XPage_Appear
	
End Sub