B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Type CustomersData (CODIGO As Int, NOMBRE As String, DOMICILIO As String, LOCALIDAD As String, TELEFONO As String, NROCUIT As String, CODCATIVA As Int, NROLPRECIOS As Int, SALDO As Double)
	
	Dim sql As SQL
	Dim rs As ResultSet
	
	Private clvCustomers As CustomListView
	Private txtSearch As B4XFloatTextField
	
	'customer_item_layout
	Private lblId As Label
	Private lblName As Label
	Private lblInfo As Label
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("customers_layout")
	Log("create customers page")
	
	B4XPages.SetTitle(Me, "Clientes")
	
End Sub

Sub B4XPage_Appear
	
	txtSearch_TextChanged("", "")
	
End Sub

Private Sub txtSearch_TextChanged (Old As String, New As String)
	
	If New.Length = 1 Or New.Length = 2 Then Return
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	If New.Length > 0 Then
		rs = sql.ExecQuery("SELECT * FROM CliMovil WHERE (NOMBRE LIKE '%" & New.Trim & "%' OR NROCUIT LIKE '%" & New.Trim & "%')")
	Else
		rs = sql.ExecQuery("SELECT * FROM CliMovil")
	End If
	
	clvCustomers.Clear
	
	Dim xui As XUI
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			
			Dim CD As CustomersData
			CD.Initialize
			CD.CODIGO = rs.GetString("CODIGO")
			CD.NOMBRE = rs.GetString("NOMBRE")
			CD.DOMICILIO = rs.GetString("DOMICILIO")
			CD.LOCALIDAD = rs.GetString("LOCALIDAD")
			CD.TELEFONO = rs.GetString("TELEFONO")
			CD.NROCUIT = rs.GetString("NROCUIT")
			CD.CODCATIVA = rs.GetString("CODCATIVA")
			CD.NROLPRECIOS = rs.GetString("NROLPRECIOS")
			CD.SALDO = rs.GetString("SALDO")
			
			Dim p As Panel
			p = xui.CreatePanel("")
			p.SetLayoutAnimated(0, 0, 0, clvCustomers.AsView.Width, 108dip)
			clvCustomers.Add(p, CD)
			
		Loop
	End If
	
	rs.Close
	
End Sub



Private Sub clvCustomers_VisibleRangeChanged (FirstIndex As Int, LastIndex As Int)
	'	Log(FirstIndex & "   -   " & LastIndex)
	Dim extra As Int = 10
	For i = Max(0, FirstIndex - extra) To Min(LastIndex + extra, clvCustomers.Size - 1)
		Dim p As Panel = clvCustomers.GetPanel(i)
		If i > FirstIndex - extra And i < LastIndex + extra Then
			If p.NumberOfViews = 0 Then
				Dim CD As CustomersData = clvCustomers.GetValue(i)
				p.LoadLayout("customer_item_layout")
				lblId.Text = "Código nro: " & CD.CODIGO
				lblName.Text = CD.NOMBRE				
				lblInfo.Text = CD.LOCALIDAD & " - " & CD.DOMICILIO
			End If
		Else
			If p.NumberOfViews > 0 Then
				p.RemoveAllViews
			End If
		End If
	Next
End Sub

Private Sub clvCustomers_ItemClick (Index As Int, Value As Object)
	
	Dim CD As CustomersData = Value
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	sql.ExecNonQuery2("INSERT INTO PedCMovil(CODCLIENTE, CODVENDEDOR, FECHA, QUIENRECIBIO, COMENTARIOS) VALUES(?, ?, ?, ?, ?)", Array As Object(CD.CODIGO, Starter.Seller.CODIGO, DateTime.Now, "", ""))
	rs = sql.ExecQuery("SELECT * FROM PedCMovil ORDER BY ID DESC LIMIT 1")
	rs.NextRow
	Dim OD As OrdersData
	OD.ID = rs.GetString("ID")
	OD.CODCLIENTE = rs.GetString("CODCLIENTE")
	OD.Customer = Starter.SelectCustomer(OD.CODCLIENTE).NOMBRE
	Dim order_page As order_c = B4XPages.GetPage("order_page")
	order_page.Order = OD
	rs.Close
	
	B4XPages.ClosePage(B4XPages.GetPage("customers_page"))
	B4XPages.ShowPage("order_page")
	
End Sub