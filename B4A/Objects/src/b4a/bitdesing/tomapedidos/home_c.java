package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class home_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.home_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.home_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem _additem = null;
 //BA.debugLineNum = 12;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 13;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 14;BA.debugLine="Root.LoadLayout(\"home_layout\")";
_root.LoadLayout("home_layout",ba);
 //BA.debugLineNum = 15;BA.debugLine="Log(\"create home page\")";
__c.LogImpl("736765699","create home page",0);
 //BA.debugLineNum = 18;BA.debugLine="B4XPages.SetTitle(Me, \"Home\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Home"));
 //BA.debugLineNum = 19;BA.debugLine="B4XPages.AddMenuItem(Me, \"Cerrar sesión\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Cerrar sesión"));
 //BA.debugLineNum = 20;BA.debugLine="Dim addItem As B4AMenuItem = B4XPages.AddMenuItem";
_additem = _b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)(_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/ .NOMBRE /*String*/ ));
 //BA.debugLineNum = 21;BA.debugLine="addItem.AddToBar = True";
_additem.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub b4xpage_MenuClick (Tag As String)";
 //BA.debugLineNum = 31;BA.debugLine="If Tag = \"Cerrar sesión\" Then";
if ((_tag).equals("Cerrar sesión")) { 
 //BA.debugLineNum = 32;BA.debugLine="Starter.Seller = Null";
_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/  = (b4a.bitdesing.tomapedidos.login_c._sellerdata)(__c.Null);
 //BA.debugLineNum = 33;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"mainpag";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"mainpage");
 };
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _btncustomers_click() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub btnCustomers_Click";
 //BA.debugLineNum = 38;BA.debugLine="B4XPages.ShowPage(\"customers_page\")";
_b4xpages._showpage /*String*/ (ba,"customers_page");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _btnorders_click() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub btnOrders_Click";
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.ShowPage(\"orders_page\")";
_b4xpages._showpage /*String*/ (ba,"orders_page");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _btnproducts_click() throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Private Sub btnProducts_Click";
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.ShowPage(\"products_page\")";
_b4xpages._showpage /*String*/ (ba,"products_page");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _btnsettings_click() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub btnSettings_Click";
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.ShowPage(\"settings_page\")";
_b4xpages._showpage /*String*/ (ba,"settings_page");
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 8;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
