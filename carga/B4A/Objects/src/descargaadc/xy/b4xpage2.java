package descargaadc.xy;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpage2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "descargaadc.xy.b4xpage2");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", descargaadc.xy.b4xpage2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public boolean _frontcamera = false;
public boolean _videomode = false;
public String _videofiledir = "";
public String _ftp3 = "";
public String _calidad = "";
public String _videofilename = "";
public int _mytaskindex = 0;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public descargaadc.xy.camex2 _cam = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlcamera = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlbackground = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btneffects = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnscene = null;
public anywheresoftware.b4a.objects.collections.List _buttons = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnautoexposure = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnfocus = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public boolean _openstate = false;
public boolean _busystate = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btnrecord = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncamera = null;
public anywheresoftware.b4a.objects.SeekBarWrapper _barzoom = null;
public descargaadc.xy.b4ximageview _b4ximageview1 = null;
public descargaadc.xy.b4xpage1 _page1 = null;
public descargaadc.xy.b4xpage2 _page2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _nro = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public b4a.example.dateutils _dateutils = null;
public descargaadc.xy.main _main = null;
public descargaadc.xy.starter _starter = null;
public descargaadc.xy.seteos _seteos = null;
public descargaadc.xy.b4xpages _b4xpages = null;
public descargaadc.xy.b4xcollections _b4xcollections = null;
public descargaadc.xy.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub B4XPage_Appear";
 //BA.debugLineNum = 141;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_background() throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub B4XPage_Background 'ignorar";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
double _u = 0;
String _a = "";
 //BA.debugLineNum = 41;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 42;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 43;BA.debugLine="Dim u As Double";
_u = 0;
 //BA.debugLineNum = 44;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 46;BA.debugLine="calidad = rp.GetSafeDirDefaultExternal(\"Calidad\")";
_calidad = _rp.GetSafeDirDefaultExternal("Calidad");
 //BA.debugLineNum = 48;BA.debugLine="Root.LoadLayout(\"1\")";
_root.LoadLayout("1",ba);
 //BA.debugLineNum = 49;BA.debugLine="Root.LoadLayout(\"StillPicture\")";
_root.LoadLayout("StillPicture",ba);
 //BA.debugLineNum = 50;BA.debugLine="VideoFileDir = rp.GetSafeDirDefaultExternal(\"Ftp3";
_videofiledir = _rp.GetSafeDirDefaultExternal("Ftp3");
 //BA.debugLineNum = 51;BA.debugLine="VideoFileName = \"1.mp4\"";
_videofilename = "1.mp4";
 //BA.debugLineNum = 52;BA.debugLine="cam.Initialize(pnlCamera)";
_cam._initialize /*String*/ (ba,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pnlcamera.getObject())));
 //BA.debugLineNum = 53;BA.debugLine="Log(cam.SupportedHardwareLevel)";
__c.LogImpl("88388620",_cam._getsupportedhardwarelevel /*String*/ (),0);
 //BA.debugLineNum = 54;BA.debugLine="buttons = Array(btnScene, btnAutoExposure, btnEff";
_buttons = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_btnscene.getObject()),(Object)(_btnautoexposure.getObject()),(Object)(_btneffects.getObject()),(Object)(_btnfocus.getObject()),(Object)(_btnmode.getObject())});
 //BA.debugLineNum = 55;BA.debugLine="SetState(False, False, VideoMode)";
_setstate(__c.False,__c.False,_videomode);
 //BA.debugLineNum = 57;BA.debugLine="B4XPages.SetTitle(Me, \"Fotos Cargas Pai sa\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("Fotos Cargas Pai sa"));
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.AddMenuItem(Me, \"Info\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Info"));
 //BA.debugLineNum = 60;BA.debugLine="B4XPages.AddMenuItem(Me, \"Camara\")";
_b4xpages._addmenuitem /*descargaadc.xy.b4xpagesmanager._b4amenuitem*/ (ba,this,(Object)("Camara"));
 //BA.debugLineNum = 62;BA.debugLine="u=0";
_u = 0;
 //BA.debugLineNum = 64;BA.debugLine="File.WriteString(calidad ,\"planilla2.txt\",u)";
__c.File.WriteString(_calidad,"planilla2.txt",BA.NumberToString(_u));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_disappear() throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub B4XPage_Disappear";
 //BA.debugLineNum = 152;BA.debugLine="cam.Stop";
_cam._stop /*String*/ ();
 //BA.debugLineNum = 153;BA.debugLine="Log(\"camarastop\")";
__c.LogImpl("88978434","camarastop",0);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_foreground() throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub B4XPage_Foreground 'ignorar";
 //BA.debugLineNum = 145;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_menuclick(String _tag) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub B4XPage_MenuClick (Tag As String)";
 //BA.debugLineNum = 67;BA.debugLine="If Tag = \"Info\" Then";
if ((_tag).equals("Info")) { 
 //BA.debugLineNum = 68;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 71;BA.debugLine="If Tag = \"Daños\" Then";
if ((_tag).equals("Daños")) { 
 //BA.debugLineNum = 72;BA.debugLine="B4XPages.ShowPage(\"Page 1\")";
_b4xpages._showpage /*String*/ (ba,"Page 1");
 };
 //BA.debugLineNum = 74;BA.debugLine="If Tag = \"Camara\" Then";
if ((_tag).equals("Camara")) { 
 //BA.debugLineNum = 75;BA.debugLine="B4XPages.ShowPage(\"Page 2\")";
_b4xpages._showpage /*String*/ (ba,"Page 2");
 };
 //BA.debugLineNum = 77;BA.debugLine="If Tag = \"Terminar\" Then";
if ((_tag).equals("Terminar")) { 
 //BA.debugLineNum = 79;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
 };
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _barzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _originalsize = null;
float _zoom = 0f;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _crop = null;
int _newwidth = 0;
int _newheight = 0;
 //BA.debugLineNum = 328;BA.debugLine="Sub barZoom_ValueChanged (Value As Int, UserChange";
 //BA.debugLineNum = 329;BA.debugLine="Dim OriginalSize As Rect = cam.ActiveArraySize";
_originalsize = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
_originalsize = _cam._getactivearraysize /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper*/ ();
 //BA.debugLineNum = 330;BA.debugLine="Dim Zoom As Float = 1 + Value / 100 * (cam.MaxDig";
_zoom = (float) (1+_value/(double)100*(_cam._getmaxdigitalzoom /*float*/ ()-1));
 //BA.debugLineNum = 331;BA.debugLine="Dim Crop As Rect";
_crop = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 332;BA.debugLine="Dim NewWidth As Int = OriginalSize.Width / Zoom";
_newwidth = (int) (_originalsize.getWidth()/(double)_zoom);
 //BA.debugLineNum = 333;BA.debugLine="Dim NewHeight As Int = OriginalSize.Height / Zoom";
_newheight = (int) (_originalsize.getHeight()/(double)_zoom);
 //BA.debugLineNum = 334;BA.debugLine="Crop.Initialize(OriginalSize.CenterX - NewWidth /";
_crop.Initialize((int) (_originalsize.getCenterX()-_newwidth/(double)2),(int) (_originalsize.getCenterY()-_newheight/(double)2),(int) (_originalsize.getCenterX()+_newwidth/(double)2),(int) (_originalsize.getCenterY()+_newheight/(double)2));
 //BA.debugLineNum = 336;BA.debugLine="cam.PreviewCropRegion = Crop";
_cam._setpreviewcropregion(_crop);
 //BA.debugLineNum = 337;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
_cam._startpreview /*String*/ (_mytaskindex,_videomode);
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public String  _btnautoexposure_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _flashes = null;
int _i = 0;
 //BA.debugLineNum = 283;BA.debugLine="Sub btnAutoExposure_Click";
 //BA.debugLineNum = 284;BA.debugLine="Dim flashes As List = cam.SupportedAutoExposureMo";
_flashes = new anywheresoftware.b4a.objects.collections.List();
_flashes = _cam._getsupportedautoexposuremodes /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 285;BA.debugLine="Dim i As Int = flashes.IndexOf(cam.AutoExposureMo";
_i = _flashes.IndexOf((Object)(_cam._getautoexposuremode /*String*/ ()));
 //BA.debugLineNum = 286;BA.debugLine="i = (i + 1) Mod flashes.Size";
_i = (int) ((_i+1)%_flashes.getSize());
 //BA.debugLineNum = 287;BA.debugLine="cam.AutoExposureMode = flashes.Get(i)";
_cam._setautoexposuremode /*String*/ (BA.ObjectToString(_flashes.Get(_i)));
 //BA.debugLineNum = 288;BA.debugLine="btnAutoExposure.Text = flashes.Get(i)";
_btnautoexposure.setText(BA.ObjectToCharSequence(_flashes.Get(_i)));
 //BA.debugLineNum = 289;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
_cam._startpreview /*String*/ (_mytaskindex,_videomode);
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return "";
}
public String  _btncamera_click() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub btnCamera_Click 'ignorar";
 //BA.debugLineNum = 138;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _btneffects_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _effects = null;
int _i = 0;
 //BA.debugLineNum = 263;BA.debugLine="Sub btnEffects_Click";
 //BA.debugLineNum = 264;BA.debugLine="Dim effects As List = cam.SupportedEffectModes";
_effects = new anywheresoftware.b4a.objects.collections.List();
_effects = _cam._getsupportedeffectmodes /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 265;BA.debugLine="Dim i As Int = effects.IndexOf(cam.EffectMode)";
_i = _effects.IndexOf((Object)(_cam._geteffectmode /*String*/ ()));
 //BA.debugLineNum = 266;BA.debugLine="i = (i + 1) Mod effects.Size";
_i = (int) ((_i+1)%_effects.getSize());
 //BA.debugLineNum = 267;BA.debugLine="cam.EffectMode = effects.Get(i)";
_cam._seteffectmode /*String*/ (BA.ObjectToString(_effects.Get(_i)));
 //BA.debugLineNum = 268;BA.debugLine="btnEffects.Text = effects.Get(i)";
_btneffects.setText(BA.ObjectToCharSequence(_effects.Get(_i)));
 //BA.debugLineNum = 269;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
_cam._startpreview /*String*/ (_mytaskindex,_videomode);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _btnfocus_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _focuses = null;
int _i = 0;
 //BA.debugLineNum = 293;BA.debugLine="Sub btnFocus_Click";
 //BA.debugLineNum = 294;BA.debugLine="Dim focuses As List = cam.SupportedFocusModes";
_focuses = new anywheresoftware.b4a.objects.collections.List();
_focuses = _cam._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 295;BA.debugLine="Dim i As Int = focuses.IndexOf(cam.FocusMode)";
_i = _focuses.IndexOf((Object)(_cam._getfocusmode /*String*/ ()));
 //BA.debugLineNum = 296;BA.debugLine="i = (i + 1) Mod focuses.Size";
_i = (int) ((_i+1)%_focuses.getSize());
 //BA.debugLineNum = 297;BA.debugLine="cam.FocusMode = focuses.Get(i)";
_cam._setfocusmode /*String*/ (BA.ObjectToString(_focuses.Get(_i)));
 //BA.debugLineNum = 298;BA.debugLine="btnFocus.Text = focuses.Get(i)";
_btnfocus.setText(BA.ObjectToCharSequence(_focuses.Get(_i)));
 //BA.debugLineNum = 299;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
_cam._startpreview /*String*/ (_mytaskindex,_videomode);
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return "";
}
public void  _btnmode_click() throws Exception{
ResumableSub_btnMode_Click rsub = new ResumableSub_btnMode_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMode_Click extends BA.ResumableSub {
public ResumableSub_btnMode_Click(descargaadc.xy.b4xpage2 parent) {
this.parent = parent;
}
descargaadc.xy.b4xpage2 parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 159;BA.debugLine="VideoMode = Not(VideoMode)";
parent._videomode = parent.__c.Not(parent._videomode);
 //BA.debugLineNum = 160;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent._videomode) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 161;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_RECORD_AUDIO)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_RECORD_AUDIO);
 //BA.debugLineNum = 162;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 163;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 164;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),parent.__c.True);
 //BA.debugLineNum = 165;BA.debugLine="VideoMode = False";
parent._videomode = parent.__c.False;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 168;BA.debugLine="SetState(openstate, busystate, VideoMode)";
parent._setstate(parent._openstate,parent._busystate,parent._videomode);
 //BA.debugLineNum = 169;BA.debugLine="PrepareSurface";
parent._preparesurface();
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _b4xpage_permissionresult(String _permission,boolean _result) throws Exception{
}
public String  _btnrecord_click() throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Sub btnRecord_Click";
 //BA.debugLineNum = 173;BA.debugLine="If VideoMode Then";
if (_videomode) { 
 //BA.debugLineNum = 174;BA.debugLine="CaptureVideo";
_capturevideo();
 }else {
 //BA.debugLineNum = 176;BA.debugLine="TakePicture";
_takepicture();
 };
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _btnscene_click() throws Exception{
anywheresoftware.b4a.objects.collections.List _scenes = null;
int _i = 0;
 //BA.debugLineNum = 273;BA.debugLine="Sub btnScene_Click";
 //BA.debugLineNum = 274;BA.debugLine="Dim scenes As List = cam.SupportedSceneModes";
_scenes = new anywheresoftware.b4a.objects.collections.List();
_scenes = _cam._getsupportedscenemodes /*anywheresoftware.b4a.objects.collections.List*/ ();
 //BA.debugLineNum = 275;BA.debugLine="Dim i As Int = scenes.IndexOf(cam.SceneMode)";
_i = _scenes.IndexOf((Object)(_cam._getscenemode /*String*/ ()));
 //BA.debugLineNum = 276;BA.debugLine="i = (i + 1) Mod scenes.Size";
_i = (int) ((_i+1)%_scenes.getSize());
 //BA.debugLineNum = 277;BA.debugLine="cam.SceneMode = scenes.Get(i)";
_cam._setscenemode /*String*/ (BA.ObjectToString(_scenes.Get(_i)));
 //BA.debugLineNum = 278;BA.debugLine="btnScene.Text = scenes.Get(i)";
_btnscene.setText(BA.ObjectToCharSequence(_scenes.Get(_i)));
 //BA.debugLineNum = 279;BA.debugLine="cam.StartPreview(MyTaskIndex, VideoMode)";
_cam._startpreview /*String*/ (_mytaskindex,_videomode);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public void  _capturevideo() throws Exception{
ResumableSub_CaptureVideo rsub = new ResumableSub_CaptureVideo(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CaptureVideo extends BA.ResumableSub {
public ResumableSub_CaptureVideo(descargaadc.xy.b4xpage2 parent) {
this.parent = parent;
}
descargaadc.xy.b4xpage2 parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 182;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 183;BA.debugLine="SetState(openstate, True, VideoMode)";
parent._setstate(parent._openstate,parent.__c.True,parent._videomode);
 //BA.debugLineNum = 184;BA.debugLine="If cam.RecordingVideo = False Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._cam._recordingvideo /*boolean*/ ==parent.__c.False) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 185;BA.debugLine="cam.StartVideoRecording (MyTaskIndex)";
parent._cam._startvideorecording /*String*/ (parent._mytaskindex);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 187;BA.debugLine="cam.StopVideoRecording (MyTaskIndex)";
parent._cam._stopvideorecording /*String*/ (parent._mytaskindex);
 //BA.debugLineNum = 188;BA.debugLine="File.Copy(VideoFileDir, \"temp-\" & VideoFileName";
parent.__c.File.Copy(parent._videofiledir,"temp-"+parent._videofilename,parent._videofiledir,parent._videofilename);
 //BA.debugLineNum = 189;BA.debugLine="ToastMessageShow($\"Video file saved: $1.2{File.";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(("Video file saved: "+parent.__c.SmartStringFormatter("1.2",(Object)(parent.__c.File.Size(parent._videofiledir,parent._videofilename)/(double)1024/(double)1024))+" MB")),parent.__c.True);
 //BA.debugLineNum = 190;BA.debugLine="Wait For (PrepareSurface) Complete (Success As";
parent.__c.WaitFor("complete", ba, this, parent._preparesurface());
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 191;BA.debugLine="SetState(openstate, False, VideoMode)";
parent._setstate(parent._openstate,parent.__c.False,parent._videomode);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 //BA.debugLineNum = 195;BA.debugLine="HandleError(LastException)";
parent._handleerror(parent.__c.LastException(ba));
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private frontCamera As Boolean = False";
_frontcamera = __c.False;
 //BA.debugLineNum = 5;BA.debugLine="Private VideoMode As Boolean = False";
_videomode = __c.False;
 //BA.debugLineNum = 6;BA.debugLine="Private VideoFileDir, ftp3,calidad, VideoFileName";
_videofiledir = "";
_ftp3 = "";
_calidad = "";
_videofilename = "";
 //BA.debugLineNum = 7;BA.debugLine="Private MyTaskIndex As Int";
_mytaskindex = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 9;BA.debugLine="Private cam As CamEx2";
_cam = new descargaadc.xy.camex2();
 //BA.debugLineNum = 10;BA.debugLine="Private pnlCamera As B4XView";
_pnlcamera = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private pnlBackground As B4XView";
_pnlbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnEffects As Button";
_btneffects = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private btnScene As Button";
_btnscene = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private buttons As List";
_buttons = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Private btnAutoExposure As Button";
_btnautoexposure = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private btnFocus As Button";
_btnfocus = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private ProgressBar1 As ProgressBar";
_progressbar1 = new anywheresoftware.b4a.objects.ProgressBarWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private openstate, busystate As Boolean";
_openstate = false;
_busystate = false;
 //BA.debugLineNum = 19;BA.debugLine="Private btnRecord As Button";
_btnrecord = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private btnMode As Button";
_btnmode = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private btnCamera As Button";
_btncamera = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private barZoom As SeekBar";
_barzoom = new anywheresoftware.b4a.objects.SeekBarWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private B4XImageView1 As B4XImageView";
_b4ximageview1 = new descargaadc.xy.b4ximageview();
 //BA.debugLineNum = 24;BA.debugLine="Public Page1 As B4XPage1";
_page1 = new descargaadc.xy.b4xpage1();
 //BA.debugLineNum = 25;BA.debugLine="Public Page2 As B4XPage2";
_page2 = new descargaadc.xy.b4xpage2();
 //BA.debugLineNum = 26;BA.debugLine="Public nro As Label";
_nro = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _handleerror(anywheresoftware.b4a.objects.B4AException _error) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub HandleError (Error As Exception)";
 //BA.debugLineNum = 200;BA.debugLine="Log(\"Error: \" & Error)";
__c.LogImpl("89240577","Error: "+BA.ObjectToString(_error),0);
 //BA.debugLineNum = 201;BA.debugLine="ToastMessageShow(Error, True)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_error.getObject()),__c.True);
 //BA.debugLineNum = 202;BA.debugLine="OpenCamera(frontCamera)";
_opencamera(_frontcamera);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public void  _opencamera(boolean _front) throws Exception{
ResumableSub_OpenCamera rsub = new ResumableSub_OpenCamera(this,_front);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenCamera extends BA.ResumableSub {
public ResumableSub_OpenCamera(descargaadc.xy.b4xpage2 parent,boolean _front) {
this.parent = parent;
this._front = _front;
}
descargaadc.xy.b4xpage2 parent;
boolean _front;
String _permission = "";
boolean _result = false;
int _taskindex = 0;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 85;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
parent._rp.CheckAndRequest(ba,parent._rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 86;BA.debugLine="Wait For B4XPage_PermissionResult (Permission As";
parent.__c.WaitFor("b4xpage_permissionresult", ba, this, null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
 //BA.debugLineNum = 87;BA.debugLine="If Result = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"No permission!\", True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("No permission!"),parent.__c.True);
 //BA.debugLineNum = 89;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 92;BA.debugLine="SetState(False, False, VideoMode)";
parent._setstate(parent.__c.False,parent.__c.False,parent._videomode);
 //BA.debugLineNum = 93;BA.debugLine="Wait For (cam.OpenCamera(front)) Complete (TaskIn";
parent.__c.WaitFor("complete", ba, this, parent._cam._opencamera /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_front));
this.state = 14;
return;
case 14:
//C
this.state = 5;
_taskindex = (Integer) result[0];
;
 //BA.debugLineNum = 94;BA.debugLine="If TaskIndex > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_taskindex>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 95;BA.debugLine="MyTaskIndex = TaskIndex 'hold this index. It wil";
parent._mytaskindex = _taskindex;
 //BA.debugLineNum = 96;BA.debugLine="Wait For(PrepareSurface) Complete (Success As Bo";
parent.__c.WaitFor("complete", ba, this, parent._preparesurface());
this.state = 15;
return;
case 15:
//C
this.state = 8;
_success = (Boolean) result[0];
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 98;BA.debugLine="Log(\"Start success: \" & Success)";
parent.__c.LogImpl("88519694","Start success: "+BA.ObjectToString(_success),0);
 //BA.debugLineNum = 99;BA.debugLine="SetState(Success, False, VideoMode)";
parent._setstate(_success,parent.__c.False,parent._videomode);
 //BA.debugLineNum = 100;BA.debugLine="If Success = False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 101;BA.debugLine="ToastMessageShow(\"Failed to open camera\", True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Failed to open camera"),parent.__c.True);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _pnlbackground_click() throws Exception{
 //BA.debugLineNum = 258;BA.debugLine="Sub pnlBackground_Click";
 //BA.debugLineNum = 259;BA.debugLine="pnlBackground.Visible = False";
_pnlbackground.setVisible(__c.False);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _preparesurface() throws Exception{
ResumableSub_PrepareSurface rsub = new ResumableSub_PrepareSurface(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PrepareSurface extends BA.ResumableSub {
public ResumableSub_PrepareSurface(descargaadc.xy.b4xpage2 parent) {
this.parent = parent;
}
descargaadc.xy.b4xpage2 parent;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 106;BA.debugLine="SetState(False, busystate, VideoMode)";
parent._setstate(parent.__c.False,parent._busystate,parent._videomode);
 //BA.debugLineNum = 108;BA.debugLine="If VideoMode Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._videomode) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 109;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
parent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (640),(int) (480));
 //BA.debugLineNum = 110;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
parent._resizepreviewpanelbasedpreviewsize();
 //BA.debugLineNum = 112;BA.debugLine="Wait For (cam.PrepareSurfaceForVideo(MyTaskIndex";
parent.__c.WaitFor("complete", ba, this, parent._cam._preparesurfaceforvideo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._mytaskindex,parent._videofiledir,"temp-"+parent._videofilename));
this.state = 12;
return;
case 12:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 115;BA.debugLine="cam.PreviewSize.Initialize(640, 480)";
parent._cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .Initialize((int) (640),(int) (480));
 //BA.debugLineNum = 116;BA.debugLine="ResizePreviewPanelBasedPreviewSize";
parent._resizepreviewpanelbasedpreviewsize();
 //BA.debugLineNum = 120;BA.debugLine="Wait For (cam.PrepareSurface(MyTaskIndex)) Compl";
parent.__c.WaitFor("complete", ba, this, parent._cam._preparesurface /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._mytaskindex));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_success = (Boolean) result[0];
;
 if (true) break;
;
 //BA.debugLineNum = 123;BA.debugLine="If Success Then cam.StartPreview(MyTaskIndex, Vid";

case 6:
//if
this.state = 11;
if (_success) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent._cam._startpreview /*String*/ (parent._mytaskindex,parent._videomode);
if (true) break;

case 11:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="SetState(Success, busystate, VideoMode)";
parent._setstate(_success,parent._busystate,parent._videomode);
 //BA.debugLineNum = 125;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resizepreviewpanelbasedpreviewsize() throws Exception{
int _pw = 0;
int _ph = 0;
float _r = 0f;
int _w = 0;
int _h = 0;
 //BA.debugLineNum = 128;BA.debugLine="Private Sub ResizePreviewPanelBasedPreviewSize";
 //BA.debugLineNum = 129;BA.debugLine="Dim pw = cam.PreviewSize.Height, ph = cam.Preview";
_pw = _cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .getHeight();
_ph = _cam._previewsize /*anywheresoftware.b4a.objects.Camera2.CameraSizeWrapper*/ .getWidth();
 //BA.debugLineNum = 130;BA.debugLine="Dim r As Float = Max(Root.Width / pw, Root.Height";
_r = (float) (__c.Max(_root.getWidth()/(double)_pw,_root.getHeight()/(double)_ph));
 //BA.debugLineNum = 131;BA.debugLine="Dim w As Int = pw * r";
_w = (int) (_pw*_r);
 //BA.debugLineNum = 132;BA.debugLine="Dim h As Int = ph * r";
_h = (int) (_ph*_r);
 //BA.debugLineNum = 133;BA.debugLine="pnlCamera.SetLayoutAnimated(0, Round(Root.Width /";
_pnlcamera.SetLayoutAnimated((int) (0),(int) (__c.Round(_root.getWidth()/(double)2-_w/(double)2)),(int) (__c.Round(_root.getHeight()/(double)2-_h/(double)2)),(int) (__c.Round(_w)),(int) (__c.Round(_h)));
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _rotatejpegifneeded(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,byte[] _data) throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _exifinterface = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
int _orientation = 0;
 //BA.debugLineNum = 340;BA.debugLine="Private Sub RotateJpegIfNeeded (bmp As B4XBitmap,";
 //BA.debugLineNum = 341;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 342;BA.debugLine="If p.SdkVersion >= 24 Then";
if (_p.getSdkVersion()>=24) { 
 //BA.debugLineNum = 343;BA.debugLine="Dim ExifInterface As JavaObject";
_exifinterface = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 344;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 345;BA.debugLine="in.InitializeFromBytesArray(Data, 0, Data.Length";
_in.InitializeFromBytesArray(_data,(int) (0),_data.length);
 //BA.debugLineNum = 346;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
_exifinterface.InitializeNewInstance("android.media.ExifInterface",new Object[]{(Object)(_in.getObject())});
 //BA.debugLineNum = 347;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
_orientation = (int)(BA.ObjectToNumber(_exifinterface.RunMethod("getAttribute",new Object[]{(Object)("Orientation")})));
 //BA.debugLineNum = 348;BA.debugLine="Select orientation";
switch (_orientation) {
case 3: {
 //BA.debugLineNum = 350;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 break; }
case 6: {
 //BA.debugLineNum = 352;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 break; }
case 8: {
 //BA.debugLineNum = 354;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 break; }
}
;
 //BA.debugLineNum = 356;BA.debugLine="in.Close";
_in.Close();
 };
 //BA.debugLineNum = 358;BA.debugLine="Return bmp";
if (true) return _bmp;
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return null;
}
public String  _setstate(boolean _open,boolean _busy,boolean _video) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _btnrecordtext = "";
 //BA.debugLineNum = 303;BA.debugLine="Sub SetState(Open As Boolean, Busy As Boolean, Vid";
 //BA.debugLineNum = 304;BA.debugLine="For Each b As Button In buttons";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _buttons;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(group1.Get(index1)));
 //BA.debugLineNum = 305;BA.debugLine="b.Visible = Open And Not(Busy)";
_b.setVisible(_open && __c.Not(_busy));
 }
};
 //BA.debugLineNum = 307;BA.debugLine="btnCamera.Visible = Not(Busy)";
_btncamera.setVisible(__c.Not(_busy));
 //BA.debugLineNum = 308;BA.debugLine="btnRecord.Visible = Open And (Video Or Not(Busy))";
_btnrecord.setVisible(_open && (_video || __c.Not(_busy)));
 //BA.debugLineNum = 309;BA.debugLine="openstate = Open";
_openstate = _open;
 //BA.debugLineNum = 310;BA.debugLine="ProgressBar1.Visible = Busy";
_progressbar1.setVisible(_busy);
 //BA.debugLineNum = 311;BA.debugLine="busystate = Busy";
_busystate = _busy;
 //BA.debugLineNum = 312;BA.debugLine="VideoMode = Video";
_videomode = _video;
 //BA.debugLineNum = 313;BA.debugLine="barZoom.Visible = Open";
_barzoom.setVisible(_open);
 //BA.debugLineNum = 314;BA.debugLine="Dim btnRecordText As String";
_btnrecordtext = "";
 //BA.debugLineNum = 315;BA.debugLine="If VideoMode Then";
if (_videomode) { 
 //BA.debugLineNum = 316;BA.debugLine="If Busy Then";
if (_busy) { 
 //BA.debugLineNum = 317;BA.debugLine="btnRecordText = Chr(0xF04D)";
_btnrecordtext = BA.ObjectToString(__c.Chr(((int)0xf04d)));
 }else {
 //BA.debugLineNum = 319;BA.debugLine="btnRecordText = Chr(0xF03D)";
_btnrecordtext = BA.ObjectToString(__c.Chr(((int)0xf03d)));
 };
 }else {
 //BA.debugLineNum = 322;BA.debugLine="btnRecordText = Chr(0xF030)";
_btnrecordtext = BA.ObjectToString(__c.Chr(((int)0xf030)));
 };
 //BA.debugLineNum = 324;BA.debugLine="btnRecord.Text = btnRecordText";
_btnrecord.setText(BA.ObjectToCharSequence(_btnrecordtext));
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public void  _takepicture() throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(this);
rsub.resume(ba, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(descargaadc.xy.b4xpage2 parent) {
this.parent = parent;
}
descargaadc.xy.b4xpage2 parent;
double _u = 0;
String _a = "";
String _filename = "";
byte[] _data = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 207;BA.debugLine="Dim u As Double";
_u = 0;
 //BA.debugLineNum = 208;BA.debugLine="Dim a As String";
_a = "";
 //BA.debugLineNum = 209;BA.debugLine="VideoFileDir = rp.GetSafeDirDefaultExternal(\"ftp3";
parent._videofiledir = parent._rp.GetSafeDirDefaultExternal("ftp3");
 //BA.debugLineNum = 210;BA.debugLine="calidad = rp.GetSafeDirDefaultExternal(\"Calidad\")";
parent._calidad = parent._rp.GetSafeDirDefaultExternal("Calidad");
 //BA.debugLineNum = 215;BA.debugLine="a=File.ReadString(calidad,\"planilla2.txt\")";
_a = parent.__c.File.ReadString(parent._calidad,"planilla2.txt");
 //BA.debugLineNum = 216;BA.debugLine="u=a";
_u = (double)(Double.parseDouble(_a));
 //BA.debugLineNum = 217;BA.debugLine="Log(\"A ES \"& a)";
parent.__c.LogImpl("89306124","A ES "+_a,0);
 //BA.debugLineNum = 219;BA.debugLine="If u=8 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_u==8) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 220;BA.debugLine="u=0";
_u = 0;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 223;BA.debugLine="u=u+1";
_u = _u+1;
 //BA.debugLineNum = 224;BA.debugLine="File.WriteString(calidad ,\"planilla2.txt\",u)";
parent.__c.File.WriteString(parent._calidad,"planilla2.txt",BA.NumberToString(_u));
 //BA.debugLineNum = 238;BA.debugLine="Dim filename As String =\"fot\" & B4XPages.MainPage";
_filename = "fot"+parent._b4xpages._mainpage /*descargaadc.xy.b4xmainpage*/ (ba)._id /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()+"_"+BA.NumberToString(_u)+".jpg";
 //BA.debugLineNum = 240;BA.debugLine="Try";
if (true) break;

case 5:
//try
this.state = 10;
this.catchState = 9;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 10;
this.catchState = 9;
 //BA.debugLineNum = 241;BA.debugLine="SetState(openstate, True, VideoMode)";
parent._setstate(parent._openstate,parent.__c.True,parent._videomode);
 //BA.debugLineNum = 242;BA.debugLine="Wait For(cam.FocusAndTakePicture(MyTaskIndex)) C";
parent.__c.WaitFor("complete", ba, this, parent._cam._focusandtakepicture /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._mytaskindex));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_data = (byte[]) result[0];
;
 //BA.debugLineNum = 243;BA.debugLine="SetState(openstate, False, VideoMode)";
parent._setstate(parent._openstate,parent.__c.False,parent._videomode);
 //BA.debugLineNum = 244;BA.debugLine="cam.DataToFile(Data, VideoFileDir, filename)";
parent._cam._datatofile /*String*/ (_data,parent._videofiledir,_filename);
 //BA.debugLineNum = 245;BA.debugLine="Dim bmp As Bitmap = cam.DataToBitmap(Data)";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = parent._cam._datatobitmap /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ (_data);
 //BA.debugLineNum = 246;BA.debugLine="Log(\"Picture taken: \" & bmp) 'ignore";
parent.__c.LogImpl("89306153","Picture taken: "+BA.ObjectToString(_bmp),0);
 //BA.debugLineNum = 247;BA.debugLine="pnlBackground.SetVisibleAnimated(100, True)";
parent._pnlbackground.SetVisibleAnimated((int) (100),parent.__c.True);
 //BA.debugLineNum = 248;BA.debugLine="B4XImageView1.Bitmap = RotateJpegIfNeeded(bmp, D";
parent._b4ximageview1._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (parent._rotatejpegifneeded((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject())),_data));
 //BA.debugLineNum = 249;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 //BA.debugLineNum = 250;BA.debugLine="pnlBackground.SetVisibleAnimated(500, False)";
parent._pnlbackground.SetVisibleAnimated((int) (500),parent.__c.False);
 //BA.debugLineNum = 251;BA.debugLine="ToastMessageShow(\"Foto captura \" & filename & CR";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Foto captura "+_filename+parent.__c.CRLF+"File size: "+BA.NumberToString(parent.__c.File.Size(parent._videofiledir,_filename))),parent.__c.True);
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 253;BA.debugLine="HandleError(LastException)";
parent._handleerror(parent.__c.LastException(ba));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _terminar_click() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Private Sub terminar_Click";
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
