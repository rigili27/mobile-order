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
public b4a.bitdesing.tomapedidos.httputils2service _httputils2service = null;
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
__c.LogImpl("03342339","create customers page",0);
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
 //BA.debugLineNum = 181;BA.debugLine="Private Sub clvCustomers_ItemClick (Index As Int,";
 //BA.debugLineNum = 183;BA.debugLine="Dim CD As CustomersData = Value";
_cd = (b4a.bitdesing.tomapedidos.customers_c._customersdata)(_value);
 //BA.debugLineNum = 185;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 186;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO PedCMovil(CODCLIEN";
_sql.ExecNonQuery2("INSERT INTO PedCMovil(CODCLIENTE, CODVENDEDOR, FECHA, QUIENRECIBIO, COMENTARIOS) VALUES(?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cd.CODIGO /*int*/ ),(Object)(_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/ .CODIGO /*int*/ ),(Object)(__c.DateTime.getNow()),(Object)(""),(Object)("")}));
 //BA.debugLineNum = 187;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil ORDER";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil ORDER BY ID DESC LIMIT 1")));
 //BA.debugLineNum = 188;BA.debugLine="rs.NextRow";
_rs.NextRow();
 //BA.debugLineNum = 189;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 190;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 191;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 192;BA.debugLine="OD.Customer = Starter.SelectCustomer(OD.CODCLIENT";
_od.Customer /*String*/  = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_od.CODCLIENTE /*int*/ ).NOMBRE /*String*/ ;
 //BA.debugLineNum = 193;BA.debugLine="Dim order_page As order_c = B4XPages.GetPage(\"ord";
_order_page = (b4a.bitdesing.tomapedidos.order_c)(_b4xpages._getpage /*Object*/ (ba,"order_page"));
 //BA.debugLineNum = 194;BA.debugLine="order_page.Order = OD";
_order_page._order /*b4a.bitdesing.tomapedidos.orders_c._ordersdata*/  = _od;
 //BA.debugLineNum = 195;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 197;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"customers_pa";
_b4xpages._closepage /*String*/ (ba,_b4xpages._getpage /*Object*/ (ba,"customers_page"));
 //BA.debugLineNum = 198;BA.debugLine="B4XPages.ShowPage(\"order_page\")";
_b4xpages._showpage /*String*/ (ba,"order_page");
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public String  _clvcustomers_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ivround = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcuit = null;
anywheresoftware.b4a.objects.LabelWrapper _lblcat = null;
anywheresoftware.b4a.objects.LabelWrapper _lbladdress = null;
anywheresoftware.b4a.objects.B4XViewWrapper _divider = null;
 //BA.debugLineNum = 83;BA.debugLine="Private Sub clvCustomers_VisibleRangeChanged (Firs";
 //BA.debugLineNum = 84;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 85;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvcustomers._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 86;BA.debugLine="Dim p As Panel = clvCustomers.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvcustomers._getpanel(_i).getObject()));
 //BA.debugLineNum = 87;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 88;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 89;BA.debugLine="Dim CD As CustomersData = clvCustomers.GetValu";
_cd = (b4a.bitdesing.tomapedidos.customers_c._customersdata)(_clvcustomers._getvalue(_i));
 //BA.debugLineNum = 92;BA.debugLine="Dim ivRound As B4XView = xui.CreatePanel(\"\")";
_ivround = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ivround = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 93;BA.debugLine="ivRound.SetLayoutAnimated(0, 0, 0, 50dip, 50di";
_ivround.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 94;BA.debugLine="ivRound.SetColorAndBorder(Colors.Transparent,";
_ivround.SetColorAndBorder(__c.Colors.Transparent,(int) (0),(int) (0),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 95;BA.debugLine="ivRound.SetBitmap(LoadBitmapResize(File.DirAss";
_ivround.SetBitmap((android.graphics.Bitmap)(__c.LoadBitmapResize(__c.File.getDirAssets(),"user.png",__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (50)),__c.True).getObject()));
 //BA.debugLineNum = 96;BA.debugLine="p.AddView(ivRound, 5dip, 15dip, 50dip, 50dip)";
_p.AddView((android.view.View)(_ivround.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (50)));
 //BA.debugLineNum = 99;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 100;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
 //BA.debugLineNum = 101;BA.debugLine="lblName.Text = CD.NOMBRE";
_lblname.setText(BA.ObjectToCharSequence(_cd.NOMBRE /*String*/ ));
 //BA.debugLineNum = 102;BA.debugLine="lblName.TextSize = 14";
_lblname.setTextSize((float) (14));
 //BA.debugLineNum = 103;BA.debugLine="lblName.Typeface = Typeface.DEFAULT_BOLD";
_lblname.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 104;BA.debugLine="lblName.TextColor = Colors.DarkGray";
_lblname.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 105;BA.debugLine="p.AddView(lblName, 75dip, 13dip, 100%x - 160di";
_p.AddView((android.view.View)(_lblname.getObject()),__c.DipToCurrent((int) (75)),__c.DipToCurrent((int) (13)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (22)));
 //BA.debugLineNum = 108;BA.debugLine="Dim lblCuit As Label";
_lblcuit = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 109;BA.debugLine="lblCuit.Initialize(\"\")";
_lblcuit.Initialize(ba,"");
 //BA.debugLineNum = 110;BA.debugLine="lblCuit.Text = \"💳 CUIT: \" & CD.NROCUIT";
_lblcuit.setText(BA.ObjectToCharSequence("💳 CUIT: "+_cd.NROCUIT /*String*/ ));
 //BA.debugLineNum = 111;BA.debugLine="lblCuit.TextSize = 12";
_lblcuit.setTextSize((float) (12));
 //BA.debugLineNum = 112;BA.debugLine="lblCuit.Typeface = Typeface.DEFAULT_BOLD";
_lblcuit.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 113;BA.debugLine="lblCuit.TextColor = Colors.DarkGray";
_lblcuit.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 114;BA.debugLine="p.AddView(lblCuit, 75dip, 50dip, 100%x - 160di";
_p.AddView((android.view.View)(_lblcuit.getObject()),__c.DipToCurrent((int) (75)),__c.DipToCurrent((int) (50)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 117;BA.debugLine="Dim lblCat As Label";
_lblcat = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 118;BA.debugLine="lblCat.Initialize(\"\")";
_lblcat.Initialize(ba,"");
 //BA.debugLineNum = 119;BA.debugLine="lblCat.Text = \"🏷️ Codigo: \" & CD.CODIGO";
_lblcat.setText(BA.ObjectToCharSequence("🏷️ Codigo: "+BA.NumberToString(_cd.CODIGO /*int*/ )));
 //BA.debugLineNum = 120;BA.debugLine="lblCat.TextSize = 12";
_lblcat.setTextSize((float) (12));
 //BA.debugLineNum = 121;BA.debugLine="lblCat.Typeface = Typeface.DEFAULT_BOLD";
_lblcat.setTypeface(__c.Typeface.DEFAULT_BOLD);
 //BA.debugLineNum = 122;BA.debugLine="lblCat.TextColor = Colors.DarkGray";
_lblcat.setTextColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 123;BA.debugLine="p.AddView(lblCat, 70%x, 50dip, 100%x - 160dip,";
_p.AddView((android.view.View)(_lblcat.getObject()),__c.PerXToCurrent((float) (70),ba),__c.DipToCurrent((int) (50)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 126;BA.debugLine="Dim lblAddress As Label";
_lbladdress = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 127;BA.debugLine="lblAddress.Initialize(\"\")";
_lbladdress.Initialize(ba,"");
 //BA.debugLineNum = 128;BA.debugLine="lblAddress.Text = \"📍 \" & CD.LOCALIDAD & \" - \"";
_lbladdress.setText(BA.ObjectToCharSequence("📍 "+_cd.LOCALIDAD /*String*/ +" - "+_cd.DOMICILIO /*String*/ ));
 //BA.debugLineNum = 129;BA.debugLine="lblAddress.TextSize = 12";
_lbladdress.setTextSize((float) (12));
 //BA.debugLineNum = 130;BA.debugLine="lblAddress.TextColor = Colors.Black";
_lbladdress.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 131;BA.debugLine="p.AddView(lblAddress, 75dip, 80dip, 100%x - 16";
_p.AddView((android.view.View)(_lbladdress.getObject()),__c.DipToCurrent((int) (75)),__c.DipToCurrent((int) (80)),(int) (__c.PerXToCurrent((float) (100),ba)-__c.DipToCurrent((int) (160))),__c.DipToCurrent((int) (20)));
 //BA.debugLineNum = 144;BA.debugLine="Dim divider As B4XView = xui.CreatePanel(\"\")";
_divider = new anywheresoftware.b4a.objects.B4XViewWrapper();
_divider = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 145;BA.debugLine="divider.Color = xui.Color_LightGray";
_divider.setColor(_xui.Color_LightGray);
 //BA.debugLineNum = 146;BA.debugLine="p.AddView(divider, 0, p.Height - 1dip, 100%x,";
_p.AddView((android.view.View)(_divider.getObject()),(int) (0),(int) (_p.getHeight()-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (1)));
 };
 }else {
 //BA.debugLineNum = 151;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 152;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
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
public String  _odlclvcustomers_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
 //BA.debugLineNum = 160;BA.debugLine="Private Sub ODLclvCustomers_VisibleRangeChanged (F";
 //BA.debugLineNum = 162;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 163;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvcustomers._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 164;BA.debugLine="Dim p As Panel = clvCustomers.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvcustomers._getpanel(_i).getObject()));
 //BA.debugLineNum = 165;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 166;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 167;BA.debugLine="Dim CD As CustomersData = clvCustomers.GetValu";
_cd = (b4a.bitdesing.tomapedidos.customers_c._customersdata)(_clvcustomers._getvalue(_i));
 //BA.debugLineNum = 168;BA.debugLine="p.LoadLayout(\"customer_item_layout\")";
_p.LoadLayout("customer_item_layout",ba);
 //BA.debugLineNum = 169;BA.debugLine="lblId.Text = \"Código nro: \" & CD.CODIGO";
_lblid.setText(BA.ObjectToCharSequence("Código nro: "+BA.NumberToString(_cd.CODIGO /*int*/ )));
 //BA.debugLineNum = 170;BA.debugLine="lblName.Text = CD.NOMBRE";
_lblname.setText(BA.ObjectToCharSequence(_cd.NOMBRE /*String*/ ));
 //BA.debugLineNum = 171;BA.debugLine="lblInfo.Text = CD.LOCALIDAD & \" - \" & CD.DOMIC";
_lblinfo.setText(BA.ObjectToCharSequence(_cd.LOCALIDAD /*String*/ +" - "+_cd.DOMICILIO /*String*/ ));
 };
 }else {
 //BA.debugLineNum = 174;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 175;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
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
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvcustomers._asview().getWidth(),__c.DipToCurrent((int) (125)));
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
