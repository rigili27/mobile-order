package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class orders_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.orders_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.orders_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public b4a.example3.customlistview _clvorders = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsearch = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblorderid = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcustomer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltotalorder = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _ordersdata{
public boolean IsInitialized;
public int ID;
public int CODCLIENTE;
public int CODVENDEDOR;
public String FECHA;
public String COMENTARIOS;
public String NROPEDIDO;
public String QUIENRECIBIO;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper FIRMA;
public String Customer;
public String TotalOrder;
public void Initialize() {
IsInitialized = true;
ID = 0;
CODCLIENTE = 0;
CODVENDEDOR = 0;
FECHA = "";
COMENTARIOS = "";
NROPEDIDO = "";
QUIENRECIBIO = "";
FIRMA = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Customer = "";
TotalOrder = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 39;BA.debugLine="txtSearch_TextChanged(\"\", \"\")";
_txtsearch_textchanged("","");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem _addorder = null;
 //BA.debugLineNum = 26;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 27;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"orders_layout\")";
_root.LoadLayout("orders_layout",ba);
 //BA.debugLineNum = 29;BA.debugLine="Log(\"create orders page\")";
__c.LogImpl("533161219","create orders page",0);
 //BA.debugLineNum = 31;BA.debugLine="B4XPages.SetTitle(Me, \"Pedidos\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Pedidos"));
 //BA.debugLineNum = 32;BA.debugLine="Dim addOrder As B4AMenuItem = B4XPages.AddMenuIte";
_addorder = _b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Nuevo"));
 //BA.debugLineNum = 33;BA.debugLine="addOrder.AddToBar = True";
_addorder.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub b4xpage_MenuClick (Tag As String)";
 //BA.debugLineNum = 120;BA.debugLine="If Tag = \"Nuevo\" Then";
if ((_tag).equals("Nuevo")) { 
 //BA.debugLineNum = 121;BA.debugLine="B4XPages.ShowPage(\"customers_page\")";
_b4xpages._showpage /*String*/ (ba,"customers_page");
 };
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Type OrdersData (ID As Int, CODCLIENTE As Int, CO";
;
 //BA.debugLineNum = 11;BA.debugLine="Private clvOrders As CustomListView";
_clvorders = new b4a.example3.customlistview();
 //BA.debugLineNum = 12;BA.debugLine="Private txtSearch As EditText";
_txtsearch = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblOrderId As B4XView";
_lblorderid = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblCustomer As Label";
_lblcustomer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblTotalOrder As B4XView";
_lbltotalorder = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _clvorders_itemclick(int _index,Object _value) throws Exception{
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
b4a.bitdesing.tomapedidos.order_c _order_page = null;
 //BA.debugLineNum = 126;BA.debugLine="Private Sub clvOrders_ItemClick (Index As Int, Val";
 //BA.debugLineNum = 128;BA.debugLine="Dim OD As OrdersData = Value";
_od = (b4a.bitdesing.tomapedidos.orders_c._ordersdata)(_value);
 //BA.debugLineNum = 129;BA.debugLine="Dim order_page As order_c = B4XPages.GetPage(\"ord";
_order_page = (b4a.bitdesing.tomapedidos.order_c)(_b4xpages._getpage /*Object*/ (ba,"order_page"));
 //BA.debugLineNum = 130;BA.debugLine="order_page.Order = OD";
_order_page._order /*b4a.bitdesing.tomapedidos.orders_c._ordersdata*/  = _od;
 //BA.debugLineNum = 131;BA.debugLine="B4XPages.ShowPage(\"order_page\")";
_b4xpages._showpage /*String*/ (ba,"order_page");
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public void  _clvorders_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_clvOrders_ItemLongClick rsub = new ResumableSub_clvOrders_ItemLongClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_clvOrders_ItemLongClick extends BA.ResumableSub {
public ResumableSub_clvOrders_ItemLongClick(b4a.bitdesing.tomapedidos.orders_c parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.bitdesing.tomapedidos.orders_c parent;
int _index;
Object _value;
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
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
 //BA.debugLineNum = 138;BA.debugLine="Dim OD As OrdersData = Value";
_od = (b4a.bitdesing.tomapedidos.orders_c._ordersdata)(_value);
 //BA.debugLineNum = 140;BA.debugLine="Msgbox2Async(\"¿Estás seguro de que deseas quitar";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("¿Estás seguro de que deseas quitar el pedido?"),BA.ObjectToCharSequence("Confirmación"),"Sí","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
 //BA.debugLineNum = 141;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 143;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 144;BA.debugLine="Log(\"El usuario eligió Sí.\")";
parent.__c.LogImpl("533554440","El usuario eligió Sí.",0);
 //BA.debugLineNum = 145;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 147;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM PedCMovil WHERE ID";
parent._sql.ExecNonQuery("DELETE FROM PedCMovil WHERE ID="+BA.NumberToString(_od.ID /*int*/ ));
 //BA.debugLineNum = 149;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM PedDMovil WHERE ID";
parent._sql.ExecNonQuery("DELETE FROM PedDMovil WHERE IDPEDIDO="+BA.NumberToString(_od.ID /*int*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 152;BA.debugLine="Log(\"El usuario eligió No.\")";
parent.__c.LogImpl("533554448","El usuario eligió No.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 156;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _clvorders_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
 //BA.debugLineNum = 97;BA.debugLine="Private Sub clvOrders_VisibleRangeChanged (FirstIn";
 //BA.debugLineNum = 99;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 100;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvorders._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 101;BA.debugLine="Dim p As Panel = clvOrders.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvorders._getpanel(_i).getObject()));
 //BA.debugLineNum = 102;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 103;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 104;BA.debugLine="Dim OD As OrdersData = clvOrders.GetValue(i)";
_od = (b4a.bitdesing.tomapedidos.orders_c._ordersdata)(_clvorders._getvalue(_i));
 //BA.debugLineNum = 105;BA.debugLine="p.LoadLayout(\"order_item_layout\")";
_p.LoadLayout("order_item_layout",ba);
 //BA.debugLineNum = 106;BA.debugLine="lblCustomer.Text = OD.Customer";
_lblcustomer.setText(BA.ObjectToCharSequence(_od.Customer /*String*/ ));
 //BA.debugLineNum = 107;BA.debugLine="lblOrderId.Text = OD.ID";
_lblorderid.setText(BA.ObjectToCharSequence(_od.ID /*int*/ ));
 //BA.debugLineNum = 108;BA.debugLine="lblTotalOrder.Text = \"$ \" & OD.TotalOrder";
_lbltotalorder.setText(BA.ObjectToCharSequence("$ "+_od.TotalOrder /*String*/ ));
 };
 }else {
 //BA.debugLineNum = 111;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 112;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
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
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 43;BA.debugLine="Private Sub txtSearch_TextChanged (Old As String,";
 //BA.debugLineNum = 45;BA.debugLine="If New.Length = 1 Or New.Length = 2 Then Return";
if (_new.length()==1 || _new.length()==2) { 
if (true) return "";};
 //BA.debugLineNum = 47;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 49;BA.debugLine="If New.Length > 0 Then";
if (_new.length()>0) { 
 }else {
 //BA.debugLineNum = 52;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil\")";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil")));
 };
 //BA.debugLineNum = 55;BA.debugLine="clvOrders.Clear";
_clvorders._clear();
 //BA.debugLineNum = 57;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 58;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 59;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 61;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 62;BA.debugLine="OD.Initialize";
_od.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 64;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 65;BA.debugLine="OD.Customer = Starter.SelectCustomer(OD.CODCLIE";
_od.Customer /*String*/  = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_od.CODCLIENTE /*int*/ ).NOMBRE /*String*/ ;
 //BA.debugLineNum = 66;BA.debugLine="OD.CODVENDEDOR = rs.GetString(\"CODVENDEDOR\")";
_od.CODVENDEDOR /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODVENDEDOR")));
 //BA.debugLineNum = 67;BA.debugLine="OD.FECHA = rs.GetString(\"FECHA\")";
_od.FECHA /*String*/  = _rs.GetString("FECHA");
 //BA.debugLineNum = 68;BA.debugLine="OD.COMENTARIOS = rs.GetString(\"COMENTARIOS\")";
_od.COMENTARIOS /*String*/  = _rs.GetString("COMENTARIOS");
 //BA.debugLineNum = 70;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 71;BA.debugLine="Buffer = rs.GetBlob(\"FIRMA\")";
_buffer = _rs.GetBlob("FIRMA");
 //BA.debugLineNum = 72;BA.debugLine="If Buffer = Null Then";
if (_buffer== null) { 
 //BA.debugLineNum = 73;BA.debugLine="OD.FIRMA = Null";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 }else {
 //BA.debugLineNum = 75;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 76;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 77;BA.debugLine="OD.FIRMA.Initialize2(InputStream1)";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(_inputstream1.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
 };
 //BA.debugLineNum = 81;BA.debugLine="OD.NROPEDIDO = rs.GetString(\"NROPEDIDO\")";
_od.NROPEDIDO /*String*/  = _rs.GetString("NROPEDIDO");
 //BA.debugLineNum = 82;BA.debugLine="OD.QUIENRECIBIO = rs.GetString(\"QUIENRECIBIO\")";
_od.QUIENRECIBIO /*String*/  = _rs.GetString("QUIENRECIBIO");
 //BA.debugLineNum = 83;BA.debugLine="OD.TotalOrder = sql.ExecQuerySingleResult(\"SELE";
_od.TotalOrder /*String*/  = _sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO="+BA.NumberToString(_od.ID /*int*/ ));
 //BA.debugLineNum = 85;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 86;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 87;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvOrders.AsView.W";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvorders._asview().getWidth(),__c.DipToCurrent((int) (52)));
 //BA.debugLineNum = 88;BA.debugLine="clvOrders.Add(p, OD)";
_clvorders._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_od));
 }
;
 };
 //BA.debugLineNum = 93;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
