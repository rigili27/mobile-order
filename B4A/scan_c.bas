B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	#if B4A
	Private rp As RuntimePermissions
	Private detector As JavaObject
	Private camEx As CameraExClass
	Private LastPreview As Long
	Private IntervalBetweenPreviewsMs As Int = 100
	#End If
	
	Private lblResult As B4XView
	Private pnlPreview As B4XView
	Private btnStop As B4XView
	Private Capturing As Boolean
	Private txtResult As EditText
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Sub B4XPage_Appear
	lblResult.Text = ""
	StopCamera
	StartCamera
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("scan_layout")
	Log("create scan page")
	
	CreateDetector (Array("AZTEC", "CODE_128", "CODE_39", "CODE_93", "CODABAR", "DATA_MATRIX", "EAN_13", "EAN_8", "ITF", "PDF417", "QR_CODE", "UPC_A", "UPC_E"))
	
End Sub

Private Sub CreateDetector (Codes As List)
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	Dim builder As JavaObject
	builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".Replace("/", "."), Array(ctxt))
	Dim barcodeClass As String = "com/google/android/gms/vision/barcode/Barcode".Replace("/", ".")
	Dim barcodeStatic As JavaObject
	barcodeStatic.InitializeStatic(barcodeClass)
	Dim format As Int
	For Each formatName As String In Codes
		format = Bit.Or(format, barcodeStatic.GetField(formatName))
	Next
	builder.RunMethod("setBarcodeFormats", Array(format))
	detector = builder.RunMethod("build", Null)
	Dim operational As Boolean = detector.RunMethod("isOperational", Null)
	If operational = False Then
		Log("Failed to create detector")
	End If
	btnStop.Enabled = operational
End Sub

Private Sub btnStop_Click
	If Capturing = False Then
		StartCamera
	Else
		StopCamera
	End If
End Sub

Private Sub StopCamera
	Capturing = False
	btnStop.Text = "Iniciar escaneo"
	pnlPreview.Visible = False
	#if B4A
	If camEx.IsInitialized Then
		camEx.Release
	End If
	#end if
	
	If lblResult.Text <> "" Then
		SharedProduct
	End If
	
End Sub

Private Sub StartCamera
	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
	Wait For B4XPage_PermissionResult (Permission As String, Result As Boolean)
	If Result = False Then
		Log("No permission!")
		Return
	End If
	StartCameraShared
	camEx.Initialize(pnlPreview, False, Me, "Camera1")
	Wait For Camera1_Ready (Success As Boolean)
	If Success Then
		camEx.SetContinuousAutoFocus
		camEx.CommitParameters
		camEx.StartPreview
	Else
		Log("Error opening camera")
		StopCamera
	End If
End Sub

Private Sub StartCameraShared
	btnStop.Text = "Buscar"
	pnlPreview.Visible = True
	Capturing = True
	
End Sub

Private Sub Camera1_Preview (data() As Byte)
	If DateTime.Now > LastPreview + IntervalBetweenPreviewsMs Then
		'Dim n As Long = DateTime.Now
		Dim frameBuilder As JavaObject
		Dim bb As JavaObject
		bb = bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap", Array(data))
		frameBuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".Replace("/", "."), Null)
		Dim cs As CameraSize = camEx.GetPreviewSize
		frameBuilder.RunMethod("setImageData", Array(bb, cs.Width, cs.Height,  842094169))
		Dim frame As JavaObject = frameBuilder.RunMethod("build", Null)
		Dim SparseArray As JavaObject = detector.RunMethod("detect", Array(frame))
		LastPreview = DateTime.Now
		Dim Matches As Int = SparseArray.RunMethod("size", Null)
		If Matches > 0 Then
			Dim barcode As JavaObject = SparseArray.RunMethod("valueAt", Array(0))
			Dim raw As String = barcode.GetField("rawValue")
			FoundBarcode(raw)
		End If
	End If
End Sub

Private Sub FoundBarcode (msg As String)
	lblResult.Text = msg
	txtResult.Text = lblResult.Text
'	Log($"Found [Color=Blue][b][plain]${msg}[/plain][/b][/Color]"$)
End Sub

Private Sub txtResult_TextChanged (Old As String, New As String)
	SharedProduct
End Sub

Sub SharedProduct
	
	Dim products_page As products_c = B4XPages.GetPage("products_page")
	products_page.Barcode = txtResult.Text
	B4XPages.ClosePage(B4XPages.GetPage("scan_page"))
	B4XPages.ShowPage("products_page")

End Sub