package b4a.bitdesing.tomapedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "b4a.bitdesing.tomapedidos", "b4a.bitdesing.tomapedidos.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.bitdesing.tomapedidos.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static String _database = "";
public static String _databasebackup = "";
public static String _route = "";
public static anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
public static b4a.bitdesing.tomapedidos.fileprovider _provider = null;
public static b4a.bitdesing.tomapedidos.ftpserver _server = null;
public static b4a.bitdesing.tomapedidos.login_c._sellerdata _seller = null;
public b4a.example.dateutils _dateutils = null;
public b4a.bitdesing.tomapedidos.main _main = null;
public b4a.bitdesing.tomapedidos.b4xpages _b4xpages = null;
public b4a.bitdesing.tomapedidos.b4xcollections _b4xcollections = null;
public b4a.bitdesing.tomapedidos.xuiviewsutils _xuiviewsutils = null;
public static class _businessdata{
public boolean IsInitialized;
public String RAZONSOCIAL;
public String DOMICILIO;
public String NRCUIT;
public String COTIZACION;
public String FTP;
public void Initialize() {
IsInitialized = true;
RAZONSOCIAL = "";
DOMICILIO = "";
NRCUIT = "";
COTIZACION = "";
FTP = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 68;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return false;
}
public static boolean  _existdatabase() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub ExistDataBase() As Boolean";
 //BA.debugLineNum = 126;BA.debugLine="If File.Exists(Route, DataBase) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_route,_database)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 127;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 129;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return false;
}
public static boolean  _existdatabasebackup() throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub ExistDataBaseBackup() As Boolean";
 //BA.debugLineNum = 134;BA.debugLine="If File.Exists(Route, DataBaseBackup) = False The";
if (anywheresoftware.b4a.keywords.Common.File.Exists(_route,_databasebackup)==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 135;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
 //BA.debugLineNum = 137;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return false;
}
public static Object  _getfileuri(String _filename) throws Exception{
anywheresoftware.b4j.object.JavaObject _f = null;
anywheresoftware.b4j.object.JavaObject _fp = null;
anywheresoftware.b4j.object.JavaObject _context = null;
 //BA.debugLineNum = 165;BA.debugLine="Public Sub GetFileUri (FileName As String) As Obje";
 //BA.debugLineNum = 167;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 168;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Rou";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(_route),(Object)(_filename)});
 //BA.debugLineNum = 169;BA.debugLine="Dim fp As JavaObject";
_fp = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 170;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 171;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
 //BA.debugLineNum = 172;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.F";
_fp.InitializeStatic("androidx.core.content.FileProvider");
 //BA.debugLineNum = 173;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(contex";
if (true) return _fp.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim DataBase As String = \"moviles.db\"";
_database = "moviles.db";
 //BA.debugLineNum = 11;BA.debugLine="Dim DataBaseBackup As String = \"moviles_backup.db";
_databasebackup = "moviles_backup.db";
 //BA.debugLineNum = 12;BA.debugLine="Dim Route As String";
_route = "";
 //BA.debugLineNum = 13;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 15;BA.debugLine="Dim sql As SQL";
_sql = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 16;BA.debugLine="Dim rs As ResultSet";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public Provider As FileProvider";
_provider = new b4a.bitdesing.tomapedidos.fileprovider();
 //BA.debugLineNum = 19;BA.debugLine="Public Server As FTPServer";
_server = new b4a.bitdesing.tomapedidos.ftpserver();
 //BA.debugLineNum = 22;BA.debugLine="Dim Seller As SellerData";
_seller = new b4a.bitdesing.tomapedidos.login_c._sellerdata();
 //BA.debugLineNum = 24;BA.debugLine="Type BusinessData (RAZONSOCIAL As String, DOMICIL";
;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public static b4a.bitdesing.tomapedidos.starter._businessdata  _selectbusiness() throws Exception{
b4a.bitdesing.tomapedidos.starter._businessdata _bd = null;
 //BA.debugLineNum = 111;BA.debugLine="Public Sub SelectBusiness() As BusinessData";
 //BA.debugLineNum = 112;BA.debugLine="sql.Initialize(Route, DataBase, True)";
_sql.Initialize(_route,_database,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 113;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM ParaMovil\")";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM ParaMovil")));
 //BA.debugLineNum = 114;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 115;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 116;BA.debugLine="Dim BD As BusinessData";
_bd = new b4a.bitdesing.tomapedidos.starter._businessdata();
 //BA.debugLineNum = 117;BA.debugLine="BD.RAZONSOCIAL = rs.GetString(\"RAZONSOCIAL\")";
_bd.RAZONSOCIAL /*String*/  = _rs.GetString("RAZONSOCIAL");
 //BA.debugLineNum = 118;BA.debugLine="BD.FTP = rs.GetString(\"FTP\")";
_bd.FTP /*String*/  = _rs.GetString("FTP");
 }
;
 };
 //BA.debugLineNum = 121;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 122;BA.debugLine="Return BD";
if (true) return _bd;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public static b4a.bitdesing.tomapedidos.customers_c._customersdata  _selectcustomer(int _id) throws Exception{
b4a.bitdesing.tomapedidos.customers_c._customersdata _cd = null;
 //BA.debugLineNum = 75;BA.debugLine="Public Sub SelectCustomer (id As Int) As Customers";
 //BA.debugLineNum = 77;BA.debugLine="sql.Initialize(Route, DataBase, True)";
_sql.Initialize(_route,_database,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 78;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM CliMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM CliMovil WHERE (CODIGO = "+BA.NumberToString(_id)+")")));
 //BA.debugLineNum = 79;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 80;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 81;BA.debugLine="Dim CD As CustomersData";
_cd = new b4a.bitdesing.tomapedidos.customers_c._customersdata();
 //BA.debugLineNum = 82;BA.debugLine="CD.CODIGO = rs.GetString(\"CODIGO\")";
_cd.CODIGO /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODIGO")));
 //BA.debugLineNum = 83;BA.debugLine="CD.NOMBRE = rs.GetString(\"NOMBRE\")";
_cd.NOMBRE /*String*/  = _rs.GetString("NOMBRE");
 //BA.debugLineNum = 84;BA.debugLine="CD.DOMICILIO = rs.GetString(\"DOMICILIO\")";
_cd.DOMICILIO /*String*/  = _rs.GetString("DOMICILIO");
 //BA.debugLineNum = 85;BA.debugLine="CD.LOCALIDAD = rs.GetString(\"LOCALIDAD\")";
_cd.LOCALIDAD /*String*/  = _rs.GetString("LOCALIDAD");
 //BA.debugLineNum = 86;BA.debugLine="CD.TELEFONO = rs.GetString(\"TELEFONO\")";
_cd.TELEFONO /*String*/  = _rs.GetString("TELEFONO");
 //BA.debugLineNum = 87;BA.debugLine="CD.NROCUIT = rs.GetString(\"NROCUIT\")";
_cd.NROCUIT /*String*/  = _rs.GetString("NROCUIT");
 //BA.debugLineNum = 88;BA.debugLine="CD.CODCATIVA = rs.GetString(\"CODCATIVA\")";
_cd.CODCATIVA /*int*/  = (int)(Double.parseDouble(_rs.GetString("CODCATIVA")));
 //BA.debugLineNum = 89;BA.debugLine="CD.NROLPRECIOS = rs.GetString(\"NROLPRECIOS\")";
_cd.NROLPRECIOS /*int*/  = (int)(Double.parseDouble(_rs.GetString("NROLPRECIOS")));
 //BA.debugLineNum = 90;BA.debugLine="CD.SALDO = rs.GetString(\"SALDO\")";
_cd.SALDO /*double*/  = (double)(Double.parseDouble(_rs.GetString("SALDO")));
 }
;
 };
 //BA.debugLineNum = 93;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 94;BA.debugLine="Return CD";
if (true) return _cd;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public static b4a.bitdesing.tomapedidos.products_c._productsdata  _selectproduct(int _id) throws Exception{
b4a.bitdesing.tomapedidos.products_c._productsdata _pd = null;
 //BA.debugLineNum = 98;BA.debugLine="Public Sub SelectProduct (id As Int) As ProductsDa";
 //BA.debugLineNum = 99;BA.debugLine="sql.Initialize(Route, DataBase, True)";
_sql.Initialize(_route,_database,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 100;BA.debugLine="rs = sql.ExecQuery(\"SELECT * FROM ArtMovil WHERE";
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql.ExecQuery("SELECT * FROM ArtMovil WHERE (CODIGO = "+BA.NumberToString(_id)+")")));
 //BA.debugLineNum = 101;BA.debugLine="If rs.RowCount > 0 Then";
if (_rs.getRowCount()>0) { 
 //BA.debugLineNum = 102;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
 //BA.debugLineNum = 103;BA.debugLine="Dim PD As ProductsData";
_pd = new b4a.bitdesing.tomapedidos.products_c._productsdata();
 //BA.debugLineNum = 104;BA.debugLine="PD.DESCRIPCION = rs.GetString(\"DESCRIPCION\")";
_pd.DESCRIPCION /*String*/  = _rs.GetString("DESCRIPCION");
 }
;
 };
 //BA.debugLineNum = 107;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 108;BA.debugLine="Return PD";
if (true) return _pd;
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 44;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (processBA);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 49;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 51;BA.debugLine="Route = rp.GetSafeDirDefaultExternal(\"\")";
_route = _rp.GetSafeDirDefaultExternal("");
 //BA.debugLineNum = 53;BA.debugLine="Server.Initialize(Main, \"FTPServer\")";
_server._initialize /*String*/ (processBA,(Object)(mostCurrent._main.getObject()),"FTPServer");
 //BA.debugLineNum = 54;BA.debugLine="Server.SetPorts(51041, 51042, 51142)";
_server._setports /*String*/ ((int) (51041),(int) (51042),(int) (51142));
 //BA.debugLineNum = 55;BA.debugLine="Server.AddUser(\"Test\", \"test\")";
_server._adduser /*String*/ ("Test","test");
 //BA.debugLineNum = 56;BA.debugLine="Server.BaseDir = Route";
_server._basedir /*String*/  = _route;
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 61;BA.debugLine="If Server.Running Then";
if (_server._getrunning /*boolean*/ ()) { 
 //BA.debugLineNum = 62;BA.debugLine="Server.Stop";
_server._stop /*String*/ ();
 };
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public static String  _sharedatabase() throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
anywheresoftware.b4a.objects.collections.List _uris = null;
anywheresoftware.b4a.objects.collections.List _files = null;
String _bdfile = "";
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _u = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 141;BA.debugLine="Sub ShareDataBase";
 //BA.debugLineNum = 143;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 144;BA.debugLine="i.Initialize(\"android.intent.action.SEND_MULTIPLE";
_i.Initialize("android.intent.action.SEND_MULTIPLE","");
 //BA.debugLineNum = 145;BA.debugLine="i.SetType(\"text/plain\")";
_i.SetType("text/plain");
 //BA.debugLineNum = 147;BA.debugLine="Dim Uris As List";
_uris = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 148;BA.debugLine="Uris.Initialize";
_uris.Initialize();
 //BA.debugLineNum = 150;BA.debugLine="Dim Files As List=File.ListFiles(Route)";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = anywheresoftware.b4a.keywords.Common.File.ListFiles(_route);
 //BA.debugLineNum = 151;BA.debugLine="For Each bdfile As String In Files";
{
final anywheresoftware.b4a.BA.IterableList group7 = _files;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_bdfile = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 152;BA.debugLine="Log(bdfile)";
anywheresoftware.b4a.keywords.Common.LogImpl("71572875",_bdfile,0);
 //BA.debugLineNum = 153;BA.debugLine="Dim u As Uri = GetFileUri(bdfile)";
_u = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
_u = (anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper(), (android.net.Uri)(_getfileuri(_bdfile)));
 //BA.debugLineNum = 154;BA.debugLine="Uris.Add(u)";
_uris.Add((Object)(_u.getObject()));
 }
};
 //BA.debugLineNum = 157;BA.debugLine="Dim jo As JavaObject = i";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_i.getObject()));
 //BA.debugLineNum = 158;BA.debugLine="jo.RunMethod(\"putParcelableArrayListExtra\", Array";
_jo.RunMethod("putParcelableArrayListExtra",new Object[]{(Object)("android.intent.extra.STREAM"),(Object)(_uris.getObject())});
 //BA.debugLineNum = 159;BA.debugLine="i.Flags = 1";
_i.setFlags((int) (1));
 //BA.debugLineNum = 161;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return "";
}
}
