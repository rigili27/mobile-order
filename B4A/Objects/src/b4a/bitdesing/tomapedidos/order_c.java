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
public anywheresoftware.b4a.phone.Phone _phone = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.httputils2service _httputils2service = null;
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
 //BA.debugLineNum = 86;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 87;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 88;BA.debugLine="If dialog.Close(xui.DialogResponse_Cancel) Then";
if (_dialog._close /*boolean*/ (_xui.DialogResponse_Cancel)) { 
if (true) return __c.True;};
 };
 //BA.debugLineNum = 90;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return false;
}
public String  _b4xpage_appear() throws Exception{
b4a.bitdesing.tomapedidos.products_c _products_page = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 78;BA.debugLine="txtSearch_TextChanged(\"\", \"\", Order)";
_txtsearch_textchanged("","",_order);
 //BA.debugLineNum = 79;BA.debugLine="B4XPages.SetTitle(Me, \"Pedido nro: \" & Order.ID)";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Pedido nro: "+BA.NumberToString(_order.ID /*int*/ )));
 //BA.debugLineNum = 82;BA.debugLine="Dim products_page As products_c = B4XPages.GetPag";
_products_page = (b4a.bitdesing.tomapedidos.products_c)(_b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 83;BA.debugLine="products_page.CallOf = \"\"";
_products_page._callof /*String*/  = "";
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem _additem = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 49;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 50;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 51;BA.debugLine="Root.LoadLayout(\"order_layout\")";
_root.LoadLayout("order_layout",ba);
 //BA.debugLineNum = 52;BA.debugLine="Log(\"create order page\")";
__c.LogImpl("06225923","create order page",0);
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.SetTitle(Me, \"Pedido\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Pedido"));
 //BA.debugLineNum = 56;BA.debugLine="B4XPages.AddMenuItem(Me, \"Recibe\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Recibe"));
 //BA.debugLineNum = 57;BA.debugLine="B4XPages.AddMenuItem(Me, \"Comentarios\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Comentarios"));
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.AddMenuItem(Me, \"Firma\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Firma"));
 //BA.debugLineNum = 60;BA.debugLine="B4XPages.AddMenuItem(Me, \"Ver remito\")";
_b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Ver remito"));
 //BA.debugLineNum = 62;BA.debugLine="Dim addItem As B4AMenuItem = B4XPages.AddMenuItem";
_additem = _b4xpages._addmenuitem /*b4a.bitdesing.tomapedidos.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Agregar"));
 //BA.debugLineNum = 63;BA.debugLine="addItem.AddToBar = True";
_additem.AddToBar /*boolean*/  = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 70;BA.debugLine="p.SetLayoutAnimated(100, 0 , 0, 190%x, hsvItems.H";
_p.SetLayoutAnimated((int) (100),(int) (0),(int) (0),__c.PerXToCurrent((float) (190),ba),_hsvitems.getHeight());
 //BA.debugLineNum = 71;BA.debugLine="p.LoadLayout(\"order_list_items_layout\")";
_p.LoadLayout("order_list_items_layout",ba);
 //BA.debugLineNum = 72;BA.debugLine="hsvItems.Panel.AddView(p, 0, 0, 200%x, 100%y)";
_hsvitems.getPanel().AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (200),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 73;BA.debugLine="hsvItems.Panel.Width = 200%x";
_hsvitems.getPanel().setWidth(__c.PerXToCurrent((float) (200),ba));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 194;BA.debugLine="If Tag = \"Agregar\" Then";
if (true) break;

case 1:
//if
this.state = 31;
if ((_tag).equals("Agregar")) { 
this.state = 3;
}else if((_tag).equals("Recibe")) { 
this.state = 5;
}else if((_tag).equals("Comentarios")) { 
this.state = 11;
}else if((_tag).equals("Firma")) { 
this.state = 17;
}else if((_tag).equals("Ver remito")) { 
this.state = 30;
}if (true) break;

case 3:
//C
this.state = 31;
 //BA.debugLineNum = 196;BA.debugLine="Dim products_page As products_c = B4XPages.GetPa";
_products_page = (b4a.bitdesing.tomapedidos.products_c)(parent._b4xpages._getpage /*Object*/ (ba,"products_page"));
 //BA.debugLineNum = 197;BA.debugLine="products_page.CallOf = \"order_page\"";
_products_page._callof /*String*/  = "order_page";
 //BA.debugLineNum = 198;BA.debugLine="products_page.Order = Order";
_products_page._order /*b4a.bitdesing.tomapedidos.orders_c._ordersdata*/  = parent._order;
 //BA.debugLineNum = 200;BA.debugLine="B4XPages.ShowPage(\"products_page\")";
parent._b4xpages._showpage /*String*/ (ba,"products_page");
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 204;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 205;BA.debugLine="dialog.Title = \"Recibe\"";
parent._dialog._title /*Object*/  = (Object)("Recibe");
 //BA.debugLineNum = 207;BA.debugLine="Dim input As B4XInputTemplate";
_input = new b4a.bitdesing.tomapedidos.b4xinputtemplate();
 //BA.debugLineNum = 208;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (ba);
 //BA.debugLineNum = 209;BA.debugLine="input.lblTitle.Text = \"Recibe el pedido\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Recibe el pedido"));
 //BA.debugLineNum = 210;BA.debugLine="input.Text = QuienRecibe";
_input._text /*String*/  = parent._quienrecibe;
 //BA.debugLineNum = 211;BA.debugLine="input.mBase.Width = 90%x";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (90),ba));
 //BA.debugLineNum = 212;BA.debugLine="input.TextField1.Width = 85%x";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (85),ba));
 //BA.debugLineNum = 213;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 32;
return;
case 32:
//C
this.state = 6;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 214;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 215;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 216;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET QUIENRE";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET QUIENRECIBIO=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_input._text /*String*/ ,parent._ftxtorderid._gettext /*String*/ ()}));
 //BA.debugLineNum = 219;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 9:
//C
this.state = 31;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 224;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 225;BA.debugLine="dialog.Title = \"Comentarios\"";
parent._dialog._title /*Object*/  = (Object)("Comentarios");
 //BA.debugLineNum = 227;BA.debugLine="Dim input As B4XInputTemplate";
_input = new b4a.bitdesing.tomapedidos.b4xinputtemplate();
 //BA.debugLineNum = 228;BA.debugLine="input.Initialize";
_input._initialize /*String*/ (ba);
 //BA.debugLineNum = 229;BA.debugLine="input.lblTitle.Text = \"Comentarios\"";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Comentarios"));
 //BA.debugLineNum = 230;BA.debugLine="input.Text = ftxtComent";
_input._text /*String*/  = parent._ftxtcoment;
 //BA.debugLineNum = 231;BA.debugLine="input.mBase.Width = 90%x";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (90),ba));
 //BA.debugLineNum = 232;BA.debugLine="input.mBase.Height = 140dip";
_input._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(parent.__c.DipToCurrent((int) (140)));
 //BA.debugLineNum = 233;BA.debugLine="input.TextField1.Width = 85%x";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.PerXToCurrent((float) (85),ba));
 //BA.debugLineNum = 234;BA.debugLine="input.TextField1.Height = 80dip";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(parent.__c.DipToCurrent((int) (80)));
 //BA.debugLineNum = 235;BA.debugLine="input.TextField1.SetTextAlignment(\"TOP\", \"LEFT\")";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("TOP","LEFT");
 //BA.debugLineNum = 236;BA.debugLine="Wait For (dialog.ShowTemplate(input, \"OK\", \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_input),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 33;
return;
case 33:
//C
this.state = 12;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 237;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 238;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 239;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET COMENTA";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET COMENTARIOS=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_input._text /*String*/ ,parent._ftxtorderid._gettext /*String*/ ()}));
 //BA.debugLineNum = 242;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 15:
//C
this.state = 31;
;
 if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 247;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 248;BA.debugLine="dialog.Title = \"Firma\"";
parent._dialog._title /*Object*/  = (Object)("Firma");
 //BA.debugLineNum = 250;BA.debugLine="Dim signature As B4XSignatureTemplate";
_signature = new b4a.bitdesing.tomapedidos.b4xsignaturetemplate();
 //BA.debugLineNum = 251;BA.debugLine="signature.Initialize";
_signature._initialize /*String*/ (ba);
 //BA.debugLineNum = 256;BA.debugLine="If Firma.IsInitialized Then";
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
 //BA.debugLineNum = 257;BA.debugLine="Log(\"firma ok\")";
parent.__c.LogImpl("06553664","firma ok",0);
 //BA.debugLineNum = 258;BA.debugLine="signature.mBase.SetBitmap(Firma)";
_signature._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(parent._firma.getObject()));
 //BA.debugLineNum = 259;BA.debugLine="Wait For (dialog.ShowTemplate(signature, \"\", \"B";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_signature),(Object)(""),(Object)("BORRAR"),(Object)("CANCEL")));
this.state = 34;
return;
case 34:
//C
this.state = 23;
_result = (Integer) result[0];
;
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 262;BA.debugLine="Wait For (dialog.ShowTemplate(signature, \"OK\",";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(_signature),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 35;
return;
case 35:
//C
this.state = 23;
_result = (Integer) result[0];
;
 if (true) break;
;
 //BA.debugLineNum = 266;BA.debugLine="If Result = xui.DialogResponse_Positive Then";

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
 //BA.debugLineNum = 269;BA.debugLine="Dim OutputStream1 As OutputStream";
_outputstream1 = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 270;BA.debugLine="OutputStream1.InitializeToBytesArray(1000)";
_outputstream1.InitializeToBytesArray((int) (1000));
 //BA.debugLineNum = 271;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 272;BA.debugLine="signature.Bitmap.WriteToStream(OutputStream1, 9";
_signature._getbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ().WriteToStream((java.io.OutputStream)(_outputstream1.getObject()),(int) (90),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 273;BA.debugLine="Buffer = OutputStream1.ToBytesArray";
_buffer = _outputstream1.ToBytesArray();
 //BA.debugLineNum = 275;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 276;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET FIRMA=?";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_buffer),(Object)(parent._ftxtorderid._gettext /*String*/ ())}));
 //BA.debugLineNum = 279;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 282;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 283;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedCMovil SET FIRMA=?";
parent._sql.ExecNonQuery2("UPDATE PedCMovil SET FIRMA=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{parent.__c.Null,(Object)(parent._ftxtorderid._gettext /*String*/ ())}));
 //BA.debugLineNum = 286;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 //BA.debugLineNum = 287;BA.debugLine="b4xpage_MenuClick(\"Firma\")";
parent._b4xpage_menuclick("Firma");
 if (true) break;

case 28:
//C
this.state = 31;
;
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 293;BA.debugLine="CreateRemitoPDF(Order.ID)";
parent._createremitopdf(parent._order.ID /*int*/ );
 if (true) break;

case 31:
//C
this.state = -1;
;
 //BA.debugLineNum = 296;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _btnaddproduct_click() throws Exception{
 //BA.debugLineNum = 356;BA.debugLine="Private Sub btnAddProduct_Click";
 //BA.debugLineNum = 357;BA.debugLine="b4xpage_MenuClick(\"Agregar\")";
_b4xpage_menuclick("Agregar");
 //BA.debugLineNum = 358;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 38;BA.debugLine="Dim phone As Phone";
_phone = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 323;BA.debugLine="dialog.Initialize(Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 324;BA.debugLine="dialog.Title = \"Editar item\"";
parent._dialog._title /*Object*/  = (Object)("Editar item");
 //BA.debugLineNum = 326;BA.debugLine="dialog.BackgroundColor = Colors.White";
parent._dialog._backgroundcolor /*int*/  = parent.__c.Colors.White;
 //BA.debugLineNum = 327;BA.debugLine="dialog.ButtonsColor = Colors.Transparent";
parent._dialog._buttonscolor /*int*/  = parent.__c.Colors.Transparent;
 //BA.debugLineNum = 328;BA.debugLine="dialog.ButtonsTextColor = Colors.Black";
parent._dialog._buttonstextcolor /*int*/  = parent.__c.Colors.Black;
 //BA.debugLineNum = 330;BA.debugLine="Dim ID As ItemsData = Value";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_value);
 //BA.debugLineNum = 332;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 333;BA.debugLine="p.SetLayoutAnimated(0, 60dip, 0, Root.Width - 60d";
_p.SetLayoutAnimated((int) (0),parent.__c.DipToCurrent((int) (60)),(int) (0),(int) (parent._root.getWidth()-parent.__c.DipToCurrent((int) (60))),parent.__c.DipToCurrent((int) (320)));
 //BA.debugLineNum = 334;BA.debugLine="p.LoadLayout(\"products_add_order_item_layout\")";
_p.LoadLayout("products_add_order_item_layout",ba);
 //BA.debugLineNum = 335;BA.debugLine="dialog.PutAtTop = True 'put the dialog at the top";
parent._dialog._putattop /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 337;BA.debugLine="txtQuantity.Text = ID.CANTIDAD";
parent._txtquantity._settext /*String*/ (BA.NumberToString(_id.CANTIDAD /*int*/ ));
 //BA.debugLineNum = 338;BA.debugLine="txtPrecio.Text = ID.PRECIO";
parent._txtprecio._settext /*String*/ (BA.NumberToString(_id.PRECIO /*double*/ ));
 //BA.debugLineNum = 339;BA.debugLine="txtOff.Text = ID.PORDTO";
parent._txtoff._settext /*String*/ (_id.PORDTO /*String*/ );
 //BA.debugLineNum = 340;BA.debugLine="txtComentario.Text = ID.COMENTARIO";
parent._txtcomentario._settext /*String*/ (_id.COMENTARIO /*String*/ );
 //BA.debugLineNum = 342;BA.debugLine="Wait For (dialog.ShowCustom(p, \"OK\", \"\", \"CANCEL\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 343;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 344;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 345;BA.debugLine="sql.ExecNonQuery2(\"UPDATE PedDMovil SET CANTIDAD";
parent._sql.ExecNonQuery2("UPDATE PedDMovil SET CANTIDAD=?, PRECIO=?, IMPORTE=?, PORDTO=?, COMENTARIO=? WHERE ID=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{parent._txtquantity._gettext /*String*/ (),parent._txtprecio._gettext /*String*/ (),BA.NumberToString((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))-((double)(Double.parseDouble(parent._txtquantity._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtprecio._gettext /*String*/ ()))*(double)(Double.parseDouble(parent._txtoff._gettext /*String*/ ()))/(double)100)),parent._txtoff._gettext /*String*/ (),parent._txtcomentario._gettext /*String*/ (),BA.NumberToString(_id.ID /*int*/ )}));
 //BA.debugLineNum = 348;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 302;BA.debugLine="Dim ID As ItemsData = Value";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_value);
 //BA.debugLineNum = 304;BA.debugLine="Msgbox2Async(\"¿Estás seguro de que deseas quitar";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("¿Estás seguro de que deseas quitar el item?"),BA.ObjectToCharSequence("Confirmación"),"Sí","","No",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.True);
 //BA.debugLineNum = 305;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 307;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 308;BA.debugLine="Log(\"El usuario eligió Sí.\")";
parent.__c.LogImpl("06619144","El usuario eligió Sí.",0);
 //BA.debugLineNum = 309;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase,";
parent._sql.Initialize(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 310;BA.debugLine="sql.ExecNonQuery(\"DELETE FROM PedDMovil WHERE ID";
parent._sql.ExecNonQuery("DELETE FROM PedDMovil WHERE ID="+BA.NumberToString(_id.ID /*int*/ ));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 312;BA.debugLine="Log(\"El usuario eligió No.\")";
parent.__c.LogImpl("06619148","El usuario eligió No.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 316;BA.debugLine="B4XPage_Appear";
parent._b4xpage_appear();
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 169;BA.debugLine="Private Sub clvItems_VisibleRangeChanged (FirstInd";
 //BA.debugLineNum = 171;BA.debugLine="Dim extra As Int = 10";
_extra = (int) (10);
 //BA.debugLineNum = 172;BA.debugLine="For i = Max(0, FirstIndex - extra) To Min(LastInd";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extra,_clvitems._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extra)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 173;BA.debugLine="Dim p As Panel = clvItems.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clvitems._getpanel(_i).getObject()));
 //BA.debugLineNum = 174;BA.debugLine="If i > FirstIndex - extra And i < LastIndex + ex";
if (_i>_firstindex-_extra && _i<_lastindex+_extra) { 
 //BA.debugLineNum = 175;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 176;BA.debugLine="Dim ID As ItemsData = clvItems.GetValue(i)";
_id = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(_clvitems._getvalue(_i));
 //BA.debugLineNum = 177;BA.debugLine="p.LoadLayout(\"order_product_item_layout\")";
_p.LoadLayout("order_product_item_layout",ba);
 //BA.debugLineNum = 178;BA.debugLine="lblQuantity.Text = ID.CANTIDAD";
_lblquantity.setText(BA.ObjectToCharSequence(_id.CANTIDAD /*int*/ ));
 //BA.debugLineNum = 179;BA.debugLine="lblProduct.Text = ID.ProductName";
_lblproduct.setText(BA.ObjectToCharSequence(_id.ProductName /*String*/ ));
 //BA.debugLineNum = 180;BA.debugLine="lblPriceProduct.Text = \"$ \" & ID.PRECIO";
_lblpriceproduct.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_id.PRECIO /*double*/ )));
 //BA.debugLineNum = 181;BA.debugLine="lblOffProduct.Text = ID.PORDTO & \" %\"";
_lbloffproduct.setText(BA.ObjectToCharSequence(_id.PORDTO /*String*/ +" %"));
 //BA.debugLineNum = 182;BA.debugLine="lblPriceItem.Text = \"$ \" & ID.IMPORTE";
_lblpriceitem.setText(BA.ObjectToCharSequence("$ "+BA.NumberToString(_id.IMPORTE /*double*/ )));
 };
 }else {
 //BA.debugLineNum = 185;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 186;BA.debugLine="p.RemoveAllViews";
_p.RemoveAllViews();
 };
 };
 }
};
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public String  _createremitopdf(int _id) throws Exception{
anywheresoftware.b4a.objects.PdfDocumentWrapper _pdf = null;
int _pagewidth = 0;
int _pageheight = 0;
b4a.bitdesing.tomapedidos.orders_c._ordersdata _orderheader = null;
anywheresoftware.b4a.objects.collections.List _orderitems = null;
int _yposition = 0;
int _xmargin = 0;
int _linespace = 0;
float _fontsize = 0f;
int[] _colwidths = null;
int[] _colpositions = null;
int _currentx = 0;
int _i = 0;
String[] _headers = null;
b4a.bitdesing.tomapedidos.order_c._itemsdata _item = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rectfirma = null;
String _filename = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.IntentWrapper _intento = null;
Object _uri = null;
 //BA.debugLineNum = 367;BA.debugLine="Sub CreateRemitoPDF(id As Int)";
 //BA.debugLineNum = 368;BA.debugLine="Dim pdf As PdfDocument";
_pdf = new anywheresoftware.b4a.objects.PdfDocumentWrapper();
 //BA.debugLineNum = 369;BA.debugLine="pdf.Initialize";
_pdf.Initialize();
 //BA.debugLineNum = 372;BA.debugLine="Dim pageWidth As Int = 595";
_pagewidth = (int) (595);
 //BA.debugLineNum = 373;BA.debugLine="Dim pageHeight As Int = 842";
_pageheight = (int) (842);
 //BA.debugLineNum = 375;BA.debugLine="pdf.StartPage(pageWidth, pageHeight) ' A4";
_pdf.StartPage(_pagewidth,_pageheight);
 //BA.debugLineNum = 377;BA.debugLine="Dim orderHeader As OrdersData = GetOrderHeader(id";
_orderheader = _getorderheader(_id);
 //BA.debugLineNum = 378;BA.debugLine="Dim orderItems As List = GetOrderItems(id)";
_orderitems = new anywheresoftware.b4a.objects.collections.List();
_orderitems = _getorderitems(_id);
 //BA.debugLineNum = 381;BA.debugLine="Dim yPosition As Int = 50";
_yposition = (int) (50);
 //BA.debugLineNum = 382;BA.debugLine="Dim xMargin As Int = 40";
_xmargin = (int) (40);
 //BA.debugLineNum = 383;BA.debugLine="Dim lineSpace As Int = 20";
_linespace = (int) (20);
 //BA.debugLineNum = 384;BA.debugLine="Dim fontSize As Float";
_fontsize = 0f;
 //BA.debugLineNum = 386;BA.debugLine="If Starter.access.GetUserFontScale < 1 Then";
if (_starter._access /*anywheresoftware.b4a.objects.Accessibility.Accessibility2*/ .GetUserFontScale()<1) { 
 //BA.debugLineNum = 387;BA.debugLine="fontSize = 8";
_fontsize = (float) (8);
 }else if(_starter._access /*anywheresoftware.b4a.objects.Accessibility.Accessibility2*/ .GetUserFontScale()>1 && _starter._access /*anywheresoftware.b4a.objects.Accessibility.Accessibility2*/ .GetUserFontScale()<1.25) { 
 //BA.debugLineNum = 389;BA.debugLine="fontSize = 6";
_fontsize = (float) (6);
 }else if(_starter._access /*anywheresoftware.b4a.objects.Accessibility.Accessibility2*/ .GetUserFontScale()>1.25) { 
 //BA.debugLineNum = 391;BA.debugLine="fontSize = 5.2";
_fontsize = (float) (5.2);
 }else if(_starter._access /*anywheresoftware.b4a.objects.Accessibility.Accessibility2*/ .GetUserFontScale()==1) { 
 //BA.debugLineNum = 393;BA.debugLine="fontSize = 7";
_fontsize = (float) (7);
 };
 //BA.debugLineNum = 402;BA.debugLine="pdf.canvas.DrawText(\"\" & Starter.SelectBusiness.R";
_pdf.getCanvas().DrawText(ba,""+_starter._selectbusiness /*b4a.bitdesing.tomapedidos.starter._businessdata*/ ().RAZONSOCIAL /*String*/ ,(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 403;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 405;BA.debugLine="pdf.canvas.DrawText(\"CUIT: \" & Starter.SelectBusi";
_pdf.getCanvas().DrawText(ba,"CUIT: "+_starter._selectbusiness /*b4a.bitdesing.tomapedidos.starter._businessdata*/ ().NRCUIT /*String*/ ,(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 406;BA.debugLine="yPosition = yPosition + lineSpace * 2";
_yposition = (int) (_yposition+_linespace*2);
 //BA.debugLineNum = 408;BA.debugLine="pdf.canvas.DrawText(\"REMITO NRO: \" & orderHeader.";
_pdf.getCanvas().DrawText(ba,"REMITO NRO: "+BA.NumberToString(_orderheader.ID /*int*/ ),(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 409;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 411;BA.debugLine="pdf.canvas.DrawText(\"Cliente: \" & orderHeader.Cus";
_pdf.getCanvas().DrawText(ba,"Cliente: "+_orderheader.Customer /*String*/ +" (Cód: "+BA.NumberToString(_orderheader.CODCLIENTE /*int*/ )+")",(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 412;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 414;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
 //BA.debugLineNum = 415;BA.debugLine="pdf.Canvas.DrawText(\"Fecha: \" & DateTime.Date(ord";
_pdf.getCanvas().DrawText(ba,"Fecha: "+__c.DateTime.Date((long)(Double.parseDouble(_orderheader.FECHA /*String*/ ))),(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 417;BA.debugLine="pdf.canvas.DrawText(\"Vendedor: \" & Starter.Seller";
_pdf.getCanvas().DrawText(ba,"Vendedor: "+_starter._seller /*b4a.bitdesing.tomapedidos.login_c._sellerdata*/ .NOMBRE /*String*/ ,(float) (_pagewidth/(double)2),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 418;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 420;BA.debugLine="pdf.canvas.DrawLine(xMargin, yPosition, pageWidth";
_pdf.getCanvas().DrawLine((float) (_xmargin),(float) (_yposition),(float) (_pagewidth-_xmargin),(float) (_yposition),__c.Colors.Gray,(float) (1));
 //BA.debugLineNum = 421;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 424;BA.debugLine="Dim colWidths() As Int = Array As Int(30, 290, 90";
_colwidths = new int[]{(int) (30),(int) (290),(int) (90),(int) (40),(int) (90)};
 //BA.debugLineNum = 425;BA.debugLine="Dim colPositions(colWidths.Length) As Int";
_colpositions = new int[_colwidths.length];
;
 //BA.debugLineNum = 427;BA.debugLine="Dim currentX As Int = xMargin";
_currentx = _xmargin;
 //BA.debugLineNum = 428;BA.debugLine="For i = 0 To colWidths.Length - 1";
{
final int step38 = 1;
final int limit38 = (int) (_colwidths.length-1);
_i = (int) (0) ;
for (;_i <= limit38 ;_i = _i + step38 ) {
 //BA.debugLineNum = 429;BA.debugLine="colPositions(i) = currentX";
_colpositions[_i] = _currentx;
 //BA.debugLineNum = 430;BA.debugLine="currentX = currentX + colWidths(i)";
_currentx = (int) (_currentx+_colwidths[_i]);
 }
};
 //BA.debugLineNum = 433;BA.debugLine="Dim headers() As String = Array As String(\"Cant.\"";
_headers = new String[]{"Cant.","Producto","Precio Un.","% Dto","Subtotal"};
 //BA.debugLineNum = 435;BA.debugLine="For i = 0 To headers.Length - 1";
{
final int step43 = 1;
final int limit43 = (int) (_headers.length-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
 //BA.debugLineNum = 436;BA.debugLine="pdf.canvas.DrawText(headers(i), colPositions(i),";
_pdf.getCanvas().DrawText(ba,_headers[_i],(float) (_colpositions[_i]),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 }
};
 //BA.debugLineNum = 439;BA.debugLine="yPosition = yPosition + lineSpace / 2";
_yposition = (int) (_yposition+_linespace/(double)2);
 //BA.debugLineNum = 440;BA.debugLine="pdf.canvas.DrawLine(xMargin, yPosition, pageWidth";
_pdf.getCanvas().DrawLine((float) (_xmargin),(float) (_yposition),(float) (_pagewidth-_xmargin),(float) (_yposition),__c.Colors.Gray,(float) (1));
 //BA.debugLineNum = 441;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 446;BA.debugLine="For Each item As ItemsData In orderItems";
{
final anywheresoftware.b4a.BA.IterableList group49 = _orderitems;
final int groupLen49 = group49.getSize()
;int index49 = 0;
;
for (; index49 < groupLen49;index49++){
_item = (b4a.bitdesing.tomapedidos.order_c._itemsdata)(group49.Get(index49));
 //BA.debugLineNum = 448;BA.debugLine="If yPosition > pageHeight - 200 Then ' Salto de";
if (_yposition>_pageheight-200) { 
 //BA.debugLineNum = 449;BA.debugLine="pdf.FinishPage";
_pdf.FinishPage();
 //BA.debugLineNum = 450;BA.debugLine="pdf.StartPage(pageWidth, pageHeight) ' A4";
_pdf.StartPage(_pagewidth,_pageheight);
 //BA.debugLineNum = 451;BA.debugLine="yPosition = 50";
_yposition = (int) (50);
 //BA.debugLineNum = 453;BA.debugLine="pdf.canvas.DrawLine(xMargin, yPosition, pageWid";
_pdf.getCanvas().DrawLine((float) (_xmargin),(float) (_yposition),(float) (_pagewidth-_xmargin),(float) (_yposition),__c.Colors.Gray,(float) (1));
 //BA.debugLineNum = 454;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 456;BA.debugLine="For i = 0 To headers.Length - 1";
{
final int step56 = 1;
final int limit56 = (int) (_headers.length-1);
_i = (int) (0) ;
for (;_i <= limit56 ;_i = _i + step56 ) {
 //BA.debugLineNum = 457;BA.debugLine="pdf.canvas.DrawText(headers(i), colPositions(i";
_pdf.getCanvas().DrawText(ba,_headers[_i],(float) (_colpositions[_i]),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 }
};
 //BA.debugLineNum = 460;BA.debugLine="yPosition = yPosition + lineSpace / 2";
_yposition = (int) (_yposition+_linespace/(double)2);
 //BA.debugLineNum = 461;BA.debugLine="pdf.canvas.DrawLine(xMargin, yPosition, pageWid";
_pdf.getCanvas().DrawLine((float) (_xmargin),(float) (_yposition),(float) (_pagewidth-_xmargin),(float) (_yposition),__c.Colors.Gray,(float) (1));
 //BA.debugLineNum = 462;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 };
 //BA.debugLineNum = 465;BA.debugLine="pdf.canvas.DrawText(item.CANTIDAD, colPositions(";
_pdf.getCanvas().DrawText(ba,BA.NumberToString(_item.CANTIDAD /*int*/ ),(float) (_colpositions[(int) (0)]),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 466;BA.debugLine="pdf.canvas.DrawText(item.ProductName, colPositio";
_pdf.getCanvas().DrawText(ba,_item.ProductName /*String*/ ,(float) (_colpositions[(int) (1)]),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 467;BA.debugLine="pdf.canvas.DrawText(\"$ \" & NumberFormat2(item.PR";
_pdf.getCanvas().DrawText(ba,"$ "+__c.NumberFormat2(_item.PRECIO /*double*/ ,(int) (1),(int) (2),(int) (2),__c.False),(float) (_colpositions[(int) (2)]),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 468;BA.debugLine="pdf.canvas.DrawText(item.PORDTO & \" %\", colPosit";
_pdf.getCanvas().DrawText(ba,_item.PORDTO /*String*/ +" %",(float) (_colpositions[(int) (3)]),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 469;BA.debugLine="pdf.canvas.DrawText(\"$ \" & NumberFormat2(item.IM";
_pdf.getCanvas().DrawText(ba,"$ "+__c.NumberFormat2(_item.IMPORTE /*double*/ ,(int) (1),(int) (2),(int) (2),__c.False),(float) (_colpositions[(int) (4)]),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 470;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 }
};
 //BA.debugLineNum = 474;BA.debugLine="pdf.canvas.DrawLine(xMargin, yPosition, pageWidth";
_pdf.getCanvas().DrawLine((float) (_xmargin),(float) (_yposition),(float) (_pagewidth-_xmargin),(float) (_yposition),__c.Colors.Black,(float) (1));
 //BA.debugLineNum = 475;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 480;BA.debugLine="pdf.canvas.DrawText(\"Total Pedido:\", colPositions";
_pdf.getCanvas().DrawText(ba,"Total Pedido:",(float) (_colpositions[(int) (2)]+20),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 482;BA.debugLine="pdf.canvas.DrawText(\"$ \" & NumberFormat2(orderHea";
_pdf.getCanvas().DrawText(ba,"$ "+__c.NumberFormat2((double)(Double.parseDouble(_orderheader.TotalOrder /*String*/ )),(int) (1),(int) (2),(int) (2),__c.False),(float) (_colpositions[(int) (3)]+20),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 483;BA.debugLine="yPosition = yPosition + lineSpace * 2";
_yposition = (int) (_yposition+_linespace*2);
 //BA.debugLineNum = 486;BA.debugLine="If yPosition > pageHeight - 300 Then ' Salto de p";
if (_yposition>_pageheight-300) { 
 //BA.debugLineNum = 487;BA.debugLine="pdf.FinishPage";
_pdf.FinishPage();
 //BA.debugLineNum = 488;BA.debugLine="pdf.StartPage(pageWidth, pageHeight) ' A4";
_pdf.StartPage(_pagewidth,_pageheight);
 //BA.debugLineNum = 489;BA.debugLine="yPosition = 50";
_yposition = (int) (50);
 };
 //BA.debugLineNum = 492;BA.debugLine="pdf.canvas.DrawText(\"Comentarios Generales:\", xMa";
_pdf.getCanvas().DrawText(ba,"Comentarios Generales:",(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT_BOLD,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 493;BA.debugLine="yPosition = yPosition + lineSpace";
_yposition = (int) (_yposition+_linespace);
 //BA.debugLineNum = 494;BA.debugLine="pdf.canvas.DrawText(orderHeader.COMENTARIOS, xMar";
_pdf.getCanvas().DrawText(ba,_orderheader.COMENTARIOS /*String*/ ,(float) (_xmargin),(float) (_yposition),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 501;BA.debugLine="If orderHeader.FIRMA.IsInitialized Then";
if (_orderheader.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .IsInitialized()) { 
 //BA.debugLineNum = 502;BA.debugLine="Dim bmp As Bitmap = orderHeader.FIRMA";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _orderheader.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ;
 //BA.debugLineNum = 504;BA.debugLine="Dim rectFirma As Rect";
_rectfirma = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 505;BA.debugLine="rectFirma.Initialize(pageWidth - 200, yPosition,";
_rectfirma.Initialize((int) (_pagewidth-200),_yposition,(int) (_pagewidth-_xmargin-10),(int) (_yposition+70));
 //BA.debugLineNum = 506;BA.debugLine="pdf.canvas.DrawBitmap(bmp, Null, rectFirma)";
_pdf.getCanvas().DrawBitmap((android.graphics.Bitmap)(_bmp.getObject()),(android.graphics.Rect)(__c.Null),(android.graphics.Rect)(_rectfirma.getObject()));
 //BA.debugLineNum = 507;BA.debugLine="pdf.canvas.DrawLine(pageWidth - 200, yPosition +";
_pdf.getCanvas().DrawLine((float) (_pagewidth-200),(float) (_yposition+75),(float) (_pagewidth-_xmargin),(float) (_yposition+75),__c.Colors.Black,(float) (1));
 //BA.debugLineNum = 508;BA.debugLine="pdf.canvas.DrawText(orderHeader.QUIENRECIBIO, pa";
_pdf.getCanvas().DrawText(ba,_orderheader.QUIENRECIBIO /*String*/ ,(float) (_pagewidth-150),(float) (_yposition+90),__c.Typeface.DEFAULT,_fontsize,__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 512;BA.debugLine="pdf.FinishPage";
_pdf.FinishPage();
 //BA.debugLineNum = 514;BA.debugLine="Dim filename As String = \"Remito_\" & id & \".pdf\"";
_filename = "Remito_"+BA.NumberToString(_id)+".pdf";
 //BA.debugLineNum = 515;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Starter";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_filename,__c.False);
 //BA.debugLineNum = 516;BA.debugLine="pdf.WriteToStream(out)";
_pdf.WriteToStream((java.io.OutputStream)(_out.getObject()));
 //BA.debugLineNum = 517;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 518;BA.debugLine="pdf.Close";
_pdf.Close();
 //BA.debugLineNum = 522;BA.debugLine="Dim intento As Intent";
_intento = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 523;BA.debugLine="Dim uri As Object";
_uri = new Object();
 //BA.debugLineNum = 525;BA.debugLine="If phone.SdkVersion >= 24 Then";
if (_phone.getSdkVersion()>=24) { 
 //BA.debugLineNum = 527;BA.debugLine="uri = Starter.Provider.GetFileUri(filename)";
_uri = _starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._getfileuri /*Object*/ (_filename);
 //BA.debugLineNum = 528;BA.debugLine="intento.Initialize(intento.ACTION_VIEW, uri)";
_intento.Initialize(_intento.ACTION_VIEW,BA.ObjectToString(_uri));
 //BA.debugLineNum = 529;BA.debugLine="intento.Flags = Bit.Or(intento.Flags, 1)";
_intento.setFlags(__c.Bit.Or(_intento.getFlags(),(int) (1)));
 //BA.debugLineNum = 530;BA.debugLine="intento.SetType(\"application/pdf\")";
_intento.SetType("application/pdf");
 }else {
 //BA.debugLineNum = 533;BA.debugLine="intento.Initialize(intento.ACTION_VIEW, \"file://";
_intento.Initialize(_intento.ACTION_VIEW,"file://"+__c.File.Combine(_starter._provider /*b4a.bitdesing.tomapedidos.fileprovider*/ ._sharedfolder /*String*/ ,_filename));
 //BA.debugLineNum = 534;BA.debugLine="intento.SetType(\"application/pdf\")";
_intento.SetType("application/pdf");
 };
 //BA.debugLineNum = 537;BA.debugLine="Try";
try { //BA.debugLineNum = 538;BA.debugLine="StartActivity(intento)";
__c.StartActivity(ba,(Object)(_intento.getObject()));
 } 
       catch (Exception e111) {
			ba.setLastException(e111); //BA.debugLineNum = 540;BA.debugLine="ToastMessageShow(\"No hay aplicación para abrir P";
__c.ToastMessageShow(BA.ObjectToCharSequence("No hay aplicación para abrir PDF."),__c.True);
 };
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return "";
}
public b4a.bitdesing.tomapedidos.orders_c._ordersdata  _getorderheader(int _orderid) throws Exception{
b4a.bitdesing.tomapedidos.orders_c._ordersdata _od = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
String _totalresult = "";
 //BA.debugLineNum = 545;BA.debugLine="Private Sub GetOrderHeader(OrderId As Int) As Orde";
 //BA.debugLineNum = 546;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 547;BA.debugLine="OD.Initialize";
_od.Initialize();
 //BA.debugLineNum = 549;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 550;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil WHERE (ID = "+BA.NumberToString(_orderid)+")")));
 //BA.debugLineNum = 551;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 552;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 554;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 555;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 556;BA.debugLine="OD.Customer = ftxtCustomerName.Text ' Usar el v";
_od.Customer /*String*/  = _ftxtcustomername._gettext /*String*/ ();
 //BA.debugLineNum = 558;BA.debugLine="OD.CODVENDEDOR = rs.GetString(\"CODVENDEDOR\")";
_od.CODVENDEDOR /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODVENDEDOR")));
 //BA.debugLineNum = 559;BA.debugLine="OD.FECHA = rs.GetString(\"FECHA\")";
_od.FECHA /*String*/  = _rs.GetString("FECHA");
 //BA.debugLineNum = 560;BA.debugLine="OD.COMENTARIOS = rs.GetString(\"COMENTARIOS\")";
_od.COMENTARIOS /*String*/  = _rs.GetString("COMENTARIOS");
 //BA.debugLineNum = 563;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 564;BA.debugLine="Buffer = rs.GetBlob(\"FIRMA\")";
_buffer = _rs.GetBlob("FIRMA");
 //BA.debugLineNum = 565;BA.debugLine="If Buffer = Null Then";
if (_buffer== null) { 
 //BA.debugLineNum = 566;BA.debugLine="OD.FIRMA = Null";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 }else {
 //BA.debugLineNum = 568;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 569;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 573;BA.debugLine="OD.FIRMA.Initialize2(InputStream1)";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(_inputstream1.getObject()));
 //BA.debugLineNum = 574;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
 };
 //BA.debugLineNum = 577;BA.debugLine="OD.NROPEDIDO = rs.GetString(\"NROPEDIDO\")";
_od.NROPEDIDO /*String*/  = _rs.GetString("NROPEDIDO");
 //BA.debugLineNum = 578;BA.debugLine="OD.QUIENRECIBIO = rs.GetString(\"QUIENRECIBIO\")";
_od.QUIENRECIBIO /*String*/  = _rs.GetString("QUIENRECIBIO");
 //BA.debugLineNum = 581;BA.debugLine="Dim totalResult As String = sql.ExecQuerySingle";
_totalresult = _sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO="+BA.NumberToString(_orderid));
 //BA.debugLineNum = 582;BA.debugLine="If totalResult = Null Or totalResult = \"\" Then";
if (_totalresult== null || (_totalresult).equals("")) { 
_totalresult = "0";};
 //BA.debugLineNum = 583;BA.debugLine="OD.TotalOrder = totalResult";
_od.TotalOrder /*String*/  = _totalresult;
 }
;
 };
 //BA.debugLineNum = 587;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 589;BA.debugLine="Return OD";
if (true) return _od;
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getorderitems(int _orderid) throws Exception{
anywheresoftware.b4a.objects.collections.List _itemslist = null;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
 //BA.debugLineNum = 592;BA.debugLine="Private Sub GetOrderItems(OrderId As Int) As List";
 //BA.debugLineNum = 593;BA.debugLine="Dim itemsList As List";
_itemslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 594;BA.debugLine="itemsList.Initialize";
_itemslist.Initialize();
 //BA.debugLineNum = 596;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 597;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedDMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedDMovil WHERE (IDPEDIDO = "+BA.NumberToString(_orderid)+")")));
 //BA.debugLineNum = 599;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 600;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 602;BA.debugLine="Dim ID As ItemsData";
_id = new b4a.bitdesing.tomapedidos.order_c._itemsdata();
 //BA.debugLineNum = 603;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 604;BA.debugLine="ID.ID = rs.GetString(\"ID\")";
_id.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 605;BA.debugLine="ID.CODARTICULO = rs.GetString(\"CODARTICULO\")";
_id.CODARTICULO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODARTICULO")));
 //BA.debugLineNum = 606;BA.debugLine="ID.ProductName = Starter.SelectProduct(ID.CODAR";
_id.ProductName /*String*/  = _starter._selectproduct /*b4a.bitdesing.tomapedidos.products_c._productsdata*/ (_id.CODARTICULO /*int*/ ).DESCRIPCION /*String*/ ;
 //BA.debugLineNum = 607;BA.debugLine="ID.CANTIDAD = rs.GetString(\"CANTIDAD\")";
_id.CANTIDAD /*int*/  = (int)(Double.parseDouble(_rs.GetString("CANTIDAD")));
 //BA.debugLineNum = 608;BA.debugLine="ID.PRECIO = rs.GetString(\"PRECIO\")";
_id.PRECIO /*double*/  = (double)(Double.parseDouble(_rs.GetString("PRECIO")));
 //BA.debugLineNum = 609;BA.debugLine="ID.IMPORTE = rs.GetString(\"IMPORTE\")";
_id.IMPORTE /*double*/  = (double)(Double.parseDouble(_rs.GetString("IMPORTE")));
 //BA.debugLineNum = 610;BA.debugLine="ID.PORDTO = rs.GetString(\"PORDTO\")";
_id.PORDTO /*String*/  = _rs.GetString("PORDTO");
 //BA.debugLineNum = 613;BA.debugLine="Try";
try { //BA.debugLineNum = 614;BA.debugLine="ID.COMENTARIO = rs.GetString(\"COMENTARIO\")";
_id.COMENTARIO /*String*/  = _rs.GetString("COMENTARIO");
 } 
       catch (Exception e19) {
			ba.setLastException(e19); //BA.debugLineNum = 616;BA.debugLine="ID.COMENTARIO = \"\"";
_id.COMENTARIO /*String*/  = "";
 };
 //BA.debugLineNum = 619;BA.debugLine="itemsList.Add(ID)";
_itemslist.Add((Object)(_id));
 }
;
 };
 //BA.debugLineNum = 623;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 625;BA.debugLine="Return itemsList";
if (true) return _itemslist;
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _txtsearch_textchanged(String _old,String _new,b4a.bitdesing.tomapedidos.orders_c._ordersdata _od) throws Exception{
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inputstream1 = null;
b4a.bitdesing.tomapedidos.order_c._itemsdata _id = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
 //BA.debugLineNum = 93;BA.debugLine="Private Sub txtSearch_TextChanged (Old As String,";
 //BA.debugLineNum = 95;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 96;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedCMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedCMovil WHERE (ID = "+BA.NumberToString(_od.ID /*int*/ )+")")));
 //BA.debugLineNum = 97;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 98;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 100;BA.debugLine="Dim OD As OrdersData";
_od = new b4a.bitdesing.tomapedidos.orders_c._ordersdata();
 //BA.debugLineNum = 101;BA.debugLine="OD.Initialize";
_od.Initialize();
 //BA.debugLineNum = 102;BA.debugLine="OD.ID = rs.GetString(\"ID\")";
_od.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 103;BA.debugLine="OD.CODCLIENTE = rs.GetString(\"CODCLIENTE\")";
_od.CODCLIENTE /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCLIENTE")));
 //BA.debugLineNum = 104;BA.debugLine="OD.Customer = Starter.SelectCustomer(OD.CODCLIE";
_od.Customer /*String*/  = _starter._selectcustomer /*b4a.bitdesing.tomapedidos.customers_c._customersdata*/ (_od.CODCLIENTE /*int*/ ).NOMBRE /*String*/ ;
 //BA.debugLineNum = 105;BA.debugLine="OD.CODVENDEDOR = rs.GetString(\"CODVENDEDOR\")";
_od.CODVENDEDOR /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODVENDEDOR")));
 //BA.debugLineNum = 106;BA.debugLine="OD.FECHA = rs.GetString(\"FECHA\")";
_od.FECHA /*String*/  = _rs.GetString("FECHA");
 //BA.debugLineNum = 107;BA.debugLine="OD.COMENTARIOS = rs.GetString(\"COMENTARIOS\")";
_od.COMENTARIOS /*String*/  = _rs.GetString("COMENTARIOS");
 //BA.debugLineNum = 109;BA.debugLine="Dim Buffer() As Byte";
_buffer = new byte[(int) (0)];
;
 //BA.debugLineNum = 110;BA.debugLine="Buffer = rs.GetBlob(\"FIRMA\")";
_buffer = _rs.GetBlob("FIRMA");
 //BA.debugLineNum = 111;BA.debugLine="If Buffer = Null Then";
if (_buffer== null) { 
 //BA.debugLineNum = 112;BA.debugLine="OD.FIRMA = Null";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
 }else {
 //BA.debugLineNum = 114;BA.debugLine="Dim InputStream1 As InputStream";
_inputstream1 = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 115;BA.debugLine="InputStream1.InitializeFromBytesArray(Buffer,";
_inputstream1.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
 //BA.debugLineNum = 116;BA.debugLine="OD.FIRMA.Initialize2(InputStream1)";
_od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize2((java.io.InputStream)(_inputstream1.getObject()));
 //BA.debugLineNum = 117;BA.debugLine="InputStream1.Close";
_inputstream1.Close();
 };
 //BA.debugLineNum = 120;BA.debugLine="OD.NROPEDIDO = rs.GetString(\"NROPEDIDO\")";
_od.NROPEDIDO /*String*/  = _rs.GetString("NROPEDIDO");
 //BA.debugLineNum = 121;BA.debugLine="OD.QUIENRECIBIO = rs.GetString(\"QUIENRECIBIO\")";
_od.QUIENRECIBIO /*String*/  = _rs.GetString("QUIENRECIBIO");
 //BA.debugLineNum = 122;BA.debugLine="OD.TotalOrder = sql.ExecQuerySingleResult(\"SELE";
_od.TotalOrder /*String*/  = _sql.ExecQuerySingleResult("SELECT sum(IMPORTE) FROM PedDMovil WHERE IDPEDIDO="+BA.NumberToString(_od.ID /*int*/ ));
 }
;
 };
 //BA.debugLineNum = 126;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 128;BA.debugLine="ftxtOrderId.Text = OD.ID";
_ftxtorderid._settext /*String*/ (BA.NumberToString(_od.ID /*int*/ ));
 //BA.debugLineNum = 129;BA.debugLine="ftxtOrderId.TextField.Enabled = False";
_ftxtorderid._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setEnabled(__c.False);
 //BA.debugLineNum = 130;BA.debugLine="ftxtCustomerName.Text = OD.Customer";
_ftxtcustomername._settext /*String*/ (_od.Customer /*String*/ );
 //BA.debugLineNum = 131;BA.debugLine="ftxtCustomerName.TextField.Enabled = False";
_ftxtcustomername._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setEnabled(__c.False);
 //BA.debugLineNum = 132;BA.debugLine="ftxtComent = OD.COMENTARIOS";
_ftxtcoment = _od.COMENTARIOS /*String*/ ;
 //BA.debugLineNum = 133;BA.debugLine="QuienRecibe = OD.QUIENRECIBIO";
_quienrecibe = _od.QUIENRECIBIO /*String*/ ;
 //BA.debugLineNum = 134;BA.debugLine="Firma = OD.FIRMA";
_firma = _od.FIRMA /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ;
 //BA.debugLineNum = 137;BA.debugLine="sql.Initialize(Starter.Route, Starter.DataBase, T";
_sql.Initialize(_starter._route /*String*/ ,_starter._database /*String*/ ,__c.True);
 //BA.debugLineNum = 139;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM PedDMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM PedDMovil WHERE (IDPEDIDO = "+BA.NumberToString(_od.ID /*int*/ )+")")));
 //BA.debugLineNum = 141;BA.debugLine="clvItems.Clear";
_clvitems._clear();
 //BA.debugLineNum = 143;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 144;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 145;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 147;BA.debugLine="Dim ID As ItemsData";
_id = new b4a.bitdesing.tomapedidos.order_c._itemsdata();
 //BA.debugLineNum = 148;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 149;BA.debugLine="ID.ID = rs.GetString(\"ID\")";
_id.ID /*int*/  = (int)(Double.parseDouble(_rs.GetString("ID")));
 //BA.debugLineNum = 150;BA.debugLine="ID.CODARTICULO = rs.GetString(\"CODARTICULO\")";
_id.CODARTICULO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODARTICULO")));
 //BA.debugLineNum = 151;BA.debugLine="ID.ProductName = Starter.SelectProduct(ID.CODAR";
_id.ProductName /*String*/  = _starter._selectproduct /*b4a.bitdesing.tomapedidos.products_c._productsdata*/ (_id.CODARTICULO /*int*/ ).DESCRIPCION /*String*/ ;
 //BA.debugLineNum = 152;BA.debugLine="ID.CANTIDAD = rs.GetString(\"CANTIDAD\")";
_id.CANTIDAD /*int*/  = (int)(Double.parseDouble(_rs.GetString("CANTIDAD")));
 //BA.debugLineNum = 153;BA.debugLine="ID.PRECIO = rs.GetString(\"PRECIO\")";
_id.PRECIO /*double*/  = (double)(Double.parseDouble(_rs.GetString("PRECIO")));
 //BA.debugLineNum = 154;BA.debugLine="ID.IMPORTE = rs.GetString(\"IMPORTE\")";
_id.IMPORTE /*double*/  = (double)(Double.parseDouble(_rs.GetString("IMPORTE")));
 //BA.debugLineNum = 155;BA.debugLine="ID.PORDTO = rs.GetString(\"PORDTO\")";
_id.PORDTO /*String*/  = _rs.GetString("PORDTO");
 //BA.debugLineNum = 157;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 158;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_xui.CreatePanel(ba,"").getObject()));
 //BA.debugLineNum = 159;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, clvItems.AsView.Wi";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_clvitems._asview().getWidth(),__c.DipToCurrent((int) (52)));
 //BA.debugLineNum = 160;BA.debugLine="clvItems.Add(p, ID)";
_clvitems._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(_id));
 }
;
 };
 //BA.debugLineNum = 165;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
