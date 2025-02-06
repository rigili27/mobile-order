package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class cameraexclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.cameraexclass");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.cameraexclass.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _nativecam = null;
public anywheresoftware.b4a.objects.CameraW _cam = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
public Object _target = null;
public String _event = "";
public boolean _front = false;
public Object _parameters = null;
public int _previeworientation = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _camerainfoandid{
public boolean IsInitialized;
public Object CameraInfo;
public int Id;
public void Initialize() {
IsInitialized = true;
CameraInfo = new Object();
Id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _camerasize{
public boolean IsInitialized;
public int Width;
public int Height;
public void Initialize() {
IsInitialized = true;
Width = 0;
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public void  _camera_focusdone(boolean _success) throws Exception{
ResumableSub_Camera_FocusDone rsub = new ResumableSub_Camera_FocusDone(this,_success);
rsub.resume(ba, null);
}
public static class ResumableSub_Camera_FocusDone extends BA.ResumableSub {
public ResumableSub_Camera_FocusDone(b4a.bitdesing.tomapedidos.cameraexclass parent,boolean _success) {
this.parent = parent;
this._success = _success;
}
b4a.bitdesing.tomapedidos.cameraexclass parent;
boolean _success;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 324;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 325;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,this,(int) (100));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 //BA.debugLineNum = 326;BA.debugLine="TakePicture";
parent._takepicture();
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 328;BA.debugLine="Log(\"AutoFocus error.\")";
parent.__c.LogImpl("540304645","AutoFocus error.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _camera_picturetaken(byte[] _data) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub Camera_PictureTaken (Data() As Byte)";
 //BA.debugLineNum = 111;BA.debugLine="CallSub2(target, event & \"_PictureTaken\", Data)";
__c.CallSubNew2(ba,_target,_event+"_PictureTaken",(Object)(_data));
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public String  _camera_preview(byte[] _data) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub Camera_Preview (Data() As Byte)";
 //BA.debugLineNum = 101;BA.debugLine="If SubExists(target, event & \"_preview\") Then";
if (__c.SubExists(ba,_target,_event+"_preview")) { 
 //BA.debugLineNum = 102;BA.debugLine="CallSub2(target, event & \"_preview\", Data)";
__c.CallSubNew2(ba,_target,_event+"_preview",(Object)(_data));
 };
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _camera_ready(boolean _success) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Private Sub Camera_Ready (Success As Boolean)";
 //BA.debugLineNum = 88;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 89;BA.debugLine="r.target = cam";
_r.Target = (Object)(_cam);
 //BA.debugLineNum = 90;BA.debugLine="nativeCam = r.GetField(\"camera\")";
_nativecam = _r.GetField("camera");
 //BA.debugLineNum = 91;BA.debugLine="r.target = nativeCam";
_r.Target = _nativecam;
 //BA.debugLineNum = 92;BA.debugLine="parameters = r.RunMethod(\"getParameters\")";
_parameters = _r.RunMethod("getParameters");
 //BA.debugLineNum = 93;BA.debugLine="SetDisplayOrientation";
_setdisplayorientation();
 }else {
 };
 //BA.debugLineNum = 97;BA.debugLine="CallSub2(target, event & \"_ready\", Success)";
__c.CallSubNew2(ba,_target,_event+"_ready",(Object)(_success));
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private nativeCam As Object";
_nativecam = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private cam As Camera";
_cam = new anywheresoftware.b4a.objects.CameraW();
 //BA.debugLineNum = 9;BA.debugLine="Private r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 10;BA.debugLine="Private target As Object";
_target = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private event As String";
_event = "";
 //BA.debugLineNum = 12;BA.debugLine="Public Front As Boolean";
_front = false;
 //BA.debugLineNum = 13;BA.debugLine="Type CameraInfoAndId (CameraInfo As Object, Id As";
;
 //BA.debugLineNum = 14;BA.debugLine="Type CameraSize (Width As Int, Height As Int)";
;
 //BA.debugLineNum = 15;BA.debugLine="Private parameters As Object";
_parameters = new Object();
 //BA.debugLineNum = 17;BA.debugLine="Public PreviewOrientation As Int";
_previeworientation = 0;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _closenow() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Public Sub CloseNow";
 //BA.debugLineNum = 313;BA.debugLine="cam.Release";
_cam.Release();
 //BA.debugLineNum = 314;BA.debugLine="r.target = cam";
_r.Target = (Object)(_cam);
 //BA.debugLineNum = 315;BA.debugLine="r.RunMethod2(\"releaseCameras\", True, \"java.lang.b";
_r.RunMethod2("releaseCameras",BA.ObjectToString(__c.True),"java.lang.boolean");
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public String  _commitparameters() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Public Sub CommitParameters";
 //BA.debugLineNum = 145;BA.debugLine="r.target = nativeCam";
_r.Target = _nativecam;
 //BA.debugLineNum = 146;BA.debugLine="r.RunMethod4(\"setParameters\", Array As Object(par";
_r.RunMethod4("setParameters",new Object[]{_parameters},new String[]{"android.hardware.Camera$Parameters"});
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public Object  _facedetection_event(String _methodname,Object[] _args) throws Exception{
Object[] _faces = null;
Object _f = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _facerect = null;
 //BA.debugLineNum = 378;BA.debugLine="Private Sub FaceDetection_Event (MethodName As Str";
 //BA.debugLineNum = 379;BA.debugLine="Dim faces() As Object = Args(0)";
_faces = (Object[])(_args[(int) (0)]);
 //BA.debugLineNum = 380;BA.debugLine="For Each f As Object In faces";
{
final Object[] group2 = _faces;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_f = group2[index2];
 //BA.debugLineNum = 381;BA.debugLine="Dim jo As JavaObject = f";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
 //BA.debugLineNum = 382;BA.debugLine="Dim faceRect As Rect = jo.GetField(\"rect\") 'igno";
_facerect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_facerect = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper(), (android.graphics.Rect)(_jo.GetField("rect")));
 }
};
 //BA.debugLineNum = 384;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4a.bitdesing.tomapedidos.cameraexclass._camerainfoandid  _findcamera(boolean _frontcamera) throws Exception{
b4a.bitdesing.tomapedidos.cameraexclass._camerainfoandid _ci = null;
Object _camerainfo = null;
int _cameravalue = 0;
int _numberofcameras = 0;
int _i = 0;
 //BA.debugLineNum = 37;BA.debugLine="Private Sub FindCamera (frontCamera As Boolean) As";
 //BA.debugLineNum = 38;BA.debugLine="Dim ci As CameraInfoAndId";
_ci = new b4a.bitdesing.tomapedidos.cameraexclass._camerainfoandid();
 //BA.debugLineNum = 39;BA.debugLine="Dim cameraInfo As Object";
_camerainfo = new Object();
 //BA.debugLineNum = 40;BA.debugLine="Dim cameraValue As Int";
_cameravalue = 0;
 //BA.debugLineNum = 42;BA.debugLine="If frontCamera Then cameraValue = 1 Else cameraVa";
if (_frontcamera) { 
_cameravalue = (int) (1);}
else {
_cameravalue = (int) (0);};
 //BA.debugLineNum = 43;BA.debugLine="cameraInfo = r.CreateObject(\"android.hardware.Cam";
_camerainfo = _r.CreateObject("android.hardware.Camera$CameraInfo");
 //BA.debugLineNum = 44;BA.debugLine="Dim numberOfCameras As Int = r.RunStaticMethod(\"a";
_numberofcameras = (int)(BA.ObjectToNumber(_r.RunStaticMethod("android.hardware.Camera","getNumberOfCameras",(Object[])(__c.Null),(String[])(__c.Null))));
 //BA.debugLineNum = 47;BA.debugLine="For i = 0 To numberOfCameras - 1";
{
final int step7 = 1;
final int limit7 = (int) (_numberofcameras-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 48;BA.debugLine="r.RunStaticMethod(\"android.hardware.Camera\", \"ge";
_r.RunStaticMethod("android.hardware.Camera","getCameraInfo",new Object[]{(Object)(_i),_camerainfo},new String[]{"java.lang.int","android.hardware.Camera$CameraInfo"});
 //BA.debugLineNum = 50;BA.debugLine="r.target = cameraInfo";
_r.Target = _camerainfo;
 //BA.debugLineNum = 52;BA.debugLine="If r.GetField(\"facing\") = cameraValue Then 'igno";
if ((_r.GetField("facing")).equals((Object)(_cameravalue))) { 
 //BA.debugLineNum = 53;BA.debugLine="ci.cameraInfo = r.target";
_ci.CameraInfo /*Object*/  = _r.Target;
 //BA.debugLineNum = 54;BA.debugLine="ci.Id = i";
_ci.Id /*int*/  = _i;
 //BA.debugLineNum = 55;BA.debugLine="Return ci";
if (true) return _ci;
 };
 }
};
 //BA.debugLineNum = 58;BA.debugLine="ci.id = -1";
_ci.Id /*int*/  = (int) (-1);
 //BA.debugLineNum = 59;BA.debugLine="Return ci";
if (true) return _ci;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public String  _focusandtakepicture() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Public Sub FocusAndTakePicture";
 //BA.debugLineNum = 319;BA.debugLine="cam.AutoFocus";
_cam.AutoFocus();
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _getcoloreffect() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub GetColorEffect As String";
 //BA.debugLineNum = 154;BA.debugLine="Return GetParameter(\"effect\")";
if (true) return _getparameter("effect");
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public int  _getexposurecompensation() throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Public Sub getExposureCompensation As Int";
 //BA.debugLineNum = 353;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 354;BA.debugLine="Return r.RunMethod(\"getExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getExposureCompensation")));
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return 0;
}
public String  _getflashmode() throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Public Sub GetFlashMode As String";
 //BA.debugLineNum = 205;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 206;BA.debugLine="Return r.RunMethod(\"getFlashMode\")";
if (true) return BA.ObjectToString(_r.RunMethod("getFlashMode"));
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public float[]  _getfocusdistances() throws Exception{
float[] _f = null;
 //BA.debugLineNum = 299;BA.debugLine="Public Sub GetFocusDistances As Float()";
 //BA.debugLineNum = 300;BA.debugLine="Dim F(3) As Float";
_f = new float[(int) (3)];
;
 //BA.debugLineNum = 301;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 302;BA.debugLine="r.RunMethod4(\"getFocusDistances\", Array As Object";
_r.RunMethod4("getFocusDistances",new Object[]{(Object)(_f)},new String[]{"[F"});
 //BA.debugLineNum = 303;BA.debugLine="Return F";
if (true) return _f;
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public int  _getmaxexposurecompensation() throws Exception{
 //BA.debugLineNum = 367;BA.debugLine="Public Sub getMaxExposureCompensation As Int";
 //BA.debugLineNum = 368;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 369;BA.debugLine="Return r.RunMethod(\"getMaxExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getMaxExposureCompensation")));
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return 0;
}
public int  _getmaxzoom() throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Public Sub GetMaxZoom As Int";
 //BA.debugLineNum = 338;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 339;BA.debugLine="Return r.RunMethod(\"getMaxZoom\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getMaxZoom")));
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return 0;
}
public int  _getminexposurecompensation() throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Public Sub getMinExposureCompensation As Int";
 //BA.debugLineNum = 363;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 364;BA.debugLine="Return r.RunMethod(\"getMinExposureCompensation\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getMinExposureCompensation")));
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return 0;
}
public String  _getparameter(String _key) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Public Sub GetParameter(Key As String) As String";
 //BA.debugLineNum = 139;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 140;BA.debugLine="Return r.RunMethod2(\"get\", Key, \"java.lang.String";
if (true) return BA.ObjectToString(_r.RunMethod2("get",_key,"java.lang.String"));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public b4a.bitdesing.tomapedidos.cameraexclass._camerasize  _getpicturesize() throws Exception{
b4a.bitdesing.tomapedidos.cameraexclass._camerasize _cs = null;
 //BA.debugLineNum = 246;BA.debugLine="Public Sub GetPictureSize As CameraSize";
 //BA.debugLineNum = 247;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 248;BA.debugLine="r.target = r.RunMethod(\"getPictureSize\")";
_r.Target = _r.RunMethod("getPictureSize");
 //BA.debugLineNum = 249;BA.debugLine="Dim cs As CameraSize";
_cs = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize();
 //BA.debugLineNum = 250;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("width")));
 //BA.debugLineNum = 251;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("height")));
 //BA.debugLineNum = 252;BA.debugLine="Return cs";
if (true) return _cs;
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return null;
}
public String  _getpreviewfpsrange(int[] _range) throws Exception{
 //BA.debugLineNum = 226;BA.debugLine="Public Sub GetPreviewFpsRange(Range() As Int)";
 //BA.debugLineNum = 227;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 228;BA.debugLine="r.RunMethod4(\"getPreviewFpsRange\", Array As Objec";
_r.RunMethod4("getPreviewFpsRange",new Object[]{(Object)(_range)},new String[]{"[I"});
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public b4a.bitdesing.tomapedidos.cameraexclass._camerasize  _getpreviewsize() throws Exception{
b4a.bitdesing.tomapedidos.cameraexclass._camerasize _cs = null;
 //BA.debugLineNum = 237;BA.debugLine="Public Sub GetPreviewSize As CameraSize";
 //BA.debugLineNum = 238;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 239;BA.debugLine="r.target = r.RunMethod(\"getPreviewSize\")";
_r.Target = _r.RunMethod("getPreviewSize");
 //BA.debugLineNum = 240;BA.debugLine="Dim cs As CameraSize";
_cs = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize();
 //BA.debugLineNum = 241;BA.debugLine="cs.Width = r.GetField(\"width\")";
_cs.Width /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("width")));
 //BA.debugLineNum = 242;BA.debugLine="cs.Height = r.GetField(\"height\")";
_cs.Height /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("height")));
 //BA.debugLineNum = 243;BA.debugLine="Return cs";
if (true) return _cs;
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedcoloreffects() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Public Sub GetSupportedColorEffects As List";
 //BA.debugLineNum = 215;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 216;BA.debugLine="Return r.RunMethod(\"getSupportedColorEffects\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedColorEffects")));
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedflashmodes() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Public Sub GetSupportedFlashModes As List";
 //BA.debugLineNum = 210;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 211;BA.debugLine="Return r.RunMethod(\"getSupportedFlashModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedFlashModes")));
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedfocusmodes() throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub GetSupportedFocusModes As List";
 //BA.debugLineNum = 279;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 280;BA.debugLine="Return r.RunMethod(\"getSupportedFocusModes\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedFocusModes")));
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpictureformats() throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Public Sub GetSupportedPictureFormats As List";
 //BA.debugLineNum = 307;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 308;BA.debugLine="Return r.RunMethod(\"getSupportedPictureFormats\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedPictureFormats")));
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4a.bitdesing.tomapedidos.cameraexclass._camerasize[]  _getsupportedpicturessizes() throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
b4a.bitdesing.tomapedidos.cameraexclass._camerasize[] _cs = null;
int _i = 0;
 //BA.debugLineNum = 177;BA.debugLine="Public Sub GetSupportedPicturesSizes As CameraSize";
 //BA.debugLineNum = 178;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 179;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPict";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedPictureSizes")));
 //BA.debugLineNum = 180;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize();
}
}
;
 //BA.debugLineNum = 181;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 182;BA.debugLine="r.target = list1.get(i)";
_r.Target = _list1.Get(_i);
 //BA.debugLineNum = 183;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("width")));
 //BA.debugLineNum = 184;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("height")));
 }
};
 //BA.debugLineNum = 186;BA.debugLine="Return cs";
if (true) return _cs;
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getsupportedpreviewfpsrange() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub GetSupportedPreviewFpsRange As List";
 //BA.debugLineNum = 221;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 222;BA.debugLine="Return r.RunMethod(\"getSupportedPreviewFpsRange\")";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedPreviewFpsRange")));
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public b4a.bitdesing.tomapedidos.cameraexclass._camerasize[]  _getsupportedpreviewsizes() throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
b4a.bitdesing.tomapedidos.cameraexclass._camerasize[] _cs = null;
int _i = 0;
 //BA.debugLineNum = 161;BA.debugLine="Public Sub GetSupportedPreviewSizes As CameraSize(";
 //BA.debugLineNum = 162;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 163;BA.debugLine="Dim list1 As List = r.RunMethod(\"getSupportedPrev";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list1 = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_r.RunMethod("getSupportedPreviewSizes")));
 //BA.debugLineNum = 164;BA.debugLine="Dim cs(list1.Size) As CameraSize";
_cs = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize[_list1.getSize()];
{
int d0 = _cs.length;
for (int i0 = 0;i0 < d0;i0++) {
_cs[i0] = new b4a.bitdesing.tomapedidos.cameraexclass._camerasize();
}
}
;
 //BA.debugLineNum = 165;BA.debugLine="For i = 0 To list1.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 166;BA.debugLine="r.target = list1.get(i)";
_r.Target = _list1.Get(_i);
 //BA.debugLineNum = 167;BA.debugLine="cs(i).Width = r.GetField(\"width\")";
_cs[_i].Width /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("width")));
 //BA.debugLineNum = 168;BA.debugLine="cs(i).Height = r.GetField(\"height\")";
_cs[_i].Height /*int*/  = (int)(BA.ObjectToNumber(_r.GetField("height")));
 }
};
 //BA.debugLineNum = 170;BA.debugLine="Return cs";
if (true) return _cs;
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public int  _getzoom() throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Public Sub getZoom() As Int";
 //BA.debugLineNum = 343;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 344;BA.debugLine="Return r.RunMethod(\"getZoom\")";
if (true) return (int)(BA.ObjectToNumber(_r.RunMethod("getZoom")));
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _panel1,boolean _frontcamera,Object _targetmodule,String _eventname) throws Exception{
innerInitialize(_ba);
int _id = 0;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Panel1 As Panel, FrontCamer";
 //BA.debugLineNum = 21;BA.debugLine="target = TargetModule";
_target = _targetmodule;
 //BA.debugLineNum = 22;BA.debugLine="event = EventName";
_event = _eventname;
 //BA.debugLineNum = 23;BA.debugLine="Front = FrontCamera";
_front = _frontcamera;
 //BA.debugLineNum = 24;BA.debugLine="Dim id As Int";
_id = 0;
 //BA.debugLineNum = 25;BA.debugLine="id = FindCamera(Front).id";
_id = _findcamera(_front).Id /*int*/ ;
 //BA.debugLineNum = 26;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
 //BA.debugLineNum = 27;BA.debugLine="Front = Not(Front) 'try different camera";
_front = __c.Not(_front);
 //BA.debugLineNum = 28;BA.debugLine="id = FindCamera(Front).id";
_id = _findcamera(_front).Id /*int*/ ;
 //BA.debugLineNum = 29;BA.debugLine="If id = -1 Then";
if (_id==-1) { 
 //BA.debugLineNum = 30;BA.debugLine="ToastMessageShow(\"No camera found.\", True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No camera found."),__c.True);
 //BA.debugLineNum = 31;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 34;BA.debugLine="cam.Initialize2(Panel1, \"camera\", id)";
_cam.Initialize2(ba,(android.view.ViewGroup)(_panel1.getObject()),"camera",_id);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public boolean  _iszoomsupported() throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Public Sub IsZoomSupported As Boolean";
 //BA.debugLineNum = 333;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 334;BA.debugLine="Return r.RunMethod(\"isZoomSupported\")";
if (true) return BA.ObjectToBoolean(_r.RunMethod("isZoomSupported"));
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return false;
}
public byte[]  _previewimagetojpeg(byte[] _data,int _quality) throws Exception{
Object _size = null;
Object _previewformat = null;
int _width = 0;
int _height = 0;
Object _yuvimage = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rect1 = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 257;BA.debugLine="Public Sub PreviewImageToJpeg(data() As Byte, qual";
 //BA.debugLineNum = 258;BA.debugLine="Dim size, previewFormat As Object";
_size = new Object();
_previewformat = new Object();
 //BA.debugLineNum = 259;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 260;BA.debugLine="size = r.RunMethod(\"getPreviewSize\")";
_size = _r.RunMethod("getPreviewSize");
 //BA.debugLineNum = 261;BA.debugLine="previewFormat = r.RunMethod(\"getPreviewFormat\")";
_previewformat = _r.RunMethod("getPreviewFormat");
 //BA.debugLineNum = 262;BA.debugLine="r.target = size";
_r.Target = _size;
 //BA.debugLineNum = 263;BA.debugLine="Dim width = r.GetField(\"width\"), height = r.GetFi";
_width = (int)(BA.ObjectToNumber(_r.GetField("width")));
_height = (int)(BA.ObjectToNumber(_r.GetField("height")));
 //BA.debugLineNum = 264;BA.debugLine="Dim yuvImage As Object = r.CreateObject2(\"android";
_yuvimage = _r.CreateObject2("android.graphics.YuvImage",new Object[]{(Object)(_data),_previewformat,(Object)(_width),(Object)(_height),__c.Null},new String[]{"[B","java.lang.int","java.lang.int","java.lang.int","[I"});
 //BA.debugLineNum = 267;BA.debugLine="r.target = yuvImage";
_r.Target = _yuvimage;
 //BA.debugLineNum = 268;BA.debugLine="Dim rect1 As Rect";
_rect1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 269;BA.debugLine="rect1.Initialize(0, 0, r.RunMethod(\"getWidth\"), r";
_rect1.Initialize((int) (0),(int) (0),(int)(BA.ObjectToNumber(_r.RunMethod("getWidth"))),(int)(BA.ObjectToNumber(_r.RunMethod("getHeight"))));
 //BA.debugLineNum = 270;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 271;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
 //BA.debugLineNum = 272;BA.debugLine="r.RunMethod4(\"compressToJpeg\", Array As Object(re";
_r.RunMethod4("compressToJpeg",new Object[]{(Object)(_rect1.getObject()),(Object)(_quality),(Object)(_out.getObject())},new String[]{"android.graphics.Rect","java.lang.int","java.io.OutputStream"});
 //BA.debugLineNum = 275;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return null;
}
public String  _release() throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Public Sub Release";
 //BA.debugLineNum = 123;BA.debugLine="cam.Release";
_cam.Release();
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _savepicturetofile(byte[] _data,String _dir,String _filename) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 127;BA.debugLine="Public Sub SavePictureToFile(Data() As Byte, Dir A";
 //BA.debugLineNum = 128;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
 //BA.debugLineNum = 129;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
 //BA.debugLineNum = 130;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return "";
}
public String  _setcoloreffect(String _effect) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub SetColorEffect(Effect As String)";
 //BA.debugLineNum = 158;BA.debugLine="SetParameter(\"effect\", Effect)";
_setparameter("effect",_effect);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return "";
}
public String  _setcontinuousautofocus() throws Exception{
anywheresoftware.b4a.objects.collections.List _modes = null;
 //BA.debugLineNum = 283;BA.debugLine="Public Sub SetContinuousAutoFocus";
 //BA.debugLineNum = 284;BA.debugLine="Dim modes As List = GetSupportedFocusModes";
_modes = new anywheresoftware.b4a.objects.collections.List();
_modes = _getsupportedfocusmodes();
 //BA.debugLineNum = 285;BA.debugLine="If modes.IndexOf(\"continuous-picture\") > -1 Then";
if (_modes.IndexOf((Object)("continuous-picture"))>-1) { 
 //BA.debugLineNum = 286;BA.debugLine="SetFocusMode(\"continuous-picture\")";
_setfocusmode("continuous-picture");
 }else if(_modes.IndexOf((Object)("continuous-video"))>-1) { 
 //BA.debugLineNum = 288;BA.debugLine="SetFocusMode(\"continuous-video\")";
_setfocusmode("continuous-video");
 }else {
 //BA.debugLineNum = 290;BA.debugLine="Log(\"Continuous focus mode is not available\")";
__c.LogImpl("539911431","Continuous focus mode is not available",0);
 };
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayorientation() throws Exception{
int _result = 0;
int _degrees = 0;
b4a.bitdesing.tomapedidos.cameraexclass._camerainfoandid _ci = null;
int _orientation = 0;
 //BA.debugLineNum = 62;BA.debugLine="Private Sub SetDisplayOrientation";
 //BA.debugLineNum = 63;BA.debugLine="r.target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(ba));
 //BA.debugLineNum = 64;BA.debugLine="r.target = r.RunMethod(\"getWindowManager\")";
_r.Target = _r.RunMethod("getWindowManager");
 //BA.debugLineNum = 65;BA.debugLine="r.target = r.RunMethod(\"getDefaultDisplay\")";
_r.Target = _r.RunMethod("getDefaultDisplay");
 //BA.debugLineNum = 66;BA.debugLine="r.target = r.RunMethod(\"getRotation\")";
_r.Target = _r.RunMethod("getRotation");
 //BA.debugLineNum = 67;BA.debugLine="Dim result, degrees As Int = r.target * 90";
_result = 0;
_degrees = (int) ((double)(BA.ObjectToNumber(_r.Target))*90);
 //BA.debugLineNum = 68;BA.debugLine="Dim ci As CameraInfoAndId = FindCamera(Front)";
_ci = _findcamera(_front);
 //BA.debugLineNum = 69;BA.debugLine="r.target = ci.CameraInfo";
_r.Target = _ci.CameraInfo /*Object*/ ;
 //BA.debugLineNum = 70;BA.debugLine="Dim orientation As Int = r.GetField(\"orientation\"";
_orientation = (int)(BA.ObjectToNumber(_r.GetField("orientation")));
 //BA.debugLineNum = 71;BA.debugLine="If Front Then";
if (_front) { 
 //BA.debugLineNum = 72;BA.debugLine="PreviewOrientation = (orientation + degrees) Mod";
_previeworientation = (int) ((_orientation+_degrees)%360);
 //BA.debugLineNum = 73;BA.debugLine="result = PreviewOrientation";
_result = _previeworientation;
 //BA.debugLineNum = 74;BA.debugLine="PreviewOrientation = (360 - PreviewOrientation)";
_previeworientation = (int) ((360-_previeworientation)%360);
 }else {
 //BA.debugLineNum = 76;BA.debugLine="PreviewOrientation = (orientation - degrees + 36";
_previeworientation = (int) ((_orientation-_degrees+360)%360);
 //BA.debugLineNum = 77;BA.debugLine="result = PreviewOrientation";
_result = _previeworientation;
 };
 //BA.debugLineNum = 80;BA.debugLine="r.target = nativeCam";
_r.Target = _nativecam;
 //BA.debugLineNum = 81;BA.debugLine="r.RunMethod2(\"setDisplayOrientation\", PreviewOrie";
_r.RunMethod2("setDisplayOrientation",BA.NumberToString(_previeworientation),"java.lang.int");
 //BA.debugLineNum = 82;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 83;BA.debugLine="r.RunMethod2(\"setRotation\", result, \"java.lang.in";
_r.RunMethod2("setRotation",BA.NumberToString(_result),"java.lang.int");
 //BA.debugLineNum = 84;BA.debugLine="CommitParameters";
_commitparameters();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _setexposurecompensation(int _v) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Public Sub setExposureCompensation(v As Int)";
 //BA.debugLineNum = 358;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 359;BA.debugLine="r.RunMethod2(\"setExposureCompensation\", v, \"java.";
_r.RunMethod2("setExposureCompensation",BA.NumberToString(_v),"java.lang.int");
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _setfacedetectionlistener() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
Object _e = null;
 //BA.debugLineNum = 372;BA.debugLine="Public Sub SetFaceDetectionListener";
 //BA.debugLineNum = 373;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nativecam));
 //BA.debugLineNum = 374;BA.debugLine="Dim e As Object = jo.CreateEvent(\"android.hardwar";
_e = _jo.CreateEvent(ba,"android.hardware.Camera.FaceDetectionListener","FaceDetection",__c.Null);
 //BA.debugLineNum = 375;BA.debugLine="jo.RunMethod(\"setFaceDetectionListener\", Array(e)";
_jo.RunMethod("setFaceDetectionListener",new Object[]{_e});
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return "";
}
public String  _setflashmode(String _mode) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub SetFlashMode(Mode As String)";
 //BA.debugLineNum = 200;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 201;BA.debugLine="r.RunMethod2(\"setFlashMode\", Mode, \"java.lang.Str";
_r.RunMethod2("setFlashMode",_mode,"java.lang.String");
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public String  _setfocusmode(String _mode) throws Exception{
 //BA.debugLineNum = 294;BA.debugLine="Public Sub SetFocusMode(Mode As String)";
 //BA.debugLineNum = 295;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 296;BA.debugLine="r.RunMethod2(\"setFocusMode\", Mode, \"java.lang.Str";
_r.RunMethod2("setFocusMode",_mode,"java.lang.String");
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public String  _setjpegquality(int _quality) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Public Sub SetJpegQuality(Quality As Int)";
 //BA.debugLineNum = 195;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 196;BA.debugLine="r.RunMethod2(\"setJpegQuality\", Quality, \"java.lan";
_r.RunMethod2("setJpegQuality",BA.NumberToString(_quality),"java.lang.int");
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _setparameter(String _key,String _value) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub SetParameter(Key As String, Value As St";
 //BA.debugLineNum = 134;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 135;BA.debugLine="r.RunMethod3(\"set\", Key, \"java.lang.String\", Valu";
_r.RunMethod3("set",_key,"java.lang.String",_value,"java.lang.String");
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public String  _setpicturesize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Public Sub SetPictureSize(Width As Int, Height As";
 //BA.debugLineNum = 190;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 191;BA.debugLine="r.RunMethod3(\"setPictureSize\", Width, \"java.lang.";
_r.RunMethod3("setPictureSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewfpsrange(int _minvalue,int _maxvalue) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Public Sub SetPreviewFpsRange(MinValue As Int, Max";
 //BA.debugLineNum = 232;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 233;BA.debugLine="r.RunMethod4(\"setPreviewFpsRange\", Array As Objec";
_r.RunMethod4("setPreviewFpsRange",new Object[]{(Object)(_minvalue),(Object)(_maxvalue)},new String[]{"java.lang.int","java.lang.int"});
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return "";
}
public String  _setpreviewsize(int _width,int _height) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub SetPreviewSize(Width As Int, Height As";
 //BA.debugLineNum = 174;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 175;BA.debugLine="r.RunMethod3(\"setPreviewSize\", Width, \"java.lang.";
_r.RunMethod3("setPreviewSize",BA.NumberToString(_width),"java.lang.int",BA.NumberToString(_height),"java.lang.int");
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _setzoom(int _zoomvalue) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Public Sub setZoom(ZoomValue As Int)";
 //BA.debugLineNum = 348;BA.debugLine="r.target = parameters";
_r.Target = _parameters;
 //BA.debugLineNum = 349;BA.debugLine="r.RunMethod2(\"setZoom\", ZoomValue, \"java.lang.int";
_r.RunMethod2("setZoom",BA.NumberToString(_zoomvalue),"java.lang.int");
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public String  _startfacedetection() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 389;BA.debugLine="Public Sub StartFaceDetection";
 //BA.debugLineNum = 390;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nativecam));
 //BA.debugLineNum = 391;BA.debugLine="jo.RunMethod(\"startFaceDetection\", Null)";
_jo.RunMethod("startFaceDetection",(Object[])(__c.Null));
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public String  _startpreview() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub StartPreview";
 //BA.debugLineNum = 115;BA.debugLine="cam.StartPreview";
_cam.StartPreview();
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _stopfacedetection() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 394;BA.debugLine="Public Sub StopFaceDetection";
 //BA.debugLineNum = 395;BA.debugLine="Dim jo As JavaObject = nativeCam";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nativecam));
 //BA.debugLineNum = 396;BA.debugLine="jo.RunMethod(\"stopFaceDetection\", Null)";
_jo.RunMethod("stopFaceDetection",(Object[])(__c.Null));
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return "";
}
public String  _stoppreview() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Public Sub StopPreview";
 //BA.debugLineNum = 119;BA.debugLine="cam.StopPreview";
_cam.StopPreview();
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return "";
}
public String  _takepicture() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Public Sub TakePicture";
 //BA.debugLineNum = 107;BA.debugLine="cam.TakePicture";
_cam.TakePicture();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
