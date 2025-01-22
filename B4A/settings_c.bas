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
	
	ime.Initialize("")
	ime.SetCustomFilter(txtIP, txtIP.INPUT_TYPE_NUMBERS, "0123456789.")
	
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

Private Sub btnRecibir_Click
	
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