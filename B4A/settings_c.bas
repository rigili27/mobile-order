B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private ftp As FTP
	Private ftpPort As Int = 2221
	
	'settings_layout
	Private ime As IME
	Private txtIP As EditText
	
	Private btnEnviar As B4XView
	Private btnRecibir As B4XView
	Private btnShare As B4XView
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("settings_layout")
	Log("create settings page")
	
	'menu items
	B4XPages.SetTitle(Me, "Configuración")
	
	ime.Initialize("")
	ime.SetCustomFilter(txtIP, txtIP.INPUT_TYPE_NUMBERS, "0123456789.")
	
	
	
	' --- Cards con estilo ---
	CreateCard("btnEnviar", "📱 -> ️🖥️", "Enviar Datos a PC", 20dip, 400dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(245,255,250), "")
	CreateCard("btnRecibir", "📱 <- ️🖥️", "Recibir Datos de PC", Root.Width/2 + 10dip, 400dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(250,240,230), "Mantener presionado")
	CreateCard("btnShare", "📱 -> 🔗", "Compartir Datos", 20dip, 520dip, Root.Width/2 - 30dip, 110dip, Colors.RGB(240,248,255), "")
	
'	btnEnviar.SetColorAndBorder(Colors.RGB(245,255,250), 1dip, Colors.LightGray, 5dip)
'	btnEnviar.Text = "💾  Enviar Datos a PC"
'	btnRecibir.SetColorAndBorder(Colors.RGB(250,240,230), 1dip, Colors.LightGray, 5dip)
'	btnRecibir.Text = "⬇️  Recibir Datos de PC"
	btnShare.SetColorAndBorder(Colors.RGB(240,248,255), 1dip, Colors.LightGray, 5dip)
	btnShare.Text = "🔗  Compartir Datos"
	
End Sub

Private Sub CreateCard(EventName As String, Emoji As String, Title As String, Left As Int, Top As Int, Width As Int, Height As Int, BgColor As Int, Tip As String)
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
	
	Dim lblTitle As Label
	lblTitle.Initialize("")
	lblTitle.Text = Tip
	lblTitle.TextSize = 14
	lblTitle.TextColor = Colors.Gray
	lblTitle.Gravity = Gravity.CENTER
	pnl.AddView(lblTitle, 0, 72dip, pnl.Width, 30dip)
End Sub

Sub B4XPage_Appear
	
	txtIP.Text = Starter.SelectBusiness.FTP
	
End Sub

Private Sub btnEnviar_Click
	
	'Envia la base de datos al FTP de la pc
	If Not (IsValidIp(txtIP.Text)) Then
		ToastMessageShow("La ip ingresada no es válida, verifique",True)
		Return
	End If
	Log("Envia DB")
	If iniciarFTP Then
		ProgressDialogShow2("Enviando datos...",False)
		ftp.UploadFile(Starter.Route, Starter.DataBase, False, Starter.DataBase)
	End If
	
End Sub

Private Sub btnRecibir_LongClick
	
	'Descarga la nueva base de datos del FTP de la pc
	If Not (IsValidIp(txtIP.Text)) Then
		ToastMessageShow("La ip ingresada no es válida, verifique",True)
		Return
	End If
	Log("Recibe DB")
	Msgbox2Async("Desea descargar los datos?" & CRLF & "Atención, si no envió los pedidos anteriormente los datos se perderán.","Atención","Aceptar","Cancelar","",Null,False)
	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		'hago una copia de la Base de datos
		If File.Exists(Starter.Route, Starter.DataBase) Then File.Copy(Starter.Route, Starter.DataBase, Starter.Route, Starter.DataBaseBackup)
		If iniciarFTP Then
			ProgressDialogShow2("Recibiendo datos...",False)
			ftp.DownloadFile(Starter.DataBase,False, Starter.Route, Starter.DataBase)
		End If
	Else
		ToastMessageShow("Rechazado por el usuario",True)
	End If
	
End Sub

Sub IsValidIp(ip As String) As Boolean
	Dim m As Matcher
	m = Regex.Matcher("^(\d+)\.(\d+)\.(\d+)\.(\d+)$", ip)
	If m.Find = False Then Return False
	For i = 1 To 4
		If m.Group(i) > 255 Or m.Group(i) < 0 Then Return False
	Next
	Return True
End Sub

Private Sub iniciarFTP() As Boolean
	ftp.Initialize("ftp",txtIP.Text,ftpPort,"","")
	ftp.PassiveMode = True
	If ftp.IsInitialized Then Return True
	ToastMessageShow("Error iniciando la conexión, verifique",True)
	Return False
End Sub

Sub ftp_UploadCompleted (ServerPath As String, Success As Boolean)
	Log(ServerPath & ", Success=" & Success)
	If Success = False Then
		Log(LastException.Message)
		MsgboxAsync(LastException.Message,"Error FTP")
	Else
		ToastMessageShow("Datos enviados correctamente",True)
	End If
	ProgressDialogHide
End Sub

Sub FTP_DownloadCompleted (ServerPath As String, Success As Boolean)
	Log(ServerPath & ", Success=" & Success)
	If Success = False Then
		Log(LastException.Message)
		MsgboxAsync(LastException.Message,"Error FTP")
	Else
		ToastMessageShow("Datos recibidos correctamente",True)
	End If
	
	ProgressDialogHide
End Sub



Private Sub btnShare_Click
	Starter.ShareDataBase
End Sub


Private Sub btnRecibir_Click
	ToastMessageShow("Mantener presionado para Recibir Datos.",False)
End Sub