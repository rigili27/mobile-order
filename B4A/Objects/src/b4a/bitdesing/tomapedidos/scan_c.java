package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class scan_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.scan_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.scan_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4j.object.JavaObject _detector = null;
public b4a.bitdesing.tomapedidos.cameraexclass _camex = null;
public long _lastpreview = 0L;
public int _intervalbetweenpreviewsms = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresult = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlpreview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnstop = null;
public boolean _capturing = false;
public anywheresoftware.b4a.objects.EditTextWrapper _txtresult = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 27;BA.debugLine="lblResult.Text = \"\"";
_lblresult.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 28;BA.debugLine="StopCamera";
_stopcamera();
 //BA.debugLineNum = 29;BA.debugLine="StartCamera";
_startcamera();
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 34;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 35;BA.debugLine="Root.LoadLayout(\"scan_layout\")";
_root.LoadLayout("scan_layout",ba);
 //BA.debugLineNum = 36;BA.debugLine="Log(\"create scan page\")";
__c.LogImpl("535717123","create scan page",0);
 //BA.debugLineNum = 38;BA.debugLine="CreateDetector (Array(\"AZTEC\", \"CODE_128\", \"CODE_";
_createdetector(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("AZTEC"),(Object)("CODE_128"),(Object)("CODE_39"),(Object)("CODE_93"),(Object)("CODABAR"),(Object)("DATA_MATRIX"),(Object)("EAN_13"),(Object)("EAN_8"),(Object)("ITF"),(Object)("PDF417"),(Object)("QR_CODE"),(Object)("UPC_A"),(Object)("UPC_E")}));
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public String  _btnstop_click() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Private Sub btnStop_Click";
 //BA.debugLineNum = 64;BA.debugLine="If Capturing = False Then";
if (_capturing==__c.False) { 
 //BA.debugLineNum = 65;BA.debugLine="StartCamera";
_startcamera();
 }else {
 //BA.debugLineNum = 67;BA.debugLine="StopCamera";
_stopcamera();
 };
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _camera1_preview(byte[] _data) throws Exception{
anywheresoftware.b4j.object.JavaObject _framebuilder = null;
anywheresoftware.b4j.object.JavaObject _bb = null;
b4a.bitdesing.tomapedidos.cameraexclass._camerasize _cs = null;
anywheresoftware.b4j.object.JavaObject _frame = null;
anywheresoftware.b4j.object.JavaObject _sparsearray = null;
int _matches = 0;
anywheresoftware.b4j.object.JavaObject _barcode = null;
String _raw = "";
 //BA.debugLineNum = 114;BA.debugLine="Private Sub Camera1_Preview (data() As Byte)";
 //BA.debugLineNum = 115;BA.debugLine="If DateTime.Now > LastPreview + IntervalBetweenPr";
if (__c.DateTime.getNow()>_lastpreview+_intervalbetweenpreviewsms) { 
 //BA.debugLineNum = 117;BA.debugLine="Dim frameBuilder As JavaObject";
_framebuilder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 118;BA.debugLine="Dim bb As JavaObject";
_bb = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 119;BA.debugLine="bb = bb.InitializeStatic(\"java.nio.ByteBuffer\").";
_bb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap",new Object[]{(Object)(_data)})));
 //BA.debugLineNum = 120;BA.debugLine="frameBuilder.InitializeNewInstance(\"com/google/a";
_framebuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".replace("/","."),(Object[])(__c.Null));
 //BA.debugLineNum = 121;BA.debugLine="Dim cs As CameraSize = camEx.GetPreviewSize";
_cs = _camex._getpreviewsize /*b4a.bitdesing.tomapedidos.cameraexclass._camerasize*/ ();
 //BA.debugLineNum = 122;BA.debugLine="frameBuilder.RunMethod(\"setImageData\", Array(bb,";
_framebuilder.RunMethod("setImageData",new Object[]{(Object)(_bb.getObject()),(Object)(_cs.Width /*int*/ ),(Object)(_cs.Height /*int*/ ),(Object)(842094169)});
 //BA.debugLineNum = 123;BA.debugLine="Dim frame As JavaObject = frameBuilder.RunMethod";
_frame = new anywheresoftware.b4j.object.JavaObject();
_frame = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_framebuilder.RunMethod("build",(Object[])(__c.Null))));
 //BA.debugLineNum = 124;BA.debugLine="Dim SparseArray As JavaObject = detector.RunMeth";
_sparsearray = new anywheresoftware.b4j.object.JavaObject();
_sparsearray = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_detector.RunMethod("detect",new Object[]{(Object)(_frame.getObject())})));
 //BA.debugLineNum = 125;BA.debugLine="LastPreview = DateTime.Now";
_lastpreview = __c.DateTime.getNow();
 //BA.debugLineNum = 126;BA.debugLine="Dim Matches As Int = SparseArray.RunMethod(\"size";
_matches = (int)(BA.ObjectToNumber(_sparsearray.RunMethod("size",(Object[])(__c.Null))));
 //BA.debugLineNum = 127;BA.debugLine="If Matches > 0 Then";
if (_matches>0) { 
 //BA.debugLineNum = 128;BA.debugLine="Dim barcode As JavaObject = SparseArray.RunMeth";
_barcode = new anywheresoftware.b4j.object.JavaObject();
_barcode = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sparsearray.RunMethod("valueAt",new Object[]{(Object)(0)})));
 //BA.debugLineNum = 129;BA.debugLine="Dim raw As String = barcode.GetField(\"rawValue\"";
_raw = BA.ObjectToString(_barcode.GetField("rawValue"));
 //BA.debugLineNum = 130;BA.debugLine="FoundBarcode(raw)";
_foundbarcode(_raw);
 };
 };
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 7;BA.debugLine="Private detector As JavaObject";
_detector = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 8;BA.debugLine="Private camEx As CameraExClass";
_camex = new b4a.bitdesing.tomapedidos.cameraexclass();
 //BA.debugLineNum = 9;BA.debugLine="Private LastPreview As Long";
_lastpreview = 0L;
 //BA.debugLineNum = 10;BA.debugLine="Private IntervalBetweenPreviewsMs As Int = 100";
_intervalbetweenpreviewsms = (int) (100);
 //BA.debugLineNum = 13;BA.debugLine="Private lblResult As B4XView";
_lblresult = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private pnlPreview As B4XView";
_pnlpreview = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private btnStop As B4XView";
_btnstop = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Capturing As Boolean";
_capturing = false;
 //BA.debugLineNum = 17;BA.debugLine="Private txtResult As EditText";
_txtresult = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _createdetector(anywheresoftware.b4a.objects.collections.List _codes) throws Exception{
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _builder = null;
String _barcodeclass = "";
anywheresoftware.b4j.object.JavaObject _barcodestatic = null;
int _format = 0;
String _formatname = "";
boolean _operational = false;
 //BA.debugLineNum = 42;BA.debugLine="Private Sub CreateDetector (Codes As List)";
 //BA.debugLineNum = 43;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 44;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(ba);
 //BA.debugLineNum = 45;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 46;BA.debugLine="builder.InitializeNewInstance(\"com/google/android";
_builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".replace("/","."),new Object[]{(Object)(_ctxt.getObject())});
 //BA.debugLineNum = 47;BA.debugLine="Dim barcodeClass As String = \"com/google/android/";
_barcodeclass = "com/google/android/gms/vision/barcode/Barcode".replace("/",".");
 //BA.debugLineNum = 48;BA.debugLine="Dim barcodeStatic As JavaObject";
_barcodestatic = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 49;BA.debugLine="barcodeStatic.InitializeStatic(barcodeClass)";
_barcodestatic.InitializeStatic(_barcodeclass);
 //BA.debugLineNum = 50;BA.debugLine="Dim format As Int";
_format = 0;
 //BA.debugLineNum = 51;BA.debugLine="For Each formatName As String In Codes";
{
final anywheresoftware.b4a.BA.IterableList group9 = _codes;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_formatname = BA.ObjectToString(group9.Get(index9));
 //BA.debugLineNum = 52;BA.debugLine="format = Bit.Or(format, barcodeStatic.GetField(f";
_format = __c.Bit.Or(_format,(int)(BA.ObjectToNumber(_barcodestatic.GetField(_formatname))));
 }
};
 //BA.debugLineNum = 54;BA.debugLine="builder.RunMethod(\"setBarcodeFormats\", Array(form";
_builder.RunMethod("setBarcodeFormats",new Object[]{(Object)(_format)});
 //BA.debugLineNum = 55;BA.debugLine="detector = builder.RunMethod(\"build\", Null)";
_detector = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_builder.RunMethod("build",(Object[])(__c.Null))));
 //BA.debugLineNum = 56;BA.debugLine="Dim operational As Boolean = detector.RunMethod(\"";
_operational = BA.ObjectToBoolean(_detector.RunMethod("isOperational",(Object[])(__c.Null)));
 //BA.debugLineNum = 57;BA.debugLine="If operational = False Then";
if (_operational==__c.False) { 
 //BA.debugLineNum = 58;BA.debugLine="Log(\"Failed to create detector\")";
__c.LogImpl("535782672","Failed to create detector",0);
 };
 //BA.debugLineNum = 60;BA.debugLine="btnStop.Enabled = operational";
_btnstop.setEnabled(_operational);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _foundbarcode(String _msg) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Private Sub FoundBarcode (msg As String)";
 //BA.debugLineNum = 136;BA.debugLine="lblResult.Text = msg";
_lblresult.setText(BA.ObjectToCharSequence(_msg));
 //BA.debugLineNum = 137;BA.debugLine="txtResult.Text = lblResult.Text";
_txtresult.setText(BA.ObjectToCharSequence(_lblresult.getText()));
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _sharedproduct() throws Exception{
b4a.bitdesing.tomapedidos.products_c _products_page = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub SharedProduct";
 //BA.debugLineNum = 147;BA.debugLine="Dim products_page As products_c = B4XPages.GetPag";
_products_page = (b4a.bitdesing.tomapedidos.products_c)(_b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 148;BA.debugLine="products_page.Barcode = txtResult.Text";
_products_page._barcode /*String*/  = _txtresult.getText();
 //BA.debugLineNum = 149;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"scan_page\"))";
_b4xpages._closepage /*String*/ (ba,_b4xpages._getpage /*Object*/ (ba,"scan_page"));
 //BA.debugLineNum = 150;BA.debugLine="B4XPages.ShowPage(\"products_page\")";
_b4xpages._showpage /*String*/ (ba,"products_page");
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public void  _startcamera() throws Exception{
ResumableSub_StartCamera rsub = new ResumableSub_StartCamera(this);
rsub.resume(ba, null);
}
public static class ResumableSub_StartCamera extends BA.ResumableSub {
public ResumableSub_StartCamera(b4a.bitdesing.tomapedidos.scan_c parent) {
this.parent = parent;
}
b4a.bitdesing.tomapedidos.scan_c parent;
String _permission = "";
boolean _result = false;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 88;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 89;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 90;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 91;BA.debugLine="Log(\"No permission!\")";
parent.__c.LogImpl("535979268","No permission!",0);
 //BA.debugLineNum = 92;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 94;BA.debugLine="StartCameraShared";
parent._startcamerashared();
 //BA.debugLineNum = 95;BA.debugLine="camEx.Initialize(pnlPreview, False, Me, \"Camera1\"";
parent._camex._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent._pnlpreview.getObject())),parent.__c.False,parent,"Camera1");
 //BA.debugLineNum = 96;BA.debugLine="Wait For Camera1_Ready (Success As Boolean)";
parent.__c.WaitFor("camera1_ready", ba, this, null);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 97;BA.debugLine="If Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_success) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 98;BA.debugLine="camEx.SetContinuousAutoFocus";
parent._camex._setcontinuousautofocus /*String*/ ();
 //BA.debugLineNum = 99;BA.debugLine="camEx.CommitParameters";
parent._camex._commitparameters /*String*/ ();
 //BA.debugLineNum = 100;BA.debugLine="camEx.StartPreview";
parent._camex._startpreview /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 102;BA.debugLine="Log(\"Error opening camera\")";
parent.__c.LogImpl("535979279","Error opening camera",0);
 //BA.debugLineNum = 103;BA.debugLine="StopCamera";
parent._stopcamera();
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public void  _camera1_ready(boolean _success) throws Exception{
}
public String  _startcamerashared() throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Private Sub StartCameraShared";
 //BA.debugLineNum = 108;BA.debugLine="btnStop.Text = \"Buscar\"";
_btnstop.setText(BA.ObjectToCharSequence("Buscar"));
 //BA.debugLineNum = 109;BA.debugLine="pnlPreview.Visible = True";
_pnlpreview.setVisible(__c.True);
 //BA.debugLineNum = 110;BA.debugLine="Capturing = True";
_capturing = __c.True;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _stopcamera() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub StopCamera";
 //BA.debugLineNum = 72;BA.debugLine="Capturing = False";
_capturing = __c.False;
 //BA.debugLineNum = 73;BA.debugLine="btnStop.Text = \"Iniciar escaneo\"";
_btnstop.setText(BA.ObjectToCharSequence("Iniciar escaneo"));
 //BA.debugLineNum = 74;BA.debugLine="pnlPreview.Visible = False";
_pnlpreview.setVisible(__c.False);
 //BA.debugLineNum = 76;BA.debugLine="If camEx.IsInitialized Then";
if (_camex.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 77;BA.debugLine="camEx.Release";
_camex._release /*String*/ ();
 };
 //BA.debugLineNum = 81;BA.debugLine="If lblResult.Text <> \"\" Then";
if ((_lblresult.getText()).equals("") == false) { 
 //BA.debugLineNum = 82;BA.debugLine="SharedProduct";
_sharedproduct();
 };
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _txtresult_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub txtResult_TextChanged (Old As String,";
 //BA.debugLineNum = 142;BA.debugLine="SharedProduct";
_sharedproduct();
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
