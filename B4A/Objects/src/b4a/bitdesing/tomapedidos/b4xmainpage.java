package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.phone.Phone _phone = null;
public b4a.bitdesing.tomapedidos.login_c _login = null;
public b4a.bitdesing.tomapedidos.home_c _home = null;
public b4a.bitdesing.tomapedidos.products_c _products = null;
public b4a.bitdesing.tomapedidos.orders_c _orders = null;
public b4a.bitdesing.tomapedidos.order_c _order = null;
public b4a.bitdesing.tomapedidos.customers_c _customers = null;
public b4a.bitdesing.tomapedidos.settings_c _settings = null;
public b4a.bitdesing.tomapedidos.scan_c _scan = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfo = null;
public String _urlbase = "";
public String _apknamebase = "";
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.httputils2service _httputils2service = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 76;BA.debugLine="If Starter.ExistDataBase Then";
if (_starter._existdatabase /*boolean*/ ()) { 
 //BA.debugLineNum = 77;BA.debugLine="Log(\"existe base\")";
__c.LogImpl("0786434","existe base",0);
 //BA.debugLineNum = 78;BA.debugLine="btnLogin.Text = \"Iniciar sesión\"";
_btnlogin.setText(BA.ObjectToCharSequence("Iniciar sesión"));
 }else {
 //BA.debugLineNum = 80;BA.debugLine="Log(\"No existe base\")";
__c.LogImpl("0786437","No existe base",0);
 //BA.debugLineNum = 81;BA.debugLine="btnLogin.Text = \"Configuración\"";
_btnlogin.setText(BA.ObjectToCharSequence("Configuración"));
 };
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 40;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 41;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 43;BA.debugLine="CheckForUpdates";
_checkforupdates();
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.SetTitle(Me, \"Mobile Order\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Mobile Order"));
 //BA.debugLineNum = 47;BA.debugLine="btnLogin.SetColorAndBorder(Colors.RGB(240,248,255";
_btnlogin.SetColorAndBorder(__c.Colors.RGB((int) (240),(int) (248),(int) (255)),__c.DipToCurrent((int) (1)),__c.Colors.LightGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 49;BA.debugLine="lblInfo.Text = \"Versión: \" & Application.VersionN";
_lblinfo.setText(BA.ObjectToCharSequence("Versión: "+__c.Application.getVersionName()));
 //BA.debugLineNum = 54;BA.debugLine="login.Initialize";
_login._initialize /*Object*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.AddPage(\"login_page\", login)";
_b4xpages._addpage /*String*/ (ba,"login_page",(Object)(_login));
 //BA.debugLineNum = 56;BA.debugLine="products.Initialize";
_products._initialize /*Object*/ (ba);
 //BA.debugLineNum = 57;BA.debugLine="B4XPages.AddPage(\"home_page\", home)";
_b4xpages._addpage /*String*/ (ba,"home_page",(Object)(_home));
 //BA.debugLineNum = 58;BA.debugLine="home.Initialize";
_home._initialize /*Object*/ (ba);
 //BA.debugLineNum = 59;BA.debugLine="B4XPages.AddPage(\"products_page\", products)";
_b4xpages._addpage /*String*/ (ba,"products_page",(Object)(_products));
 //BA.debugLineNum = 60;BA.debugLine="orders.Initialize";
_orders._initialize /*Object*/ (ba);
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.AddPage(\"orders_page\", orders)";
_b4xpages._addpage /*String*/ (ba,"orders_page",(Object)(_orders));
 //BA.debugLineNum = 62;BA.debugLine="order.Initialize";
_order._initialize /*Object*/ (ba);
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.AddPage(\"order_page\", order)";
_b4xpages._addpage /*String*/ (ba,"order_page",(Object)(_order));
 //BA.debugLineNum = 64;BA.debugLine="customers.Initialize";
_customers._initialize /*Object*/ (ba);
 //BA.debugLineNum = 65;BA.debugLine="B4XPages.AddPage(\"customers_page\", customers)";
_b4xpages._addpage /*String*/ (ba,"customers_page",(Object)(_customers));
 //BA.debugLineNum = 66;BA.debugLine="settings.Initialize";
_settings._initialize /*Object*/ (ba);
 //BA.debugLineNum = 67;BA.debugLine="B4XPages.AddPage(\"settings_page\", settings)";
_b4xpages._addpage /*String*/ (ba,"settings_page",(Object)(_settings));
 //BA.debugLineNum = 68;BA.debugLine="scan.Initialize";
_scan._initialize /*Object*/ (ba);
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.AddPage(\"scan_page\", scan)";
_b4xpages._addpage /*String*/ (ba,"scan_page",(Object)(_scan));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Private Sub btnHome_Click";
 //BA.debugLineNum = 102;BA.debugLine="B4XPages.ShowPage(\"home_page\")";
_b4xpages._showpage /*String*/ (ba,"home_page");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub btnLogin_Click";
 //BA.debugLineNum = 91;BA.debugLine="If Starter.ExistDataBase Then";
if (_starter._existdatabase /*boolean*/ ()) { 
 //BA.debugLineNum = 92;BA.debugLine="Log(\"existe base\")";
__c.LogImpl("0917506","existe base",0);
 //BA.debugLineNum = 93;BA.debugLine="B4XPages.ShowPage(\"login_page\")";
_b4xpages._showpage /*String*/ (ba,"login_page");
 }else {
 //BA.debugLineNum = 95;BA.debugLine="Log(\"No existe base\")";
__c.LogImpl("0917509","No existe base",0);
 //BA.debugLineNum = 96;BA.debugLine="B4XPages.ShowPage(\"settings_page\")";
_b4xpages._showpage /*String*/ (ba,"settings_page");
 };
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 107;BA.debugLine="CopyDataBase";
_copydatabase();
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public String  _checkforupdates() throws Exception{
b4a.bitdesing.tomapedidos.httpjob _job = null;
 //BA.debugLineNum = 113;BA.debugLine="Sub CheckForUpdates";
 //BA.debugLineNum = 115;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.bitdesing.tomapedidos.httpjob();
 //BA.debugLineNum = 116;BA.debugLine="Job.Initialize(\"CheckVersion\", Me)";
_job._initialize /*String*/ (ba,"CheckVersion",this);
 //BA.debugLineNum = 118;BA.debugLine="Job.Download(urlBase & \"api/admin/upload-apks/\" &";
_job._download /*String*/ (_urlbase+"api/admin/upload-apks/"+_apknamebase);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 11;BA.debugLine="Dim phone As Phone";
_phone = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 14;BA.debugLine="Dim login As login_c";
_login = new b4a.bitdesing.tomapedidos.login_c();
 //BA.debugLineNum = 15;BA.debugLine="Dim home As home_c";
_home = new b4a.bitdesing.tomapedidos.home_c();
 //BA.debugLineNum = 16;BA.debugLine="Dim products As products_c";
_products = new b4a.bitdesing.tomapedidos.products_c();
 //BA.debugLineNum = 17;BA.debugLine="Dim orders As orders_c";
_orders = new b4a.bitdesing.tomapedidos.orders_c();
 //BA.debugLineNum = 18;BA.debugLine="Dim order As order_c";
_order = new b4a.bitdesing.tomapedidos.order_c();
 //BA.debugLineNum = 19;BA.debugLine="Dim customers As customers_c";
_customers = new b4a.bitdesing.tomapedidos.customers_c();
 //BA.debugLineNum = 20;BA.debugLine="Dim settings As settings_c";
_settings = new b4a.bitdesing.tomapedidos.settings_c();
 //BA.debugLineNum = 21;BA.debugLine="Dim scan As scan_c";
_scan = new b4a.bitdesing.tomapedidos.scan_c();
 //BA.debugLineNum = 22;BA.debugLine="Private btnLogin As B4XView";
_btnlogin = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblInfo As B4XView";
_lblinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Dim urlBase As String = \"http://168.231.94.28/\"";
_urlbase = "http://168.231.94.28/";
 //BA.debugLineNum = 28;BA.debugLine="Dim apkNameBase As String = \"mobile-order\"";
_apknamebase = "mobile-order";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _copydatabase() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub CopyDataBase";
 //BA.debugLineNum = 86;BA.debugLine="File.Copy(File.DirAssets, Starter.DataBase, Start";
__c.File.Copy(__c.File.getDirAssets(),_starter._database /*String*/ ,_starter._route /*String*/ ,_starter._database /*String*/ );
 //BA.debugLineNum = 87;BA.debugLine="Log(\"copy database\")";
__c.LogImpl("0851970","copy database",0);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 34;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.bitdesing.tomapedidos.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public boolean  _isnewer(String _serverversion,String _localversion) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub IsNewer(serverVersion As String, localVersion";
 //BA.debugLineNum = 191;BA.debugLine="Log(\"Comparando versiones: server=\" & serverVersi";
__c.LogImpl("01245185","Comparando versiones: server="+_serverversion+", local="+_localversion,0);
 //BA.debugLineNum = 192;BA.debugLine="Return serverVersion > localVersion";
if (true) return (double)(Double.parseDouble(_serverversion))>(double)(Double.parseDouble(_localversion));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return false;
}
public void  _jobdone(b4a.bitdesing.tomapedidos.httpjob _job) throws Exception{
ResumableSub_JobDone rsub = new ResumableSub_JobDone(this,_job);
rsub.resume(ba, null);
}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(b4a.bitdesing.tomapedidos.b4xmainpage parent,b4a.bitdesing.tomapedidos.httpjob _job) {
this.parent = parent;
this._job = _job;
}
b4a.bitdesing.tomapedidos.b4xmainpage parent;
b4a.bitdesing.tomapedidos.httpjob _job;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _proot = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _latestversion = "";
String _apkurl = "";
String _latestversionname = "";
String _latestversiondate = "";
String _currentversion = "";
int _result = 0;
String _apkname = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 122;BA.debugLine="Log(\"JobDone: \" & Job.JobName & \", Success: \" & J";
parent.__c.LogImpl("01179649","JobDone: "+_job._jobname /*String*/ +", Success: "+BA.ObjectToString(_job._success /*boolean*/ ),0);
 //BA.debugLineNum = 124;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 42;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 41;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 125;BA.debugLine="If Job.JobName = \"CheckVersion\" Then";
if (true) break;

case 4:
//if
this.state = 39;
if ((_job._jobname /*String*/ ).equals("CheckVersion")) { 
this.state = 6;
}else if((_job._jobname /*String*/ ).equals("DownloadApk")) { 
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 126;BA.debugLine="Log(\"Respuesta: \" & Job.GetString)";
parent.__c.LogImpl("01179653","Respuesta: "+_job._getstring /*String*/ (),0);
 //BA.debugLineNum = 128;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 24;
this.catchState = 23;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 23;
 //BA.debugLineNum = 129;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 130;BA.debugLine="parser.Initialize(Job.GetString)";
_parser.Initialize(_job._getstring /*String*/ ());
 //BA.debugLineNum = 131;BA.debugLine="Dim proot As Map = parser.NextObject";
_proot = new anywheresoftware.b4a.objects.collections.Map();
_proot = _parser.NextObject();
 //BA.debugLineNum = 132;BA.debugLine="Dim m As Map = proot.Get(\"data\")";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_proot.Get((Object)("data"))));
 //BA.debugLineNum = 134;BA.debugLine="Dim latestVersion As String = m.Get(\"version\")";
_latestversion = BA.ObjectToString(_m.Get((Object)("version")));
 //BA.debugLineNum = 135;BA.debugLine="Dim apkUrl As String = urlBase & \"storage/\" &";
_apkurl = parent._urlbase+"storage/"+BA.ObjectToString(_m.Get((Object)("path")));
 //BA.debugLineNum = 136;BA.debugLine="Dim latestVersionName As String = m.Get(\"versi";
_latestversionname = BA.ObjectToString(_m.Get((Object)("version_name")));
 //BA.debugLineNum = 137;BA.debugLine="Dim latestVersionDate As String = m.Get(\"updat";
_latestversiondate = BA.ObjectToString(_m.Get((Object)("updated_at")));
 //BA.debugLineNum = 139;BA.debugLine="Dim currentVersion As String = Application.Ver";
_currentversion = BA.NumberToString(parent.__c.Application.getVersionCode());
 //BA.debugLineNum = 141;BA.debugLine="Log(\"currentVersion: \" & currentVersion)";
parent.__c.LogImpl("01179668","currentVersion: "+_currentversion,0);
 //BA.debugLineNum = 142;BA.debugLine="Log(\"newVersion: \" & latestVersion)";
parent.__c.LogImpl("01179669","newVersion: "+_latestversion,0);
 //BA.debugLineNum = 143;BA.debugLine="Log(\"apk URL: \" & apkUrl)";
parent.__c.LogImpl("01179670","apk URL: "+_apkurl,0);
 //BA.debugLineNum = 145;BA.debugLine="If IsNewer(latestVersion, currentVersion) Then";
if (true) break;

case 10:
//if
this.state = 21;
if (parent._isnewer(_latestversion,_currentversion)) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 146;BA.debugLine="Log(\"Hay nueva versión disponible\")";
parent.__c.LogImpl("01179673","Hay nueva versión disponible",0);
 //BA.debugLineNum = 147;BA.debugLine="Msgbox2Async(\"Hay una nueva versión disponibl";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Hay una nueva versión disponible"+parent.__c.CRLF+parent.__c.CRLF+"     Nombre de la Versión: "+_latestversionname+parent.__c.CRLF+"     Fecha de la Versión: "+_latestversiondate+parent.__c.CRLF+parent.__c.CRLF+"¿Desea actualizar?"),BA.ObjectToCharSequence("Actualización"),"Sí","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 152;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 43;
return;
case 43:
//C
this.state = 13;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 153;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 //BA.debugLineNum = 154;BA.debugLine="Log(\"Usuario aceptó actualizar\")";
parent.__c.LogImpl("01179681","Usuario aceptó actualizar",0);
 //BA.debugLineNum = 155;BA.debugLine="StartUpdate(apkUrl)";
parent._startupdate(_apkurl);
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 157;BA.debugLine="Log(\"Usuario canceló actualización\")";
parent.__c.LogImpl("01179684","Usuario canceló actualización",0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 160;BA.debugLine="Log(\"Ya estás en la última versión\")";
parent.__c.LogImpl("01179687","Ya estás en la última versión",0);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 163;BA.debugLine="Log(\"Error parseando JSON: \" & LastException.M";
parent.__c.LogImpl("01179690","Error parseando JSON: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 39;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 166;BA.debugLine="Try";
if (true) break;

case 27:
//try
this.state = 38;
this.catchState = 37;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 37;
 //BA.debugLineNum = 167;BA.debugLine="If Job.Success Then";
if (true) break;

case 30:
//if
this.state = 35;
if (_job._success /*boolean*/ ) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 35;
 //BA.debugLineNum = 168;BA.debugLine="Log(\"Descarga del APK completada\")";
parent.__c.LogImpl("01179695","Descarga del APK completada",0);
 //BA.debugLineNum = 170;BA.debugLine="Dim ApkName As String = \"update.apk\"";
_apkname = "update.apk";
 //BA.debugLineNum = 171;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Sta";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent._starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_apkname,parent.__c.False);
 //BA.debugLineNum = 172;BA.debugLine="File.Copy2(Job.GetInputStream, out)";
parent.__c.File.Copy2((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ ().getObject()),(java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 173;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 174;BA.debugLine="Log(\"APK guardado en: \" & File.Combine(Starte";
parent.__c.LogImpl("01179701","APK guardado en: "+parent.__c.File.Combine(parent._starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_apkname),0);
 //BA.debugLineNum = 176;BA.debugLine="SendInstallIntent(ApkName)";
parent._sendinstallintent(_apkname);
 if (true) break;

case 34:
//C
this.state = 35;
 //BA.debugLineNum = 178;BA.debugLine="Log(\"Error descargando APK: \" & Job.ErrorMess";
parent.__c.LogImpl("01179705","Error descargando APK: "+_job._errormessage /*String*/ ,0);
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
 //BA.debugLineNum = 181;BA.debugLine="Log(\"Excepción al instalar APK: \" & LastExcept";
parent.__c.LogImpl("01179708","Excepción al instalar APK: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
;
 if (true) break;

case 39:
//C
this.state = 42;
;
 if (true) break;

case 41:
//C
this.state = 42;
 //BA.debugLineNum = 185;BA.debugLine="Log(\"Error en Job \" & Job.JobName & \": \" & Job.E";
parent.__c.LogImpl("01179712","Error en Job "+_job._jobname /*String*/ +": "+_job._errormessage /*String*/ ,0);
 if (true) break;

case 42:
//C
this.state = -1;
;
 //BA.debugLineNum = 187;BA.debugLine="Job.Release";
_job._release /*String*/ ();
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _sendinstallintent(String _apkname) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
Object _uri = null;
 //BA.debugLineNum = 210;BA.debugLine="Private Sub SendInstallIntent(ApkName As String)";
 //BA.debugLineNum = 211;BA.debugLine="Log(\"Iniciando instalación del APK\")";
__c.LogImpl("01376257","Iniciando instalación del APK",0);
 //BA.debugLineNum = 212;BA.debugLine="If File.Exists(Starter.Provider.SharedFolder, Apk";
if (__c.File.Exists(_starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_apkname)) { 
 //BA.debugLineNum = 213;BA.debugLine="Log(\"esta el archivo\")";
__c.LogImpl("01376259","esta el archivo",0);
 //BA.debugLineNum = 215;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 216;BA.debugLine="If phone.SdkVersion >= 24 Then";
if (_phone.getSdkVersion()>=24) { 
 //BA.debugLineNum = 217;BA.debugLine="Dim uri As Object = Starter.Provider.GetFileUri";
_uri = _starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._getfileuri /*Object*/ (_apkname);
 //BA.debugLineNum = 218;BA.debugLine="i.Initialize(\"android.intent.action.INSTALL_PAC";
_i.Initialize("android.intent.action.INSTALL_PACKAGE",BA.ObjectToString(_uri));
 //BA.debugLineNum = 219;BA.debugLine="i.Flags = Bit.Or(i.Flags, 1)";
_i.setFlags(__c.Bit.Or(_i.getFlags(),(int) (1)));
 }else {
 //BA.debugLineNum = 222;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"file://\" & File.Co";
_i.Initialize(_i.ACTION_VIEW,"file://"+__c.File.Combine(_starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_apkname));
 //BA.debugLineNum = 223;BA.debugLine="i.SetType(\"application/vnd.android.package-arch";
_i.SetType("application/vnd.android.package-archive");
 };
 //BA.debugLineNum = 225;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 //BA.debugLineNum = 226;BA.debugLine="ExitApplication";
__c.ExitApplication();
 }else {
 //BA.debugLineNum = 228;BA.debugLine="Log(\"APK no encontrado en: \" & File.Combine(Star";
__c.LogImpl("01376274","APK no encontrado en: "+__c.File.Combine(_starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_apkname),0);
 };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _startupdate(String _apkurl) throws Exception{
b4a.bitdesing.tomapedidos.httpjob _job = null;
 //BA.debugLineNum = 195;BA.debugLine="Sub StartUpdate(apkUrl As String)";
 //BA.debugLineNum = 196;BA.debugLine="Log(\"Iniciando descarga de APK: \" & apkUrl)";
__c.LogImpl("01310721","Iniciando descarga de APK: "+_apkurl,0);
 //BA.debugLineNum = 197;BA.debugLine="Msgbox2Async(\"Finalizada la misma, deberá confirm";
__c.Msgbox2Async(BA.ObjectToCharSequence("Finalizada la misma, deberá confirmar la instalación:"+__c.CRLF+__c.CRLF+"   > Click en CONFIGURACIÓN"+__c.CRLF+"   > Activar la casilla de verificación 'Confiar en esta fuente'"+__c.CRLF+"   > Volver e instalar normalmente"+__c.CRLF+""),BA.ObjectToCharSequence("Actualización en progreso..."),"","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null)),ba,__c.False);
 //BA.debugLineNum = 203;BA.debugLine="Dim Job As HttpJob";
_job = new b4a.bitdesing.tomapedidos.httpjob();
 //BA.debugLineNum = 204;BA.debugLine="Job.Initialize(\"DownloadApk\", Me)";
_job._initialize /*String*/ (ba,"DownloadApk",this);
 //BA.debugLineNum = 205;BA.debugLine="Job.Download(apkUrl)";
_job._download /*String*/ (_apkurl);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
