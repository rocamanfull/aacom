package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage1 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage1");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage1.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _llenar = null;
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
public anywheresoftware.b4a.objects.EditTextWrapper _nd1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _np9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _otros = null;
public anywheresoftware.b4a.objects.EditTextWrapper _otros2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd11 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd13 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd15 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd18 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd17 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp10 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp7 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp8 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pp9 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd12 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _nd14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pd12 = null;
public String _defec = "";
public String _defec2 = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _emp1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu4 = null;
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
public anywheresoftware.b4a.objects.EditTextWrapper _hora = null;
public anywheresoftware.b4a.objects.EditTextWrapper _vapor = null;
public anywheresoftware.b4a.objects.EditTextWrapper _conten = null;
public anywheresoftware.b4a.objects.EditTextWrapper _cliente = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _asoleado1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Sub asoleado1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 712;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 713;BA.debugLine="asoleado1.Text = Old";
_asoleado1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return "";
}
public String  _asoleado2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Sub asoleado2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 734;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 735;BA.debugLine="asoleado2.Text = Old";
_asoleado2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return "";
}
public String  _asoleado3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Sub asoleado3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 758;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 759;BA.debugLine="asoleado3.Text = Old";
_asoleado3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _asoleado4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 779;BA.debugLine="Sub asoleado4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 780;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 781;BA.debugLine="asoleado4.Text = Old";
_asoleado4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_appear() throws Exception{
descargaadc.xy.b4xmainpage _mainpage = null;
 //BA.debugLineNum = 332;BA.debugLine="private Sub B4XPage_Appear";
 //BA.debugLineNum = 333;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 334;BA.debugLine="If MainPage.carg1=False Then";
if (_mainpage._carg1 /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 335;BA.debugLine="Log(\"page1 es falsa\")";
__c.LogImpl("83276803","page1 es falsa",0);
 };
 //BA.debugLineNum = 337;BA.debugLine="MainPage.carg1=True";
_mainpage._carg1 /*boolean*/  = __c.True;
 //BA.debugLineNum = 338;BA.debugLine="If MainPage.carg1=True Then";
if (_mainpage._carg1 /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 339;BA.debugLine="Log(\"page1 es ok\")";
__c.LogImpl("83276807","page1 es ok",0);
 };
 //BA.debugLineNum = 341;BA.debugLine="If MainPage.master=True Then";
if (_mainpage._master /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 342;BA.debugLine="Log(\"master es true\")";
__c.LogImpl("83276810","master es true",0);
 //BA.debugLineNum = 343;BA.debugLine="llenar.Enabled=True";
_llenar.setEnabled(__c.True);
 //BA.debugLineNum = 344;BA.debugLine="llenar.Visible = True";
_llenar.setVisible(__c.True);
 };
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
boolean _a = false;
descargaadc.xy.b4xmainpage _mainpage = null;
anywheresoftware.b4a.objects.collections.List _list2 = null;
anywheresoftware.b4a.objects.collections.List _list3 = null;
 //BA.debugLineNum = 351;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 352;BA.debugLine="Private a As Boolean";
_a = false;
 //BA.debugLineNum = 353;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 355;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 356;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 358;BA.debugLine="ScrollView1.Panel.LoadLayout(\"carg2finalmod6\")'(\"";
_scrollview1.getPanel().LoadLayout("carg2finalmod6",ba);
 //BA.debugLineNum = 370;BA.debugLine="Panel2.Color=Colors.RGB(220,243,220)";
_panel2.setColor(__c.Colors.RGB((int) (220),(int) (243),(int) (220)));
 //BA.debugLineNum = 372;BA.debugLine="lblPage1Title.Text=\"Datos Carga 1\"";
_lblpage1title.setText(BA.ObjectToCharSequence("Datos Carga 1"));
 //BA.debugLineNum = 373;BA.debugLine="Label3.Text=\"Datos Carga 2\"";
_label3.setText(BA.ObjectToCharSequence("Datos Carga 2"));
 //BA.debugLineNum = 374;BA.debugLine="Label19.Text=\"Datos Carga 3\"";
_label19.setText(BA.ObjectToCharSequence("Datos Carga 3"));
 //BA.debugLineNum = 375;BA.debugLine="Label70.Text=\"Datos Carga 4\"";
_label70.setText(BA.ObjectToCharSequence("Datos Carga 4"));
 //BA.debugLineNum = 376;BA.debugLine="B4XPages.SetTitle(Me, \"Datos Cargas 1- 4\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Datos Cargas 1- 4"));
 //BA.debugLineNum = 380;BA.debugLine="ScrollView1.Panel.Height = Panel2.Height";
_scrollview1.getPanel().setHeight(_panel2.getHeight());
 //BA.debugLineNum = 381;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 382;BA.debugLine="If MainPage.carg1=False Then";
if (_mainpage._carg1 /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 383;BA.debugLine="Log(\"CARG1 es falsa\")";
__c.LogImpl("83342368","CARG1 es falsa",0);
 };
 //BA.debugLineNum = 385;BA.debugLine="MainPage.carg1=True";
_mainpage._carg1 /*boolean*/  = __c.True;
 //BA.debugLineNum = 386;BA.debugLine="If MainPage.carg1=True Then";
if (_mainpage._carg1 /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 387;BA.debugLine="Log(\"CARG1 es ok\")";
__c.LogImpl("83342372","CARG1 es ok",0);
 };
 //BA.debugLineNum = 389;BA.debugLine="llenar.Enabled=False";
_llenar.setEnabled(__c.False);
 //BA.debugLineNum = 390;BA.debugLine="llenar.Visible = False";
_llenar.setVisible(__c.False);
 //BA.debugLineNum = 391;BA.debugLine="If MainPage.master=False Then";
if (_mainpage._master /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 392;BA.debugLine="Log(\"master 1 es false \")";
__c.LogImpl("83342377","master 1 es false ",0);
 };
 //BA.debugLineNum = 399;BA.debugLine="If MainPage.master=True Then";
if (_mainpage._master /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 401;BA.debugLine="llenar.Enabled=True";
_llenar.setEnabled(__c.True);
 //BA.debugLineNum = 402;BA.debugLine="llenar.Visible = True";
_llenar.setVisible(__c.True);
 };
 //BA.debugLineNum = 420;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 421;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga1"));
 //BA.debugLineNum = 422;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga2"));
 //BA.debugLineNum = 423;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa1\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa1"));
 //BA.debugLineNum = 424;BA.debugLine="B4XPages.AddMenuItem(Me, \"Bolsa2\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Bolsa2"));
 //BA.debugLineNum = 430;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 451;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"android48.png");
 //BA.debugLineNum = 452;BA.debugLine="Dim list2 As List";
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 453;BA.debugLine="Dim list3 As List";
_list3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 454;BA.debugLine="filedir=File.DirAssets";
_filedir = __c.File.getDirAssets();
 //BA.debugLineNum = 459;BA.debugLine="list2 = File.ReadList(filedir, \"marc.txt\")";
_list2 = __c.File.ReadList(_filedir,"marc.txt");
 //BA.debugLineNum = 460;BA.debugLine="list3 = File.ReadList(filedir, \"emp.txt\")''e";
_list3 = __c.File.ReadList(_filedir,"emp.txt");
 //BA.debugLineNum = 466;BA.debugLine="emp1.AddAll(list3)";
_emp1.AddAll(_list3);
 //BA.debugLineNum = 467;BA.debugLine="emp2.AddAll(list3)";
_emp2.AddAll(_list3);
 //BA.debugLineNum = 468;BA.debugLine="emp3.AddAll(list3)";
_emp3.AddAll(_list3);
 //BA.debugLineNum = 469;BA.debugLine="emp4.AddAll(list3)";
_emp4.AddAll(_list3);
 //BA.debugLineNum = 470;BA.debugLine="calidad1.AddAll(Array As String(\"\",\"ELE1\",\"ELE2\",";
_calidad1.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","ELE1","ELE2","ELE3","ELE4","S/D"}));
 //BA.debugLineNum = 471;BA.debugLine="calidad2.AddAll(Array As String(\"\",\"ELE1\",\"ELE2\",";
_calidad2.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","ELE1","ELE2","ELE3","ELE4","S/D"}));
 //BA.debugLineNum = 472;BA.debugLine="calidad3.AddAll(Array As String(\"\",\"ELE1\",\"ELE2\",";
_calidad3.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","ELE1","ELE2","ELE3","ELE4","S/D"}));
 //BA.debugLineNum = 473;BA.debugLine="calidad4.AddAll(Array As String(\"\",\"ELE1\",\"ELE2\",";
_calidad4.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","ELE1","ELE2","ELE3","ELE4","S/D"}));
 //BA.debugLineNum = 474;BA.debugLine="apariencia1.AddAll(Array As String(\"\",\"Buena\",\"Re";
_apariencia1.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 476;BA.debugLine="apariencia2.AddAll(Array As String(\"\",\"Buena\",\"Re";
_apariencia2.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 478;BA.debugLine="apariencia3.AddAll(Array As String(\"\",\"Buena\",\"Re";
_apariencia3.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 480;BA.debugLine="apariencia4.AddAll(Array As String(\"\",\"Buena\",\"Re";
_apariencia4.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 483;BA.debugLine="calidadinterna1.AddAll(Array As String(\"\",\"Buena\"";
_calidadinterna1.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 485;BA.debugLine="calidadinterna2.AddAll(Array As String(\"\",\"Buena\"";
_calidadinterna2.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 487;BA.debugLine="calidadinterna3.AddAll(Array As String(\"\",\"Buena\"";
_calidadinterna3.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 489;BA.debugLine="calidadinterna4.AddAll(Array As String(\"\",\"Buena\"";
_calidadinterna4.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Buena","Regular","Mala","S/D"}));
 //BA.debugLineNum = 493;BA.debugLine="marca1.AddAll(list2)";
_marca1.AddAll(_list2);
 //BA.debugLineNum = 495;BA.debugLine="marca2.AddAll(list2)";
_marca2.AddAll(_list2);
 //BA.debugLineNum = 497;BA.debugLine="marca3.AddAll(list2)";
_marca3.AddAll(_list2);
 //BA.debugLineNum = 499;BA.debugLine="marca4.AddAll(list2)";
_marca4.AddAll(_list2);
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 918;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 919;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 921;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 922;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 924;BA.debugLine="If Tag =\"Carga1\" Then";
if ((_tag).equals("Carga1")) { 
 //BA.debugLineNum = 925;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 927;BA.debugLine="If Tag =\"Carga2\" Then";
if ((_tag).equals("Carga2")) { 
 //BA.debugLineNum = 928;BA.debugLine="B4XPages.ShowPage(\"Page 3\")";
_b4xpages._showpage /*String*/ (ba,"Page 3");
 };
 //BA.debugLineNum = 930;BA.debugLine="If Tag =\"Cargac1\" Then";
if ((_tag).equals("Cargac1")) { 
 //BA.debugLineNum = 931;BA.debugLine="B4XPages.ShowPage(\"Page 4\")";
_b4xpages._showpage /*String*/ (ba,"Page 4");
 };
 //BA.debugLineNum = 934;BA.debugLine="If Tag =\"Cargac2\" Then";
if ((_tag).equals("Cargac2")) { 
 //BA.debugLineNum = 935;BA.debugLine="B4XPages.ShowPage(\"Page 5\")";
_b4xpages._showpage /*String*/ (ba,"Page 5");
 };
 //BA.debugLineNum = 937;BA.debugLine="If Tag =\"Cargac3\" Then";
if ((_tag).equals("Cargac3")) { 
 //BA.debugLineNum = 938;BA.debugLine="B4XPages.ShowPage(\"Page 6\")";
_b4xpages._showpage /*String*/ (ba,"Page 6");
 };
 //BA.debugLineNum = 940;BA.debugLine="If Tag =\"Bolsa1\" Then";
if ((_tag).equals("Bolsa1")) { 
 //BA.debugLineNum = 941;BA.debugLine="B4XPages.ShowPage(\"Page 7\")";
_b4xpages._showpage /*String*/ (ba,"Page 7");
 };
 //BA.debugLineNum = 943;BA.debugLine="If Tag =\"Bolsa2\" Then";
if ((_tag).equals("Bolsa2")) { 
 //BA.debugLineNum = 944;BA.debugLine="B4XPages.ShowPage(\"Page 8\")";
_b4xpages._showpage /*String*/ (ba,"Page 8");
 };
 //BA.debugLineNum = 946;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 };
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return "";
}
public String  _bitter1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 699;BA.debugLine="Sub bitter1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 700;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 701;BA.debugLine="bitter1.Text = Old";
_bitter1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
return "";
}
public String  _bitter2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 721;BA.debugLine="Sub bitter2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 722;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 723;BA.debugLine="bitter2.Text = Old";
_bitter2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public String  _bitter3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 745;BA.debugLine="Sub bitter3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 746;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 747;BA.debugLine="bitter3.Text = Old";
_bitter3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return "";
}
public String  _bitter4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 767;BA.debugLine="Sub bitter4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 768;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 769;BA.debugLine="bitter4.Text = Old";
_bitter4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return "";
}
public String  _blanqueo2() throws Exception{
 //BA.debugLineNum = 1325;BA.debugLine="public Sub blanqueo2";
 //BA.debugLineNum = 1326;BA.debugLine="pallet1.Text=\"\"";
_pallet1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1327;BA.debugLine="pallet2.Text=\"\"";
_pallet2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1328;BA.debugLine="pallet3.Text=\"\"";
_pallet3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1329;BA.debugLine="pallet4.Text=\"\"";
_pallet4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1330;BA.debugLine="var1.Text=\"\"";
_var1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1331;BA.debugLine="var2.Text=\"\"";
_var2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1332;BA.debugLine="var3.Text=\"\"";
_var3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1333;BA.debugLine="var4.Text=\"\"";
_var4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1334;BA.debugLine="env1.Text=\"\"";
_env1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1335;BA.debugLine="env2.Text=\"\"";
_env2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1336;BA.debugLine="env3.Text=\"\"";
_env3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1337;BA.debugLine="env4.Text=\"\"";
_env4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1338;BA.debugLine="peso1.Text=\"\"";
_peso1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1339;BA.debugLine="peso2.Text=\"\"";
_peso2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1340;BA.debugLine="peso3.Text=\"\"";
_peso3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1341;BA.debugLine="peso4.Text=\"\"";
_peso4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1342;BA.debugLine="color1.Text=\"\"";
_color1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1343;BA.debugLine="color2.Text=\"\"";
_color2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1344;BA.debugLine="color3.Text=\"\"";
_color3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1345;BA.debugLine="color4.Text=\"\"";
_color4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1347;BA.debugLine="temp1.Text=\"\"";
_temp1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1348;BA.debugLine="temp2.Text=\"\"";
_temp2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1349;BA.debugLine="temp3.Text=\"\"";
_temp3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1350;BA.debugLine="temp4.Text=\"\"";
_temp4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1351;BA.debugLine="plu1.Text=\"\"";
_plu1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1352;BA.debugLine="plu2.Text=\"\"";
_plu2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1353;BA.debugLine="plu3.Text=\"\"";
_plu3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1354;BA.debugLine="plu4.Text=\"\"";
_plu4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1356;BA.debugLine="promedio1.Text=\"\"";
_promedio1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1357;BA.debugLine="promedio2.Text=\"\"";
_promedio2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1358;BA.debugLine="promedio3.Text=\"\"";
_promedio3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1359;BA.debugLine="promedio4.Text=\"\"";
_promedio4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1360;BA.debugLine="max1.Text=\"\"";
_max1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1361;BA.debugLine="max2.Text=\"\"";
_max2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1362;BA.debugLine="max3.Text=\"\"";
_max3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1363;BA.debugLine="max4.Text=\"\"";
_max4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1364;BA.debugLine="min1.Text=\"\"";
_min1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1365;BA.debugLine="min2.Text=\"\"";
_min2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1366;BA.debugLine="min3.Text=\"\"";
_min3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1367;BA.debugLine="min4.Text=\"\"";
_min4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1368;BA.debugLine="emp1.SelectedIndex=0";
_emp1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1369;BA.debugLine="emp2.SelectedIndex=0";
_emp2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1370;BA.debugLine="emp3.SelectedIndex=0";
_emp3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1371;BA.debugLine="emp4.SelectedIndex=0";
_emp4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1372;BA.debugLine="marca1.SelectedIndex=0";
_marca1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1373;BA.debugLine="marca2.SelectedIndex=0";
_marca2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1374;BA.debugLine="marca3.SelectedIndex=0";
_marca3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1375;BA.debugLine="marca4.SelectedIndex=0";
_marca4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1376;BA.debugLine="calidad1.SelectedIndex=0";
_calidad1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1377;BA.debugLine="calidad2.SelectedIndex=0";
_calidad2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1378;BA.debugLine="calidad3.SelectedIndex=0";
_calidad3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1380;BA.debugLine="calidad4.SelectedIndex=0";
_calidad4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1382;BA.debugLine="apariencia1.SelectedIndex=0";
_apariencia1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1383;BA.debugLine="apariencia2.SelectedIndex=0";
_apariencia2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1384;BA.debugLine="apariencia3.SelectedIndex=0";
_apariencia3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1385;BA.debugLine="apariencia4.SelectedIndex=0";
_apariencia4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1386;BA.debugLine="calidadinterna1.SelectedIndex=0 'Text=\"\"";
_calidadinterna1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1387;BA.debugLine="calidadinterna2.SelectedIndex=0 'Text=\"\"";
_calidadinterna2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1388;BA.debugLine="calidadinterna3.SelectedIndex=0 'Text=\"\"";
_calidadinterna3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1389;BA.debugLine="calidadinterna4.SelectedIndex=0 'Text=\"\"";
_calidadinterna4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1390;BA.debugLine="sello1.Text=\"\"";
_sello1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1391;BA.debugLine="sello2.Text=\"\"";
_sello2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1392;BA.debugLine="sello4.Text=\"\"";
_sello4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1393;BA.debugLine="sello3.Text=\"\"";
_sello3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1394;BA.debugLine="bitter1.Text=\"\"";
_bitter1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1395;BA.debugLine="manchas1.Text=\"\"";
_manchas1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1396;BA.debugLine="asoleado1.Text=\"\"";
_asoleado1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1397;BA.debugLine="heridas1.Text=\"\"";
_heridas1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1398;BA.debugLine="total1.Text=\"\"";
_total1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1399;BA.debugLine="bitter2.Text=\"\"";
_bitter2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1400;BA.debugLine="manchas2.Text=\"\"";
_manchas2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1401;BA.debugLine="asoleado2.Text=\"\"";
_asoleado2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1402;BA.debugLine="heridas2.Text=\"\"";
_heridas2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1403;BA.debugLine="total2.Text=\"\"";
_total2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1404;BA.debugLine="bitter3.Text=\"\"";
_bitter3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1405;BA.debugLine="manchas3.Text=\"\"";
_manchas3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1406;BA.debugLine="asoleado3.Text=\"\"";
_asoleado3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1407;BA.debugLine="heridas3.Text=\"\"";
_heridas3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1408;BA.debugLine="total3.Text=\"\"";
_total3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1409;BA.debugLine="bitter4.Text=\"\"";
_bitter4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1410;BA.debugLine="manchas4.Text=\"\"";
_manchas4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1411;BA.debugLine="asoleado4.Text=\"\"";
_asoleado4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1412;BA.debugLine="heridas4.Text=\"\"";
_heridas4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1413;BA.debugLine="total4.Text=\"\"";
_total4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1415;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 1312;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 1313;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1314;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 1420;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 1421;BA.debugLine="pallet1.Text=\"1\"";
_pallet1.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1422;BA.debugLine="pallet2.Text=\"1\"";
_pallet2.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1423;BA.debugLine="pallet3.Text=\"1\"";
_pallet3.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1424;BA.debugLine="pallet4.Text=\"1\"";
_pallet4.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1425;BA.debugLine="var1.Text=\"2\"";
_var1.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1426;BA.debugLine="var2.Text=\"2\"";
_var2.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1427;BA.debugLine="var3.Text=\"2\"";
_var3.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1428;BA.debugLine="var4.Text=\"2\"";
_var4.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1429;BA.debugLine="env1.Text=\"3\"";
_env1.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1430;BA.debugLine="env2.Text=\"3\"";
_env2.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1431;BA.debugLine="env3.Text=\"3\"";
_env3.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1432;BA.debugLine="env4.Text=\"3\"";
_env4.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1433;BA.debugLine="peso1.Text=\"3\"";
_peso1.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1434;BA.debugLine="peso2.Text=\"4\"";
_peso2.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1435;BA.debugLine="peso3.Text=\"4\"";
_peso3.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1436;BA.debugLine="peso4.Text=\"3\"";
_peso4.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1437;BA.debugLine="color1.Text=\"av\"";
_color1.setText(BA.ObjectToCharSequence("av"));
 //BA.debugLineNum = 1438;BA.debugLine="color2.Text=\"av\"";
_color2.setText(BA.ObjectToCharSequence("av"));
 //BA.debugLineNum = 1439;BA.debugLine="color3.Text=\"av\"";
_color3.setText(BA.ObjectToCharSequence("av"));
 //BA.debugLineNum = 1440;BA.debugLine="color4.Text=\"av\"";
_color4.setText(BA.ObjectToCharSequence("av"));
 //BA.debugLineNum = 1441;BA.debugLine="calidadinterna1.SelectedIndex=1";
_calidadinterna1.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1442;BA.debugLine="calidadinterna2.SelectedIndex=2";
_calidadinterna2.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1443;BA.debugLine="calidadinterna3.SelectedIndex=1";
_calidadinterna3.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1444;BA.debugLine="calidadinterna4.SelectedIndex=2";
_calidadinterna4.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1445;BA.debugLine="sello1.Text=\"17/1\"";
_sello1.setText(BA.ObjectToCharSequence("17/1"));
 //BA.debugLineNum = 1446;BA.debugLine="sello2.Text=\"17/1\"";
_sello2.setText(BA.ObjectToCharSequence("17/1"));
 //BA.debugLineNum = 1447;BA.debugLine="sello4.Text=\"17/1\"";
_sello4.setText(BA.ObjectToCharSequence("17/1"));
 //BA.debugLineNum = 1448;BA.debugLine="sello3.Text=\"17/1\"";
_sello3.setText(BA.ObjectToCharSequence("17/1"));
 //BA.debugLineNum = 1450;BA.debugLine="temp1.Text=\"1\"";
_temp1.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1451;BA.debugLine="temp2.Text=\"2\"";
_temp2.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1452;BA.debugLine="temp3.Text=\"3\"";
_temp3.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1453;BA.debugLine="temp4.Text=\"4\"";
_temp4.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1454;BA.debugLine="plu1.Text=\"1\"";
_plu1.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1455;BA.debugLine="plu2.Text=\"2\"";
_plu2.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1456;BA.debugLine="plu3.Text=\"3\"";
_plu3.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1457;BA.debugLine="plu4.Text=\"4\"";
_plu4.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1458;BA.debugLine="promedio1.Text=\"1\"";
_promedio1.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1459;BA.debugLine="promedio2.Text=\"2\"";
_promedio2.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1460;BA.debugLine="promedio3.Text=\"3\"";
_promedio3.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1461;BA.debugLine="promedio4.Text=\"4\"";
_promedio4.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1462;BA.debugLine="max1.Text=\"1\"";
_max1.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1463;BA.debugLine="max2.Text=\"1\"";
_max2.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1464;BA.debugLine="max3.Text=\"2\"";
_max3.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1465;BA.debugLine="max4.Text=\"3\"";
_max4.setText(BA.ObjectToCharSequence("3"));
 //BA.debugLineNum = 1466;BA.debugLine="min1.Text=\"4\"";
_min1.setText(BA.ObjectToCharSequence("4"));
 //BA.debugLineNum = 1467;BA.debugLine="min2.Text=\"5\"";
_min2.setText(BA.ObjectToCharSequence("5"));
 //BA.debugLineNum = 1468;BA.debugLine="min3.Text=\"1\"";
_min3.setText(BA.ObjectToCharSequence("1"));
 //BA.debugLineNum = 1469;BA.debugLine="min4.Text=\"2\"";
_min4.setText(BA.ObjectToCharSequence("2"));
 //BA.debugLineNum = 1470;BA.debugLine="emp1.SelectedIndex=1";
_emp1.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1471;BA.debugLine="emp2.SelectedIndex=1";
_emp2.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1472;BA.debugLine="emp3.SelectedIndex=1";
_emp3.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1473;BA.debugLine="emp4.SelectedIndex=1";
_emp4.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1474;BA.debugLine="marca1.SelectedIndex=1";
_marca1.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1475;BA.debugLine="marca2.SelectedIndex=2";
_marca2.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1476;BA.debugLine="marca3.SelectedIndex=3";
_marca3.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1477;BA.debugLine="marca4.SelectedIndex=4";
_marca4.setSelectedIndex((int) (4));
 //BA.debugLineNum = 1478;BA.debugLine="calidad1.SelectedIndex=1";
_calidad1.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1479;BA.debugLine="calidad2.SelectedIndex=2";
_calidad2.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1480;BA.debugLine="calidad3.SelectedIndex=2";
_calidad3.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1482;BA.debugLine="calidad4.SelectedIndex=1";
_calidad4.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1484;BA.debugLine="apariencia1.SelectedIndex=2";
_apariencia1.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1485;BA.debugLine="apariencia2.SelectedIndex=3";
_apariencia2.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1486;BA.debugLine="apariencia3.SelectedIndex=3";
_apariencia3.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1487;BA.debugLine="apariencia4.SelectedIndex=3";
_apariencia4.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1490;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 1417;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 1418;BA.debugLine="calc_Click";
_calc_click();
 //BA.debugLineNum = 1419;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
 //BA.debugLineNum = 1315;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 1316;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1317;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
 //BA.debugLineNum = 1318;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 1319;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1320;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 1321;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 1322;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1323;BA.debugLine="End Sub";
return "";
}
public String  _calc_click() throws Exception{
 //BA.debugLineNum = 1137;BA.debugLine="Sub calc_Click";
 //BA.debugLineNum = 1139;BA.debugLine="If valid =True Then";
if (_valid()==__c.True) { 
 //BA.debugLineNum = 1140;BA.debugLine="MsgboxAsync(\"Datos validados\",\"ok\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Datos validados"),BA.ObjectToCharSequence("ok"),ba);
 //BA.debugLineNum = 1142;BA.debugLine="ceros";
_ceros();
 //BA.debugLineNum = 1143;BA.debugLine="total";
_total();
 };
 //BA.debugLineNum = 1150;BA.debugLine="End Sub";
return "";
}
public String  _ceros() throws Exception{
 //BA.debugLineNum = 993;BA.debugLine="Sub ceros 'comprueba si no hay nada lleno y pone c";
 //BA.debugLineNum = 995;BA.debugLine="If bitter1.Text=\"\" Then";
if ((_bitter1.getText()).equals("")) { 
 //BA.debugLineNum = 996;BA.debugLine="bitter1.Text=\"0\"";
_bitter1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 998;BA.debugLine="If bitter2.Text=\"\" Then";
if ((_bitter2.getText()).equals("")) { 
 //BA.debugLineNum = 999;BA.debugLine="bitter2.Text=\"0\"";
_bitter2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1001;BA.debugLine="If bitter3.Text=\"\" Then";
if ((_bitter3.getText()).equals("")) { 
 //BA.debugLineNum = 1002;BA.debugLine="bitter3.Text=\"0\"";
_bitter3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1004;BA.debugLine="If bitter4.Text=\"\" Then";
if ((_bitter4.getText()).equals("")) { 
 //BA.debugLineNum = 1005;BA.debugLine="bitter4.Text=\"0\"";
_bitter4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1007;BA.debugLine="If asoleado1.Text=\"\" Then";
if ((_asoleado1.getText()).equals("")) { 
 //BA.debugLineNum = 1008;BA.debugLine="asoleado1.Text=\"0\"";
_asoleado1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1010;BA.debugLine="If asoleado2.Text=\"\" Then";
if ((_asoleado2.getText()).equals("")) { 
 //BA.debugLineNum = 1011;BA.debugLine="asoleado2.Text=\"0\"";
_asoleado2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1013;BA.debugLine="If asoleado3.Text=\"\" Then";
if ((_asoleado3.getText()).equals("")) { 
 //BA.debugLineNum = 1014;BA.debugLine="asoleado3.Text=\"0\"";
_asoleado3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1016;BA.debugLine="If asoleado4.Text=\"\" Then";
if ((_asoleado4.getText()).equals("")) { 
 //BA.debugLineNum = 1017;BA.debugLine="asoleado4.Text=\"0\"";
_asoleado4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1019;BA.debugLine="If heridas1.Text=\"\" Then";
if ((_heridas1.getText()).equals("")) { 
 //BA.debugLineNum = 1020;BA.debugLine="heridas1.Text=\"0\"";
_heridas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1022;BA.debugLine="If heridas2.Text=\"\" Then";
if ((_heridas2.getText()).equals("")) { 
 //BA.debugLineNum = 1023;BA.debugLine="heridas2.Text=\"0\"";
_heridas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1026;BA.debugLine="If heridas3.Text=\"\" Then";
if ((_heridas3.getText()).equals("")) { 
 //BA.debugLineNum = 1027;BA.debugLine="heridas3.Text=\"0\"";
_heridas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1030;BA.debugLine="If heridas4.Text=\"\" Then";
if ((_heridas4.getText()).equals("")) { 
 //BA.debugLineNum = 1031;BA.debugLine="heridas4.Text=\"0\"";
_heridas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1034;BA.debugLine="If manchas1.Text=\"\" Then";
if ((_manchas1.getText()).equals("")) { 
 //BA.debugLineNum = 1035;BA.debugLine="manchas1.Text=\"0\"";
_manchas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1037;BA.debugLine="If manchas2.Text=\"\" Then";
if ((_manchas2.getText()).equals("")) { 
 //BA.debugLineNum = 1038;BA.debugLine="manchas2.Text=\"0\"";
_manchas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1041;BA.debugLine="If manchas3.Text=\"\" Then";
if ((_manchas3.getText()).equals("")) { 
 //BA.debugLineNum = 1042;BA.debugLine="manchas3.Text=\"0\"";
_manchas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1045;BA.debugLine="If manchas4.Text=\"\" Then";
if ((_manchas4.getText()).equals("")) { 
 //BA.debugLineNum = 1046;BA.debugLine="manchas4.Text=\"0\"";
_manchas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1136;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="Public llenar As Button";
_llenar = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label14 As Label";
_label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label16 As Label";
_label16 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Label17 As Label";
_label17 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Label18 As Label";
_label18 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label19 As Label";
_label19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label20 As Label";
_label20 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label21 As Label";
_label21 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label22 As Label";
_label22 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Label23 As Label";
_label23 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Label24 As Label";
_label24 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Label25 As Label";
_label25 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Label26 As Label";
_label26 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Label27 As Label";
_label27 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Label28 As Label";
_label28 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Label29 As Label";
_label29 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Label30 As Label";
_label30 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Public nd1 As EditText";
_nd1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Public nd10 As EditText";
_nd10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Public nd11 As EditText";
_nd11 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Public nd13 As EditText";
_nd13 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Public nd15 As EditText";
_nd15 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Public nd16 As EditText";
_nd16 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Public nd17 As EditText";
_nd17 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Public nd18 As EditText";
_nd18 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Public nd2 As EditText";
_nd2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Public nd3 As EditText";
_nd3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Public nd4 As EditText";
_nd4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Public nd5 As EditText";
_nd5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Public nd6 As EditText";
_nd6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Public nd7 As EditText";
_nd7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Public nd8 As EditText";
_nd8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Public nd9 As EditText";
_nd9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Public np1 As EditText";
_np1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Public np10 As EditText";
_np10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Public np2 As EditText";
_np2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Public np3 As EditText";
_np3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Public np4 As EditText";
_np4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Public np5 As EditText";
_np5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 72;BA.debugLine="Public np6 As EditText";
_np6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Public np7 As EditText";
_np7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Public np8 As EditText";
_np8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Public np9 As EditText";
_np9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Public otros As EditText";
_otros = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Public otros2 As EditText";
_otros2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Public pd1 As EditText";
_pd1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Public pd10 As EditText";
_pd10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Public pd11 As EditText";
_pd11 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Public pd13 As EditText";
_pd13 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Public pd14 As EditText";
_pd14 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Public pd15 As EditText";
_pd15 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Public pd16 As EditText";
_pd16 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Public pd2 As EditText";
_pd2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Public pd3 As EditText";
_pd3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Public pd4 As EditText";
_pd4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 88;BA.debugLine="Public pd5 As EditText";
_pd5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Public pd6 As EditText";
_pd6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Public pd7 As EditText";
_pd7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Public pd8 As EditText";
_pd8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Public pd18 As EditText";
_pd18 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 93;BA.debugLine="Public pd17 As EditText";
_pd17 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 94;BA.debugLine="Public pd9 As EditText";
_pd9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 95;BA.debugLine="Public pp1 As EditText";
_pp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Public pp10 As EditText";
_pp10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 97;BA.debugLine="Public pp2 As EditText";
_pp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Public pp3 As EditText";
_pp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Public pp4 As EditText";
_pp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Public pp5 As EditText";
_pp5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 101;BA.debugLine="Public pp6 As EditText";
_pp6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Public pp7 As EditText";
_pp7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Public pp8 As EditText";
_pp8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 104;BA.debugLine="Public pp9 As EditText";
_pp9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Public nd12 As EditText";
_nd12 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Public nd14 As EditText";
_nd14 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Public pd12 As EditText";
_pd12 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 108;BA.debugLine="Private defec As String";
_defec = "";
 //BA.debugLineNum = 109;BA.debugLine="Private defec2 As String";
_defec2 = "";
 //BA.debugLineNum = 112;BA.debugLine="Public emp1 As Spinner";
_emp1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 113;BA.debugLine="Public emp2 As Spinner";
_emp2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Public emp3 As Spinner";
_emp3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Public emp4 As Spinner";
_emp4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Public pallet1 As EditText";
_pallet1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 118;BA.debugLine="Public pallet2 As EditText";
_pallet2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Public pallet3 As EditText";
_pallet3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 120;BA.debugLine="Public pallet4 As EditText";
_pallet4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 124;BA.debugLine="Public var1 As EditText";
_var1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 125;BA.debugLine="Public var2 As EditText";
_var2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Public var3 As EditText";
_var3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Public var4 As EditText";
_var4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Public marca1 As Spinner";
_marca1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Public marca2 As Spinner";
_marca2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Public marca3 As Spinner";
_marca3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 132;BA.debugLine="Public marca4 As Spinner";
_marca4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 134;BA.debugLine="Public env1 As EditText";
_env1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 135;BA.debugLine="Public env2 As EditText";
_env2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 136;BA.debugLine="Public env3 As EditText";
_env3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Public env4 As EditText";
_env4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 139;BA.debugLine="Public calidad1 As Spinner";
_calidad1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 140;BA.debugLine="Public calidad2 As Spinner";
_calidad2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 141;BA.debugLine="Public calidad3 As Spinner";
_calidad3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 142;BA.debugLine="Public calidad4 As Spinner";
_calidad4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 144;BA.debugLine="Public sello1 As EditText";
_sello1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 145;BA.debugLine="Public sello2 As EditText";
_sello2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 146;BA.debugLine="Public sello3 As EditText";
_sello3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 147;BA.debugLine="Public sello4 As EditText";
_sello4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 149;BA.debugLine="Public date1 As Button";
_date1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Public date2 As Button";
_date2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 151;BA.debugLine="Public date3 As Button";
_date3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 152;BA.debugLine="Public date4 As Button";
_date4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Public peso1 As EditText";
_peso1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 155;BA.debugLine="Public peso2 As EditText";
_peso2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 156;BA.debugLine="Public peso3 As EditText";
_peso3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 157;BA.debugLine="Public peso4 As EditText";
_peso4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 159;BA.debugLine="Public apariencia1 As Spinner";
_apariencia1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 160;BA.debugLine="Public apariencia2 As Spinner";
_apariencia2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 161;BA.debugLine="Public apariencia3 As Spinner";
_apariencia3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 162;BA.debugLine="Public apariencia4 As Spinner";
_apariencia4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 164;BA.debugLine="Public color1 As EditText";
_color1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 165;BA.debugLine="Public color2 As EditText";
_color2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 166;BA.debugLine="Public color3 As EditText";
_color3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 167;BA.debugLine="Public color4 As EditText";
_color4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 169;BA.debugLine="Public temp1 As EditText";
_temp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 170;BA.debugLine="Public temp2 As EditText";
_temp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 171;BA.debugLine="Public temp3 As EditText";
_temp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 172;BA.debugLine="Public temp4 As EditText";
_temp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 174;BA.debugLine="Public promedio1 As EditText";
_promedio1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 175;BA.debugLine="Public promedio2 As EditText";
_promedio2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 176;BA.debugLine="Public promedio3 As EditText";
_promedio3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 177;BA.debugLine="Public promedio4 As EditText";
_promedio4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 179;BA.debugLine="Public max1 As EditText";
_max1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 180;BA.debugLine="Public max2 As EditText";
_max2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 181;BA.debugLine="Public max3 As EditText";
_max3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 182;BA.debugLine="Public max4 As EditText";
_max4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 184;BA.debugLine="Public min1 As EditText";
_min1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 185;BA.debugLine="Public min2 As EditText";
_min2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 186;BA.debugLine="Public min3 As EditText";
_min3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 187;BA.debugLine="Public min4 As EditText";
_min4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 191;BA.debugLine="Public bitter3 As EditText";
_bitter3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 192;BA.debugLine="Public bitter4 As EditText";
_bitter4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 193;BA.debugLine="Public bitter1 As EditText";
_bitter1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 194;BA.debugLine="Public bitter2 As EditText";
_bitter2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 196;BA.debugLine="Public manchas1 As EditText";
_manchas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 197;BA.debugLine="Public manchas2 As EditText";
_manchas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 198;BA.debugLine="Public manchas3 As EditText";
_manchas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 199;BA.debugLine="Public manchas4 As EditText";
_manchas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 201;BA.debugLine="Public asoleado1 As EditText";
_asoleado1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Public asoleado2 As EditText";
_asoleado2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 203;BA.debugLine="Public asoleado3 As EditText";
_asoleado3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 204;BA.debugLine="Public asoleado4 As EditText";
_asoleado4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 206;BA.debugLine="Public heridas1 As EditText";
_heridas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Public heridas2 As EditText";
_heridas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Public heridas3 As EditText";
_heridas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 209;BA.debugLine="Public heridas4 As EditText";
_heridas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 211;BA.debugLine="Public total1 As EditText";
_total1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 212;BA.debugLine="Public total2 As EditText";
_total2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 213;BA.debugLine="Public total3 As EditText";
_total3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 214;BA.debugLine="Public total4 As EditText";
_total4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 216;BA.debugLine="Public calidadinterna3 As Spinner";
_calidadinterna3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 217;BA.debugLine="Public calidadinterna4 As  Spinner";
_calidadinterna4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 218;BA.debugLine="Public calidadinterna1 As  Spinner";
_calidadinterna1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 219;BA.debugLine="Public calidadinterna2 As  Spinner";
_calidadinterna2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 221;BA.debugLine="Public plu1 As EditText";
_plu1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 222;BA.debugLine="Public plu2 As EditText";
_plu2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 223;BA.debugLine="Public plu3 As EditText";
_plu3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 224;BA.debugLine="Public plu4 As EditText";
_plu4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 232;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 233;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 234;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 235;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 243;BA.debugLine="Private Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 244;BA.debugLine="Private Label32 As Label";
_label32 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Private Label33 As Label";
_label33 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 246;BA.debugLine="Private Label37 As Label";
_label37 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 247;BA.debugLine="Private Label38 As Label";
_label38 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 248;BA.debugLine="Private Label39 As Label";
_label39 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 249;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 250;BA.debugLine="Private Label40 As Label";
_label40 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 251;BA.debugLine="Private Label41 As Label";
_label41 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 252;BA.debugLine="Private Label42 As Label";
_label42 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 253;BA.debugLine="Private Label43 As Label";
_label43 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 254;BA.debugLine="Private Label44 As Label";
_label44 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 255;BA.debugLine="Private Label45 As Label";
_label45 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 256;BA.debugLine="Private Label46 As Label";
_label46 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 257;BA.debugLine="Private Label47 As Label";
_label47 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 258;BA.debugLine="Private Label48 As Label";
_label48 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Private Label49 As Label";
_label49 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 260;BA.debugLine="Private Label50 As Label";
_label50 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 261;BA.debugLine="Private Label51 As Label";
_label51 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 262;BA.debugLine="Private Label52 As Label";
_label52 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 263;BA.debugLine="Private Label53 As Label";
_label53 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 264;BA.debugLine="Private Label54 As Label";
_label54 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 265;BA.debugLine="Private Label55 As Label";
_label55 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 266;BA.debugLine="Private Label56 As Label";
_label56 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 267;BA.debugLine="Private Label57 As Label";
_label57 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 268;BA.debugLine="Private Label58 As Label";
_label58 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 269;BA.debugLine="Private Label59 As Label";
_label59 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 270;BA.debugLine="Private Label60 As Label";
_label60 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 271;BA.debugLine="Private Label61 As Label";
_label61 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 272;BA.debugLine="Private Label62 As Label";
_label62 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 273;BA.debugLine="Private Label63 As Label";
_label63 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 274;BA.debugLine="Private Label64 As Label";
_label64 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 275;BA.debugLine="Private Label65 As Label";
_label65 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 276;BA.debugLine="Private Label66 As Label";
_label66 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 277;BA.debugLine="Private Label67 As Label";
_label67 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 278;BA.debugLine="Private Label68 As Label";
_label68 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 279;BA.debugLine="Private Label69 As Label";
_label69 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 280;BA.debugLine="Private Label70 As Label";
_label70 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 281;BA.debugLine="Private Label71 As Label";
_label71 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 282;BA.debugLine="Private Label72 As Label";
_label72 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 283;BA.debugLine="Private Label73 As Label";
_label73 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 284;BA.debugLine="Private Label74 As Label";
_label74 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 285;BA.debugLine="Private Label75 As Label";
_label75 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 286;BA.debugLine="Private Label76 As Label";
_label76 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 287;BA.debugLine="Private Label77 As Label";
_label77 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 288;BA.debugLine="Private Label78 As Label";
_label78 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 289;BA.debugLine="Private Label79 As Label";
_label79 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 290;BA.debugLine="Private Label80 As Label";
_label80 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 293;BA.debugLine="Private Label83 As Label";
_label83 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 294;BA.debugLine="Private Label84 As Label";
_label84 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 295;BA.debugLine="Private Label85 As Label";
_label85 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 296;BA.debugLine="Private Label86 As Label";
_label86 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 297;BA.debugLine="Private Label87 As Label";
_label87 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 298;BA.debugLine="Private Label88 As Label";
_label88 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 299;BA.debugLine="Private Label89 As Label";
_label89 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 300;BA.debugLine="Private Label90 As Label";
_label90 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 302;BA.debugLine="Private Label92 As Label";
_label92 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 303;BA.debugLine="Private Label93 As Label";
_label93 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 304;BA.debugLine="Private Label94 As Label";
_label94 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 305;BA.debugLine="Private Label95 As Label";
_label95 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 306;BA.debugLine="Private Label96 As Label";
_label96 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 307;BA.debugLine="Private lblPage1Title As Label";
_lblpage1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 312;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 318;BA.debugLine="Private hora As EditText";
_hora = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 320;BA.debugLine="Private vapor As EditText";
_vapor = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 321;BA.debugLine="Private conten As EditText";
_conten = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 322;BA.debugLine="Private cliente As EditText";
_cliente = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public String  _color1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub color1_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 584;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 585;BA.debugLine="color1.Text = Old";
_color1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public String  _color2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Sub color2_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 590;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 591;BA.debugLine="color2.Text = Old";
_color2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public String  _color3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 595;BA.debugLine="Sub color3_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 596;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 597;BA.debugLine="color3.Text = Old";
_color3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return "";
}
public String  _color4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 601;BA.debugLine="Sub color4_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 602;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 603;BA.debugLine="color4.Text = Old";
_color4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return "";
}
public String  _date1_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 863;BA.debugLine="Sub date1_Click 'libreria dialogs2";
 //BA.debugLineNum = 864;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 865;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 866;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 867;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 869;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 871;BA.debugLine="sello1.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello1.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return "";
}
public String  _date2_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 876;BA.debugLine="Sub date2_Click 'libreria dialogs2";
 //BA.debugLineNum = 877;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 878;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 879;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 880;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 882;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 884;BA.debugLine="sello2.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello2.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public String  _date3_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 889;BA.debugLine="Sub date3_Click 'libreria dialogs2";
 //BA.debugLineNum = 890;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 891;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 892;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 893;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 895;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 897;BA.debugLine="sello3.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello3.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 901;BA.debugLine="End Sub";
return "";
}
public String  _date4_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 902;BA.debugLine="Sub date4_Click 'libreria dialogs2";
 //BA.debugLineNum = 903;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 904;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 905;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 906;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 908;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 910;BA.debugLine="sello4.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello4.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 914;BA.debugLine="End Sub";
return "";
}
public String  _env1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Sub env1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 560;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 561;BA.debugLine="env1.Text = Old";
_env1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return "";
}
public String  _env2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub env2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 566;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 567;BA.debugLine="env2.Text = Old";
_env2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return "";
}
public String  _env3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub env3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 572;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 573;BA.debugLine="env3.Text = Old";
_env3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return "";
}
public String  _env4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub env4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 578;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 579;BA.debugLine="env4.Text = Old";
_env4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 581;BA.debugLine="End Sub";
return "";
}
public String  _heridas1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Sub heridas1_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 717;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 718;BA.debugLine="heridas1.Text = Old";
_heridas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 720;BA.debugLine="End Sub";
return "";
}
public String  _heridas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Sub heridas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 739;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 740;BA.debugLine="heridas2.Text = Old";
_heridas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return "";
}
public String  _heridas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 762;BA.debugLine="Sub heridas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 763;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 764;BA.debugLine="heridas3.Text = Old";
_heridas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return "";
}
public String  _heridas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Sub heridas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 785;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 786;BA.debugLine="heridas4.Text = Old";
_heridas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 788;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 329;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public String  _llenar_click() throws Exception{
 //BA.debugLineNum = 1492;BA.debugLine="Private Sub llenar_Click";
 //BA.debugLineNum = 1497;BA.debugLine="If  marca2.SelectedIndex=0 Then";
if (_marca2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1498;BA.debugLine="marca2.SelectedIndex =1";
_marca2.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1500;BA.debugLine="If  marca3.SelectedIndex=0 Then";
if (_marca3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1501;BA.debugLine="marca3.SelectedIndex=1";
_marca3.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1503;BA.debugLine="If  marca4.SelectedIndex=0 Then";
if (_marca4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1504;BA.debugLine="marca4.SelectedIndex =1";
_marca4.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1510;BA.debugLine="If calidad2.SelectedIndex=0 Then";
if (_calidad2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1511;BA.debugLine="calidad2.SelectedIndex=5";
_calidad2.setSelectedIndex((int) (5));
 };
 //BA.debugLineNum = 1513;BA.debugLine="If calidad3.SelectedIndex=0 Then";
if (_calidad3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1514;BA.debugLine="calidad3.SelectedIndex=5";
_calidad3.setSelectedIndex((int) (5));
 };
 //BA.debugLineNum = 1516;BA.debugLine="If calidad4.SelectedIndex=0 Then";
if (_calidad4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1517;BA.debugLine="calidad4.SelectedIndex=5";
_calidad4.setSelectedIndex((int) (5));
 };
 //BA.debugLineNum = 1523;BA.debugLine="If emp2.SelectedIndex =0 Then";
if (_emp2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1524;BA.debugLine="emp2.SelectediNDEX =1";
_emp2.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1526;BA.debugLine="If emp3. SelectedIndex=0 Then";
if (_emp3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1527;BA.debugLine="emp3.SelectedIndex =1";
_emp3.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1530;BA.debugLine="If emp4.SelectedIndex =0 Then";
if (_emp4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1531;BA.debugLine="emp4.SelectedIndex=1";
_emp4.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1539;BA.debugLine="If apariencia2.SelectedIndex =0 Then";
if (_apariencia2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1540;BA.debugLine="apariencia2.SelectediNDEX =4";
_apariencia2.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1542;BA.debugLine="If apariencia3. SelectedIndex=0 Then";
if (_apariencia3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1543;BA.debugLine="apariencia3.SelectedIndex =4";
_apariencia3.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1546;BA.debugLine="If apariencia4.SelectedIndex =0 Then";
if (_apariencia4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1547;BA.debugLine="apariencia4.SelectedIndex=4";
_apariencia4.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1554;BA.debugLine="If calidadinterna2.SelectedIndex =0 Then";
if (_calidadinterna2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1555;BA.debugLine="calidadinterna2.SelectediNDEX =4";
_calidadinterna2.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1557;BA.debugLine="If calidadinterna3. SelectedIndex=0 Then";
if (_calidadinterna3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1558;BA.debugLine="calidadinterna3.SelectedIndex =4";
_calidadinterna3.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1561;BA.debugLine="If calidadinterna4.SelectedIndex =0 Then";
if (_calidadinterna4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1562;BA.debugLine="calidadinterna4.SelectedIndex=4";
_calidadinterna4.setSelectedIndex((int) (4));
 };
 //BA.debugLineNum = 1570;BA.debugLine="If pallet2.text =\"\" Then";
if ((_pallet2.getText()).equals("")) { 
 //BA.debugLineNum = 1571;BA.debugLine="pallet2.text=\"S/D\"";
_pallet2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1573;BA.debugLine="If pallet3.text =\"\" Then";
if ((_pallet3.getText()).equals("")) { 
 //BA.debugLineNum = 1574;BA.debugLine="pallet3.text=\"S/D\"";
_pallet3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1576;BA.debugLine="If pallet4.text =\"\" Then";
if ((_pallet4.getText()).equals("")) { 
 //BA.debugLineNum = 1577;BA.debugLine="pallet4.text=\"S/D\"";
_pallet4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1582;BA.debugLine="If env2.text =\"\" Then";
if ((_env2.getText()).equals("")) { 
 //BA.debugLineNum = 1583;BA.debugLine="env2.text=\"S/D\"";
_env2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1585;BA.debugLine="If env3.text =\"\" Then";
if ((_env3.getText()).equals("")) { 
 //BA.debugLineNum = 1586;BA.debugLine="env3.text=\"S/D\"";
_env3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1588;BA.debugLine="If env4.text =\"\" Then";
if ((_env4.getText()).equals("")) { 
 //BA.debugLineNum = 1589;BA.debugLine="env4.text=\"S/D\"";
_env4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1594;BA.debugLine="If var2.text =\"\" Then";
if ((_var2.getText()).equals("")) { 
 //BA.debugLineNum = 1595;BA.debugLine="var2.text=\"S/D\"";
_var2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1597;BA.debugLine="If var3.text =\"\" Then";
if ((_var3.getText()).equals("")) { 
 //BA.debugLineNum = 1598;BA.debugLine="var3.text=\"S/D\"";
_var3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1600;BA.debugLine="If var4.text =\"\" Then";
if ((_var4.getText()).equals("")) { 
 //BA.debugLineNum = 1601;BA.debugLine="var4.text=\"S/D\"";
_var4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1608;BA.debugLine="If temp2.text =\"\" Then";
if ((_temp2.getText()).equals("")) { 
 //BA.debugLineNum = 1609;BA.debugLine="temp2.text=\"S/D\"";
_temp2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1611;BA.debugLine="If temp3.text =\"\" Then";
if ((_temp3.getText()).equals("")) { 
 //BA.debugLineNum = 1612;BA.debugLine="temp3.text=\"S/D\"";
_temp3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1614;BA.debugLine="If temp4.text =\"\" Then";
if ((_temp4.getText()).equals("")) { 
 //BA.debugLineNum = 1615;BA.debugLine="temp4.text=\"S/D\"";
_temp4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1622;BA.debugLine="If color2.text =\"\" Then";
if ((_color2.getText()).equals("")) { 
 //BA.debugLineNum = 1623;BA.debugLine="color2.text=\"S/D\"";
_color2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1625;BA.debugLine="If color3.text =\"\" Then";
if ((_color3.getText()).equals("")) { 
 //BA.debugLineNum = 1626;BA.debugLine="color3.text=\"S/D\"";
_color3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1628;BA.debugLine="If color4.text =\"\" Then";
if ((_color4.getText()).equals("")) { 
 //BA.debugLineNum = 1629;BA.debugLine="color4.text=\"S/D\"";
_color4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1635;BA.debugLine="If peso2.text =\"\" Then";
if ((_peso2.getText()).equals("")) { 
 //BA.debugLineNum = 1636;BA.debugLine="peso2.text=\"S/D\"";
_peso2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1638;BA.debugLine="If peso3.text =\"\" Then";
if ((_peso3.getText()).equals("")) { 
 //BA.debugLineNum = 1639;BA.debugLine="peso3.text=\"S/D\"";
_peso3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1641;BA.debugLine="If peso4.text =\"\" Then";
if ((_peso4.getText()).equals("")) { 
 //BA.debugLineNum = 1642;BA.debugLine="peso4.text=\"S/D\"";
_peso4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1650;BA.debugLine="If plu2.text =\"\" Then";
if ((_plu2.getText()).equals("")) { 
 //BA.debugLineNum = 1651;BA.debugLine="plu2.text=\"S/D\"";
_plu2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1653;BA.debugLine="If plu3.text =\"\" Then";
if ((_plu3.getText()).equals("")) { 
 //BA.debugLineNum = 1654;BA.debugLine="plu3.text=\"S/D\"";
_plu3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1656;BA.debugLine="If plu4.text =\"\" Then";
if ((_plu4.getText()).equals("")) { 
 //BA.debugLineNum = 1657;BA.debugLine="plu4.text=\"S/D\"";
_plu4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1663;BA.debugLine="If sello2.text =\"\" Then";
if ((_sello2.getText()).equals("")) { 
 //BA.debugLineNum = 1664;BA.debugLine="sello2.text=\"S/D\"";
_sello2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1666;BA.debugLine="If sello3.text =\"\" Then";
if ((_sello3.getText()).equals("")) { 
 //BA.debugLineNum = 1667;BA.debugLine="sello3.text=\"S/D\"";
_sello3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1669;BA.debugLine="If sello4.text =\"\" Then";
if ((_sello4.getText()).equals("")) { 
 //BA.debugLineNum = 1670;BA.debugLine="sello4.text=\"S/D\"";
_sello4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1677;BA.debugLine="If max2.text =\"\" Then";
if ((_max2.getText()).equals("")) { 
 //BA.debugLineNum = 1678;BA.debugLine="max2.text=\"S/D\"";
_max2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1680;BA.debugLine="If max3.text =\"\" Then";
if ((_max3.getText()).equals("")) { 
 //BA.debugLineNum = 1681;BA.debugLine="max3.text=\"S/D\"";
_max3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1683;BA.debugLine="If max4.text =\"\" Then";
if ((_max4.getText()).equals("")) { 
 //BA.debugLineNum = 1684;BA.debugLine="max4.text=\"S/D\"";
_max4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1690;BA.debugLine="If min2.text =\"\" Then";
if ((_min2.getText()).equals("")) { 
 //BA.debugLineNum = 1691;BA.debugLine="min2.text=\"S/D\"";
_min2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1693;BA.debugLine="If min3.text =\"\" Then";
if ((_min3.getText()).equals("")) { 
 //BA.debugLineNum = 1694;BA.debugLine="min3.text=\"S/D\"";
_min3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1696;BA.debugLine="If min4.text =\"\" Then";
if ((_min4.getText()).equals("")) { 
 //BA.debugLineNum = 1697;BA.debugLine="min4.text=\"S/D\"";
_min4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1703;BA.debugLine="If promedio2.text =\"\" Then";
if ((_promedio2.getText()).equals("")) { 
 //BA.debugLineNum = 1704;BA.debugLine="promedio2.text=\"S/D\"";
_promedio2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1706;BA.debugLine="If promedio3.text =\"\" Then";
if ((_promedio3.getText()).equals("")) { 
 //BA.debugLineNum = 1707;BA.debugLine="promedio3.text=\"S/D\"";
_promedio3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1709;BA.debugLine="If promedio4.text =\"\" Then";
if ((_promedio4.getText()).equals("")) { 
 //BA.debugLineNum = 1710;BA.debugLine="promedio4.text=\"S/D\"";
_promedio4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1714;BA.debugLine="End Sub";
return "";
}
public String  _manchas1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub manchas1_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 706;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 707;BA.debugLine="manchas1.Text = Old";
_manchas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public String  _manchas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 727;BA.debugLine="Sub manchas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 728;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 729;BA.debugLine="manchas2.Text = Old";
_manchas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return "";
}
public String  _manchas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 751;BA.debugLine="Sub manchas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 752;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 753;BA.debugLine="manchas3.Text = Old";
_manchas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 755;BA.debugLine="End Sub";
return "";
}
public String  _manchas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 773;BA.debugLine="Sub manchas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 774;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 775;BA.debugLine="manchas4.Text = Old";
_manchas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 777;BA.debugLine="End Sub";
return "";
}
public String  _max1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 633;BA.debugLine="Sub max1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 634;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 635;BA.debugLine="max1.Text = Old";
_max1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return "";
}
public String  _max2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 651;BA.debugLine="Sub max2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 652;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 653;BA.debugLine="max2.Text = Old";
_max2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 655;BA.debugLine="End Sub";
return "";
}
public String  _max3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Sub max3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 670;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 671;BA.debugLine="max3.Text = Old";
_max3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _max4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 687;BA.debugLine="Sub max4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 688;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 689;BA.debugLine="max4.Text = Old";
_max4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return "";
}
public String  _min1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 639;BA.debugLine="Sub min1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 640;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 641;BA.debugLine="min1.Text = Old";
_min1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 643;BA.debugLine="End Sub";
return "";
}
public String  _min2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 657;BA.debugLine="Sub min2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 658;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 659;BA.debugLine="min2.Text = Old";
_min2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return "";
}
public String  _min3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 675;BA.debugLine="Sub min3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 676;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 677;BA.debugLine="min3.Text = Old";
_min3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public String  _min4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 693;BA.debugLine="Sub min4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 694;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 695;BA.debugLine="min4.Text = Old";
_min4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 697;BA.debugLine="End Sub";
return "";
}
public String  _otra_click() throws Exception{
 //BA.debugLineNum = 1717;BA.debugLine="Private Sub otra_Click";
 //BA.debugLineNum = 1719;BA.debugLine="End Sub";
return "";
}
public String  _pallet1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Sub pallet1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 817;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 818;BA.debugLine="pallet1.Text = Old";
_pallet1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return "";
}
public String  _pallet2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub pallet2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 823;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 824;BA.debugLine="pallet2.Text = Old";
_pallet2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return "";
}
public String  _pallet3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 827;BA.debugLine="Sub pallet3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 828;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 829;BA.debugLine="pallet3.Text = Old";
_pallet3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return "";
}
public String  _pallet4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 833;BA.debugLine="Sub pallet4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 834;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 835;BA.debugLine="pallet4.Text = Old";
_pallet4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return "";
}
public String  _peso1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Sub peso1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 538;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 539;BA.debugLine="peso1.Text = Old";
_peso1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return "";
}
public String  _peso2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 542;BA.debugLine="Sub peso2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 543;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 544;BA.debugLine="peso2.Text = Old";
_peso2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return "";
}
public String  _peso3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Sub peso3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 548;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 549;BA.debugLine="peso3.Text = Old";
_peso3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return "";
}
public String  _peso4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub peso4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 553;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 554;BA.debugLine="peso4.Text = Old";
_peso4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return "";
}
public String  _plu1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 838;BA.debugLine="Sub plu1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 839;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 840;BA.debugLine="plu1.Text = Old";
_plu1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return "";
}
public String  _plu2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 843;BA.debugLine="Sub plu2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 844;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 845;BA.debugLine="plu2.Text = Old";
_plu2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return "";
}
public String  _plu3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 849;BA.debugLine="Sub plu3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 850;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 851;BA.debugLine="plu3.Text = Old";
_plu3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 853;BA.debugLine="End Sub";
return "";
}
public String  _plu4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 854;BA.debugLine="Sub plu4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 855;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 856;BA.debugLine="plu4.Text = Old";
_plu4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _promedio1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 627;BA.debugLine="Sub promedio1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 628;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 629;BA.debugLine="promedio1.Text = Old";
_promedio1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return "";
}
public String  _promedio2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 645;BA.debugLine="Sub promedio2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 646;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 647;BA.debugLine="promedio2.Text = Old";
_promedio2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return "";
}
public String  _promedio3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub promedio3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 664;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 665;BA.debugLine="promedio3.Text = Old";
_promedio3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return "";
}
public String  _promedio4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Sub promedio4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 682;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 683;BA.debugLine="promedio4.Text = Old";
_promedio4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 685;BA.debugLine="End Sub";
return "";
}
public String  _temp1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 606;BA.debugLine="Sub temp1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 607;BA.debugLine="If New.Length > 5 Then";
if (_new.length()>5) { 
 //BA.debugLineNum = 608;BA.debugLine="temp1.Text = Old";
_temp1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return "";
}
public String  _temp2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 611;BA.debugLine="Sub temp2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 612;BA.debugLine="If New.Length > 5 Then";
if (_new.length()>5) { 
 //BA.debugLineNum = 613;BA.debugLine="temp2.Text = Old";
_temp2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public String  _temp3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub temp3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 617;BA.debugLine="If New.Length > 5 Then";
if (_new.length()>5) { 
 //BA.debugLineNum = 618;BA.debugLine="temp3.Text = Old";
_temp3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return "";
}
public String  _temp4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub temp4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 622;BA.debugLine="If New.Length > 5 Then";
if (_new.length()>5) { 
 //BA.debugLineNum = 623;BA.debugLine="temp4.Text = Old";
_temp4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _total() throws Exception{
 //BA.debugLineNum = 1152;BA.debugLine="Sub total''saca daños parciales y llena caja de te";
 //BA.debugLineNum = 1296;BA.debugLine="total1.text = NumberFormat(bitter1.Text + manchas";
_total1.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter1.getText()))+(double)(Double.parseDouble(_manchas1.getText()))+(double)(Double.parseDouble(_asoleado1.getText()))+(double)(Double.parseDouble(_heridas1.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1298;BA.debugLine="total2.text = NumberFormat(bitter2.Text + manchas";
_total2.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter2.getText()))+(double)(Double.parseDouble(_manchas2.getText()))+(double)(Double.parseDouble(_asoleado2.getText()))+(double)(Double.parseDouble(_heridas2.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1299;BA.debugLine="total3.text = NumberFormat(bitter3.Text + manchas";
_total3.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter3.getText()))+(double)(Double.parseDouble(_manchas3.getText()))+(double)(Double.parseDouble(_asoleado3.getText()))+(double)(Double.parseDouble(_heridas3.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1301;BA.debugLine="total4.text = NumberFormat(bitter4.Text + manchas";
_total4.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter4.getText()))+(double)(Double.parseDouble(_manchas4.getText()))+(double)(Double.parseDouble(_asoleado4.getText()))+(double)(Double.parseDouble(_heridas4.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1310;BA.debugLine="End Sub";
return "";
}
public boolean  _valid() throws Exception{
boolean _a = false;
boolean _b = false;
boolean _c = false;
boolean _d = false;
boolean _e = false;
 //BA.debugLineNum = 507;BA.debugLine="Sub valid As  Boolean ''valida cajas de texto y co";
 //BA.debugLineNum = 508;BA.debugLine="Dim a,b,c,d,e As Boolean";
_a = false;
_b = false;
_c = false;
_d = false;
_e = false;
 //BA.debugLineNum = 509;BA.debugLine="a=False";
_a = __c.False;
 //BA.debugLineNum = 510;BA.debugLine="b=False";
_b = __c.False;
 //BA.debugLineNum = 511;BA.debugLine="c=False";
_c = __c.False;
 //BA.debugLineNum = 512;BA.debugLine="d=False";
_d = __c.False;
 //BA.debugLineNum = 513;BA.debugLine="a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or";
_a = _emp1.getSelectedIndex()==0 || _emp2.getSelectedIndex()==0 || _emp3.getSelectedIndex()==0 || _emp4.getSelectedIndex()==0 || _marca1.getSelectedIndex()==0 || _marca2.getSelectedIndex()==0 || _marca3.getSelectedIndex()==0 || _marca4.getSelectedIndex()==0 || (_promedio1.getText()).equals("") || (_promedio2.getText()).equals("") || (_promedio3.getText()).equals("") || (_promedio4.getText()).equals("") || (_max1.getText()).equals("") || (_max2.getText()).equals("") || (_max3.getText()).equals("") || (_max4.getText()).equals("") || (_min1.getText()).equals("") || (_min2.getText()).equals("") || (_min3.getText()).equals("") || (_min4.getText()).equals("");
 //BA.debugLineNum = 515;BA.debugLine="b=calidad1.SelectedIndex=0 Or calidad2.SelectedIn";
_b = _calidad1.getSelectedIndex()==0 || _calidad2.getSelectedIndex()==0 || _calidad3.getSelectedIndex()==0 || _calidad4.getSelectedIndex()==0 || _apariencia1.getSelectedIndex()==0 || _apariencia2.getSelectedIndex()==0 || _apariencia3.getSelectedIndex()==0 || _apariencia4.getSelectedIndex()==0;
 //BA.debugLineNum = 517;BA.debugLine="c= pallet1.Text=\"\" Or pallet2.Text=\"\" Or pallet3.";
_c = (_pallet1.getText()).equals("") || (_pallet2.getText()).equals("") || (_pallet3.getText()).equals("") || (_pallet4.getText()).equals("") || (_env1.getText()).equals("") || (_env2.getText()).equals("") || (_env3.getText()).equals("") || (_env4.getText()).equals("") || (_peso1.getText()).equals("") || (_peso2.getText()).equals("") || (_peso3.getText()).equals("") || (_peso4.getText()).equals("") || _calidadinterna1.getSelectedIndex()==0 || _calidadinterna2.getSelectedIndex()==0 || _calidadinterna3.getSelectedIndex()==0 || _calidadinterna4.getSelectedIndex()==0;
 //BA.debugLineNum = 519;BA.debugLine="d= color1.Text=\"\" Or color2.Text=\"\" Or color3.Tex";
_d = (_color1.getText()).equals("") || (_color2.getText()).equals("") || (_color3.getText()).equals("") || (_color4.getText()).equals("") || (_temp1.getText()).equals("") || (_temp2.getText()).equals("") || (_temp3.getText()).equals("") || (_temp4.getText()).equals("") || (_var1.getText()).equals("") || (_var2.getText()).equals("") || (_var3.getText()).equals("") || (_var4.getText()).equals("") || (_plu1.getText()).equals("") || (_plu2.getText()).equals("") || (_plu3.getText()).equals("") || (_plu4.getText()).equals("") || (_sello1.getText()).equals("") || (_sello2.getText()).equals("") || (_sello3.getText()).equals("") || (_sello4.getText()).equals("");
 //BA.debugLineNum = 525;BA.debugLine="If a=True Or b= True Or c=True Or d=True Then";
if (_a==__c.True || _b==__c.True || _c==__c.True || _d==__c.True) { 
 //BA.debugLineNum = 526;BA.debugLine="Msgbox(\"Debe completar los datos pagina 1 \",\"ERR";
__c.Msgbox(BA.ObjectToCharSequence("Debe completar los datos pagina 1 "),BA.ObjectToCharSequence("ERROR"),ba);
 //BA.debugLineNum = 527;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 529;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return false;
}
public String  _var1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub var1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 795;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 796;BA.debugLine="var1.Text = Old";
_var1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return "";
}
public String  _var2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub var2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 800;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 801;BA.debugLine="var2.Text = Old";
_var2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return "";
}
public String  _var3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 805;BA.debugLine="Sub var3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 806;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 807;BA.debugLine="var3.Text = Old";
_var3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 809;BA.debugLine="End Sub";
return "";
}
public String  _var4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Sub var4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 811;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 812;BA.debugLine="var4.Text = Old";
_var4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
