B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.3
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub CheckForUpdates
	Dim Job As HttpJob
	Job.Initialize("CheckVersion", Me)
	Job.Download("http://168.231.94.28/version.json")
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		If Job.JobName = "CheckVersion" Then
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim m As Map = parser.NextObject
			Dim latestVersion As String = m.Get("version")
			Dim apkUrl As String = m.Get("apk_url")

			Dim currentVersion As String = Application.VersionName

			If IsNewer(latestVersion, currentVersion) Then
				Msgbox2Async("Nueva versión disponible (" & latestVersion & "). ¿Desea actualizar?", _
                    "Actualización", "Sí", "", "No", Null, False)
				Wait For Msgbox_Result (Result As Int)
				If Result = DialogResponse.POSITIVE Then
					StartUpdate(apkUrl)
				End If
			End If
		End If
	Else If Job.JobName = "DownloadApk" Then
		If Job.Success Then
			Dim out As OutputStream = File.OpenOutput(File.DirInternal, "update.apk", False)
			File.Copy2(Job.GetInputStream, out)
			out.Close
			Dim i As Intent
			i.Initialize(i.ACTION_VIEW, "file://" & File.Combine(File.DirInternal, "update.apk"))
			i.SetType("application/vnd.android.package-archive")
			i.Flags = 1
			StartActivity(i)
		Else
			Log("Error descargando APK: " & Job.ErrorMessage)
		End If
	Else
		Log("Error al comprobar actualización: " & Job.ErrorMessage)
	End If
	Job.Release
End Sub

Sub IsNewer(serverVersion As String, localVersion As String) As Boolean
	Return serverVersion > localVersion
End Sub

Sub StartUpdate(apkUrl As String)
	Dim Job As HttpJob
	Job.Initialize("DownloadApk", Me)
	Job.Download(apkUrl)
End Sub


