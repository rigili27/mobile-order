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
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 32;BA.debugLine="txtIP.Text = Starter.SelectBusiness.FTP";
_txtip.setText(BA.ObjectToCharSequence(_starter._selectbusiness /*b4a.bitdesing.tomapedidos.starter._businessdata*/ ().FTP /*String*/ ));
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"settings_layout\")";
_root.LoadLayout("settings_layout",ba);
 //BA.debugLineNum = 23;BA.debugLine="Log(\"create settings page\")";
__c.LogImpl("534930691","create settings page",0);
 //BA.debugLineNum = 25;BA.debugLine="ime.Initialize(\"\")";
_ime.Initialize("");
 //BA.debugLineNum = 26;BA.debugLine="ime.SetCustomFilter(txtIP, txtIP.INPUT_TYPE_NUMBE";
_ime.SetCustomFilter((android.widget.EditText)(_txtip.getObject()),_txtip.INPUT_TYPE_NUMBERS,"0123456789.");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _btnenviar_click() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Private Sub btnEnviar_Click";
 //BA.debugLineNum = 39;BA.debugLine="If Not (IsValidIp(txtIP.Text)) Then";
if (__c.Not(_isvalidip(_txtip.getText()))) { 
 //BA.debugLineNum = 40;BA.debugLine="ToastMessageShow(\"La ip ingresada no es válida,";
__c.ToastMessageShow(BA.ObjectToCharSequence("La ip ingresada no es válida, verifique"),__c.True);
 //BA.debugLineNum = 41;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 43;BA.debugLine="Log(\"Envia DB\")";
__c.LogImpl("535061767","Envia DB",0);
 //BA.debugLineNum = 44;BA.debugLine="If iniciarFTP Then";
if (_iniciarftp()) { 
 //BA.debugLineNum = 45;BA.debugLine="ProgressDialogShow2(\"Enviando datos...\",False)";
__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence("Enviando datos..."),__c.False);
 //BA.debugLineNum = 46;BA.debugLine="ftp.UploadFile(Starter.Route, Starter.DataBase,";
_ftp.UploadFile(ba,_starter._route /*String*/ ,_starter._database /*String*/ ,__c.False,_starter._database /*String*/ );
 };
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public void  _btnrecibir_click() throws Exception{
ResumableSub_btnRecibir_Click rsub = new ResumableSub_btnRecibir_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnRecibir_Click extends BA.ResumableSub {
public ResumableSub_btnRecibir_Click(b4a.bitdesing.tomapedidos.settings_c parent) {
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
 //BA.debugLineNum = 54;BA.debugLine="If Not (IsValidIp(txtIP.Text)) Then";
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
 //BA.debugLineNum = 55;BA.debugLine="ToastMessageShow(\"La ip ingresada no es válida,";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("La ip ingresada no es válida, verifique"),parent.__c.True);
 //BA.debugLineNum = 56;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 58;BA.debugLine="Log(\"Recibe DB\")";
parent.__c.LogImpl("535127303","Recibe DB",0);
 //BA.debugLineNum = 59;BA.debugLine="Msgbox2Async(\"Desea descargar los datos?\" & CRLF";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence("Desea descargar los datos?"+parent.__c.CRLF+"Atención, si no envió los pedidos anteriormente los datos se perderán."),BA.ObjectToCharSequence("Atención"),"Aceptar","Cancelar","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
 //BA.debugLineNum = 60;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, this, null);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 61;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
 //BA.debugLineNum = 63;BA.debugLine="If File.Exists(Starter.Route, Starter.DataBase)";
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
 //BA.debugLineNum = 64;BA.debugLine="If iniciarFTP Then";
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
 //BA.debugLineNum = 65;BA.debugLine="ProgressDialogShow2(\"Recibiendo datos...\",False";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence("Recibiendo datos..."),parent.__c.False);
 //BA.debugLineNum = 66;BA.debugLine="ftp.DownloadFile(Starter.DataBase,False, Starte";
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
 //BA.debugLineNum = 69;BA.debugLine="ToastMessageShow(\"Rechazado por el usuario\",True";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Rechazado por el usuario"),parent.__c.True);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _msgbox_result(int _result) throws Exception{
}
public String  _btnshare_click() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub btnShare_Click";
 //BA.debugLineNum = 118;BA.debugLine="Starter.ShareDataBase";
_starter._sharedatabase /*String*/ ();
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _ftp_downloadcompleted(String _serverpath,boolean _success) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub FTP_DownloadCompleted (ServerPath As String, S";
 //BA.debugLineNum = 104;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("535389441",_serverpath+", Success="+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 105;BA.debugLine="If Success = False Then";
if (_success==__c.False) { 
 //BA.debugLineNum = 106;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("535389443",__c.LastException(ba).getMessage(),0);
 //BA.debugLineNum = 107;BA.debugLine="MsgboxAsync(LastException.Message,\"Error FTP\")";
__c.MsgboxAsync(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error FTP"),ba);
 }else {
 //BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"Datos recibidos correctamente\"";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datos recibidos correctamente"),__c.True);
 };
 //BA.debugLineNum = 112;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _ftp_uploadcompleted(String _serverpath,boolean _success) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub ftp_UploadCompleted (ServerPath As String, Suc";
 //BA.debugLineNum = 93;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("535323905",_serverpath+", Success="+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 94;BA.debugLine="If Success = False Then";
if (_success==__c.False) { 
 //BA.debugLineNum = 95;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("535323907",__c.LastException(ba).getMessage(),0);
 //BA.debugLineNum = 96;BA.debugLine="MsgboxAsync(LastException.Message,\"Error FTP\")";
__c.MsgboxAsync(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Error FTP"),ba);
 }else {
 //BA.debugLineNum = 98;BA.debugLine="ToastMessageShow(\"Datos enviados correctamente\",";
__c.ToastMessageShow(BA.ObjectToCharSequence("Datos enviados correctamente"),__c.True);
 };
 //BA.debugLineNum = 100;BA.debugLine="ProgressDialogHide";
__c.ProgressDialogHide();
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public boolean  _iniciarftp() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub iniciarFTP() As Boolean";
 //BA.debugLineNum = 85;BA.debugLine="ftp.Initialize(\"ftp\",txtIP.Text,ftpPort,\"\",\"\")";
_ftp.Initialize(ba,"ftp",_txtip.getText(),_ftpport,"","");
 //BA.debugLineNum = 86;BA.debugLine="ftp.PassiveMode = True";
_ftp.setPassiveMode(__c.True);
 //BA.debugLineNum = 87;BA.debugLine="If ftp.IsInitialized Then Return True";
if (_ftp.IsInitialized()) { 
if (true) return __c.True;};
 //BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"Error iniciando la conexión, ve";
__c.ToastMessageShow(BA.ObjectToCharSequence("Error iniciando la conexión, verifique"),__c.True);
 //BA.debugLineNum = 89;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return false;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public boolean  _isvalidip(String _ip) throws Exception{
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
 //BA.debugLineNum = 74;BA.debugLine="Sub IsValidIp(ip As String) As Boolean";
 //BA.debugLineNum = 75;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
 //BA.debugLineNum = 76;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = __c.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
 //BA.debugLineNum = 77;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==__c.False) { 
if (true) return __c.False;};
 //BA.debugLineNum = 78;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 79;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 81;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
