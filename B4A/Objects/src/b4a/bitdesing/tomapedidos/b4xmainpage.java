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
public b4a.bitdesing.tomapedidos.login_c _login = null;
public b4a.bitdesing.tomapedidos.home_c _home = null;
public b4a.bitdesing.tomapedidos.products_c _products = null;
public b4a.bitdesing.tomapedidos.orders_c _orders = null;
public b4a.bitdesing.tomapedidos.order_c _order = null;
public b4a.bitdesing.tomapedidos.customers_c _customers = null;
public b4a.bitdesing.tomapedidos.settings_c _settings = null;
public b4a.bitdesing.tomapedidos.scan_c _scan = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 61;BA.debugLine="If Starter.ExistDataBase Then";
if (_starter._existdatabase /*boolean*/ ()) { 
 //BA.debugLineNum = 62;BA.debugLine="Log(\"existe base\")";
__c.LogImpl("5524290","existe base",0);
 //BA.debugLineNum = 63;BA.debugLine="btnLogin.Text = \"Iniciar sesión\"";
_btnlogin.setText(BA.ObjectToCharSequence("Iniciar sesión"));
 }else {
 //BA.debugLineNum = 65;BA.debugLine="Log(\"No existe base\")";
__c.LogImpl("5524293","No existe base",0);
 //BA.debugLineNum = 66;BA.debugLine="btnLogin.Text = \"Configuración\"";
_btnlogin.setText(BA.ObjectToCharSequence("Configuración"));
 };
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 31;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 32;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 34;BA.debugLine="B4XPages.SetTitle(Me, \"Mobile Order\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Mobile Order"));
 //BA.debugLineNum = 39;BA.debugLine="login.Initialize";
_login._initialize /*Object*/ (ba);
 //BA.debugLineNum = 40;BA.debugLine="B4XPages.AddPage(\"login_page\", login)";
_b4xpages._addpage /*String*/ (ba,"login_page",(Object)(_login));
 //BA.debugLineNum = 41;BA.debugLine="products.Initialize";
_products._initialize /*Object*/ (ba);
 //BA.debugLineNum = 42;BA.debugLine="B4XPages.AddPage(\"home_page\", home)";
_b4xpages._addpage /*String*/ (ba,"home_page",(Object)(_home));
 //BA.debugLineNum = 43;BA.debugLine="home.Initialize";
_home._initialize /*Object*/ (ba);
 //BA.debugLineNum = 44;BA.debugLine="B4XPages.AddPage(\"products_page\", products)";
_b4xpages._addpage /*String*/ (ba,"products_page",(Object)(_products));
 //BA.debugLineNum = 45;BA.debugLine="orders.Initialize";
_orders._initialize /*Object*/ (ba);
 //BA.debugLineNum = 46;BA.debugLine="B4XPages.AddPage(\"orders_page\", orders)";
_b4xpages._addpage /*String*/ (ba,"orders_page",(Object)(_orders));
 //BA.debugLineNum = 47;BA.debugLine="order.Initialize";
_order._initialize /*Object*/ (ba);
 //BA.debugLineNum = 48;BA.debugLine="B4XPages.AddPage(\"order_page\", order)";
_b4xpages._addpage /*String*/ (ba,"order_page",(Object)(_order));
 //BA.debugLineNum = 49;BA.debugLine="customers.Initialize";
_customers._initialize /*Object*/ (ba);
 //BA.debugLineNum = 50;BA.debugLine="B4XPages.AddPage(\"customers_page\", customers)";
_b4xpages._addpage /*String*/ (ba,"customers_page",(Object)(_customers));
 //BA.debugLineNum = 51;BA.debugLine="settings.Initialize";
_settings._initialize /*Object*/ (ba);
 //BA.debugLineNum = 52;BA.debugLine="B4XPages.AddPage(\"settings_page\", settings)";
_b4xpages._addpage /*String*/ (ba,"settings_page",(Object)(_settings));
 //BA.debugLineNum = 53;BA.debugLine="scan.Initialize";
_scan._initialize /*Object*/ (ba);
 //BA.debugLineNum = 54;BA.debugLine="B4XPages.AddPage(\"scan_page\", scan)";
_b4xpages._addpage /*String*/ (ba,"scan_page",(Object)(_scan));
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _btnhome_click() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub btnHome_Click";
 //BA.debugLineNum = 87;BA.debugLine="B4XPages.ShowPage(\"home_page\")";
_b4xpages._showpage /*String*/ (ba,"home_page");
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Private Sub btnLogin_Click";
 //BA.debugLineNum = 76;BA.debugLine="If Starter.ExistDataBase Then";
if (_starter._existdatabase /*boolean*/ ()) { 
 //BA.debugLineNum = 77;BA.debugLine="Log(\"existe base\")";
__c.LogImpl("5655362","existe base",0);
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.ShowPage(\"login_page\")";
_b4xpages._showpage /*String*/ (ba,"login_page");
 }else {
 //BA.debugLineNum = 80;BA.debugLine="Log(\"No existe base\")";
__c.LogImpl("5655365","No existe base",0);
 //BA.debugLineNum = 81;BA.debugLine="B4XPages.ShowPage(\"settings_page\")";
_b4xpages._showpage /*String*/ (ba,"settings_page");
 };
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 92;BA.debugLine="CopyDataBase";
_copydatabase();
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="Dim login As login_c";
_login = new b4a.bitdesing.tomapedidos.login_c();
 //BA.debugLineNum = 14;BA.debugLine="Dim home As home_c";
_home = new b4a.bitdesing.tomapedidos.home_c();
 //BA.debugLineNum = 15;BA.debugLine="Dim products As products_c";
_products = new b4a.bitdesing.tomapedidos.products_c();
 //BA.debugLineNum = 16;BA.debugLine="Dim orders As orders_c";
_orders = new b4a.bitdesing.tomapedidos.orders_c();
 //BA.debugLineNum = 17;BA.debugLine="Dim order As order_c";
_order = new b4a.bitdesing.tomapedidos.order_c();
 //BA.debugLineNum = 18;BA.debugLine="Dim customers As customers_c";
_customers = new b4a.bitdesing.tomapedidos.customers_c();
 //BA.debugLineNum = 19;BA.debugLine="Dim settings As settings_c";
_settings = new b4a.bitdesing.tomapedidos.settings_c();
 //BA.debugLineNum = 20;BA.debugLine="Dim scan As scan_c";
_scan = new b4a.bitdesing.tomapedidos.scan_c();
 //BA.debugLineNum = 21;BA.debugLine="Private btnLogin As Button";
_btnlogin = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _copydatabase() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub CopyDataBase";
 //BA.debugLineNum = 71;BA.debugLine="File.Copy(File.DirAssets, Starter.DataBase, Start";
__c.File.Copy(__c.File.getDirAssets(),_starter._database /*String*/ ,_starter._route /*String*/ ,_starter._database /*String*/ );
 //BA.debugLineNum = 72;BA.debugLine="Log(\"copy database\")";
__c.LogImpl("5589826","copy database",0);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 26;BA.debugLine="B4XPages.GetManager.TransitionAnimationDuration =";
_b4xpages._getmanager /*b4a.bitdesing.tomapedidos.b4xpagesmanager*/ (ba)._transitionanimationduration /*int*/  = (int) (0);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
