package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage8 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage8");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage8.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public descargaadc.xy.b4xpage1 _page1 = null;
public descargaadc.xy.b4xpage2 _page2 = null;
public descargaadc.xy.fileprovider _provider = null;
public String _cargas = "";
public String _filedir = "";
public String _videofiledir = "";
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label11 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label16 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label17 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label18 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label21 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label22 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label23 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label24 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label25 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label26 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label27 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label28 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label29 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label30 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label9 = null;
public String _defec = "";
public String _defec2 = "";
public anywheresoftware.b4a.objects.EditTextWrapper _pallet1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label32 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label33 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label37 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label38 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label39 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label40 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label41 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label42 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label43 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label44 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label45 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label46 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label47 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label48 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label49 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label50 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label51 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label52 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label53 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label54 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label55 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label56 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label57 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label58 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label59 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label60 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label61 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label62 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label63 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label64 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label65 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label66 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label67 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label68 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label69 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label70 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label71 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label72 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label73 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label74 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label75 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label76 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label77 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label78 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label79 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label80 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label83 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label84 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label85 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label86 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label87 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label88 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label89 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label90 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label92 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label93 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label94 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label95 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label96 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpage1title = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label31 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label34 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label35 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label36 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label81 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label99 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso10a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso10b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso10c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso10d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso11a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso11b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso11c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso11d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso12a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso12b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso12c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso12d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso5a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso5b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso5c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso5d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso6a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso6b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso6c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso6d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso7a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso7b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso7c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso7d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso8a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso8d = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso8b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso8c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso9a = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso9b = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso9c = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso9d = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.collections.List _list2 = null;
anywheresoftware.b4a.objects.collections.List _list3 = null;
descargaadc.xy.b4xmainpage _mainpage = null;
 //BA.debugLineNum = 394;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 395;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 397;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 398;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 400;BA.debugLine="ScrollView1.Panel.LoadLayout(\"carg2peso2\")'(\"carg";
_scrollview1.getPanel().LoadLayout("carg2peso2",ba);
 //BA.debugLineNum = 412;BA.debugLine="Panel2.Color=Colors.RGB(222,184,135)";
_panel2.setColor(__c.Colors.RGB((int) (222),(int) (184),(int) (135)));
 //BA.debugLineNum = 414;BA.debugLine="lblPage1Title.Text=\"Bolsas Datos Carga 1\"";
_lblpage1title.setText(BA.ObjectToCharSequence("Bolsas Datos Carga 1"));
 //BA.debugLineNum = 415;BA.debugLine="Label3.Text=\"Bolsas Datos Carga 2\"";
_label3.setText(BA.ObjectToCharSequence("Bolsas Datos Carga 2"));
 //BA.debugLineNum = 416;BA.debugLine="Label19.Text=\"Bolsas Datos Carga 3\"";
_label19.setText(BA.ObjectToCharSequence("Bolsas Datos Carga 3"));
 //BA.debugLineNum = 417;BA.debugLine="Label70.Text=\"Bolsas Datos Carga 4\"";
_label70.setText(BA.ObjectToCharSequence("Bolsas Datos Carga 4"));
 //BA.debugLineNum = 418;BA.debugLine="B4XPages.SetTitle(Me, \"Bolsas Datos Cargas 1-4\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Bolsas Datos Cargas 1-4"));
 //BA.debugLineNum = 422;BA.debugLine="ScrollView1.Panel.Height = Panel2.Height";
_scrollview1.getPanel().setHeight(_panel2.getHeight());
 //BA.debugLineNum = 433;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 434;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga1"));
 //BA.debugLineNum = 435;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga2"));
 //BA.debugLineNum = 440;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa1"));
 //BA.debugLineNum = 441;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa2"));
 //BA.debugLineNum = 443;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 464;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"android48.png");
 //BA.debugLineNum = 465;BA.debugLine="Dim list2 As List";
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 466;BA.debugLine="Dim list3 As List";
_list3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 468;BA.debugLine="list2 = File.ReadList(cargas, \"marc.txt\")";
_list2 = __c.File.ReadList(_cargas,"marc.txt");
 //BA.debugLineNum = 470;BA.debugLine="list3 = File.ReadList(cargas, \"emp.txt\")''emp";
_list3 = __c.File.ReadList(_cargas,"emp.txt");
 //BA.debugLineNum = 471;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 472;BA.debugLine="MainPage.bol1=True";
_mainpage._bol1 /*boolean*/  = __c.True;
 //BA.debugLineNum = 473;BA.debugLine="Log(\"carg1 es \"& MainPage.carg1)";
__c.LogImpl("873400399","carg1 es "+BA.ObjectToString(_mainpage._carg1 /*boolean*/ ),0);
 //BA.debugLineNum = 474;BA.debugLine="Log(\"carg2 es \"& MainPage.carg2)";
__c.LogImpl("873400400","carg2 es "+BA.ObjectToString(_mainpage._carg2 /*boolean*/ ),0);
 //BA.debugLineNum = 475;BA.debugLine="Log(\"bol1 es \"& MainPage.bol1)";
__c.LogImpl("873400401","bol1 es "+BA.ObjectToString(_mainpage._bol1 /*boolean*/ ),0);
 //BA.debugLineNum = 476;BA.debugLine="Log(\"bol2 es \"& MainPage.bol2)";
__c.LogImpl("873400402","bol2 es "+BA.ObjectToString(_mainpage._bol2 /*boolean*/ ),0);
 //BA.debugLineNum = 477;BA.debugLine="Log(\"super es \"& MainPage.super)";
__c.LogImpl("873400403","super es "+BA.ObjectToString(_mainpage._super /*boolean*/ ()),0);
 //BA.debugLineNum = 518;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 519;BA.debugLine="MainPage.bol1=True";
_mainpage._bol1 /*boolean*/  = __c.True;
 //BA.debugLineNum = 524;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 1109;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 1110;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 1111;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 1113;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 1114;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 1116;BA.debugLine="If Tag =\"Carga1\" Then";
if ((_tag).equals("Carga1")) { 
 //BA.debugLineNum = 1117;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 1119;BA.debugLine="If Tag =\"Carga2\" Then";
if ((_tag).equals("Carga2")) { 
 //BA.debugLineNum = 1120;BA.debugLine="B4XPages.ShowPage(\"Page 3\")";
_b4xpages._showpage /*String*/ (ba,"Page 3");
 };
 //BA.debugLineNum = 1122;BA.debugLine="If Tag =\"Cargac1\" Then";
if ((_tag).equals("Cargac1")) { 
 //BA.debugLineNum = 1123;BA.debugLine="B4XPages.ShowPage(\"Page 4\")";
_b4xpages._showpage /*String*/ (ba,"Page 4");
 };
 //BA.debugLineNum = 1126;BA.debugLine="If Tag =\"Cargac2\" Then";
if ((_tag).equals("Cargac2")) { 
 //BA.debugLineNum = 1127;BA.debugLine="B4XPages.ShowPage(\"Page 5\")";
_b4xpages._showpage /*String*/ (ba,"Page 5");
 };
 //BA.debugLineNum = 1129;BA.debugLine="If Tag =\"Cargac3\" Then";
if ((_tag).equals("Cargac3")) { 
 //BA.debugLineNum = 1130;BA.debugLine="B4XPages.ShowPage(\"Page 6\")";
_b4xpages._showpage /*String*/ (ba,"Page 6");
 };
 //BA.debugLineNum = 1132;BA.debugLine="If Tag =\"Bolsa1\" Then";
if ((_tag).equals("Bolsa1")) { 
 //BA.debugLineNum = 1133;BA.debugLine="B4XPages.ShowPage(\"Page 7\")";
_b4xpages._showpage /*String*/ (ba,"Page 7");
 };
 //BA.debugLineNum = 1135;BA.debugLine="If Tag =\"Bolsa2\" Then";
if ((_tag).equals("Bolsa2")) { 
 //BA.debugLineNum = 1136;BA.debugLine="B4XPages.ShowPage(\"Page 8\")";
_b4xpages._showpage /*String*/ (ba,"Page 8");
 };
 //BA.debugLineNum = 1138;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 };
 //BA.debugLineNum = 1145;BA.debugLine="End Sub";
return "";
}
public String  _blanqueo() throws Exception{
 //BA.debugLineNum = 1478;BA.debugLine="public  Sub blanqueo";
 //BA.debugLineNum = 1480;BA.debugLine="pallet1.Text = \"\"";
_pallet1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1481;BA.debugLine="pallet2.Text = \"\"";
_pallet2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1482;BA.debugLine="pallet3.Text = \"\"";
_pallet3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1483;BA.debugLine="pallet4.Text = \"\"";
_pallet4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1485;BA.debugLine="peso10a.Text = \"\"";
_peso10a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1486;BA.debugLine="peso10b.Text = \"\"";
_peso10b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1487;BA.debugLine="peso10c.Text = \"\"";
_peso10c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1488;BA.debugLine="peso10d.Text = \"\"";
_peso10d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1489;BA.debugLine="peso11a.Text = \"\"";
_peso11a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1490;BA.debugLine="peso11b.Text = \"\"";
_peso11b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1491;BA.debugLine="peso11c.Text = \"\"";
_peso11c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1492;BA.debugLine="peso11d.Text = \"\"";
_peso11d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1493;BA.debugLine="peso12a.Text = \"\"";
_peso12a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1494;BA.debugLine="peso12b.Text = \"\"";
_peso12b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1495;BA.debugLine="peso12c.Text = \"\"";
_peso12c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1496;BA.debugLine="peso12d.Text = \"\"";
_peso12d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1497;BA.debugLine="peso1a.Text = \"\"";
_peso1a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1498;BA.debugLine="peso1b.Text = \"\"";
_peso1b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1499;BA.debugLine="peso1c.Text = \"\"";
_peso1c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1500;BA.debugLine="peso1d.Text = \"\"";
_peso1d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1501;BA.debugLine="peso2a.Text = \"\"";
_peso2a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1502;BA.debugLine="peso2b.Text = \"\"";
_peso2b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1503;BA.debugLine="peso2c.Text = \"\"";
_peso2c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1504;BA.debugLine="peso2d.Text = \"\"";
_peso2d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1505;BA.debugLine="peso3a.Text = \"\"";
_peso3a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1506;BA.debugLine="peso3b.Text = \"\"";
_peso3b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1507;BA.debugLine="peso3c.Text = \"\"";
_peso3c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1508;BA.debugLine="peso3d.Text = \"\"";
_peso3d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1509;BA.debugLine="peso4a.Text = \"\"";
_peso4a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1510;BA.debugLine="peso4b.Text = \"\"";
_peso4b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1511;BA.debugLine="peso4c.Text = \"\"";
_peso4c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1512;BA.debugLine="peso4d.Text = \"\"";
_peso4d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1513;BA.debugLine="peso5a.Text = \"\"";
_peso5a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1514;BA.debugLine="peso5b.Text = \"\"";
_peso5b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1515;BA.debugLine="peso5c.Text = \"\"";
_peso5c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1516;BA.debugLine="peso5d.Text = \"\"";
_peso5d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1517;BA.debugLine="peso6a.Text = \"\"";
_peso6a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1518;BA.debugLine="peso6b.Text = \"\"";
_peso6b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1519;BA.debugLine="peso6c.Text = \"\"";
_peso6c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1520;BA.debugLine="peso6d.Text = \"\"";
_peso6d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1521;BA.debugLine="peso7a.Text = \"\"";
_peso7a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1522;BA.debugLine="peso7b.Text = \"\"";
_peso7b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1523;BA.debugLine="peso7c.Text = \"\"";
_peso7c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1524;BA.debugLine="peso7d.Text = \"\"";
_peso7d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1525;BA.debugLine="peso8a.Text = \"\"";
_peso8a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1526;BA.debugLine="peso8b.Text = \"\"";
_peso8b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1527;BA.debugLine="peso8c.Text = \"\"";
_peso8c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1528;BA.debugLine="peso8d.Text = \"\"";
_peso8d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1529;BA.debugLine="peso9a.Text = \"\"";
_peso9a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1530;BA.debugLine="peso9b.Text = \"\"";
_peso9b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1531;BA.debugLine="peso9c.Text = \"\"";
_peso9c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1532;BA.debugLine="peso9d.Text = \"\"";
_peso9d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1534;BA.debugLine="End Sub";
return "";
}
public String  _blaqueo() throws Exception{
 //BA.debugLineNum = 890;BA.debugLine="Sub blaqueo";
 //BA.debugLineNum = 893;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso1a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 893;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso2a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 893;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso3a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 893;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso4a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 894;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso5a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 894;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso6a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 894;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso7a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 894;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso8a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 895;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso9a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 895;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso10a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 895;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso11a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 895;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso12a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 898;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso1b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 898;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso2b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 898;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso3b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 898;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso4b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 899;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso5b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 899;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso6b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 899;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso7b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 899;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso8b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 900;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso9b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 900;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso10b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 900;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso11b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 900;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso12b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 903;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso1c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 903;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso2c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 903;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso3c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 903;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso4c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 904;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso5c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 904;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso6c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 904;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso7c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 904;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso8c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 905;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso9c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 905;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso10c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 905;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso11c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 905;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso12c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 908;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso1d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 908;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso2d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 908;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso3d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 908;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso4d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 909;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso5d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 909;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso6d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 909;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso7d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 909;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso8d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 910;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso9d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 910;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso10d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 910;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso11d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 910;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso12d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 1465;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 1466;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1467;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
 //BA.debugLineNum = 1468;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 1469;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1470;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
 //BA.debugLineNum = 1471;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 1472;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1473;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 1474;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 1475;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1476;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 6;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim Bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Public Page1 As B4XPage1";
_page1 = new descargaadc.xy.b4xpage1();
 //BA.debugLineNum = 10;BA.debugLine="Public Page2 As B4XPage2";
_page2 = new descargaadc.xy.b4xpage2();
 //BA.debugLineNum = 11;BA.debugLine="Public Provider As FileProvider";
_provider = new descargaadc.xy.fileprovider();
 //BA.debugLineNum = 13;BA.debugLine="Private cargas,filedir,videofiledir As String";
_cargas = "";
_filedir = "";
_videofiledir = "";
 //BA.debugLineNum = 14;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 16;BA.debugLine="cargas = rp.GetSafeDirDefaultExternal(\"cargas\")";
_cargas = _rp.GetSafeDirDefaultExternal("cargas");
 //BA.debugLineNum = 21;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label14 As Label";
_label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Label16 As Label";
_label16 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label17 As Label";
_label17 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label18 As Label";
_label18 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label19 As Label";
_label19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label20 As Label";
_label20 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Label21 As Label";
_label21 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Label22 As Label";
_label22 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Label23 As Label";
_label23 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Label24 As Label";
_label24 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Label25 As Label";
_label25 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Label26 As Label";
_label26 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Label27 As Label";
_label27 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Label28 As Label";
_label28 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Label29 As Label";
_label29 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label30 As Label";
_label30 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 111;BA.debugLine="Private defec As String";
_defec = "";
 //BA.debugLineNum = 112;BA.debugLine="Private defec2 As String";
_defec2 = "";
 //BA.debugLineNum = 120;BA.debugLine="Public pallet1 As EditText";
_pallet1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Public pallet2 As EditText";
_pallet2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 122;BA.debugLine="Public pallet3 As EditText";
_pallet3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 123;BA.debugLine="Public pallet4 As EditText";
_pallet4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 147;BA.debugLine="Public sello1 As EditText";
_sello1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 148;BA.debugLine="Public sello2 As EditText";
_sello2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 149;BA.debugLine="Public sello3 As EditText";
_sello3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Public sello4 As EditText";
_sello4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 248;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 249;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 250;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 251;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Private Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 260;BA.debugLine="Private Label32 As Label";
_label32 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 261;BA.debugLine="Private Label33 As Label";
_label33 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 262;BA.debugLine="Private Label37 As Label";
_label37 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 263;BA.debugLine="Private Label38 As Label";
_label38 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 264;BA.debugLine="Private Label39 As Label";
_label39 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 265;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 266;BA.debugLine="Private Label40 As Label";
_label40 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 267;BA.debugLine="Private Label41 As Label";
_label41 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 268;BA.debugLine="Private Label42 As Label";
_label42 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 269;BA.debugLine="Private Label43 As Label";
_label43 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 270;BA.debugLine="Private Label44 As Label";
_label44 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 271;BA.debugLine="Private Label45 As Label";
_label45 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 272;BA.debugLine="Private Label46 As Label";
_label46 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 273;BA.debugLine="Private Label47 As Label";
_label47 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 274;BA.debugLine="Private Label48 As Label";
_label48 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 275;BA.debugLine="Private Label49 As Label";
_label49 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 276;BA.debugLine="Private Label50 As Label";
_label50 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 277;BA.debugLine="Private Label51 As Label";
_label51 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 278;BA.debugLine="Private Label52 As Label";
_label52 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 279;BA.debugLine="Private Label53 As Label";
_label53 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 280;BA.debugLine="Private Label54 As Label";
_label54 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 281;BA.debugLine="Private Label55 As Label";
_label55 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 282;BA.debugLine="Private Label56 As Label";
_label56 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 283;BA.debugLine="Private Label57 As Label";
_label57 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 284;BA.debugLine="Private Label58 As Label";
_label58 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 285;BA.debugLine="Private Label59 As Label";
_label59 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 286;BA.debugLine="Private Label60 As Label";
_label60 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 287;BA.debugLine="Private Label61 As Label";
_label61 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 288;BA.debugLine="Private Label62 As Label";
_label62 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 289;BA.debugLine="Private Label63 As Label";
_label63 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 290;BA.debugLine="Private Label64 As Label";
_label64 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 291;BA.debugLine="Private Label65 As Label";
_label65 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 292;BA.debugLine="Private Label66 As Label";
_label66 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 293;BA.debugLine="Private Label67 As Label";
_label67 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 294;BA.debugLine="Private Label68 As Label";
_label68 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 295;BA.debugLine="Private Label69 As Label";
_label69 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 296;BA.debugLine="Private Label70 As Label";
_label70 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 297;BA.debugLine="Private Label71 As Label";
_label71 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 298;BA.debugLine="Private Label72 As Label";
_label72 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 299;BA.debugLine="Private Label73 As Label";
_label73 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 300;BA.debugLine="Private Label74 As Label";
_label74 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 301;BA.debugLine="Private Label75 As Label";
_label75 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 302;BA.debugLine="Private Label76 As Label";
_label76 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 303;BA.debugLine="Private Label77 As Label";
_label77 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 304;BA.debugLine="Private Label78 As Label";
_label78 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 305;BA.debugLine="Private Label79 As Label";
_label79 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 306;BA.debugLine="Private Label80 As Label";
_label80 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 309;BA.debugLine="Private Label83 As Label";
_label83 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 310;BA.debugLine="Private Label84 As Label";
_label84 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 311;BA.debugLine="Private Label85 As Label";
_label85 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 312;BA.debugLine="Private Label86 As Label";
_label86 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 313;BA.debugLine="Private Label87 As Label";
_label87 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 314;BA.debugLine="Private Label88 As Label";
_label88 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 315;BA.debugLine="Private Label89 As Label";
_label89 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 316;BA.debugLine="Private Label90 As Label";
_label90 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 318;BA.debugLine="Private Label92 As Label";
_label92 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 319;BA.debugLine="Private Label93 As Label";
_label93 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 320;BA.debugLine="Private Label94 As Label";
_label94 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 321;BA.debugLine="Private Label95 As Label";
_label95 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 322;BA.debugLine="Private Label96 As Label";
_label96 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 323;BA.debugLine="Private lblPage1Title As Label";
_lblpage1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 328;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 330;BA.debugLine="Private Label31 As Label";
_label31 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 331;BA.debugLine="Private Label34 As Label";
_label34 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 332;BA.debugLine="Private Label35 As Label";
_label35 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 333;BA.debugLine="Private Label36 As Label";
_label36 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 334;BA.debugLine="Private Label81 As Label";
_label81 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 335;BA.debugLine="Private label99 As Label";
_label99 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 338;BA.debugLine="Public peso10a As EditText";
_peso10a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 339;BA.debugLine="Public peso10b As EditText";
_peso10b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 340;BA.debugLine="Public peso10c As EditText";
_peso10c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 341;BA.debugLine="Public peso10d As EditText";
_peso10d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 342;BA.debugLine="Public peso11a As EditText";
_peso11a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 343;BA.debugLine="Public peso11b As EditText";
_peso11b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 344;BA.debugLine="Public peso11c As EditText";
_peso11c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 345;BA.debugLine="Public peso11d As EditText";
_peso11d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 346;BA.debugLine="Public peso12a As EditText";
_peso12a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 347;BA.debugLine="Public peso12b As EditText";
_peso12b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 348;BA.debugLine="Public peso12c As EditText";
_peso12c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 349;BA.debugLine="Public peso12d As EditText";
_peso12d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 350;BA.debugLine="Public peso1a As EditText";
_peso1a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 351;BA.debugLine="Public peso1b As EditText";
_peso1b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 352;BA.debugLine="Public peso1c As EditText";
_peso1c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 353;BA.debugLine="Public peso1d As EditText";
_peso1d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 354;BA.debugLine="Public peso2a As EditText";
_peso2a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 355;BA.debugLine="Public peso2b As EditText";
_peso2b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 356;BA.debugLine="Public peso2c As EditText";
_peso2c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 357;BA.debugLine="Public peso2d As EditText";
_peso2d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 358;BA.debugLine="Public peso3a As EditText";
_peso3a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 359;BA.debugLine="Public peso3b As EditText";
_peso3b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 360;BA.debugLine="Public peso3c As EditText";
_peso3c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 361;BA.debugLine="Public peso3d As EditText";
_peso3d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 362;BA.debugLine="Public peso4a As EditText";
_peso4a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 363;BA.debugLine="Public peso4b As EditText";
_peso4b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 364;BA.debugLine="Public peso4c As EditText";
_peso4c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 365;BA.debugLine="Public peso4d As EditText";
_peso4d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 366;BA.debugLine="Public peso5a As EditText";
_peso5a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 367;BA.debugLine="Public peso5b As EditText";
_peso5b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 368;BA.debugLine="Public peso5c As EditText";
_peso5c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 369;BA.debugLine="Public peso5d As EditText";
_peso5d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 370;BA.debugLine="Public peso6a As EditText";
_peso6a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 371;BA.debugLine="Public peso6b As EditText";
_peso6b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 372;BA.debugLine="Public peso6c As EditText";
_peso6c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 373;BA.debugLine="Public peso6d As EditText";
_peso6d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 374;BA.debugLine="Public peso7a As EditText";
_peso7a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 375;BA.debugLine="Public peso7b As EditText";
_peso7b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 376;BA.debugLine="Public peso7c As EditText";
_peso7c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 377;BA.debugLine="Public peso7d As EditText";
_peso7d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 378;BA.debugLine="Public peso8a As EditText";
_peso8a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 379;BA.debugLine="Public peso8d As EditText";
_peso8d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 380;BA.debugLine="Public peso8b As EditText";
_peso8b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 381;BA.debugLine="Public peso8c As EditText";
_peso8c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 382;BA.debugLine="Public peso9a As EditText";
_peso9a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 383;BA.debugLine="Public peso9b As EditText";
_peso9b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 384;BA.debugLine="Public peso9c As EditText";
_peso9c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 385;BA.debugLine="Public peso9d As EditText";
_peso9d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public String  _date1_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1039;BA.debugLine="Sub date1_Click 'libreria dialogs2";
 //BA.debugLineNum = 1040;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1041;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1042;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1043;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1045;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1047;BA.debugLine="sello1.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello1.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1051;BA.debugLine="End Sub";
return "";
}
public String  _date2_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1052;BA.debugLine="Sub date2_Click 'libreria dialogs2";
 //BA.debugLineNum = 1053;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1054;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1055;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1056;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1058;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1060;BA.debugLine="sello2.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello2.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1064;BA.debugLine="End Sub";
return "";
}
public String  _date3_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1065;BA.debugLine="Sub date3_Click 'libreria dialogs2";
 //BA.debugLineNum = 1066;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1067;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1068;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1069;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1071;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1073;BA.debugLine="sello3.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello3.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1077;BA.debugLine="End Sub";
return "";
}
public String  _date4_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1078;BA.debugLine="Sub date4_Click 'libreria dialogs2";
 //BA.debugLineNum = 1079;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1080;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1081;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1082;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1084;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1086;BA.debugLine="sello4.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello4.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1090;BA.debugLine="End Sub";
return "";
}
public String  _final2() throws Exception{
String _a = "";
String _b = "";
String _c = "";
String _d = "";
String _e = "";
String _f = "";
String _g = "";
String _h = "";
String _i = "";
String _j = "";
String _k = "";
String _l = "";
String _ll = "";
String _m = "";
String _n = "";
String _o = "";
String _p = "";
String _q = "";
String _r = "";
String _s = "";
String _t = "";
String _u = "";
String _v = "";
String _w = "";
String _x = "";
String _y = "";
String _z = "";
String _aa = "";
String _ab = "";
String _ac = "";
String _ad = "";
String _ftp3 = "";
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer2 = null;
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer3 = null;
 //BA.debugLineNum = 550;BA.debugLine="Sub final2 'genera el archivo .txt";
 //BA.debugLineNum = 551;BA.debugLine="Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t";
_a = "";
_b = "";
_c = "";
_d = "";
_e = "";
_f = "";
_g = "";
_h = "";
_i = "";
_j = "";
_k = "";
_l = "";
_ll = "";
_m = "";
_n = "";
_o = "";
_p = "";
_q = "";
_r = "";
_s = "";
_t = "";
_u = "";
_v = "";
_w = "";
_x = "";
_y = "";
_z = "";
_aa = "";
_ab = "";
_ac = "";
_ad = "";
_ftp3 = "";
 //BA.debugLineNum = 552;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 553;BA.debugLine="Dim writer2 As  TextWriter";
_writer2 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 554;BA.debugLine="Dim writer3 As TextWriter";
_writer3 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 557;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 558;BA.debugLine="ftp3 =rp.GetSafeDirDefaultExternal(\"Ftp3\")";
_ftp3 = _rp.GetSafeDirDefaultExternal("Ftp3");
 //BA.debugLineNum = 626;BA.debugLine="c = pallet1.text & \";\" & peso1b.text & \";\" & peso";
_c = _pallet1.getText()+";"+_peso1b.getText()+";"+_peso2b.getText()+";"+_peso3b.getText()+";"+_peso4b.getText()+";"+_peso5b.getText()+";"+_peso6b.getText()+";"+_peso7b.getText()+";"+_peso8b.getText()+";"+_peso9b.getText()+";"+_peso10b.getText()+";"+_peso11b.getText()+";"+_peso12b.getText();
 //BA.debugLineNum = 627;BA.debugLine="d = pallet2.text & \";\" & peso1a.text & \";\" & peso";
_d = _pallet2.getText()+";"+_peso1a.getText()+";"+_peso2a.getText()+";"+_peso3a.getText()+";"+_peso4a.getText()+";"+_peso5a.getText()+";"+_peso6a.getText()+";"+_peso7a.getText()+";"+_peso8a.getText()+";"+_peso9a.getText()+";"+_peso10a.getText()+";"+_peso11a.getText()+";"+_peso12a.getText();
 //BA.debugLineNum = 628;BA.debugLine="e = pallet3.text & \";\" & peso1c.text & \";\" & peso";
_e = _pallet3.getText()+";"+_peso1c.getText()+";"+_peso2c.getText()+";"+_peso3c.getText()+";"+_peso4c.getText()+";"+_peso5c.getText()+";"+_peso6c.getText()+";"+_peso7c.getText()+";"+_peso8c.getText()+";"+_peso9c.getText()+";"+_peso10c.getText()+";"+_peso11c.getText()+";"+_peso12c.getText();
 //BA.debugLineNum = 629;BA.debugLine="f = pallet4.text & \";\" & peso1d.text & \";\" & peso";
_f = _pallet4.getText()+";"+_peso1d.getText()+";"+_peso2d.getText()+";"+_peso3d.getText()+";"+_peso4d.getText()+";"+_peso5d.getText()+";"+_peso6d.getText()+";"+_peso7d.getText()+";"+_peso8d.getText()+";"+_peso9d.getText()+";"+_peso10d.getText()+";"+_peso11d.getText()+";"+_peso12d.getText();
 //BA.debugLineNum = 651;BA.debugLine="writer2.Initialize(File.OpenOutput( ftp3 ,\"bol\" &";
_writer2.Initialize((java.io.OutputStream)(__c.File.OpenOutput(_ftp3,"bol"+"zz"+".csv",__c.False).getObject()));
 //BA.debugLineNum = 652;BA.debugLine="writer2.WriteLine(i)";
_writer2.WriteLine(_i);
 //BA.debugLineNum = 653;BA.debugLine="writer2.WriteLine(a)";
_writer2.WriteLine(_a);
 //BA.debugLineNum = 654;BA.debugLine="writer2.WriteLine(e)";
_writer2.WriteLine(_e);
 //BA.debugLineNum = 655;BA.debugLine="writer2.WriteLine(h)";
_writer2.WriteLine(_h);
 //BA.debugLineNum = 656;BA.debugLine="writer2.WriteLine(k)";
_writer2.WriteLine(_k);
 //BA.debugLineNum = 657;BA.debugLine="writer2.WriteLine(o)";
_writer2.WriteLine(_o);
 //BA.debugLineNum = 658;BA.debugLine="writer2.WriteLine(r)";
_writer2.WriteLine(_r);
 //BA.debugLineNum = 659;BA.debugLine="writer2.WriteLine(c)";
_writer2.WriteLine(_c);
 //BA.debugLineNum = 660;BA.debugLine="writer2.WriteLine(f)";
_writer2.WriteLine(_f);
 //BA.debugLineNum = 661;BA.debugLine="writer2.WriteLine(u)";
_writer2.WriteLine(_u);
 //BA.debugLineNum = 662;BA.debugLine="writer2.WriteLine(m)";
_writer2.WriteLine(_m);
 //BA.debugLineNum = 663;BA.debugLine="writer2.WriteLine(p)";
_writer2.WriteLine(_p);
 //BA.debugLineNum = 664;BA.debugLine="writer2.WriteLine(s)";
_writer2.WriteLine(_s);
 //BA.debugLineNum = 665;BA.debugLine="writer2.WriteLine(d)";
_writer2.WriteLine(_d);
 //BA.debugLineNum = 666;BA.debugLine="writer2.WriteLine(g)";
_writer2.WriteLine(_g);
 //BA.debugLineNum = 667;BA.debugLine="writer2.WriteLine(j)";
_writer2.WriteLine(_j);
 //BA.debugLineNum = 668;BA.debugLine="writer2.WriteLine(n)";
_writer2.WriteLine(_n);
 //BA.debugLineNum = 669;BA.debugLine="writer2.WriteLine(q)";
_writer2.WriteLine(_q);
 //BA.debugLineNum = 670;BA.debugLine="writer2.WriteLine(t)";
_writer2.WriteLine(_t);
 //BA.debugLineNum = 685;BA.debugLine="writer2.Close";
_writer2.Close();
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 389;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 390;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public String  _limitartexto(anywheresoftware.b4a.objects.EditTextWrapper _edt,String _new) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub LimitarTexto(edt As EditText, New As String)";
 //BA.debugLineNum = 884;BA.debugLine="If edt.Text.Length > 4 Then";
if (_edt.getText().length()>4) { 
 //BA.debugLineNum = 885;BA.debugLine="edt.Text = edt.Text.SubString2(0, 4)";
_edt.setText(BA.ObjectToCharSequence(_edt.getText().substring((int) (0),(int) (4))));
 //BA.debugLineNum = 886;BA.debugLine="edt.SelectionStart = 4 ' Mantiene el cursor al f";
_edt.setSelectionStart((int) (4));
 };
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public String  _limitartexto4(anywheresoftware.b4a.objects.EditTextWrapper _edt,String _new) throws Exception{
 //BA.debugLineNum = 847;BA.debugLine="Sub LimitarTexto4(edt As EditText, New As String)";
 //BA.debugLineNum = 848;BA.debugLine="If edt.Text.Length > 6 Then";
if (_edt.getText().length()>6) { 
 //BA.debugLineNum = 849;BA.debugLine="edt.Text = edt.Text.SubString2(0, 6)";
_edt.setText(BA.ObjectToCharSequence(_edt.getText().substring((int) (0),(int) (6))));
 //BA.debugLineNum = 850;BA.debugLine="edt.SelectionStart = 6 ' Mantiene el cursor al f";
_edt.setSelectionStart((int) (6));
 };
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return "";
}
public String  _llenado() throws Exception{
 //BA.debugLineNum = 913;BA.debugLine="Sub llenado";
 //BA.debugLineNum = 915;BA.debugLine="peso1a.Text = \"1\"";
_peso1a.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 916;BA.debugLine="peso2a.Text = \"2\"";
_peso2a.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 917;BA.debugLine="peso3a.Text = \"3\"";
_peso3a.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 918;BA.debugLine="peso4a.Text = \"4\"";
_peso4a.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 919;BA.debugLine="peso5a.Text = \"5\"";
_peso5a.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 920;BA.debugLine="peso6a.Text = \"6\"";
_peso6a.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 921;BA.debugLine="peso7a.Text = \"7\"";
_peso7a.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 922;BA.debugLine="peso8a.Text = \"8\"";
_peso8a.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 923;BA.debugLine="peso9a.Text = \"9\"";
_peso9a.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 924;BA.debugLine="peso10a.Text = \"10\"";
_peso10a.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 925;BA.debugLine="peso11a.Text = \"11\"";
_peso11a.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 926;BA.debugLine="peso12a.Text = \"12\"";
_peso12a.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 929;BA.debugLine="peso1b.Text = \"1\"";
_peso1b.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 930;BA.debugLine="peso2b.Text = \"2\"";
_peso2b.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 931;BA.debugLine="peso3b.Text = \"3\"";
_peso3b.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 932;BA.debugLine="peso4b.Text = \"4\"";
_peso4b.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 933;BA.debugLine="peso5b.Text = \"5\"";
_peso5b.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 934;BA.debugLine="peso6b.Text = \"6\"";
_peso6b.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 935;BA.debugLine="peso7b.Text = \"7\"";
_peso7b.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 936;BA.debugLine="peso8b.Text = \"8\"";
_peso8b.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 937;BA.debugLine="peso9b.Text = \"9\"";
_peso9b.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 938;BA.debugLine="peso10b.Text = \"10\"";
_peso10b.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 939;BA.debugLine="peso11b.Text = \"11\"";
_peso11b.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 940;BA.debugLine="peso12b.Text = \"12\"";
_peso12b.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 943;BA.debugLine="peso1c.Text = \"1\"";
_peso1c.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 944;BA.debugLine="peso2c.Text = \"2\"";
_peso2c.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 945;BA.debugLine="peso3c.Text = \"3\"";
_peso3c.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 946;BA.debugLine="peso4c.Text = \"4\"";
_peso4c.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 947;BA.debugLine="peso5c.Text = \"5\"";
_peso5c.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 948;BA.debugLine="peso6c.Text = \"6\"";
_peso6c.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 949;BA.debugLine="peso7c.Text = \"7\"";
_peso7c.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 950;BA.debugLine="peso8c.Text = \"8\"";
_peso8c.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 951;BA.debugLine="peso9c.Text = \"9\"";
_peso9c.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 952;BA.debugLine="peso10c.Text = \"10\"";
_peso10c.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 953;BA.debugLine="peso11c.Text = \"11\"";
_peso11c.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 954;BA.debugLine="peso12c.Text = \"12\"";
_peso12c.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 957;BA.debugLine="peso1d.Text = \"1\"";
_peso1d.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 958;BA.debugLine="peso2d.Text = \"2\"";
_peso2d.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 959;BA.debugLine="peso3d.Text = \"3\"";
_peso3d.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 960;BA.debugLine="peso4d.Text = \"4\"";
_peso4d.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 961;BA.debugLine="peso5d.Text = \"5\"";
_peso5d.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 962;BA.debugLine="peso6d.Text = \"6\"";
_peso6d.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 963;BA.debugLine="peso7d.Text = \"7\"";
_peso7d.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 964;BA.debugLine="peso8d.Text = \"8\"";
_peso8d.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 965;BA.debugLine="peso9d.Text = \"9\"";
_peso9d.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 966;BA.debugLine="peso10d.Text = \"10\"";
_peso10d.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 967;BA.debugLine="peso11d.Text = \"11\"";
_peso11d.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 968;BA.debugLine="peso12d.Text = \"12\"";
_peso12d.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 969;BA.debugLine="End Sub";
return "";
}
public String  _llenar_click() throws Exception{
 //BA.debugLineNum = 1608;BA.debugLine="Private Sub llenar_Click";
 //BA.debugLineNum = 1609;BA.debugLine="pallet1.Text=\"22\"";
_pallet1.setText(BA.ObjectToCharSequence("22"));
 //BA.debugLineNum = 1610;BA.debugLine="pallet2.Text=\"33\"";
_pallet2.setText(BA.ObjectToCharSequence("33"));
 //BA.debugLineNum = 1611;BA.debugLine="pallet3.Text=\"44\"";
_pallet3.setText(BA.ObjectToCharSequence("44"));
 //BA.debugLineNum = 1612;BA.debugLine="pallet4.Text=\"55\"";
_pallet4.setText(BA.ObjectToCharSequence("55"));
 //BA.debugLineNum = 1616;BA.debugLine="peso10a.text=\"35.6\"";
_peso10a.setText(BA.ObjectToCharSequence("35.6"));
 //BA.debugLineNum = 1620;BA.debugLine="peso10b.text=\"35.6\"";
_peso10b.setText(BA.ObjectToCharSequence("35.6"));
 //BA.debugLineNum = 1621;BA.debugLine="peso10c.text=\"36.6\"";
_peso10c.setText(BA.ObjectToCharSequence("36.6"));
 //BA.debugLineNum = 1622;BA.debugLine="peso10d.text=\"37.6\"";
_peso10d.setText(BA.ObjectToCharSequence("37.6"));
 //BA.debugLineNum = 1623;BA.debugLine="peso11a.text=\"38.6\"";
_peso11a.setText(BA.ObjectToCharSequence("38.6"));
 //BA.debugLineNum = 1624;BA.debugLine="peso11b.text=\"39.6\"";
_peso11b.setText(BA.ObjectToCharSequence("39.6"));
 //BA.debugLineNum = 1625;BA.debugLine="peso11c.text=\"40.6\"";
_peso11c.setText(BA.ObjectToCharSequence("40.6"));
 //BA.debugLineNum = 1626;BA.debugLine="peso11d.text=\"41.6\"";
_peso11d.setText(BA.ObjectToCharSequence("41.6"));
 //BA.debugLineNum = 1627;BA.debugLine="peso12a.text=\"42.6\"";
_peso12a.setText(BA.ObjectToCharSequence("42.6"));
 //BA.debugLineNum = 1628;BA.debugLine="peso12b.text=\"43.6\"";
_peso12b.setText(BA.ObjectToCharSequence("43.6"));
 //BA.debugLineNum = 1629;BA.debugLine="peso12c.text=\"44.6\"";
_peso12c.setText(BA.ObjectToCharSequence("44.6"));
 //BA.debugLineNum = 1630;BA.debugLine="peso12d.text=\"45.6\"";
_peso12d.setText(BA.ObjectToCharSequence("45.6"));
 //BA.debugLineNum = 1631;BA.debugLine="peso1a.text=\"46.6\"";
_peso1a.setText(BA.ObjectToCharSequence("46.6"));
 //BA.debugLineNum = 1632;BA.debugLine="peso1b.text=\"47.6\"";
_peso1b.setText(BA.ObjectToCharSequence("47.6"));
 //BA.debugLineNum = 1633;BA.debugLine="peso1c.text=\"48.6\"";
_peso1c.setText(BA.ObjectToCharSequence("48.6"));
 //BA.debugLineNum = 1634;BA.debugLine="peso1d.text=\"49.6\"";
_peso1d.setText(BA.ObjectToCharSequence("49.6"));
 //BA.debugLineNum = 1635;BA.debugLine="peso2a.text=\"50.6\"";
_peso2a.setText(BA.ObjectToCharSequence("50.6"));
 //BA.debugLineNum = 1636;BA.debugLine="peso2b.text=\"51.6\"";
_peso2b.setText(BA.ObjectToCharSequence("51.6"));
 //BA.debugLineNum = 1637;BA.debugLine="peso2c.text=\"52.6\"";
_peso2c.setText(BA.ObjectToCharSequence("52.6"));
 //BA.debugLineNum = 1638;BA.debugLine="peso2d.text=\"53.6\"";
_peso2d.setText(BA.ObjectToCharSequence("53.6"));
 //BA.debugLineNum = 1639;BA.debugLine="peso3a.text=\"54.6\"";
_peso3a.setText(BA.ObjectToCharSequence("54.6"));
 //BA.debugLineNum = 1640;BA.debugLine="peso3b.text=\"55.6\"";
_peso3b.setText(BA.ObjectToCharSequence("55.6"));
 //BA.debugLineNum = 1641;BA.debugLine="peso3c.text=\"56.6\"";
_peso3c.setText(BA.ObjectToCharSequence("56.6"));
 //BA.debugLineNum = 1642;BA.debugLine="peso3d.text=\"57.6\"";
_peso3d.setText(BA.ObjectToCharSequence("57.6"));
 //BA.debugLineNum = 1643;BA.debugLine="peso4a.text=\"58.6\"";
_peso4a.setText(BA.ObjectToCharSequence("58.6"));
 //BA.debugLineNum = 1644;BA.debugLine="peso4b.text=\"59.6\"";
_peso4b.setText(BA.ObjectToCharSequence("59.6"));
 //BA.debugLineNum = 1645;BA.debugLine="peso4c.text=\"60.6\"";
_peso4c.setText(BA.ObjectToCharSequence("60.6"));
 //BA.debugLineNum = 1646;BA.debugLine="peso4d.text=\"61.6\"";
_peso4d.setText(BA.ObjectToCharSequence("61.6"));
 //BA.debugLineNum = 1647;BA.debugLine="peso5a.text=\"62.6\"";
_peso5a.setText(BA.ObjectToCharSequence("62.6"));
 //BA.debugLineNum = 1648;BA.debugLine="peso5b.text=\"63.6\"";
_peso5b.setText(BA.ObjectToCharSequence("63.6"));
 //BA.debugLineNum = 1649;BA.debugLine="peso5c.text=\"64.6\"";
_peso5c.setText(BA.ObjectToCharSequence("64.6"));
 //BA.debugLineNum = 1650;BA.debugLine="peso5d.text=\"65.6\"";
_peso5d.setText(BA.ObjectToCharSequence("65.6"));
 //BA.debugLineNum = 1651;BA.debugLine="peso6a.text=\"66.6\"";
_peso6a.setText(BA.ObjectToCharSequence("66.6"));
 //BA.debugLineNum = 1652;BA.debugLine="peso6b.text=\"67.6\"";
_peso6b.setText(BA.ObjectToCharSequence("67.6"));
 //BA.debugLineNum = 1653;BA.debugLine="peso6c.text=\"68.6\"";
_peso6c.setText(BA.ObjectToCharSequence("68.6"));
 //BA.debugLineNum = 1654;BA.debugLine="peso6d.text=\"69.6\"";
_peso6d.setText(BA.ObjectToCharSequence("69.6"));
 //BA.debugLineNum = 1655;BA.debugLine="peso7a.text=\"70.6\"";
_peso7a.setText(BA.ObjectToCharSequence("70.6"));
 //BA.debugLineNum = 1656;BA.debugLine="peso7b.text=\"71.6\"";
_peso7b.setText(BA.ObjectToCharSequence("71.6"));
 //BA.debugLineNum = 1657;BA.debugLine="peso7c.text=\"72.6\"";
_peso7c.setText(BA.ObjectToCharSequence("72.6"));
 //BA.debugLineNum = 1658;BA.debugLine="peso7d.text=\"73.6\"";
_peso7d.setText(BA.ObjectToCharSequence("73.6"));
 //BA.debugLineNum = 1659;BA.debugLine="peso8a.text=\"74.6\"";
_peso8a.setText(BA.ObjectToCharSequence("74.6"));
 //BA.debugLineNum = 1660;BA.debugLine="peso8d.text=\"75.6\"";
_peso8d.setText(BA.ObjectToCharSequence("75.6"));
 //BA.debugLineNum = 1661;BA.debugLine="peso8b.text=\"76.6\"";
_peso8b.setText(BA.ObjectToCharSequence("76.6"));
 //BA.debugLineNum = 1662;BA.debugLine="peso8c.text=\"77.6\"";
_peso8c.setText(BA.ObjectToCharSequence("77.6"));
 //BA.debugLineNum = 1663;BA.debugLine="peso9a.text=\"78.6\"";
_peso9a.setText(BA.ObjectToCharSequence("78.6"));
 //BA.debugLineNum = 1664;BA.debugLine="peso9b.text=\"79.6\"";
_peso9b.setText(BA.ObjectToCharSequence("79.6"));
 //BA.debugLineNum = 1665;BA.debugLine="peso9c.text=\"80.6\"";
_peso9c.setText(BA.ObjectToCharSequence("80.6"));
 //BA.debugLineNum = 1666;BA.debugLine="peso9d.text=\"81.6\"";
_peso9d.setText(BA.ObjectToCharSequence("81.6"));
 //BA.debugLineNum = 1667;BA.debugLine="End Sub";
return "";
}
public String  _llenarpesos() throws Exception{
 //BA.debugLineNum = 971;BA.debugLine="Sub LlenarPesos";
 //BA.debugLineNum = 972;BA.debugLine="If pallet1.Text.trim= \"\" Then pallet1.Text = \"s/d";
if ((_pallet1.getText().trim()).equals("")) { 
_pallet1.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 973;BA.debugLine="If pallet2.Text.Trim = \"\" Then pallet2.Text = \"s/";
if ((_pallet2.getText().trim()).equals("")) { 
_pallet2.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 974;BA.debugLine="If pallet3.Text.Trim = \"\" Then pallet3.Text = \"s/";
if ((_pallet3.getText().trim()).equals("")) { 
_pallet3.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 975;BA.debugLine="If pallet4.Text.Trim = \"\" Then pallet4.Text = \"s/";
if ((_pallet4.getText().trim()).equals("")) { 
_pallet4.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 979;BA.debugLine="If peso1a.Text.Trim = \"\" Then peso1a.Text = \"s/d\"";
if ((_peso1a.getText().trim()).equals("")) { 
_peso1a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 980;BA.debugLine="If peso2a.Text.Trim = \"\" Then peso2a.Text = \"s/d\"";
if ((_peso2a.getText().trim()).equals("")) { 
_peso2a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 981;BA.debugLine="If peso3a.Text.Trim = \"\" Then peso3a.Text = \"s/d\"";
if ((_peso3a.getText().trim()).equals("")) { 
_peso3a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 982;BA.debugLine="If peso4a.Text.Trim = \"\" Then peso4a.Text = \"s/d\"";
if ((_peso4a.getText().trim()).equals("")) { 
_peso4a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 983;BA.debugLine="If peso5a.Text.Trim = \"\" Then peso5a.Text = \"s/d\"";
if ((_peso5a.getText().trim()).equals("")) { 
_peso5a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 984;BA.debugLine="If peso6a.Text.Trim = \"\" Then peso6a.Text = \"s/d\"";
if ((_peso6a.getText().trim()).equals("")) { 
_peso6a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 985;BA.debugLine="If peso7a.Text.Trim = \"\" Then peso7a.Text = \"s/d\"";
if ((_peso7a.getText().trim()).equals("")) { 
_peso7a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 986;BA.debugLine="If peso8a.Text.Trim = \"\" Then peso8a.Text = \"s/d\"";
if ((_peso8a.getText().trim()).equals("")) { 
_peso8a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 987;BA.debugLine="If peso9a.Text.Trim = \"\" Then peso9a.Text = \"s/d\"";
if ((_peso9a.getText().trim()).equals("")) { 
_peso9a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 988;BA.debugLine="If peso10a.Text.Trim = \"\" Then peso10a.Text = \"s/";
if ((_peso10a.getText().trim()).equals("")) { 
_peso10a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 989;BA.debugLine="If peso11a.Text.Trim = \"\" Then peso11a.Text = \"s/";
if ((_peso11a.getText().trim()).equals("")) { 
_peso11a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 990;BA.debugLine="If peso12a.Text.Trim = \"\" Then peso12a.Text = \"s/";
if ((_peso12a.getText().trim()).equals("")) { 
_peso12a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 993;BA.debugLine="If peso1b.Text.Trim = \"\" Then peso1b.Text = \"s/d\"";
if ((_peso1b.getText().trim()).equals("")) { 
_peso1b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 994;BA.debugLine="If peso2b.Text.Trim = \"\" Then peso2b.Text = \"s/d\"";
if ((_peso2b.getText().trim()).equals("")) { 
_peso2b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 995;BA.debugLine="If peso3b.Text.Trim = \"\" Then peso3b.Text = \"s/d\"";
if ((_peso3b.getText().trim()).equals("")) { 
_peso3b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 996;BA.debugLine="If peso4b.Text.Trim = \"\" Then peso4b.Text = \"s/d\"";
if ((_peso4b.getText().trim()).equals("")) { 
_peso4b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 997;BA.debugLine="If peso5b.Text.Trim = \"\" Then peso5b.Text = \"s/d\"";
if ((_peso5b.getText().trim()).equals("")) { 
_peso5b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 998;BA.debugLine="If peso6b.Text.Trim = \"\" Then peso6b.Text = \"s/d\"";
if ((_peso6b.getText().trim()).equals("")) { 
_peso6b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 999;BA.debugLine="If peso7b.Text.Trim = \"\" Then peso7b.Text = \"s/d\"";
if ((_peso7b.getText().trim()).equals("")) { 
_peso7b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1000;BA.debugLine="If peso8b.Text.Trim = \"\" Then peso8b.Text = \"s/d\"";
if ((_peso8b.getText().trim()).equals("")) { 
_peso8b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1001;BA.debugLine="If peso9b.Text.Trim = \"\" Then peso9b.Text = \"s/d\"";
if ((_peso9b.getText().trim()).equals("")) { 
_peso9b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1002;BA.debugLine="If peso10b.Text.Trim = \"\" Then peso10b.Text = \"s/";
if ((_peso10b.getText().trim()).equals("")) { 
_peso10b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1003;BA.debugLine="If peso11b.Text.Trim = \"\" Then peso11b.Text = \"s/";
if ((_peso11b.getText().trim()).equals("")) { 
_peso11b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1004;BA.debugLine="If peso12b.Text.Trim = \"\" Then peso12b.Text = \"s/";
if ((_peso12b.getText().trim()).equals("")) { 
_peso12b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1006;BA.debugLine="If peso1c.Text.Trim = \"\" Then peso1c.Text = \"s/d\"";
if ((_peso1c.getText().trim()).equals("")) { 
_peso1c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1007;BA.debugLine="If peso2c.Text.Trim = \"\" Then peso2c.Text = \"s/d\"";
if ((_peso2c.getText().trim()).equals("")) { 
_peso2c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1008;BA.debugLine="If peso3c.Text.Trim = \"\" Then peso3c.Text = \"s/d\"";
if ((_peso3c.getText().trim()).equals("")) { 
_peso3c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1009;BA.debugLine="If peso4c.Text.Trim = \"\" Then peso4c.Text = \"s/d\"";
if ((_peso4c.getText().trim()).equals("")) { 
_peso4c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1010;BA.debugLine="If peso5c.Text.Trim = \"\" Then peso5c.Text = \"s/d\"";
if ((_peso5c.getText().trim()).equals("")) { 
_peso5c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1011;BA.debugLine="If peso6c.Text.Trim = \"\" Then peso6c.Text = \"s/d\"";
if ((_peso6c.getText().trim()).equals("")) { 
_peso6c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1012;BA.debugLine="If peso7c.Text.Trim = \"\" Then peso7c.Text = \"s/d\"";
if ((_peso7c.getText().trim()).equals("")) { 
_peso7c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1013;BA.debugLine="If peso8c.Text.Trim = \"\" Then peso8c.Text = \"s/d\"";
if ((_peso8c.getText().trim()).equals("")) { 
_peso8c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1014;BA.debugLine="If peso9c.Text.Trim = \"\" Then peso9c.Text = \"s/d\"";
if ((_peso9c.getText().trim()).equals("")) { 
_peso9c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1015;BA.debugLine="If peso10c.Text.Trim = \"\" Then peso10c.Text = \"s/";
if ((_peso10c.getText().trim()).equals("")) { 
_peso10c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1016;BA.debugLine="If peso11c.Text.Trim = \"\" Then peso11c.Text = \"s/";
if ((_peso11c.getText().trim()).equals("")) { 
_peso11c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1017;BA.debugLine="If peso12c.Text.Trim = \"\" Then peso12c.Text = \"s/";
if ((_peso12c.getText().trim()).equals("")) { 
_peso12c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1020;BA.debugLine="If peso1d.Text.Trim = \"\" Then peso1d.Text = \"s/d\"";
if ((_peso1d.getText().trim()).equals("")) { 
_peso1d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1021;BA.debugLine="If peso2d.Text.Trim = \"\" Then peso2d.Text = \"s/d\"";
if ((_peso2d.getText().trim()).equals("")) { 
_peso2d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1022;BA.debugLine="If peso3d.Text.Trim = \"\" Then peso3d.Text = \"s/d\"";
if ((_peso3d.getText().trim()).equals("")) { 
_peso3d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1023;BA.debugLine="If peso4d.Text.Trim = \"\" Then peso4d.Text = \"s/d\"";
if ((_peso4d.getText().trim()).equals("")) { 
_peso4d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1024;BA.debugLine="If peso5d.Text.Trim = \"\" Then peso5d.Text = \"s/d\"";
if ((_peso5d.getText().trim()).equals("")) { 
_peso5d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1025;BA.debugLine="If peso6d.Text.Trim = \"\" Then peso6d.Text = \"s/d\"";
if ((_peso6d.getText().trim()).equals("")) { 
_peso6d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1026;BA.debugLine="If peso7d.Text.Trim = \"\" Then peso7d.Text = \"s/d\"";
if ((_peso7d.getText().trim()).equals("")) { 
_peso7d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1027;BA.debugLine="If peso8d.Text.Trim = \"\" Then peso8d.Text = \"s/d\"";
if ((_peso8d.getText().trim()).equals("")) { 
_peso8d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1028;BA.debugLine="If peso9d.Text.Trim = \"\" Then peso9d.Text = \"s/d\"";
if ((_peso9d.getText().trim()).equals("")) { 
_peso9d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1029;BA.debugLine="If peso10d.Text.Trim = \"\" Then peso10d.Text = \"s/";
if ((_peso10d.getText().trim()).equals("")) { 
_peso10d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1030;BA.debugLine="If peso11d.Text.Trim = \"\" Then peso11d.Text = \"s/";
if ((_peso11d.getText().trim()).equals("")) { 
_peso11d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1031;BA.debugLine="If peso12d.Text.Trim = \"\" Then peso12d.Text = \"s/";
if ((_peso12d.getText().trim()).equals("")) { 
_peso12d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 1034;BA.debugLine="End Sub";
return "";
}
public String  _otra_click() throws Exception{
 //BA.debugLineNum = 1669;BA.debugLine="Private Sub otra_Click";
 //BA.debugLineNum = 1670;BA.debugLine="LlenarPesos";
_llenarpesos();
 //BA.debugLineNum = 1671;BA.debugLine="End Sub";
return "";
}
public String  _pallet1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 855;BA.debugLine="Sub pallet1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 856;BA.debugLine="LimitarTexto4(pallet1, New)";
_limitartexto4(_pallet1,_new);
 //BA.debugLineNum = 857;BA.debugLine="End Sub";
return "";
}
public String  _pallet2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 859;BA.debugLine="Sub pallet2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 860;BA.debugLine="LimitarTexto4(pallet2, New)";
_limitartexto4(_pallet2,_new);
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return "";
}
public String  _pallet3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 863;BA.debugLine="Sub pallet3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 864;BA.debugLine="LimitarTexto4(pallet3, New)";
_limitartexto4(_pallet3,_new);
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return "";
}
public String  _pallet4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 868;BA.debugLine="Sub pallet4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 869;BA.debugLine="LimitarTexto4(pallet4, New)";
_limitartexto4(_pallet4,_new);
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return "";
}
public String  _peso10a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub peso10a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 724;BA.debugLine=": LimitarTexto(peso10a, New) :";
_limitartexto(_peso10a,_new);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public String  _peso10b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Sub peso10b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 761;BA.debugLine=": LimitarTexto(peso10b, New) :";
_limitartexto(_peso10b,_new);
 //BA.debugLineNum = 762;BA.debugLine="End Sub";
return "";
}
public String  _peso10c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 797;BA.debugLine="Sub peso10c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 798;BA.debugLine=": LimitarTexto(peso10c, New) :";
_limitartexto(_peso10c,_new);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return "";
}
public String  _peso10d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub peso10d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 835;BA.debugLine=": LimitarTexto(peso10d, New) :";
_limitartexto(_peso10d,_new);
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return "";
}
public String  _peso11a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 726;BA.debugLine="Sub peso11a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 727;BA.debugLine=": LimitarTexto(peso11a, New) :";
_limitartexto(_peso11a,_new);
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return "";
}
public String  _peso11b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 763;BA.debugLine="Sub peso11b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 764;BA.debugLine=": LimitarTexto(peso11b, New) :";
_limitartexto(_peso11b,_new);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return "";
}
public String  _peso11c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub peso11c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 801;BA.debugLine=": LimitarTexto(peso11c, New) :";
_limitartexto(_peso11c,_new);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return "";
}
public String  _peso11d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 837;BA.debugLine="Sub peso11d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 838;BA.debugLine=": LimitarTexto(peso11d, New) :";
_limitartexto(_peso11d,_new);
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public String  _peso12a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 729;BA.debugLine="Sub peso12a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 730;BA.debugLine=": LimitarTexto(peso12a, New) :";
_limitartexto(_peso12a,_new);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return "";
}
public String  _peso12b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 766;BA.debugLine="Sub peso12b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 767;BA.debugLine=": LimitarTexto(peso12b, New) :";
_limitartexto(_peso12b,_new);
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public String  _peso12c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 803;BA.debugLine="Sub peso12c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 804;BA.debugLine=": LimitarTexto(peso12c, New) :";
_limitartexto(_peso12c,_new);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return "";
}
public String  _peso12d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 840;BA.debugLine="Sub peso12d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 841;BA.debugLine=": LimitarTexto(peso12d, New) :";
_limitartexto(_peso12d,_new);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return "";
}
public String  _peso1a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 691;BA.debugLine="Sub peso1a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 692;BA.debugLine="LimitarTexto(peso1a, New)";
_limitartexto(_peso1a,_new);
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return "";
}
public String  _peso1b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Sub peso1b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 734;BA.debugLine=": LimitarTexto(peso1b, New) :";
_limitartexto(_peso1b,_new);
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return "";
}
public String  _peso1c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 770;BA.debugLine="Sub peso1c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 771;BA.debugLine=": LimitarTexto(peso1c, New) :";
_limitartexto(_peso1c,_new);
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public String  _peso1d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 807;BA.debugLine="Sub peso1d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 808;BA.debugLine=": LimitarTexto(peso1d, New) :";
_limitartexto(_peso1d,_new);
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return "";
}
public String  _peso2a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 695;BA.debugLine="Sub peso2a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 696;BA.debugLine="LimitarTexto(peso2a, New)";
_limitartexto(_peso2a,_new);
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return "";
}
public String  _peso2b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub peso2b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 737;BA.debugLine=": LimitarTexto(peso2b, New) :";
_limitartexto(_peso2b,_new);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return "";
}
public String  _peso2c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 773;BA.debugLine="Sub peso2c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 774;BA.debugLine=": LimitarTexto(peso2c, New) :";
_limitartexto(_peso2c,_new);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return "";
}
public String  _peso2d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Sub peso2d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 811;BA.debugLine=": LimitarTexto(peso2d, New) :";
_limitartexto(_peso2d,_new);
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return "";
}
public String  _peso3a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub peso3a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 700;BA.debugLine="LimitarTexto(peso3a, New)";
_limitartexto(_peso3a,_new);
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return "";
}
public String  _peso3b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub peso3b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 740;BA.debugLine=": LimitarTexto(peso3b, New) :";
_limitartexto(_peso3b,_new);
 //BA.debugLineNum = 741;BA.debugLine="End Sub";
return "";
}
public String  _peso3c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 776;BA.debugLine="Sub peso3c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 777;BA.debugLine=": LimitarTexto(peso3c, New) :";
_limitartexto(_peso3c,_new);
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return "";
}
public String  _peso3d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Sub peso3d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 814;BA.debugLine=": LimitarTexto(peso3d, New) :";
_limitartexto(_peso3d,_new);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public String  _peso4a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 704;BA.debugLine="Sub peso4a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 705;BA.debugLine="LimitarTexto(peso4a, New)";
_limitartexto(_peso4a,_new);
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return "";
}
public String  _peso4b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Sub peso4b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 743;BA.debugLine=": LimitarTexto(peso4b, New) :";
_limitartexto(_peso4b,_new);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return "";
}
public String  _peso4c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 779;BA.debugLine="Sub peso4c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 780;BA.debugLine=": LimitarTexto(peso4c, New) :";
_limitartexto(_peso4c,_new);
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return "";
}
public String  _peso4d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Sub peso4d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 817;BA.debugLine=": LimitarTexto(peso4d, New) :";
_limitartexto(_peso4d,_new);
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
return "";
}
public String  _peso5a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 707;BA.debugLine="Sub peso5a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 708;BA.debugLine="LimitarTexto(peso5a, New)";
_limitartexto(_peso5a,_new);
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public String  _peso5b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 745;BA.debugLine="Sub peso5b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 746;BA.debugLine=": LimitarTexto(peso5b, New) :";
_limitartexto(_peso5b,_new);
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return "";
}
public String  _peso5c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 782;BA.debugLine="Sub peso5c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 783;BA.debugLine=": LimitarTexto(peso5c, New) :";
_limitartexto(_peso5c,_new);
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return "";
}
public String  _peso5d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub peso5d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 820;BA.debugLine=": LimitarTexto(peso5d, New) :";
_limitartexto(_peso5d,_new);
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return "";
}
public String  _peso6a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 710;BA.debugLine="Sub peso6a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 711;BA.debugLine="LimitarTexto(peso6a, New)";
_limitartexto(_peso6a,_new);
 //BA.debugLineNum = 712;BA.debugLine="End Sub";
return "";
}
public String  _peso6b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 748;BA.debugLine="Sub peso6b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 749;BA.debugLine=": LimitarTexto(peso6b, New) :";
_limitartexto(_peso6b,_new);
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return "";
}
public String  _peso6c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub peso6c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 786;BA.debugLine=": LimitarTexto(peso6c, New) :";
_limitartexto(_peso6c,_new);
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return "";
}
public String  _peso6d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub peso6d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 823;BA.debugLine=": LimitarTexto(peso6d, New) :";
_limitartexto(_peso6d,_new);
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return "";
}
public String  _peso7a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 713;BA.debugLine="Sub peso7a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 714;BA.debugLine="LimitarTexto(peso7a, New)";
_limitartexto(_peso7a,_new);
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return "";
}
public String  _peso7b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 751;BA.debugLine="Sub peso7b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 752;BA.debugLine=": LimitarTexto(peso7b, New) :";
_limitartexto(_peso7b,_new);
 //BA.debugLineNum = 753;BA.debugLine="End Sub";
return "";
}
public String  _peso7c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 788;BA.debugLine="Sub peso7c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 789;BA.debugLine=": LimitarTexto(peso7c, New) :";
_limitartexto(_peso7c,_new);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return "";
}
public String  _peso7d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 825;BA.debugLine="Sub peso7d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 826;BA.debugLine=": LimitarTexto(peso7d, New) :";
_limitartexto(_peso7d,_new);
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return "";
}
public String  _peso8a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub peso8a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 718;BA.debugLine="LimitarTexto(peso8a, New)";
_limitartexto(_peso8a,_new);
 //BA.debugLineNum = 719;BA.debugLine="End Sub";
return "";
}
public String  _peso8b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 754;BA.debugLine="Sub peso8b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 755;BA.debugLine=": LimitarTexto(peso8b, New) :";
_limitartexto(_peso8b,_new);
 //BA.debugLineNum = 756;BA.debugLine="End Sub";
return "";
}
public String  _peso8c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 791;BA.debugLine="Sub peso8c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 792;BA.debugLine=": LimitarTexto(peso8c, New) :";
_limitartexto(_peso8c,_new);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public String  _peso8d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="Sub peso8d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 829;BA.debugLine=": LimitarTexto(peso8d, New) :";
_limitartexto(_peso8d,_new);
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return "";
}
public String  _peso9a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 720;BA.debugLine="Sub peso9a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 721;BA.debugLine=": LimitarTexto(peso9a, New)";
_limitartexto(_peso9a,_new);
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public String  _peso9b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Sub peso9b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 758;BA.debugLine=": LimitarTexto(peso9b, New) :";
_limitartexto(_peso9b,_new);
 //BA.debugLineNum = 759;BA.debugLine="End Sub";
return "";
}
public String  _peso9c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub peso9c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 795;BA.debugLine=": LimitarTexto(peso9c, New) :";
_limitartexto(_peso9c,_new);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return "";
}
public String  _peso9d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 831;BA.debugLine="Sub peso9d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 832;BA.debugLine=": LimitarTexto(peso9d, New) :";
_limitartexto(_peso9d,_new);
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
