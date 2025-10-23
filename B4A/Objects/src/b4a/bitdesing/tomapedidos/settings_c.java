package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class settings_c extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.settings_c");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.settings_c.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.net.FTPWrapper _ftp = null;
public int _ftpport = 0;
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtip = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnenviar = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnrecibir = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnshare = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.httputils2service _httputils2service = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 84;BA.debugLine="txtIP.Text = Starter.SelectBusiness.FTP";
_txtip.setText(BA.ObjectToCharSequence(_starter._selectbusiness /*b4a.bitdesing.tomapedidos.starter._businessdata*/ ().FTP /*String*/ ));
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"settings_layout\")";
_root.LoadLayout("settings_layout",ba);
 //BA.debugLineNum = 26;BA.debugLine="Log(\"create settings page\")";
__c.LogImpl("03866627","create settings page",0);
 //BA.debugLineNum = 29;BA.debugLine="B4XPages.SetTitle(Me, \"Configuración\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Configuración"));
 //BA.debugLineNum = 31;BA.debugLine="ime.Initialize(\"\")";
_ime.Initialize("");
 //BA.debugLineNum = 32;BA.debugLine="ime.SetCustomFilter(txtIP, txtIP.INPUT_TYPE_NUMBE";
_ime.SetCustomFilter((android.widget.EditText)(_txtip.getObject()),_txtip.INPUT_TYPE_NUMBERS,"0123456789.");
 //BA.debugLineNum = 37;BA.debugLine="CreateCard(\"btnEnviar\", \"📱 -> ️🖥️\", \"Enviar Dat";
_createcard("btnEnviar","📱 -> ️🖥️","Enviar Datos a PC",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (400)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (245),(int) (255),(int) (250)),"");
 //BA.debugLineNum = 38;BA.debugLine="CreateCard(\"btnRecibir\", \"📱 <- ️🖥️\", \"Recibir D";
_createcard("btnRecibir","📱 <- ️🖥️","Recibir Datos de PC",(int) (_root.getWidth()/(double)2+__c.DipToCurrent((int) (10))),__c.DipToCurrent((int) (400)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (250),(int) (240),(int) (230)),"Mantener presionado");
 //BA.debugLineNum = 39;BA.debugLine="CreateCard(\"btnShare\", \"📱 -> 🔗\", \"Compartir Dat";
_createcard("btnShare","📱 -> 🔗","Compartir Datos",__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (520)),(int) (_root.getWidth()/(double)2-__c.DipToCurrent((int) (30))),__c.DipToCurrent((int) (110)),__c.Colors.RGB((int) (240),(int) (248),(int) (255)),"");
 //BA.debugLineNum = 45;BA.debugLine="btnShare.SetColorAndBorder(Colors.RGB(240,248,255";
_btnshare.SetColorAndBorder(__c.Colors.RGB((int) (240),(int) (248),(int) (255)),__c.DipToCurrent((int) (1)),__c.Colors.LightGray,__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 46;BA.debugLine="btnShare.Text = \"🔗  Compartir Datos\"";
_btnshare.setText(BA.ObjectToCharSequence("🔗  Compartir Datos"));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _btnenviar_click() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Private Sub btnEnviar_Click";
 //BA.debugLineNum = 91;BA.debugLine="If Not (IsValidIp(txtIP.Text)) Then";
if (__c.Not(_isvalidip(_txtip.getText()))) { 
 //BA.debugLineNum = 92;BA.debugLine="ToastMessageShow(\"La ip ingresada no es válida,";
__c.ToastMessageShow(BA.ObjectToCharSequence("La ip ingresada no es válida, verifique"),__c.True);
 //BA.debugLineNum = 93;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 95;BA.debugLine="Log(\"Envia DB\")";
__c.LogImpl("04063239","Envia DB",0);
 //BA.debugLineNum = 96;BA.debugLine="If iniciarFTP Then";
if (_iniciarftp()) { 
 //BA.debugLineNum = 97;BA.debugLine="ProgressDialogShow2(\"Enviando datos...\",False)";
__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence("Enviando datos..."),__c.False);
 //BA.debugLineNum = 98;BA.debugLine="ftp.UploadFile(Starter.Route, Starter.DataBase,";
_ftp.UploadFile(ba,_starter._route /*String*/ ,_starter._database /*String*/ ,__c.False,_starter._database /*String*/ );
 };
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _btnrecibir_click() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Private Sub btnRecibir_Click";
 //BA.debugLineNum = 175;BA.debugLine="ToastMessageShow(\"Mantener presionado para Recibi";
__c.ToastMessageShow(BA.ObjectToCharSequence("Mantener presionado para Recibir Datos."),__c.False);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public void  _btnrecibir_longclick() throws Exception{
ResumableSub_btnRecibir_LongClick rsub = new ResumableSub_btnRecibir_LongClick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRecibir_LongClick extends BA.ResumableSub {
public ResumableSub_btnRecibir_LongClick(b4a.bitdesing.tomapedidos.settings_c parent) {
this.parent = parent;
}
b4a.bitdesing.tomapedidos.settings_c parent;
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
 //BA.debugLineNum = 106;BA.debugLine="If Not (IsValidIp(txtIP.Text)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent._isvalidip(parent._txtip.getText()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 107;BA.debugLine="ToastMessageShow(\"La ip ingresada no es válida,";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("La ip ingresada no es válida, verifique"),parent.__c.True);
 //BA.debugLineNum = 108;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 110;BA.debugLine="Log(\"Recibe DB\")";
parent.__c.LogImpl("04128775","Recibe DB",0);
 //BA.debugLineNum = 111;BA.debugLine="Msgbox2Async(\"Desea descargar los datos?\" & CRLF";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Desea descargar los datos?"+parent.__c.CRLF+"Atención, si no envió los pedidos anteriormente los datos se perderán."),BA.ObjectToCharSequence("Atención"),"Aceptar","Cancelar","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 112;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 113;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 20;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 7;
}else {
this.state = 19;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 115;BA.debugLine="If File.Exists(Starter.Route, Starter.DataBase)";
if (true) break;

case 8:
//if
this.state = 13;
if (parent.__c.File.Exists(parent._starter._route /*String*/ ,parent._starter._database /*String*/ )) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
parent.__c.File.Copy(parent._starter._route /*String*/ ,parent._starter._database /*String*/ ,parent._starter._route /*String*/ ,parent._starter._databasebackup /*String*/ );
if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 116;BA.debugLine="If iniciarFTP Then";
if (true) break;

case 14:
//if
this.state = 17;
if (parent._iniciarftp()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 117;BA.debugLine="ProgressDialogShow2(\"Recibiendo datos...\",False";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence("Recibiendo datos..."),parent.__c.False);
 //BA.debugLineNum = 118;BA.debugLine="ftp.DownloadFile(Starter.DataBase,False, Starte";
parent._ftp.DownloadFile(ba,parent._starter._database /*String*/ ,parent.__c.False,parent._starter._route /*String*/ ,parent._starter._database /*String*/ );
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 121;BA.debugLine="ToastMessageShow(\"Rechazado por el usuario\",True";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Rechazado por el usuario"),parent.__c.True);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _btnshare_click() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Private Sub btnShare_Click";
 //BA.debugLineNum = 170;BA.debugLine="Starter.ShareDataBase";
_starter._sharedatabase /*String*/ ();
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private ftp As FTP";
_ftp = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private ftpPort As Int = 2221";
_ftpport = (int) (2221);
 //BA.debugLineNum = 9;BA.debugLine="Private ime As IME";
_ime = new anywheresoftware.b4a.objects.IME();
 //BA.debugLineNum = 10;BA.debugLine="Private txtIP As EditText";
_txtip = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnEnviar As B4XView";
_btnenviar = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private btnRecibir As B4XView";
_btnrecibir = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private btnShare As B4XView";
_btnshare = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _createcard(String _eventname,String _emoji,String _title,int _left,int _top,int _width,int _height,int _bgcolor,String _tip) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lblicon = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltitle = null;
 //BA.debugLineNum = 50;BA.debugLine="Private Sub CreateCard(EventName As String, Emoji";
 //BA.debugLineNum = 51;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(EventName)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _xui.CreatePanel(ba,_eventname);
 //BA.debugLineNum = 52;BA.debugLine="pnl.SetLayoutAnimated(0, Left, Top, Width, Height";
_pnl.SetLayoutAnimated((int) (0),_left,_top,_width,_height);
 //BA.debugLineNum = 53;BA.debugLine="pnl.SetColorAndBorder(BgColor, 1dip, Colors.Light";
_pnl.SetColorAndBorder(_bgcolor,__c.DipToCurrent((int) (1)),__c.Colors.LightGray,__c.DipToCurrent((int) (15)));
 //BA.debugLineNum = 54;BA.debugLine="Root.AddView(pnl, Left, Top, Width, Height)";
_root.AddView((android.view.View)(_pnl.getObject()),_left,_top,_width,_height);
 //BA.debugLineNum = 57;BA.debugLine="Dim lblIcon As Label";
_lblicon = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="lblIcon.Initialize(\"\")";
_lblicon.Initialize(ba,"");
 //BA.debugLineNum = 59;BA.debugLine="lblIcon.Text = Emoji";
_lblicon.setText(BA.ObjectToCharSequence(_emoji));
 //BA.debugLineNum = 60;BA.debugLine="lblIcon.TextSize = 32";
_lblicon.setTextSize((float) (32));
 //BA.debugLineNum = 61;BA.debugLine="lblIcon.Gravity = Gravity.CENTER";
_lblicon.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 62;BA.debugLine="pnl.AddView(lblIcon, 0, 10dip, pnl.Width, 40dip)";
_pnl.AddView((android.view.View)(_lblicon.getObject()),(int) (0),__c.DipToCurrent((int) (10)),_pnl.getWidth(),__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 65;BA.debugLine="Dim lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="lblTitle.Initialize(\"\")";
_lbltitle.Initialize(ba,"");
 //BA.debugLineNum = 67;BA.debugLine="lblTitle.Text = Title";
_lbltitle.setText(BA.ObjectToCharSequence(_title));
 //BA.debugLineNum = 68;BA.debugLine="lblTitle.TextSize = 18";
_lbltitle.setTextSize((float) (18));
 //BA.debugLineNum = 69;BA.debugLine="lblTitle.TextColor = Colors.Black";
_lbltitle.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 70;BA.debugLine="lblTitle.Gravity = Gravity.CENTER";
_lbltitle.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 71;BA.debugLine="pnl.AddView(lblTitle, 0, 55dip, pnl.Width, 30dip)";
_pnl.AddView((android.view.View)(_lbltitle.getObject()),(int) (0),__c.DipToCurrent((int) (55)),_pnl.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 73;BA.debugLine="Dim lblTitle As Label";
_lbltitle = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 74;BA.debugLine="lblTitle.Initialize(\"\")";
_lbltitle.Initialize(ba,"");
 //BA.debugLineNum = 75;BA.debugLine="lblTitle.Text = Tip";
_lbltitle.setText(BA.ObjectToCharSequence(_tip));
 //BA.debugLineNum = 76;BA.debugLine="lblTitle.TextSize = 14";
_lbltitle.setTextSize((float) (14));
 //BA.debugLineNum = 77;BA.debugLine="lblTitle.TextColor = Colors.Gray";
_lbltitle.setTextColor(__c.Colors.Gray);
 //BA.debugLineNum = 78;BA.debugLine="lblTitle.Gravity = Gravity.CENTER";
_lbltitle.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 79;BA.debugLine="pnl.AddView(lblTitle, 0, 72dip, pnl.Width, 30dip)";
_pnl.AddView((android.view.View)(_lbltitle.getObject()),(int) (0),__c.DipToCurrent((int) (72)),_pnl.getWidth(),__c.DipToCurrent((int) (30)));
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _ftp_downloadcompleted(String _serverpath,boolean _success) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub FTP_DownloadCompleted (ServerPath As String, S";
 //BA.debugLineNum = 156;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("04390913",_serverpath+", Success="+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 157;BA.debugLine="If Success = False Then";
if (_success==__c.False) { 
 //BA.debugLineNum = 158;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("04390915",__c.LastException(ba).getMessage(),0);
 //BA.debugLineNum = 159;BA.debugLine="MsgboxAsync(LastException.Message,\"Error FTP\")";
__c.MsgboxAsync(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error FTP"),ba);
 }else {
 //BA.debugLineNum = 161;BA.debugLine="ToastMessageShow(\"Datos recibidos correctamente\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datos recibidos correctamente"),__c.True);
 };
 //BA.debugLineNum = 164;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _ftp_uploadcompleted(String _serverpath,boolean _success) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub ftp_UploadCompleted (ServerPath As String, Suc";
 //BA.debugLineNum = 145;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("04325377",_serverpath+", Success="+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 146;BA.debugLine="If Success = False Then";
if (_success==__c.False) { 
 //BA.debugLineNum = 147;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("04325379",__c.LastException(ba).getMessage(),0);
 //BA.debugLineNum = 148;BA.debugLine="MsgboxAsync(LastException.Message,\"Error FTP\")";
__c.MsgboxAsync(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error FTP"),ba);
 }else {
 //BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"Datos enviados correctamente\",";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datos enviados correctamente"),__c.True);
 };
 //BA.debugLineNum = 152;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public boolean  _iniciarftp() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Private Sub iniciarFTP() As Boolean";
 //BA.debugLineNum = 137;BA.debugLine="ftp.Initialize(\"ftp\",txtIP.Text,ftpPort,\"\",\"\")";
_ftp.Initialize(ba,"ftp",_txtip.getText(),_ftpport,"","");
 //BA.debugLineNum = 138;BA.debugLine="ftp.PassiveMode = True";
_ftp.setPassiveMode(__c.True);
 //BA.debugLineNum = 139;BA.debugLine="If ftp.IsInitialized Then Return True";
if (_ftp.IsInitialized()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 140;BA.debugLine="ToastMessageShow(\"Error iniciando la conexión, ve";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error iniciando la conexión, verifique"),__c.True);
 //BA.debugLineNum = 141;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return false;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public boolean  _isvalidip(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
 //BA.debugLineNum = 126;BA.debugLine="Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 127;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 128;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = __c.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 129;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 130;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 131;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 133;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
