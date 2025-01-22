B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("home_layout")
	Log("create home page")
	
	'menu items
	B4XPages.SetTitle(Me, "Home")
	B4XPages.AddMenuItem(Me, "Cerrar sesión")
	Dim addItem As B4AMenuItem = B4XPages.AddMenuItem(Me, Starter.Seller.NOMBRE)
	addItem.AddToBar = True
	
	
End Sub

Sub B4XPage_Appear
	
End Sub

Sub b4xpage_MenuClick (Tag As String)
	If Tag = "Cerrar sesión" Then
		Starter.Seller = Null
		B4XPages.ShowPageAndRemovePreviousPages("mainpage")
	End If
End Sub

Private Sub btnCustomers_Click
	B4XPages.ShowPage("customers_page")
End Sub

Private Sub btnProducts_Click
	
	B4XPages.ShowPage("products_page")
End Sub

Private Sub btnOrders_Click
	B4XPages.ShowPage("orders_page")
End Sub

Private Sub btnSettings_Click
	B4XPages.ShowPage("settings_page")
End Sub