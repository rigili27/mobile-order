package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class ftpdataconnection extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.bitdesing.tomapedidos.ftpdataconnection");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.bitdesing.tomapedidos.ftpdataconnection.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.bitdesing.tomapedidos.ftpclient _mclient = null;
public b4a.bitdesing.tomapedidos.ftpserver _mserver = null;
public anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _ssocket = null;
public anywheresoftware.b4a.randomaccessfile.AsyncStreams _astream = null;
public b4a.bitdesing.tomapedidos.ftpclient._ftptask _mtask = null;
public String[] _months = null;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _filein = null;
public anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _fileout = null;
public byte[] _filebuffer = null;
public anywheresoftware.b4a.objects.Timer _retrtimer = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.starter _starter = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public String  _afterconnectionandtask() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Private Sub AfterConnectionAndTask";
 //BA.debugLineNum = 30;BA.debugLine="If mTask.IsInitialized And AStream.IsInitialized";
if (_mtask.IsInitialized /*boolean*/  && _astream.IsInitialized()) { 
 //BA.debugLineNum = 31;BA.debugLine="Try";
try { //BA.debugLineNum = 32;BA.debugLine="Select mTask.Command";
switch (BA.switchObjectToInt(_mtask.Command /*String*/ ,"LIST","RETR","STOR")) {
case 0: {
 //BA.debugLineNum = 34;BA.debugLine="HandleLIST";
_handlelist();
 break; }
case 1: {
 //BA.debugLineNum = 36;BA.debugLine="FileIn = File.OpenInput(mServer.BaseDir, mTas";
_filein = __c.File.OpenInput(_mserver._basedir /*String*/ ,_mtask.Path /*String*/ );
 //BA.debugLineNum = 37;BA.debugLine="RETRTimer.Enabled = True";
_retrtimer.setEnabled(__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 39;BA.debugLine="FileOut = File.OpenOutput(mServer.BaseDir, mT";
_fileout = __c.File.OpenOutput(_mserver._basedir /*String*/ ,_mtask.Path /*String*/ ,__c.False);
 break; }
}
;
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 42;BA.debugLine="mClient.SendResponse(451, \"\")";
_mclient._sendresponse /*String*/ ((int) (451),"");
 //BA.debugLineNum = 43;BA.debugLine="Close";
_close();
 //BA.debugLineNum = 44;BA.debugLine="Log(LastException)";
__c.LogImpl("542467343",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
 };
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public String  _astream_error() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Private Sub AStream_Error";
 //BA.debugLineNum = 136;BA.debugLine="AStream_Terminated";
_astream_terminated();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _astream_newdata(byte[] _buffer) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub AStream_NewData (buffer() As Byte)";
 //BA.debugLineNum = 113;BA.debugLine="Try";
try { //BA.debugLineNum = 114;BA.debugLine="FileOut.WriteBytes(buffer, 0, buffer.Length)";
_fileout.WriteBytes(_buffer,(int) (0),_buffer.length);
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 116;BA.debugLine="Log(LastException)";
__c.LogImpl("542795012",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 117;BA.debugLine="Close";
_close();
 };
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _astream_terminated() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Private Sub AStream_Terminated";
 //BA.debugLineNum = 130;BA.debugLine="Log(\"Data connection terminated: \" & mTask.Path)";
__c.LogImpl("542926081","Data connection terminated: "+_mtask.Path /*String*/ ,0);
 //BA.debugLineNum = 131;BA.debugLine="CallSubDelayed3(mClient, \"SendResponse\", 226, \"\")";
__c.CallSubDelayed3(ba,(Object)(_mclient),"SendResponse",(Object)(226),(Object)(""));
 //BA.debugLineNum = 132;BA.debugLine="Close";
_close();
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mClient As FTPClient";
_mclient = new b4a.bitdesing.tomapedidos.ftpclient();
 //BA.debugLineNum = 4;BA.debugLine="Private mServer As FTPServer";
_mserver = new b4a.bitdesing.tomapedidos.ftpserver();
 //BA.debugLineNum = 5;BA.debugLine="Private ssocket As ServerSocket";
_ssocket = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private AStream As AsyncStreams";
_astream = new anywheresoftware.b4a.randomaccessfile.AsyncStreams();
 //BA.debugLineNum = 7;BA.debugLine="Private mTask As FTPTask";
_mtask = new b4a.bitdesing.tomapedidos.ftpclient._ftptask();
 //BA.debugLineNum = 8;BA.debugLine="Private months() As String = Array As String(\"Jan";
_months = new String[]{"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
 //BA.debugLineNum = 10;BA.debugLine="Private FileIn As InputStream";
_filein = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private FileOut As OutputStream";
_fileout = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private FileBuffer(81920) As Byte";
_filebuffer = new byte[(int) (81920)];
;
 //BA.debugLineNum = 13;BA.debugLine="Private RETRTimer As Timer";
_retrtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 122;BA.debugLine="If AStream.IsInitialized Then AStream.Close";
if (_astream.IsInitialized()) { 
_astream.Close();};
 //BA.debugLineNum = 123;BA.debugLine="ssocket.Close";
_ssocket.Close();
 //BA.debugLineNum = 124;BA.debugLine="If FileIn.IsInitialized Then FileIn.Close";
if (_filein.IsInitialized()) { 
_filein.Close();};
 //BA.debugLineNum = 125;BA.debugLine="If FileOut.IsInitialized Then FileOut.Close";
if (_fileout.IsInitialized()) { 
_fileout.Close();};
 //BA.debugLineNum = 126;BA.debugLine="RETRTimer.Enabled = False";
_retrtimer.setEnabled(__c.False);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public String  _handlelist() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _dir = "";
String _f = "";
String _size = "";
long _date = 0L;
String _day = "";
 //BA.debugLineNum = 75;BA.debugLine="Private Sub HandleLIST";
 //BA.debugLineNum = 76;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 77;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 78;BA.debugLine="Dim dir As String = File.Combine(mServer.BaseDir,";
_dir = __c.File.Combine(_mserver._basedir /*String*/ ,_mtask.Path /*String*/ );
 //BA.debugLineNum = 80;BA.debugLine="For Each f As String In File.ListFiles(dir)";
{
final anywheresoftware.b4a.BA.IterableList group4 = __c.File.ListFiles(_dir);
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_f = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 81;BA.debugLine="If File.IsDirectory(dir, f) Then";
if (__c.File.IsDirectory(_dir,_f)) { 
 //BA.debugLineNum = 82;BA.debugLine="sb.Append(\"drwxr-xr-x 1 owner group \")";
_sb.Append("drwxr-xr-x 1 owner group ");
 }else {
 //BA.debugLineNum = 84;BA.debugLine="sb.Append(\"-rw-r--r-- 1 owner group \")";
_sb.Append("-rw-r--r-- 1 owner group ");
 };
 //BA.debugLineNum = 86;BA.debugLine="Dim size As String = File.Size(dir, f)";
_size = BA.NumberToString(__c.File.Size(_dir,_f));
 //BA.debugLineNum = 87;BA.debugLine="Pad(sb, 13, size).Append(\" \")";
_pad(_sb,(int) (13),_size).Append(" ");
 //BA.debugLineNum = 89;BA.debugLine="Dim date As Long = File.LastModified(dir, f)";
_date = __c.File.LastModified(_dir,_f);
 //BA.debugLineNum = 90;BA.debugLine="sb.Append(months(DateTime.GetMonth(date) - 1)).A";
_sb.Append(_months[(int) (__c.DateTime.GetMonth(_date)-1)]).Append(" ");
 //BA.debugLineNum = 91;BA.debugLine="Dim day As String = DateTime.GetDayOfMonth(date)";
_day = BA.NumberToString(__c.DateTime.GetDayOfMonth(_date));
 //BA.debugLineNum = 92;BA.debugLine="Pad(sb, 3, day).Append(\" \")";
_pad(_sb,(int) (3),_day).Append(" ");
 //BA.debugLineNum = 93;BA.debugLine="If DateTime.Now - date > 180 * DateTime.TicksPer";
if (__c.DateTime.getNow()-_date>180*__c.DateTime.TicksPerDay) { 
 //BA.debugLineNum = 94;BA.debugLine="Pad(sb, 5, DateTime.GetYear(date))";
_pad(_sb,(int) (5),BA.NumberToString(__c.DateTime.GetYear(_date)));
 }else {
 //BA.debugLineNum = 96;BA.debugLine="sb.Append($\"$2.0{DateTime.GetHour(date)}:$2.0{D";
_sb.Append((""+__c.SmartStringFormatter("2.0",(Object)(__c.DateTime.GetHour(_date)))+":"+__c.SmartStringFormatter("2.0",(Object)(__c.DateTime.GetHour(_date)))+""));
 };
 //BA.debugLineNum = 98;BA.debugLine="sb.Append(\" \").Append(f).Append(mServer.EOL)";
_sb.Append(" ").Append(_f).Append(_mserver._eol /*String*/ );
 }
};
 //BA.debugLineNum = 100;BA.debugLine="AStream.Write(sb.ToString.GetBytes(\"UTF8\"))";
_astream.Write(_sb.ToString().getBytes("UTF8"));
 //BA.debugLineNum = 101;BA.debugLine="AStream.SendAllAndClose";
_astream.SendAllAndClose();
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,b4a.bitdesing.tomapedidos.ftpclient _client,b4a.bitdesing.tomapedidos.ftpserver _server,int _port) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Client As FTPClient, Server";
 //BA.debugLineNum = 17;BA.debugLine="ssocket.Initialize(port, \"ssocket\")";
_ssocket.Initialize(ba,_port,"ssocket");
 //BA.debugLineNum = 18;BA.debugLine="ssocket.Listen";
_ssocket.Listen();
 //BA.debugLineNum = 19;BA.debugLine="mClient = Client";
_mclient = _client;
 //BA.debugLineNum = 20;BA.debugLine="mServer = Server";
_mserver = _server;
 //BA.debugLineNum = 21;BA.debugLine="RETRTimer.Initialize(\"RETRTimer\", 30)";
_retrtimer.Initialize(ba,"RETRTimer",(long) (30));
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.StringBuilderWrapper  _pad(anywheresoftware.b4a.keywords.StringBuilderWrapper _sb,int _n,String _value) throws Exception{
int _i = 0;
 //BA.debugLineNum = 104;BA.debugLine="Private Sub Pad(sb As StringBuilder, n As Int, val";
 //BA.debugLineNum = 105;BA.debugLine="For i = 1 To n - value.Length";
{
final int step1 = 1;
final int limit1 = (int) (_n-_value.length());
_i = (int) (1) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 106;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 }
};
 //BA.debugLineNum = 108;BA.debugLine="sb.Append(value)";
_sb.Append(_value);
 //BA.debugLineNum = 109;BA.debugLine="Return sb";
if (true) return _sb;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _retrtimer_tick() throws Exception{
int _c = 0;
 //BA.debugLineNum = 57;BA.debugLine="Private Sub RETRTimer_Tick";
 //BA.debugLineNum = 58;BA.debugLine="Try";
try { //BA.debugLineNum = 59;BA.debugLine="If AStream.OutputQueueSize > 50 Then Return";
if (_astream.getOutputQueueSize()>50) { 
if (true) return "";};
 //BA.debugLineNum = 60;BA.debugLine="Dim c As Int = FileIn.ReadBytes(FileBuffer, 0, F";
_c = _filein.ReadBytes(_filebuffer,(int) (0),_filebuffer.length);
 //BA.debugLineNum = 61;BA.debugLine="If c <= 0 Then";
if (_c<=0) { 
 //BA.debugLineNum = 62;BA.debugLine="AStream.SendAllAndClose";
_astream.SendAllAndClose();
 //BA.debugLineNum = 63;BA.debugLine="RETRTimer.Enabled = False";
_retrtimer.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 66;BA.debugLine="AStream.Write2(FileBuffer, 0, c)";
_astream.Write2(_filebuffer,(int) (0),_c);
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 69;BA.debugLine="Log(LastException)";
__c.LogImpl("542598412",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 //BA.debugLineNum = 70;BA.debugLine="Close";
_close();
 };
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public String  _settask(b4a.bitdesing.tomapedidos.ftpclient._ftptask _task) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub SetTask (task As FTPTask)";
 //BA.debugLineNum = 25;BA.debugLine="mTask = task";
_mtask = _task;
 //BA.debugLineNum = 26;BA.debugLine="AfterConnectionAndTask";
_afterconnectionandtask();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _ssocket_newconnection(boolean _successful,anywheresoftware.b4a.objects.SocketWrapper _newsocket) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Private Sub ssocket_NewConnection (Successful As B";
 //BA.debugLineNum = 51;BA.debugLine="If Successful Then";
if (_successful) { 
 //BA.debugLineNum = 52;BA.debugLine="AStream.Initialize(NewSocket.InputStream, NewSoc";
_astream.Initialize(ba,_newsocket.getInputStream(),_newsocket.getOutputStream(),"astream");
 //BA.debugLineNum = 53;BA.debugLine="AfterConnectionAndTask";
_afterconnectionandtask();
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
