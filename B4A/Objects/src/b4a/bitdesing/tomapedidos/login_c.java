package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class login_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.login_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.login_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public b4a.bitdesing.tomapedidos.b4xdialog _dialog = null;
public b4a.bitdesing.tomapedidos.b4xcombobox _cuser = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtpassword = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _sellerdata{
public boolean IsInitialized;
public int CODIGO;
public String NOMBRE;
public String CLAVE;
public void Initialize() {
IsInitialized = true;
CODIGO = 0;
NOMBRE = "";
CLAVE = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _b4xpage_appear() throws Exception{
anywheresoftware.b4a.objects.collections.List _lista = null;
 //BA.debugLineNum = 33;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 34;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 36;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM VendMovil\")";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM VendMovil")));
 //BA.debugLineNum = 38;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 39;BA.debugLine="lista.Initialize";
_lista.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 42;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 43;BA.debugLine="lista.Add(rs.GetString(\"NOMBRE\"))";
_lista.Add((Object)(_rs.GetString("NOMBRE")));
 }
;
 };
 //BA.debugLineNum = 46;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 48;BA.debugLine="cUser.SetItems(lista)";
_cuser._setitems /*String*/ (_lista);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 23;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"login_layout\")";
_root.LoadLayout("login_layout",ba);
 //BA.debugLineNum = 25;BA.debugLine="Log(\"create login page\")";
__c.LogImpl("732309251","create login page",0);
 //BA.debugLineNum = 27;BA.debugLine="B4XPages.SetTitle(Me, \"Ingreso de usuarios\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Ingreso de usuarios"));
 //BA.debugLineNum = 29;BA.debugLine="txtPassword.TextField.Color = Colors.White";
_txtpassword._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setColor(__c.Colors.White);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _btnlogin_click() throws Exception{
b4a.bitdesing.tomapedidos.login_c._sellerdata _sd = null;
 //BA.debugLineNum = 51;BA.debugLine="Private Sub btnLogin_Click";
 //BA.debugLineNum = 53;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 55;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM VendMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM VendMovil WHERE NOMBRE='"+_cuser._getselecteditem /*String*/ ().trim()+"'")));
 //BA.debugLineNum = 57;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 58;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 59;BA.debugLine="If rs.GetString(\"CLAVE\") = txtPassword.Text The";
if ((_rs.GetString("CLAVE")).equals(_txtpassword._gettext /*String*/ ())) { 
 //BA.debugLineNum = 60;BA.debugLine="Dim SD As SellerData";
_sd = new b4a.bitdesing.tomapedidos.login_c._sellerdata();
 //BA.debugLineNum = 61;BA.debugLine="SD.Initialize";
_sd.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="SD.CODIGO = rs.GetString(\"CODIGO\")";
_sd.CODIGO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODIGO")));
 //BA.debugLineNum = 63;BA.debugLine="SD.NOMBRE = rs.GetString(\"NOMBRE\")";
_sd.NOMBRE /*String*/  = _rs.GetString("NOMBRE");
 //BA.debugLineNum = 64;BA.debugLine="SD.CLAVE = rs.GetString(\"CLAVE\")";
_sd.CLAVE /*String*/  = _rs.GetString("CLAVE");
 //BA.debugLineNum = 65;BA.debugLine="Starter.Seller = SD";
_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/  = _sd;
 //BA.debugLineNum = 66;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"login_pag";
_b4xpages._closepage /*String*/ (ba,_b4xpages._getpage /*Object*/ (ba,"login_page"));
 //BA.debugLineNum = 67;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"home_";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"home_page");
 }else {
 //BA.debugLineNum = 69;BA.debugLine="dialog.Initialize(Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 70;BA.debugLine="dialog.Title = \"Clave incorrecta!!\"";
_dialog._title /*Object*/  = (Object)("Clave incorrecta!!");
 //BA.debugLineNum = 71;BA.debugLine="dialog.Show(\"Intanta nuevamente.\", \"Ok\", \"\", \"";
_dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)("Intanta nuevamente."),(Object)("Ok"),(Object)(""),(Object)(""));
 };
 }
;
 };
 //BA.debugLineNum = 76;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Dim sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 6;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4a.bitdesing.tomapedidos.b4xdialog();
 //BA.debugLineNum = 9;BA.debugLine="Private cUser As B4XComboBox";
_cuser = new b4a.bitdesing.tomapedidos.b4xcombobox();
 //BA.debugLineNum = 11;BA.debugLine="Type SellerData (CODIGO As Int, NOMBRE As String,";
;
 //BA.debugLineNum = 13;BA.debugLine="Private txtPassword As B4XFloatTextField";
_txtpassword = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
