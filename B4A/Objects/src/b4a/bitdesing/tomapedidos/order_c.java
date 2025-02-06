package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class order_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.order_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.order_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.sql.SQL _sql = null;
public anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _ftxtorderid = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _ftxtcustomername = null;
public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hsvitems = null;
public String _ftxtcoment = "";
public b4a.example3.customlistview _clvitems = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblquantity = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblproduct = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpriceproduct = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbloffproduct = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpriceitem = null;
public b4a.bitdesing.tomapedidos.b4xdialog _dialog = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtquantity = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtprecio = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtoff = null;
public b4a.bitdesing.tomapedidos.b4xfloattextfield _txtcomentario = null;
public b4a.bitdesing.tomapedidos.orders_c._ordersdata _order = null;
public String _quienrecibe = "";
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _firma = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _itemsdata{
public boolean IsInitialized;
public int ID;
public int IDPEDIDO;
public int CANTIDAD;
public int CODARTICULO;
public String ProductName;
public double PRECIO;
public double IMPORTE;
public String PORDTO;
public String COMENTARIO;
public void Initialize() {
IsInitialized = true;
ID = 0;
IDPEDIDO = 0;
CANTIDAD = 0;
CODARTICULO = 0;
ProductName = "";
PRECIO = 0;
IMPORTE = 0;
PORDTO = "";
COMENTARIO = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 82;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 83;BA.debugLine="If dialog.Close(xui.DialogResponse_Cancel) Then";
if (_dialog._close /*boolean*/ (_xui.DialogResponse_Cancel)) { 
if (true) return __c.True;};
 };
 //BA.debugLineNum = 85;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return false;
}
public String  _b4xpage_appear() throws Exception{
b4a.bitdesing.tomapedidos.products_c _products_page = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 73;BA.debugLine="txtSearch_TextChanged(\"\", \"\", Order)";
_txtsearch_textchanged("","",_order);
 //BA.debugLineNum = 74;BA.debugLine="B4XPages.SetTitle(Me, \"Pedido nro: \" & Order.ID)";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Pedido nro: "+BA.NumberToString(_order.ID /*int*/ )));
 //BA.debugLineNum = 77;BA.debugLine="Dim products_page As products_c = B4XPages.GetPag";
_products_page = (b4a.bitdesing.tomapedidos.products_c)(_b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 78;BA.debugLine="products_page.CallOf = \"\"";
_products_page._callof /*String*/  = "";
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem _additem = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 47;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 48;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 49;BA.debugLine="Root.LoadLayout(\"order_layout\")";
_root.LoadLayout("order_layout",ba);
 //BA.debugLineNum = 50;BA.debugLine="Log(\"create order page\")";
__c.LogImpl("533751043","create order page",0);
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.SetTitle(Me, \"Pedido\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Pedido"));
 //BA.debugLineNum = 54;BA.debugLine="B4XPages.AddMenuItem(Me, \"Recibe\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Recibe"));
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.AddMenuItem(Me, \"Comentarios\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Comentarios"));
 //BA.debugLineNum = 56;BA.debugLine="B4XPages.AddMenuItem(Me, \"Firma\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Firma"));
 //BA.debugLineNum = 57;BA.debugLine="Dim addItem As B4AMenuItem = B4XPages.AddMenuItem";
_additem = _b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Agregar"));
 //BA.debugLineNum = 58;BA.debugLine="addItem.AddToBar = True";
_additem.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 63;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 64;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 65;BA.debugLine="p.SetLayoutAnimated(100, 0 , 0, 190%x, hsvItems.H";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (190),ba),_hsvitems.getHeight());
 //BA.debugLineNum = 66;BA.debugLine="p.LoadLayout(\"order_list_items_layout\")";
_p.LoadLayout("order_list_items_layout",ba);
 //BA.debugLineNum = 67;BA.debugLine="hsvItems.Panel.AddView(p, 0, 0, 200%x, 100%y)";
_hsvitems.getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (200),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 68;BA.debugLine="hsvItems.Panel.Width = 200%x";
_hsvitems.getPanel().setWidth(__c.PerXToCurrent((float) (200),ba));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_menuclick(String _tag) throws Exception{
ResumableSub_b4xpage_MenuClick rsub = new ResumableSub_b4xpage_MenuClick(this,_tag);
rsub.resume(ba, null);
}
public static class ResumableSub_b4xpage_MenuClick extends BA.ResumableSub {
public ResumableSub_b4xpage_MenuClick(b4a.bitdesing.tomapedidos.order_c parent,String _tag) {
this.parent = parent;
this._tag = _tag;
}
b4a.bitdesing.tomapedidos.order_c parent;
String _tag;
b4a.bitdesing.tomapedidos.products_c _products_page = null;
b4a.bitdesing.tomapedidos.b4xinputtemplate _input = null;
int _result = 0;
b4a.bitdesing.tomapedidos.b4xsignaturetemplate _signature = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _outputstream1 = null;
byte[] _buffer = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 189;BA.debugLine="If Tag = \"Agregar\" Then";
if (true) break;

case 1:
//if
this.state = 29;
if ((_tag).equals("Agregar")) { 
this.state = 3;
}else if((_tag).equals("Recibe")) { 
this.state = 5;
}else if((_tag).equals("Comentarios")) { 
this.state = 11;
}else if((_tag).equals("Firma")) { 
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 29;
 //BA.debugLineNum = 191;BA.debugLine="Dim products_page As products_c = B4XPages.GetPa";
_products_page = (b4a.bitdesing.tomapedidos.products_c)(parent._b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 192;BA.debugLine="products_page.CallOf = \"order_page\"";
_products_page._callof /*String*/  = "order_page";
 //BA.debugLineNum = 193;BA.debugLine="products_page.Order = Order";
_products_page._order /*b4a.bitdesing.tomapedidos.orders_c._ordersdata*/  = parent._order;
 //BA.debugLineNum = 195;BA.debugLine="B4XPages.ShowPage(\"products_page\")";
parent._b4xpages._showpage /*String*/ (ba,"products_page");
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 199;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 200;BA.debugLine="dialog.Title = \"Recibe\"";
parent._dialog._title /*Object*/  = (Object)("Recibe");
 //BA.debugLineNum = 202;BA.debugLine="Dim input As B4XInputTemplate";
_input = new b4a.bitdesing.tomapedidos.b4xinputtemplate();
 //BA.debugLineNum = 203;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (ba);
 //BA.debugLineNum = 204;BA.debugLine="input.lblTitle.Text = \"Recibe el pedido\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Recibe el pedido"));
 //BA.debugLineNum = 205;BA.debugLine="input.Text = QuienRecibe";
_input._text /*String*/  = parent._quienrecibe;
 //BA.debugLineNum = 206;BA.debugLine="input.mBase.Width = 90%x";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (90),ba));
 //BA.debugLineNum = 207;BA.debugLine="input.TextField1.Width = 85%x";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (85),ba));
 //BA.debugLineNum = 208;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 6;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 209;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 210;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 211;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET QUIENRE";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET QUIENRECIBIO=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_input._text /*String*/ ,parent._ftxtorderid._gettext /*String*/ ()}));
 //BA.debugLineNum = 214;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 9:
//C
this.state = 29;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 219;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 220;BA.debugLine="dialog.Title = \"Comentarios\"";
parent._dialog._title /*Object*/  = (Object)("Comentarios");
 //BA.debugLineNum = 222;BA.debugLine="Dim input As B4XInputTemplate";
_input = new b4a.bitdesing.tomapedidos.b4xinputtemplate();
 //BA.debugLineNum = 223;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (ba);
 //BA.debugLineNum = 224;BA.debugLine="input.lblTitle.Text = \"Comentarios\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Comentarios"));
 //BA.debugLineNum = 225;BA.debugLine="input.Text = ftxtComent";
_input._text /*String*/  = parent._ftxtcoment;
 //BA.debugLineNum = 226;BA.debugLine="input.mBase.Width = 90%x";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (90),ba));
 //BA.debugLineNum = 227;BA.debugLine="input.mBase.Height = 140dip";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(parent.__c.DipToCurrent((int) (140)));
 //BA.debugLineNum = 228;BA.debugLine="input.TextField1.Width = 85%x";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (85),ba));
 //BA.debugLineNum = 229;BA.debugLine="input.TextField1.Height = 80dip";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(parent.__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 230;BA.debugLine="input.TextField1.SetTextAlignment(\"TOP\", \"LEFT\")";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("TOP","LEFT");
 //BA.debugLineNum = 231;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 31;
return;
case 31:
//C
this.state = 12;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 232;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 233;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 234;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET COMENTA";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET COMENTARIOS=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_input._text /*String*/ ,parent._ftxtorderid._gettext /*String*/ ()}));
 //BA.debugLineNum = 237;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 15:
//C
this.state = 29;
;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 242;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 243;BA.debugLine="dialog.Title = \"Firma\"";
parent._dialog._title /*Object*/  = (Object)("Firma");
 //BA.debugLineNum = 245;BA.debugLine="Dim signature As B4XSignatureTemplate";
_signature = new b4a.bitdesing.tomapedidos.b4xsignaturetemplate();
 //BA.debugLineNum = 246;BA.debugLine="signature.Initialize";
_signature._initialize /*String*/ (ba);
 //BA.debugLineNum = 251;BA.debugLine="If Firma.IsInitialized Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent._firma.IsInitialized()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
 //BA.debugLineNum = 252;BA.debugLine="Log(\"firma ok\")";
parent.__c.LogImpl("534078784","firma ok",0);
 //BA.debugLineNum = 253;BA.debugLine="signature.mBase.SetBitmap(Firma)";
_signature._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(parent._firma.getObject()));
 //BA.debugLineNum = 254;BA.debugLine="Wait For (dialog.ShowTemplate(signature, \"\", \"B";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_signature),(Object)(""),(Object)("BORRAR"),(Object)("CANCEL")));
this.state = 32;
return;
case 32:
//C
this.state = 23;
_result = (Integer) result[0];
;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 257;BA.debugLine="Wait For (dialog.ShowTemplate(signature, \"OK\",";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_signature),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 33;
return;
case 33:
//C
this.state = 23;
_result = (Integer) result[0];
;
 if (true) break;
;
 //BA.debugLineNum = 261;BA.debugLine="If Result = xui.DialogResponse_Positive Then";

case 23:
//if
this.state = 28;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 25;
}else if(_result==parent._xui.DialogResponse_Negative) { 
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 264;BA.debugLine="Dim OutputStream1 As OutputStream";
_outputstream1 = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 265;BA.debugLine="OutputStream1.InitializeToBytesArray(1000)";
_outputstream1.InitializeToBytesArray((int) (1000));
 //BA.debugLineNum = 266;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 267;BA.debugLine="signature.Bitmap.WriteToStream(OutputStream1, 9";
_signature._getbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ().WriteToStream((java.io.OutputStream)(_outputstream1.getObject()),(int) (90),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 268;BA.debugLine="Buffer = OutputStream1.ToBytesArray";
_buffer = _outputstream1.ToBytesArray();
 //BA.debugLineNum = 270;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 271;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET FIRMA=?";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_buffer),(Object)(parent._ftxtorderid._gettext /*String*/ ())}));
 //BA.debugLineNum = 274;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 277;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 278;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET FIRMA=?";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{parent.__c.Null,(Object)(parent._ftxtorderid._gettext /*String*/ ())}));
 //BA.debugLineNum = 281;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 //BA.debugLineNum = 282;BA.debugLine="b4xpage_MenuClick(\"Firma\")";
parent._b4xpage_menuclick("Firma");
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _btnaddproduct_click() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Private Sub btnAddProduct_Click";
 //BA.debugLineNum = 347;BA.debugLine="b4xpage_MenuClick(\"Agregar\")";
_b4xpage_menuclick("Agregar");
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Type ItemsData (ID As Int, IDPEDIDO As Int, CANTI";
;
 //BA.debugLineNum = 11;BA.debugLine="Private ftxtOrderId As B4XFloatTextField";
_ftxtorderid = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 12;BA.debugLine="Private ftxtCustomerName As B4XFloatTextField";
_ftxtcustomername = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 13;BA.debugLine="Private hsvItems As HorizontalScrollView";
_hsvitems = new anywheresoftware.b4a.objects.HorizontalScrollViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private ftxtComent As String";
_ftxtcoment = "";
 //BA.debugLineNum = 17;BA.debugLine="Private clvItems As CustomListView";
_clvitems = new b4a.example3.customlistview();
 //BA.debugLineNum = 20;BA.debugLine="Private lblQuantity As Label";
_lblquantity = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private lblProduct As Label";
_lblproduct = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private lblPriceProduct As Label";
_lblpriceproduct = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private lblOffProduct As Label";
_lbloffproduct = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private lblPriceItem As Label";
_lblpriceitem = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4a.bitdesing.tomapedidos.b4xdialog();
 //BA.debugLineNum = 28;BA.debugLine="Private txtQuantity As B4XFloatTextField";
_txtquantity = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 29;BA.debugLine="Private txtPrecio As B4XFloatTextField";
_txtprecio = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 30;BA.debugLine="Private txtOff As B4XFloatTextField";
_txtoff = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 31;BA.debugLine="Private txtComentario As B4XFloatTextField";
_txtcomentario = new b4a.bitdesing.tomapedidos.b4xfloattextfield();
 //BA.debugLineNum = 34;BA.debugLine="Public Order As OrdersData";
_order = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 35;BA.debugLine="Public QuienRecibe As String";
_quienrecibe = "";
 //BA.debugLineNum = 36;BA.debugLine="Public Firma As Bitmap";
_firma = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public void  _clvitems_itemclick(int _index,Object _value) throws Exception{
ResumableSub_clvItems_ItemClick rsub = new ResumableSub_clvItems_ItemClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_clvItems_ItemClick extends BA.ResumableSub {
public ResumableSub_clvItems_ItemClick(b4a.bitdesing.tomapedidos.order_c parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.bitdesing.tomapedidos.order_c parent;
int _index;
Object _value;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
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
 //BA.debugLineNum = 313;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 314;BA.debugLine="dialog.Title = \"Editar item\"";
parent._dialog._title /*Object*/  = (Object)("Editar item");
 //BA.debugLineNum = 316;BA.debugLine="dialog.BackgroundColor = Colors.White";
parent._dialog._backgroundcolor /*int*/  = parent.__c.Colors.White;
 //BA.debugLineNum = 317;BA.debugLine="dialog.ButtonsColor = Colors.Transparent";
parent._dialog._buttonscolor /*int*/  = parent.__c.Colors.Transparent;
 //BA.debugLineNum = 318;BA.debugLine="dialog.ButtonsTextColor = Colors.Black";
parent._dialog._buttonstextcolor /*int*/  = parent.__c.Colors.Black;
 //BA.debugLineNum = 320;BA.debugLine="Dim ID As ItemsData = Value";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_value);
 //BA.debugLineNum = 322;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 323;BA.debugLine="p.SetLayoutAnimated(0, 60dip, 0, Root.Width - 60d";
_p.SetLayoutAnimated((int) (0),parent.__c.DipToCurrent((int) (60)),(int) (0),(int) (parent._root.getWidth()-parent.__c.DipToCurrent((int) (60))),parent.__c.DipToCurrent((int) (320)));
 //BA.debugLineNum = 324;BA.debugLine="p.LoadLayout(\"products_add_order_item_layout\")";
_p.LoadLayout("products_add_order_item_layout",ba);
 //BA.debugLineNum = 325;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
parent._dialog._putattop /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 327;BA.debugLine="txtQuantity.Text = ID.CANTIDAD";
parent._txtquantity._settext /*String*/ (BA.NumberToString(_id.CANTIDAD /*int*/ ));
 //BA.debugLineNum = 328;BA.debugLine="txtPrecio.Text = ID.PRECIO";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_id.PRECIO /*double*/ ));
 //BA.debugLineNum = 329;BA.debugLine="txtOff.Text = ID.PORDTO";
parent._txtoff._settext /*String*/ (_id.PORDTO /*String*/ );
 //BA.debugLineNum = 330;BA.debugLine="txtComentario.Text = ID.COMENTARIO";
parent._txtcomentario._settext /*String*/ (_id.COMENTARIO /*String*/ );
 //BA.debugLineNum = 332;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 333;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 334;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 335;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedDMovil SET CANTIDAD";
parent._sql.ExecNonQuery2("UPDATE PedDMovil SET CANTIDAD=?, PRECIO=?, IMPORTE=?, PORDTO=?, COMENTARIO=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{parent._txtquantity._gettext /*String*/ (),parent._txtprecio._gettext /*String*/ (),BA.NumberToString((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))-((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtoff._gettext /*String*/ ()))/(double)100)),parent._txtoff._gettext /*String*/ (),parent._txtcomentario._gettext /*String*/ (),BA.NumberToString(_id.ID /*int*/ )}));
 //BA.debugLineNum = 338;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _clvitems_itemlongclick(int _index,Object _value) throws Exception{
ResumableSub_clvItems_ItemLongClick rsub = new ResumableSub_clvItems_ItemLongClick(this,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_clvItems_ItemLongClick extends BA.ResumableSub {
public ResumableSub_clvItems_ItemLongClick(b4a.bitdesing.tomapedidos.order_c parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
b4a.bitdesing.tomapedidos.order_c parent;
int _index;
Object _value;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
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
 //BA.debugLineNum = 292;BA.debugLine="Dim ID As ItemsData = Value";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_value);
 //BA.debugLineNum = 294;BA.debugLine="Msgbox2Async(\"¿Estás seguro de que deseas quitar";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("¿Estás seguro de que deseas quitar el item?"),BA.ObjectToCharSequence("Confirmación"),"Sí","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
 //BA.debugLineNum = 295;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 297;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 298;BA.debugLine="Log(\"El usuario eligió Sí.\")";
parent.__c.LogImpl("534144264","El usuario eligió Sí.",0);
 //BA.debugLineNum = 299;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 300;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM PedDMovil WHERE ID";
parent._sql.ExecNonQuery("DELETE FROM PedDMovil WHERE ID="+BA.NumberToString(_id.ID /*int*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 302;BA.debugLine="Log(\"El usuario eligió No.\")";
parent.__c.LogImpl("534144268","El usuario eligió No.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 306;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 //BA.debugLineNum = 308;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _clvitems_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _extra = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
 //BA.debugLineNum = 164;BA.debugLine="Private Sub clvItems_VisibleRangeChanged (FirstInd";
 //BA.debugLineNum = 166;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 167;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvitems._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 168;BA.debugLine="Dim p As Panel = clvItems.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvitems._getpanel(_i).getObject()));
 //BA.debugLineNum = 169;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 170;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 171;BA.debugLine="Dim ID As ItemsData = clvItems.GetValue(i)";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_clvitems._getvalue(_i));
 //BA.debugLineNum = 172;BA.debugLine="p.LoadLayout(\"order_product_item_layout\")";
_p.LoadLayout("order_product_item_layout",ba);
 //BA.debugLineNum = 173;BA.debugLine="lblQuantity.Text = ID.CANTIDAD";
_lblquantity.setText(BA.ObjectToCharSequence(_id.CANTIDAD /*int*/ ));
 //BA.debugLineNum = 174;BA.debugLine="lblProduct.Text = ID.ProductName";
_lblproduct.setText(BA.ObjectToCharSequence(_id.ProductName /*String*/ ));
 //BA.debugLineNum = 175;BA.debugLine="lblPriceProduct.Text = \"$ \" & ID.PRECIO";
_lblpriceproduct.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_id.PRECIO /*double*/ )));
 //BA.debugLineNum = 176;BA.debugLine="lblOffProduct.Text = ID.PORDTO & \" %\"";
_lbloffproduct.setText(BA.ObjectToCharSequence(_id.PORDTO /*String*/ +" %"));
 //BA.debugLineNum = 177;BA.debugLine="lblPriceItem.Text = \"$ \" & ID.IMPORTE";
_lblpriceitem.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_id.IMPORTE /*double*/ )));
 };
 }else {
 //BA.debugLineNum = 180;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 181;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public String  _txtsearch_textchanged(String _old,String _new,b4a.bitdesing.tomapedidos.orders_c._ordersdata _od) throws Exception{
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 88;BA.debugLine="Private Sub txtSearch_TextChanged (Old As String,";
 //BA.debugLineNum = 90;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 91;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil WHERE (ID = "+BA.NumberToString(_od.ID /*int*/ )+")")));
 //BA.debugLineNum = 92;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 93;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 95;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 96;BA.debugLine="OD.Initialize";
_od.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 98;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 99;BA.debugLine="OD.Customer = Starter.SelectCustomer(OD.CODCLIE";
_od.Customer /*String*/  = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_od.CODCLIENTE /*int*/ ).NOMBRE /*String*/ ;
 //BA.debugLineNum = 100;BA.debugLine="OD.CODVENDEDOR = rs.GetString(\"CODVENDEDOR\")";
_od.CODVENDEDOR /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODVENDEDOR")));
 //BA.debugLineNum = 101;BA.debugLine="OD.FECHA = rs.GetString(\"FECHA\")";
_od.FECHA /*String*/  = _rs.GetString("FECHA");
 //BA.debugLineNum = 102;BA.debugLine="OD.COMENTARIOS = rs.GetString(\"COMENTARIOS\")";
_od.COMENTARIOS /*String*/  = _rs.GetString("COMENTARIOS");
 //BA.debugLineNum = 104;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 105;BA.debugLine="Buffer = rs.GetBlob(\"FIRMA\")";
_buffer = _rs.GetBlob("FIRMA");
 //BA.debugLineNum = 106;BA.debugLine="If Buffer = Null Then";
if (_buffer== null) { 
 //BA.debugLineNum = 107;BA.debugLine="OD.FIRMA = Null";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 }else {
 //BA.debugLineNum = 109;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 110;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 111;BA.debugLine="OD.FIRMA.Initialize2(InputStream1)";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(_inputstream1.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
 };
 //BA.debugLineNum = 115;BA.debugLine="OD.NROPEDIDO = rs.GetString(\"NROPEDIDO\")";
_od.NROPEDIDO /*String*/  = _rs.GetString("NROPEDIDO");
 //BA.debugLineNum = 116;BA.debugLine="OD.QUIENRECIBIO = rs.GetString(\"QUIENRECIBIO\")";
_od.QUIENRECIBIO /*String*/  = _rs.GetString("QUIENRECIBIO");
 //BA.debugLineNum = 117;BA.debugLine="OD.TotalOrder = sql.ExecQuerySingleResult(\"SELE";
_od.TotalOrder /*String*/  = _sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO="+BA.NumberToString(_od.ID /*int*/ ));
 }
;
 };
 //BA.debugLineNum = 121;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 123;BA.debugLine="ftxtOrderId.Text = OD.ID";
_ftxtorderid._settext /*String*/ (BA.NumberToString(_od.ID /*int*/ ));
 //BA.debugLineNum = 124;BA.debugLine="ftxtOrderId.TextField.Enabled = False";
_ftxtorderid._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setEnabled(__c.False);
 //BA.debugLineNum = 125;BA.debugLine="ftxtCustomerName.Text = OD.Customer";
_ftxtcustomername._settext /*String*/ (_od.Customer /*String*/ );
 //BA.debugLineNum = 126;BA.debugLine="ftxtCustomerName.TextField.Enabled = False";
_ftxtcustomername._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setEnabled(__c.False);
 //BA.debugLineNum = 127;BA.debugLine="ftxtComent = OD.COMENTARIOS";
_ftxtcoment = _od.COMENTARIOS /*String*/ ;
 //BA.debugLineNum = 128;BA.debugLine="QuienRecibe = OD.QUIENRECIBIO";
_quienrecibe = _od.QUIENRECIBIO /*String*/ ;
 //BA.debugLineNum = 129;BA.debugLine="Firma = OD.FIRMA";
_firma = _od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ;
 //BA.debugLineNum = 132;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 134;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedDMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedDMovil WHERE (IDPEDIDO = "+BA.NumberToString(_od.ID /*int*/ )+")")));
 //BA.debugLineNum = 136;BA.debugLine="clvItems.Clear";
_clvitems._clear();
 //BA.debugLineNum = 138;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 139;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 140;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 142;BA.debugLine="Dim ID As ItemsData";
_id = new b4a.bitdesing.tomapedidos.order_c._itemsdata();
 //BA.debugLineNum = 143;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="ID.ID = rs.GetString(\"ID\")";
_id.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 145;BA.debugLine="ID.CODARTICULO = rs.GetString(\"CODARTICULO\")";
_id.CODARTICULO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODARTICULO")));
 //BA.debugLineNum = 146;BA.debugLine="ID.ProductName = Starter.SelectProduct(ID.CODAR";
_id.ProductName /*String*/  = _starter._selectproduct /*b4a.bitdesing.tomapedidos.products_c._productsdata*/ (_id.CODARTICULO /*int*/ ).DESCRIPCION /*String*/ ;
 //BA.debugLineNum = 147;BA.debugLine="ID.CANTIDAD = rs.GetString(\"CANTIDAD\")";
_id.CANTIDAD /*int*/  = (int)(Double.parseDouble(_rs.GetString("CANTIDAD")));
 //BA.debugLineNum = 148;BA.debugLine="ID.PRECIO = rs.GetString(\"PRECIO\")";
_id.PRECIO /*double*/  = (double)(Double.parseDouble(_rs.GetString("PRECIO")));
 //BA.debugLineNum = 149;BA.debugLine="ID.IMPORTE = rs.GetString(\"IMPORTE\")";
_id.IMPORTE /*double*/  = (double)(Double.parseDouble(_rs.GetString("IMPORTE")));
 //BA.debugLineNum = 150;BA.debugLine="ID.PORDTO = rs.GetString(\"PORDTO\")";
_id.PORDTO /*String*/  = _rs.GetString("PORDTO");
 //BA.debugLineNum = 152;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 153;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 154;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvItems.AsView.Wi";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvitems._asview().getWidth(),__c.DipToCurrent((int) (52)));
 //BA.debugLineNum = 155;BA.debugLine="clvItems.Add(p, ID)";
_clvitems._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_id));
 }
;
 };
 //BA.debugLineNum = 160;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
