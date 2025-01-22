B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
	Dim DataBase As String = "moviles.db"
	Dim DataBaseBackup As String = "moviles_backup.db"
	Dim Route As String
	Dim rp As RuntimePermissions
	
	Dim sql As SQL
	Dim rs As ResultSet
	
	Public Provider As FileProvider
	Public Server As FTPServer
	
	'GLOBAL
	Dim Seller As SellerData
	
	Type BusinessData (RAZONSOCIAL As String, DOMICILIO As String, NRCUIT As String, COTIZACION As String, FTP As String)
	
	'colores de layout
	'fondo = lightgray
	'fondo listas = smokewhite
	'texto gris = DarkSlateGray
	'texto pricnipal = black
	'bton primary = SteelBlue - SlateGray
	'               LightSkyBlue
	'btn danger = Brown - DarkRed
	'btn success = DarkGreen - DarkSlateGray
	
	

End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	
	Provider.Initialize

End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
	
	Route = rp.GetSafeDirDefaultExternal("")
	
	Server.Initialize(Main, "FTPServer")
	Server.SetPorts(51041, 51042, 51142)
	Server.AddUser("Test", "test")
	Server.BaseDir = Route
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
	If Server.Running Then
		Server.Stop
	End If
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

Public Sub SelectCustomer (id As Int) As CustomersData
	
	sql.Initialize(Route, DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM CliMovil WHERE (CODIGO = " & id & ")")
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			Dim CD As CustomersData
			CD.CODIGO = rs.GetString("CODIGO")
			CD.NOMBRE = rs.GetString("NOMBRE")
			CD.DOMICILIO = rs.GetString("DOMICILIO")
			CD.LOCALIDAD = rs.GetString("LOCALIDAD")
			CD.TELEFONO = rs.GetString("TELEFONO")
			CD.NROCUIT = rs.GetString("NROCUIT")
			CD.CODCATIVA = rs.GetString("CODCATIVA")
			CD.NROLPRECIOS = rs.GetString("NROLPRECIOS")
			CD.SALDO = rs.GetString("SALDO")
		Loop
	End If
	rs.Close
	Return CD
	
End Sub

Public Sub SelectProduct (id As Int) As ProductsData
	sql.Initialize(Route, DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM ArtMovil WHERE (CODIGO = " & id & ")")
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			Dim PD As ProductsData
			PD.DESCRIPCION = rs.GetString("DESCRIPCION")
		Loop
	End If
	rs.Close
	Return PD
End Sub

Public Sub SelectBusiness() As BusinessData
	sql.Initialize(Route, DataBase, True)
	rs = sql.ExecQuery("SELECT * FROM ParaMovil")
	If rs.RowCount > 0 Then
		Do While rs.NextRow
			Dim BD As BusinessData
			BD.RAZONSOCIAL = rs.GetString("RAZONSOCIAL")
			BD.FTP = rs.GetString("FTP")
		Loop
	End If
	rs.Close
	Return BD
End Sub

Sub ExistDataBase() As Boolean
	If File.Exists(Route, DataBase) = False Then
		Return False
	Else
		Return True
	End If
End Sub

Sub ExistDataBaseBackup() As Boolean
	If File.Exists(Route, DataBaseBackup) = False Then
		Return False
	Else
		Return True
	End If
End Sub

Sub ShareDataBase
	
	Dim i As Intent
	i.Initialize("android.intent.action.SEND_MULTIPLE", "")
	i.SetType("text/plain")
 
	Dim Uris As List
	Uris.Initialize
 
	Dim Files As List=File.ListFiles(Route)
	For Each bdfile As String In Files
		Log(bdfile)
		Dim u As Uri = GetFileUri(bdfile)
		Uris.Add(u)
	Next
 
	Dim jo As JavaObject = i
	jo.RunMethod("putParcelableArrayListExtra", Array As Object("android.intent.extra.STREAM", Uris))
	i.Flags = 1
 
	StartActivity(i)
	
End Sub

Public Sub GetFileUri (FileName As String) As Object
	
	Dim f As JavaObject
	f.InitializeNewInstance("java.io.File", Array(Route, FileName))
	Dim fp As JavaObject
	Dim context As JavaObject
	context.InitializeContext
	fp.InitializeStatic("android.support.v4.content.FileProvider")
	Return fp.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
End Sub