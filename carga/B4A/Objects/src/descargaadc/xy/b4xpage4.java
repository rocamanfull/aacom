package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage4 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage4");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage4.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.SpinnerWrapper _emp1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _pallet6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _temp6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _promedio6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _max6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _min6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _plu6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _var6 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _marca6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _env6 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidad6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _sello6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _date6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _peso6 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _apariencia6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _color6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _bitter6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _manchas6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _asoleado6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _heridas6 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total4 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total5 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _total6 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterna3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterno4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterna1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterna2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterna5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidinterna6 = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _lbl19 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button7 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button8 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button9 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label31 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label34 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label35 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label36 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label81 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label82 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label99 = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _asoleado1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 769;BA.debugLine="Sub asoleado1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 770;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 771;BA.debugLine="asoleado1.Text = Old";
_asoleado1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 773;BA.debugLine="End Sub";
return "";
}
public String  _asoleado2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 791;BA.debugLine="Sub asoleado2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 792;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 793;BA.debugLine="asoleado2.Text = Old";
_asoleado2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 795;BA.debugLine="End Sub";
return "";
}
public String  _asoleado3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 815;BA.debugLine="Sub asoleado3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 816;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 817;BA.debugLine="asoleado3.Text = Old";
_asoleado3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return "";
}
public String  _asoleado4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 841;BA.debugLine="Sub asoleado4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 842;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 843;BA.debugLine="asoleado4.Text = Old";
_asoleado4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
return "";
}
public String  _asoleado5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 866;BA.debugLine="Sub asoleado5_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 867;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 868;BA.debugLine="asoleado5.Text = Old";
_asoleado5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return "";
}
public String  _asoleado6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub asoleado6_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 890;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 891;BA.debugLine="asoleado6.Text = Old";
_asoleado6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 893;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
descargaadc.xy.b4xmainpage _mainpage = null;
anywheresoftware.b4a.objects.collections.List _list2 = null;
anywheresoftware.b4a.objects.collections.List _list3 = null;
 //BA.debugLineNum = 373;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 374;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 376;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 377;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 379;BA.debugLine="ScrollView1.Panel.LoadLayout(\"carg2finalmod3\")'(\"";
_scrollview1.getPanel().LoadLayout("carg2finalmod3",ba);
 //BA.debugLineNum = 391;BA.debugLine="Panel2.Color=Colors.RGB(131,222,210)";
_panel2.setColor(__c.Colors.RGB((int) (131),(int) (222),(int) (210)));
 //BA.debugLineNum = 392;BA.debugLine="Label30.Text=\"Datos Carga 1\"";
_label30.setText(BA.ObjectToCharSequence("Datos Carga 1"));
 //BA.debugLineNum = 394;BA.debugLine="Label3.Text=\"Datos Carga 2\"";
_label3.setText(BA.ObjectToCharSequence("Datos Carga 2"));
 //BA.debugLineNum = 395;BA.debugLine="Label19.Text=\"Datos Carga 3\"";
_label19.setText(BA.ObjectToCharSequence("Datos Carga 3"));
 //BA.debugLineNum = 396;BA.debugLine="lbl19.Text=\"Datos Carga 4\"";
_lbl19.setText(BA.ObjectToCharSequence("Datos Carga 4"));
 //BA.debugLineNum = 397;BA.debugLine="Label6.Text=\"Datos Carga 5\"";
_label6.setText(BA.ObjectToCharSequence("Datos Carga 5"));
 //BA.debugLineNum = 398;BA.debugLine="Label20.Text=\"Datos Carga 6\"";
_label20.setText(BA.ObjectToCharSequence("Datos Carga 6"));
 //BA.debugLineNum = 399;BA.debugLine="B4XPages.SetTitle(Me, \"Datos Cargas 1 -6\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Datos Cargas 1 -6"));
 //BA.debugLineNum = 400;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 401;BA.debugLine="MainPage.com1=True";
_mainpage._com1 /*boolean*/  = __c.True;
 //BA.debugLineNum = 402;BA.debugLine="Log(\"COM1\")";
__c.LogImpl("852887581","COM1",0);
 //BA.debugLineNum = 403;BA.debugLine="Log(MainPage.COM1)";
__c.LogImpl("852887582",BA.ObjectToString(_mainpage._com1 /*boolean*/ ),0);
 //BA.debugLineNum = 408;BA.debugLine="ScrollView1.Panel.Height = Panel2.Height";
_scrollview1.getPanel().setHeight(_panel2.getHeight());
 //BA.debugLineNum = 419;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 426;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga7\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga7"));
 //BA.debugLineNum = 427;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 429;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"android48.png");
 //BA.debugLineNum = 430;BA.debugLine="Dim list2 As List";
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 431;BA.debugLine="Dim list3 As List";
_list3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 433;BA.debugLine="list2 = File.ReadList(cargas, \"marc.txt\")";
_list2 = __c.File.ReadList(_cargas,"marc.txt");
 //BA.debugLineNum = 435;BA.debugLine="list3 = File.ReadList(cargas, \"emp.txt\")''emp";
_list3 = __c.File.ReadList(_cargas,"emp.txt");
 //BA.debugLineNum = 442;BA.debugLine="emp1.AddAll(list3)";
_emp1.AddAll(_list3);
 //BA.debugLineNum = 443;BA.debugLine="emp2.AddAll(list3)";
_emp2.AddAll(_list3);
 //BA.debugLineNum = 444;BA.debugLine="emp3.AddAll(list3)";
_emp3.AddAll(_list3);
 //BA.debugLineNum = 445;BA.debugLine="emp4.AddAll(list3)";
_emp4.AddAll(_list3);
 //BA.debugLineNum = 446;BA.debugLine="emp5.AddAll(list3)";
_emp5.AddAll(_list3);
 //BA.debugLineNum = 447;BA.debugLine="emp6.AddAll(list3)";
_emp6.AddAll(_list3);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 1032;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 1033;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 1034;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 1036;BA.debugLine="If Tag = \"Daños\" Then";
if ((_tag).equals("Daños")) { 
 //BA.debugLineNum = 1037;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 1039;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 1040;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 1042;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 //BA.debugLineNum = 1044;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 1047;BA.debugLine="End Sub";
return "";
}
public String  _bitter1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 757;BA.debugLine="Sub bitter1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 758;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 759;BA.debugLine="bitter1.Text = Old";
_bitter1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 761;BA.debugLine="End Sub";
return "";
}
public String  _bitter2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 779;BA.debugLine="Sub bitter2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 780;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 781;BA.debugLine="bitter2.Text = Old";
_bitter2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return "";
}
public String  _bitter3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 803;BA.debugLine="Sub bitter3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 804;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 805;BA.debugLine="bitter3.Text = Old";
_bitter3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
return "";
}
public String  _bitter4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 829;BA.debugLine="Sub bitter4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 830;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 831;BA.debugLine="bitter4.Text = Old";
_bitter4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 833;BA.debugLine="End Sub";
return "";
}
public String  _bitter5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 854;BA.debugLine="Sub bitter5_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 855;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 856;BA.debugLine="bitter5.Text = Old";
_bitter5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _bitter6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 877;BA.debugLine="Sub bitter6_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 878;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 879;BA.debugLine="bitter6.Text = Old";
_bitter6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return "";
}
public String  _blanqueo() throws Exception{
 //BA.debugLineNum = 1381;BA.debugLine="public Sub blanqueo";
 //BA.debugLineNum = 1383;BA.debugLine="plu1.text=\"\"";
_plu1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1384;BA.debugLine="plu2.text=\"\"";
_plu2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1385;BA.debugLine="plu3.text=\"\"";
_plu3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1386;BA.debugLine="plu4.text=\"\"";
_plu4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1387;BA.debugLine="plu5.text=\"\"";
_plu5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1388;BA.debugLine="plu6.text=\"\"";
_plu6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1391;BA.debugLine="pallet1.Text=\"\"";
_pallet1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1392;BA.debugLine="pallet2.Text=\"\"";
_pallet2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1393;BA.debugLine="pallet3.Text=\"\"";
_pallet3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1394;BA.debugLine="pallet4.Text=\"\"";
_pallet4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1395;BA.debugLine="pallet5.Text=\"\"";
_pallet5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1396;BA.debugLine="pallet6.Text=\"\"";
_pallet6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1399;BA.debugLine="temp1.Text=\"\"";
_temp1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1400;BA.debugLine="temp2.Text=\"\"";
_temp2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1401;BA.debugLine="temp3.Text=\"\"";
_temp3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1402;BA.debugLine="temp4.Text=\"\"";
_temp4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1403;BA.debugLine="temp5.Text=\"\"";
_temp5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1404;BA.debugLine="temp6.Text=\"\"";
_temp6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1405;BA.debugLine="promedio1.Text=\"\"";
_promedio1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1406;BA.debugLine="promedio2.Text=\"\"";
_promedio2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1407;BA.debugLine="promedio3.Text=\"\"";
_promedio3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1408;BA.debugLine="promedio4.Text=\"\"";
_promedio4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1409;BA.debugLine="promedio5.Text=\"\"";
_promedio5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1410;BA.debugLine="promedio6.Text=\"\"";
_promedio6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1411;BA.debugLine="max1.Text=\"\"";
_max1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1412;BA.debugLine="max2.Text=\"\"";
_max2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1413;BA.debugLine="max3.Text=\"\"";
_max3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1414;BA.debugLine="max4.Text=\"\"";
_max4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1415;BA.debugLine="min1.Text=\"\"";
_min1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1416;BA.debugLine="min2.Text=\"\"";
_min2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1417;BA.debugLine="min3.Text=\"\"";
_min3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1418;BA.debugLine="min4.Text=\"\"";
_min4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1419;BA.debugLine="min5.Text=\"\"";
_min5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1420;BA.debugLine="min6.Text=\"\"";
_min6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1422;BA.debugLine="emp1.SelectedIndex=0";
_emp1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1423;BA.debugLine="emp2.SelectedIndex=0";
_emp2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1424;BA.debugLine="emp3.SelectedIndex=0";
_emp3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1425;BA.debugLine="emp4.SelectedIndex=0";
_emp4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1426;BA.debugLine="emp5.SelectedIndex=0";
_emp5.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1427;BA.debugLine="emp6.SelectedIndex=0";
_emp6.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1431;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 1368;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 1369;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1370;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 1608;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 1613;BA.debugLine="emp1.SelectedIndex=4";
_emp1.setSelectedIndex((int) (4));
 //BA.debugLineNum = 1614;BA.debugLine="emp2.SelectedIndex=2";
_emp2.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1615;BA.debugLine="emp3.SelectedIndex=1";
_emp3.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1616;BA.debugLine="emp4.SelectedIndex=3";
_emp4.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1617;BA.debugLine="emp5.SelectedIndex=4";
_emp5.setSelectedIndex((int) (4));
 //BA.debugLineNum = 1618;BA.debugLine="emp6.SelectedIndex=5";
_emp6.setSelectedIndex((int) (5));
 //BA.debugLineNum = 1619;BA.debugLine="pallet1.text=\"22222\"";
_pallet1.setText(BA.ObjectToCharSequence("22222"));
 //BA.debugLineNum = 1620;BA.debugLine="pallet2.text=\"333333\"";
_pallet2.setText(BA.ObjectToCharSequence("333333"));
 //BA.debugLineNum = 1621;BA.debugLine="pallet3.text=\"444444\"";
_pallet3.setText(BA.ObjectToCharSequence("444444"));
 //BA.debugLineNum = 1622;BA.debugLine="pallet4.text=\"55555\"";
_pallet4.setText(BA.ObjectToCharSequence("55555"));
 //BA.debugLineNum = 1623;BA.debugLine="pallet5.text=\"66666\"";
_pallet5.setText(BA.ObjectToCharSequence("66666"));
 //BA.debugLineNum = 1624;BA.debugLine="pallet6.text=\"777777\"";
_pallet6.setText(BA.ObjectToCharSequence("777777"));
 //BA.debugLineNum = 1625;BA.debugLine="temp1.text=\"47.6\"";
_temp1.setText(BA.ObjectToCharSequence("47.6"));
 //BA.debugLineNum = 1626;BA.debugLine="temp2.text=\"48.6\"";
_temp2.setText(BA.ObjectToCharSequence("48.6"));
 //BA.debugLineNum = 1627;BA.debugLine="temp3.text=\"49.6\"";
_temp3.setText(BA.ObjectToCharSequence("49.6"));
 //BA.debugLineNum = 1628;BA.debugLine="temp4.text=\"50.6\"";
_temp4.setText(BA.ObjectToCharSequence("50.6"));
 //BA.debugLineNum = 1629;BA.debugLine="temp5.text=\"51.6\"";
_temp5.setText(BA.ObjectToCharSequence("51.6"));
 //BA.debugLineNum = 1630;BA.debugLine="temp6.text=\"52.6\"";
_temp6.setText(BA.ObjectToCharSequence("52.6"));
 //BA.debugLineNum = 1631;BA.debugLine="promedio1.text=\"53.6\"";
_promedio1.setText(BA.ObjectToCharSequence("53.6"));
 //BA.debugLineNum = 1632;BA.debugLine="promedio2.text=\"54.6\"";
_promedio2.setText(BA.ObjectToCharSequence("54.6"));
 //BA.debugLineNum = 1633;BA.debugLine="promedio3.text=\"55.6\"";
_promedio3.setText(BA.ObjectToCharSequence("55.6"));
 //BA.debugLineNum = 1634;BA.debugLine="promedio4.text=\"56.6\"";
_promedio4.setText(BA.ObjectToCharSequence("56.6"));
 //BA.debugLineNum = 1635;BA.debugLine="promedio5.text=\"57.6\"";
_promedio5.setText(BA.ObjectToCharSequence("57.6"));
 //BA.debugLineNum = 1636;BA.debugLine="promedio6.text=\"58.6\"";
_promedio6.setText(BA.ObjectToCharSequence("58.6"));
 //BA.debugLineNum = 1637;BA.debugLine="max1.text=\"59.6\"";
_max1.setText(BA.ObjectToCharSequence("59.6"));
 //BA.debugLineNum = 1638;BA.debugLine="max2.text=\"60.6\"";
_max2.setText(BA.ObjectToCharSequence("60.6"));
 //BA.debugLineNum = 1639;BA.debugLine="max3.text=\"61.6\"";
_max3.setText(BA.ObjectToCharSequence("61.6"));
 //BA.debugLineNum = 1640;BA.debugLine="max4.text=\"62.6\"";
_max4.setText(BA.ObjectToCharSequence("62.6"));
 //BA.debugLineNum = 1641;BA.debugLine="max5.text=\"63.6\"";
_max5.setText(BA.ObjectToCharSequence("63.6"));
 //BA.debugLineNum = 1642;BA.debugLine="max6.text=\"64.6\"";
_max6.setText(BA.ObjectToCharSequence("64.6"));
 //BA.debugLineNum = 1643;BA.debugLine="min1.text=\"65.6\"";
_min1.setText(BA.ObjectToCharSequence("65.6"));
 //BA.debugLineNum = 1644;BA.debugLine="min2.text=\"66.6\"";
_min2.setText(BA.ObjectToCharSequence("66.6"));
 //BA.debugLineNum = 1645;BA.debugLine="min3.text=\"67.6\"";
_min3.setText(BA.ObjectToCharSequence("67.6"));
 //BA.debugLineNum = 1646;BA.debugLine="min4.text=\"68.6\"";
_min4.setText(BA.ObjectToCharSequence("68.6"));
 //BA.debugLineNum = 1647;BA.debugLine="min5.text=\"69.6\"";
_min5.setText(BA.ObjectToCharSequence("69.6"));
 //BA.debugLineNum = 1648;BA.debugLine="min6.text=\"70.6\"";
_min6.setText(BA.ObjectToCharSequence("70.6"));
 //BA.debugLineNum = 1649;BA.debugLine="plu1.text=\"aaa\"";
_plu1.setText(BA.ObjectToCharSequence("aaa"));
 //BA.debugLineNum = 1650;BA.debugLine="plu2.text=\"bbb\"";
_plu2.setText(BA.ObjectToCharSequence("bbb"));
 //BA.debugLineNum = 1651;BA.debugLine="plu3.text=\"ccc\"";
_plu3.setText(BA.ObjectToCharSequence("ccc"));
 //BA.debugLineNum = 1652;BA.debugLine="plu4.text=\"ddd\"";
_plu4.setText(BA.ObjectToCharSequence("ddd"));
 //BA.debugLineNum = 1653;BA.debugLine="plu5.text=\"eee\"";
_plu5.setText(BA.ObjectToCharSequence("eee"));
 //BA.debugLineNum = 1654;BA.debugLine="plu6.text=\"fff\"";
_plu6.setText(BA.ObjectToCharSequence("fff"));
 //BA.debugLineNum = 1657;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
 //BA.debugLineNum = 1661;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 1668;BA.debugLine="If emp1.SelectedIndex =0 Then";
if (_emp1.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1669;BA.debugLine="emp1.SelectediNDEX =1";
_emp1.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1671;BA.debugLine="If emp2.SelectedIndex =0 Then";
if (_emp2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1672;BA.debugLine="emp2.SelectediNDEX =1";
_emp2.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1674;BA.debugLine="If emp3. SelectedIndex=0 Then";
if (_emp3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1675;BA.debugLine="emp3.SelectedIndex =1";
_emp3.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1678;BA.debugLine="If emp4.SelectedIndex =0 Then";
if (_emp4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1679;BA.debugLine="emp4.SelectedIndex=1";
_emp4.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1682;BA.debugLine="If emp5. SelectedIndex=0 Then";
if (_emp5.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1683;BA.debugLine="emp5.SelectedIndex =1";
_emp5.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1686;BA.debugLine="If emp6.SelectedIndex =0 Then";
if (_emp6.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1687;BA.debugLine="emp6.SelectedIndex=1";
_emp6.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1690;BA.debugLine="If pallet1.text =\"\" Then";
if ((_pallet1.getText()).equals("")) { 
 //BA.debugLineNum = 1691;BA.debugLine="pallet1.text=\"S/D\"";
_pallet1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1694;BA.debugLine="If pallet2.text =\"\" Then";
if ((_pallet2.getText()).equals("")) { 
 //BA.debugLineNum = 1695;BA.debugLine="pallet2.text=\"S/D\"";
_pallet2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1697;BA.debugLine="If pallet3.text =\"\" Then";
if ((_pallet3.getText()).equals("")) { 
 //BA.debugLineNum = 1698;BA.debugLine="pallet3.text=\"S/D\"";
_pallet3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1700;BA.debugLine="If pallet4.text =\"\" Then";
if ((_pallet4.getText()).equals("")) { 
 //BA.debugLineNum = 1701;BA.debugLine="pallet4.text=\"S/D\"";
_pallet4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1704;BA.debugLine="If pallet5.text =\"\" Then";
if ((_pallet5.getText()).equals("")) { 
 //BA.debugLineNum = 1705;BA.debugLine="pallet5.text=\"S/D\"";
_pallet5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1707;BA.debugLine="If pallet6.text =\"\" Then";
if ((_pallet6.getText()).equals("")) { 
 //BA.debugLineNum = 1708;BA.debugLine="pallet6.text=\"S/D\"";
_pallet6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1713;BA.debugLine="If temp1.text =\"\" Then";
if ((_temp1.getText()).equals("")) { 
 //BA.debugLineNum = 1714;BA.debugLine="temp1.text=\"S/D\"";
_temp1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1717;BA.debugLine="If temp2.text =\"\" Then";
if ((_temp2.getText()).equals("")) { 
 //BA.debugLineNum = 1718;BA.debugLine="temp2.text=\"S/D\"";
_temp2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1720;BA.debugLine="If temp3.text =\"\" Then";
if ((_temp3.getText()).equals("")) { 
 //BA.debugLineNum = 1721;BA.debugLine="temp3.text=\"S/D\"";
_temp3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1723;BA.debugLine="If temp4.text =\"\" Then";
if ((_temp4.getText()).equals("")) { 
 //BA.debugLineNum = 1724;BA.debugLine="temp4.text=\"S/D\"";
_temp4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1728;BA.debugLine="If temp5.text =\"\" Then";
if ((_temp5.getText()).equals("")) { 
 //BA.debugLineNum = 1729;BA.debugLine="temp5.text=\"S/D\"";
_temp5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1731;BA.debugLine="If temp6.text =\"\" Then";
if ((_temp6.getText()).equals("")) { 
 //BA.debugLineNum = 1732;BA.debugLine="temp6.text=\"S/D\"";
_temp6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1739;BA.debugLine="If plu1.text =\"\" Then";
if ((_plu1.getText()).equals("")) { 
 //BA.debugLineNum = 1740;BA.debugLine="plu1.text=\"S/D\"";
_plu1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1742;BA.debugLine="If plu2.text =\"\" Then";
if ((_plu2.getText()).equals("")) { 
 //BA.debugLineNum = 1743;BA.debugLine="plu2.text=\"S/D\"";
_plu2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1745;BA.debugLine="If plu3.text =\"\" Then";
if ((_plu3.getText()).equals("")) { 
 //BA.debugLineNum = 1746;BA.debugLine="plu3.text=\"S/D\"";
_plu3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1748;BA.debugLine="If plu4.text =\"\" Then";
if ((_plu4.getText()).equals("")) { 
 //BA.debugLineNum = 1749;BA.debugLine="plu4.text=\"S/D\"";
_plu4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1753;BA.debugLine="If plu5.text =\"\" Then";
if ((_plu5.getText()).equals("")) { 
 //BA.debugLineNum = 1754;BA.debugLine="plu5.text=\"S/D\"";
_plu5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1757;BA.debugLine="If plu6.text =\"\" Then";
if ((_plu6.getText()).equals("")) { 
 //BA.debugLineNum = 1758;BA.debugLine="plu6.text=\"S/D\"";
_plu6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1761;BA.debugLine="If max1.text =\"\" Then";
if ((_max1.getText()).equals("")) { 
 //BA.debugLineNum = 1762;BA.debugLine="max1.text=\"S/D\"";
_max1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1764;BA.debugLine="If max2.text =\"\" Then";
if ((_max2.getText()).equals("")) { 
 //BA.debugLineNum = 1765;BA.debugLine="max2.text=\"S/D\"";
_max2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1767;BA.debugLine="If max3.text =\"\" Then";
if ((_max3.getText()).equals("")) { 
 //BA.debugLineNum = 1768;BA.debugLine="max3.text=\"S/D\"";
_max3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1770;BA.debugLine="If max4.text =\"\" Then";
if ((_max4.getText()).equals("")) { 
 //BA.debugLineNum = 1771;BA.debugLine="max4.text=\"S/D\"";
_max4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1773;BA.debugLine="If max6.text =\"\" Then";
if ((_max6.getText()).equals("")) { 
 //BA.debugLineNum = 1774;BA.debugLine="max6.text=\"S/D\"";
_max6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1776;BA.debugLine="If max5.text =\"\" Then";
if ((_max5.getText()).equals("")) { 
 //BA.debugLineNum = 1777;BA.debugLine="max5.text=\"S/D\"";
_max5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1783;BA.debugLine="If min1.text =\"\" Then";
if ((_min1.getText()).equals("")) { 
 //BA.debugLineNum = 1784;BA.debugLine="min1.text=\"S/D\"";
_min1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1786;BA.debugLine="If min2.text =\"\" Then";
if ((_min2.getText()).equals("")) { 
 //BA.debugLineNum = 1787;BA.debugLine="min2.text=\"S/D\"";
_min2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1789;BA.debugLine="If min3.text =\"\" Then";
if ((_min3.getText()).equals("")) { 
 //BA.debugLineNum = 1790;BA.debugLine="min3.text=\"S/D\"";
_min3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1792;BA.debugLine="If min4.text =\"\" Then";
if ((_min4.getText()).equals("")) { 
 //BA.debugLineNum = 1793;BA.debugLine="min4.text=\"S/D\"";
_min4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1795;BA.debugLine="If min5.text =\"\" Then";
if ((_min5.getText()).equals("")) { 
 //BA.debugLineNum = 1796;BA.debugLine="min5.text=\"S/D\"";
_min5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1798;BA.debugLine="If min6.text =\"\" Then";
if ((_min6.getText()).equals("")) { 
 //BA.debugLineNum = 1799;BA.debugLine="min6.text=\"S/D\"";
_min6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1807;BA.debugLine="If promedio1.text =\"\" Then";
if ((_promedio1.getText()).equals("")) { 
 //BA.debugLineNum = 1808;BA.debugLine="promedio1.text=\"S/D\"";
_promedio1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1810;BA.debugLine="If promedio2.text =\"\" Then";
if ((_promedio2.getText()).equals("")) { 
 //BA.debugLineNum = 1811;BA.debugLine="promedio2.text=\"S/D\"";
_promedio2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1813;BA.debugLine="If promedio3.text =\"\" Then";
if ((_promedio3.getText()).equals("")) { 
 //BA.debugLineNum = 1814;BA.debugLine="promedio3.text=\"S/D\"";
_promedio3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1816;BA.debugLine="If promedio4.text =\"\" Then";
if ((_promedio4.getText()).equals("")) { 
 //BA.debugLineNum = 1817;BA.debugLine="promedio4.text=\"S/D\"";
_promedio4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1819;BA.debugLine="If promedio5.text =\"\" Then";
if ((_promedio5.getText()).equals("")) { 
 //BA.debugLineNum = 1820;BA.debugLine="promedio5.text=\"S/D\"";
_promedio5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1822;BA.debugLine="If promedio6.text =\"\" Then";
if ((_promedio6.getText()).equals("")) { 
 //BA.debugLineNum = 1823;BA.debugLine="promedio6.text=\"S/D\"";
_promedio6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1842;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 1605;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 1607;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
 //BA.debugLineNum = 1371;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 1372;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1373;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
 //BA.debugLineNum = 1374;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 1375;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1376;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 1377;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 1378;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1379;BA.debugLine="End Sub";
return "";
}
public String  _calc_click() throws Exception{
 //BA.debugLineNum = 1193;BA.debugLine="Sub calc_Click";
 //BA.debugLineNum = 1195;BA.debugLine="If valid =True Then";
if (_valid()==__c.True) { 
 //BA.debugLineNum = 1196;BA.debugLine="MsgboxAsync(\"Datos validados\",\"ok\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Datos validados"),BA.ObjectToCharSequence("ok"),ba);
 //BA.debugLineNum = 1198;BA.debugLine="ceros";
_ceros();
 //BA.debugLineNum = 1199;BA.debugLine="total";
_total();
 };
 //BA.debugLineNum = 1206;BA.debugLine="End Sub";
return "";
}
public String  _ceros() throws Exception{
 //BA.debugLineNum = 1049;BA.debugLine="Sub ceros 'comprueba si no hay nada lleno y pone c";
 //BA.debugLineNum = 1051;BA.debugLine="If bitter1.Text=\"\" Then";
if ((_bitter1.getText()).equals("")) { 
 //BA.debugLineNum = 1052;BA.debugLine="bitter1.Text=\"0\"";
_bitter1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1054;BA.debugLine="If bitter2.Text=\"\" Then";
if ((_bitter2.getText()).equals("")) { 
 //BA.debugLineNum = 1055;BA.debugLine="bitter2.Text=\"0\"";
_bitter2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1057;BA.debugLine="If bitter3.Text=\"\" Then";
if ((_bitter3.getText()).equals("")) { 
 //BA.debugLineNum = 1058;BA.debugLine="bitter3.Text=\"0\"";
_bitter3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1060;BA.debugLine="If bitter4.Text=\"\" Then";
if ((_bitter4.getText()).equals("")) { 
 //BA.debugLineNum = 1061;BA.debugLine="bitter4.Text=\"0\"";
_bitter4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1063;BA.debugLine="If asoleado1.Text=\"\" Then";
if ((_asoleado1.getText()).equals("")) { 
 //BA.debugLineNum = 1064;BA.debugLine="asoleado1.Text=\"0\"";
_asoleado1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1066;BA.debugLine="If asoleado2.Text=\"\" Then";
if ((_asoleado2.getText()).equals("")) { 
 //BA.debugLineNum = 1067;BA.debugLine="asoleado2.Text=\"0\"";
_asoleado2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1069;BA.debugLine="If asoleado3.Text=\"\" Then";
if ((_asoleado3.getText()).equals("")) { 
 //BA.debugLineNum = 1070;BA.debugLine="asoleado3.Text=\"0\"";
_asoleado3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1072;BA.debugLine="If asoleado4.Text=\"\" Then";
if ((_asoleado4.getText()).equals("")) { 
 //BA.debugLineNum = 1073;BA.debugLine="asoleado4.Text=\"0\"";
_asoleado4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1075;BA.debugLine="If heridas1.Text=\"\" Then";
if ((_heridas1.getText()).equals("")) { 
 //BA.debugLineNum = 1076;BA.debugLine="heridas1.Text=\"0\"";
_heridas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1078;BA.debugLine="If heridas2.Text=\"\" Then";
if ((_heridas2.getText()).equals("")) { 
 //BA.debugLineNum = 1079;BA.debugLine="heridas2.Text=\"0\"";
_heridas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1082;BA.debugLine="If heridas3.Text=\"\" Then";
if ((_heridas3.getText()).equals("")) { 
 //BA.debugLineNum = 1083;BA.debugLine="heridas3.Text=\"0\"";
_heridas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1086;BA.debugLine="If heridas4.Text=\"\" Then";
if ((_heridas4.getText()).equals("")) { 
 //BA.debugLineNum = 1087;BA.debugLine="heridas4.Text=\"0\"";
_heridas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1090;BA.debugLine="If manchas1.Text=\"\" Then";
if ((_manchas1.getText()).equals("")) { 
 //BA.debugLineNum = 1091;BA.debugLine="manchas1.Text=\"0\"";
_manchas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1093;BA.debugLine="If manchas2.Text=\"\" Then";
if ((_manchas2.getText()).equals("")) { 
 //BA.debugLineNum = 1094;BA.debugLine="manchas2.Text=\"0\"";
_manchas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1097;BA.debugLine="If manchas3.Text=\"\" Then";
if ((_manchas3.getText()).equals("")) { 
 //BA.debugLineNum = 1098;BA.debugLine="manchas3.Text=\"0\"";
_manchas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1101;BA.debugLine="If manchas4.Text=\"\" Then";
if ((_manchas4.getText()).equals("")) { 
 //BA.debugLineNum = 1102;BA.debugLine="manchas4.Text=\"0\"";
_manchas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1192;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 112;BA.debugLine="Public emp1 As Spinner";
_emp1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 113;BA.debugLine="Public emp2 As Spinner";
_emp2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Public emp3 As Spinner";
_emp3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Public emp4 As Spinner";
_emp4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Public emp5 As Spinner";
_emp5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Public emp6 As Spinner";
_emp6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Public pallet1 As EditText";
_pallet1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 120;BA.debugLine="Public pallet2 As EditText";
_pallet2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Public pallet3 As EditText";
_pallet3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 122;BA.debugLine="Public pallet4 As EditText";
_pallet4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 123;BA.debugLine="Public pallet5 As EditText";
_pallet5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 124;BA.debugLine="Public pallet6 As EditText";
_pallet6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 125;BA.debugLine="Public temp1 As EditText";
_temp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Public temp2 As EditText";
_temp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Public temp3 As EditText";
_temp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Public temp4 As EditText";
_temp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Public temp5 As EditText";
_temp5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Public temp6 As EditText";
_temp6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Public promedio1 As EditText";
_promedio1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 132;BA.debugLine="Public promedio2 As EditText";
_promedio2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 133;BA.debugLine="Public promedio3 As EditText";
_promedio3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 134;BA.debugLine="Public promedio4 As EditText";
_promedio4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 135;BA.debugLine="Public promedio5 As EditText";
_promedio5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 136;BA.debugLine="Public promedio6 As EditText";
_promedio6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Public max1 As EditText";
_max1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 138;BA.debugLine="Public max2 As EditText";
_max2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 139;BA.debugLine="Public max3 As EditText";
_max3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 140;BA.debugLine="Public max4 As EditText";
_max4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 141;BA.debugLine="Public max5 As EditText";
_max5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 142;BA.debugLine="Public max6 As EditText";
_max6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 143;BA.debugLine="Public min1 As EditText";
_min1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 144;BA.debugLine="Public min2 As EditText";
_min2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 145;BA.debugLine="Public min3 As EditText";
_min3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 146;BA.debugLine="Public min4 As EditText";
_min4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 147;BA.debugLine="Public min5 As EditText";
_min5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 148;BA.debugLine="Public min6 As EditText";
_min6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 149;BA.debugLine="Public plu1 As EditText";
_plu1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Public plu2 As EditText";
_plu2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 151;BA.debugLine="Public plu3 As EditText";
_plu3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 152;BA.debugLine="Public plu4 As EditText";
_plu4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 153;BA.debugLine="Public plu5 As EditText";
_plu5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Public plu6 As EditText";
_plu6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 163;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 164;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 165;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 166;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 168;BA.debugLine="Public var1 As EditText";
_var1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 169;BA.debugLine="Public var2 As EditText";
_var2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 170;BA.debugLine="Public var3 As EditText";
_var3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 171;BA.debugLine="Public var4 As EditText";
_var4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 172;BA.debugLine="Public var5 As EditText";
_var5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 173;BA.debugLine="Public var6 As EditText";
_var6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 175;BA.debugLine="Public marca1 As Spinner";
_marca1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 176;BA.debugLine="Public marca2 As Spinner";
_marca2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 177;BA.debugLine="Public marca3 As Spinner";
_marca3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 178;BA.debugLine="Public marca4 As Spinner";
_marca4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 179;BA.debugLine="Public marca5 As Spinner";
_marca5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 180;BA.debugLine="Public marca6 As Spinner";
_marca6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 182;BA.debugLine="Public env1 As EditText";
_env1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 183;BA.debugLine="Public env2 As EditText";
_env2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 184;BA.debugLine="Public env3 As EditText";
_env3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 185;BA.debugLine="Public env4 As EditText";
_env4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 186;BA.debugLine="Public env5 As EditText";
_env5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 187;BA.debugLine="Public env6 As EditText";
_env6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 189;BA.debugLine="Public calidad1 As Spinner";
_calidad1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 190;BA.debugLine="Public calidad2 As Spinner";
_calidad2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 191;BA.debugLine="Public calidad3 As Spinner";
_calidad3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 192;BA.debugLine="Public calidad4 As Spinner";
_calidad4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 193;BA.debugLine="Public calidad5 As Spinner";
_calidad5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 194;BA.debugLine="Public calidad6 As Spinner";
_calidad6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 196;BA.debugLine="Public sello1 As EditText";
_sello1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 197;BA.debugLine="Public sello2 As EditText";
_sello2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 198;BA.debugLine="Public sello3 As EditText";
_sello3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 199;BA.debugLine="Public sello4 As EditText";
_sello4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 200;BA.debugLine="Public sello5 As EditText";
_sello5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 201;BA.debugLine="Public sello6 As EditText";
_sello6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 203;BA.debugLine="Public date1 As Button";
_date1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 204;BA.debugLine="Public date2 As Button";
_date2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 205;BA.debugLine="Public date3 As Button";
_date3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 206;BA.debugLine="Public date4 As Button";
_date4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Public date5 As Button";
_date5 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Public date6 As Button";
_date6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 210;BA.debugLine="Public peso1 As EditText";
_peso1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 211;BA.debugLine="Public peso2 As EditText";
_peso2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 212;BA.debugLine="Public peso3 As EditText";
_peso3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 213;BA.debugLine="Public peso4 As EditText";
_peso4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 215;BA.debugLine="Public peso5 As EditText";
_peso5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 216;BA.debugLine="Public peso6 As EditText";
_peso6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 218;BA.debugLine="Public apariencia1 As Spinner";
_apariencia1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 219;BA.debugLine="Public apariencia2 As Spinner";
_apariencia2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 220;BA.debugLine="Public apariencia3 As Spinner";
_apariencia3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 221;BA.debugLine="Public apariencia4 As Spinner";
_apariencia4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 222;BA.debugLine="Public apariencia5 As Spinner";
_apariencia5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 223;BA.debugLine="Public apariencia6 As Spinner";
_apariencia6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 225;BA.debugLine="Public color1 As EditText";
_color1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 226;BA.debugLine="Public color2 As EditText";
_color2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 227;BA.debugLine="Public color3 As EditText";
_color3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 228;BA.debugLine="Public color4 As EditText";
_color4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 230;BA.debugLine="Public color5 As EditText";
_color5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 231;BA.debugLine="Public color6 As EditText";
_color6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 233;BA.debugLine="Public bitter3 As EditText";
_bitter3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 234;BA.debugLine="Public bitter4 As EditText";
_bitter4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 235;BA.debugLine="Public bitter1 As EditText";
_bitter1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 236;BA.debugLine="Public bitter2 As EditText";
_bitter2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 237;BA.debugLine="Public bitter5 As EditText";
_bitter5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 238;BA.debugLine="Public bitter6 As EditText";
_bitter6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 240;BA.debugLine="Public manchas1 As EditText";
_manchas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 241;BA.debugLine="Public manchas2 As EditText";
_manchas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 242;BA.debugLine="Public manchas3 As EditText";
_manchas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 243;BA.debugLine="Public manchas4 As EditText";
_manchas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 244;BA.debugLine="Public manchas5 As EditText";
_manchas5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Public manchas6 As EditText";
_manchas6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 247;BA.debugLine="Public asoleado1 As EditText";
_asoleado1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 248;BA.debugLine="Public asoleado2 As EditText";
_asoleado2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 249;BA.debugLine="Public asoleado3 As EditText";
_asoleado3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 250;BA.debugLine="Public asoleado4 As EditText";
_asoleado4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 252;BA.debugLine="Public asoleado5 As EditText";
_asoleado5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 253;BA.debugLine="Public asoleado6 As EditText";
_asoleado6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 255;BA.debugLine="Public heridas1 As EditText";
_heridas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 256;BA.debugLine="Public heridas2 As EditText";
_heridas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 257;BA.debugLine="Public heridas3 As EditText";
_heridas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 258;BA.debugLine="Public heridas4 As EditText";
_heridas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Public heridas5 As EditText";
_heridas5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 260;BA.debugLine="Public heridas6 As EditText";
_heridas6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 262;BA.debugLine="Public total1 As EditText";
_total1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 263;BA.debugLine="Public total2 As EditText";
_total2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 264;BA.debugLine="Public total3 As EditText";
_total3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 265;BA.debugLine="Public total4 As EditText";
_total4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 266;BA.debugLine="Public total5 As EditText";
_total5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 267;BA.debugLine="Public total6 As EditText";
_total6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 268;BA.debugLine="Public calidinterna3 As Spinner";
_calidinterna3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 269;BA.debugLine="Public calidinterno4 As  Spinner";
_calidinterno4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 270;BA.debugLine="Public calidinterna1 As  Spinner";
_calidinterna1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 271;BA.debugLine="Public calidinterna2 As  Spinner";
_calidinterna2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 273;BA.debugLine="Public calidinterna5 As  Spinner";
_calidinterna5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 274;BA.debugLine="Public calidinterna6 As  Spinner";
_calidinterna6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 280;BA.debugLine="Private Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 281;BA.debugLine="Private Label32 As Label";
_label32 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 282;BA.debugLine="Private Label33 As Label";
_label33 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 283;BA.debugLine="Private Label37 As Label";
_label37 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 284;BA.debugLine="Private Label38 As Label";
_label38 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 285;BA.debugLine="Private Label39 As Label";
_label39 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 286;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 287;BA.debugLine="Private Label40 As Label";
_label40 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 288;BA.debugLine="Private Label41 As Label";
_label41 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 289;BA.debugLine="Private Label42 As Label";
_label42 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 290;BA.debugLine="Private Label43 As Label";
_label43 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 291;BA.debugLine="Private Label44 As Label";
_label44 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 292;BA.debugLine="Private Label45 As Label";
_label45 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 293;BA.debugLine="Private Label46 As Label";
_label46 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 294;BA.debugLine="Private Label47 As Label";
_label47 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 295;BA.debugLine="Private Label48 As Label";
_label48 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 296;BA.debugLine="Private Label49 As Label";
_label49 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 297;BA.debugLine="Private Label50 As Label";
_label50 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 298;BA.debugLine="Private Label51 As Label";
_label51 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 299;BA.debugLine="Private Label52 As Label";
_label52 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 300;BA.debugLine="Private Label53 As Label";
_label53 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 301;BA.debugLine="Private Label54 As Label";
_label54 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 302;BA.debugLine="Private Label55 As Label";
_label55 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 303;BA.debugLine="Private Label56 As Label";
_label56 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 304;BA.debugLine="Private Label57 As Label";
_label57 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 305;BA.debugLine="Private Label58 As Label";
_label58 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 306;BA.debugLine="Private Label59 As Label";
_label59 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 307;BA.debugLine="Private Label60 As Label";
_label60 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 308;BA.debugLine="Private Label61 As Label";
_label61 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 309;BA.debugLine="Private Label62 As Label";
_label62 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 310;BA.debugLine="Private Label63 As Label";
_label63 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 311;BA.debugLine="Private Label64 As Label";
_label64 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 312;BA.debugLine="Private Label65 As Label";
_label65 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 313;BA.debugLine="Private Label66 As Label";
_label66 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 314;BA.debugLine="Private Label67 As Label";
_label67 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 315;BA.debugLine="Private Label68 As Label";
_label68 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 316;BA.debugLine="Private Label69 As Label";
_label69 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 317;BA.debugLine="Private Label70 As Label";
_label70 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 318;BA.debugLine="Private Label71 As Label";
_label71 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 319;BA.debugLine="Private Label72 As Label";
_label72 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 320;BA.debugLine="Private Label73 As Label";
_label73 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 321;BA.debugLine="Private Label74 As Label";
_label74 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 322;BA.debugLine="Private Label75 As Label";
_label75 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 323;BA.debugLine="Private Label76 As Label";
_label76 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 324;BA.debugLine="Private Label77 As Label";
_label77 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 325;BA.debugLine="Private Label78 As Label";
_label78 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 326;BA.debugLine="Private Label79 As Label";
_label79 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 327;BA.debugLine="Private Label80 As Label";
_label80 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 330;BA.debugLine="Private Label83 As Label";
_label83 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 331;BA.debugLine="Private Label84 As Label";
_label84 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 332;BA.debugLine="Private Label85 As Label";
_label85 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 333;BA.debugLine="Private Label86 As Label";
_label86 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 334;BA.debugLine="Private Label87 As Label";
_label87 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 335;BA.debugLine="Private Label88 As Label";
_label88 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 336;BA.debugLine="Private Label89 As Label";
_label89 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 337;BA.debugLine="Private Label90 As Label";
_label90 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 339;BA.debugLine="Private Label92 As Label";
_label92 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 340;BA.debugLine="Private Label93 As Label";
_label93 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 341;BA.debugLine="Private Label94 As Label";
_label94 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 342;BA.debugLine="Private Label95 As Label";
_label95 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 343;BA.debugLine="Private Label96 As Label";
_label96 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 344;BA.debugLine="Private lblPage1Title As Label";
_lblpage1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 349;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 351;BA.debugLine="Private lbl19 As Label";
_lbl19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 352;BA.debugLine="Private Button5 As Button";
_button5 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 353;BA.debugLine="Private Button7 As Button";
_button7 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 354;BA.debugLine="Private Button8 As Button";
_button8 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 355;BA.debugLine="Private Button9 As Button";
_button9 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 357;BA.debugLine="Private Label31 As Label";
_label31 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 358;BA.debugLine="Private Label34 As Label";
_label34 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 359;BA.debugLine="Private Label35 As Label";
_label35 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 360;BA.debugLine="Private Label36 As Label";
_label36 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 361;BA.debugLine="Private Label81 As Label";
_label81 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 362;BA.debugLine="Private Label82 As Label";
_label82 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 363;BA.debugLine="Private label99 As Label";
_label99 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return "";
}
public String  _color1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Sub color1_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 582;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 583;BA.debugLine="color1.Text = Old";
_color1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _color2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Sub color2_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 588;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 589;BA.debugLine="color2.Text = Old";
_color2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 591;BA.debugLine="End Sub";
return "";
}
public String  _color3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 593;BA.debugLine="Sub color3_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 594;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 595;BA.debugLine="color3.Text = Old";
_color3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return "";
}
public String  _color4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 599;BA.debugLine="Sub color4_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 600;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 601;BA.debugLine="color4.Text = Old";
_color4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return "";
}
public String  _color5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 605;BA.debugLine="Sub color5_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 606;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 607;BA.debugLine="color5.Text = Old";
_color5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 609;BA.debugLine="End Sub";
return "";
}
public String  _color6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 611;BA.debugLine="Sub color6_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 612;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 613;BA.debugLine="color6.Text = Old";
_color6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public String  _date1_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 979;BA.debugLine="Sub date1_Click 'libreria dialogs2";
 //BA.debugLineNum = 980;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 981;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 982;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 983;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 985;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 987;BA.debugLine="sello1.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello1.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 991;BA.debugLine="End Sub";
return "";
}
public String  _date2_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 992;BA.debugLine="Sub date2_Click 'libreria dialogs2";
 //BA.debugLineNum = 993;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 994;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 995;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 996;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 998;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1000;BA.debugLine="sello2.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello2.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return "";
}
public String  _date3_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1005;BA.debugLine="Sub date3_Click 'libreria dialogs2";
 //BA.debugLineNum = 1006;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1007;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1008;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1009;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1011;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1013;BA.debugLine="sello3.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello3.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1017;BA.debugLine="End Sub";
return "";
}
public String  _date4_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1018;BA.debugLine="Sub date4_Click 'libreria dialogs2";
 //BA.debugLineNum = 1019;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1020;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1021;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1022;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1024;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1026;BA.debugLine="sello4.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello4.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1030;BA.debugLine="End Sub";
return "";
}
public String  _env1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 546;BA.debugLine="Sub env1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 547;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 548;BA.debugLine="env1.Text = Old";
_env1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 550;BA.debugLine="End Sub";
return "";
}
public String  _env2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 552;BA.debugLine="Sub env2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 553;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 554;BA.debugLine="env2.Text = Old";
_env2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 556;BA.debugLine="End Sub";
return "";
}
public String  _env3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Sub env3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 559;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 560;BA.debugLine="env3.Text = Old";
_env3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _env4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 564;BA.debugLine="Sub env4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 565;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 566;BA.debugLine="env4.Text = Old";
_env4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return "";
}
public String  _env5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 569;BA.debugLine="Sub env5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 570;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 571;BA.debugLine="env5.Text = Old";
_env5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return "";
}
public String  _env6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Sub env6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 576;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 577;BA.debugLine="env6.Text = Old";
_env6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1432;BA.debugLine="Sub final2 'genera el archivo .txt";
 //BA.debugLineNum = 1433;BA.debugLine="Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t";
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
 //BA.debugLineNum = 1434;BA.debugLine="Dim writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 1435;BA.debugLine="Dim writer2 As  TextWriter";
_writer2 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 1436;BA.debugLine="Dim writer3 As TextWriter";
_writer3 = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
 //BA.debugLineNum = 1439;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 1440;BA.debugLine="ftp3 =rp.GetSafeDirDefaultExternal(\"Ftp3\")";
_ftp3 = _rp.GetSafeDirDefaultExternal("Ftp3");
 //BA.debugLineNum = 1500;BA.debugLine="y=emp1.SelectedItem";
_y = _emp1.getSelectedItem();
 //BA.debugLineNum = 1501;BA.debugLine="z=y.SubString2(0,2)";
_z = _y.substring((int) (0),(int) (2));
 //BA.debugLineNum = 1503;BA.debugLine="a=z & \";\"& pallet1.Text & \";\"& temp1.Text & \";\"&";
_a = _z+";"+_pallet1.getText()+";"+_temp1.getText()+";"+_plu1.getText()+";"+_promedio1.getText()+";"+_min1.getText()+";"+_max1.getText();
 //BA.debugLineNum = 1511;BA.debugLine="e=z & \";\"& pallet2.Text & \";\"& temp2.Text & \";\"&";
_e = _z+";"+_pallet2.getText()+";"+_temp2.getText()+";"+_plu2.getText()+";"+_promedio2.getText()+";"+_min2.getText()+";"+_max2.getText();
 //BA.debugLineNum = 1515;BA.debugLine="h=z & \";\"& pallet3.Text & \";\"& temp3.Text & \";\"&";
_h = _z+";"+_pallet3.getText()+";"+_temp3.getText()+";"+_plu3.getText()+";"+_promedio3.getText()+";"+_min3.getText()+";"+_max3.getText();
 //BA.debugLineNum = 1519;BA.debugLine="k=z & \";\"& pallet4.Text & \";\"& temp4.Text & \";\"&";
_k = _z+";"+_pallet4.getText()+";"+_temp4.getText()+";"+_plu4.getText()+";"+_promedio4.getText()+";"+_min4.getText()+";"+_max4.getText();
 //BA.debugLineNum = 1523;BA.debugLine="o=z & \";\"& pallet5.Text & \";\"& temp5.Text & \";\"&";
_o = _z+";"+_pallet5.getText()+";"+_temp5.getText()+";"+_plu5.getText()+";"+_promedio5.getText()+";"+_min5.getText()+";"+_max5.getText();
 //BA.debugLineNum = 1527;BA.debugLine="r=z & \";\"& pallet6.Text & \";\"& temp6.Text & \";\"&";
_r = _z+";"+_pallet6.getText()+";"+_temp6.getText()+";"+_plu6.getText()+";"+_promedio6.getText()+";"+_min6.getText()+";"+_max6.getText();
 //BA.debugLineNum = 1555;BA.debugLine="i=\"Empresa\" & \";\" & \"Pallet\" & \";\" & \"Temp.\" & \";";
_i = "Empresa"+";"+"Pallet"+";"+"Temp."+";"+"Plu"+";"+"Promedio"+";"+"Minimo"+";"+"Maximo";
 //BA.debugLineNum = 1566;BA.debugLine="writer2.Initialize(File.OpenOutput( ftp3 ,\"adc\" &";
_writer2.Initialize((java.io.OutputStream)(__c.File.OpenOutput(_ftp3,"adc"+"zz"+".csv",__c.False).getObject()));
 //BA.debugLineNum = 1567;BA.debugLine="writer2.WriteLine(i)";
_writer2.WriteLine(_i);
 //BA.debugLineNum = 1568;BA.debugLine="writer2.WriteLine(a)";
_writer2.WriteLine(_a);
 //BA.debugLineNum = 1569;BA.debugLine="writer2.WriteLine(e)";
_writer2.WriteLine(_e);
 //BA.debugLineNum = 1570;BA.debugLine="writer2.WriteLine(h)";
_writer2.WriteLine(_h);
 //BA.debugLineNum = 1571;BA.debugLine="writer2.WriteLine(k)";
_writer2.WriteLine(_k);
 //BA.debugLineNum = 1572;BA.debugLine="writer2.WriteLine(o)";
_writer2.WriteLine(_o);
 //BA.debugLineNum = 1573;BA.debugLine="writer2.WriteLine(r)";
_writer2.WriteLine(_r);
 //BA.debugLineNum = 1574;BA.debugLine="writer2.WriteLine(c)";
_writer2.WriteLine(_c);
 //BA.debugLineNum = 1575;BA.debugLine="writer2.WriteLine(f)";
_writer2.WriteLine(_f);
 //BA.debugLineNum = 1576;BA.debugLine="writer2.WriteLine(u)";
_writer2.WriteLine(_u);
 //BA.debugLineNum = 1577;BA.debugLine="writer2.WriteLine(m)";
_writer2.WriteLine(_m);
 //BA.debugLineNum = 1578;BA.debugLine="writer2.WriteLine(p)";
_writer2.WriteLine(_p);
 //BA.debugLineNum = 1579;BA.debugLine="writer2.WriteLine(s)";
_writer2.WriteLine(_s);
 //BA.debugLineNum = 1580;BA.debugLine="writer2.WriteLine(d)";
_writer2.WriteLine(_d);
 //BA.debugLineNum = 1581;BA.debugLine="writer2.WriteLine(g)";
_writer2.WriteLine(_g);
 //BA.debugLineNum = 1582;BA.debugLine="writer2.WriteLine(j)";
_writer2.WriteLine(_j);
 //BA.debugLineNum = 1583;BA.debugLine="writer2.WriteLine(n)";
_writer2.WriteLine(_n);
 //BA.debugLineNum = 1584;BA.debugLine="writer2.WriteLine(q)";
_writer2.WriteLine(_q);
 //BA.debugLineNum = 1585;BA.debugLine="writer2.WriteLine(t)";
_writer2.WriteLine(_t);
 //BA.debugLineNum = 1600;BA.debugLine="writer2.Close";
_writer2.Close();
 //BA.debugLineNum = 1604;BA.debugLine="End Sub";
return "";
}
public String  _heridas_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 774;BA.debugLine="Sub heridas_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 775;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 776;BA.debugLine="heridas1.Text = Old";
_heridas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return "";
}
public String  _heridas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub heridas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 797;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 798;BA.debugLine="heridas2.Text = Old";
_heridas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return "";
}
public String  _heridas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 820;BA.debugLine="Sub heridas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 821;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 822;BA.debugLine="heridas3.Text = Old";
_heridas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 824;BA.debugLine="End Sub";
return "";
}
public String  _heridas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 846;BA.debugLine="Sub heridas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 847;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 848;BA.debugLine="heridas4.Text = Old";
_heridas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public String  _heridas5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 871;BA.debugLine="Sub heridas5_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 872;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 873;BA.debugLine="heridas5.Text = Old";
_heridas5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 875;BA.debugLine="End Sub";
return "";
}
public String  _heridas6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 894;BA.debugLine="Sub heridas6_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 895;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 896;BA.debugLine="heridas6.Text = Old";
_heridas6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 898;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 368;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 369;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return null;
}
public String  _manchas1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 763;BA.debugLine="Sub manchas1_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 764;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 765;BA.debugLine="manchas1.Text = Old";
_manchas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 767;BA.debugLine="End Sub";
return "";
}
public String  _manchas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 785;BA.debugLine="Sub manchas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 786;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 787;BA.debugLine="manchas2.Text = Old";
_manchas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return "";
}
public String  _manchas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub manchas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 810;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 811;BA.debugLine="manchas3.Text = Old";
_manchas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return "";
}
public String  _manchas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 835;BA.debugLine="Sub manchas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 836;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 837;BA.debugLine="manchas4.Text = Old";
_manchas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return "";
}
public String  _manchas5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 860;BA.debugLine="Sub manchas5_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 861;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 862;BA.debugLine="manchas5.Text = Old";
_manchas5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
return "";
}
public String  _manchas6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub manchas6_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 884;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 885;BA.debugLine="manchas6.Text = Old";
_manchas6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return "";
}
public String  _max1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 652;BA.debugLine="Sub max1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 653;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 654;BA.debugLine="max1.Text = Old";
_max1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return "";
}
public String  _max2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 670;BA.debugLine="Sub max2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 671;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 672;BA.debugLine="max2.Text = Old";
_max2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public String  _max3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Sub max3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 689;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 690;BA.debugLine="max3.Text = Old";
_max3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return "";
}
public String  _max4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Sub max4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 712;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 713;BA.debugLine="max4.Text = Old";
_max4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 715;BA.debugLine="End Sub";
return "";
}
public String  _max5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 728;BA.debugLine="Sub max5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 729;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 730;BA.debugLine="max5.Text = Old";
_max5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 732;BA.debugLine="End Sub";
return "";
}
public String  _max6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 745;BA.debugLine="Sub max6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 746;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 747;BA.debugLine="max6.Text = Old";
_max6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 749;BA.debugLine="End Sub";
return "";
}
public String  _min1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub min1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 659;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 660;BA.debugLine="min1.Text = Old";
_min1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return "";
}
public String  _min2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 676;BA.debugLine="Sub min2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 677;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 678;BA.debugLine="min2.Text = Old";
_min2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 680;BA.debugLine="End Sub";
return "";
}
public String  _min3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 694;BA.debugLine="Sub min3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 695;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 696;BA.debugLine="min3.Text = Old";
_min3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return "";
}
public String  _min4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 705;BA.debugLine="Sub min4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 706;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 707;BA.debugLine="min4.Text = Old";
_min4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public String  _min5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 722;BA.debugLine="Sub min5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 723;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 724;BA.debugLine="min5.Text = Old";
_min5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return "";
}
public String  _min6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 739;BA.debugLine="Sub min6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 740;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 741;BA.debugLine="min6.Text = Old";
_min6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return "";
}
public String  _pallet1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 943;BA.debugLine="Sub pallet1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 944;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 945;BA.debugLine="pallet1.Text = Old";
_pallet1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 947;BA.debugLine="End Sub";
return "";
}
public String  _pallet2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 949;BA.debugLine="Sub pallet2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 950;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 951;BA.debugLine="pallet2.Text = Old";
_pallet2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return "";
}
public String  _pallet3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 954;BA.debugLine="Sub pallet3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 955;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 956;BA.debugLine="pallet3.Text = Old";
_pallet3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return "";
}
public String  _pallet4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Sub pallet4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 961;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 962;BA.debugLine="pallet4.Text = Old";
_pallet4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 964;BA.debugLine="End Sub";
return "";
}
public String  _pallet5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 965;BA.debugLine="Sub pallet5_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 966;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 967;BA.debugLine="pallet5.Text = Old";
_pallet5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 969;BA.debugLine="End Sub";
return "";
}
public String  _pallet6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 971;BA.debugLine="Sub pallet6_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 972;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 973;BA.debugLine="pallet6.Text = Old";
_pallet6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 975;BA.debugLine="End Sub";
return "";
}
public String  _peso1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub peso1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 481;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 482;BA.debugLine="peso1.Text = Old";
_peso1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public String  _peso2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub peso2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 486;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 487;BA.debugLine="peso2.Text = Old";
_peso2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public String  _peso3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub peso3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 491;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 492;BA.debugLine="peso3.Text = Old";
_peso3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public String  _peso4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub peso4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 496;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 497;BA.debugLine="peso4.Text = Old";
_peso4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return "";
}
public String  _peso5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 500;BA.debugLine="Sub peso5_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 501;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 502;BA.debugLine="peso5.Text = Old";
_peso5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return "";
}
public String  _peso6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Sub peso6_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 506;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 507;BA.debugLine="peso6.Text = Old";
_peso6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return "";
}
public String  _plu1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Sub plu1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 511;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 512;BA.debugLine="plu1.Text = Old";
_plu1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return "";
}
public String  _plu2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Sub plu2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 517;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 518;BA.debugLine="plu2.Text = Old";
_plu2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public String  _plu3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Sub plu3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 523;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 524;BA.debugLine="plu3.Text = Old";
_plu3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return "";
}
public String  _plu4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub plu4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 529;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 530;BA.debugLine="plu4.Text = Old";
_plu4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return "";
}
public String  _plu5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Sub plu5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 535;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 536;BA.debugLine="plu5.Text = Old";
_plu5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public String  _plu6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 540;BA.debugLine="Sub plu6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 541;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 542;BA.debugLine="plu6.Text = Old";
_plu6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return "";
}
public String  _promedio1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 646;BA.debugLine="Sub promedio1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 647;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 648;BA.debugLine="promedio1.Text = Old";
_promedio1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return "";
}
public String  _promedio2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 664;BA.debugLine="Sub promedio2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 665;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 666;BA.debugLine="promedio2.Text = Old";
_promedio2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 668;BA.debugLine="End Sub";
return "";
}
public String  _promedio3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 682;BA.debugLine="Sub promedio3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 683;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 684;BA.debugLine="promedio3.Text = Old";
_promedio3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return "";
}
public String  _promedio4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 700;BA.debugLine="Sub promedio4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 701;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 702;BA.debugLine="promedio4.Text = Old";
_promedio4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return "";
}
public String  _promedio5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 717;BA.debugLine="Sub promedio5_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 718;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 719;BA.debugLine="promedio5.Text = Old";
_promedio5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return "";
}
public String  _promedio6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 734;BA.debugLine="Sub promedio6_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 735;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 736;BA.debugLine="promedio6.Text = Old";
_promedio6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 738;BA.debugLine="End Sub";
return "";
}
public String  _temp1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub temp1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 617;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 618;BA.debugLine="temp1.Text = Old";
_temp1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 620;BA.debugLine="End Sub";
return "";
}
public String  _temp2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Sub temp2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 622;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 623;BA.debugLine="temp2.Text = Old";
_temp2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _temp3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 626;BA.debugLine="Sub temp3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 627;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 628;BA.debugLine="temp3.Text = Old";
_temp3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 630;BA.debugLine="End Sub";
return "";
}
public String  _temp4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Sub temp4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 632;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 633;BA.debugLine="temp4.Text = Old";
_temp4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return "";
}
public String  _temp5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 636;BA.debugLine="Sub temp5_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 637;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 638;BA.debugLine="temp5.Text = Old";
_temp5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return "";
}
public String  _temp6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 641;BA.debugLine="Sub temp6_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 642;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 643;BA.debugLine="temp6.Text = Old";
_temp6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return "";
}
public String  _total() throws Exception{
 //BA.debugLineNum = 1208;BA.debugLine="Sub total''saca daños parciales y llena caja de te";
 //BA.debugLineNum = 1352;BA.debugLine="total1.text = NumberFormat(bitter1.Text + manchas";
_total1.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter1.getText()))+(double)(Double.parseDouble(_manchas1.getText()))+(double)(Double.parseDouble(_asoleado1.getText()))+(double)(Double.parseDouble(_heridas1.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1354;BA.debugLine="total2.text = NumberFormat(bitter2.Text + manchas";
_total2.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter2.getText()))+(double)(Double.parseDouble(_manchas2.getText()))+(double)(Double.parseDouble(_asoleado2.getText()))+(double)(Double.parseDouble(_heridas2.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1355;BA.debugLine="total3.text = NumberFormat(bitter3.Text + manchas";
_total3.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter3.getText()))+(double)(Double.parseDouble(_manchas3.getText()))+(double)(Double.parseDouble(_asoleado3.getText()))+(double)(Double.parseDouble(_heridas3.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1357;BA.debugLine="total4.text = NumberFormat(bitter4.Text + manchas";
_total4.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter4.getText()))+(double)(Double.parseDouble(_manchas4.getText()))+(double)(Double.parseDouble(_asoleado4.getText()))+(double)(Double.parseDouble(_heridas4.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1366;BA.debugLine="End Sub";
return "";
}
public boolean  _valid() throws Exception{
boolean _a = false;
boolean _b = false;
boolean _c = false;
boolean _d = false;
boolean _e = false;
 //BA.debugLineNum = 452;BA.debugLine="Sub valid As  Boolean ''valida cajas de texto y co";
 //BA.debugLineNum = 453;BA.debugLine="Dim a,b,c,d,e As Boolean";
_a = false;
_b = false;
_c = false;
_d = false;
_e = false;
 //BA.debugLineNum = 454;BA.debugLine="a=False";
_a = __c.False;
 //BA.debugLineNum = 455;BA.debugLine="b=False";
_b = __c.False;
 //BA.debugLineNum = 456;BA.debugLine="c=False";
_c = __c.False;
 //BA.debugLineNum = 457;BA.debugLine="d=False";
_d = __c.False;
 //BA.debugLineNum = 458;BA.debugLine="a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or";
_a = _emp1.getSelectedIndex()==0 || _emp2.getSelectedIndex()==0 || _emp3.getSelectedIndex()==0 || _emp4.getSelectedIndex()==0 || _marca1.getSelectedIndex()==0 || _marca2.getSelectedIndex()==0 || _marca3.getSelectedIndex()==0 || _marca4.getSelectedIndex()==0;
 //BA.debugLineNum = 459;BA.debugLine="b=calidad1.SelectedIndex=0 Or calidad2.SelectedIn";
_b = _calidad1.getSelectedIndex()==0 || _calidad2.getSelectedIndex()==0 || _calidad3.getSelectedIndex()==0 || _calidad4.getSelectedIndex()==0 || _apariencia1.getSelectedIndex()==0 || _apariencia2.getSelectedIndex()==0 || _apariencia3.getSelectedIndex()==0 || _apariencia4.getSelectedIndex()==0;
 //BA.debugLineNum = 461;BA.debugLine="c= pallet1.Text=\"\" Or pallet2.Text=\"\" Or pallet3.";
_c = (_pallet1.getText()).equals("") || (_pallet2.getText()).equals("") || (_pallet3.getText()).equals("") || (_pallet4.getText()).equals("") || (_env1.getText()).equals("") || (_env2.getText()).equals("") || (_env3.getText()).equals("") || (_env4.getText()).equals("") || (_peso1.getText()).equals("") || (_peso2.getText()).equals("") || (_peso3.getText()).equals("") || (_peso4.getText()).equals("");
 //BA.debugLineNum = 462;BA.debugLine="d= color1.Text=\"\" Or color2.Text=\"\" Or color3.Tex";
_d = (_color1.getText()).equals("") || (_color2.getText()).equals("") || (_color3.getText()).equals("") || (_color4.getText()).equals("") || (_temp1.getText()).equals("") || (_temp2.getText()).equals("") || (_temp3.getText()).equals("") || (_temp4.getText()).equals("") || (_var1.getText()).equals("") || (_var2.getText()).equals("") || (_var3.getText()).equals("") || (_var4.getText()).equals("") || (_sello1.getText()).equals("") || (_sello2.getText()).equals("") || (_sello3.getText()).equals("") || (_sello4.getText()).equals("");
 //BA.debugLineNum = 469;BA.debugLine="If a=True Or b= True Or c=True Or d=True Then";
if (_a==__c.True || _b==__c.True || _c==__c.True || _d==__c.True) { 
 //BA.debugLineNum = 470;BA.debugLine="Msgbox(\"Debe completar los datos\",\"ERROR\")";
__c.Msgbox(BA.ObjectToCharSequence("Debe completar los datos"),BA.ObjectToCharSequence("ERROR"),ba);
 //BA.debugLineNum = 471;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 473;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 476;BA.debugLine="End Sub";
return false;
}
public String  _var1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 904;BA.debugLine="Sub var1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 905;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 906;BA.debugLine="var1.Text = Old";
_var1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 908;BA.debugLine="End Sub";
return "";
}
public String  _var2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 909;BA.debugLine="Sub var2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 910;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 911;BA.debugLine="var2.Text = Old";
_var2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
return "";
}
public String  _var3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 915;BA.debugLine="Sub var3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 916;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 917;BA.debugLine="var3.Text = Old";
_var3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 919;BA.debugLine="End Sub";
return "";
}
public String  _var4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 920;BA.debugLine="Sub var4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 921;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 922;BA.debugLine="var4.Text = Old";
_var4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 924;BA.debugLine="End Sub";
return "";
}
public String  _var5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 927;BA.debugLine="Sub var5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 928;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 929;BA.debugLine="var5.Text = Old";
_var5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return "";
}
public String  _var6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 932;BA.debugLine="Sub var6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 933;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 934;BA.debugLine="var6.Text = Old";
_var6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
