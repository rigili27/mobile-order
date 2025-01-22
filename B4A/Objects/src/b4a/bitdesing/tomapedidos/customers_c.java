package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class customers_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.customers_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.customers_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public b4a.example3.customlistview _clvcustomers = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtsearch = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _customersdata{
public boolean IsInitialized;
public int CODIGO;
public String NOMBRE;
public String DOMICILIO;
public String LOCALIDAD;
public String TELEFONO;
public String NROCUIT;
public int CODCATIVA;
public int NROLPRECIOS;
public double SALDO;
public void Initialize() {
IsInitialized = true;
CODIGO = 0;
NOMBRE = "";
DOMICILIO = "";
LOCALIDAD = "";
TELEFONO = "";
NROCUIT = "";
CODCATIVA = 0;
NROLPRECIOS = 0;
SALDO = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 37;BA.debugLine="txtSearch_TextChanged(\"\", \"\")";
_txtsearch_textchanged("","");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"customers_layout\")";
_root.LoadLayout("customers_layout",ba);
 //BA.debugLineNum = 29;BA.debugLine="Log(\"create customers page\")";
__c.LogImpl("734734083","create customers page",0);
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.SetTitle(Me, \"Clientes\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Clientes"));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Type CustomersData (CODIGO As Int, NOMBRE As Stri";
;
 //BA.debugLineNum = 7;BA.debugLine="Dim sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 8;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private clvCustomers As CustomListView";
_clvcustomers = new b4a.example3.customlistview();
 //BA.debugLineNum = 11;BA.debugLine="Private txtSearch As B4XFloatTextField";
_txtsearch = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 14;BA.debugLine="Private lblId As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private lblInfo As Label";
_lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _clvcustomers_itemclick(int _index,Object _value) throws Exception{
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
b4a.bitdesing.tomapedidos.order_c _order_page = null;
 //BA.debugLineNum = 106;BA.debugLine="Private Sub clvCustomers_ItemClick (Index As Int,";
 //BA.debugLineNum = 108;BA.debugLine="Dim CD As CustomersData = Value";
_cd = (b4a.bitdesing.tomapedidos.customers_c._customersdata)(_value);
 //BA.debugLineNum = 110;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 111;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO PedCMovil(CODCLIEN";
_sql.ExecNonQuery2("INSERT INTO PedCMovil(CODCLIENTE, CODVENDEDOR, FECHA, QUIENRECIBIO, COMENTARIOS) VALUES(?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cd.CODIGO /*int*/ ),(Object)(_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/ .CODIGO /*int*/ ),(Object)(__c.DateTime.getNow()),(Object)(""),(Object)("")}));
 //BA.debugLineNum = 112;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil ORDER";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil ORDER BY ID DESC LIMIT 1")));
 //BA.debugLineNum = 113;BA.debugLine="rs.NextRow";
_rs.NextRow();
 //BA.debugLineNum = 114;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 115;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 116;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 117;BA.debugLine="OD.Customer = Starter.SelectCustomer(OD.CODCLIENT";
_od.Customer /*String*/  = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_od.CODCLIENTE /*int*/ ).NOMBRE /*String*/ ;
 //BA.debugLineNum = 118;BA.debugLine="Dim order_page As order_c = B4XPages.GetPage(\"ord";
_order_page = (b4a.bitdesing.tomapedidos.order_c)(_b4xpages._getpage /*Object*/ (ba,"order_page"));
 //BA.debugLineNum = 119;BA.debugLine="order_page.Order = OD";
_order_page._order /*b4a.bitdesing.tomapedidos.orders_c._ordersdata*/  = _od;
 //BA.debugLineNum = 120;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 122;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"customers_pa";
_b4xpages._closepage /*String*/ (ba,_b4xpages._getpage /*Object*/ (ba,"customers_page"));
 //BA.debugLineNum = 123;BA.debugLine="B4XPages.ShowPage(\"order_page\")";
_b4xpages._showpage /*String*/ (ba,"order_page");
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return "";
}
public String  _clvcustomers_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
 //BA.debugLineNum = 85;BA.debugLine="Private Sub clvCustomers_VisibleRangeChanged (Firs";
 //BA.debugLineNum = 87;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 88;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvcustomers._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 89;BA.debugLine="Dim p As Panel = clvCustomers.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvcustomers._getpanel(_i).getObject()));
 //BA.debugLineNum = 90;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 91;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 92;BA.debugLine="Dim CD As CustomersData = clvCustomers.GetValu";
_cd = (b4a.bitdesing.tomapedidos.customers_c._customersdata)(_clvcustomers._getvalue(_i));
 //BA.debugLineNum = 93;BA.debugLine="p.LoadLayout(\"customer_item_layout\")";
_p.LoadLayout("customer_item_layout",ba);
 //BA.debugLineNum = 94;BA.debugLine="lblId.Text = \"Código nro: \" & CD.CODIGO";
_lblid.setText(BA.ObjectToCharSequence("Código nro: "+BA.NumberToString(_cd.CODIGO /*int*/ )));
 //BA.debugLineNum = 95;BA.debugLine="lblName.Text = CD.NOMBRE";
_lblname.setText(BA.ObjectToCharSequence(_cd.NOMBRE /*String*/ ));
 //BA.debugLineNum = 96;BA.debugLine="lblInfo.Text = CD.LOCALIDAD & \" - \" & CD.DOMIC";
_lblinfo.setText(BA.ObjectToCharSequence(_cd.LOCALIDAD /*String*/ +" - "+_cd.DOMICILIO /*String*/ ));
 };
 }else {
 //BA.debugLineNum = 99;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 100;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 22;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return null;
}
public String  _txtsearch_textchanged(String _old,String _new) throws Exception{
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 41;BA.debugLine="Private Sub txtSearch_TextChanged (Old As String,";
 //BA.debugLineNum = 43;BA.debugLine="If New.Length = 1 Or New.Length = 2 Then Return";
if (_new.length()==1 || _new.length()==2) { 
if (true) return "";};
 //BA.debugLineNum = 45;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 47;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
 //BA.debugLineNum = 48;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM CliMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM CliMovil WHERE (NOMBRE LIKE '%"+_new.trim()+"%' OR NROCUIT LIKE '%"+_new.trim()+"%')")));
 }else {
 //BA.debugLineNum = 50;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM CliMovil\")";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM CliMovil")));
 };
 //BA.debugLineNum = 53;BA.debugLine="clvCustomers.Clear";
_clvcustomers._clear();
 //BA.debugLineNum = 55;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 56;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 57;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 59;BA.debugLine="Dim CD As CustomersData";
_cd = new b4a.bitdesing.tomapedidos.customers_c._customersdata();
 //BA.debugLineNum = 60;BA.debugLine="CD.Initialize";
_cd.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="CD.CODIGO = rs.GetString(\"CODIGO\")";
_cd.CODIGO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODIGO")));
 //BA.debugLineNum = 62;BA.debugLine="CD.NOMBRE = rs.GetString(\"NOMBRE\")";
_cd.NOMBRE /*String*/  = _rs.GetString("NOMBRE");
 //BA.debugLineNum = 63;BA.debugLine="CD.DOMICILIO = rs.GetString(\"DOMICILIO\")";
_cd.DOMICILIO /*String*/  = _rs.GetString("DOMICILIO");
 //BA.debugLineNum = 64;BA.debugLine="CD.LOCALIDAD = rs.GetString(\"LOCALIDAD\")";
_cd.LOCALIDAD /*String*/  = _rs.GetString("LOCALIDAD");
 //BA.debugLineNum = 65;BA.debugLine="CD.TELEFONO = rs.GetString(\"TELEFONO\")";
_cd.TELEFONO /*String*/  = _rs.GetString("TELEFONO");
 //BA.debugLineNum = 66;BA.debugLine="CD.NROCUIT = rs.GetString(\"NROCUIT\")";
_cd.NROCUIT /*String*/  = _rs.GetString("NROCUIT");
 //BA.debugLineNum = 67;BA.debugLine="CD.CODCATIVA = rs.GetString(\"CODCATIVA\")";
_cd.CODCATIVA /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCATIVA")));
 //BA.debugLineNum = 68;BA.debugLine="CD.NROLPRECIOS = rs.GetString(\"NROLPRECIOS\")";
_cd.NROLPRECIOS /*int*/  = (int)(Double.parseDouble(_rs.GetString("NROLPRECIOS")));
 //BA.debugLineNum = 69;BA.debugLine="CD.SALDO = rs.GetString(\"SALDO\")";
_cd.SALDO /*double*/  = (double)(Double.parseDouble(_rs.GetString("SALDO")));
 //BA.debugLineNum = 71;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 72;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 73;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvCustomers.AsVie";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvcustomers._asview().getWidth(),__c.DipToCurrent((int) (108)));
 //BA.debugLineNum = 74;BA.debugLine="clvCustomers.Add(p, CD)";
_clvcustomers._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_cd));
 }
;
 };
 //BA.debugLineNum = 79;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
