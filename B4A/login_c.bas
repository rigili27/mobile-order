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
	
	Private dialog As B4XDialog
	Private cUser As B4XComboBox
	
	Type SellerData (CODIGO As Int, NOMBRE As String, CLAVE As String)
	
	Private txtPassword As B4XFloatTextField
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("login_layout")
	Log("create login page")
	
	B4XPages.SetTitle(Me, "Ingreso de usuarios")
	
	txtPassword.TextField.Color = Colors.White
	
End Sub

Sub B4XPage_Appear
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	rs = sql.ExecQuery("SELECT * FROM VendMovil")
	
	Dim lista As List
	lista.Initialize
	
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			lista.Add(rs.GetString("NOMBRE"))
		Loop
	End If
	rs.Close

	cUser.SetItems(lista)
End Sub

Private Sub btnLogin_Click
	
	sql.Initialize(Starter.Route, Starter.DataBase, True)
	
	rs = sql.ExecQuery("SELECT * FROM VendMovil WHERE NOMBRE='" & cUser.SelectedItem.Trim & "'")
	
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			If rs.GetString("CLAVE") = txtPassword.Text Then
				Dim SD As SellerData
				SD.Initialize
				SD.CODIGO = rs.GetString("CODIGO")
				SD.NOMBRE = rs.GetString("NOMBRE")
				SD.CLAVE = rs.GetString("CLAVE")
				Starter.Seller = SD
				B4XPages.ClosePage(B4XPages.GetPage("login_page"))
				B4XPages.ShowPageAndRemovePreviousPages("home_page")
			Else
				dialog.Initialize(Root)
				dialog.Title = "Clave incorrecta!!"
				dialog.Show("Intanta nuevamente.", "Ok", "", "")
			End If
				
		Loop
	End If
	rs.Close
		
	
End Sub