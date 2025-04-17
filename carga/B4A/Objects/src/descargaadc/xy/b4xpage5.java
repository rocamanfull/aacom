package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage5 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage5");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage5.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.net.FTPWrapper _ftp = null;
public String _carpetalocal = "";
public String[] _archivos = null;
public anywheresoftware.b4a.objects.collections.List _archivosfallidos = null;
public int _indicearchivo = 0;
public anywheresoftware.b4a.objects.Timer _reintentotimer = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsubir = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 44;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 45;BA.debugLine="Root.LoadLayout(\"MainPage3\") ' Asegúrate de te";
_root.LoadLayout("MainPage3",ba);
 //BA.debugLineNum = 48;BA.debugLine="FTP.Initialize(\"FTP\", \"ftp.tuservidor.com\", 21";
_ftp.Initialize(ba,"FTP","ftp.tuservidor.com",(int) (21),"usuario","contraseña");
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private Root As B4XView 'ign";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private FTP As FTP";
_ftp = new anywheresoftware.b4a.net.FTPWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private carpetaLocal As String = File.DirRootE";
_carpetalocal = __c.File.getDirRootExternal()+"/MiCarpeta";
 //BA.debugLineNum = 28;BA.debugLine="Private archivos() As String";
_archivos = new String[(int) (0)];
java.util.Arrays.fill(_archivos,"");
 //BA.debugLineNum = 29;BA.debugLine="Private archivosFallidos As List";
_archivosfallidos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="Private indiceArchivo As Int";
_indicearchivo = 0;
 //BA.debugLineNum = 31;BA.debugLine="Private ReintentoTimer As Timer";
_reintentotimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 32;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 33;BA.debugLine="Private ListView As ListView";
_listview = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private btnSubir As B4XView";
_btnsubir = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 39;BA.debugLine="archivosFallidos.Initialize";
_archivosfallidos.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="ReintentoTimer.Initialize(\"ReintentoTimer\", 30";
_reintentotimer.Initialize(ba,"ReintentoTimer",(long) (300000));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
