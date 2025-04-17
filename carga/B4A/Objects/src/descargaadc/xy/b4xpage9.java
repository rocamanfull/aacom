package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage9 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage9");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage9.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label31 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label32 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label33 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label34 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label35 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label36 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label38 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label39 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label40 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label44 = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _label70 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label72 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label73 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label74 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label75 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label76 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label77 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label78 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label79 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label80 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label81 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label83 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label84 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label85 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label86 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label88 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label99 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpage1title = null;
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
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _llenar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _otra = null;
public anywheresoftware.b4a.objects.ButtonWrapper _otra2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label15 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label20 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label22 = null;
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
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
descargaadc.xy.b4xmainpage _mainpage = null;
anywheresoftware.b4a.objects.collections.List _list2 = null;
anywheresoftware.b4a.objects.collections.List _list3 = null;
 //BA.debugLineNum = 275;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 276;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 278;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 279;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 281;BA.debugLine="ScrollView1.Panel.LoadLayout(\"carg2peso2\")'(\"carg";
_scrollview1.getPanel().LoadLayout("carg2peso2",ba);
 //BA.debugLineNum = 293;BA.debugLine="Panel2.Color=Colors.RGB(255,245,238)";
_panel2.setColor(__c.Colors.RGB((int) (255),(int) (245),(int) (238)));
 //BA.debugLineNum = 295;BA.debugLine="lblPage1Title.Text=\"Datos Carga 5\"";
_lblpage1title.setText(BA.ObjectToCharSequence("Datos Carga 5"));
 //BA.debugLineNum = 296;BA.debugLine="Label3.Text=\"Datos Carga 6\"";
_label3.setText(BA.ObjectToCharSequence("Datos Carga 6"));
 //BA.debugLineNum = 297;BA.debugLine="Label19.Text=\"Datos Carga 7\"";
_label19.setText(BA.ObjectToCharSequence("Datos Carga 7"));
 //BA.debugLineNum = 298;BA.debugLine="Label70.Text=\"Datos Carga 8\"";
_label70.setText(BA.ObjectToCharSequence("Datos Carga 8"));
 //BA.debugLineNum = 299;BA.debugLine="B4XPages.SetTitle(Me, \"Datos Cargas 5-8\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Datos Cargas 5-8"));
 //BA.debugLineNum = 304;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 305;BA.debugLine="MainPage.bol2=True";
_mainpage._bol2 /*boolean*/  = __c.True;
 //BA.debugLineNum = 306;BA.debugLine="Log(\"carg1 es \"& MainPage.carg1)";
__c.LogImpl("245678623","carg1 es "+BA.ObjectToString(_mainpage._carg1 /*boolean*/ ),0);
 //BA.debugLineNum = 307;BA.debugLine="Log(\"carg2 es \"& MainPage.carg2)";
__c.LogImpl("245678624","carg2 es "+BA.ObjectToString(_mainpage._carg2 /*boolean*/ ),0);
 //BA.debugLineNum = 308;BA.debugLine="Log(\"bol1 es \"& MainPage.bol1)";
__c.LogImpl("245678625","bol1 es "+BA.ObjectToString(_mainpage._bol1 /*boolean*/ ),0);
 //BA.debugLineNum = 309;BA.debugLine="Log(\"bol2 es \"& MainPage.bol2)";
__c.LogImpl("245678626","bol2 es "+BA.ObjectToString(_mainpage._bol2 /*boolean*/ ),0);
 //BA.debugLineNum = 310;BA.debugLine="Log(\"super es \"& MainPage.super)";
__c.LogImpl("245678627","super es "+BA.ObjectToString(_mainpage._super /*boolean*/ ()),0);
 //BA.debugLineNum = 313;BA.debugLine="ScrollView1.Panel.Height = Panel2.Height";
_scrollview1.getPanel().setHeight(_panel2.getHeight());
 //BA.debugLineNum = 324;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 325;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga1"));
 //BA.debugLineNum = 326;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga2"));
 //BA.debugLineNum = 329;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa1"));
 //BA.debugLineNum = 330;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa2"));
 //BA.debugLineNum = 332;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 335;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"android48.png");
 //BA.debugLineNum = 336;BA.debugLine="Dim list2 As List";
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 337;BA.debugLine="Dim list3 As List";
_list3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 339;BA.debugLine="list2 = File.ReadList(cargas, \"marc.txt\")";
_list2 = __c.File.ReadList(_cargas,"marc.txt");
 //BA.debugLineNum = 341;BA.debugLine="list3 = File.ReadList(cargas, \"emp.txt\")''emp";
_list3 = __c.File.ReadList(_cargas,"emp.txt");
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 414;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 415;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 417;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 418;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 420;BA.debugLine="If Tag =\"Carga1\" Then";
if ((_tag).equals("Carga1")) { 
 //BA.debugLineNum = 421;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 423;BA.debugLine="If Tag =\"Carga2\" Then";
if ((_tag).equals("Carga2")) { 
 //BA.debugLineNum = 424;BA.debugLine="B4XPages.ShowPage(\"Page 3\")";
_b4xpages._showpage /*String*/ (ba,"Page 3");
 };
 //BA.debugLineNum = 426;BA.debugLine="If Tag =\"Cargac1\" Then";
if ((_tag).equals("Cargac1")) { 
 //BA.debugLineNum = 427;BA.debugLine="B4XPages.ShowPage(\"Page 4\")";
_b4xpages._showpage /*String*/ (ba,"Page 4");
 };
 //BA.debugLineNum = 430;BA.debugLine="If Tag =\"Cargac2\" Then";
if ((_tag).equals("Cargac2")) { 
 //BA.debugLineNum = 431;BA.debugLine="B4XPages.ShowPage(\"Page 5\")";
_b4xpages._showpage /*String*/ (ba,"Page 5");
 };
 //BA.debugLineNum = 433;BA.debugLine="If Tag =\"Cargac3\" Then";
if ((_tag).equals("Cargac3")) { 
 //BA.debugLineNum = 434;BA.debugLine="B4XPages.ShowPage(\"Page 6\")";
_b4xpages._showpage /*String*/ (ba,"Page 6");
 };
 //BA.debugLineNum = 436;BA.debugLine="If Tag =\"Bolsa1\" Then";
if ((_tag).equals("Bolsa1")) { 
 //BA.debugLineNum = 437;BA.debugLine="B4XPages.ShowPage(\"Page 7\")";
_b4xpages._showpage /*String*/ (ba,"Page 7");
 };
 //BA.debugLineNum = 439;BA.debugLine="If Tag =\"Bolsa2\" Then";
if ((_tag).equals("Bolsa2")) { 
 //BA.debugLineNum = 440;BA.debugLine="B4XPages.ShowPage(\"Page 8\")";
_b4xpages._showpage /*String*/ (ba,"Page 8");
 };
 //BA.debugLineNum = 442;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 };
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return "";
}
public String  _blanqueo() throws Exception{
 //BA.debugLineNum = 521;BA.debugLine="public Sub blanqueo";
 //BA.debugLineNum = 524;BA.debugLine="pallet1.Text = \"\"";
_pallet1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 525;BA.debugLine="pallet2.Text = \"\"";
_pallet2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 526;BA.debugLine="pallet3.Text = \"\"";
_pallet3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 527;BA.debugLine="pallet4.Text = \"\"";
_pallet4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 529;BA.debugLine="peso10a.Text = \"\"";
_peso10a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 530;BA.debugLine="peso10b.Text = \"\"";
_peso10b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 531;BA.debugLine="peso10c.Text = \"\"";
_peso10c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 532;BA.debugLine="peso10d.Text = \"\"";
_peso10d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 533;BA.debugLine="peso11a.Text = \"\"";
_peso11a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 534;BA.debugLine="peso11b.Text = \"\"";
_peso11b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 535;BA.debugLine="peso11c.Text = \"\"";
_peso11c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 536;BA.debugLine="peso11d.Text = \"\"";
_peso11d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 537;BA.debugLine="peso12a.Text = \"\"";
_peso12a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 538;BA.debugLine="peso12b.Text = \"\"";
_peso12b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 539;BA.debugLine="peso12c.Text = \"\"";
_peso12c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 540;BA.debugLine="peso12d.Text = \"\"";
_peso12d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 541;BA.debugLine="peso1a.Text = \"\"";
_peso1a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 542;BA.debugLine="peso1b.Text = \"\"";
_peso1b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 543;BA.debugLine="peso1c.Text = \"\"";
_peso1c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 544;BA.debugLine="peso1d.Text = \"\"";
_peso1d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 545;BA.debugLine="peso2a.Text = \"\"";
_peso2a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 546;BA.debugLine="peso2b.Text = \"\"";
_peso2b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 547;BA.debugLine="peso2c.Text = \"\"";
_peso2c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 548;BA.debugLine="peso2d.Text = \"\"";
_peso2d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 549;BA.debugLine="peso3a.Text = \"\"";
_peso3a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 550;BA.debugLine="peso3b.Text = \"\"";
_peso3b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 551;BA.debugLine="peso3c.Text = \"\"";
_peso3c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 552;BA.debugLine="peso3d.Text = \"\"";
_peso3d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 553;BA.debugLine="peso4a.Text = \"\"";
_peso4a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 554;BA.debugLine="peso4b.Text = \"\"";
_peso4b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 555;BA.debugLine="peso4c.Text = \"\"";
_peso4c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 556;BA.debugLine="peso4d.Text = \"\"";
_peso4d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 557;BA.debugLine="peso5a.Text = \"\"";
_peso5a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 558;BA.debugLine="peso5b.Text = \"\"";
_peso5b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 559;BA.debugLine="peso5c.Text = \"\"";
_peso5c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 560;BA.debugLine="peso5d.Text = \"\"";
_peso5d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 561;BA.debugLine="peso6a.Text = \"\"";
_peso6a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 562;BA.debugLine="peso6b.Text = \"\"";
_peso6b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 563;BA.debugLine="peso6c.Text = \"\"";
_peso6c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 564;BA.debugLine="peso6d.Text = \"\"";
_peso6d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 565;BA.debugLine="peso7a.Text = \"\"";
_peso7a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 566;BA.debugLine="peso7b.Text = \"\"";
_peso7b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 567;BA.debugLine="peso7c.Text = \"\"";
_peso7c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 568;BA.debugLine="peso7d.Text = \"\"";
_peso7d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 569;BA.debugLine="peso8a.Text = \"\"";
_peso8a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 570;BA.debugLine="peso8b.Text = \"\"";
_peso8b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 571;BA.debugLine="peso8c.Text = \"\"";
_peso8c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 572;BA.debugLine="peso8d.Text = \"\"";
_peso8d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 573;BA.debugLine="peso9a.Text = \"\"";
_peso9a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 574;BA.debugLine="peso9b.Text = \"\"";
_peso9b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 575;BA.debugLine="peso9c.Text = \"\"";
_peso9c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 576;BA.debugLine="peso9d.Text = \"\"";
_peso9d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return "";
}
public String  _blaqueo() throws Exception{
 //BA.debugLineNum = 920;BA.debugLine="Sub blaqueo";
 //BA.debugLineNum = 923;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso1a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 923;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso2a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 923;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso3a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 923;BA.debugLine="peso1a.Text = \"\"  : peso2a.Text = \"\"  : peso3a.Te";
_peso4a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 924;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso5a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 924;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso6a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 924;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso7a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 924;BA.debugLine="peso5a.Text = \"\"  : peso6a.Text = \"\"  : peso7a.Te";
_peso8a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 925;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso9a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 925;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso10a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 925;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso11a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 925;BA.debugLine="peso9a.Text = \"\"  : peso10a.Text = \"\" : peso11a.T";
_peso12a.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 928;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso1b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 928;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso2b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 928;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso3b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 928;BA.debugLine="peso1b.Text = \"\"  : peso2b.Text = \"\"  : peso3b.Te";
_peso4b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 929;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso5b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 929;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso6b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 929;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso7b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 929;BA.debugLine="peso5b.Text = \"\"  : peso6b.Text = \"\"  : peso7b.Te";
_peso8b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 930;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso9b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 930;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso10b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 930;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso11b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 930;BA.debugLine="peso9b.Text = \"\"  : peso10b.Text = \"\" : peso11b.T";
_peso12b.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 933;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso1c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 933;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso2c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 933;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso3c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 933;BA.debugLine="peso1c.Text = \"\"  : peso2c.Text = \"\"  : peso3c.Te";
_peso4c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 934;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso5c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 934;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso6c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 934;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso7c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 934;BA.debugLine="peso5c.Text = \"\"  : peso6c.Text = \"\"  : peso7c.Te";
_peso8c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 935;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso9c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 935;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso10c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 935;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso11c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 935;BA.debugLine="peso9c.Text = \"\"  : peso10c.Text = \"\" : peso11c.T";
_peso12c.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 938;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso1d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 938;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso2d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 938;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso3d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 938;BA.debugLine="peso1d.Text = \"\"  : peso2d.Text = \"\"  : peso3d.Te";
_peso4d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 939;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso5d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 939;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso6d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 939;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso7d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 939;BA.debugLine="peso5d.Text = \"\"  : peso6d.Text = \"\"  : peso7d.Te";
_peso8d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 940;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso9d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 940;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso10d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 940;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso11d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 940;BA.debugLine="peso9d.Text = \"\"  : peso10d.Text = \"\" : peso11d.T";
_peso12d.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 508;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 509;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 510;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 584;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
 //BA.debugLineNum = 511;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 512;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
 //BA.debugLineNum = 514;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 515;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 516;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 518;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Dim ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim Bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim Panel2 As Panel";
_panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Public Page1 As B4XPage1";
_page1 = new descargaadc.xy.b4xpage1();
 //BA.debugLineNum = 8;BA.debugLine="Public Page2 As B4XPage2";
_page2 = new descargaadc.xy.b4xpage2();
 //BA.debugLineNum = 9;BA.debugLine="Public Provider As FileProvider";
_provider = new descargaadc.xy.fileprovider();
 //BA.debugLineNum = 11;BA.debugLine="Private cargas,filedir,videofiledir As String";
_cargas = "";
_filedir = "";
_videofiledir = "";
 //BA.debugLineNum = 12;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 14;BA.debugLine="cargas = rp.GetSafeDirDefaultExternal(\"cargas\")";
_cargas = _rp.GetSafeDirDefaultExternal("cargas");
 //BA.debugLineNum = 15;BA.debugLine="Private Label31 As Label";
_label31 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private Label32 As Label";
_label32 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Label33 As Label";
_label33 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Label34 As Label";
_label34 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Label35 As Label";
_label35 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label36 As Label";
_label36 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Label38 As Label";
_label38 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label39 As Label";
_label39 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label40 As Label";
_label40 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label44 As Label";
_label44 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Label49 As Label";
_label49 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Label50 As Label";
_label50 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label51 As Label";
_label51 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label52 As Label";
_label52 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label53 As Label";
_label53 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label54 As Label";
_label54 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label55 As Label";
_label55 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Label56 As Label";
_label56 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Label57 As Label";
_label57 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Label58 As Label";
_label58 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Label59 As Label";
_label59 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Label60 As Label";
_label60 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Label61 As Label";
_label61 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Label70 As Label";
_label70 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private label72 As Label";
_label72 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Label73 As Label";
_label73 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Label74 As Label";
_label74 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label75 As Label";
_label75 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Label76 As Label";
_label76 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Label77 As Label";
_label77 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Label78 As Label";
_label78 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Label79 As Label";
_label79 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private Label80 As Label";
_label80 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private Label81 As Label";
_label81 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private Label83 As Label";
_label83 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private Label84 As Label";
_label84 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private Label85 As Label";
_label85 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private Label86 As Label";
_label86 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private label88 As Label";
_label88 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Private label99 As Label";
_label99 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Public pallet1 As EditText";
_pallet1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Public pallet2 As EditText";
_pallet2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Public pallet3 As EditText";
_pallet3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Public pallet4 As EditText";
_pallet4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 178;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 179;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 180;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 181;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 190;BA.debugLine="Private lblPage1Title As Label";
_lblpage1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 191;BA.debugLine="Public peso10a As EditText";
_peso10a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 192;BA.debugLine="Public peso10b As EditText";
_peso10b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 193;BA.debugLine="Public peso10c As EditText";
_peso10c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 194;BA.debugLine="Public peso10d As EditText";
_peso10d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 195;BA.debugLine="Public peso11a As EditText";
_peso11a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 196;BA.debugLine="Public peso11b As EditText";
_peso11b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 197;BA.debugLine="Public peso11c As EditText";
_peso11c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 198;BA.debugLine="Public peso11d As EditText";
_peso11d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 199;BA.debugLine="Public peso12a As EditText";
_peso12a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 200;BA.debugLine="Public peso12b As EditText";
_peso12b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 201;BA.debugLine="Public peso12c As EditText";
_peso12c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Public peso12d As EditText";
_peso12d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 203;BA.debugLine="Public peso1a As EditText";
_peso1a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 204;BA.debugLine="Public peso1b As EditText";
_peso1b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 205;BA.debugLine="Public peso1c As EditText";
_peso1c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 206;BA.debugLine="Public peso1d As EditText";
_peso1d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Public peso2a As EditText";
_peso2a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Public peso2b As EditText";
_peso2b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 209;BA.debugLine="Public peso2c As EditText";
_peso2c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 210;BA.debugLine="Public peso2d As EditText";
_peso2d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 211;BA.debugLine="Public peso3a As EditText";
_peso3a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 212;BA.debugLine="Public peso3b As EditText";
_peso3b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 213;BA.debugLine="Public peso3c As EditText";
_peso3c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 214;BA.debugLine="Public peso3d As EditText";
_peso3d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 215;BA.debugLine="Public peso4a As EditText";
_peso4a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 216;BA.debugLine="Public peso4b As EditText";
_peso4b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 217;BA.debugLine="Public peso4c As EditText";
_peso4c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 218;BA.debugLine="Public peso4d As EditText";
_peso4d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 219;BA.debugLine="Public peso5a As EditText";
_peso5a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 220;BA.debugLine="Public peso5b As EditText";
_peso5b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 221;BA.debugLine="Public peso5c As EditText";
_peso5c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 222;BA.debugLine="Public peso5d As EditText";
_peso5d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 223;BA.debugLine="Public peso6a As EditText";
_peso6a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 224;BA.debugLine="Public peso6b As EditText";
_peso6b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 225;BA.debugLine="Public peso6c As EditText";
_peso6c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 226;BA.debugLine="Public peso6d As EditText";
_peso6d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 227;BA.debugLine="Public peso7a As EditText";
_peso7a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 228;BA.debugLine="Public peso7b As EditText";
_peso7b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 229;BA.debugLine="Public peso7c As EditText";
_peso7c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 230;BA.debugLine="Public peso7d As EditText";
_peso7d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 231;BA.debugLine="Public peso8a As EditText";
_peso8a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 232;BA.debugLine="Public peso8d As EditText";
_peso8d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 233;BA.debugLine="Public peso8b As EditText";
_peso8b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 234;BA.debugLine="Public peso8c As EditText";
_peso8c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 235;BA.debugLine="Public peso9a As EditText";
_peso9a = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 236;BA.debugLine="Public peso9b As EditText";
_peso9b = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 237;BA.debugLine="Public peso9c As EditText";
_peso9c = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 238;BA.debugLine="Public peso9d As EditText";
_peso9d = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 242;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 244;BA.debugLine="Private llenar As Button";
_llenar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Private otra As Button";
_otra = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 246;BA.debugLine="Private otra2 As Button";
_otra2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 249;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 250;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 251;BA.debugLine="Private Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 252;BA.debugLine="Private Label19 As Label";
_label19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 253;BA.debugLine="Private label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 254;BA.debugLine="Private Label20 As Label";
_label20 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 255;BA.debugLine="Private Label22 As Label";
_label22 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 256;BA.debugLine="Private Label26 As Label";
_label26 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 257;BA.debugLine="Private Label27 As Label";
_label27 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 258;BA.debugLine="Private Label28 As Label";
_label28 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Private Label29 As Label";
_label29 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 260;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 261;BA.debugLine="Private Label30 As Label";
_label30 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 262;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 263;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 264;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 265;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 266;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 270;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 271;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return null;
}
public String  _limitartexto(anywheresoftware.b4a.objects.EditTextWrapper _edt,String _new) throws Exception{
 //BA.debugLineNum = 913;BA.debugLine="Sub LimitarTexto(edt As EditText, New As String)";
 //BA.debugLineNum = 914;BA.debugLine="If edt.Text.Length > 4 Then";
if (_edt.getText().length()>4) { 
 //BA.debugLineNum = 915;BA.debugLine="edt.Text = edt.Text.SubString2(0, 4)";
_edt.setText(BA.ObjectToCharSequence(_edt.getText().substring((int) (0),(int) (4))));
 //BA.debugLineNum = 916;BA.debugLine="edt.SelectionStart = 4 ' Mantiene el cursor al f";
_edt.setSelectionStart((int) (4));
 };
 //BA.debugLineNum = 918;BA.debugLine="End Sub";
return "";
}
public String  _limitartexto4(anywheresoftware.b4a.objects.EditTextWrapper _edt,String _new) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub LimitarTexto4(edt As EditText, New As String)";
 //BA.debugLineNum = 896;BA.debugLine="If edt.Text.Length > 6 Then";
if (_edt.getText().length()>6) { 
 //BA.debugLineNum = 897;BA.debugLine="edt.Text = edt.Text.SubString2(0, 6)";
_edt.setText(BA.ObjectToCharSequence(_edt.getText().substring((int) (0),(int) (6))));
 //BA.debugLineNum = 898;BA.debugLine="edt.SelectionStart = 6 ' Mantiene el cursor al f";
_edt.setSelectionStart((int) (6));
 };
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return "";
}
public String  _llenado() throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub llenado";
 //BA.debugLineNum = 945;BA.debugLine="peso1a.Text = \"1\"";
_peso1a.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 946;BA.debugLine="peso2a.Text = \"2\"";
_peso2a.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 947;BA.debugLine="peso3a.Text = \"3\"";
_peso3a.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 948;BA.debugLine="peso4a.Text = \"4\"";
_peso4a.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 949;BA.debugLine="peso5a.Text = \"5\"";
_peso5a.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 950;BA.debugLine="peso6a.Text = \"6\"";
_peso6a.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 951;BA.debugLine="peso7a.Text = \"7\"";
_peso7a.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 952;BA.debugLine="peso8a.Text = \"8\"";
_peso8a.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 953;BA.debugLine="peso9a.Text = \"9\"";
_peso9a.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 954;BA.debugLine="peso10a.Text = \"10\"";
_peso10a.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 955;BA.debugLine="peso11a.Text = \"11\"";
_peso11a.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 956;BA.debugLine="peso12a.Text = \"12\"";
_peso12a.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 959;BA.debugLine="peso1b.Text = \"1\"";
_peso1b.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 960;BA.debugLine="peso2b.Text = \"2\"";
_peso2b.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 961;BA.debugLine="peso3b.Text = \"3\"";
_peso3b.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 962;BA.debugLine="peso4b.Text = \"4\"";
_peso4b.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 963;BA.debugLine="peso5b.Text = \"5\"";
_peso5b.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 964;BA.debugLine="peso6b.Text = \"6\"";
_peso6b.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 965;BA.debugLine="peso7b.Text = \"7\"";
_peso7b.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 966;BA.debugLine="peso8b.Text = \"8\"";
_peso8b.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 967;BA.debugLine="peso9b.Text = \"9\"";
_peso9b.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 968;BA.debugLine="peso10b.Text = \"10\"";
_peso10b.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 969;BA.debugLine="peso11b.Text = \"11\"";
_peso11b.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 970;BA.debugLine="peso12b.Text = \"12\"";
_peso12b.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 973;BA.debugLine="peso1c.Text = \"1\"";
_peso1c.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 974;BA.debugLine="peso2c.Text = \"2\"";
_peso2c.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 975;BA.debugLine="peso3c.Text = \"3\"";
_peso3c.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 976;BA.debugLine="peso4c.Text = \"4\"";
_peso4c.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 977;BA.debugLine="peso5c.Text = \"5\"";
_peso5c.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 978;BA.debugLine="peso6c.Text = \"6\"";
_peso6c.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 979;BA.debugLine="peso7c.Text = \"7\"";
_peso7c.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 980;BA.debugLine="peso8c.Text = \"8\"";
_peso8c.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 981;BA.debugLine="peso9c.Text = \"9\"";
_peso9c.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 982;BA.debugLine="peso10c.Text = \"10\"";
_peso10c.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 983;BA.debugLine="peso11c.Text = \"11\"";
_peso11c.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 984;BA.debugLine="peso12c.Text = \"12\"";
_peso12c.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 987;BA.debugLine="peso1d.Text = \"1\"";
_peso1d.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 988;BA.debugLine="peso2d.Text = \"2\"";
_peso2d.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 989;BA.debugLine="peso3d.Text = \"3\"";
_peso3d.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 990;BA.debugLine="peso4d.Text = \"4\"";
_peso4d.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 991;BA.debugLine="peso5d.Text = \"5\"";
_peso5d.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 992;BA.debugLine="peso6d.Text = \"6\"";
_peso6d.setText(BA.ObjectToCharSequence("6"));
 //BA.debugLineNum = 993;BA.debugLine="peso7d.Text = \"7\"";
_peso7d.setText(BA.ObjectToCharSequence("7"));
 //BA.debugLineNum = 994;BA.debugLine="peso8d.Text = \"8\"";
_peso8d.setText(BA.ObjectToCharSequence("8"));
 //BA.debugLineNum = 995;BA.debugLine="peso9d.Text = \"9\"";
_peso9d.setText(BA.ObjectToCharSequence("9"));
 //BA.debugLineNum = 996;BA.debugLine="peso10d.Text = \"10\"";
_peso10d.setText(BA.ObjectToCharSequence("10"));
 //BA.debugLineNum = 997;BA.debugLine="peso11d.Text = \"11\"";
_peso11d.setText(BA.ObjectToCharSequence("11"));
 //BA.debugLineNum = 998;BA.debugLine="peso12d.Text = \"12\"";
_peso12d.setText(BA.ObjectToCharSequence("12"));
 //BA.debugLineNum = 999;BA.debugLine="End Sub";
return "";
}
public String  _llenar_click() throws Exception{
 //BA.debugLineNum = 665;BA.debugLine="Private Sub llenar_Click";
 //BA.debugLineNum = 667;BA.debugLine="pallet1.Text=\"22\"";
_pallet1.setText(BA.ObjectToCharSequence("22"));
 //BA.debugLineNum = 668;BA.debugLine="pallet2.Text=\"33\"";
_pallet2.setText(BA.ObjectToCharSequence("33"));
 //BA.debugLineNum = 669;BA.debugLine="pallet3.Text=\"44\"";
_pallet3.setText(BA.ObjectToCharSequence("44"));
 //BA.debugLineNum = 670;BA.debugLine="pallet4.Text=\"55\"";
_pallet4.setText(BA.ObjectToCharSequence("55"));
 //BA.debugLineNum = 674;BA.debugLine="peso10a.text=\"35.6\"";
_peso10a.setText(BA.ObjectToCharSequence("35.6"));
 //BA.debugLineNum = 675;BA.debugLine="peso10b.text=\"35.6\"";
_peso10b.setText(BA.ObjectToCharSequence("35.6"));
 //BA.debugLineNum = 676;BA.debugLine="peso10c.text=\"36.6\"";
_peso10c.setText(BA.ObjectToCharSequence("36.6"));
 //BA.debugLineNum = 677;BA.debugLine="peso10d.text=\"37.6\"";
_peso10d.setText(BA.ObjectToCharSequence("37.6"));
 //BA.debugLineNum = 678;BA.debugLine="peso11a.text=\"38.6\"";
_peso11a.setText(BA.ObjectToCharSequence("38.6"));
 //BA.debugLineNum = 679;BA.debugLine="peso11b.text=\"39.6\"";
_peso11b.setText(BA.ObjectToCharSequence("39.6"));
 //BA.debugLineNum = 680;BA.debugLine="peso11c.text=\"40.6\"";
_peso11c.setText(BA.ObjectToCharSequence("40.6"));
 //BA.debugLineNum = 681;BA.debugLine="peso11d.text=\"41.6\"";
_peso11d.setText(BA.ObjectToCharSequence("41.6"));
 //BA.debugLineNum = 682;BA.debugLine="peso12a.text=\"42.6\"";
_peso12a.setText(BA.ObjectToCharSequence("42.6"));
 //BA.debugLineNum = 683;BA.debugLine="peso12b.text=\"43.6\"";
_peso12b.setText(BA.ObjectToCharSequence("43.6"));
 //BA.debugLineNum = 684;BA.debugLine="peso12c.text=\"44.6\"";
_peso12c.setText(BA.ObjectToCharSequence("44.6"));
 //BA.debugLineNum = 685;BA.debugLine="peso12d.text=\"45.6\"";
_peso12d.setText(BA.ObjectToCharSequence("45.6"));
 //BA.debugLineNum = 686;BA.debugLine="peso1a.text=\"46.6\"";
_peso1a.setText(BA.ObjectToCharSequence("46.6"));
 //BA.debugLineNum = 687;BA.debugLine="peso1b.text=\"47.6\"";
_peso1b.setText(BA.ObjectToCharSequence("47.6"));
 //BA.debugLineNum = 688;BA.debugLine="peso1c.text=\"48.6\"";
_peso1c.setText(BA.ObjectToCharSequence("48.6"));
 //BA.debugLineNum = 689;BA.debugLine="peso1d.text=\"49.6\"";
_peso1d.setText(BA.ObjectToCharSequence("49.6"));
 //BA.debugLineNum = 690;BA.debugLine="peso2a.text=\"50.6\"";
_peso2a.setText(BA.ObjectToCharSequence("50.6"));
 //BA.debugLineNum = 691;BA.debugLine="peso2b.text=\"51.6\"";
_peso2b.setText(BA.ObjectToCharSequence("51.6"));
 //BA.debugLineNum = 692;BA.debugLine="peso2c.text=\"52.6\"";
_peso2c.setText(BA.ObjectToCharSequence("52.6"));
 //BA.debugLineNum = 693;BA.debugLine="peso2d.text=\"53.6\"";
_peso2d.setText(BA.ObjectToCharSequence("53.6"));
 //BA.debugLineNum = 694;BA.debugLine="peso3a.text=\"54.6\"";
_peso3a.setText(BA.ObjectToCharSequence("54.6"));
 //BA.debugLineNum = 695;BA.debugLine="peso3b.text=\"55.6\"";
_peso3b.setText(BA.ObjectToCharSequence("55.6"));
 //BA.debugLineNum = 696;BA.debugLine="peso3c.text=\"56.6\"";
_peso3c.setText(BA.ObjectToCharSequence("56.6"));
 //BA.debugLineNum = 697;BA.debugLine="peso3d.text=\"57.6\"";
_peso3d.setText(BA.ObjectToCharSequence("57.6"));
 //BA.debugLineNum = 698;BA.debugLine="peso4a.text=\"58.6\"";
_peso4a.setText(BA.ObjectToCharSequence("58.6"));
 //BA.debugLineNum = 699;BA.debugLine="peso4b.text=\"59.6\"";
_peso4b.setText(BA.ObjectToCharSequence("59.6"));
 //BA.debugLineNum = 700;BA.debugLine="peso4c.text=\"60.6\"";
_peso4c.setText(BA.ObjectToCharSequence("60.6"));
 //BA.debugLineNum = 701;BA.debugLine="peso4d.text=\"61.6\"";
_peso4d.setText(BA.ObjectToCharSequence("61.6"));
 //BA.debugLineNum = 702;BA.debugLine="peso5a.text=\"62.6\"";
_peso5a.setText(BA.ObjectToCharSequence("62.6"));
 //BA.debugLineNum = 703;BA.debugLine="peso5b.text=\"63.6\"";
_peso5b.setText(BA.ObjectToCharSequence("63.6"));
 //BA.debugLineNum = 704;BA.debugLine="peso5c.text=\"64.6\"";
_peso5c.setText(BA.ObjectToCharSequence("64.6"));
 //BA.debugLineNum = 705;BA.debugLine="peso5d.text=\"65.6\"";
_peso5d.setText(BA.ObjectToCharSequence("65.6"));
 //BA.debugLineNum = 706;BA.debugLine="peso6a.text=\"66.6\"";
_peso6a.setText(BA.ObjectToCharSequence("66.6"));
 //BA.debugLineNum = 707;BA.debugLine="peso6b.text=\"67.6\"";
_peso6b.setText(BA.ObjectToCharSequence("67.6"));
 //BA.debugLineNum = 708;BA.debugLine="peso6c.text=\"68.6\"";
_peso6c.setText(BA.ObjectToCharSequence("68.6"));
 //BA.debugLineNum = 709;BA.debugLine="peso6d.text=\"69.6\"";
_peso6d.setText(BA.ObjectToCharSequence("69.6"));
 //BA.debugLineNum = 710;BA.debugLine="peso7a.text=\"70.6\"";
_peso7a.setText(BA.ObjectToCharSequence("70.6"));
 //BA.debugLineNum = 711;BA.debugLine="peso7b.text=\"71.6\"";
_peso7b.setText(BA.ObjectToCharSequence("71.6"));
 //BA.debugLineNum = 712;BA.debugLine="peso7c.text=\"72.6\"";
_peso7c.setText(BA.ObjectToCharSequence("72.6"));
 //BA.debugLineNum = 713;BA.debugLine="peso7d.text=\"73.6\"";
_peso7d.setText(BA.ObjectToCharSequence("73.6"));
 //BA.debugLineNum = 714;BA.debugLine="peso8a.text=\"74.6\"";
_peso8a.setText(BA.ObjectToCharSequence("74.6"));
 //BA.debugLineNum = 715;BA.debugLine="peso8d.text=\"75.6\"";
_peso8d.setText(BA.ObjectToCharSequence("75.6"));
 //BA.debugLineNum = 716;BA.debugLine="peso8b.text=\"76.6\"";
_peso8b.setText(BA.ObjectToCharSequence("76.6"));
 //BA.debugLineNum = 717;BA.debugLine="peso8c.text=\"77.6\"";
_peso8c.setText(BA.ObjectToCharSequence("77.6"));
 //BA.debugLineNum = 718;BA.debugLine="peso9a.text=\"78.6\"";
_peso9a.setText(BA.ObjectToCharSequence("78.6"));
 //BA.debugLineNum = 719;BA.debugLine="peso9b.text=\"79.6\"";
_peso9b.setText(BA.ObjectToCharSequence("79.6"));
 //BA.debugLineNum = 720;BA.debugLine="peso9c.text=\"80.6\"";
_peso9c.setText(BA.ObjectToCharSequence("80.6"));
 //BA.debugLineNum = 721;BA.debugLine="peso9d.text=\"81.6\"";
_peso9d.setText(BA.ObjectToCharSequence("81.6"));
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public String  _llenarpesos() throws Exception{
 //BA.debugLineNum = 590;BA.debugLine="Sub LlenarPesos";
 //BA.debugLineNum = 592;BA.debugLine="If pallet1.Text.trim= \"\" Then pallet1.Text = \"s/d";
if ((_pallet1.getText().trim()).equals("")) { 
_pallet1.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 593;BA.debugLine="If pallet2.Text.Trim = \"\" Then pallet2.Text = \"s/";
if ((_pallet2.getText().trim()).equals("")) { 
_pallet2.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 594;BA.debugLine="If pallet3.Text.Trim = \"\" Then pallet3.Text = \"s/";
if ((_pallet3.getText().trim()).equals("")) { 
_pallet3.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 595;BA.debugLine="If pallet4.Text.Trim = \"\" Then pallet4.Text = \"s/";
if ((_pallet4.getText().trim()).equals("")) { 
_pallet4.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 601;BA.debugLine="If peso1a.Text.trim= \"\" Then peso1a.Text = \"s/d\"";
if ((_peso1a.getText().trim()).equals("")) { 
_peso1a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 602;BA.debugLine="If peso2a.Text.Trim = \"\" Then peso2a.Text = \"s/d\"";
if ((_peso2a.getText().trim()).equals("")) { 
_peso2a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 603;BA.debugLine="If peso3a.Text.Trim = \"\" Then peso3a.Text = \"s/d\"";
if ((_peso3a.getText().trim()).equals("")) { 
_peso3a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 604;BA.debugLine="If peso4a.Text.Trim = \"\" Then peso4a.Text = \"s/d\"";
if ((_peso4a.getText().trim()).equals("")) { 
_peso4a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 605;BA.debugLine="If peso5a.Text.Trim = \"\" Then peso5a.Text = \"s/d\"";
if ((_peso5a.getText().trim()).equals("")) { 
_peso5a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 606;BA.debugLine="If peso6a.Text.Trim = \"\" Then peso6a.Text = \"s/d\"";
if ((_peso6a.getText().trim()).equals("")) { 
_peso6a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 607;BA.debugLine="If peso7a.Text.Trim = \"\" Then peso7a.Text = \"s/d\"";
if ((_peso7a.getText().trim()).equals("")) { 
_peso7a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 608;BA.debugLine="If peso8a.Text.Trim = \"\" Then peso8a.Text = \"s/d\"";
if ((_peso8a.getText().trim()).equals("")) { 
_peso8a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 609;BA.debugLine="If peso9a.Text.Trim = \"\" Then peso9a.Text = \"s/d\"";
if ((_peso9a.getText().trim()).equals("")) { 
_peso9a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 610;BA.debugLine="If peso10a.Text.Trim = \"\" Then peso10a.Text = \"s/";
if ((_peso10a.getText().trim()).equals("")) { 
_peso10a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 611;BA.debugLine="If peso11a.Text.Trim = \"\" Then peso11a.Text = \"s/";
if ((_peso11a.getText().trim()).equals("")) { 
_peso11a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 612;BA.debugLine="If peso12a.Text.Trim = \"\" Then peso12a.Text = \"s/";
if ((_peso12a.getText().trim()).equals("")) { 
_peso12a.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 615;BA.debugLine="If peso1b.Text.Trim = \"\" Then peso1b.Text = \"s/d\"";
if ((_peso1b.getText().trim()).equals("")) { 
_peso1b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 616;BA.debugLine="If peso2b.Text.Trim = \"\" Then peso2b.Text = \"s/d\"";
if ((_peso2b.getText().trim()).equals("")) { 
_peso2b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 617;BA.debugLine="If peso3b.Text.Trim = \"\" Then peso3b.Text = \"s/d\"";
if ((_peso3b.getText().trim()).equals("")) { 
_peso3b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 618;BA.debugLine="If peso4b.Text.Trim = \"\" Then peso4b.Text = \"s/d\"";
if ((_peso4b.getText().trim()).equals("")) { 
_peso4b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 619;BA.debugLine="If peso5b.Text.Trim = \"\" Then peso5b.Text = \"s/d\"";
if ((_peso5b.getText().trim()).equals("")) { 
_peso5b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 620;BA.debugLine="If peso6b.Text.Trim = \"\" Then peso6b.Text = \"s/d\"";
if ((_peso6b.getText().trim()).equals("")) { 
_peso6b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 621;BA.debugLine="If peso7b.Text.Trim = \"\" Then peso7b.Text = \"s/d\"";
if ((_peso7b.getText().trim()).equals("")) { 
_peso7b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 622;BA.debugLine="If peso8b.Text.Trim = \"\" Then peso8b.Text = \"s/d\"";
if ((_peso8b.getText().trim()).equals("")) { 
_peso8b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 623;BA.debugLine="If peso9b.Text.Trim = \"\" Then peso9b.Text = \"s/d\"";
if ((_peso9b.getText().trim()).equals("")) { 
_peso9b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 624;BA.debugLine="If peso10b.Text.Trim = \"\" Then peso10b.Text = \"s/";
if ((_peso10b.getText().trim()).equals("")) { 
_peso10b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 625;BA.debugLine="If peso11b.Text.Trim = \"\" Then peso11b.Text = \"s/";
if ((_peso11b.getText().trim()).equals("")) { 
_peso11b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 626;BA.debugLine="If peso12b.Text.Trim = \"\" Then peso12b.Text = \"s/";
if ((_peso12b.getText().trim()).equals("")) { 
_peso12b.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 628;BA.debugLine="If peso1c.Text.Trim = \"\" Then peso1c.Text = \"s/d\"";
if ((_peso1c.getText().trim()).equals("")) { 
_peso1c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 629;BA.debugLine="If peso2c.Text.Trim = \"\" Then peso2c.Text = \"s/d\"";
if ((_peso2c.getText().trim()).equals("")) { 
_peso2c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 630;BA.debugLine="If peso3c.Text.Trim = \"\" Then peso3c.Text = \"s/d\"";
if ((_peso3c.getText().trim()).equals("")) { 
_peso3c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 631;BA.debugLine="If peso4c.Text.Trim = \"\" Then peso4c.Text = \"s/d\"";
if ((_peso4c.getText().trim()).equals("")) { 
_peso4c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 632;BA.debugLine="If peso5c.Text.Trim = \"\" Then peso5c.Text = \"s/d\"";
if ((_peso5c.getText().trim()).equals("")) { 
_peso5c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 633;BA.debugLine="If peso6c.Text.Trim = \"\" Then peso6c.Text = \"s/d\"";
if ((_peso6c.getText().trim()).equals("")) { 
_peso6c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 634;BA.debugLine="If peso7c.Text.Trim = \"\" Then peso7c.Text = \"s/d\"";
if ((_peso7c.getText().trim()).equals("")) { 
_peso7c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 635;BA.debugLine="If peso8c.Text.Trim = \"\" Then peso8c.Text = \"s/d\"";
if ((_peso8c.getText().trim()).equals("")) { 
_peso8c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 636;BA.debugLine="If peso9c.Text.Trim = \"\" Then peso9c.Text = \"s/d\"";
if ((_peso9c.getText().trim()).equals("")) { 
_peso9c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 637;BA.debugLine="If peso10c.Text.Trim = \"\" Then peso10c.Text = \"s/";
if ((_peso10c.getText().trim()).equals("")) { 
_peso10c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 638;BA.debugLine="If peso11c.Text.Trim = \"\" Then peso11c.Text = \"s/";
if ((_peso11c.getText().trim()).equals("")) { 
_peso11c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 639;BA.debugLine="If peso12c.Text.Trim = \"\" Then peso12c.Text = \"s/";
if ((_peso12c.getText().trim()).equals("")) { 
_peso12c.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 642;BA.debugLine="If peso1d.Text.Trim = \"\" Then peso1d.Text = \"s/d\"";
if ((_peso1d.getText().trim()).equals("")) { 
_peso1d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 643;BA.debugLine="If peso2d.Text.Trim = \"\" Then peso2d.Text = \"s/d\"";
if ((_peso2d.getText().trim()).equals("")) { 
_peso2d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 644;BA.debugLine="If peso3d.Text.Trim = \"\" Then peso3d.Text = \"s/d\"";
if ((_peso3d.getText().trim()).equals("")) { 
_peso3d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 645;BA.debugLine="If peso4d.Text.Trim = \"\" Then peso4d.Text = \"s/d\"";
if ((_peso4d.getText().trim()).equals("")) { 
_peso4d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 646;BA.debugLine="If peso5d.Text.Trim = \"\" Then peso5d.Text = \"s/d\"";
if ((_peso5d.getText().trim()).equals("")) { 
_peso5d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 647;BA.debugLine="If peso6d.Text.Trim = \"\" Then peso6d.Text = \"s/d\"";
if ((_peso6d.getText().trim()).equals("")) { 
_peso6d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 648;BA.debugLine="If peso7d.Text.Trim = \"\" Then peso7d.Text = \"s/d\"";
if ((_peso7d.getText().trim()).equals("")) { 
_peso7d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 649;BA.debugLine="If peso8d.Text.Trim = \"\" Then peso8d.Text = \"s/d\"";
if ((_peso8d.getText().trim()).equals("")) { 
_peso8d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 650;BA.debugLine="If peso9d.Text.Trim = \"\" Then peso9d.Text = \"s/d\"";
if ((_peso9d.getText().trim()).equals("")) { 
_peso9d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 651;BA.debugLine="If peso10d.Text.Trim = \"\" Then peso10d.Text = \"s/";
if ((_peso10d.getText().trim()).equals("")) { 
_peso10d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 652;BA.debugLine="If peso11d.Text.Trim = \"\" Then peso11d.Text = \"s/";
if ((_peso11d.getText().trim()).equals("")) { 
_peso11d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 653;BA.debugLine="If peso12d.Text.Trim = \"\" Then peso12d.Text = \"s/";
if ((_peso12d.getText().trim()).equals("")) { 
_peso12d.setText(BA.ObjectToCharSequence("s/d"));};
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public String  _otra_click() throws Exception{
 //BA.debugLineNum = 1002;BA.debugLine="Private Sub otra_Click";
 //BA.debugLineNum = 1003;BA.debugLine="LlenarPesos";
_llenarpesos();
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return "";
}
public String  _otra2_click() throws Exception{
 //BA.debugLineNum = 661;BA.debugLine="Private Sub otra2_Click";
 //BA.debugLineNum = 663;BA.debugLine="End Sub";
return "";
}
public String  _pallet1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Sub pallet1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 724;BA.debugLine="LimitarTexto4(pallet1, New)";
_limitartexto4(_pallet1,_new);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public String  _pallet2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 727;BA.debugLine="Sub pallet2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 728;BA.debugLine="LimitarTexto4(pallet2, New)";
_limitartexto4(_pallet2,_new);
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
return "";
}
public String  _pallet3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 731;BA.debugLine="Sub pallet3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 732;BA.debugLine="LimitarTexto4(pallet3, New)";
_limitartexto4(_pallet3,_new);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return "";
}
public String  _pallet4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub pallet4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 737;BA.debugLine="LimitarTexto4(pallet4, New)";
_limitartexto4(_pallet4,_new);
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return "";
}
public String  _peso10a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 772;BA.debugLine="Sub peso10a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 773;BA.debugLine=": LimitarTexto(peso10a, New) :";
_limitartexto(_peso10a,_new);
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return "";
}
public String  _peso10b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub peso10b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 810;BA.debugLine=": LimitarTexto(peso10b, New) :";
_limitartexto(_peso10b,_new);
 //BA.debugLineNum = 811;BA.debugLine="End Sub";
return "";
}
public String  _peso10c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 846;BA.debugLine="Sub peso10c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 847;BA.debugLine=": LimitarTexto(peso10c, New) :";
_limitartexto(_peso10c,_new);
 //BA.debugLineNum = 848;BA.debugLine="End Sub";
return "";
}
public String  _peso10d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub peso10d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 884;BA.debugLine=": LimitarTexto(peso10d, New) :";
_limitartexto(_peso10d,_new);
 //BA.debugLineNum = 885;BA.debugLine="End Sub";
return "";
}
public String  _peso11a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 775;BA.debugLine="Sub peso11a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 776;BA.debugLine=": LimitarTexto(peso11a, New) :";
_limitartexto(_peso11a,_new);
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return "";
}
public String  _peso11b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 812;BA.debugLine="Sub peso11b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 813;BA.debugLine=": LimitarTexto(peso11b, New) :";
_limitartexto(_peso11b,_new);
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return "";
}
public String  _peso11c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 849;BA.debugLine="Sub peso11c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 850;BA.debugLine=": LimitarTexto(peso11c, New) :";
_limitartexto(_peso11c,_new);
 //BA.debugLineNum = 851;BA.debugLine="End Sub";
return "";
}
public String  _peso11d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 886;BA.debugLine="Sub peso11d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 887;BA.debugLine=": LimitarTexto(peso11d, New) :";
_limitartexto(_peso11d,_new);
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public String  _peso12a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 778;BA.debugLine="Sub peso12a_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 779;BA.debugLine=": LimitarTexto(peso12a, New) :";
_limitartexto(_peso12a,_new);
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
return "";
}
public String  _peso12b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 815;BA.debugLine="Sub peso12b_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 816;BA.debugLine=": LimitarTexto(peso12b, New) :";
_limitartexto(_peso12b,_new);
 //BA.debugLineNum = 817;BA.debugLine="End Sub";
return "";
}
public String  _peso12c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 852;BA.debugLine="Sub peso12c_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 853;BA.debugLine=": LimitarTexto(peso12c, New) :";
_limitartexto(_peso12c,_new);
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return "";
}
public String  _peso12d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub peso12d_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 890;BA.debugLine=": LimitarTexto(peso12d, New) :";
_limitartexto(_peso12d,_new);
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return "";
}
public String  _peso1a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 740;BA.debugLine="Sub peso1a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 741;BA.debugLine="LimitarTexto(peso1a, New)";
_limitartexto(_peso1a,_new);
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return "";
}
public String  _peso1b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 782;BA.debugLine="Sub peso1b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 783;BA.debugLine=": LimitarTexto(peso1b, New) :";
_limitartexto(_peso1b,_new);
 //BA.debugLineNum = 784;BA.debugLine="End Sub";
return "";
}
public String  _peso1c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub peso1c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 820;BA.debugLine=": LimitarTexto(peso1c, New) :";
_limitartexto(_peso1c,_new);
 //BA.debugLineNum = 821;BA.debugLine="End Sub";
return "";
}
public String  _peso1d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 856;BA.debugLine="Sub peso1d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 857;BA.debugLine=": LimitarTexto(peso1d, New) :";
_limitartexto(_peso1d,_new);
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _peso2a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 744;BA.debugLine="Sub peso2a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 745;BA.debugLine="LimitarTexto(peso2a, New)";
_limitartexto(_peso2a,_new);
 //BA.debugLineNum = 746;BA.debugLine="End Sub";
return "";
}
public String  _peso2b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub peso2b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 786;BA.debugLine=": LimitarTexto(peso2b, New) :";
_limitartexto(_peso2b,_new);
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return "";
}
public String  _peso2c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub peso2c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 823;BA.debugLine=": LimitarTexto(peso2c, New) :";
_limitartexto(_peso2c,_new);
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return "";
}
public String  _peso2d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 859;BA.debugLine="Sub peso2d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 860;BA.debugLine=": LimitarTexto(peso2d, New) :";
_limitartexto(_peso2d,_new);
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
return "";
}
public String  _peso3a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 748;BA.debugLine="Sub peso3a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 749;BA.debugLine="LimitarTexto(peso3a, New)";
_limitartexto(_peso3a,_new);
 //BA.debugLineNum = 750;BA.debugLine="End Sub";
return "";
}
public String  _peso3b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 788;BA.debugLine="Sub peso3b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 789;BA.debugLine=": LimitarTexto(peso3b, New) :";
_limitartexto(_peso3b,_new);
 //BA.debugLineNum = 790;BA.debugLine="End Sub";
return "";
}
public String  _peso3c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 825;BA.debugLine="Sub peso3c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 826;BA.debugLine=": LimitarTexto(peso3c, New) :";
_limitartexto(_peso3c,_new);
 //BA.debugLineNum = 827;BA.debugLine="End Sub";
return "";
}
public String  _peso3d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 862;BA.debugLine="Sub peso3d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 863;BA.debugLine=": LimitarTexto(peso3d, New) :";
_limitartexto(_peso3d,_new);
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
return "";
}
public String  _peso4a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 753;BA.debugLine="Sub peso4a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 754;BA.debugLine="LimitarTexto(peso4a, New)";
_limitartexto(_peso4a,_new);
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return "";
}
public String  _peso4b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 791;BA.debugLine="Sub peso4b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 792;BA.debugLine=": LimitarTexto(peso4b, New) :";
_limitartexto(_peso4b,_new);
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public String  _peso4c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 828;BA.debugLine="Sub peso4c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 829;BA.debugLine=": LimitarTexto(peso4c, New) :";
_limitartexto(_peso4c,_new);
 //BA.debugLineNum = 830;BA.debugLine="End Sub";
return "";
}
public String  _peso4d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 865;BA.debugLine="Sub peso4d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 866;BA.debugLine=": LimitarTexto(peso4d, New) :";
_limitartexto(_peso4d,_new);
 //BA.debugLineNum = 867;BA.debugLine="End Sub";
return "";
}
public String  _peso5a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 756;BA.debugLine="Sub peso5a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 757;BA.debugLine="LimitarTexto(peso5a, New)";
_limitartexto(_peso5a,_new);
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public String  _peso5b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub peso5b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 795;BA.debugLine=": LimitarTexto(peso5b, New) :";
_limitartexto(_peso5b,_new);
 //BA.debugLineNum = 796;BA.debugLine="End Sub";
return "";
}
public String  _peso5c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 831;BA.debugLine="Sub peso5c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 832;BA.debugLine=": LimitarTexto(peso5c, New) :";
_limitartexto(_peso5c,_new);
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return "";
}
public String  _peso5d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 868;BA.debugLine="Sub peso5d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 869;BA.debugLine=": LimitarTexto(peso5d, New) :";
_limitartexto(_peso5d,_new);
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return "";
}
public String  _peso6a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 759;BA.debugLine="Sub peso6a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 760;BA.debugLine="LimitarTexto(peso6a, New)";
_limitartexto(_peso6a,_new);
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _peso6b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 797;BA.debugLine="Sub peso6b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 798;BA.debugLine=": LimitarTexto(peso6b, New) :";
_limitartexto(_peso6b,_new);
 //BA.debugLineNum = 799;BA.debugLine="End Sub";
return "";
}
public String  _peso6c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 834;BA.debugLine="Sub peso6c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 835;BA.debugLine=": LimitarTexto(peso6c, New) :";
_limitartexto(_peso6c,_new);
 //BA.debugLineNum = 836;BA.debugLine="End Sub";
return "";
}
public String  _peso6d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 871;BA.debugLine="Sub peso6d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 872;BA.debugLine=": LimitarTexto(peso6d, New) :";
_limitartexto(_peso6d,_new);
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return "";
}
public String  _peso7a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 762;BA.debugLine="Sub peso7a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 763;BA.debugLine="LimitarTexto(peso7a, New)";
_limitartexto(_peso7a,_new);
 //BA.debugLineNum = 765;BA.debugLine="End Sub";
return "";
}
public String  _peso7b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub peso7b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 801;BA.debugLine=": LimitarTexto(peso7b, New) :";
_limitartexto(_peso7b,_new);
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return "";
}
public String  _peso7c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 837;BA.debugLine="Sub peso7c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 838;BA.debugLine=": LimitarTexto(peso7c, New) :";
_limitartexto(_peso7c,_new);
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public String  _peso7d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Sub peso7d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 875;BA.debugLine=": LimitarTexto(peso7d, New) :";
_limitartexto(_peso7d,_new);
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return "";
}
public String  _peso8a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 766;BA.debugLine="Sub peso8a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 767;BA.debugLine="LimitarTexto(peso8a, New)";
_limitartexto(_peso8a,_new);
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public String  _peso8b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 803;BA.debugLine="Sub peso8b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 804;BA.debugLine=": LimitarTexto(peso8b, New) :";
_limitartexto(_peso8b,_new);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return "";
}
public String  _peso8c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 840;BA.debugLine="Sub peso8c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 841;BA.debugLine=": LimitarTexto(peso8c, New) :";
_limitartexto(_peso8c,_new);
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return "";
}
public String  _peso8d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 877;BA.debugLine="Sub peso8d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 878;BA.debugLine=": LimitarTexto(peso8d, New) :";
_limitartexto(_peso8d,_new);
 //BA.debugLineNum = 879;BA.debugLine="End Sub";
return "";
}
public String  _peso9a_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 769;BA.debugLine="Sub peso9a_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 770;BA.debugLine=": LimitarTexto(peso9a, New)";
_limitartexto(_peso9a,_new);
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return "";
}
public String  _peso9b_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 806;BA.debugLine="Sub peso9b_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 807;BA.debugLine=": LimitarTexto(peso9b, New) :";
_limitartexto(_peso9b,_new);
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return "";
}
public String  _peso9c_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Sub peso9c_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 844;BA.debugLine=": LimitarTexto(peso9c, New) :";
_limitartexto(_peso9c,_new);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return "";
}
public String  _peso9d_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 880;BA.debugLine="Sub peso9d_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 881;BA.debugLine=": LimitarTexto(peso9d, New) :";
_limitartexto(_peso9d,_new);
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
