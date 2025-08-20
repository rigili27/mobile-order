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
	B4XPages.SetTitle(Me, "Escritorio")
	B4XPages.AddMenuItem(Me, "Cerrar sesión")
	
'	Dim addItem As B4AMenuItem = B4XPages.AddMenuItem(Me, Starter.Seller.NOMBRE)
'	addItem.AddToBar = True

	' --- Logo / Imagen ---
	Dim ivLogo As ImageView
	ivLogo.Initialize("")
	ivLogo.Bitmap = LoadBitmapResize(File.DirAssets, "user.png", 100dip, 100dip, True)
	Root.AddView(ivLogo, Root.Width/2 - 50dip, 30dip, 100dip, 100dip)
    
	' --- Nombre vendedor ---
	Dim lblSeller As Label
	lblSeller.Initialize("")
	lblSeller.Text = Starter.Seller.NOMBRE
	lblSeller.TextSize = 20
	lblSeller.TextColor = Colors.Black
	lblSeller.Gravity = Gravity.CENTER
	Root.AddView(lblSeller, 0, 140dip, Root.Width, 30dip)
    
	' --- Empresa ---
	Dim lblCompany As Label
	lblCompany.Initialize("")
	lblCompany.Text = Starter.SelectBusiness.RAZONSOCIAL.Trim
	lblCompany.TextSize = 14
	lblCompany.TextColor = Colors.Gray
	lblCompany.Gravity = Gravity.CENTER
	Root.AddView(lblCompany, 0, 170dip, Root.Width, 20dip)
    
	' --- Cards con estilo ---
	CreateCard("btnCustomers", "👥", "Clientes", 20dip, 240dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(240,248,255))
	CreateCard("btnProducts", "📦", "Productos", Root.Width/2 + 10dip, 240dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(255,250,240))
	CreateCard("btnOrders", "🧾", "Pedidos", 20dip, 360dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(245,255,250))
	CreateCard("btnSettings", "⚙️", "Configuración", Root.Width/2 + 10dip, 360dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(250,240,230))
	
	
End Sub

Private Sub CreateCard(EventName As String, Emoji As String, Title As String, Left As Int, Top As Int, Width As Int, Height As Int, BgColor As Int)
	Dim pnl As B4XView = xui.CreatePanel(EventName)
	pnl.SetLayoutAnimated(0, Left, Top, Width, Height)
	pnl.SetColorAndBorder(BgColor, 1dip, Colors.LightGray, 15dip)
	Root.AddView(pnl, Left, Top, Width, Height)
    
	' Emoji arriba
	Dim lblIcon As Label
	lblIcon.Initialize("")
	lblIcon.Text = Emoji
	lblIcon.TextSize = 32
	lblIcon.Gravity = Gravity.CENTER
	pnl.AddView(lblIcon, 0, 10dip, pnl.Width, 40dip)
    
	' Título abajo
	Dim lblTitle As Label
	lblTitle.Initialize("")
	lblTitle.Text = Title
	lblTitle.TextSize = 18
	lblTitle.TextColor = Colors.Black
	lblTitle.Gravity = Gravity.CENTER
	pnl.AddView(lblTitle, 0, 55dip, pnl.Width, 30dip)
End Sub


Sub B4XPage_Appear
	
'	B4XPages.SetTitle(Me, "👤 " & Starter.Seller.NOMBRE & " ")

	
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