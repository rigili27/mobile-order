B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	'pages
	Dim login As login_c
	Dim home As home_c
	Dim products As products_c
	Dim orders As orders_c
	Dim order As order_c
	Dim customers As customers_c
	Dim settings As settings_c
	Dim scan As scan_c
	Private btnLogin As Button
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
	B4XPages.GetManager.TransitionAnimationDuration = 0  'Animations disables
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	B4XPages.SetTitle(Me, "Mobile Order")
	
'	CopyDataBase
	
	'create and initialize pages
	login.Initialize
	B4XPages.AddPage("login_page", login)
	products.Initialize
	B4XPages.AddPage("home_page", home)
	home.Initialize
	B4XPages.AddPage("products_page", products)
	orders.Initialize
	B4XPages.AddPage("orders_page", orders)
	order.Initialize
	B4XPages.AddPage("order_page", order)
	customers.Initialize
	B4XPages.AddPage("customers_page", customers)
	settings.Initialize
	B4XPages.AddPage("settings_page", settings)
	scan.Initialize
	B4XPages.AddPage("scan_page", scan)
	
	
	
End Sub

Sub B4XPage_Appear
	If Starter.ExistDataBase Then
		Log("existe base")
		btnLogin.Text = "Iniciar sesión"
	Else
		Log("No existe base")
		btnLogin.Text = "Configuración"
	End If
End Sub

Sub CopyDataBase
	File.Copy(File.DirAssets, Starter.DataBase, Starter.Route, Starter.DataBase)
	Log("copy database")
End Sub

Private Sub btnLogin_Click
	If Starter.ExistDataBase Then
		Log("existe base")
		B4XPages.ShowPage("login_page")
	Else
		Log("No existe base")
		B4XPages.ShowPage("settings_page")
	End If
	
End Sub

Private Sub btnHome_Click
	B4XPages.ShowPage("home_page")
End Sub

Private Sub Button1_Click

	CopyDataBase
	
End Sub

