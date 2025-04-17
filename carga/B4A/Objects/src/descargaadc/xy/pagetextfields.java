package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class pagetextfields extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.pagetextfields");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.pagetextfields.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _innerpanel = null;
int _topoffset = 0;
int _i = 0;
anywheresoftware.b4a.objects.EditTextWrapper _txtfield = null;
 //BA.debugLineNum = 13;BA.debugLine="Public Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 14;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 15;BA.debugLine="Root.LoadLayout(\"LayoutPage\") ' Debes crear este";
_root.LoadLayout("LayoutPage",ba);
 //BA.debugLineNum = 18;BA.debugLine="ScrollView1.Initialize(5000dip) ' Altura grande p";
_scrollview1.Initialize(ba,__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 19;BA.debugLine="Root.AddView(ScrollView1, 0, 0, 100%x, 100%y) ' A";
_root.AddView((android.view.View)(_scrollview1.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 22;BA.debugLine="Dim innerPanel As Panel";
_innerpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="innerPanel.Initialize(\"\")";
_innerpanel.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="ScrollView1.Panel.AddView(innerPanel, 0, 0, 100%x";
_scrollview1.getPanel().AddView((android.view.View)(_innerpanel.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (5000)));
 //BA.debugLineNum = 27;BA.debugLine="Dim topOffset As Int = 10dip";
_topoffset = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 28;BA.debugLine="For i = 1 To 100";
{
final int step9 = 1;
final int limit9 = (int) (100);
_i = (int) (1) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 29;BA.debugLine="Dim txtField As EditText";
_txtfield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 30;BA.debugLine="txtField.Initialize(\"txtField\")";
_txtfield.Initialize(ba,"txtField");
 //BA.debugLineNum = 31;BA.debugLine="txtField.Hint = \"Campo \" & i ' Texto de sugerenc";
_txtfield.setHint("Campo "+BA.NumberToString(_i));
 //BA.debugLineNum = 32;BA.debugLine="txtField.TextSize = 16 ' Tamaño de texto";
_txtfield.setTextSize((float) (16));
 //BA.debugLineNum = 33;BA.debugLine="txtField.SingleLine = True";
_txtfield.setSingleLine(__c.True);
 //BA.debugLineNum = 34;BA.debugLine="txtField.Gravity = Gravity.CENTER_VERTICAL + Gra";
_txtfield.setGravity((int) (__c.Gravity.CENTER_VERTICAL+__c.Gravity.LEFT));
 //BA.debugLineNum = 35;BA.debugLine="innerPanel.AddView(txtField, 10dip, topOffset, 9";
_innerpanel.AddView((android.view.View)(_txtfield.getObject()),__c.DipToCurrent((int) (10)),_topoffset,__c.PerXToCurrent((float) (90),ba),__c.DipToCurrent((int) (60)));
 //BA.debugLineNum = 37;BA.debugLine="topOffset = topOffset + 70dip ' Espacio entre ca";
_topoffset = (int) (_topoffset+__c.DipToCurrent((int) (70)));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="innerPanel.Height = topOffset";
_innerpanel.setHeight(_topoffset);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private Root As B4XView ' Contenedor raíz de la p";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private ScrollView1 As ScrollView ' ScrollView pa";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
