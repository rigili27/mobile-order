package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class products_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.products_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.products_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public b4a.example3.customlistview _clvproducts = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _fondooscuro = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _paneldetailproduct = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsku = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldescription = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecio = null;
public b4a.bitdesing.tomapedidos.b4xdialog _dialog = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtquantity = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtprecio = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtoff = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtcomentario = null;
public String _callof = "";
public b4a.bitdesing.tomapedidos.orders_c._ordersdata _order = null;
public b4a.bitdesing.tomapedidos.customers_c._customersdata _customer = null;
public String _barcode = "";
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _productsdata{
public boolean IsInitialized;
public int CODIGO;
public String DESCRIPCION;
public String SKU;
public double PREVTAPUB1;
public double PREVTAPUB2;
public double PREVTAPUB3;
public int ALICUTA;
public int MONEDA;
public int CODIGOBARRA;
public void Initialize() {
IsInitialized = true;
CODIGO = 0;
DESCRIPCION = "";
SKU = "";
PREVTAPUB1 = 0;
PREVTAPUB2 = 0;
PREVTAPUB3 = 0;
ALICUTA = 0;
MONEDA = 0;
CODIGOBARRA = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public void  _additem(Object _value) throws Exception{
ResumableSub_AddItem rsub = new ResumableSub_AddItem(this,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_AddItem extends BA.ResumableSub {
public ResumableSub_AddItem(b4a.bitdesing.tomapedidos.products_c parent,Object _value) {
this.parent = parent;
this._value = _value;
}
b4a.bitdesing.tomapedidos.products_c parent;
Object _value;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
b4a.bitdesing.tomapedidos.products_c._productsdata _pd = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 160;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 161;BA.debugLine="dialog.Title = \"Entrada de datos\"";
parent._dialog._title /*Object*/  = (Object)("Entrada de datos");
 //BA.debugLineNum = 163;BA.debugLine="dialog.BackgroundColor = Colors.White";
parent._dialog._backgroundcolor /*int*/  = parent.__c.Colors.White;
 //BA.debugLineNum = 164;BA.debugLine="dialog.ButtonsColor = Colors.Transparent";
parent._dialog._buttonscolor /*int*/  = parent.__c.Colors.Transparent;
 //BA.debugLineNum = 165;BA.debugLine="dialog.ButtonsTextColor = Colors.Black";
parent._dialog._buttonstextcolor /*int*/  = parent.__c.Colors.Black;
 //BA.debugLineNum = 167;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 168;BA.debugLine="p.SetLayoutAnimated(0, 60dip, 0, Root.Width - 60d";
_p.SetLayoutAnimated((int) (0),parent.__c.DipToCurrent((int) (60)),(int) (0),(int) (parent._root.getWidth()-parent.__c.DipToCurrent((int) (60))),parent.__c.DipToCurrent((int) (320)));
 //BA.debugLineNum = 169;BA.debugLine="p.LoadLayout(\"products_add_order_item_layout\")";
_p.LoadLayout("products_add_order_item_layout",ba);
 //BA.debugLineNum = 170;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
parent._dialog._putattop /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 172;BA.debugLine="Dim PD As ProductsData = Value";
_pd = (b4a.bitdesing.tomapedidos.products_c._productsdata)(_value);
 //BA.debugLineNum = 174;BA.debugLine="If Customer.NROLPRECIOS = 1 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._customer.NROLPRECIOS /*int*/ ==1) { 
this.state = 3;
}else if(parent._customer.NROLPRECIOS /*int*/ ==2) { 
this.state = 5;
}else if(parent._customer.NROLPRECIOS /*int*/ ==3) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 175;BA.debugLine="txtPrecio.Text = PD.PREVTAPUB1";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_pd.PREVTAPUB1 /*double*/ ));
 if (true) break;

case 5:
//C
this.state = 10;
 //BA.debugLineNum = 177;BA.debugLine="txtPrecio.Text = PD.PREVTAPUB2";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_pd.PREVTAPUB2 /*double*/ ));
 if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 179;BA.debugLine="txtPrecio.Text = PD.PREVTAPUB3";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_pd.PREVTAPUB3 /*double*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 181;BA.debugLine="txtPrecio.Text = PD.PREVTAPUB1";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_pd.PREVTAPUB1 /*double*/ ));
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 184;BA.debugLine="txtQuantity.Text = 1";
parent._txtquantity._settext /*String*/ (BA.NumberToString(1));
 //BA.debugLineNum = 185;BA.debugLine="txtOff.Text = 0";
parent._txtoff._settext /*String*/ (BA.NumberToString(0));
 //BA.debugLineNum = 187;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 11;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 188;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 192;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 193;BA.debugLine="sql.ExecNonQuery2(\"INSERT INTO PedDMovil(IDPEDID";
parent._sql.ExecNonQuery2("INSERT INTO PedDMovil(IDPEDIDO, CODARTICULO, CANTIDAD, PRECIO, IMPORTE, UNIDAD, PORDTO, COMENTARIO) VALUES(?, ?, ?, ?, ?, ?, ?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent._order.ID /*int*/ ),(Object)(_pd.CODIGO /*int*/ ),(Object)(parent._txtquantity._gettext /*String*/ ()),(Object)(parent._txtprecio._gettext /*String*/ ()),(Object)((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))-((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtoff._gettext /*String*/ ()))/(double)100)),(Object)(0),(Object)(parent._txtoff._gettext /*String*/ ()),(Object)(parent._txtcomentario._gettext /*String*/ ())}));
 //BA.debugLineNum = 196;BA.debugLine="B4XPages.ClosePage(B4XPages.GetPage(\"products_pa";
parent._b4xpages._closepage /*String*/ (ba,parent._b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 197;BA.debugLine="B4XPages.ShowPage(\"order_page\")";
parent._b4xpages._showpage /*String*/ (ba,"order_page");
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 57;BA.debugLine="If Barcode = \"\" Then";
if ((_barcode).equals("")) { 
 //BA.debugLineNum = 58;BA.debugLine="txtSearch_TextChanged(\"\", \"\")";
_txtsearch_textchanged("","");
 }else {
 //BA.debugLineNum = 61;BA.debugLine="txtSearch.Text = Barcode";
_txtsearch._settext /*String*/ (_barcode);
 };
 //BA.debugLineNum = 64;BA.debugLine="Customer = Starter.SelectCustomer(Order.CODCLIENT";
_customer = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_order.CODCLIENTE /*int*/ );
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 44;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 45;BA.debugLine="Root.LoadLayout(\"products_layout\")";
_root.LoadLayout("products_layout",ba);
 //BA.debugLineNum = 46;BA.debugLine="Log(\"create products page\")";
__c.LogImpl("732636931","create products page",0);
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.SetTitle(Me, \"Productos\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Productos"));
 //BA.debugLineNum = 50;BA.debugLine="B4XPages.AddMenuItem(Me, \"Escanear\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Escanear"));
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub B4XPage_Disappear";
 //BA.debugLineNum = 69;BA.debugLine="Barcode = \"\"";
_barcode = "";
 //BA.debugLineNum = 70;BA.debugLine="txtSearch.Text = \"\"";
_txtsearch._settext /*String*/ ("");
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub b4xpage_MenuClick (Tag As String)";
 //BA.debugLineNum = 217;BA.debugLine="If Tag = \"Escanear\" Then";
if ((_tag).equals("Escanear")) { 
 //BA.debugLineNum = 218;BA.debugLine="B4XPages.ShowPage(\"scan_page\")";
_b4xpages._showpage /*String*/ (ba,"scan_page");
 };
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _btnclearsearch_click() throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Private Sub btnClearSearch_Click";
 //BA.debugLineNum = 144;BA.debugLine="txtSearch.Text = \"\"";
_txtsearch._settext /*String*/ ("");
 //BA.debugLineNum = 145;BA.debugLine="txtSearch_TextChanged(\"\", \"\")";
_txtsearch_textchanged("","");
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _btndetailpanel_volver_click() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Private Sub btnDetailPanel_Volver_Click";
 //BA.debugLineNum = 210;BA.debugLine="PanelDetailProduct.Visible = False";
_paneldetailproduct.setVisible(__c.False);
 //BA.debugLineNum = 211;BA.debugLine="FondoOscuro.Visible = False";
_fondooscuro.setVisible(__c.False);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Type ProductsData (CODIGO As Int, DESCRIPCION As";
;
 //BA.debugLineNum = 11;BA.debugLine="Private clvProducts As CustomListView";
_clvproducts = new b4a.example3.customlistview();
 //BA.debugLineNum = 12;BA.debugLine="Private txtSearch As B4XFloatTextField";
_txtsearch = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 14;BA.debugLine="Private FondoOscuro As B4XView";
_fondooscuro = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private PanelDetailProduct As B4XView";
_paneldetailproduct = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblSKU As B4XView";
_lblsku = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lblDescription As B4XView";
_lbldescription = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblPrecio As Label";
_lblprecio = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4a.bitdesing.tomapedidos.b4xdialog();
 //BA.debugLineNum = 24;BA.debugLine="Private txtQuantity As B4XFloatTextField";
_txtquantity = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 25;BA.debugLine="Private txtPrecio As B4XFloatTextField";
_txtprecio = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 26;BA.debugLine="Private txtOff As B4XFloatTextField";
_txtoff = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 27;BA.debugLine="Private txtComentario As B4XFloatTextField";
_txtcomentario = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 30;BA.debugLine="Public CallOf As String";
_callof = "";
 //BA.debugLineNum = 31;BA.debugLine="Public Order As OrdersData";
_order = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 32;BA.debugLine="Public Customer As CustomersData";
_customer = new b4a.bitdesing.tomapedidos.customers_c._customersdata();
 //BA.debugLineNum = 33;BA.debugLine="Public Barcode As String";
_barcode = "";
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _clvproducts_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub clvProducts_ItemClick (Index As Int, V";
 //BA.debugLineNum = 151;BA.debugLine="If CallOf = \"order_page\" Then";
if ((_callof).equals("order_page")) { 
 //BA.debugLineNum = 152;BA.debugLine="AddItem(Value)";
_additem(_value);
 };
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _clvproducts_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.products_c._productsdata _pd = null;
 //BA.debugLineNum = 112;BA.debugLine="Private Sub clvProducts_VisibleRangeChanged (First";
 //BA.debugLineNum = 114;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 115;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvproducts._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 116;BA.debugLine="Dim p As Panel = clvProducts.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvproducts._getpanel(_i).getObject()));
 //BA.debugLineNum = 117;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 118;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 119;BA.debugLine="Dim PD As ProductsData = clvProducts.GetValue(";
_pd = (b4a.bitdesing.tomapedidos.products_c._productsdata)(_clvproducts._getvalue(_i));
 //BA.debugLineNum = 120;BA.debugLine="p.LoadLayout(\"product_item_layout\")";
_p.LoadLayout("product_item_layout",ba);
 //BA.debugLineNum = 121;BA.debugLine="lblDescription.Text = PD.DESCRIPCION";
_lbldescription.setText(BA.ObjectToCharSequence(_pd.DESCRIPCION /*String*/ ));
 //BA.debugLineNum = 122;BA.debugLine="lblSKU.Text = \"SKU: \" & PD.SKU";
_lblsku.setText(BA.ObjectToCharSequence("SKU: "+_pd.SKU /*String*/ ));
 //BA.debugLineNum = 124;BA.debugLine="If Customer <> Null And Customer.NROLPRECIOS =";
if (_customer!= null && _customer.NROLPRECIOS /*int*/ ==1) { 
 //BA.debugLineNum = 125;BA.debugLine="lblPrecio.Text = \"$ \" & PD.PREVTAPUB1";
_lblprecio.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_pd.PREVTAPUB1 /*double*/ )));
 }else if(_customer!= null && _customer.NROLPRECIOS /*int*/ ==2) { 
 //BA.debugLineNum = 127;BA.debugLine="lblPrecio.Text = \"$ \" & PD.PREVTAPUB2";
_lblprecio.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_pd.PREVTAPUB2 /*double*/ )));
 }else if(_customer!= null && _customer.NROLPRECIOS /*int*/ ==3) { 
 //BA.debugLineNum = 129;BA.debugLine="lblPrecio.Text = \"$ \" & PD.PREVTAPUB3";
_lblprecio.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_pd.PREVTAPUB3 /*double*/ )));
 }else {
 //BA.debugLineNum = 131;BA.debugLine="lblPrecio.Text = \"$ \" & PD.PREVTAPUB1";
_lblprecio.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_pd.PREVTAPUB1 /*double*/ )));
 };
 };
 }else {
 //BA.debugLineNum = 136;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 137;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _txtsearch_textchanged(String _old,String _new) throws Exception{
b4a.bitdesing.tomapedidos.products_c._productsdata _pd = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 73;BA.debugLine="Private Sub txtSearch_TextChanged (Old As String,";
 //BA.debugLineNum = 75;BA.debugLine="If New.Length = 1 Or New.Length = 2 Then Return";
if (_new.length()==1 || _new.length()==2) { 
if (true) return "";};
 //BA.debugLineNum = 77;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 79;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
 //BA.debugLineNum = 80;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM ArtMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM ArtMovil WHERE (SKU LIKE '%"+_new.trim()+"%' OR DESCRIPCION LIKE '%"+_new.trim()+"%' OR CODIGO LIKE '%"+_new.trim()+"%' OR CODIGOBARRA LIKE '%"+_new.trim()+"%')")));
 }else {
 //BA.debugLineNum = 82;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM ArtMovil\")";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM ArtMovil")));
 };
 //BA.debugLineNum = 85;BA.debugLine="clvProducts.Clear";
_clvproducts._clear();
 //BA.debugLineNum = 87;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 88;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 89;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 91;BA.debugLine="Dim PD As ProductsData";
_pd = new b4a.bitdesing.tomapedidos.products_c._productsdata();
 //BA.debugLineNum = 92;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="PD.DESCRIPCION = rs.GetString(\"DESCRIPCION\")";
_pd.DESCRIPCION /*String*/  = _rs.GetString("DESCRIPCION");
 //BA.debugLineNum = 94;BA.debugLine="PD.CODIGO = rs.GetString(\"CODIGO\")";
_pd.CODIGO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODIGO")));
 //BA.debugLineNum = 95;BA.debugLine="PD.SKU = rs.GetString(\"SKU\")";
_pd.SKU /*String*/  = _rs.GetString("SKU");
 //BA.debugLineNum = 96;BA.debugLine="PD.PREVTAPUB1 = rs.GetString(\"PREVTAPUB1\")";
_pd.PREVTAPUB1 /*double*/  = (double)(Double.parseDouble(_rs.GetString("PREVTAPUB1")));
 //BA.debugLineNum = 97;BA.debugLine="PD.PREVTAPUB2 = rs.GetString(\"PREVTAPUB2\")";
_pd.PREVTAPUB2 /*double*/  = (double)(Double.parseDouble(_rs.GetString("PREVTAPUB2")));
 //BA.debugLineNum = 98;BA.debugLine="PD.PREVTAPUB3 = rs.GetString(\"PREVTAPUB3\")";
_pd.PREVTAPUB3 /*double*/  = (double)(Double.parseDouble(_rs.GetString("PREVTAPUB3")));
 //BA.debugLineNum = 100;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 101;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 102;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvProducts.AsView";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvproducts._asview().getWidth(),__c.DipToCurrent((int) (112)));
 //BA.debugLineNum = 103;BA.debugLine="clvProducts.Add(p, PD)";
_clvproducts._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_pd));
 }
;
 };
 //BA.debugLineNum = 108;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
