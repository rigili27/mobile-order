package b4a.bitdesing.mobileorder;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class home_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.mobileorder.home_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.mobileorder.home_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.mobileorder.main _main = null;
public b4a.bitdesing.mobileorder.starter _starter = null;
public b4a.bitdesing.mobileorder.b4xpages _b4xpages = null;
public b4a.bitdesing.mobileorder.b4xcollections _b4xcollections = null;
public b4a.bitdesing.mobileorder.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _ivlogo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblseller = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcompany = null;
 //BA.debugLineNum = 12;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 13;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 14;BA.debugLine="Root.LoadLayout(\"home_layout\")";
_root.LoadLayout("home_layout",ba);
 //BA.debugLineNum = 15;BA.debugLine="Log(\"create home page\")";
__c.LogImpl("06553603","create home page",0);
 //BA.debugLineNum = 18;BA.debugLine="B4XPages.SetTitle(Me, \"Escritorio\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Escritorio"));
 //BA.debugLineNum = 19;BA.debugLine="B4XPages.AddMenuItem(Me, \"Cerrar sesión\")";
_b4xpages._addmenuitem /*b4a.bitdesing.mobileorder.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Cerrar sesión"));
 //BA.debugLineNum = 25;BA.debugLine="Dim ivLogo As ImageView";
_ivlogo = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="ivLogo.Initialize(\"\")";
_ivlogo.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="ivLogo.Bitmap = LoadBitmapResize(File.DirAssets,";
_ivlogo.setBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"user.png",__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)),__c.True).getObject()));
 //BA.debugLineNum = 28;BA.debugLine="Root.AddView(ivLogo, Root.Width/2 - 50dip, 30dip,";
_root.AddView((android.view.View)(_ivlogo.getObject()),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (50))),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 31;BA.debugLine="Dim lblSeller As Label";
_lblseller = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="lblSeller.Initialize(\"\")";
_lblseller.Initialize(ba,"");
 //BA.debugLineNum = 33;BA.debugLine="lblSeller.Text = Starter.Seller.NOMBRE";
_lblseller.setText(BA.ObjectToCharSequence(_starter._seller /*b4a.bitdesing.mobileorder.login_c._sellerdata*/ .NOMBRE /*String*/ ));
 //BA.debugLineNum = 34;BA.debugLine="lblSeller.TextSize = 20";
_lblseller.setTextSize((float) (20));
 //BA.debugLineNum = 35;BA.debugLine="lblSeller.TextColor = Colors.Black";
_lblseller.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 36;BA.debugLine="lblSeller.Gravity = Gravity.CENTER";
_lblseller.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 37;BA.debugLine="Root.AddView(lblSeller, 0, 140dip, Root.Width, 30";
_root.AddView((android.view.View)(_lblseller.getObject()),(int) (0),__c.DipToCurrent((int) (140)),_root.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 40;BA.debugLine="Dim lblCompany As Label";
_lblcompany = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="lblCompany.Initialize(\"\")";
_lblcompany.Initialize(ba,"");
 //BA.debugLineNum = 42;BA.debugLine="lblCompany.Text = Starter.SelectBusiness.RAZONSOC";
_lblcompany.setText(BA.ObjectToCharSequence(_starter._selectbusiness /*b4a.bitdesing.mobileorder.starter._businessdata*/ ().RAZONSOCIAL /*String*/ .trim()));
 //BA.debugLineNum = 43;BA.debugLine="lblCompany.TextSize = 14";
_lblcompany.setTextSize((float) (14));
 //BA.debugLineNum = 44;BA.debugLine="lblCompany.TextColor = Colors.Gray";
_lblcompany.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 45;BA.debugLine="lblCompany.Gravity = Gravity.CENTER";
_lblcompany.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 46;BA.debugLine="Root.AddView(lblCompany, 0, 170dip, Root.Width, 2";
_root.AddView((android.view.View)(_lblcompany.getObject()),(int) (0),__c.DipToCurrent((int) (170)),_root.getWidth(),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 49;BA.debugLine="CreateCard(\"btnCustomers\", \"👥\", \"Clientes\", 20di";
_createcard("btnCustomers","👥","Clientes",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (240)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (240),(int) (248),(int) (255)));
 //BA.debugLineNum = 50;BA.debugLine="CreateCard(\"btnProducts\", \"📦\", \"Productos\", Root";
_createcard("btnProducts","📦","Productos",(int) (_root.getWidth()/(double)2+__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (240)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (255),(int) (250),(int) (240)));
 //BA.debugLineNum = 51;BA.debugLine="CreateCard(\"btnOrders\", \"🧾\", \"Pedidos\", 20dip, 3";
_createcard("btnOrders","🧾","Pedidos",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (360)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (245),(int) (255),(int) (250)));
 //BA.debugLineNum = 52;BA.debugLine="CreateCard(\"btnSettings\", \"⚙️\", \"Configuración\",";
_createcard("btnSettings","⚙️","Configuración",(int) (_root.getWidth()/(double)2+__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (360)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (250),(int) (240),(int) (230)));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub b4xpage_MenuClick (Tag As String)";
 //BA.debugLineNum = 90;BA.debugLine="If Tag = \"Cerrar sesión\" Then";
if ((_tag).equals("Cerrar sesión")) { 
 //BA.debugLineNum = 91;BA.debugLine="Starter.Seller = Null";
_starter._seller /*b4a.bitdesing.mobileorder.login_c._sellerdata*/  = (b4a.bitdesing.mobileorder.login_c._sellerdata)(__c.Null);
 //BA.debugLineNum = 92;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"mainpag";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"mainpage");
 };
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _btncustomers_click() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Private Sub btnCustomers_Click";
 //BA.debugLineNum = 97;BA.debugLine="B4XPages.ShowPage(\"customers_page\")";
_b4xpages._showpage /*String*/ (ba,"customers_page");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _btnorders_click() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Private Sub btnOrders_Click";
 //BA.debugLineNum = 106;BA.debugLine="B4XPages.ShowPage(\"orders_page\")";
_b4xpages._showpage /*String*/ (ba,"orders_page");
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _btnproducts_click() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Private Sub btnProducts_Click";
 //BA.debugLineNum = 102;BA.debugLine="B4XPages.ShowPage(\"products_page\")";
_b4xpages._showpage /*String*/ (ba,"products_page");
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _btnsettings_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Private Sub btnSettings_Click";
 //BA.debugLineNum = 110;BA.debugLine="B4XPages.ShowPage(\"settings_page\")";
_b4xpages._showpage /*String*/ (ba,"settings_page");
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
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
public String  _createcard(String _eventname,String _emoji,String _title,int _left,int _top,int _width,int _height,int _bgcolor) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lblicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub CreateCard(EventName As String, Emoji";
 //BA.debugLineNum = 58;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(EventName)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _xui.CreatePanel(ba,_eventname);
 //BA.debugLineNum = 59;BA.debugLine="pnl.SetLayoutAnimated(0, Left, Top, Width, Height";
_pnl.SetLayoutAnimated((int) (0),_left,_top,_width,_height);
 //BA.debugLineNum = 60;BA.debugLine="pnl.SetColorAndBorder(BgColor, 1dip, Colors.Light";
_pnl.SetColorAndBorder(_bgcolor,__c.DipToCurrent((int) (1)),__c.Colors.LightGray,__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 61;BA.debugLine="Root.AddView(pnl, Left, Top, Width, Height)";
_root.AddView((android.view.View)(_pnl.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 64;BA.debugLine="Dim lblIcon As Label";
_lblicon = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="lblIcon.Initialize(\"\")";
_lblicon.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="lblIcon.Text = Emoji";
_lblicon.setText(BA.ObjectToCharSequence(_emoji));
 //BA.debugLineNum = 67;BA.debugLine="lblIcon.TextSize = 32";
_lblicon.setTextSize((float) (32));
 //BA.debugLineNum = 68;BA.debugLine="lblIcon.Gravity = Gravity.CENTER";
_lblicon.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 69;BA.debugLine="pnl.AddView(lblIcon, 0, 10dip, pnl.Width, 40dip)";
_pnl.AddView((android.view.View)(_lblicon.getObject()),(int) (0),__c.DipToCurrent((int) (10)),_pnl.getWidth(),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 72;BA.debugLine="Dim lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="lblTitle.Initialize(\"\")";
_lbltitle.Initialize(ba,"");
 //BA.debugLineNum = 74;BA.debugLine="lblTitle.Text = Title";
_lbltitle.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 75;BA.debugLine="lblTitle.TextSize = 18";
_lbltitle.setTextSize((float) (18));
 //BA.debugLineNum = 76;BA.debugLine="lblTitle.TextColor = Colors.Black";
_lbltitle.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 77;BA.debugLine="lblTitle.Gravity = Gravity.CENTER";
_lbltitle.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 78;BA.debugLine="pnl.AddView(lblTitle, 0, 55dip, pnl.Width, 30dip)";
_pnl.AddView((android.view.View)(_lbltitle.getObject()),(int) (0),__c.DipToCurrent((int) (55)),_pnl.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
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
