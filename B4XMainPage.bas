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
	Dim phone As Phone
	
	'pages
	Dim login As login_c
	Dim home As home_c
	Dim products As products_c
	Dim orders As orders_c
	Dim order As order_c
	Dim customers As customers_c
	Dim settings As settings_c
	Dim scan As scan_c
	Private btnLogin As B4XView
	
	Private lblInfo As B4XView
	
	'update apk
	Dim urlBase As String = "http://168.231.94.28/"
	Dim apkNameBase As String = "mobile-order"
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
	B4XPages.GetManager.TransitionAnimationDuration = 0  'Animations disables
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	
	Root = Root1
	Root.LoadLayout("MainPage")
	
	CheckForUpdates
	
	B4XPages.SetTitle(Me, "Mobile Order")	
	
	btnLogin.SetColorAndBorder(Colors.RGB(240,248,255), 1dip, Colors.LightGray, 5dip)
	
	lblInfo.Text = "Versión: " & Application.VersionName
	
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



Sub CheckForUpdates
'	Log("Iniciando CheckForUpdates")
	Dim Job As HttpJob
	Job.Initialize("CheckVersion", Me)
'	Log("Consultando API...")
	Job.Download(urlBase & "api/admin/upload-apks/" & apkNameBase)
End Sub

Sub JobDone(Job As HttpJob)
	Log("JobDone: " & Job.JobName & ", Success: " & Job.Success)
    
	If Job.Success Then
		If Job.JobName = "CheckVersion" Then
			Log("Respuesta: " & Job.GetString)
            
			Try
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim proot As Map = parser.NextObject
				Dim m As Map = proot.Get("data")
                
				Dim latestVersion As String = m.Get("version")
				Dim apkUrl As String = urlBase & "storage/" & m.Get("path") ' <- ruta absoluta
				Dim latestVersionName As String = m.Get("version_name")
				Dim latestVersionDate As String = m.Get("updated_at")
                
				Dim currentVersion As String = Application.VersionCode
                
				Log("currentVersion: " & currentVersion)
				Log("newVersion: " & latestVersion)
				Log("apk URL: " & apkUrl)
                
				If IsNewer(latestVersion, currentVersion) Then
					Log("Hay nueva versión disponible")
					Msgbox2Async("Hay una nueva versión disponible" & CRLF & CRLF &  _
                        "     Nombre de la Versión: " & latestVersionName & CRLF &  _
                        "     Fecha de la Versión: " & latestVersionDate & CRLF & CRLF &  _
                        "¿Desea actualizar?", "Actualización", "Sí", "", "No", Null, False)
                        
					Wait For Msgbox_Result (Result As Int)
					If Result = DialogResponse.POSITIVE Then
						Log("Usuario aceptó actualizar")
						StartUpdate(apkUrl)
					Else
						Log("Usuario canceló actualización")
					End If
				Else
					Log("Ya estás en la última versión")
				End If
			Catch
				Log("Error parseando JSON: " & LastException.Message)
			End Try
		Else If Job.JobName = "DownloadApk" Then
			Try
				If Job.Success Then
					Log("Descarga del APK completada")
                    
					Dim ApkName As String = "update.apk"
					Dim out As OutputStream = File.OpenOutput(Starter.Provider.SharedFolder, ApkName, False)
					File.Copy2(Job.GetInputStream, out)
					out.Close
					Log("APK guardado en: " & File.Combine(Starter.Provider.SharedFolder, ApkName))
            
					SendInstallIntent(ApkName)
				Else
					Log("Error descargando APK: " & Job.ErrorMessage)
				End If
			Catch
				Log("Excepción al instalar APK: " & LastException.Message)
			End Try
		End If
	Else
		Log("Error en Job " & Job.JobName & ": " & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Sub IsNewer(serverVersion As String, localVersion As String) As Boolean
	Log("Comparando versiones: server=" & serverVersion & ", local=" & localVersion)
	Return serverVersion > localVersion
End Sub

Sub StartUpdate(apkUrl As String)
	Log("Iniciando descarga de APK: " & apkUrl)
	Msgbox2Async("Finalizada la misma, deberá confirmar la instalación:" & CRLF & CRLF & _
	  	"   > Click en CONFIGURACIÓN" & CRLF & _
	  	"   > Activar la casilla de verificación 'Confiar en esta fuente'"  & CRLF & _ 
		"   > Volver e instalar normalmente" & CRLF & _ 
		"", "Actualización en progreso...", "", "", "", Null, False)
	
	Dim Job As HttpJob
	Job.Initialize("DownloadApk", Me)
	Job.Download(apkUrl)
End Sub



Private Sub SendInstallIntent(ApkName As String)
	Log("Iniciando instalación del APK")
	If File.Exists(Starter.Provider.SharedFolder, ApkName) Then
		Log("esta el archivo")
		
		Dim i As Intent
		If phone.SdkVersion >= 24 Then
			Dim uri As Object = Starter.Provider.GetFileUri(ApkName)
			i.Initialize("android.intent.action.INSTALL_PACKAGE", uri)
			i.Flags = Bit.Or(i.Flags, 1)
			
		Else
			i.Initialize(i.ACTION_VIEW, "file://" & File.Combine(Starter.Provider.SharedFolder, ApkName))
			i.SetType("application/vnd.android.package-archive")
		End If
		StartActivity(i)
		ExitApplication
	Else
		Log("APK no encontrado en: " & File.Combine(Starter.Provider.SharedFolder, ApkName))
	End If
End Sub

