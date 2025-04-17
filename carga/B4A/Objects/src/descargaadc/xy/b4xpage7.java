package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage7 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage7");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage7.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.SpinnerWrapper _emp5 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _emp6 = null;
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
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna4 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _calidadinterna2 = null;
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
public anywheresoftware.b4a.objects.LabelWrapper _lbl19 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label92 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label93 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label94 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label95 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label96 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpage1title = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _asoleado1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 947;BA.debugLine="Sub asoleado1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 948;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 949;BA.debugLine="asoleado1.Text = Old";
_asoleado1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 951;BA.debugLine="End Sub";
return "";
}
public String  _asoleado2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 969;BA.debugLine="Sub asoleado2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 970;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 971;BA.debugLine="asoleado2.Text = Old";
_asoleado2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 973;BA.debugLine="End Sub";
return "";
}
public String  _asoleado3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 993;BA.debugLine="Sub asoleado3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 994;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 995;BA.debugLine="asoleado3.Text = Old";
_asoleado3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 997;BA.debugLine="End Sub";
return "";
}
public String  _asoleado4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1019;BA.debugLine="Sub asoleado4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 1020;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1021;BA.debugLine="asoleado4.Text = Old";
_asoleado4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1023;BA.debugLine="End Sub";
return "";
}
public String  _asoleado5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1044;BA.debugLine="Sub asoleado5_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 1045;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1046;BA.debugLine="asoleado5.Text = Old";
_asoleado5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return "";
}
public String  _asoleado6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1067;BA.debugLine="Sub asoleado6_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 1068;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1069;BA.debugLine="asoleado6.Text = Old";
_asoleado6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1071;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
descargaadc.xy.b4xmainpage _mainpage = null;
anywheresoftware.b4a.objects.collections.List _list2 = null;
anywheresoftware.b4a.objects.collections.List _list3 = null;
 //BA.debugLineNum = 501;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 502;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 504;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 505;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 507;BA.debugLine="ScrollView1.Panel.LoadLayout(\"carg2finalmod3\")'(\"";
_scrollview1.getPanel().LoadLayout("carg2finalmod3",ba);
 //BA.debugLineNum = 508;BA.debugLine="Page2.Initialize";
_page2._initialize /*Object*/ (ba);
 //BA.debugLineNum = 509;BA.debugLine="B4XPages.AddPage(\"Page 2\", Page2)";
_b4xpages._addpage /*String*/ (ba,"Page 2",(Object)(_page2));
 //BA.debugLineNum = 510;BA.debugLine="Page1.Initialize";
_page1._initialize /*Object*/ (ba);
 //BA.debugLineNum = 511;BA.debugLine="B4XPages.AddPage(\"Page 1\", Page1)";
_b4xpages._addpage /*String*/ (ba,"Page 1",(Object)(_page1));
 //BA.debugLineNum = 519;BA.debugLine="Panel2.Color=Colors.RGB(255,140,0)";
_panel2.setColor(__c.Colors.RGB((int) (255),(int) (140),(int) (0)));
 //BA.debugLineNum = 526;BA.debugLine="Label30.Text=\"Datos Carga 13\"";
_label30.setText(BA.ObjectToCharSequence("Datos Carga 13"));
 //BA.debugLineNum = 528;BA.debugLine="Label3.Text=\"Datos Carga 14\"";
_label3.setText(BA.ObjectToCharSequence("Datos Carga 14"));
 //BA.debugLineNum = 529;BA.debugLine="Label19.Text=\"Datos Carga 15\"";
_label19.setText(BA.ObjectToCharSequence("Datos Carga 15"));
 //BA.debugLineNum = 530;BA.debugLine="lbl19.Text=\"Datos Carga 16\"";
_lbl19.setText(BA.ObjectToCharSequence("Datos Carga 16"));
 //BA.debugLineNum = 531;BA.debugLine="Label6.Text=\"Datos Carga 17\"";
_label6.setText(BA.ObjectToCharSequence("Datos Carga 17"));
 //BA.debugLineNum = 532;BA.debugLine="Label20.Text=\"Datos Carga 18\"";
_label20.setText(BA.ObjectToCharSequence("Datos Carga 18"));
 //BA.debugLineNum = 533;BA.debugLine="B4XPages.SetTitle(Me, \"Datos Cargas 13 -18\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Datos Cargas 13 -18"));
 //BA.debugLineNum = 534;BA.debugLine="Dim MainPage As B4XMainPage = B4XPages.GetPage(\"M";
_mainpage = (descargaadc.xy.b4xmainpage)(_b4xpages._getpage /*Object*/ (ba,"MainPage"));
 //BA.debugLineNum = 535;BA.debugLine="MainPage.com3=True";
_mainpage._com3 /*boolean*/  = __c.True;
 //BA.debugLineNum = 536;BA.debugLine="Log(\"COM3\")";
__c.LogImpl("233882147","COM3",0);
 //BA.debugLineNum = 537;BA.debugLine="Log(MainPage.COM3)";
__c.LogImpl("233882148",BA.ObjectToString(_mainpage._com3 /*boolean*/ ),0);
 //BA.debugLineNum = 540;BA.debugLine="ScrollView1.Panel.Height = Panel2.Height";
_scrollview1.getPanel().setHeight(_panel2.getHeight());
 //BA.debugLineNum = 551;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 558;BA.debugLine="B4XPages.AddMenuItem(Me, \"Carga7\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Carga7"));
 //BA.debugLineNum = 559;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 580;BA.debugLine="Bmp.Initialize(File.DirAssets, \"android48.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"android48.png");
 //BA.debugLineNum = 581;BA.debugLine="Dim list2 As List";
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 582;BA.debugLine="Dim list3 As List";
_list3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 584;BA.debugLine="list2 = File.ReadList(cargas, \"marc.txt\")";
_list2 = __c.File.ReadList(_cargas,"marc.txt");
 //BA.debugLineNum = 586;BA.debugLine="list3 = File.ReadList(cargas, \"emp.txt\")''emp";
_list3 = __c.File.ReadList(_cargas,"emp.txt");
 //BA.debugLineNum = 593;BA.debugLine="emp1.AddAll(list3)";
_emp1.AddAll(_list3);
 //BA.debugLineNum = 594;BA.debugLine="emp2.AddAll(list3)";
_emp2.AddAll(_list3);
 //BA.debugLineNum = 595;BA.debugLine="emp3.AddAll(list3)";
_emp3.AddAll(_list3);
 //BA.debugLineNum = 596;BA.debugLine="emp4.AddAll(list3)";
_emp4.AddAll(_list3);
 //BA.debugLineNum = 597;BA.debugLine="emp5.AddAll(list3)";
_emp5.AddAll(_list3);
 //BA.debugLineNum = 598;BA.debugLine="emp6.AddAll(list3)";
_emp6.AddAll(_list3);
 //BA.debugLineNum = 631;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 1232;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 1233;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 1234;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 1236;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 1237;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 1239;BA.debugLine="If Tag =\"Carga1\" Then";
if ((_tag).equals("Carga1")) { 
 //BA.debugLineNum = 1240;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 1242;BA.debugLine="If Tag =\"Carga2\" Then";
if ((_tag).equals("Carga2")) { 
 //BA.debugLineNum = 1243;BA.debugLine="B4XPages.ShowPage(\"Page 3\")";
_b4xpages._showpage /*String*/ (ba,"Page 3");
 };
 //BA.debugLineNum = 1245;BA.debugLine="If Tag =\"Cargac1\" Then";
if ((_tag).equals("Cargac1")) { 
 //BA.debugLineNum = 1246;BA.debugLine="B4XPages.ShowPage(\"Page 4\")";
_b4xpages._showpage /*String*/ (ba,"Page 4");
 };
 //BA.debugLineNum = 1249;BA.debugLine="If Tag =\"Cargac2\" Then";
if ((_tag).equals("Cargac2")) { 
 //BA.debugLineNum = 1250;BA.debugLine="B4XPages.ShowPage(\"Page 5\")";
_b4xpages._showpage /*String*/ (ba,"Page 5");
 };
 //BA.debugLineNum = 1252;BA.debugLine="If Tag =\"Cargac3\" Then";
if ((_tag).equals("Cargac3")) { 
 //BA.debugLineNum = 1253;BA.debugLine="B4XPages.ShowPage(\"Page 6\")";
_b4xpages._showpage /*String*/ (ba,"Page 6");
 };
 //BA.debugLineNum = 1255;BA.debugLine="If Tag =\"Bolsa1\" Then";
if ((_tag).equals("Bolsa1")) { 
 //BA.debugLineNum = 1256;BA.debugLine="B4XPages.ShowPage(\"Page 7\")";
_b4xpages._showpage /*String*/ (ba,"Page 7");
 };
 //BA.debugLineNum = 1258;BA.debugLine="If Tag =\"Bolsa2\" Then";
if ((_tag).equals("Bolsa2")) { 
 //BA.debugLineNum = 1259;BA.debugLine="B4XPages.ShowPage(\"Page 8\")";
_b4xpages._showpage /*String*/ (ba,"Page 8");
 };
 //BA.debugLineNum = 1261;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 };
 //BA.debugLineNum = 1268;BA.debugLine="End Sub";
return "";
}
public String  _bitter1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 935;BA.debugLine="Sub bitter1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 936;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 937;BA.debugLine="bitter1.Text = Old";
_bitter1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return "";
}
public String  _bitter2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 957;BA.debugLine="Sub bitter2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 958;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 959;BA.debugLine="bitter2.Text = Old";
_bitter2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 961;BA.debugLine="End Sub";
return "";
}
public String  _bitter3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 981;BA.debugLine="Sub bitter3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 982;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 983;BA.debugLine="bitter3.Text = Old";
_bitter3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
return "";
}
public String  _bitter4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1007;BA.debugLine="Sub bitter4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1008;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1009;BA.debugLine="bitter4.Text = Old";
_bitter4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return "";
}
public String  _bitter5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1032;BA.debugLine="Sub bitter5_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1033;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1034;BA.debugLine="bitter5.Text = Old";
_bitter5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return "";
}
public String  _bitter6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1055;BA.debugLine="Sub bitter6_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1056;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1057;BA.debugLine="bitter6.Text = Old";
_bitter6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1059;BA.debugLine="End Sub";
return "";
}
public String  _blanqueo() throws Exception{
 //BA.debugLineNum = 1601;BA.debugLine="public  Sub blanqueo";
 //BA.debugLineNum = 1605;BA.debugLine="plu1.text=\"\"";
_plu1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1606;BA.debugLine="plu2.text=\"\"";
_plu2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1607;BA.debugLine="plu3.text=\"\"";
_plu3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1608;BA.debugLine="plu4.text=\"\"";
_plu4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1609;BA.debugLine="plu5.text=\"\"";
_plu5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1610;BA.debugLine="plu6.text=\"\"";
_plu6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1613;BA.debugLine="pallet1.Text=\"\"";
_pallet1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1614;BA.debugLine="pallet2.Text=\"\"";
_pallet2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1615;BA.debugLine="pallet3.Text=\"\"";
_pallet3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1616;BA.debugLine="pallet4.Text=\"\"";
_pallet4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1617;BA.debugLine="pallet5.Text=\"\"";
_pallet5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1618;BA.debugLine="pallet6.Text=\"\"";
_pallet6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1621;BA.debugLine="temp1.Text=\"\"";
_temp1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1622;BA.debugLine="temp2.Text=\"\"";
_temp2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1623;BA.debugLine="temp3.Text=\"\"";
_temp3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1624;BA.debugLine="temp4.Text=\"\"";
_temp4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1625;BA.debugLine="temp5.Text=\"\"";
_temp5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1626;BA.debugLine="temp6.Text=\"\"";
_temp6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1627;BA.debugLine="promedio1.Text=\"\"";
_promedio1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1628;BA.debugLine="promedio2.Text=\"\"";
_promedio2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1629;BA.debugLine="promedio3.Text=\"\"";
_promedio3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1630;BA.debugLine="promedio4.Text=\"\"";
_promedio4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1631;BA.debugLine="promedio5.Text=\"\"";
_promedio5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1632;BA.debugLine="promedio6.Text=\"\"";
_promedio6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1633;BA.debugLine="max1.Text=\"\"";
_max1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1634;BA.debugLine="max2.Text=\"\"";
_max2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1635;BA.debugLine="max3.Text=\"\"";
_max3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1636;BA.debugLine="max4.Text=\"\"";
_max4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1637;BA.debugLine="min1.Text=\"\"";
_min1.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1638;BA.debugLine="min2.Text=\"\"";
_min2.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1639;BA.debugLine="min3.Text=\"\"";
_min3.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1640;BA.debugLine="min4.Text=\"\"";
_min4.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1641;BA.debugLine="min5.Text=\"\"";
_min5.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1642;BA.debugLine="min6.Text=\"\"";
_min6.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1644;BA.debugLine="emp1.SelectedIndex=0";
_emp1.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1645;BA.debugLine="emp2.SelectedIndex=0";
_emp2.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1646;BA.debugLine="emp3.SelectedIndex=0";
_emp3.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1647;BA.debugLine="emp4.SelectedIndex=0";
_emp4.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1648;BA.debugLine="emp5.SelectedIndex=0";
_emp5.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1649;BA.debugLine="emp6.SelectedIndex=0";
_emp6.setSelectedIndex((int) (0));
 //BA.debugLineNum = 1651;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 1588;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 1589;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1590;BA.debugLine="End Sub";
return "";
}
public String  _button2_click() throws Exception{
 //BA.debugLineNum = 1656;BA.debugLine="Private Sub Button2_Click";
 //BA.debugLineNum = 1661;BA.debugLine="emp1.SelectedIndex=4";
_emp1.setSelectedIndex((int) (4));
 //BA.debugLineNum = 1662;BA.debugLine="emp2.SelectedIndex=2";
_emp2.setSelectedIndex((int) (2));
 //BA.debugLineNum = 1663;BA.debugLine="emp3.SelectedIndex=1";
_emp3.setSelectedIndex((int) (1));
 //BA.debugLineNum = 1664;BA.debugLine="emp4.SelectedIndex=3";
_emp4.setSelectedIndex((int) (3));
 //BA.debugLineNum = 1665;BA.debugLine="emp5.SelectedIndex=4";
_emp5.setSelectedIndex((int) (4));
 //BA.debugLineNum = 1666;BA.debugLine="emp6.SelectedIndex=5";
_emp6.setSelectedIndex((int) (5));
 //BA.debugLineNum = 1667;BA.debugLine="pallet1.text=\"22222\"";
_pallet1.setText(BA.ObjectToCharSequence("22222"));
 //BA.debugLineNum = 1668;BA.debugLine="pallet2.text=\"333333\"";
_pallet2.setText(BA.ObjectToCharSequence("333333"));
 //BA.debugLineNum = 1669;BA.debugLine="pallet3.text=\"444444\"";
_pallet3.setText(BA.ObjectToCharSequence("444444"));
 //BA.debugLineNum = 1670;BA.debugLine="pallet4.text=\"55555\"";
_pallet4.setText(BA.ObjectToCharSequence("55555"));
 //BA.debugLineNum = 1671;BA.debugLine="pallet5.text=\"66666\"";
_pallet5.setText(BA.ObjectToCharSequence("66666"));
 //BA.debugLineNum = 1672;BA.debugLine="pallet6.text=\"777777\"";
_pallet6.setText(BA.ObjectToCharSequence("777777"));
 //BA.debugLineNum = 1673;BA.debugLine="temp1.text=\"47.6\"";
_temp1.setText(BA.ObjectToCharSequence("47.6"));
 //BA.debugLineNum = 1674;BA.debugLine="temp2.text=\"48.6\"";
_temp2.setText(BA.ObjectToCharSequence("48.6"));
 //BA.debugLineNum = 1675;BA.debugLine="temp3.text=\"49.6\"";
_temp3.setText(BA.ObjectToCharSequence("49.6"));
 //BA.debugLineNum = 1676;BA.debugLine="temp4.text=\"50.6\"";
_temp4.setText(BA.ObjectToCharSequence("50.6"));
 //BA.debugLineNum = 1677;BA.debugLine="temp5.text=\"51.6\"";
_temp5.setText(BA.ObjectToCharSequence("51.6"));
 //BA.debugLineNum = 1678;BA.debugLine="temp6.text=\"52.6\"";
_temp6.setText(BA.ObjectToCharSequence("52.6"));
 //BA.debugLineNum = 1679;BA.debugLine="promedio1.text=\"53.6\"";
_promedio1.setText(BA.ObjectToCharSequence("53.6"));
 //BA.debugLineNum = 1680;BA.debugLine="promedio2.text=\"54.6\"";
_promedio2.setText(BA.ObjectToCharSequence("54.6"));
 //BA.debugLineNum = 1681;BA.debugLine="promedio3.text=\"55.6\"";
_promedio3.setText(BA.ObjectToCharSequence("55.6"));
 //BA.debugLineNum = 1682;BA.debugLine="promedio4.text=\"56.6\"";
_promedio4.setText(BA.ObjectToCharSequence("56.6"));
 //BA.debugLineNum = 1683;BA.debugLine="promedio5.text=\"57.6\"";
_promedio5.setText(BA.ObjectToCharSequence("57.6"));
 //BA.debugLineNum = 1684;BA.debugLine="promedio6.text=\"58.6\"";
_promedio6.setText(BA.ObjectToCharSequence("58.6"));
 //BA.debugLineNum = 1685;BA.debugLine="max1.text=\"59.6\"";
_max1.setText(BA.ObjectToCharSequence("59.6"));
 //BA.debugLineNum = 1686;BA.debugLine="max2.text=\"60.6\"";
_max2.setText(BA.ObjectToCharSequence("60.6"));
 //BA.debugLineNum = 1687;BA.debugLine="max3.text=\"61.6\"";
_max3.setText(BA.ObjectToCharSequence("61.6"));
 //BA.debugLineNum = 1688;BA.debugLine="max4.text=\"62.6\"";
_max4.setText(BA.ObjectToCharSequence("62.6"));
 //BA.debugLineNum = 1689;BA.debugLine="max5.text=\"63.6\"";
_max5.setText(BA.ObjectToCharSequence("63.6"));
 //BA.debugLineNum = 1690;BA.debugLine="max6.text=\"64.6\"";
_max6.setText(BA.ObjectToCharSequence("64.6"));
 //BA.debugLineNum = 1691;BA.debugLine="min1.text=\"65.6\"";
_min1.setText(BA.ObjectToCharSequence("65.6"));
 //BA.debugLineNum = 1692;BA.debugLine="min2.text=\"66.6\"";
_min2.setText(BA.ObjectToCharSequence("66.6"));
 //BA.debugLineNum = 1693;BA.debugLine="min3.text=\"67.6\"";
_min3.setText(BA.ObjectToCharSequence("67.6"));
 //BA.debugLineNum = 1694;BA.debugLine="min4.text=\"68.6\"";
_min4.setText(BA.ObjectToCharSequence("68.6"));
 //BA.debugLineNum = 1695;BA.debugLine="min5.text=\"69.6\"";
_min5.setText(BA.ObjectToCharSequence("69.6"));
 //BA.debugLineNum = 1696;BA.debugLine="min6.text=\"70.6\"";
_min6.setText(BA.ObjectToCharSequence("70.6"));
 //BA.debugLineNum = 1697;BA.debugLine="plu1.text=\"aaa\"";
_plu1.setText(BA.ObjectToCharSequence("aaa"));
 //BA.debugLineNum = 1698;BA.debugLine="plu2.text=\"bbb\"";
_plu2.setText(BA.ObjectToCharSequence("bbb"));
 //BA.debugLineNum = 1699;BA.debugLine="plu3.text=\"ccc\"";
_plu3.setText(BA.ObjectToCharSequence("ccc"));
 //BA.debugLineNum = 1700;BA.debugLine="plu4.text=\"ddd\"";
_plu4.setText(BA.ObjectToCharSequence("ddd"));
 //BA.debugLineNum = 1701;BA.debugLine="plu5.text=\"eee\"";
_plu5.setText(BA.ObjectToCharSequence("eee"));
 //BA.debugLineNum = 1702;BA.debugLine="plu6.text=\"fff\"";
_plu6.setText(BA.ObjectToCharSequence("fff"));
 //BA.debugLineNum = 1704;BA.debugLine="End Sub";
return "";
}
public String  _button3_click() throws Exception{
 //BA.debugLineNum = 1706;BA.debugLine="Private Sub Button3_Click";
 //BA.debugLineNum = 1713;BA.debugLine="If emp1.SelectedIndex =0 Then";
if (_emp1.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1714;BA.debugLine="emp1.SelectediNDEX =1";
_emp1.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1716;BA.debugLine="If emp2.SelectedIndex =0 Then";
if (_emp2.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1717;BA.debugLine="emp2.SelectediNDEX =1";
_emp2.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1719;BA.debugLine="If emp3. SelectedIndex=0 Then";
if (_emp3.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1720;BA.debugLine="emp3.SelectedIndex =1";
_emp3.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1723;BA.debugLine="If emp4.SelectedIndex =0 Then";
if (_emp4.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1724;BA.debugLine="emp4.SelectedIndex=1";
_emp4.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1727;BA.debugLine="If emp5. SelectedIndex=0 Then";
if (_emp5.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1728;BA.debugLine="emp5.SelectedIndex =1";
_emp5.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1731;BA.debugLine="If emp6.SelectedIndex =0 Then";
if (_emp6.getSelectedIndex()==0) { 
 //BA.debugLineNum = 1732;BA.debugLine="emp6.SelectedIndex=1";
_emp6.setSelectedIndex((int) (1));
 };
 //BA.debugLineNum = 1735;BA.debugLine="If pallet1.text =\"\" Then";
if ((_pallet1.getText()).equals("")) { 
 //BA.debugLineNum = 1736;BA.debugLine="pallet1.text=\"S/D\"";
_pallet1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1739;BA.debugLine="If pallet2.text =\"\" Then";
if ((_pallet2.getText()).equals("")) { 
 //BA.debugLineNum = 1740;BA.debugLine="pallet2.text=\"S/D\"";
_pallet2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1742;BA.debugLine="If pallet3.text =\"\" Then";
if ((_pallet3.getText()).equals("")) { 
 //BA.debugLineNum = 1743;BA.debugLine="pallet3.text=\"S/D\"";
_pallet3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1745;BA.debugLine="If pallet4.text =\"\" Then";
if ((_pallet4.getText()).equals("")) { 
 //BA.debugLineNum = 1746;BA.debugLine="pallet4.text=\"S/D\"";
_pallet4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1749;BA.debugLine="If pallet5.text =\"\" Then";
if ((_pallet5.getText()).equals("")) { 
 //BA.debugLineNum = 1750;BA.debugLine="pallet5.text=\"S/D\"";
_pallet5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1752;BA.debugLine="If pallet6.text =\"\" Then";
if ((_pallet6.getText()).equals("")) { 
 //BA.debugLineNum = 1753;BA.debugLine="pallet6.text=\"S/D\"";
_pallet6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1758;BA.debugLine="If temp1.text =\"\" Then";
if ((_temp1.getText()).equals("")) { 
 //BA.debugLineNum = 1759;BA.debugLine="temp1.text=\"S/D\"";
_temp1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1762;BA.debugLine="If temp2.text =\"\" Then";
if ((_temp2.getText()).equals("")) { 
 //BA.debugLineNum = 1763;BA.debugLine="temp2.text=\"S/D\"";
_temp2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1765;BA.debugLine="If temp3.text =\"\" Then";
if ((_temp3.getText()).equals("")) { 
 //BA.debugLineNum = 1766;BA.debugLine="temp3.text=\"S/D\"";
_temp3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1768;BA.debugLine="If temp4.text =\"\" Then";
if ((_temp4.getText()).equals("")) { 
 //BA.debugLineNum = 1769;BA.debugLine="temp4.text=\"S/D\"";
_temp4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1773;BA.debugLine="If temp5.text =\"\" Then";
if ((_temp5.getText()).equals("")) { 
 //BA.debugLineNum = 1774;BA.debugLine="temp5.text=\"S/D\"";
_temp5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1776;BA.debugLine="If temp6.text =\"\" Then";
if ((_temp6.getText()).equals("")) { 
 //BA.debugLineNum = 1777;BA.debugLine="temp6.text=\"S/D\"";
_temp6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1784;BA.debugLine="If plu1.text =\"\" Then";
if ((_plu1.getText()).equals("")) { 
 //BA.debugLineNum = 1785;BA.debugLine="plu1.text=\"S/D\"";
_plu1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1787;BA.debugLine="If plu2.text =\"\" Then";
if ((_plu2.getText()).equals("")) { 
 //BA.debugLineNum = 1788;BA.debugLine="plu2.text=\"S/D\"";
_plu2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1790;BA.debugLine="If plu3.text =\"\" Then";
if ((_plu3.getText()).equals("")) { 
 //BA.debugLineNum = 1791;BA.debugLine="plu3.text=\"S/D\"";
_plu3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1793;BA.debugLine="If plu4.text =\"\" Then";
if ((_plu4.getText()).equals("")) { 
 //BA.debugLineNum = 1794;BA.debugLine="plu4.text=\"S/D\"";
_plu4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1798;BA.debugLine="If plu5.text =\"\" Then";
if ((_plu5.getText()).equals("")) { 
 //BA.debugLineNum = 1799;BA.debugLine="plu5.text=\"S/D\"";
_plu5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1802;BA.debugLine="If plu6.text =\"\" Then";
if ((_plu6.getText()).equals("")) { 
 //BA.debugLineNum = 1803;BA.debugLine="plu6.text=\"S/D\"";
_plu6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1806;BA.debugLine="If max1.text =\"\" Then";
if ((_max1.getText()).equals("")) { 
 //BA.debugLineNum = 1807;BA.debugLine="max1.text=\"S/D\"";
_max1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1809;BA.debugLine="If max2.text =\"\" Then";
if ((_max2.getText()).equals("")) { 
 //BA.debugLineNum = 1810;BA.debugLine="max2.text=\"S/D\"";
_max2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1812;BA.debugLine="If max3.text =\"\" Then";
if ((_max3.getText()).equals("")) { 
 //BA.debugLineNum = 1813;BA.debugLine="max3.text=\"S/D\"";
_max3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1815;BA.debugLine="If max4.text =\"\" Then";
if ((_max4.getText()).equals("")) { 
 //BA.debugLineNum = 1816;BA.debugLine="max4.text=\"S/D\"";
_max4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1818;BA.debugLine="If max6.text =\"\" Then";
if ((_max6.getText()).equals("")) { 
 //BA.debugLineNum = 1819;BA.debugLine="max6.text=\"S/D\"";
_max6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1821;BA.debugLine="If max5.text =\"\" Then";
if ((_max5.getText()).equals("")) { 
 //BA.debugLineNum = 1822;BA.debugLine="max5.text=\"S/D\"";
_max5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1828;BA.debugLine="If min1.text =\"\" Then";
if ((_min1.getText()).equals("")) { 
 //BA.debugLineNum = 1829;BA.debugLine="min1.text=\"S/D\"";
_min1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1831;BA.debugLine="If min2.text =\"\" Then";
if ((_min2.getText()).equals("")) { 
 //BA.debugLineNum = 1832;BA.debugLine="min2.text=\"S/D\"";
_min2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1834;BA.debugLine="If min3.text =\"\" Then";
if ((_min3.getText()).equals("")) { 
 //BA.debugLineNum = 1835;BA.debugLine="min3.text=\"S/D\"";
_min3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1837;BA.debugLine="If min4.text =\"\" Then";
if ((_min4.getText()).equals("")) { 
 //BA.debugLineNum = 1838;BA.debugLine="min4.text=\"S/D\"";
_min4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1840;BA.debugLine="If min5.text =\"\" Then";
if ((_min5.getText()).equals("")) { 
 //BA.debugLineNum = 1841;BA.debugLine="min5.text=\"S/D\"";
_min5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1843;BA.debugLine="If min6.text =\"\" Then";
if ((_min6.getText()).equals("")) { 
 //BA.debugLineNum = 1844;BA.debugLine="min6.text=\"S/D\"";
_min6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1852;BA.debugLine="If promedio1.text =\"\" Then";
if ((_promedio1.getText()).equals("")) { 
 //BA.debugLineNum = 1853;BA.debugLine="promedio1.text=\"S/D\"";
_promedio1.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1855;BA.debugLine="If promedio2.text =\"\" Then";
if ((_promedio2.getText()).equals("")) { 
 //BA.debugLineNum = 1856;BA.debugLine="promedio2.text=\"S/D\"";
_promedio2.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1858;BA.debugLine="If promedio3.text =\"\" Then";
if ((_promedio3.getText()).equals("")) { 
 //BA.debugLineNum = 1859;BA.debugLine="promedio3.text=\"S/D\"";
_promedio3.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1861;BA.debugLine="If promedio4.text =\"\" Then";
if ((_promedio4.getText()).equals("")) { 
 //BA.debugLineNum = 1862;BA.debugLine="promedio4.text=\"S/D\"";
_promedio4.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1864;BA.debugLine="If promedio5.text =\"\" Then";
if ((_promedio5.getText()).equals("")) { 
 //BA.debugLineNum = 1865;BA.debugLine="promedio5.text=\"S/D\"";
_promedio5.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1867;BA.debugLine="If promedio6.text =\"\" Then";
if ((_promedio6.getText()).equals("")) { 
 //BA.debugLineNum = 1868;BA.debugLine="promedio6.text=\"S/D\"";
_promedio6.setText(BA.ObjectToCharSequence("S/D"));
 };
 //BA.debugLineNum = 1887;BA.debugLine="End Sub";
return "";
}
public String  _button4_click() throws Exception{
 //BA.debugLineNum = 1653;BA.debugLine="Private Sub Button4_Click";
 //BA.debugLineNum = 1654;BA.debugLine="calc_Click";
_calc_click();
 //BA.debugLineNum = 1655;BA.debugLine="End Sub";
return "";
}
public String  _button5_click() throws Exception{
 //BA.debugLineNum = 1591;BA.debugLine="Private Sub Button5_Click";
 //BA.debugLineNum = 1592;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1593;BA.debugLine="End Sub";
return "";
}
public String  _button6_click() throws Exception{
 //BA.debugLineNum = 1594;BA.debugLine="Private Sub Button6_Click";
 //BA.debugLineNum = 1595;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1596;BA.debugLine="End Sub";
return "";
}
public String  _button7_click() throws Exception{
 //BA.debugLineNum = 1597;BA.debugLine="Private Sub Button7_Click";
 //BA.debugLineNum = 1598;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 //BA.debugLineNum = 1599;BA.debugLine="End Sub";
return "";
}
public String  _calc_click() throws Exception{
 //BA.debugLineNum = 1413;BA.debugLine="Sub calc_Click";
 //BA.debugLineNum = 1415;BA.debugLine="If valid =True Then";
if (_valid()==__c.True) { 
 //BA.debugLineNum = 1416;BA.debugLine="MsgboxAsync(\"Datos validados\",\"ok\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Datos validados"),BA.ObjectToCharSequence("ok"),ba);
 //BA.debugLineNum = 1418;BA.debugLine="ceros";
_ceros();
 //BA.debugLineNum = 1419;BA.debugLine="total";
_total();
 };
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
return "";
}
public String  _ceros() throws Exception{
 //BA.debugLineNum = 1269;BA.debugLine="Sub ceros 'comprueba si no hay nada lleno y pone c";
 //BA.debugLineNum = 1271;BA.debugLine="If bitter1.Text=\"\" Then";
if ((_bitter1.getText()).equals("")) { 
 //BA.debugLineNum = 1272;BA.debugLine="bitter1.Text=\"0\"";
_bitter1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1274;BA.debugLine="If bitter2.Text=\"\" Then";
if ((_bitter2.getText()).equals("")) { 
 //BA.debugLineNum = 1275;BA.debugLine="bitter2.Text=\"0\"";
_bitter2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1277;BA.debugLine="If bitter3.Text=\"\" Then";
if ((_bitter3.getText()).equals("")) { 
 //BA.debugLineNum = 1278;BA.debugLine="bitter3.Text=\"0\"";
_bitter3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1280;BA.debugLine="If bitter4.Text=\"\" Then";
if ((_bitter4.getText()).equals("")) { 
 //BA.debugLineNum = 1281;BA.debugLine="bitter4.Text=\"0\"";
_bitter4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1283;BA.debugLine="If asoleado1.Text=\"\" Then";
if ((_asoleado1.getText()).equals("")) { 
 //BA.debugLineNum = 1284;BA.debugLine="asoleado1.Text=\"0\"";
_asoleado1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1286;BA.debugLine="If asoleado2.Text=\"\" Then";
if ((_asoleado2.getText()).equals("")) { 
 //BA.debugLineNum = 1287;BA.debugLine="asoleado2.Text=\"0\"";
_asoleado2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1289;BA.debugLine="If asoleado3.Text=\"\" Then";
if ((_asoleado3.getText()).equals("")) { 
 //BA.debugLineNum = 1290;BA.debugLine="asoleado3.Text=\"0\"";
_asoleado3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1292;BA.debugLine="If asoleado4.Text=\"\" Then";
if ((_asoleado4.getText()).equals("")) { 
 //BA.debugLineNum = 1293;BA.debugLine="asoleado4.Text=\"0\"";
_asoleado4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1295;BA.debugLine="If heridas1.Text=\"\" Then";
if ((_heridas1.getText()).equals("")) { 
 //BA.debugLineNum = 1296;BA.debugLine="heridas1.Text=\"0\"";
_heridas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1298;BA.debugLine="If heridas2.Text=\"\" Then";
if ((_heridas2.getText()).equals("")) { 
 //BA.debugLineNum = 1299;BA.debugLine="heridas2.Text=\"0\"";
_heridas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1302;BA.debugLine="If heridas3.Text=\"\" Then";
if ((_heridas3.getText()).equals("")) { 
 //BA.debugLineNum = 1303;BA.debugLine="heridas3.Text=\"0\"";
_heridas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1306;BA.debugLine="If heridas4.Text=\"\" Then";
if ((_heridas4.getText()).equals("")) { 
 //BA.debugLineNum = 1307;BA.debugLine="heridas4.Text=\"0\"";
_heridas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1310;BA.debugLine="If manchas1.Text=\"\" Then";
if ((_manchas1.getText()).equals("")) { 
 //BA.debugLineNum = 1311;BA.debugLine="manchas1.Text=\"0\"";
_manchas1.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1313;BA.debugLine="If manchas2.Text=\"\" Then";
if ((_manchas2.getText()).equals("")) { 
 //BA.debugLineNum = 1314;BA.debugLine="manchas2.Text=\"0\"";
_manchas2.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1317;BA.debugLine="If manchas3.Text=\"\" Then";
if ((_manchas3.getText()).equals("")) { 
 //BA.debugLineNum = 1318;BA.debugLine="manchas3.Text=\"0\"";
_manchas3.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1321;BA.debugLine="If manchas4.Text=\"\" Then";
if ((_manchas4.getText()).equals("")) { 
 //BA.debugLineNum = 1322;BA.debugLine="manchas4.Text=\"0\"";
_manchas4.setText(BA.ObjectToCharSequence("0"));
 };
 //BA.debugLineNum = 1412;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 17;BA.debugLine="Public emp5 As Spinner";
_emp5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Public emp6 As Spinner";
_emp6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label11 As Label";
_label11 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Label12 As Label";
_label12 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Label14 As Label";
_label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private Label15 As Label";
_label15 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private Label16 As Label";
_label16 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private Label17 As Label";
_label17 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label18 As Label";
_label18 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Label19 As Label";
_label19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label20 As Label";
_label20 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label21 As Label";
_label21 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private Label22 As Label";
_label22 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private Label23 As Label";
_label23 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private Label24 As Label";
_label24 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private Label25 As Label";
_label25 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Label26 As Label";
_label26 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private Label27 As Label";
_label27 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private Label28 As Label";
_label28 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private Label29 As Label";
_label29 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private Label30 As Label";
_label30 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Label8 As Label";
_label8 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private Label9 As Label";
_label9 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Public nd1 As EditText";
_nd1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Public nd10 As EditText";
_nd10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Public nd11 As EditText";
_nd11 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Public nd13 As EditText";
_nd13 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Public nd15 As EditText";
_nd15 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Public nd16 As EditText";
_nd16 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Public nd17 As EditText";
_nd17 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Public nd18 As EditText";
_nd18 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Public nd2 As EditText";
_nd2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Public nd3 As EditText";
_nd3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Public nd4 As EditText";
_nd4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Public nd5 As EditText";
_nd5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Public nd6 As EditText";
_nd6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Public nd7 As EditText";
_nd7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Public nd8 As EditText";
_nd8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Public nd9 As EditText";
_nd9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 67;BA.debugLine="Public np1 As EditText";
_np1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Public np10 As EditText";
_np10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Public np2 As EditText";
_np2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Public np3 As EditText";
_np3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Public np4 As EditText";
_np4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 72;BA.debugLine="Public np5 As EditText";
_np5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 73;BA.debugLine="Public np6 As EditText";
_np6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 74;BA.debugLine="Public np7 As EditText";
_np7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 75;BA.debugLine="Public np8 As EditText";
_np8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 76;BA.debugLine="Public np9 As EditText";
_np9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 77;BA.debugLine="Public otros As EditText";
_otros = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 78;BA.debugLine="Public otros2 As EditText";
_otros2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 79;BA.debugLine="Public pd1 As EditText";
_pd1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Public pd10 As EditText";
_pd10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Public pd11 As EditText";
_pd11 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 82;BA.debugLine="Public pd13 As EditText";
_pd13 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 83;BA.debugLine="Public pd14 As EditText";
_pd14 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 84;BA.debugLine="Public pd15 As EditText";
_pd15 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 85;BA.debugLine="Public pd16 As EditText";
_pd16 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 86;BA.debugLine="Public pd2 As EditText";
_pd2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 87;BA.debugLine="Public pd3 As EditText";
_pd3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 88;BA.debugLine="Public pd4 As EditText";
_pd4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 89;BA.debugLine="Public pd5 As EditText";
_pd5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Public pd6 As EditText";
_pd6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Public pd7 As EditText";
_pd7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 92;BA.debugLine="Public pd8 As EditText";
_pd8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 93;BA.debugLine="Public pd18 As EditText";
_pd18 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 94;BA.debugLine="Public pd17 As EditText";
_pd17 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 95;BA.debugLine="Public pd9 As EditText";
_pd9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 96;BA.debugLine="Public pp1 As EditText";
_pp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 97;BA.debugLine="Public pp10 As EditText";
_pp10 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 98;BA.debugLine="Public pp2 As EditText";
_pp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 99;BA.debugLine="Public pp3 As EditText";
_pp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 100;BA.debugLine="Public pp4 As EditText";
_pp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 101;BA.debugLine="Public pp5 As EditText";
_pp5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 102;BA.debugLine="Public pp6 As EditText";
_pp6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Public pp7 As EditText";
_pp7 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 104;BA.debugLine="Public pp8 As EditText";
_pp8 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Public pp9 As EditText";
_pp9 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Public nd12 As EditText";
_nd12 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Public nd14 As EditText";
_nd14 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 108;BA.debugLine="Public pd12 As EditText";
_pd12 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Private defec As String";
_defec = "";
 //BA.debugLineNum = 110;BA.debugLine="Private defec2 As String";
_defec2 = "";
 //BA.debugLineNum = 113;BA.debugLine="Public emp1 As Spinner";
_emp1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Public emp2 As Spinner";
_emp2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 115;BA.debugLine="Public emp3 As Spinner";
_emp3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 116;BA.debugLine="Public emp4 As Spinner";
_emp4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 117;BA.debugLine="Public emp5 As Spinner";
_emp5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 118;BA.debugLine="Public emp6 As Spinner";
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
 //BA.debugLineNum = 126;BA.debugLine="Public emp1 As Spinner";
_emp1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Public emp2 As Spinner";
_emp2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Public emp3 As Spinner";
_emp3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Public emp4 As Spinner";
_emp4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 130;BA.debugLine="Public emp5 As Spinner";
_emp5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 131;BA.debugLine="Public emp6 As Spinner";
_emp6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 133;BA.debugLine="Public pallet1 As EditText";
_pallet1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 134;BA.debugLine="Public pallet2 As EditText";
_pallet2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 135;BA.debugLine="Public pallet3 As EditText";
_pallet3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 136;BA.debugLine="Public pallet4 As EditText";
_pallet4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 137;BA.debugLine="Public pallet5 As EditText";
_pallet5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 138;BA.debugLine="Public pallet6 As EditText";
_pallet6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 139;BA.debugLine="Public temp1 As EditText";
_temp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 140;BA.debugLine="Public temp2 As EditText";
_temp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 141;BA.debugLine="Public temp3 As EditText";
_temp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 142;BA.debugLine="Public temp4 As EditText";
_temp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 143;BA.debugLine="Public temp5 As EditText";
_temp5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 144;BA.debugLine="Public temp6 As EditText";
_temp6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 145;BA.debugLine="Public promedio1 As EditText";
_promedio1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 146;BA.debugLine="Public promedio2 As EditText";
_promedio2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 147;BA.debugLine="Public promedio3 As EditText";
_promedio3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 148;BA.debugLine="Public promedio4 As EditText";
_promedio4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 149;BA.debugLine="Public promedio5 As EditText";
_promedio5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Public promedio6 As EditText";
_promedio6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 151;BA.debugLine="Public max1 As EditText";
_max1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 152;BA.debugLine="Public max2 As EditText";
_max2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 153;BA.debugLine="Public max3 As EditText";
_max3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Public max4 As EditText";
_max4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 155;BA.debugLine="Public max5 As EditText";
_max5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 156;BA.debugLine="Public max6 As EditText";
_max6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 157;BA.debugLine="Public min1 As EditText";
_min1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 158;BA.debugLine="Public min2 As EditText";
_min2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 159;BA.debugLine="Public min3 As EditText";
_min3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 160;BA.debugLine="Public min4 As EditText";
_min4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 161;BA.debugLine="Public min5 As EditText";
_min5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 162;BA.debugLine="Public min6 As EditText";
_min6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 163;BA.debugLine="Public plu1 As EditText";
_plu1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 164;BA.debugLine="Public plu2 As EditText";
_plu2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 165;BA.debugLine="Public plu3 As EditText";
_plu3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 166;BA.debugLine="Public plu4 As EditText";
_plu4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 167;BA.debugLine="Public plu5 As EditText";
_plu5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 168;BA.debugLine="Public plu6 As EditText";
_plu6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 171;BA.debugLine="Public var1 As EditText";
_var1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 172;BA.debugLine="Public var2 As EditText";
_var2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 173;BA.debugLine="Public var3 As EditText";
_var3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 174;BA.debugLine="Public var4 As EditText";
_var4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 175;BA.debugLine="Public var5 As EditText";
_var5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 176;BA.debugLine="Public var6 As EditText";
_var6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 178;BA.debugLine="Public marca1 As Spinner";
_marca1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 179;BA.debugLine="Public marca2 As Spinner";
_marca2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 180;BA.debugLine="Public marca3 As Spinner";
_marca3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 181;BA.debugLine="Public marca4 As Spinner";
_marca4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 182;BA.debugLine="Public marca5 As Spinner";
_marca5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 183;BA.debugLine="Public marca6 As Spinner";
_marca6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 185;BA.debugLine="Public env1 As EditText";
_env1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 186;BA.debugLine="Public env2 As EditText";
_env2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 187;BA.debugLine="Public env3 As EditText";
_env3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 188;BA.debugLine="Public env4 As EditText";
_env4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 189;BA.debugLine="Public env5 As EditText";
_env5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 190;BA.debugLine="Public env6 As EditText";
_env6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 192;BA.debugLine="Public calidad1 As Spinner";
_calidad1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 193;BA.debugLine="Public calidad2 As Spinner";
_calidad2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 194;BA.debugLine="Public calidad3 As Spinner";
_calidad3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 195;BA.debugLine="Public calidad4 As Spinner";
_calidad4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 196;BA.debugLine="Public calidad5 As Spinner";
_calidad5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 197;BA.debugLine="Public calidad6 As Spinner";
_calidad6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 199;BA.debugLine="Public sello1 As EditText";
_sello1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 200;BA.debugLine="Public sello2 As EditText";
_sello2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 201;BA.debugLine="Public sello3 As EditText";
_sello3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Public sello4 As EditText";
_sello4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 203;BA.debugLine="Public sello5 As EditText";
_sello5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 204;BA.debugLine="Public sello6 As EditText";
_sello6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 206;BA.debugLine="Public date1 As Button";
_date1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 207;BA.debugLine="Public date2 As Button";
_date2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 208;BA.debugLine="Public date3 As Button";
_date3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 209;BA.debugLine="Public date4 As Button";
_date4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 210;BA.debugLine="Public date5 As Button";
_date5 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 211;BA.debugLine="Public date6 As Button";
_date6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 213;BA.debugLine="Public peso1 As EditText";
_peso1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 214;BA.debugLine="Public peso2 As EditText";
_peso2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 215;BA.debugLine="Public peso3 As EditText";
_peso3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 216;BA.debugLine="Public peso4 As EditText";
_peso4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 218;BA.debugLine="Public peso5 As EditText";
_peso5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 219;BA.debugLine="Public peso6 As EditText";
_peso6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 221;BA.debugLine="Public apariencia1 As Spinner";
_apariencia1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 222;BA.debugLine="Public apariencia2 As Spinner";
_apariencia2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 223;BA.debugLine="Public apariencia3 As Spinner";
_apariencia3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 224;BA.debugLine="Public apariencia4 As Spinner";
_apariencia4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 225;BA.debugLine="Public apariencia5 As Spinner";
_apariencia5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 226;BA.debugLine="Public apariencia6 As Spinner";
_apariencia6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 228;BA.debugLine="Public color1 As EditText";
_color1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 229;BA.debugLine="Public color2 As EditText";
_color2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 230;BA.debugLine="Public color3 As EditText";
_color3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 231;BA.debugLine="Public color4 As EditText";
_color4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 233;BA.debugLine="Public color5 As EditText";
_color5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 234;BA.debugLine="Public color6 As EditText";
_color6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 236;BA.debugLine="Public bitter3 As EditText";
_bitter3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 237;BA.debugLine="Public bitter4 As EditText";
_bitter4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 238;BA.debugLine="Public bitter1 As EditText";
_bitter1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 239;BA.debugLine="Public bitter2 As EditText";
_bitter2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 240;BA.debugLine="Public bitter5 As EditText";
_bitter5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 241;BA.debugLine="Public bitter6 As EditText";
_bitter6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 243;BA.debugLine="Public manchas1 As EditText";
_manchas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 244;BA.debugLine="Public manchas2 As EditText";
_manchas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 245;BA.debugLine="Public manchas3 As EditText";
_manchas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 246;BA.debugLine="Public manchas4 As EditText";
_manchas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 247;BA.debugLine="Public manchas5 As EditText";
_manchas5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 248;BA.debugLine="Public manchas6 As EditText";
_manchas6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 250;BA.debugLine="Public asoleado1 As EditText";
_asoleado1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 251;BA.debugLine="Public asoleado2 As EditText";
_asoleado2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 252;BA.debugLine="Public asoleado3 As EditText";
_asoleado3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 253;BA.debugLine="Public asoleado4 As EditText";
_asoleado4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 255;BA.debugLine="Public asoleado5 As EditText";
_asoleado5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 256;BA.debugLine="Public asoleado6 As EditText";
_asoleado6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 258;BA.debugLine="Public heridas1 As EditText";
_heridas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 259;BA.debugLine="Public heridas2 As EditText";
_heridas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 260;BA.debugLine="Public heridas3 As EditText";
_heridas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 261;BA.debugLine="Public heridas4 As EditText";
_heridas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 262;BA.debugLine="Public heridas5 As EditText";
_heridas5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 263;BA.debugLine="Public heridas6 As EditText";
_heridas6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 265;BA.debugLine="Public total1 As EditText";
_total1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 266;BA.debugLine="Public total2 As EditText";
_total2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 267;BA.debugLine="Public total3 As EditText";
_total3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 268;BA.debugLine="Public total4 As EditText";
_total4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 269;BA.debugLine="Public total5 As EditText";
_total5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 270;BA.debugLine="Public total6 As EditText";
_total6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 271;BA.debugLine="Public calidinterna3 As Spinner";
_calidinterna3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 272;BA.debugLine="Public calidinterno4 As  Spinner";
_calidinterno4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 273;BA.debugLine="Public calidinterna1 As  Spinner";
_calidinterna1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 274;BA.debugLine="Public calidinterna2 As  Spinner";
_calidinterna2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 276;BA.debugLine="Public calidinterna5 As  Spinner";
_calidinterna5 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 277;BA.debugLine="Public calidinterna6 As  Spinner";
_calidinterna6 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 286;BA.debugLine="Public var1 As EditText";
_var1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 287;BA.debugLine="Public var2 As EditText";
_var2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 288;BA.debugLine="Public var3 As EditText";
_var3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 289;BA.debugLine="Public var4 As EditText";
_var4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 291;BA.debugLine="Public marca1 As Spinner";
_marca1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 292;BA.debugLine="Public marca2 As Spinner";
_marca2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 293;BA.debugLine="Public marca3 As Spinner";
_marca3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 294;BA.debugLine="Public marca4 As Spinner";
_marca4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 296;BA.debugLine="Public env1 As EditText";
_env1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 297;BA.debugLine="Public env2 As EditText";
_env2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 298;BA.debugLine="Public env3 As EditText";
_env3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 299;BA.debugLine="Public env4 As EditText";
_env4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 301;BA.debugLine="Public calidad1 As Spinner";
_calidad1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 302;BA.debugLine="Public calidad2 As Spinner";
_calidad2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 303;BA.debugLine="Public calidad3 As Spinner";
_calidad3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 304;BA.debugLine="Public calidad4 As Spinner";
_calidad4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 306;BA.debugLine="Public sello1 As EditText";
_sello1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 307;BA.debugLine="Public sello2 As EditText";
_sello2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 308;BA.debugLine="Public sello3 As EditText";
_sello3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 309;BA.debugLine="Public sello4 As EditText";
_sello4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 311;BA.debugLine="Public date1 As Button";
_date1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 312;BA.debugLine="Public date2 As Button";
_date2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 313;BA.debugLine="Public date3 As Button";
_date3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 314;BA.debugLine="Public date4 As Button";
_date4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 316;BA.debugLine="Public peso1 As EditText";
_peso1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 317;BA.debugLine="Public peso2 As EditText";
_peso2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 318;BA.debugLine="Public peso3 As EditText";
_peso3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 319;BA.debugLine="Public peso4 As EditText";
_peso4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 321;BA.debugLine="Public apariencia1 As Spinner";
_apariencia1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 322;BA.debugLine="Public apariencia2 As Spinner";
_apariencia2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 323;BA.debugLine="Public apariencia3 As Spinner";
_apariencia3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 324;BA.debugLine="Public apariencia4 As Spinner";
_apariencia4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 326;BA.debugLine="Public color1 As EditText";
_color1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 327;BA.debugLine="Public color2 As EditText";
_color2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 328;BA.debugLine="Public color3 As EditText";
_color3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 329;BA.debugLine="Public color4 As EditText";
_color4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 331;BA.debugLine="Public temp1 As EditText";
_temp1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 332;BA.debugLine="Public temp2 As EditText";
_temp2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 333;BA.debugLine="Public temp3 As EditText";
_temp3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 334;BA.debugLine="Public temp4 As EditText";
_temp4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 336;BA.debugLine="Public promedio1 As EditText";
_promedio1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 337;BA.debugLine="Public promedio2 As EditText";
_promedio2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 338;BA.debugLine="Public promedio3 As EditText";
_promedio3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 339;BA.debugLine="Public promedio4 As EditText";
_promedio4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 341;BA.debugLine="Public max1 As EditText";
_max1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 342;BA.debugLine="Public max2 As EditText";
_max2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 343;BA.debugLine="Public max3 As EditText";
_max3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 344;BA.debugLine="Public max4 As EditText";
_max4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 346;BA.debugLine="Public min1 As EditText";
_min1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 347;BA.debugLine="Public min2 As EditText";
_min2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 348;BA.debugLine="Public min3 As EditText";
_min3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 349;BA.debugLine="Public min4 As EditText";
_min4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 353;BA.debugLine="Public bitter3 As EditText";
_bitter3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 354;BA.debugLine="Public bitter4 As EditText";
_bitter4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 355;BA.debugLine="Public bitter1 As EditText";
_bitter1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 356;BA.debugLine="Public bitter2 As EditText";
_bitter2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 358;BA.debugLine="Public manchas1 As EditText";
_manchas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 359;BA.debugLine="Public manchas2 As EditText";
_manchas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 360;BA.debugLine="Public manchas3 As EditText";
_manchas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 361;BA.debugLine="Public manchas4 As EditText";
_manchas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 363;BA.debugLine="Public asoleado1 As EditText";
_asoleado1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 364;BA.debugLine="Public asoleado2 As EditText";
_asoleado2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 365;BA.debugLine="Public asoleado3 As EditText";
_asoleado3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 366;BA.debugLine="Public asoleado4 As EditText";
_asoleado4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 368;BA.debugLine="Public heridas1 As EditText";
_heridas1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 369;BA.debugLine="Public heridas2 As EditText";
_heridas2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 370;BA.debugLine="Public heridas3 As EditText";
_heridas3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 371;BA.debugLine="Public heridas4 As EditText";
_heridas4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 373;BA.debugLine="Public total1 As EditText";
_total1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 374;BA.debugLine="Public total2 As EditText";
_total2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 375;BA.debugLine="Public total3 As EditText";
_total3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 376;BA.debugLine="Public total4 As EditText";
_total4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 378;BA.debugLine="Public calidinterna3 As Spinner";
_calidinterna3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 379;BA.debugLine="Public calidinterno4 As  Spinner";
_calidinterno4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 380;BA.debugLine="Public calidinterna1 As  Spinner";
_calidinterna1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 381;BA.debugLine="Public calidinterna2 As  Spinner";
_calidinterna2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 383;BA.debugLine="Public calidadinterna3 As Spinner";
_calidadinterna3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 384;BA.debugLine="Public calidadinterna4 As  Spinner";
_calidadinterna4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 385;BA.debugLine="Public calidadinterna1 As  Spinner";
_calidadinterna1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 386;BA.debugLine="Public calidadinterna2 As  Spinner";
_calidadinterna2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 388;BA.debugLine="Public max5 As EditText";
_max5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 389;BA.debugLine="Public max6 As EditText";
_max6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 390;BA.debugLine="Public min5 As EditText";
_min5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 391;BA.debugLine="Public min6 As EditText";
_min6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 392;BA.debugLine="Public pallet5 As EditText";
_pallet5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 393;BA.debugLine="Public pallet6 As EditText";
_pallet6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 394;BA.debugLine="Public plu1 As EditText";
_plu1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 395;BA.debugLine="Public plu2 As EditText";
_plu2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 396;BA.debugLine="Public plu3 As EditText";
_plu3 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 397;BA.debugLine="Public plu4 As EditText";
_plu4 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 398;BA.debugLine="Public plu5 As EditText";
_plu5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 399;BA.debugLine="Public plu6 As EditText";
_plu6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 400;BA.debugLine="Public promedio5 As EditText";
_promedio5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 401;BA.debugLine="Public promedio6 As EditText";
_promedio6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 402;BA.debugLine="Public temp5 As EditText";
_temp5 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 403;BA.debugLine="Public temp6 As EditText";
_temp6 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 410;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 411;BA.debugLine="Private Button3 As Button";
_button3 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 412;BA.debugLine="Private Button4 As Button";
_button4 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 413;BA.debugLine="Private Button6 As Button";
_button6 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 421;BA.debugLine="Private Label13 As Label";
_label13 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 422;BA.debugLine="Private Label32 As Label";
_label32 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 423;BA.debugLine="Private Label33 As Label";
_label33 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 424;BA.debugLine="Private Label37 As Label";
_label37 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 425;BA.debugLine="Private Label38 As Label";
_label38 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 426;BA.debugLine="Private Label39 As Label";
_label39 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 427;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 428;BA.debugLine="Private Label40 As Label";
_label40 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 429;BA.debugLine="Private Label41 As Label";
_label41 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 430;BA.debugLine="Private Label42 As Label";
_label42 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 431;BA.debugLine="Private Label43 As Label";
_label43 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 432;BA.debugLine="Private Label44 As Label";
_label44 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 433;BA.debugLine="Private Label45 As Label";
_label45 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 434;BA.debugLine="Private Label46 As Label";
_label46 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 435;BA.debugLine="Private Label47 As Label";
_label47 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 436;BA.debugLine="Private Label48 As Label";
_label48 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 437;BA.debugLine="Private Label49 As Label";
_label49 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 438;BA.debugLine="Private Label50 As Label";
_label50 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 439;BA.debugLine="Private Label51 As Label";
_label51 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 440;BA.debugLine="Private Label52 As Label";
_label52 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 441;BA.debugLine="Private Label53 As Label";
_label53 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 442;BA.debugLine="Private Label54 As Label";
_label54 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 443;BA.debugLine="Private Label55 As Label";
_label55 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 444;BA.debugLine="Private Label56 As Label";
_label56 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 445;BA.debugLine="Private Label57 As Label";
_label57 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 446;BA.debugLine="Private Label58 As Label";
_label58 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 447;BA.debugLine="Private Label59 As Label";
_label59 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 448;BA.debugLine="Private Label60 As Label";
_label60 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 449;BA.debugLine="Private Label61 As Label";
_label61 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 450;BA.debugLine="Private Label62 As Label";
_label62 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 451;BA.debugLine="Private Label63 As Label";
_label63 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 452;BA.debugLine="Private Label64 As Label";
_label64 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 453;BA.debugLine="Private Label65 As Label";
_label65 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 454;BA.debugLine="Private Label66 As Label";
_label66 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 455;BA.debugLine="Private Label67 As Label";
_label67 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 456;BA.debugLine="Private Label68 As Label";
_label68 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 457;BA.debugLine="Private Label69 As Label";
_label69 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 458;BA.debugLine="Private Label70 As Label";
_label70 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 459;BA.debugLine="Private Label71 As Label";
_label71 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 460;BA.debugLine="Private Label72 As Label";
_label72 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 461;BA.debugLine="Private Label73 As Label";
_label73 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 462;BA.debugLine="Private Label74 As Label";
_label74 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 463;BA.debugLine="Private Label75 As Label";
_label75 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 464;BA.debugLine="Private Label76 As Label";
_label76 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 465;BA.debugLine="Private Label77 As Label";
_label77 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 466;BA.debugLine="Private Label78 As Label";
_label78 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 467;BA.debugLine="Private Label79 As Label";
_label79 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 468;BA.debugLine="Private Label80 As Label";
_label80 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 471;BA.debugLine="Private Label83 As Label";
_label83 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 472;BA.debugLine="Private Label84 As Label";
_label84 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 473;BA.debugLine="Private Label85 As Label";
_label85 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 474;BA.debugLine="Private Label86 As Label";
_label86 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 475;BA.debugLine="Private Label87 As Label";
_label87 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 476;BA.debugLine="Private Label88 As Label";
_label88 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 477;BA.debugLine="Private Label89 As Label";
_label89 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 478;BA.debugLine="Private Label90 As Label";
_label90 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 479;BA.debugLine="Private lbl19 As Label";
_lbl19 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 481;BA.debugLine="Private Label92 As Label";
_label92 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 482;BA.debugLine="Private Label93 As Label";
_label93 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 483;BA.debugLine="Private Label94 As Label";
_label94 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 484;BA.debugLine="Private Label95 As Label";
_label95 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 485;BA.debugLine="Private Label96 As Label";
_label96 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 486;BA.debugLine="Private lblPage1Title As Label";
_lblpage1title = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 491;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return "";
}
public String  _color1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 759;BA.debugLine="Sub color1_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 760;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 761;BA.debugLine="color1.Text = Old";
_color1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return "";
}
public String  _color2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 765;BA.debugLine="Sub color2_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 766;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 767;BA.debugLine="color2.Text = Old";
_color2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return "";
}
public String  _color3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 771;BA.debugLine="Sub color3_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 772;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 773;BA.debugLine="color3.Text = Old";
_color3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return "";
}
public String  _color4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Sub color4_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 778;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 779;BA.debugLine="color4.Text = Old";
_color4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 781;BA.debugLine="End Sub";
return "";
}
public String  _color5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 783;BA.debugLine="Sub color5_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 784;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 785;BA.debugLine="color5.Text = Old";
_color5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 787;BA.debugLine="End Sub";
return "";
}
public String  _color6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 789;BA.debugLine="Sub color6_TextChanged (Old As String, New As Stri";
 //BA.debugLineNum = 790;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 791;BA.debugLine="color6.Text = Old";
_color6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public String  _date1_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1162;BA.debugLine="Sub date1_Click 'libreria dialogs2";
 //BA.debugLineNum = 1163;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1164;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1165;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1166;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1168;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1170;BA.debugLine="sello1.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello1.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1174;BA.debugLine="End Sub";
return "";
}
public String  _date2_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1175;BA.debugLine="Sub date2_Click 'libreria dialogs2";
 //BA.debugLineNum = 1176;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1177;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1178;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1179;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1181;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1183;BA.debugLine="sello2.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello2.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1187;BA.debugLine="End Sub";
return "";
}
public String  _date3_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1188;BA.debugLine="Sub date3_Click 'libreria dialogs2";
 //BA.debugLineNum = 1189;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1190;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1191;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1192;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1194;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1196;BA.debugLine="sello3.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello3.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1200;BA.debugLine="End Sub";
return "";
}
public String  _date4_click() throws Exception{
anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _dd = null;
int _ret = 0;
 //BA.debugLineNum = 1201;BA.debugLine="Sub date4_Click 'libreria dialogs2";
 //BA.debugLineNum = 1202;BA.debugLine="Dim Dd As DateDialog";
_dd = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 1203;BA.debugLine="Dd.Year = DateTime.GetYear(DateTime.Now)";
_dd.setYear(__c.DateTime.GetYear(__c.DateTime.getNow()));
 //BA.debugLineNum = 1204;BA.debugLine="Dd.Month = DateTime.GetMonth(DateTime.Now)";
_dd.setMonth(__c.DateTime.GetMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1205;BA.debugLine="Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.N";
_dd.setDayOfMonth(__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 1207;BA.debugLine="Dim ret As Int = Dd.Show(\"Fecha\", \"\", \"Yes\", \"\",";
_ret = _dd.Show("Fecha","","Yes","","",ba,(android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 1209;BA.debugLine="sello4.Text=Dd.DayOfMonth & \"/\" & Dd.Month' & \"/\"";
_sello4.setText(BA.ObjectToCharSequence(BA.NumberToString(_dd.getDayOfMonth())+"/"+BA.NumberToString(_dd.getMonth())));
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
return "";
}
public String  _env1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 724;BA.debugLine="Sub env1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 725;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 726;BA.debugLine="env1.Text = Old";
_env1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
return "";
}
public String  _env2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Sub env2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 731;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 732;BA.debugLine="env2.Text = Old";
_env2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 734;BA.debugLine="End Sub";
return "";
}
public String  _env3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 736;BA.debugLine="Sub env3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 737;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 738;BA.debugLine="env3.Text = Old";
_env3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return "";
}
public String  _env4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Sub env4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 743;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 744;BA.debugLine="env4.Text = Old";
_env4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 746;BA.debugLine="End Sub";
return "";
}
public String  _env5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 747;BA.debugLine="Sub env5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 748;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 749;BA.debugLine="env5.Text = Old";
_env5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 751;BA.debugLine="End Sub";
return "";
}
public String  _env6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 753;BA.debugLine="Sub env6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 754;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 755;BA.debugLine="env6.Text = Old";
_env6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return "";
}
public String  _heridas_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 952;BA.debugLine="Sub heridas_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 953;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 954;BA.debugLine="heridas1.Text = Old";
_heridas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 956;BA.debugLine="End Sub";
return "";
}
public String  _heridas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 974;BA.debugLine="Sub heridas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 975;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 976;BA.debugLine="heridas2.Text = Old";
_heridas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 978;BA.debugLine="End Sub";
return "";
}
public String  _heridas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 998;BA.debugLine="Sub heridas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 999;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1000;BA.debugLine="heridas3.Text = Old";
_heridas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1002;BA.debugLine="End Sub";
return "";
}
public String  _heridas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1024;BA.debugLine="Sub heridas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1025;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1026;BA.debugLine="heridas4.Text = Old";
_heridas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1028;BA.debugLine="End Sub";
return "";
}
public String  _heridas5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1049;BA.debugLine="Sub heridas5_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1050;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1051;BA.debugLine="heridas5.Text = Old";
_heridas5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return "";
}
public String  _heridas6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1072;BA.debugLine="Sub heridas6_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1073;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1074;BA.debugLine="heridas6.Text = Old";
_heridas6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 496;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public String  _manchas1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 941;BA.debugLine="Sub manchas1_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 942;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 943;BA.debugLine="manchas1.Text = Old";
_manchas1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 945;BA.debugLine="End Sub";
return "";
}
public String  _manchas2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 963;BA.debugLine="Sub manchas2_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 964;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 965;BA.debugLine="manchas2.Text = Old";
_manchas2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return "";
}
public String  _manchas3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 987;BA.debugLine="Sub manchas3_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 988;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 989;BA.debugLine="manchas3.Text = Old";
_manchas3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 991;BA.debugLine="End Sub";
return "";
}
public String  _manchas4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1013;BA.debugLine="Sub manchas4_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1014;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1015;BA.debugLine="manchas4.Text = Old";
_manchas4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1017;BA.debugLine="End Sub";
return "";
}
public String  _manchas5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1038;BA.debugLine="Sub manchas5_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1039;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1040;BA.debugLine="manchas5.Text = Old";
_manchas5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return "";
}
public String  _manchas6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1061;BA.debugLine="Sub manchas6_TextChanged (Old As String, New As St";
 //BA.debugLineNum = 1062;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 1063;BA.debugLine="manchas6.Text = Old";
_manchas6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1065;BA.debugLine="End Sub";
return "";
}
public String  _max1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 830;BA.debugLine="Sub max1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 831;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 832;BA.debugLine="max1.Text = Old";
_max1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return "";
}
public String  _max2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 848;BA.debugLine="Sub max2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 849;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 850;BA.debugLine="max2.Text = Old";
_max2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return "";
}
public String  _max3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 866;BA.debugLine="Sub max3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 867;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 868;BA.debugLine="max3.Text = Old";
_max3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 870;BA.debugLine="End Sub";
return "";
}
public String  _max4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 889;BA.debugLine="Sub max4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 890;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 891;BA.debugLine="max4.Text = Old";
_max4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 893;BA.debugLine="End Sub";
return "";
}
public String  _max5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 906;BA.debugLine="Sub max5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 907;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 908;BA.debugLine="max5.Text = Old";
_max5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return "";
}
public String  _max6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 923;BA.debugLine="Sub max6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 924;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 925;BA.debugLine="max6.Text = Old";
_max6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 927;BA.debugLine="End Sub";
return "";
}
public String  _min1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 836;BA.debugLine="Sub min1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 837;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 838;BA.debugLine="min1.Text = Old";
_min1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return "";
}
public String  _min2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 854;BA.debugLine="Sub min2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 855;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 856;BA.debugLine="min2.Text = Old";
_min2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 858;BA.debugLine="End Sub";
return "";
}
public String  _min3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 872;BA.debugLine="Sub min3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 873;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 874;BA.debugLine="min3.Text = Old";
_min3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return "";
}
public String  _min4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 883;BA.debugLine="Sub min4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 884;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 885;BA.debugLine="min4.Text = Old";
_min4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return "";
}
public String  _min5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 900;BA.debugLine="Sub min5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 901;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 902;BA.debugLine="min5.Text = Old";
_min5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public String  _min6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 917;BA.debugLine="Sub min6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 918;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 919;BA.debugLine="min6.Text = Old";
_min6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 921;BA.debugLine="End Sub";
return "";
}
public String  _pallet1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1121;BA.debugLine="Sub pallet1_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1122;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1123;BA.debugLine="pallet1.Text = Old";
_pallet1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1125;BA.debugLine="End Sub";
return "";
}
public String  _pallet2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1127;BA.debugLine="Sub pallet2_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1128;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1129;BA.debugLine="pallet2.Text = Old";
_pallet2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1131;BA.debugLine="End Sub";
return "";
}
public String  _pallet3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1132;BA.debugLine="Sub pallet3_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1133;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1134;BA.debugLine="pallet3.Text = Old";
_pallet3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1136;BA.debugLine="End Sub";
return "";
}
public String  _pallet4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1138;BA.debugLine="Sub pallet4_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1139;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1140;BA.debugLine="pallet4.Text = Old";
_pallet4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1142;BA.debugLine="End Sub";
return "";
}
public String  _pallet5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1143;BA.debugLine="Sub pallet5_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1144;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1145;BA.debugLine="pallet5.Text = Old";
_pallet5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1147;BA.debugLine="End Sub";
return "";
}
public String  _pallet6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1149;BA.debugLine="Sub pallet6_TextChanged (Old As String, New As Str";
 //BA.debugLineNum = 1150;BA.debugLine="If New.Length > 6 Then";
if (_new.length()>6) { 
 //BA.debugLineNum = 1151;BA.debugLine="pallet6.Text = Old";
_pallet6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1153;BA.debugLine="End Sub";
return "";
}
public String  _peso1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub peso1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 659;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 660;BA.debugLine="peso1.Text = Old";
_peso1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 662;BA.debugLine="End Sub";
return "";
}
public String  _peso2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 663;BA.debugLine="Sub peso2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 664;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 665;BA.debugLine="peso2.Text = Old";
_peso2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return "";
}
public String  _peso3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 668;BA.debugLine="Sub peso3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 669;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 670;BA.debugLine="peso3.Text = Old";
_peso3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 672;BA.debugLine="End Sub";
return "";
}
public String  _peso4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 673;BA.debugLine="Sub peso4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 674;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 675;BA.debugLine="peso4.Text = Old";
_peso4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 677;BA.debugLine="End Sub";
return "";
}
public String  _peso5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 678;BA.debugLine="Sub peso5_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 679;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 680;BA.debugLine="peso5.Text = Old";
_peso5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 682;BA.debugLine="End Sub";
return "";
}
public String  _peso6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 683;BA.debugLine="Sub peso6_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 684;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 685;BA.debugLine="peso6.Text = Old";
_peso6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public String  _plu1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Sub plu1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 689;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 690;BA.debugLine="plu1.Text = Old";
_plu1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return "";
}
public String  _plu2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 694;BA.debugLine="Sub plu2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 695;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 696;BA.debugLine="plu2.Text = Old";
_plu2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 698;BA.debugLine="End Sub";
return "";
}
public String  _plu3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 700;BA.debugLine="Sub plu3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 701;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 702;BA.debugLine="plu3.Text = Old";
_plu3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
return "";
}
public String  _plu4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 706;BA.debugLine="Sub plu4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 707;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 708;BA.debugLine="plu4.Text = Old";
_plu4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return "";
}
public String  _plu5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 712;BA.debugLine="Sub plu5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 713;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 714;BA.debugLine="plu5.Text = Old";
_plu5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 716;BA.debugLine="End Sub";
return "";
}
public String  _plu6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 718;BA.debugLine="Sub plu6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 719;BA.debugLine="If New.Length > 3 Then";
if (_new.length()>3) { 
 //BA.debugLineNum = 720;BA.debugLine="plu6.Text = Old";
_plu6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 722;BA.debugLine="End Sub";
return "";
}
public String  _promedio1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 824;BA.debugLine="Sub promedio1_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 825;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 826;BA.debugLine="promedio1.Text = Old";
_promedio1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return "";
}
public String  _promedio2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 842;BA.debugLine="Sub promedio2_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 843;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 844;BA.debugLine="promedio2.Text = Old";
_promedio2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 846;BA.debugLine="End Sub";
return "";
}
public String  _promedio3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 860;BA.debugLine="Sub promedio3_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 861;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 862;BA.debugLine="promedio3.Text = Old";
_promedio3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 864;BA.debugLine="End Sub";
return "";
}
public String  _promedio4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 878;BA.debugLine="Sub promedio4_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 879;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 880;BA.debugLine="promedio4.Text = Old";
_promedio4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 882;BA.debugLine="End Sub";
return "";
}
public String  _promedio5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Sub promedio5_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 896;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 897;BA.debugLine="promedio5.Text = Old";
_promedio5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return "";
}
public String  _promedio6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 912;BA.debugLine="Sub promedio6_TextChanged (Old As String, New As S";
 //BA.debugLineNum = 913;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 914;BA.debugLine="promedio6.Text = Old";
_promedio6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 916;BA.debugLine="End Sub";
return "";
}
public String  _temp1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 794;BA.debugLine="Sub temp1_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 795;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 796;BA.debugLine="temp1.Text = Old";
_temp1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return "";
}
public String  _temp2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 799;BA.debugLine="Sub temp2_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 800;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 801;BA.debugLine="temp2.Text = Old";
_temp2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return "";
}
public String  _temp3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 804;BA.debugLine="Sub temp3_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 805;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 806;BA.debugLine="temp3.Text = Old";
_temp3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
return "";
}
public String  _temp4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub temp4_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 810;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 811;BA.debugLine="temp4.Text = Old";
_temp4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return "";
}
public String  _temp5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 814;BA.debugLine="Sub temp5_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 815;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 816;BA.debugLine="temp5.Text = Old";
_temp5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
return "";
}
public String  _temp6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 819;BA.debugLine="Sub temp6_TextChanged (Old As String, New As Strin";
 //BA.debugLineNum = 820;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 821;BA.debugLine="temp6.Text = Old";
_temp6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return "";
}
public String  _total() throws Exception{
 //BA.debugLineNum = 1428;BA.debugLine="Sub total''saca daños parciales y llena caja de te";
 //BA.debugLineNum = 1572;BA.debugLine="total1.text = NumberFormat(bitter1.Text + manchas1";
_total1.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter1.getText()))+(double)(Double.parseDouble(_manchas1.getText()))+(double)(Double.parseDouble(_asoleado1.getText()))+(double)(Double.parseDouble(_heridas1.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1574;BA.debugLine="total2.text = NumberFormat(bitter2.Text + manchas2";
_total2.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter2.getText()))+(double)(Double.parseDouble(_manchas2.getText()))+(double)(Double.parseDouble(_asoleado2.getText()))+(double)(Double.parseDouble(_heridas2.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1575;BA.debugLine="total3.text = NumberFormat(bitter3.Text + manchas3";
_total3.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter3.getText()))+(double)(Double.parseDouble(_manchas3.getText()))+(double)(Double.parseDouble(_asoleado3.getText()))+(double)(Double.parseDouble(_heridas3.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1577;BA.debugLine="total4.text = NumberFormat(bitter4.Text + manchas4";
_total4.setText(BA.ObjectToCharSequence(__c.NumberFormat((double)(Double.parseDouble(_bitter4.getText()))+(double)(Double.parseDouble(_manchas4.getText()))+(double)(Double.parseDouble(_asoleado4.getText()))+(double)(Double.parseDouble(_heridas4.getText())),(int) (0),(int) (2))));
 //BA.debugLineNum = 1586;BA.debugLine="End Sub";
return "";
}
public boolean  _valid() throws Exception{
boolean _a = false;
boolean _b = false;
boolean _c = false;
boolean _d = false;
boolean _e = false;
 //BA.debugLineNum = 632;BA.debugLine="Sub valid As  Boolean ''valida cajas de texto y co";
 //BA.debugLineNum = 633;BA.debugLine="Dim a,b,c,d,e As Boolean";
_a = false;
_b = false;
_c = false;
_d = false;
_e = false;
 //BA.debugLineNum = 634;BA.debugLine="a=False";
_a = __c.False;
 //BA.debugLineNum = 635;BA.debugLine="b=False";
_b = __c.False;
 //BA.debugLineNum = 636;BA.debugLine="c=False";
_c = __c.False;
 //BA.debugLineNum = 637;BA.debugLine="d=False";
_d = __c.False;
 //BA.debugLineNum = 638;BA.debugLine="a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or";
_a = _emp1.getSelectedIndex()==0 || _emp2.getSelectedIndex()==0 || _emp3.getSelectedIndex()==0 || _emp4.getSelectedIndex()==0 || _marca1.getSelectedIndex()==0 || _marca2.getSelectedIndex()==0 || _marca3.getSelectedIndex()==0 || _marca4.getSelectedIndex()==0;
 //BA.debugLineNum = 639;BA.debugLine="b=calidad1.SelectedIndex=0 Or calidad2.SelectedIn";
_b = _calidad1.getSelectedIndex()==0 || _calidad2.getSelectedIndex()==0 || _calidad3.getSelectedIndex()==0 || _calidad4.getSelectedIndex()==0 || _apariencia1.getSelectedIndex()==0 || _apariencia2.getSelectedIndex()==0 || _apariencia3.getSelectedIndex()==0 || _apariencia4.getSelectedIndex()==0;
 //BA.debugLineNum = 641;BA.debugLine="c= pallet1.Text=\"\" Or pallet2.Text=\"\" Or pallet3.";
_c = (_pallet1.getText()).equals("") || (_pallet2.getText()).equals("") || (_pallet3.getText()).equals("") || (_pallet4.getText()).equals("") || (_env1.getText()).equals("") || (_env2.getText()).equals("") || (_env3.getText()).equals("") || (_env4.getText()).equals("") || (_peso1.getText()).equals("") || (_peso2.getText()).equals("") || (_peso3.getText()).equals("") || (_peso4.getText()).equals("");
 //BA.debugLineNum = 642;BA.debugLine="d= color1.Text=\"\" Or color2.Text=\"\" Or color3.Tex";
_d = (_color1.getText()).equals("") || (_color2.getText()).equals("") || (_color3.getText()).equals("") || (_color4.getText()).equals("") || (_temp1.getText()).equals("") || (_temp2.getText()).equals("") || (_temp3.getText()).equals("") || (_temp4.getText()).equals("") || (_var1.getText()).equals("") || (_var2.getText()).equals("") || (_var3.getText()).equals("") || (_var4.getText()).equals("") || (_sello1.getText()).equals("") || (_sello2.getText()).equals("") || (_sello3.getText()).equals("") || (_sello4.getText()).equals("");
 //BA.debugLineNum = 649;BA.debugLine="If a=True Or b= True Or c=True Or d=True Then";
if (_a==__c.True || _b==__c.True || _c==__c.True || _d==__c.True) { 
 //BA.debugLineNum = 650;BA.debugLine="Msgbox(\"Debe completar los datos\",\"ERROR\")";
__c.Msgbox(BA.ObjectToCharSequence("Debe completar los datos"),BA.ObjectToCharSequence("ERROR"),ba);
 //BA.debugLineNum = 651;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 653;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 656;BA.debugLine="End Sub";
return false;
}
public String  _var1_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1082;BA.debugLine="Sub var1_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1083;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1084;BA.debugLine="var1.Text = Old";
_var1.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1086;BA.debugLine="End Sub";
return "";
}
public String  _var2_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1087;BA.debugLine="Sub var2_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1088;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1089;BA.debugLine="var2.Text = Old";
_var2.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1091;BA.debugLine="End Sub";
return "";
}
public String  _var3_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1093;BA.debugLine="Sub var3_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1094;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1095;BA.debugLine="var3.Text = Old";
_var3.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1097;BA.debugLine="End Sub";
return "";
}
public String  _var4_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1098;BA.debugLine="Sub var4_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1099;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1100;BA.debugLine="var4.Text = Old";
_var4.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1102;BA.debugLine="End Sub";
return "";
}
public String  _var5_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1105;BA.debugLine="Sub var5_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1106;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1107;BA.debugLine="var5.Text = Old";
_var5.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1109;BA.debugLine="End Sub";
return "";
}
public String  _var6_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 1110;BA.debugLine="Sub var6_TextChanged (Old As String, New As String";
 //BA.debugLineNum = 1111;BA.debugLine="If New.Length > 4 Then";
if (_new.length()>4) { 
 //BA.debugLineNum = 1112;BA.debugLine="var6.Text = Old";
_var6.setText(BA.ObjectToCharSequence(_old));
 };
 //BA.debugLineNum = 1114;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
