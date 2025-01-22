package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpclient extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.ftpclient");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.ftpclient.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.bitdesing.tomapedidos.ftpserver _mserver = null;
public int _mdataport = 0;
public b4a.bitdesing.tomapedidos.asyncstreamstext _ast = null;
public b4a.bitdesing.tomapedidos.ftpserver._ftpuser _user = null;
public boolean _loggedin = false;
public String _currentpath = "";
public b4a.bitdesing.tomapedidos.ftpdataconnection _currentdataconnection = null;
public boolean _closed = false;
public anywheresoftware.b4a.objects.Timer _timeout = null;
public long _lastcommand = 0L;
public String _renamefrom = "";
public int _timeout_minutes = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _ftptask{
public boolean IsInitialized;
public String Path;
public String Command;
public void Initialize() {
IsInitialized = true;
Path = "";
Command = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _ast_newtext(String _text) throws Exception{
int _i = 0;
 //BA.debugLineNum = 43;BA.debugLine="Private Sub AST_NewText(text As String)";
 //BA.debugLineNum = 44;BA.debugLine="Log(\"client: \" & text)";
__c.LogImpl("741418753","client: "+_text,0);
 //BA.debugLineNum = 45;BA.debugLine="Dim i As Int = text.IndexOf(\" \")";
_i = _text.indexOf(" ");
 //BA.debugLineNum = 46;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
 //BA.debugLineNum = 47;BA.debugLine="HandleClientCommand (text, \"\")";
_handleclientcommand(_text,"");
 }else {
 //BA.debugLineNum = 49;BA.debugLine="HandleClientCommand (text.SubString2(0, i), text";
_handleclientcommand(_text.substring((int) (0),_i),_text.substring((int) (_i+1)));
 };
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _ast_terminated() throws Exception{
 //BA.debugLineNum = 248;BA.debugLine="Private Sub AST_Terminated";
 //BA.debugLineNum = 249;BA.debugLine="Log(\"terminated\")";
__c.LogImpl("742139649","terminated",0);
 //BA.debugLineNum = 250;BA.debugLine="CloseConnection";
_closeconnection();
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _changedir(String _reldir) throws Exception{
String _dir = "";
 //BA.debugLineNum = 141;BA.debugLine="Private Sub ChangeDir (RelDir As String)";
 //BA.debugLineNum = 142;BA.debugLine="Dim Dir As String = CombineWithCurrent(RelDir)";
_dir = _combinewithcurrent(_reldir);
 //BA.debugLineNum = 143;BA.debugLine="If Dir <> \"\" And File.Exists(mServer.BaseDir, Dir";
if ((_dir).equals("") == false && __c.File.Exists(_mserver._basedir /*String*/ ,_dir) && __c.File.IsDirectory(_mserver._basedir /*String*/ ,_dir)) { 
 //BA.debugLineNum = 144;BA.debugLine="currentPath = Dir";
_currentpath = _dir;
 //BA.debugLineNum = 145;BA.debugLine="Log(\"CurrentPath: \" & currentPath)";
__c.LogImpl("741615364","CurrentPath: "+_currentpath,0);
 //BA.debugLineNum = 146;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 }else if((_dir).equals("") == false) { 
 //BA.debugLineNum = 148;BA.debugLine="SendResponse (500, \"Invalid path\")";
_sendresponse((int) (500),"Invalid path");
 };
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type FTPTask (Path As String, Command As String)";
;
 //BA.debugLineNum = 4;BA.debugLine="Private mServer As FTPServer";
_mserver = new b4a.bitdesing.tomapedidos.ftpserver();
 //BA.debugLineNum = 5;BA.debugLine="Public mDataPort As Int";
_mdataport = 0;
 //BA.debugLineNum = 6;BA.debugLine="Private AST As AsyncStreamsText";
_ast = new b4a.bitdesing.tomapedidos.asyncstreamstext();
 //BA.debugLineNum = 7;BA.debugLine="Private user As FTPUser";
_user = new b4a.bitdesing.tomapedidos.ftpserver._ftpuser();
 //BA.debugLineNum = 8;BA.debugLine="Private loggedIn As Boolean";
_loggedin = false;
 //BA.debugLineNum = 9;BA.debugLine="Private currentPath As String";
_currentpath = "";
 //BA.debugLineNum = 10;BA.debugLine="Private currentDataConnection As FTPDataConnectio";
_currentdataconnection = new b4a.bitdesing.tomapedidos.ftpdataconnection();
 //BA.debugLineNum = 11;BA.debugLine="Private closed As Boolean";
_closed = false;
 //BA.debugLineNum = 12;BA.debugLine="Private timeout As Timer";
_timeout = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 13;BA.debugLine="Private lastCommand As Long";
_lastcommand = 0L;
 //BA.debugLineNum = 14;BA.debugLine="Private RenameFrom As String";
_renamefrom = "";
 //BA.debugLineNum = 15;BA.debugLine="Private Const TIMEOUT_MINUTES As Int = 5";
_timeout_minutes = (int) (5);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _closeconnection() throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Public Sub CloseConnection";
 //BA.debugLineNum = 240;BA.debugLine="If closed Then Return";
if (_closed) { 
if (true) return "";};
 //BA.debugLineNum = 241;BA.debugLine="AST.Close";
_ast._close /*String*/ ();
 //BA.debugLineNum = 242;BA.debugLine="CloseDataConnection";
_closedataconnection();
 //BA.debugLineNum = 243;BA.debugLine="mServer.ClientClosed(Me)";
_mserver._clientclosed /*String*/ ((b4a.bitdesing.tomapedidos.ftpclient)(this));
 //BA.debugLineNum = 244;BA.debugLine="timeout.Enabled = False";
_timeout.setEnabled(__c.False);
 //BA.debugLineNum = 245;BA.debugLine="closed = True";
_closed = __c.True;
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _closedataconnection() throws Exception{
 //BA.debugLineNum = 233;BA.debugLine="Private Sub CloseDataConnection";
 //BA.debugLineNum = 234;BA.debugLine="If currentDataConnection <> Null And currentDataC";
if (_currentdataconnection!= null && _currentdataconnection.IsInitialized /*boolean*/ ()) { 
 //BA.debugLineNum = 235;BA.debugLine="currentDataConnection.Close";
_currentdataconnection._close /*String*/ ();
 };
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _combinewithcurrent(String _rel) throws Exception{
String _dir = "";
String _res = "";
 //BA.debugLineNum = 130;BA.debugLine="Private Sub CombineWithCurrent (Rel As String) As";
 //BA.debugLineNum = 131;BA.debugLine="Rel = Rel.Replace(\"\\\", \"/\")";
_rel = _rel.replace("\\","/");
 //BA.debugLineNum = 132;BA.debugLine="Dim Dir As String";
_dir = "";
 //BA.debugLineNum = 133;BA.debugLine="If Rel.StartsWith(\"/\") Then Dir = Rel Else Dir =";
if (_rel.startsWith("/")) { 
_dir = _rel;}
else {
_dir = __c.File.Combine(_currentpath,_rel);};
 //BA.debugLineNum = 134;BA.debugLine="Dim res As String = NormalizePath(Dir)";
_res = _normalizepath(_dir);
 //BA.debugLineNum = 135;BA.debugLine="If res = \"\" Then";
if ((_res).equals("")) { 
 //BA.debugLineNum = 136;BA.debugLine="SendResponse(500, \"Invalid path\")";
_sendresponse((int) (500),"Invalid path");
 };
 //BA.debugLineNum = 138;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _error(int _code,String _msg) throws Exception{
 //BA.debugLineNum = 227;BA.debugLine="Private Sub Error (code As Int, msg As String)";
 //BA.debugLineNum = 228;BA.debugLine="SendResponse(code, msg)";
_sendresponse(_code,_msg);
 //BA.debugLineNum = 229;BA.debugLine="Log(\"Error: \" & msg)";
__c.LogImpl("741943042","Error: "+_msg,0);
 //BA.debugLineNum = 230;BA.debugLine="AST.CloseGracefully";
_ast._closegracefully /*String*/ ();
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
return "";
}
public String  _handleclientcommand(String _command,String _parameters) throws Exception{
String _p = "";
String _filetodownload = "";
String _filetoupload = "";
String _folder = "";
String _renameto = "";
String _deletefile = "";
 //BA.debugLineNum = 54;BA.debugLine="Private Sub HandleClientCommand(command As String,";
 //BA.debugLineNum = 55;BA.debugLine="lastCommand = DateTime.Now";
_lastcommand = __c.DateTime.getNow();
 //BA.debugLineNum = 56;BA.debugLine="Try";
try { //BA.debugLineNum = 57;BA.debugLine="If loggedIn = False Then";
if (_loggedin==__c.False) { 
 //BA.debugLineNum = 58;BA.debugLine="Select command.ToUpperCase";
switch (BA.switchObjectToInt(_command.toUpperCase(),"USER","PASS")) {
case 0: {
 //BA.debugLineNum = 60;BA.debugLine="user.Name = parameters";
_user.Name /*String*/  = _parameters;
 //BA.debugLineNum = 61;BA.debugLine="SendResponse(331, \"\")";
_sendresponse((int) (331),"");
 break; }
case 1: {
 //BA.debugLineNum = 63;BA.debugLine="user.Password = parameters";
_user.Password /*String*/  = _parameters;
 //BA.debugLineNum = 64;BA.debugLine="HandleCredentials";
_handlecredentials();
 break; }
default: {
 //BA.debugLineNum = 66;BA.debugLine="SendResponse(451, \"Not logged in\")";
_sendresponse((int) (451),"Not logged in");
 break; }
}
;
 }else {
 //BA.debugLineNum = 69;BA.debugLine="Select command.ToUpperCase";
switch (BA.switchObjectToInt(_command.toUpperCase(),"SYST","PWD","PASV","EPSV","CWD","LIST","RETR","CDUP","STOR","TYPE","QUIT","MKD","RNFR","RNTO","DELE","RMD")) {
case 0: {
 //BA.debugLineNum = 71;BA.debugLine="SendResponse(215, \"UNIX\")";
_sendresponse((int) (215),"UNIX");
 break; }
case 1: {
 //BA.debugLineNum = 73;BA.debugLine="Dim p As String = currentPath";
_p = _currentpath;
 //BA.debugLineNum = 74;BA.debugLine="SendResponse (257, $\"\"${p}\"\"$)";
_sendresponse((int) (257),("\""+__c.SmartStringFormatter("",(Object)(_p))+"\""));
 break; }
case 2: {
 //BA.debugLineNum = 76;BA.debugLine="PrepareDataConnection";
_preparedataconnection();
 //BA.debugLineNum = 77;BA.debugLine="SendResponse (227, mServer.ssocket.GetMyIP.Re";
_sendresponse((int) (227),_mserver._ssocket /*anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper*/ .GetMyIP().replace(".",",")+","+BA.NumberToString(__c.Floor(_mdataport/(double)256))+","+BA.NumberToString((_mdataport%256)));
 break; }
case 3: {
 //BA.debugLineNum = 79;BA.debugLine="PrepareDataConnection";
_preparedataconnection();
 //BA.debugLineNum = 80;BA.debugLine="SendResponse (229, $\"Entering Extended Passiv";
_sendresponse((int) (229),("Entering Extended Passive Mode (|||"+__c.SmartStringFormatter("",(Object)(_mdataport))+"|)"));
 break; }
case 4: {
 //BA.debugLineNum = 82;BA.debugLine="ChangeDir(parameters)";
_changedir(_parameters);
 break; }
case 5: {
 //BA.debugLineNum = 84;BA.debugLine="SetCurrentTask(currentPath, \"LIST\")";
_setcurrenttask(_currentpath,"LIST");
 break; }
case 6: {
 //BA.debugLineNum = 86;BA.debugLine="Dim FileToDownload As String = CombineWithCur";
_filetodownload = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 87;BA.debugLine="If FileToDownload <> \"\" Then SetCurrentTask(F";
if ((_filetodownload).equals("") == false) { 
_setcurrenttask(_filetodownload,"RETR");};
 break; }
case 7: {
 //BA.debugLineNum = 89;BA.debugLine="ChangeDir(\"..\")";
_changedir("..");
 break; }
case 8: {
 //BA.debugLineNum = 91;BA.debugLine="Dim FileToUpload As String = CombineWithCurre";
_filetoupload = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 92;BA.debugLine="If FileToUpload <> \"\" Then SetCurrentTask(Fil";
if ((_filetoupload).equals("") == false) { 
_setcurrenttask(_filetoupload,"STOR");};
 break; }
case 9: {
 //BA.debugLineNum = 95;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 break; }
case 10: {
 //BA.debugLineNum = 97;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 //BA.debugLineNum = 98;BA.debugLine="CloseConnection";
_closeconnection();
 break; }
case 11: {
 //BA.debugLineNum = 100;BA.debugLine="Dim folder As String = CombineWithCurrent(par";
_folder = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 101;BA.debugLine="If folder <> \"\" Then";
if ((_folder).equals("") == false) { 
 //BA.debugLineNum = 102;BA.debugLine="File.MakeDir(mServer.BaseDir, folder)";
__c.File.MakeDir(_mserver._basedir /*String*/ ,_folder);
 //BA.debugLineNum = 103;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 };
 break; }
case 12: {
 //BA.debugLineNum = 107;BA.debugLine="RenameFrom = CombineWithCurrent(parameters)";
_renamefrom = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 108;BA.debugLine="If RenameFrom <> \"\" Then SendResponse(300, \"\"";
if ((_renamefrom).equals("") == false) { 
_sendresponse((int) (300),"");};
 break; }
case 13: {
 //BA.debugLineNum = 110;BA.debugLine="Dim RenameTo As String = CombineWithCurrent(p";
_renameto = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 111;BA.debugLine="If RenameFrom <> \"\" And RenameTo <> \"\" Then";
if ((_renamefrom).equals("") == false && (_renameto).equals("") == false) { 
 //BA.debugLineNum = 112;BA.debugLine="RenameFile(File.Combine(mServer.BaseDir, Ren";
_renamefile(__c.File.Combine(_mserver._basedir /*String*/ ,_renamefrom),__c.File.Combine(_mserver._basedir /*String*/ ,_renameto));
 //BA.debugLineNum = 113;BA.debugLine="SendResponse(200, \"\")";
_sendresponse((int) (200),"");
 };
 break; }
case 14: 
case 15: {
 //BA.debugLineNum = 116;BA.debugLine="Dim DeleteFile As String = CombineWithCurrent";
_deletefile = _combinewithcurrent(_parameters);
 //BA.debugLineNum = 117;BA.debugLine="If DeleteFile <> \"\" Then";
if ((_deletefile).equals("") == false) { 
 //BA.debugLineNum = 118;BA.debugLine="If File.Delete(mServer.BaseDir, DeleteFile)";
if (__c.File.Delete(_mserver._basedir /*String*/ ,_deletefile)) { 
_sendresponse((int) (200),"");}
else {
_sendresponse((int) (500),"");};
 };
 break; }
default: {
 //BA.debugLineNum = 121;BA.debugLine="SendResponse(500, \"Unknown command: \" & comma";
_sendresponse((int) (500),"Unknown command: "+_command);
 break; }
}
;
 };
 } 
       catch (Exception e69) {
			ba.setLastException(e69); //BA.debugLineNum = 125;BA.debugLine="Log(LastException)";
__c.LogImpl("741484359",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 126;BA.debugLine="SendResponse(500, \"Error: \" & LastException.Mess";
_sendresponse((int) (500),"Error: "+__c.LastException(getActivityBA()).getMessage());
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _handlecredentials() throws Exception{
b4a.bitdesing.tomapedidos.ftpserver._ftpuser _u = null;
 //BA.debugLineNum = 169;BA.debugLine="Private Sub HandleCredentials";
 //BA.debugLineNum = 170;BA.debugLine="If mServer.Users.ContainsKey(user.Name) Then";
if (_mserver._users /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_user.Name /*String*/ ))) { 
 //BA.debugLineNum = 171;BA.debugLine="Dim u As FTPUser = mServer.Users.Get(user.Name)";
_u = (b4a.bitdesing.tomapedidos.ftpserver._ftpuser)(_mserver._users /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_user.Name /*String*/ )));
 //BA.debugLineNum = 172;BA.debugLine="If u.Password = user.Password Then";
if ((_u.Password /*String*/ ).equals(_user.Password /*String*/ )) { 
 //BA.debugLineNum = 173;BA.debugLine="user = u";
_user = _u;
 //BA.debugLineNum = 174;BA.debugLine="loggedIn = True";
_loggedin = __c.True;
 //BA.debugLineNum = 175;BA.debugLine="SendResponse(230, \"\")";
_sendresponse((int) (230),"");
 //BA.debugLineNum = 176;BA.debugLine="Log(\"User logged in: \" & user.Name)";
__c.LogImpl("741811975","User logged in: "+_user.Name /*String*/ ,0);
 //BA.debugLineNum = 177;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 180;BA.debugLine="Error(530, \"Invalid username or password.\")";
_error((int) (530),"Invalid username or password.");
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.bitdesing.tomapedidos.ftpserver _server,anywheresoftware.b4a.objects.SocketWrapper _socket,int _dataport) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (server As FTPServer, socket";
 //BA.debugLineNum = 19;BA.debugLine="mServer = server";
_mserver = _server;
 //BA.debugLineNum = 20;BA.debugLine="mDataPort = DataPort";
_mdataport = _dataport;
 //BA.debugLineNum = 21;BA.debugLine="AST.Initialize(Me, \"ast\", socket.InputStream, soc";
_ast._initialize /*String*/ (ba,this,"ast",(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_socket.getInputStream())),(anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper(), (java.io.OutputStream)(_socket.getOutputStream())));
 //BA.debugLineNum = 22;BA.debugLine="SendResponse(220, \"B4X FTP Server\")";
_sendresponse((int) (220),"B4X FTP Server");
 //BA.debugLineNum = 23;BA.debugLine="currentPath = \"/\"";
_currentpath = "/";
 //BA.debugLineNum = 24;BA.debugLine="timeout.Initialize(\"timeout\", 10000)";
_timeout.Initialize(ba,"timeout",(long) (10000));
 //BA.debugLineNum = 25;BA.debugLine="timeout.Enabled = True";
_timeout.setEnabled(__c.True);
 //BA.debugLineNum = 26;BA.debugLine="If DataPort <= 0 Then";
if (_dataport<=0) { 
 //BA.debugLineNum = 27;BA.debugLine="Error(500, \"Data ports not available.\")";
_error((int) (500),"Data ports not available.");
 //BA.debugLineNum = 28;BA.debugLine="CloseConnection";
_closeconnection();
 };
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _normalizepath(String _p) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
String _canonicalpath = "";
String _r = "";
 //BA.debugLineNum = 183;BA.debugLine="Private Sub NormalizePath(p As String) As String";
 //BA.debugLineNum = 184;BA.debugLine="If p.StartsWith(\"/\") Or p.StartsWith(\"\\\") Then p";
if (_p.startsWith("/") || _p.startsWith("\\")) { 
_p = _p.substring((int) (1));};
 //BA.debugLineNum = 187;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 188;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array(Fi";
_jo.InitializeNewInstance("java.io.File",new Object[]{(Object)(__c.File.Combine(_mserver._basedir /*String*/ ,_p))});
 //BA.debugLineNum = 189;BA.debugLine="Dim CanonicalPath As String = jo.RunMethod(\"getCa";
_canonicalpath = BA.ObjectToString(_jo.RunMethod("getCanonicalPath",(Object[])(__c.Null)));
 //BA.debugLineNum = 190;BA.debugLine="If CanonicalPath.ToLowerCase.StartsWith(mServer.B";
if (_canonicalpath.toLowerCase().startsWith(_mserver._basedir /*String*/ .toLowerCase())) { 
 //BA.debugLineNum = 191;BA.debugLine="Dim r As String = CanonicalPath.SubString(mServe";
_r = _canonicalpath.substring(_mserver._basedir /*String*/ .length()).replace("\\","/");
 //BA.debugLineNum = 192;BA.debugLine="If r.Length = 0 Then Return \"/\" Else Return r";
if (_r.length()==0) { 
if (true) return "/";}
else {
if (true) return _r;};
 }else {
 //BA.debugLineNum = 194;BA.debugLine="SendResponse(450, \"Invalid path: \" & p)";
_sendresponse((int) (450),"Invalid path: "+_p);
 //BA.debugLineNum = 195;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public String  _preparedataconnection() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Private Sub PrepareDataConnection";
 //BA.debugLineNum = 154;BA.debugLine="CloseDataConnection";
_closedataconnection();
 //BA.debugLineNum = 155;BA.debugLine="Dim currentDataConnection As FTPDataConnection";
_currentdataconnection = new b4a.bitdesing.tomapedidos.ftpdataconnection();
 //BA.debugLineNum = 156;BA.debugLine="currentDataConnection.Initialize(Me, mServer, mDa";
_currentdataconnection._initialize /*String*/ (ba,(b4a.bitdesing.tomapedidos.ftpclient)(this),_mserver,_mdataport);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _renamefile(String _source,String _target) throws Exception{
anywheresoftware.b4j.object.JavaObject _jofilesource = null;
anywheresoftware.b4j.object.JavaObject _jofiletarget = null;
 //BA.debugLineNum = 254;BA.debugLine="Private Sub RenameFile(source As String, target As";
 //BA.debugLineNum = 256;BA.debugLine="Dim joFileSource As JavaObject";
_jofilesource = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 257;BA.debugLine="Dim joFileTarget As JavaObject";
_jofiletarget = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 258;BA.debugLine="joFileSource.InitializeNewInstance(\"java.io.File\"";
_jofilesource.InitializeNewInstance("java.io.File",new Object[]{(Object)(_source)});
 //BA.debugLineNum = 259;BA.debugLine="joFileTarget.InitializeNewInstance(\"java.io.File\"";
_jofiletarget.InitializeNewInstance("java.io.File",new Object[]{(Object)(_target)});
 //BA.debugLineNum = 260;BA.debugLine="joFileSource.RunMethod(\"renameTo\", Array(joFileTa";
_jofilesource.RunMethod("renameTo",new Object[]{(Object)(_jofiletarget.getObject())});
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _sendresponse(int _code,String _message) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub SendResponse(code As Int, message As St";
 //BA.debugLineNum = 40;BA.debugLine="AST.Write(code & \" \" & message & mServer.EOL)";
_ast._write /*String*/ (BA.NumberToString(_code)+" "+_message+_mserver._eol /*String*/ );
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _setcurrenttask(String _path,String _command) throws Exception{
b4a.bitdesing.tomapedidos.ftpclient._ftptask _currenttask = null;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub SetCurrentTask (Path As String, Comman";
 //BA.debugLineNum = 160;BA.debugLine="Dim currentTask As FTPTask";
_currenttask = new b4a.bitdesing.tomapedidos.ftpclient._ftptask();
 //BA.debugLineNum = 161;BA.debugLine="currentTask.Initialize";
_currenttask.Initialize();
 //BA.debugLineNum = 162;BA.debugLine="currentTask.Command = Command";
_currenttask.Command /*String*/  = _command;
 //BA.debugLineNum = 163;BA.debugLine="currentTask.Path = Path";
_currenttask.Path /*String*/  = _path;
 //BA.debugLineNum = 164;BA.debugLine="SendResponse(150, \"\")";
_sendresponse((int) (150),"");
 //BA.debugLineNum = 165;BA.debugLine="currentDataConnection.SetTask(currentTask)";
_currentdataconnection._settask /*String*/ (_currenttask);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Private Sub Timeout_Tick";
 //BA.debugLineNum = 33;BA.debugLine="If DateTime.Now - lastCommand > TIMEOUT_MINUTES *";
if (__c.DateTime.getNow()-_lastcommand>_timeout_minutes*__c.DateTime.TicksPerMinute) { 
 //BA.debugLineNum = 34;BA.debugLine="Log(\"Timeout!!!\")";
__c.LogImpl("741287682","Timeout!!!",0);
 //BA.debugLineNum = 35;BA.debugLine="CloseConnection";
_closeconnection();
 };
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SENDRESPONSE"))
	return _sendresponse(((Number)args[0]).intValue(), (String) args[1]);
return BA.SubDelegator.SubNotFound;
}
}
