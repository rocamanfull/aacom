B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region
'falta parte de defectos y limite cajas de carga lote ,el123,emb ,color 
'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Dim ScrollView1 As ScrollView
	'Dim operador As String
	Dim Panel1 As Panel
	Public Page1 As B4XPage1 'primeraPageTextFields
	Public Page2 As B4XPage2 'foto
	Public Page3 As B4xPage3'seg
	Public Page4 As B4xPage4'terc
	Public Page5 As B4xPage6 'cuartaPageTextFields
	Public Page6 As B4xPage7 'quinta
	Public Page7 As B4xPage8 'sexta
	Public Page8 As B4xPage9 'sep
	Public Page9 As b4xpage5
	Dim Bmp As Bitmap
	Private VideoFileDir,FileDir,ftp3,cargas As String
	Private rp As RuntimePermissions

	Public Provider As FileProvider
	Dim PDFWriter1 As PDFWriter
	Dim PaperSize As PDFPaperSizes
	Dim Fonts As PDFStandardFonts
	Dim PDFContent As String
	
	Private terminar As Button
	Private calc As Button
	Public id As EditText
	Private fecha As EditText
	Public peso As EditText
	Public var As EditText
	Public presion As EditText
	'Private color As EditText
	Public env As EditText
	Public tam As EditText
	Public tempe As EditText
	Public plu As EditText
	Public lote As EditText
	Public trata As EditText
	Public up As Spinner
	Public papel As EditText
	Public emb As EditText
	Public pele1 As EditText
	Public pele2 As EditText
	Public pele3 As EditText
	Public rechazo As Spinner
	Public operador As String
	Public dano As EditText
	Public contador As EditText
	Public txt As String
	
	Public llenar As Button
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	
		
	
	Public carg1,carg2,com1,com2,com3,bol1,bol2 As Boolean
'	carg1=False
'	carg2=False
'	com1=False
'	com2=False
'	com3=False
'	bol1=False
'	bol2=False
	Public master As Boolean
'	master=False
'	
	
	

	
	
	Private Button1 As Button
	Private Button2 As Button
	Private cs10 As EditText
	Private cs11 As EditText
	Private cs12 As EditText
	Private cs13 As EditText
	Private cs14 As EditText
	'Private dano As EditText
	Private date1 As Button
	Private EditText1 As EditText
	Private EditText2 As EditText
	Private Label10 As Label
	Private Label11 As Label
	Private Label12 As Label
	Private Label13 As Label
	Private Label16 As Label
	Private Label17 As Label
	Private Label19 As Label
	Private Label20 As Label
	Private Label21 As Label
	Private Label22 As Label
	Private Label23 As Label
	Private Label24 As Label
	Private Label27 As Label
	Private Label28 As Label
	Private Label30 As Label
	Private Label45 As Label
	Private Label46 As Label
	Private Label47 As Label
	Private Label48 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private Label8 As Label
	Private Label9 As Label
	Private lblPage1Title As Label
	Private obs As EditText
	Private otro As EditText
	Private pdf As Button
	Private ps10 As EditText
	Private ps11 As EditText
	Private ps12 As EditText
	Private ps13 As EditText
	Private ps14 As EditText
	Private s14 As EditText
	Private sis As EditText
	 Public pho As String
	 Public pho2 As String
	Private cant As EditText
	Private cdf1 As EditText
	Private cdf2 As EditText
	Private cdf3 As EditText
	Private cdl1 As EditText
	Private cdl2 As EditText
	Private cdl3 As EditText
	Private cdl4 As EditText
	Private cdm1 As EditText
	Private cdm2 As EditText
	Private cdm3 As EditText
	Private cliente As EditText
	Private cpeg1 As EditText
	Private cpeg2 As EditText
	Private cpeg3 As EditText
	Private cpem1 As EditText
	Private cpem2 As EditText
	Private destino As EditText
	Private df1 As Spinner
	Private df2 As Spinner
	Private df3 As Spinner
	Private dl1 As Spinner
	Private dl2 As Spinner
	Private dl3 As Spinner
	Private dl4 As Spinner
	Private dm1 As Spinner
	Private dm2 As Spinner
	Private dm3 As Spinner
	Private ele1p As EditText
	Private ele2p As EditText
	Private Label14 As Label
	Private Label25 As Label
	Private pdf1 As EditText
	Private pdf2 As EditText
	Private pdf3 As EditText
	Private pdl1 As EditText
	Private pdl2 As EditText
	Private pdl3 As EditText
	Private pdl4 As EditText
	Private pdm1 As EditText
	Private pdm2 As EditText
	Private pdm3 As EditText
	Private peg1 As Spinner
	Private peg2 As Spinner
	Private peg3 As Spinner
	Private pem1 As Spinner
	Private pem2 As Spinner
	Private ppeg1 As EditText
	Private ppeg2 As EditText
	Private ppeg3 As EditText
	Private ppem1 As EditText
	Private ppem2 As EditText
	Private tecnico As EditText
	Private test As Button
	'Private Activity As Activity
	
	
	

	
	
	Private Button2 As Button
	
	
	
	
	
	
	
	
	
	
	Private Button3 As Button
	Private Button4 As Button
	Private Button5 As Button
	Private Button6 As Button
	Private Button7 As Button
	
	
	Private EditText40 As EditText
	
	
	
	
	
	
	
	Private Label15 As Label
	Private Label18 As Label
	Private Label26 As Label
	Private Label29 As Label
	Private Label32 As Label
	Private Label33 As Label
	Private Label37 As Label
	Private Label38 As Label
	Private Label39 As Label
	Private Label40 As Label
	Private Label41 As Label
	Private Label42 As Label
	Private Label43 As Label
	Private Label44 As Label
	Private Label49 As Label
	Private Label50 As Label
	Private Label51 As Label
	Private Label52 As Label
	Private Label53 As Label
	Private Label54 As Label
	Private Label55 As Label
	Private Label56 As Label
	Private Label57 As Label
	Private Label58 As Label
	Private Label59 As Label
	Private Label60 As Label
	Private Label61 As Label
	Private Label62 As Label
	Private Label63 As Label
	Private Label64 As Label
	Private Label65 As Label
	Private Label66 As Label
	Private Label67 As Label
	Private Label68 As Label
	Private Label69 As Label
	Private Label70 As Label
	Private Label71 As Label
	Private label72 As Label
	Private Label73 As Label
	Private Label74 As Label
	Private Label75 As Label
	Private Label76 As Label
	Private Label77 As Label
	Private Label78 As Label
	Private Label79 As Label
	Private Label80 As Label
	Private Label83 As Label
	Private Label84 As Label
	Private Label85 As Label
	Private Label86 As Label
	Private Label87 As Label
	Private label88 As Label
	Private Label89 As Label
	Private Label90 As Label
	Private Label92 As Label
	Private Label93 As Label
	Private Label94 As Label
	Private Label95 As Label
	Private Label96 As Label
	Private label99 As Label
	
	
	Private minimo As Label
	
	Private Panel2 As Panel
	
	'Private Activity As Activity
	Private vapor As EditText
	Private conten As EditText
	Private hora As EditText
End Sub
Sub GLOBALS

End Sub
	
Public Sub Initialize
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	ToastMessageShow("Initializing todo",True)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	ScrollView1.Panel.LoadLayout("carga3")
#if B4a
	ScrollView1.Panel.Height = Panel1.Height
#End If
	B4XPages.SetTitle(Me, "Planilla de Cargas Pai sa")
	Page2.Initialize
	B4XPages.AddPage("Page 2", Page2)
	Page1.Initialize
	B4XPages.AddPage("Page 1", Page1)
	
	Page3.Initialize
	B4XPages.AddPage("Page 3", Page3)
	carg2=True
	Page4.Initialize
	B4XPages.AddPage("Page 4", Page4)
	Page5.Initialize
	B4XPages.AddPage("Page 5", Page5)
	Page6.Initialize''control menu
	B4XPages.AddPage("Page 6", Page6)
	Page7.Initialize
	B4XPages.AddPage("Page 7", Page7)
	''control menu
	
	Page8.Initialize
	B4XPages.AddPage("Page 8", Page8)
	Page9.Initialize
	B4XPages.AddPage("Page 9", Page9)
	
	
'	B4XPages.AddPageAndCreate("Page4", Page4)    
'	B4XPages.AddPageAndCreate("Page5", Page5)
'	B4XPages.AddPageAndCreate("Page6", Page6)    
'	
	'B4XPages.AddPageAndCreate("Page7", Page7)    
	'B4XPages.AddPageAndCreate("Page8", Page8)
'	                  
	''control menu
	
	''control menu
	
	'Page1.CARG1=False 
	
	
	B4XPages.AddMenuItem(Me, "Info")
	B4XPages.AddMenuItem(Me, "Carga1")
	B4XPages.AddMenuItem(Me, "Carga2")
	'B4XPages.AddMenuItem(Me, "Cargac1")
	'B4XPages.AddMenuItem(Me, "Cargac2")
	'B4XPages.AddMenuItem(Me, "Cargac3")
	B4XPages.AddMenuItem(Me, "Bolsa1")
	B4XPages.AddMenuItem(Me, "Bolsa2")
	
	B4XPages.AddMenuItem(Me, "Camara")
	'B4XPages.AddMenuItem(Me, "Terminar")
	'B4XPages.AddMenuItem(Me, "Daños")
	
	Bmp.Initialize(File.DirAssets, "android48.png")
	master=False
	carg1=False
	carg2=False
	com1=False
	com2=False
	com3=False
	
	Button1.Enabled=False
	Button1.Visible=False
	If super= True Then
		master=True
		Button1.Enabled=True
		Button1.Visible=True
	End If

Log("carg1 es "& carg1)
Log("carg2 es "& carg2)
Log("bol1 es "& bol1)
Log("bol2 es "& bol2)
Log("super es "& super)



	Provider.Initialize
	VideoFileDir = rp.GetSafeDirDefaultExternal("Calidad")'' Calid es una subcarpeta

	
	cargas = rp.GetSafeDirDefaultExternal("cargas")

	
	'Ftp2 =rp.GetSafeDirDefaultExternal("Ftp2") otro ejemplo de subcarpeta
	FileDir=File.DirAssets


	fech
    sacanum


	''Cargo spinners
	Dim list2 As List
	Dim list3 As List
	Dim list5 As List
	list2 = File.ReadList(FileDir, "marc.txt")
	list3 = File.ReadList(FileDir, "emp.txt")''emp
	
	
	'list2 = File.ReadList(VideoFileDir, "marc.txt")
	'list3 = File.ReadList(VideoFileDir, "emp.txt")''emp
	'list5 = File.ReadList(VideoFileDir, "up.txt")''emp
	'operador=File.Readstring(VideoFileDir,"firma.txt")
	'emp.AddAll(list3)
	'up.AddAll(list5)
	'marca.AddAll(list2)
'	rechazo.AddAll(Array As String("No Rechazado","Rechazado"))
'grado.AddAll(Array As String("","Conv.","Org."))

	'File.copy(FileDir,"planilla.txt",VideoFileDir,"planilla.txt")
	'rechazo.AddAll(Array As String("Producto Liberado SI","Producto Liberado NO"))
	'produc.AddAll(Array As String("","Conv.","Org."))
	'grado.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4"))
	pho="a"
	contador.Text="0"
	
	
	
	
	Try
	
		'PDFWriter1.Initialize("PDFWriter1",PaperSize.LETTER_WIDTH, PaperSize.LEDGER_HEIGHT)
		PDFWriter1.Initialize("PDFWriter1",PaperSize.LEGAL_HEIGHT,PaperSize.LEGAL_WIDTH)
		'PDFWriter1.Initialize("PDFWriter1",PaperSize.LEGAL_WIDTH,PaperSize.LEGAL_HEIGHT)
		
		
		ToastMessageShow("Initializing PDF Writer",True)
	Catch
	
	End Try

End Sub
Private Sub B4XPage_CloseRequest As ResumableSub
	Dim sf As Object = xui.Msgbox2Async("Quiere Cerrar?", "", "Yes", "Cancel", "No", Null)
	Wait For (sf) Msgbox_Result (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		'ExitApplication
		
		nofoto
	
		B4XPages.ClosePage(Me)
		ExitApplication
		Return True
		'ExitApplication
		
	End If
	Return False
End Sub
''You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'
private Sub nofoto
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	

	Dim savefile As String

	savefile= "D5e" & id.Text & "a.jpg"
	
	If File.Exists (ftp3 ,savefile) = True Then
	
		File.Delete(ftp3, savefile)
	End If
End Sub
private Sub noarchivo
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	
	Dim savefile,savefile1 ,i As String

	savefile= "adc" & id.Text & ".csv"
	savefile1="bol"& id.Text & ".csv"
	
'	If File.Exists (VideoFileDir, "planilla.txt") = False Then
'		'Msgbox("Foto no sacada","ok")
'		a=File.ReadString(File.DirAssets,"planilla.txt")
'		MsgboxAsync("no existe",a)
'		File.copy(File.DirAssets,"planilla.txt",VideoFileDir,"planilla.txt")
	'
'		'Return False
'	Else
'	MsgboxAsync("existe","")
	'If com1=False And com2=False And com3= False
	
	
	If File.Exists (ftp3 ,savefile) = False Or  (com1=False And com2=False And com3= False) Then
		'Msgbox("Foto no sacada","ok")
		File.copy(File.DirAssets,"adc.csv",ftp3,"adc"& id.Text & ".csv")
		
		
	End If
	If File.Exists (ftp3 ,savefile1) = False Then
		File.copy(File.DirAssets,"pepe.csv",ftp3,"bol"& id.Text & ".csv")
	End If
	
	
	
End Sub



Sub reiniciocamara
	Dim u As Double
	Dim a ,calidad As String
	
	calidad = rp.GetSafeDirDefaultExternal("Calidad")
	
	'u=8
	'File.WriteString(VideoFileDir ,"planilla2.txt",u)
	
	'a=File.ReadString(calidad,"planilla2.txt")
	
	
	u=0
	File.WriteString(calidad ,"planilla2.txt",u)

End Sub
private Sub fotollenar
	
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	
	Dim savefile,savefile1 , savefile2,savefile3, savefile4,savefile5, savefile6,savefile7,savefile8,i As String

	'savefile= "adc" & id.Text & ".csv"
	'savefile1="bol"& id.Text & ".csv"
	savefile1= "fot" & id.Text & "_1" & ".jpg"
	savefile2= "fot" & id.Text & "_2" & ".jpg"
	savefile3= "fot" & id.Text & "_3" & ".jpg"
	savefile4= "fot" & id.Text & "_4" & ".jpg"
	savefile5= "fot" & id.Text & "_5" & ".jpg"
	savefile6= "fot" & id.Text & "_6" & ".jpg"
	savefile7= "fot" & id.Text & "_7" & ".jpg"
	savefile8= "fot" & id.Text & "_8" & ".jpg"
	
'	If File.Exists (VideoFileDir, "planilla.txt") = False Then
'		'Msgbox("Foto no sacada","ok")
'		a=File.ReadString(File.DirAssets,"planilla.txt")
'		MsgboxAsync("no existe",a)
'		File.copy(File.DirAssets,"planilla.txt",VideoFileDir,"planilla.txt")
	'
'		'Return False
'	Else
'	MsgboxAsync("existe","")
	
	
	
'	If File.Exists (ftp3 ,savefile) = False Then
'		'Msgbox("Foto no sacada","ok")
'		File.copy(File.DirAssets,"pepe.csv",ftp3,"adc"& id.Text & ".csv")
'		
'		
'	End If
'	If File.Exists (ftp3 ,savefile1) = False Then
'		File.copy(File.DirAssets,"pepe.csv",ftp3,"bol"& id.Text & ".csv")
'	End If
'	
	If File.Exists (ftp3 ,savefile8) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_8.jpg")
	End If
	If File.Exists (ftp3 ,savefile7) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_7.jpg")
	End If
	If File.Exists (ftp3 ,savefile6) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_6.jpg")
	End If
	If File.Exists (ftp3 ,savefile5) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_5.jpg")
	End If
	If File.Exists (ftp3 ,savefile4) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_4.jpg")
	End If
	If File.Exists (ftp3 ,savefile3) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_3.jpg")
	End If
	If File.Exists (ftp3 ,savefile2) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_2.jpg")
	End If
	
	If File.Exists (ftp3 ,savefile1) = False Then
		File.copy(File.DirAssets,"fot_1.jpg",ftp3,"fot"& id.Text & "_1.jpg")
	End If
End Sub

Sub B4XPage_MenuClick (Tag As String)
	If Tag = "Info" Then
		B4XPages.ShowPage("MainPage")
	End If
	If Tag = "Camara" Then
		B4XPages.ShowPage("Page 2")
	End If
	If Tag ="Carga1" Then
		B4XPages.ShowPage("Page 1")
	End If
	If Tag ="Carga2" Then
		B4XPages.ShowPage("Page 3")
	End If
	If Tag ="Cargac1" Then
		B4XPages.ShowPage("Page 4")
		
	End If
	If Tag ="Cargac2" Then
		B4XPages.ShowPage("Page 5")
	End If
	If Tag ="Cargac3" Then
		B4XPages.ShowPage("Page 6")
	End If
	If Tag ="Bolsa1" Then
		B4XPages.ShowPage("Page 7")
	End If
	If Tag ="Bolsa2" Then
		B4XPages.ShowPage("Page 8")
	End If
	If Tag = "Terminar" Then
		'correo
		'B4XPages.MainPage.informe2
		'final
		'correo
		'prueba_Click
	End If
End Sub
'Sub date1_Click 'libreria dialogs2
'	Dim Dd As DateDialog
'	Dd.Year = DateTime.GetYear(DateTime.Now)
'	Dd.Month = DateTime.GetMonth(DateTime.Now)
'	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
'	
'	Dim ret As Int = Dd.Show("Fecha", "", "Yes", "", "",Bmp )
'	
'	sello1.Text=Dd.DayOfMonth & "/" & Dd.Month' & "/" & Dd.Year
'	
'	
'	'ToastMessageShow(ret & " : " & Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
'End Sub
Sub sacanum 'lee archivo numero y lo pone en id
	Dim a As String
	VideoFileDir = rp.GetSafeDirDefaultExternal("Calidad")
	
'	
'	If File.Exists (VideoFileDir, "planilla.txt") = False Then
'		'Msgbox("Foto no sacada","ok")
'		a=File.ReadString(File.DirAssets,"planilla.txt")
'		MsgboxAsync("no existe",a)
'		File.copy(File.DirAssets,"planilla.txt",VideoFileDir,"planilla.txt")
	'
'		'Return False
'	Else
'	MsgboxAsync("existe","")
	
	a=File.ReadString(VideoFileDir,"planilla3.txt")

'	
'	End If
'	MsgboxAsync("fin",a)
'	'	a=File.ReadString(File.DirAssets,"planilla.txt")
	id.Text = a
	
End Sub
'
Sub sumanum 'lee numero en id.txt ,le suma uno y lo guarda

	
	Dim u As Double
	Dim a As String
	a=File.ReadString(VideoFileDir,"planilla3.txt")
	u=a
	
	
	u=u+1
	File.WriteString(VideoFileDir ,"planilla3.txt",u)


End Sub
Sub super As Boolean 'compara el valor en planilla.txt y ve si es "777"
	VideoFileDir = rp.GetSafeDirDefaultExternal("Calidad")
	
	
	Dim a As String
	If File.Exists(VideoFileDir, "planilla4.txt")=True  Then
		a = File.ReadString(VideoFileDir, "planilla4.txt") ' Elimina espacios innecesarios
		Log("Contenido leído: [" & a & "]") ' Para depuración
		If a="16000" Then
		
			Return True
		End If
		Return False 'esta puenteada la proteccion
		
	End If
	
	
'	
'	a=File.ReadString(VideoFileDir,"planilla.txt")
	'
'	If a="777" Then
'		Return True
'	End If
'	Return False
	

End Sub
'Private Sub btnSendEmail_Click
'	Dim FileName As String = "b4a.png"
'	'copy the shared file to the shared folder
'	File.Copy(File.DirAssets, FileName, Provider.SharedFolder, FileName)
'	Dim email As Email
'	email.To.Add("aaa@bbb.com")
'	email.Subject = "subject"
'	email.Attachments.Add(Provider.GetFileUri(FileName))
'	email.Attachments.Add(Provider.GetFileUri(FileName)) 'second attachment
'	Dim in As Intent = email.GetIntent
'	in.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
'	StartActivity(in)
''End Sub
'Sub blanqueo
''	
''
'	id.Text=""
'	color.Text=""
'	emp.SelectedIndex=0
'	env.Text=""
'	fecha.Text=""
'	marca.SelectedIndex=0
'	peso.Text=""
'	presion.text=""
'	grado.SelectedIndex=0
'	sello.Text=""
'	tam.Text=""
'	var.Text=""
'	dano.Text=""
'	papel.Text=""
'	pele1.Text=""
'	pele2.Text=""
'	pele3.Text=""
'	lote.Text=""
'	tempe.Text=""
'	emb.Text=""
'	plu.Text=""
'	up.SelectedIndex=0
'	obs.Text="Obs:"
'	rechazo.SelectedIndex=0
'	trata.Text=""
'	
'	Page1.np1.Text=""
'	Page1.np2.Text=""
'	Page1.np3.Text=""
'	Page1.np4.Text=""
'	Page1.np5.Text=""
'	Page1.np6.Text=""
'	Page1.np7.Text=""
'	Page1.np8.Text=""
'	Page1.np9.Text=""
'	Page1.np10.Text=""
'	Page1.pp1.Text=""
'	Page1.pp2.Text=""
'	Page1.pp3.Text=""
'	Page1.pp4.Text=""
'	Page1.pp5.Text=""
'	Page1.pp6.Text=""
'	Page1.pp7.Text=""
'	Page1.pp8.Text=""
'	Page1.pp9.Text=""
'	Page1.pp10.Text=""
'
'	Page1.nd1.Text=""
'	Page1.nd2.Text=""
'	Page1.nd3.Text=""
'	Page1.nd4.Text=""
'	Page1.nd5.Text=""
'	Page1.nd6.Text=""
'	Page1.nd7.Text=""
'	Page1.nd8.Text=""
'	Page1.nd9.Text=""
'	Page1.nd10.Text=""
'	Page1.nd11.Text=""
'	Page1.nd12.Text=""
'	Page1.nd13.Text=""
'	Page1.nd14.Text=""
'	Page1.nd15.Text=""
'	Page1.nd16.Text=""
'	Page1.nd17.Text=""
'	Page1.nd18.Text=""
'	Page1.pd1.Text=""
'	Page1.pd2.Text=""
'	Page1.pd3.Text=""
'	Page1.pd4.Text=""
'	Page1.pd5.Text=""
'	Page1.pd6.Text=""
'	Page1.pd7.Text=""
'	Page1.pd8.Text=""
'	Page1.pd9.Text=""
'	Page1.pd10.Text=""
'	Page1.pd11.Text=""
'	Page1.pd12.Text=""
'	Page1.pd13.Text=""
'	Page1.pd14.Text=""
'	Page1.pd15.Text=""
'	Page1.pd16.Text=""
'	Page1.pd17.Text=""
'	Page1.pd18.Text=""
''
'
''	
'End Sub


Sub correo ''MANDA EMAIL
		
	Dim x,y As String
	'Dim de,em  As String
	
	y=Page1.emp1.SelectedItem
	x=y.SubString2(6,113) '//130 sub125
'	de=emp.SelectedItem
'	em=de.SubString2(0,2)
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	'Log (x)
	
	Dim email As Email
	Dim savefile1,savefile2,savefile3,savefile4,savefile5,savefile6,savefile7,savefile8,efile1,efile2,address,body,asunto,efile3,efile4 As String
	savefile1= "fot" & id.Text& "_1.jpg"
	savefile2 ="fot" & id.Text& "_2.jpg"
	savefile3= "fot" & id.Text& "_3.jpg"
	savefile4 ="fot" & id.Text& "_4.jpg"
	savefile5= "fot" & id.Text& "_5.jpg"
	savefile6 ="fot" & id.Text& "_6.jpg"
	savefile7= "fot" & id.Text& "_7.jpg"
	savefile8 ="fot" & id.Text& "_8.jpg"
	
	
	efile1= "enc" & id.Text& ".csv"
	efile2= "con" & id.Text& ".csv"
	efile3= "adc" & id.Text& ".csv"
	efile4= "bol" & id.Text& ".csv"
	'savefile3="D5e" & id.Text& ".pdf"
	'savefile= "a1.jpg"
	'savefile2= "a1.bru"
	'savefile3="a1.pdf"
	
	
	''savedir = Ftp2
	File.Copy(ftp3, savefile1, Provider.SharedFolder, savefile1)
	File.Copy(ftp3, savefile2, Provider.SharedFolder, savefile2)
	File.Copy(ftp3, savefile3, Provider.SharedFolder, savefile3)
	File.Copy(ftp3, savefile4 ,Provider.SharedFolder, savefile4)
	
	File.Copy(ftp3, savefile5,Provider.SharedFolder, savefile5)
	File.Copy(ftp3, savefile6,Provider.SharedFolder, savefile6)
	File.Copy(ftp3, savefile7,Provider.SharedFolder, savefile7)
	File.Copy(ftp3, savefile8,Provider.SharedFolder, savefile8)
	File.Copy(ftp3, efile1,Provider.SharedFolder, efile1)
	File.Copy(ftp3, efile2,Provider.SharedFolder, efile2)
	File.Copy(ftp3, efile3,Provider.SharedFolder, efile3)
	File.Copy(ftp3, efile4,Provider.SharedFolder, efile4)
	address="calidadcarg@pai-argentina.com, " & x
	email.To.Add(address)
	email.Attachments.Add(Provider.GetFileUri(savefile1))
	email.Attachments.Add(Provider.GetFileUri(savefile2)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(savefile3)) 'second attachment
	'email.Attachments.Add(Provider.GetFileUri(savefile3))
	email.Attachments.Add(Provider.GetFileUri(savefile4)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(savefile5)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(savefile6)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(savefile7)) 'second attachment
	
	email.Attachments.Add(Provider.GetFileUri(savefile8)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(efile1)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(efile2)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(efile3)) 'second attachment
	email.Attachments.Add(Provider.GetFileUri(efile4)) 'second attachment
	Dim in As Intent = email.GetIntent
	body="Informe calidad  Adjunto"

	asunto="Informe cargas"
	
	email.body = body
	'email.Subject= "Informe Ele1" 'asunto
	email.Subject= asunto
	StartActivity(email.GetIntent)
	
	'Dim in As Intent = email.GetIntent
	'Message.Attachments.Add(File.Combine(savedir, savefile))
	'Message.Attachments.Add(File.Combine(savedir, savefile2))
	'Message.Attachments.Add(File.Combine(savedir, savefile3))
	
	'in.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
	'StartActivity(in)
	
	'seteo nueva instancia programa
	
'	pContent.Visible=True
	'blanqueo
	'sumanum
	'sacanum
	'fech
End Sub
'
Sub PDFWriter1_ConversionDone (Content As String)
	PDFContent = Content
	ProgressDialogHide
	'doevents()
	ToastMessageShow("Success. Generating Document completed.",False)
End Sub



'se puede copiar indistinto sin nada especial
'
Sub fech 'saca fecha actual y lo pone en campo fecha

	Dim dt As String
	Dim now As Long
	DateTime.DateFormat="dd/MM/yy"
	now=DateTime.now
	dt=DateTime.Date(now)
	fecha.Text=dt
	
End Sub
'
'
'
'
'
Sub blanqueo

	'
	cliente.Text=""
	hora.text=""
	conten.Text="" 
	vapor.Text="" 
	destino.Text="" 
	cant.Text="" 
	tecnico.Text=""
	obs.Text=""
	carg1=False
	carg2=False
	com1=False
	com2=False
	com3=False
	Log(carg1)
	Log(carg2)
	Log(com1)
	Log(com2)
	Log(com3)
'	
'
'	
'	
'		
'	
End Sub

Sub informe2 ''genera informe y lo muestra

	
	ProgressDialogShow("Generating Document.")
	Dim y,z As String

	'y=emp.SelectedItem
	'z=y.SubString2(0,2)
	'DoEvents()
	Dim de,em As String
	
	'de=emp.SelectedItem
	'em=de.SubString2(0,2)
	PDFWriter1.setFont(Fonts.SYMBOL, Fonts.TIMES_BOLD)
	PDFWriter1.setFont(Fonts.SUBTYPE, Fonts.TIMES_BOLD)
	PDFWriter1.addText(40, 560, 20,"        Planilla de cargas Pai sa Informe Nro" & id.text )
	PDFWriter1.addText(40, 530, 20,"         Fecha:05/11/24   Cliente:APS   NroContenedor:1234   Vapor:123  Destino:Brasil  Cant.Pallet:4 " )
	
	
'	PDFWriter1.addText(30, 675, 20, "------------------------Datos Generales---------------------------------")
'	PDFWriter1.addText(30, 655, 12, "Empresa: " & z)
'	PDFWriter1.addText(230, 655, 12, "Variedad: " & var.text)
'	PDFWriter1.addText(430, 655, 12, "Fecha: " & fecha.text)
'		
'	PDFWriter1.addText(30, 638, 12, "Envase: " & env.text)
'	PDFWriter1.addText(230, 638, 12, "Grado: " & grado.SelectedItem )
'	PDFWriter1.addText(430, 638, 12, "Tam.: " & tam.text)
'	PDFWriter1.addText(30, 621, 12, "Peso: " & peso.text)
'		
'	PDFWriter1.addText(230, 621, 12, "Presion(ls): " & presion.text)
'	PDFWriter1.addText(430, 621, 12, "Color: " & color.text)
'	PDFWriter1.addText(30, 604, 12, "Plu: " & plu.text)
'	PDFWriter1.addText(230, 604, 12, "Temperat.(C): " & tempe.Text)
'	PDFWriter1.addText(430, 604, 12, "Lote: " & lote.Text)
'	
'	PDFWriter1.addText(230, 587, 12, "Marca: " & marca.SelectedItem)
'	PDFWriter1.addText(30, 587, 12, "Productor: " & up.SelectedItem)
	PDFWriter1.addText(5, 485, 12, "E.Socio NroPallet Variedad Marca Envase Calidad  FechaP  Peso  Aparienc Color Temp Plu Prom  Max  Min  CalInt Bitter Manchas Asolead Heridas Total  ")
  	z="470"
	
	PDFWriter1.addText(5, z, 12, "LN ")'       222222       1asd       pai    aaa   ELE        02-Jul       18   Buena    VA    -0.8  13  13,95  11    Buena       2       2      2        22      222")' & up.SelectedItem)
	PDFWriter1.addText(50, z, 12,"222222")
	PDFWriter1.addText(100, z, 12,"1asd")
	PDFWriter1.addText(150, z, 12,"Pic")
	PDFWriter1.addText(190, z, 12,"env")
	PDFWriter1.addText(235, z, 12,"cal")
	
	PDFWriter1.addText(280, z, 12,"fech")
	PDFWriter1.addText(320, z, 12,"pes")
	PDFWriter1.addText(354 ,z, 12,"apa")
	PDFWriter1.addText(400, z, 12,"colo")
	PDFWriter1.addText(430, z, 12,"temp")
	PDFWriter1.addText(460, z, 12,"pro")
	
	PDFWriter1.addText(480, z, 12,"prom")
	PDFWriter1.addText(520, z, 12, "max")
	PDFWriter1.addText(540, z, 12,"min")
	PDFWriter1.addText(580, z, 12,"cal")
	'PDFWriter1.addText(620, z, 12,"tam")
	PDFWriter1.addText(610, z, 12,"tam")
	PDFWriter1.addText(650, z, 12,"man")
	PDFWriter1.addText(750, z, 12,"man")
	PDFWriter1.addText(805, z, 12,"aso")
	PDFWriter1.addText(850, z, 12,"her")
	PDFWriter1.addText(900, z, 12,"tot")

	'
	z="455"
	
	PDFWriter1.addText(5, z, 12, "LN ")'       222222       1asd       pai    aaa   ELE        02-Jul       18   Buena    VA    -0.8  13  13,95  11    Buena       2       2      2        22      222")' & up.SelectedItem)
	PDFWriter1.addText(50, z, 12,"222222")
	PDFWriter1.addText(100, z, 12,"1asd")
	PDFWriter1.addText(150, z, 12,"Pic")
	PDFWriter1.addText(190, z, 12,"env")
	PDFWriter1.addText(235, z, 12,"cal")
	
	PDFWriter1.addText(280, z, 12,"fech")
	PDFWriter1.addText(355, z, 12,"pes")
	PDFWriter1.addText(390 ,z, 12,"apa")
	PDFWriter1.addText(435, z, 12,"colo")
	PDFWriter1.addText(465, z, 12,"temp")
	PDFWriter1.addText(505, z, 12,"pro")
	PDFWriter1.addText(535, z, 12,"max")
	PDFWriter1.addText(565, z, 12,"min")
	PDFWriter1.addText(600, z, 12,"cal")
	PDFWriter1.addText(760, z, 12,"aso")
	PDFWriter1.addText(655, z, 12,"Fis")
	PDFWriter1.addText(710, z, 12,"man")
	PDFWriter1.addText(805, z, 12,"her")
	PDFWriter1.addText(850, z, 12,"tot")
	z="440"
	
	PDFWriter1.addText(5, z, 12, "LN ")'       222222       1asd       pai    aaa   ELE        02-Jul       18   Buena    VA    -0.8  13  13,95  11    Buena       2       2      2        22      222")' & up.SelectedItem)
	PDFWriter1.addText(50, z, 12,"222222")
	PDFWriter1.addText(100, z, 12,"1asd")
	PDFWriter1.addText(150, z, 12,"Pic")
	PDFWriter1.addText(190, z, 12,"env")
	PDFWriter1.addText(235, z, 12,"cal")
	
	PDFWriter1.addText(280, z, 12,"fech")
	PDFWriter1.addText(355, z, 12,"pes")
	PDFWriter1.addText(390 ,z, 12,"apa")
	PDFWriter1.addText(435, z, 12,"colo")
	PDFWriter1.addText(465, z, 12,"temp")
	PDFWriter1.addText(505, z, 12,"pro")
	PDFWriter1.addText(535, z, 12,"max")
	PDFWriter1.addText(565, z, 12,"min")
	PDFWriter1.addText(600, z, 12,"cal")
	PDFWriter1.addText(760, z, 12,"aso")
	PDFWriter1.addText(655, z, 12,"Fis")
	PDFWriter1.addText(710, z, 12,"man")
	PDFWriter1.addText(805, z, 12,"her")
	PDFWriter1.addText(850, z, 12,"tot")
	
	z="425"
	
	PDFWriter1.addText(5, z, 12, "LN ")'       222222       1asd       pai    aaa   ELE        02-Jul       18   Buena    VA    -0.8  13  13,95  11    Buena       2       2      2        22      222")' & up.SelectedItem)
	PDFWriter1.addText(50, z, 12,"222222")
	PDFWriter1.addText(100, z, 12,"1asd")
	PDFWriter1.addText(150, z, 12,"Pic")
	PDFWriter1.addText(190, z, 12,"env")
	PDFWriter1.addText(235, z, 12,"cal")
	
	PDFWriter1.addText(280, z, 12,"fech")
	PDFWriter1.addText(355, z, 12,"pes")
	PDFWriter1.addText(390 ,z, 12,"apa")
	PDFWriter1.addText(435, z, 12,"colo")
	PDFWriter1.addText(465, z, 12,"temp")
	PDFWriter1.addText(505, z, 12,"pro")
	PDFWriter1.addText(535, z, 12,"max")
	PDFWriter1.addText(565, z, 12,"min")
	PDFWriter1.addText(600, z, 12,"cal")
	PDFWriter1.addText(760, z, 12,"aso")
	PDFWriter1.addText(655, z, 12,"Fis")
	PDFWriter1.addText(710, z, 12,"man")
	PDFWriter1.addText(805, z, 12,"her")
	PDFWriter1.addText(850, z, 12,"tot")
	
	
	'PDFWriter1.addText(5, 510, 12, "123456789123456789123456789123456789123456789012345678901234567890123456789012345678901234566789012345678901234567890123456789012345678901234566789012345657890")
	'PDFWriter1.addText(5, 495, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
	'PDFWriter1.addText(5, 480, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 465, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 450, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 435, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 420, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 405, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 390, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 375, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 360, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 345, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 330, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 315, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 300, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 285, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 270, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 255, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 240, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 225, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 210, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 195, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 180, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)
'	PDFWriter1.addText(5, 165, 12, "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222")' & up.SelectedItem)


PDFWriter1.addText(5, 35, 12, "Observaciones:    ")' & up.SelectedItem)
	PDFWriter1.addText(5, 50, 12, "Tecnico: Walter Verificado     ")' & up.SelectedItem)
'	
	
	Dim pepe,pepe2,pepe1 As Bitmap
	Dim savefile,savedir,savedir2,savefile2,savefile1  As String

	savedir = File.DirRootExternal  & "/Ftp3"
	savedir2 = File.DirRootExternal  & "/Calidad"
	'savefile=  "D5e" & id.Text& "a.jpg"
	'savefile1 ="D5e" & id.Text& "b.jpg"
	savefile2="logot.jpg"
	'pepe =  LoadBitmapSample ( ftp3, savefile , 150 , 150 )
	pepe2= LoadBitmapSample(VideoFileDir,savefile2,50,50)
	'pepe1 =  LoadBitmapSample ( ftp3, savefile1 , 150 , 150 )
	'PDFWriter1.addImage ( 50 , 50,pepe)
	PDFWriter1.addImage ( 15, 520,pepe2)
	'PDFWriter1.addImage ( 350 ,50,pepe1)
		
'	PDFWriter1.addText(1, 100, 12, "1,100")'"& papel.Text)
'	PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	PDFWriter1.addText(1, 500, 12, "1x 500")'"& papel.Text)
'	PDFWriter1.addText(1, 400, 12, "1x 400")'"& papel.Text)
'	PDFWriter1.addText(1, 300, 12, "1x 300")'"& papel.Text)
'	PDFWriter1.addText(1, 600, 12, "1x600")'"& papel.Text)
'	'PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	'PDFWriter1.addText(500, 500, 12, "500x500 ")'"& papel.Text)
'	
'	
'	PDFWriter1.addText(900, 100, 12, "900x100 ")'"& papel.Text)
'	'PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	PDFWriter1.addText(500, 500, 12, "500 x 500")'"& papel.Text)
'
'	PDFWriter1.addText(900, 500, 12, "900 x 500")'"& papel.Text)
'
'	PDFWriter1.addText(500, 100, 12, "500 x 100")'"& papel.Text)
'	PDFWriter1.addText(500, 100, 12, "500 x 100")'"& papel.Text)
'
'PDFWriter1.addText(1, 1, 12, "1x1 ")' & emb.Text)
''		
'		
'	PDFWriter1.addText(430, 570, 12, "Sello: " & sello.Text)
		
'	PDFWriter1.addText(30, 545, 20, "------------------------------Plagas----------------------------------------")
'	PDFWriter1.addText(30, 525, 12, "Carp./graf.: " & Page1.np1.Text)
'	PDFWriter1.addText(230, 525, 12, "B.de cesto: " & Page1.np2.Text)
'	PDFWriter1.addText(430, 525, 12, "Piojo S.Jose: " & Page1.np3.Text)
'	PDFWriter1.addText(30,  508 , 12, "Cochinilla: " & Page1.np4.Text)
'	PDFWriter1.addText(230, 508, 12, "Agamuzado: " & Page1.np5.Text)
'	PDFWriter1.addText(430, 508, 12, "Psillido: " & Page1.np6.Text)
'	PDFWriter1.addText(30,  491 , 12, "Oidio: " & Page1.np7.Text)
'	PDFWriter1.addText(230, 491, 12, "Sarna: " & Page1.np8.Text)
'	PDFWriter1.addText(430, 491, 12, "Trips: " & Page1.np9.Text)
'	PDFWriter1.addText(30, 474, 12, Page1.otros.Text &": " & Page1.np10.Text)
'	PDFWriter1.addText(30, 440, 20, "------------------------------Defectos--------------------------------------")
'	PDFWriter1.addText(30, 425, 12, "Golpes: " & Page1.nd1.Text)
'	PDFWriter1.addText(230, 425, 12, "H.Pedunculo: "& Page1.nd2.Text)
'	PDFWriter1.addText(430, 425, 12, "Cracking: "& Page1.nd3.Text)
'	PDFWriter1.addText(30,  408 , 12, "Bitter Pit: "& Page1.nd4.Text)
'	PDFWriter1.addText(230, 408, 12, "Lenticelosis: "& Page1.nd5.Text)
'	PDFWriter1.addText(430, 408, 12, "Escaldadura: "& Page1.nd6.Text)
'	PDFWriter1.addText(30,  391 , 12, "G.de granizo: "& Page1.nd7.Text)
'	PDFWriter1.addText(230, 391, 12, "M.de helada: "& Page1.nd8.Text)
'	PDFWriter1.addText(430, 391, 12, "Rameado: "& Page1.nd9.Text)
'	PDFWriter1.addText(30, 374, 12, "Asoleada: "& Page1.nd10.Text)
'	PDFWriter1.addText(230, 374, 12, "Deformada: "& Page1.nd11.Text)
'	PDFWriter1.addText(430, 374, 12, "Fitotoxicidad: "& Page1.nd12.Text)
'	PDFWriter1.addText(30,  357 , 12, "Caliz amar.: "& Page1.nd13.Text)
'	PDFWriter1.addText(230, 357, 12, "Fruta madura: "& Page1.nd14.Text)
'	PDFWriter1.addText(430, 357, 12, "Corazon a/m: "& Page1.nd15.Text)
'	PDFWriter1.addText(30, 340, 12, "Fuera de tam.: "& Page1.nd16.Text)
''	PDFWriter1.addText(230, 340, 12, "Sin pedunc.: "& Page1.nd17.Text)
'	PDFWriter1.addText(430, 340, 12, Page1.otros2.Text &": " & Page1.nd18.Text)
	
	
	
	
	
	
	
	
	
	
'	PDFWriter1.addText(30, 310, 20, "------------------------------Totales---------------------------------------")
'	PDFWriter1.addText(30, 290, 12, "% Danos: " & dano.Text)
'	PDFWriter1.addText(230, 290, 12, "Tratamiento: "& trata.Text)
'	PDFWriter1.addText(430, 290, 12, rechazo.SelectedItem)
'	PDFWriter1.addText(30, 270, 12, obs.Text)
'	PDFWriter1.addText(30, 230, 12, "Firma:"& operador)
'	PDFWriter1.addText(230, 230, 12, "Verificado:")

	PDFWriter1.newPage
	Dim y,z As String

	'y=emp.SelectedItem
	'z=y.SubString2(0,2)
	'DoEvents()Dim y,z As String

	'y=emp.SelectedItem
	'z=y.SubString2(0,2)
	'DoEvents()
	Dim de,em As String
	
	'de=emp.SelectedItem
	'em=de.SubString2(0,2)
	PDFWriter1.setFont(Fonts.SYMBOL, Fonts.TIMES_BOLD)
	PDFWriter1.setFont(Fonts.SUBTYPE, Fonts.TIMES_BOLD)
	PDFWriter1.addText(40, 560, 20,"        Planilla de cargas Pai sa")
	PDFWriter1.addText(40, 530, 20,"        Informe Nro "& id.text &" Fecha:05/11/24   Cliente:APS   Lote:1234   Destino:Rusia   Cant.Pallet:4 " )
	
	


	PDFWriter1.addText(5, 35, 12, "Observaciones:    ")' & up.SelectedItem)
	PDFWriter1.addText(5, 50, 12, "Tecnico: Walter Verificado     ")' & up.SelectedItem)
'		
	
	
	
	
	Dim y,z As String

	'y=emp.SelectedItem
	'z=y.SubString2(0,2)
	'DoEvents()
	Dim de,em As String
	
	'de=emp.SelectedItem
	'em=de.SubString2(0,2)
	PDFWriter1.setFont(Fonts.SYMBOL, Fonts.TIMES_BOLD)
	PDFWriter1.setFont(Fonts.SUBTYPE, Fonts.TIMES_BOLD)
	PDFWriter1.addText(40, 560, 20,"        Planilla de cargas Pai sa")
	PDFWriter1.addText(40, 530, 20,"        Informe Nro "& id.text &" Fecha:05/11/24   Cliente:APS   Lote:1234   Destino:Rusia   Cant.Pallet:4 " )
	
	


	PDFWriter1.addText(5, 35, 12, "Observaciones:    ")' & up.SelectedItem)
	PDFWriter1.addText(5, 50, 12, "Tecnico: Walter Verificado     ")' & up.SelectedItem)
'	
	
	
	
	
	
	
	
	
	
	
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	


		
		
		
	

	Dim pepe1,pepe2,pepe3,logox As Bitmap
	Dim pepe4,pepe5,pepe6 As Bitmap
	Dim pepe7,pepe8 As Bitmap
	'Dim pepe,pepe2,pepe1 As Bitmap
	Dim savefile1,savefile2,savefilex  As String
	Dim savefile3 ,savefile5 As String
	Dim savefile4,savefile8 ,savefile6,savefile7  As String

	'savedir = File.DirRootExternal  & "/Ftp3"
	'savedir2 = File.DirRootExternal  & "/Calidad"
	savefile1= "fot" & id.Text& "_1.jpg"
	savefile2 ="fot" & id.Text& "_2.jpg"
	savefile3= "fot" & id.Text& "_3.jpg"
	savefile4 ="fot" & id.Text& "_4.jpg"
	savefile5= "fot" & id.Text& "_5.jpg"
	savefile6 ="fot" & id.Text& "_6.jpg"
	savefile7= "fot" & id.Text& "_7.jpg"
	savefile8 ="fot" & id.Text& "_8.jpg"
	
	savefilex="logot.jpg"
	pepe1 =  LoadBitmapSample ( ftp3, savefile1 , 200 , 200 )
	logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe2 =  LoadBitmapSample ( ftp3, savefile2 , 200 , 200 )
	pepe3 =  LoadBitmapSample ( ftp3, savefile3 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe4 =  LoadBitmapSample ( ftp3, savefile4 , 200 ,200 )
	pepe5 =  LoadBitmapSample ( ftp3, savefile5 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe6 =  LoadBitmapSample ( ftp3, savefile6 , 200 , 200 )
	
	pepe7 =  LoadBitmapSample ( ftp3, savefile7 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe8 =  LoadBitmapSample ( ftp3, savefile8 , 200 , 200 )
	
	
	
	PDFWriter1.addImage ( 20 , 100,pepe1)
	PDFWriter1.addImage ( 15, 520,logox)
	PDFWriter1.addImage ( 270 ,100,pepe2)
		
	PDFWriter1.addImage ( 520 , 100,pepe3)
	
	PDFWriter1.addImage ( 770 ,100,pepe4)
		
	PDFWriter1.addImage ( 20 , 350,pepe5)
	
	PDFWriter1.addImage ( 270 ,350,pepe6)
		
	PDFWriter1.addImage ( 520 , 350,pepe7)
	
	PDFWriter1.addImage ( 770 ,350,pepe8)
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	PDFWriter1.ConverseDocument
	Dim MyTime As String
 
	MyTime = gettime

	PDFWriter1.outputToFile(ftp3, "pdf" & id.Text & ".pdf",PDFContent,"ISO-8859-1")
	ToastMessageShow("PDF Saved: " &  "pdf" & id.Text & ".pdf",False)

		
		
		
End Sub
Sub informe3 ''genera informe y lo muestra

	
	ProgressDialogShow("Generating Document.")
	Dim y,z As String

	'y=emp.SelectedItem
	'z=y.SubString2(0,2)
	'DoEvents()
	Dim de,em As String
	
	'de=emp.SelectedItem
	'em=de.SubString2(0,2)
	PDFWriter1.setFont(Fonts.SYMBOL, Fonts.TIMES_BOLD)
	PDFWriter1.setFont(Fonts.SUBTYPE, Fonts.TIMES_BOLD)
	PDFWriter1.addText(40, 560, 20,"        Planilla de cargas Pai sa")
	PDFWriter1.addText(40, 530, 20,"        Informe Nro "& id.text &" Fecha:05/11/24   Cliente:APS   Lote:1234   Destino:Rusia   Cant.Pallet:4 " )
	
	


PDFWriter1.addText(5, 35, 12, "Observaciones:    ")' & up.SelectedItem)
PDFWriter1.addText(5, 50, 12, "Tecnico: Walter Verificado     ")' & up.SelectedItem)
'	
	
'	PDFWriter1.addText(1, 100, 12, "1,100")'"& papel.Text)
'	PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	PDFWriter1.addText(1, 500, 12, "1x 500")'"& papel.Text)
'	PDFWriter1.addText(1, 400, 12, "1x 400")'"& papel.Text)
'	PDFWriter1.addText(1, 300, 12, "1x 300")'"& papel.Text)
'	PDFWriter1.addText(1, 600, 12, "1x600")'"& papel.Text)
'	'PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	'PDFWriter1.addText(500, 500, 12, "500x500 ")'"& papel.Text)
'	
'	
'	PDFWriter1.addText(900, 100, 12, "900x100 ")'"& papel.Text)
'	'PDFWriter1.addText(1, 200, 12, "1x 200")'"& papel.Text)
'	PDFWriter1.addText(500, 500, 12, "500 x 500")'"& papel.Text)
'
'	PDFWriter1.addText(900, 500, 12, "900 x 500")'"& papel.Text)
'
'	PDFWriter1.addText(500, 100, 12, "500 x 100")'"& papel.Text)
'	PDFWriter1.addText(500, 100, 12, "500 x 100")'"& papel.Text)
'
'PDFWriter1.addText(1, 1, 12, "1x1 ")' & emb.Text)
''		
'		
'	PDFWriter1.addText(430, 570, 12, "Sello: " & sello.Text)
		
'	PDFWriter1.addText(30, 545, 20, "------------------------------Plagas----------------------------------------")
'	PDFWriter1.addText(30, 525, 12, "Carp./graf.: " & Page1.np1.Text)
'	PDFWriter1.addText(230, 525, 12, "B.de cesto: " & Page1.np2.Text)
'	PDFWriter1.addText(430, 525, 12, "Piojo S.Jose: " & Page1.np3.Text)
'	PDFWriter1.addText(30,  508 , 12, "Cochinilla: " & Page1.np4.Text)
'	PDFWriter1.addText(230, 508, 12, "Agamuzado: " & Page1.np5.Text)
'	PDFWriter1.addText(430, 508, 12, "Psillido: " & Page1.np6.Text)
'	PDFWriter1.addText(30,  491 , 12, "Oidio: " & Page1.np7.Text)
'	PDFWriter1.addText(230, 491, 12, "Sarna: " & Page1.np8.Text)
'	PDFWriter1.addText(430, 491, 12, "Trips: " & Page1.np9.Text)
'	PDFWriter1.addText(30, 474, 12, Page1.otros.Text &": " & Page1.np10.Text)
'	PDFWriter1.addText(30, 440, 20, "------------------------------Defectos--------------------------------------")
'	PDFWriter1.addText(30, 425, 12, "Golpes: " & Page1.nd1.Text)
'	PDFWriter1.addText(230, 425, 12, "H.Pedunculo: "& Page1.nd2.Text)
'	PDFWriter1.addText(430, 425, 12, "Cracking: "& Page1.nd3.Text)
'	PDFWriter1.addText(30,  408 , 12, "Bitter Pit: "& Page1.nd4.Text)
'	PDFWriter1.addText(230, 408, 12, "Lenticelosis: "& Page1.nd5.Text)
'	PDFWriter1.addText(430, 408, 12, "Escaldadura: "& Page1.nd6.Text)
'	PDFWriter1.addText(30,  391 , 12, "G.de granizo: "& Page1.nd7.Text)
'	PDFWriter1.addText(230, 391, 12, "M.de helada: "& Page1.nd8.Text)
'	PDFWriter1.addText(430, 391, 12, "Rameado: "& Page1.nd9.Text)
'	PDFWriter1.addText(30, 374, 12, "Asoleada: "& Page1.nd10.Text)
'	PDFWriter1.addText(230, 374, 12, "Deformada: "& Page1.nd11.Text)
'	PDFWriter1.addText(430, 374, 12, "Fitotoxicidad: "& Page1.nd12.Text)
'	PDFWriter1.addText(30,  357 , 12, "Caliz amar.: "& Page1.nd13.Text)
'	PDFWriter1.addText(230, 357, 12, "Fruta madura: "& Page1.nd14.Text)
'	PDFWriter1.addText(430, 357, 12, "Corazon a/m: "& Page1.nd15.Text)
'	PDFWriter1.addText(30, 340, 12, "Fuera de tam.: "& Page1.nd16.Text)
''	PDFWriter1.addText(230, 340, 12, "Sin pedunc.: "& Page1.nd17.Text)
'	PDFWriter1.addText(430, 340, 12, Page1.otros2.Text &": " & Page1.nd18.Text)
	
	
	
	
	
	
	
	
	
	
'	PDFWriter1.addText(30, 310, 20, "------------------------------Totales---------------------------------------")
'	PDFWriter1.addText(30, 290, 12, "% Danos: " & dano.Text)
'	PDFWriter1.addText(230, 290, 12, "Tratamiento: "& trata.Text)
'	PDFWriter1.addText(430, 290, 12, rechazo.SelectedItem)
'	PDFWriter1.addText(30, 270, 12, obs.Text)
'	PDFWriter1.addText(30, 230, 12, "Firma:"& operador)
'	PDFWriter1.addText(230, 230, 12, "Verificado:")
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	


		
		
		
	

	Dim pepe1,pepe2,pepe3,logox As Bitmap
	Dim pepe4,pepe5,pepe6 As Bitmap
	Dim pepe7,pepe8 As Bitmap
	'Dim pepe,pepe2,pepe1 As Bitmap
	Dim savefile1,savefile2,savefilex  As String
	Dim savefile3 ,savefile5 As String
	Dim savefile4,savefile8 ,savefile6,savefile7  As String

	'savedir = File.DirRootExternal  & "/Ftp3"
	'savedir2 = File.DirRootExternal  & "/Calidad"
	savefile1= "D5e" & id.Text& "_1.jpg"
	savefile2 ="D5e" & id.Text& "_2.jpg"
	savefile3= "D5e" & id.Text& "_3.jpg"
	savefile4 ="D5e" & id.Text& "_4.jpg"
	savefile5= "D5e" & id.Text& "_5.jpg"
	savefile6 ="D5e" & id.Text& "_6.jpg"
	savefile7= "D5e" & id.Text& "_7.jpg"
	savefile8 ="D5e" & id.Text& "_8.jpg"
	
	savefilex="logot.jpg"
	pepe1 =  LoadBitmapSample ( ftp3, savefile1 , 200 , 200 )
	logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe2 =  LoadBitmapSample ( ftp3, savefile2 , 200 , 200 )
	pepe3 =  LoadBitmapSample ( ftp3, savefile3 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe4 =  LoadBitmapSample ( ftp3, savefile4 , 200 ,200 )
	pepe5 =  LoadBitmapSample ( ftp3, savefile5 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe6 =  LoadBitmapSample ( ftp3, savefile6 , 200 , 200 )
	
	pepe7 =  LoadBitmapSample ( ftp3, savefile7 , 200 , 200 )
	'logox= LoadBitmapSample(VideoFileDir,savefilex,50,50)
	pepe8 =  LoadBitmapSample ( ftp3, savefile8 , 200 , 200 )
	
	
	
	PDFWriter1.addImage ( 20 , 100,pepe1)
	PDFWriter1.addImage ( 15, 520,logox)
	PDFWriter1.addImage ( 270 ,100,pepe2)
		
	PDFWriter1.addImage ( 520 , 100,pepe3)
	
	PDFWriter1.addImage ( 770 ,100,pepe4)
		
	PDFWriter1.addImage ( 20 , 350,pepe5)
	
	PDFWriter1.addImage ( 270 ,350,pepe6)
		
	PDFWriter1.addImage ( 520 , 350,pepe7)
	
	PDFWriter1.addImage ( 770 ,350,pepe8)
		
	
	PDFWriter1.ConverseDocument
	Dim MyTime As String
 
	MyTime = gettime

	PDFWriter1.outputToFile(ftp3, "D5e" & id.Text & "F.pdf",PDFContent,"ISO-8859-1")
	ToastMessageShow("PDF Saved: " &  "D5e" & id.Text & "F.pdf",False)

		
		
		
End Sub

Sub gettime


	DateTime.DateFormat = "yyMMddHHmmss"
 
	Dim dt As String
	DateTime.DateFormat = "yyMMddHHmmss" ' See this page regarding uppercase letters.
	now = DateTime.Now
	dt = DateTime.Date(now) ' e.g.: "110812150355" is Aug.12, 2011, 3:03:55 p.m.

  
	Return dt


End Sub

Sub  prueba_Click
	
	If no=True Then
	If foto=True Then
		If valid=True Then
			If Page1.valid=True Then 
				If Page3.valid2=True Then
					
					Page1.calc_Click
						Page3.calc_Click
						'noarchivo
		'	informe2
		'informe3
			final
			'final2
			final3
						noarchivo
		correo
	blanqueo
		Page1.blanqueo2
		Page3.blanqueo2
'		If com1=True Then 
'		Page4.blanqueo
'		End If
'						If com2=True Then
'							Page5.blanqueo
'						End If
'						If com3=True Then
'							Page6.blanqueo
'						End If
		'Page5.blanqueo
		
		
		'Page6.blanqueo
		If bol1=True Then
		Page7.blanqueo
		End If
						If bol2=True Then
							Page8.blanqueo
						End If
		'				Page8.blanqueo
		reiniciocamara
			sumanum
			sacanum
			fech
		'	ScrollView1.ScrollViewOffsetY = 0
		ScrollView1.ScrollPosition=0
		'id.RequestFocus
		
'			Try
'				PDFWriter1.Initialize("PDFWriter1",PaperSize.LETTER_WIDTH, PaperSize.LEDGER_HEIGHT)
'				ToastMessageShow("Initializing PDF Writer",True)
'			Catch
'				Msgbox("Can't Initialize PDF writer","WARNING")
'			End Try
'		
		
		
		End If
			End If
			End If
		'blanqueo
		
		
	End If
	End If
'	
End Sub

Sub no As Boolean
	
	
	If txt="no" Then

		Msgbox("debe pasar por Daños","ok")
		Return False
	Else
		Return True
		
	End If



End Sub
Sub hora_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 2 Then
		hora.Text = Old
	End If
End Sub
Sub cant_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		cant.Text = Old
	End If
End Sub
Sub cliente_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		cliente.text =Old
	End If
End Sub
Sub vapor_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		vapor.text =Old
	End If
End Sub
Sub  conten_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 10 Then
		conten.text =Old
	End If
End Sub
Sub  destino_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 20 Then
		destino.text =Old
	End If
End Sub

'	
'Sub pallet4_TextChanged (Old As String, New As String)
'	LimitarTexto4(pallet4, New)
'End Sub
''control de los digitos   
'	   
'	   
'	   
'	   
'	   
'	   
'	   
'	   
'	   
'	   
'	' Función para limitar el texto a 4 caracteres
'Sub LimitarTexto(edt As EditText, New As String)

' Dim limpio As String = NewText.Replace(";", "")

'	If edt.Text.Length > 4 Then
'		edt.Text = edt.Text.SubString2(0, 4)
'		edt.SelectionStart = 4 ' Mantiene el cursor al final
'	End If
'End Sub


Sub peso_TextChanged (Old As String, New As String)
	If New.Length > 4 Then
		peso.Text = Old
	End If
End Sub

Sub presion_TextChanged (Old As String, New As String)
	If New.Length > 4 Then
		presion.Text = Old
	End If
End Sub
Sub var_TextChanged (Old As String, New As String)
	If New.Length > 4 Then
		var.Text = Old
	End If
End Sub
Sub trata_TextChanged (Old As String, New As String)
	If New.Length > 30 Then
		trata.Text = Old
	End If
End Sub

Sub plu_TextChanged (Old As String, New As String)
	If New.Length > 3 Then
		plu.Text = Old
	End If
End Sub


Sub tam_TextChanged (Old As String, New As String)
	If New.Length > 3 Then
		tam.Text = Old
	End If
End Sub
Sub tempe_TextChanged (Old As String, New As String)
	If New.Length > 3 Then
		tempe.Text = Old
	End If
End Sub
Sub env_TextChanged (Old As String, New As String)
	If New.Length > 3 Then
		env.Text = Old
	End If
End Sub
'Sub color_TextChanged (Old As String, New As String)
'	If New.Length > 3 Then
'		color.Text = Old
'	End If
'End Sub
Sub final 'genera el archivo .txt
	Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t, u ,v ,w,x ,y,z,aa,ab,ac,ad   As String
	Dim writer As TextWriter
	Dim writer2 As  TextWriter
	Dim writer3 As TextWriter
	''y=emp.SelectedItem
	'z=y.SubString2(0,2)
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	bak =rp.GetSafeDirDefaultExternal("bak")
	'Page1.
	
	k="INFORME" & ";" & "fecha" & ";" & "hora" & ";" & "cliente"& ";" & "NRO cont." & ";" & "vapor"  & ";" &   "destino"  & ";" &  "cantidad"  & ";"& "obs" & ";"& "tecnico"
	b= id.text & ";" & fecha.text & ";" & hora.Text & ";" & cliente.Text & ";" & conten.Text & ";" & vapor.Text  & ";" &   destino.Text  & ";" &  cant.Text  & ";"& obs.Text & ";"& tecnico.Text
	
	
	'c=peso.Text & ";" & var.Text & ";" & env.Text & ";" & tam.Text & ";" & color.Text & ";"& presion.Text & ";" & lote.Text & ";"& plu.Text & ";"& tempe.Text & ";"
	'd=trata.Text & ";"
	'f=papel.Text & ";" & pele1.Text & ";" & pele2.Text & ";" & pele3.Text & ";" & emb.Text & ";" & up.SelectedItem & ";"& obs.Text & ";" & dano.Text & ";" &  rechazo.SelectedItem & ";"
	'NO=Page1.pp1.Text & ";" & pp2.Text & ";" &pp3.Text & ";" & pp4.Text & ";" & pp5.Text & ";" &pp6.Text & ";" &pp7.Text & ";" & pp8.Text & ";" & pp9.Text & ";" & otros.Text & ";"&  pp10.Text & ";" & pd1.Text & ";" &pd2.Text & ";" & pd3.Text & ";" & pd4.Text & ";" & pd5.Text & ";" & pd6.Text & ";" & pd7.Text & ";" & pd8.Text & ";" & pd9.Text & ";" & pd10.Text & ";" & pd11.Text & ";" &pd12.Text & ";" & pd13.Text & ";" & pd14.Text & ";" & pd15.Text & ";" & pd16.Text & ";" & pd17.Text &  ";" & otros2.Text & ";" & pd18.Text & ";"
	'e=Page1.np1.Text & ";" & Page1.np2.Text & ";" &Page1.np3.Text & ";" & Page1.np4.Text & ";" & Page1.np5.Text & ";" &Page1.np6.Text & ";" &Page1.np7.Text & ";" & Page1.np8.Text & ";" & Page1.np9.Text & ";" & Page1.otros.Text & ";"&  Page1.np10.Text & ";" & Page1.nd1.Text & ";" &Page1.nd2.Text & ";" & Page1.nd3.Text & ";" & Page1.nd4.Text & ";" & Page1.nd5.Text & ";" & Page1.nd6.Text & ";" & Page1.nd7.Text & ";" & Page1.nd8.Text & ";" & Page1.nd9.Text & ";" & Page1.nd10.Text & ";" & Page1.nd11.Text & ";" &Page1.nd12.Text & ";" & Page1.nd13.Text & ";" & Page1.nd14.Text & ";" & Page1.nd15.Text & ";" & Page1.nd16.Text & ";" & Page1.nd17.Text &  ";" & Page1.otros2.Text & ";" & Page1.nd18.Text & ";"

'	y=Page3.emp1.SelectedItem
'	z=y.SubString2(0,2)
'	u=z & ";"& Page3.pallet1.Text & ";"& Page3.var1.Text &  ";"& Page3.marca1.SelectedItem & ";"& Page3.env1.Text & ";"& Page3.calidad1.SelectedItem &  ";"& Page3.sello1.Text & ";"&  Page3.peso1.Text & ";"& Page3.apariencia1.SelectedItem &  ";"& Page3.color1.Text & ";"& Page3.temp1.Text & ";"& Page3.promedio1.Text & ";"& Page3.max1.Text & ";"& Page3.min1.Text & ";"& Page3.calidinterna1.Text & ";"& Page3.bitter1.Text & ";"& Page3.manchas1.Text & ";" & Page3.asoleado1.Text &  ";"& Page3.heridas1.Text & ";"& Page3.total1.Text
'	y=Page3.emp2.SelectedItem
'	z=y.SubString2(0,2)
'	v=z & ";"& Page3.pallet2.Text & ";"& Page3.var2.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	y=Page3.emp3.SelectedItem
'	z=y.SubString2(0,2)
'	w=z & ";"& Page3.pallet3.Text & ";"& Page3.var3.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	y=Page3.emp4.SelectedItem
'	z=y.SubString2(0,2)
'	x=z & ";"& Page3.pallet4.Text & ";"& Page3.var4.Text &  ";"& Page3.marca4.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	
'	
	y=Page1.emp1.SelectedItem
	z=y.SubString2(0,2)
    j=z & ";"& Page1.pallet4.Text & ";"& Page1.var4.Text &  ";"& Page1.marca4.SelectedItem & ";"& Page1.env4.Text & ";"& Page1.calidad4.SelectedItem &  ";"& Page1.sello4.Text & ";"&  Page1.peso4.Text & ";"& Page1.apariencia4.SelectedItem &  ";"& Page1.color4.Text & ";"& Page1.temp4.Text & ";"& Page1.plu4.Text & ";"& Page1.promedio4.Text & ";"& Page1.max4.Text & ";"& Page1.min4.Text & ";"& Page1.calidadinterna4.SelectedItem & ";"& Page1.bitter4.Text & ";"& Page1.manchas4.Text & ";" & Page1.asoleado4.Text &  ";"& Page1.heridas4.Text & ";"& Page1.total4.Text


	h=z & ";"& Page1.pallet3.Text & ";"& Page1.var3.Text &  ";"& Page1.marca3.SelectedItem & ";"& Page1.env3.Text & ";"& Page1.calidad3.SelectedItem &  ";"& Page1.sello3.Text & ";"&  Page1.peso3.Text & ";"& Page1.apariencia3.SelectedItem &  ";"& Page1.color3.Text & ";"& Page1.temp3.Text & ";"& Page1.plu3.Text & ";"& Page1.promedio3.Text & ";"& Page1.max3.Text & ";"& Page1.min3.Text & ";"& Page1.calidadinterna3.SelectedItem & ";"& Page1.bitter3.Text & ";"& Page1.manchas3.Text & ";" & Page1.asoleado3.Text &  ";"& Page1.heridas3.Text & ";"& Page1.total3.Text

	g=z & ";"& Page1.pallet2.Text & ";"& Page1.var2.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.plu2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
	f=z & ";"& Page1.pallet1.Text & ";"& Page1.var1.Text &  ";"& Page1.marca1.SelectedItem & ";"& Page1.env1.Text & ";"& Page1.calidad1.SelectedItem &  ";"& Page1.sello1.Text & ";"&  Page1.peso1.Text & ";"& Page1.apariencia1.SelectedItem &  ";"& Page1.color1.Text & ";"& Page1.temp1.Text & ";"& Page1.plu1.Text & ";"& Page1.promedio1.Text & ";"& Page1.max1.Text & ";"& Page1.min1.Text & ";"& Page1.calidadinterna1.SelectedItem & ";"& Page1.bitter1.Text & ";"& Page1.manchas1.Text & ";" & Page1.asoleado1.Text &  ";"& Page1.heridas1.Text & ";"& Page1.total1.Text
	y=Page3.emp1.SelectedItem
	z=y.SubString2(0,2)
	
	e=z & ";"& Page3.pallet4.Text & ";"& Page3.var4.Text &  ";"& Page3.marca4.SelectedItem & ";"& Page3.env4.Text & ";"& Page3.calidad4.SelectedItem &  ";"& Page3.sello4.Text & ";"&  Page3.peso4.Text & ";"& Page3.apariencia4.SelectedItem &  ";"& Page3.color4.Text & ";"& Page3.temp4.Text & ";"& Page3.plu4.Text & ";"& Page3.promedio4.Text & ";"& Page3.max4.Text & ";"& Page3.min4.Text & ";"& Page3.calidadinterna4.SelectedItem & ";"& Page3.bitter4.Text & ";"& Page3.manchas4.Text & ";" & Page3.asoleado4.Text &  ";"& Page3.heridas4.Text & ";"& Page3.total4.Text
	d=z & ";"& Page3.pallet3.Text & ";"& Page3.var3.Text &  ";"& Page3.marca3.SelectedItem & ";"& Page3.env3.Text & ";"& Page3.calidad3.SelectedItem &  ";"& Page3.sello3.Text & ";"&  Page3.peso3.Text & ";"& Page3.apariencia3.SelectedItem &  ";"& Page3.color3.Text & ";"& Page3.temp3.Text & ";"& Page3.plu3.Text & ";"& Page3.promedio3.Text & ";"& Page3.max3.Text & ";"& Page3.min3.Text & ";"& Page3.calidadinterna3.SelectedItem & ";"& Page3.bitter3.Text & ";"& Page3.manchas3.Text & ";" & Page3.asoleado3.Text &  ";"& Page3.heridas3.Text & ";"& Page3.total3.Text
	c=z & ";"& Page3.pallet2.Text & ";"& Page3.var2.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.plu2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidadinterna2.SelectedItem & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
	a=z & ";"& Page3.pallet1.Text & ";"& Page3.var1.Text &  ";"& Page3.marca1.SelectedItem & ";"& Page3.env1.Text & ";"& Page3.calidad1.SelectedItem &  ";"& Page3.sello1.Text & ";"&  Page3.peso1.Text & ";"& Page3.apariencia1.SelectedItem &  ";"& Page3.color1.Text & ";"& Page3.temp1.Text & ";"& Page3.plu1.Text & ";"& Page3.promedio1.Text & ";"& Page3.max1.Text & ";"& Page3.min1.Text & ";"& Page3.calidadinterna1.SelectedItem & ";"& Page3.bitter1.Text & ";"& Page3.manchas1.Text & ";" & Page3.asoleado1.Text &  ";"& Page3.heridas1.Text & ";"& Page3.total1.Text















'	aa=z & ";"& Page1.pallet1.Text & ";"& Page1.var1.Text &  ";"& Page1.marca1.SelectedItem & ";"& Page1.env1.Text & ";"& Page1.calidad1.SelectedItem &  ";"& Page1.sello1.Text & ";"&  Page1.peso1.Text & ";"& Page1.apariencia1.SelectedItem &  ";"& Page1.color1.Text & ";"& Page1.temp1.Text & ";"& Page1.plu1.Text & ";"& Page1.promedio1.Text & ";"& Page1.max1.Text & ";"& Page1.min1.Text & ";"& Page1.calidadinterna1.SelectedItem & ";"& Page1.bitter1.Text & ";"& Page1.manchas1.Text & ";" & Page1.asoleado1.Text &  ";"& Page1.heridas1.Text & ";"& Page1.total1.Text
'	y=Page1.emp2.SelectedItem
'	z=y.SubString2(0,2)
'	ab=z & ";"& Page1.pallet2.Text & ";"& Page1.var2.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
'	y=Page1.emp3.SelectedItem
'	z=y.SubString2(0,2)
'	ac=z & ";"& Page1.pallet3.Text & ";"& Page1.var3.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
'	y=Page1.emp4.SelectedItem
'	z=y.SubString2(0,2)
'	ad=z & ";"& Page1.pallet4.Text & ";"& Page1.var4.Text &  ";"& Page1.marca4.SelectedItem & ";"& Page1.env4.Text & ";"& Page1.calidad4.SelectedItem &  ";"& Page1.sello4.Text & ";"&  Page1.peso4.Text & ";"& Page1.apariencia4.SelectedItem &  ";"& Page1.color4.Text & ";"& Page1.temp4.Text & ";"& Page1.plu4.Text & ";"& ";"& Page1.promedio4.Text & ";"& Page1.max4.Text & ";"& Page1.min4.Text & ";"& Page1.calidadinterna4.SelectedItem & ";"& Page1.bitter4.Text & ";"& Page1.manchas4.Text & ";" & Page1.asoleado4.Text &  ";"& Page1.heridas4.Text & ";"& Page1.total4.Text
'	
'	
		'a=b & c & d & f & e '& g '& h 
'	h="Informe" & ";" & "fecha" & ";" & "M"& ";" & "Grado" & ";" &"Empresa"& ";" & "Sello" & ";"
	i="Empresa" & ";" & "Pallet" & ";" & "Variedad" & ";" &  "Marca" & ";" & "Envase" & ";" & "Calidad" & ";"& "Sello" & ";"  & "Peso" & ";" & "Ap.inicial" & ";" &"Color " & ";" & "Temp." & ";"  & "plu" & ";" & "Prom."& ";" & "Max." & ";" & "Min." & ";" & "Cal.Interna" & ";"  & "Bitter" & ";"  & "Manchas" & ";"  & "Asoleado" & ";" &  "Heridas" & ";" & "Total" 
'	j="papel"& ";" & "%ele1" & ";" & "%ele2" & ";" & "%ele3" & ";" & "emb"& ";" &"Up" & ";"& "obs" & ";"  & "dano" & ";"  & "RECHAZO" & ";"
'	k="Carpocapsa" & ";" & "Bicho de cesto" & ";" & "Piojo de SJose" & ";" &  "Cochinilla" & ";" & "Agamuzado" & ";" & "Psillido" & ";" & "Oidio" & ";" & "Sarna" & ";" & "Trips" & ";" & "Otros" & ";" & "%Otros" & ";" & "Golpes" & ";" & "Heridas Pedunc" & ";" & "Cracking" & ";" & "Bitter Pit" & ";" & "Lenticelosis" & ";" & "Escaldadura" & ";" & "Golpe de granizo" & ";" &"Mancha de helada" & ";" & "Rameado" & ";" & "Asoleada" & ";" & "Deformada" & ";" &"Fitotoxicidad" & ";" & "Caliz amarillo" & ";" & "Fruta madura" & ";" & "Corazon a/m" & ";" & "Fuera de tam" & ";" & "Sin pedunc" & ";" & "otros2" & ";" & "%otros2"
'	p= h & i & j & k
	'writer.Initialize(File.OpenOutput(File.DirRootExternal & "/Ftp3" ,z & "e" & id.Text &".csv",False))
	writer.Initialize(File.OpenOutput( ftp3 ,"enc" & id.Text &".csv",False))
'	writer.
	writer.WriteLine(k)
	writer.WriteLine(b)
	writer.Close
	'writer2.Initialize(File.OpenOutput(File.DirRootExternal & "/Calidad/Bak" ,z & "e" & id.Text &".csv",False))
	writer2.Initialize(File.OpenOutput( ftp3 ,"con" & id.Text &".csv",False))
	writer2.WriteLine(i)
	writer2.WriteLine(f)
	writer2.WriteLine(g)
	writer2.WriteLine(h)
	writer2.WriteLine(j)
	writer2.WriteLine(a)
	writer2.WriteLine(c)
	writer2.WriteLine(d)
	writer2.WriteLine(e)
'	writer2.WriteLine(j)
'	writer2.WriteLine(k)
'	writer2.WriteLine(m)
'	writer2.WriteLine(n)
'	writer2.WriteLine(l)
'	writer2.WriteLine(ll)
'	writer2.WriteLine(o)
'	writer2.WriteLine(p)
'	writer2.WriteLine(q)
'	writer2.WriteLine(r)
'	writer2.WriteLine(s)
'	writer2.WriteLine(t)
'	writer2.WriteLine(u)
'	writer2.WriteLine(v)
'	writer2.WriteLine(w)
'	writer2.WriteLine(x)
'	writer2.WriteLine(aa)
'	writer2.WriteLine(ab)
'	writer2.WriteLine(ac)
'	writer2.WriteLine(ad)
'	
'	
'	
'	
	writer2.Close
		
		
	'sumanum
End Sub
Sub final2 'genera el archivo .txt
	Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t, u ,v ,w,x ,y,z,aa,ab,ac,ad   As String
	'Dim writer As TextWriter
	Dim writer2 As  TextWriter
	'Dim writer3 As TextWriter
	''y=emp.SelectedItem
	'z=y.SubString2(0,2)
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	bak =rp.GetSafeDirDefaultExternal("bak")
	'Page1.
	
'	k="INFORME" & ";" & "fecha" & ";" & "hora" & ";" & "cliente"& ";" & "NRO cont." & ";" & "vapor"  & ";" &   "destino"  & ";" &  "cantidad"  & ";"& "obs" & ";"& "tecnico"
'	b= id.text & ";" & fecha.text & ";" & hora.Text & ";" & cliente.Text & ";" & conten.Text & ";" & vapor.Text  & ";" &   destino.Text  & ";" &  cant.Text  & ";"& obs.Text & ";"& tecnico.Text
	Log("COM1")
	Log(com1)
	Log("COM2")
	Log(com2)
	Log("COM3")
	Log(com3)
	
	
	'c=peso.Text & ";" & var.Text & ";" & env.Text & ";" & tam.Text & ";" & color.Text & ";"& presion.Text & ";" & lote.Text & ";"& plu.Text & ";"& tempe.Text & ";"
	'd=trata.Text & ";"
	'f=papel.Text & ";" & pele1.Text & ";" & pele2.Text & ";" & pele3.Text & ";" & emb.Text & ";" & up.SelectedItem & ";"& obs.Text & ";" & dano.Text & ";" &  rechazo.SelectedItem & ";"
	'NO=Page1.pp1.Text & ";" & pp2.Text & ";" &pp3.Text & ";" & pp4.Text & ";" & pp5.Text & ";" &pp6.Text & ";" &pp7.Text & ";" & pp8.Text & ";" & pp9.Text & ";" & otros.Text & ";"&  pp10.Text & ";" & pd1.Text & ";" &pd2.Text & ";" & pd3.Text & ";" & pd4.Text & ";" & pd5.Text & ";" & pd6.Text & ";" & pd7.Text & ";" & pd8.Text & ";" & pd9.Text & ";" & pd10.Text & ";" & pd11.Text & ";" &pd12.Text & ";" & pd13.Text & ";" & pd14.Text & ";" & pd15.Text & ";" & pd16.Text & ";" & pd17.Text &  ";" & otros2.Text & ";" & pd18.Text & ";"
	'e=Page1.np1.Text & ";" & Page1.np2.Text & ";" &Page1.np3.Text & ";" & Page1.np4.Text & ";" & Page1.np5.Text & ";" &Page1.np6.Text & ";" &Page1.np7.Text & ";" & Page1.np8.Text & ";" & Page1.np9.Text & ";" & Page1.otros.Text & ";"&  Page1.np10.Text & ";" & Page1.nd1.Text & ";" &Page1.nd2.Text & ";" & Page1.nd3.Text & ";" & Page1.nd4.Text & ";" & Page1.nd5.Text & ";" & Page1.nd6.Text & ";" & Page1.nd7.Text & ";" & Page1.nd8.Text & ";" & Page1.nd9.Text & ";" & Page1.nd10.Text & ";" & Page1.nd11.Text & ";" &Page1.nd12.Text & ";" & Page1.nd13.Text & ";" & Page1.nd14.Text & ";" & Page1.nd15.Text & ";" & Page1.nd16.Text & ";" & Page1.nd17.Text &  ";" & Page1.otros2.Text & ";" & Page1.nd18.Text & ";"

'	y=Page3.emp1.SelectedItem
'	z=y.SubString2(0,2)
'	u=z & ";"& Page3.pallet1.Text & ";"& Page3.var1.Text &  ";"& Page3.marca1.SelectedItem & ";"& Page3.env1.Text & ";"& Page3.calidad1.SelectedItem &  ";"& Page3.sello1.Text & ";"&  Page3.peso1.Text & ";"& Page3.apariencia1.SelectedItem &  ";"& Page3.color1.Text & ";"& Page3.temp1.Text & ";"& Page3.promedio1.Text & ";"& Page3.max1.Text & ";"& Page3.min1.Text & ";"& Page3.calidinterna1.Text & ";"& Page3.bitter1.Text & ";"& Page3.manchas1.Text & ";" & Page3.asoleado1.Text &  ";"& Page3.heridas1.Text & ";"& Page3.total1.Text
'	y=Page3.emp2.SelectedItem
'	z=y.SubString2(0,2)
'	v=z & ";"& Page3.pallet2.Text & ";"& Page3.var2.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	y=Page3.emp3.SelectedItem
'	z=y.SubString2(0,2)
'	w=z & ";"& Page3.pallet3.Text & ";"& Page3.var3.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	y=Page3.emp4.SelectedItem
'	z=y.SubString2(0,2)
'	x=z & ";"& Page3.pallet4.Text & ";"& Page3.var4.Text &  ";"& Page3.marca4.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidinterna2.Text & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	
''	
'	y=Page1.emp1.SelectedItem
'	z=y.SubString2(0,2)
'    j=z & ";"& Page1.pallet4.Text & ";"& Page1.var4.Text &  ";"& Page1.marca4.SelectedItem & ";"& Page1.env4.Text & ";"& Page1.calidad4.SelectedItem &  ";"& Page1.sello4.Text & ";"&  Page1.peso4.Text & ";"& Page1.apariencia4.SelectedItem &  ";"& Page1.color4.Text & ";"& Page1.temp4.Text & ";"& Page1.plu4.Text & ";"& Page1.promedio4.Text & ";"& Page1.max4.Text & ";"& Page1.min4.Text & ";"& Page1.calidadinterna4.SelectedItem & ";"& Page1.bitter4.Text & ";"& Page1.manchas4.Text & ";" & Page1.asoleado4.Text &  ";"& Page1.heridas4.Text & ";"& Page1.total4.Text
'
'
'	h=z & ";"& Page1.pallet3.Text & ";"& Page1.var3.Text &  ";"& Page1.marca3.SelectedItem & ";"& Page1.env3.Text & ";"& Page1.calidad3.SelectedItem &  ";"& Page1.sello3.Text & ";"&  Page1.peso3.Text & ";"& Page1.apariencia3.SelectedItem &  ";"& Page1.color3.Text & ";"& Page1.temp3.Text & ";"& Page1.plu3.Text & ";"& Page1.promedio3.Text & ";"& Page1.max3.Text & ";"& Page1.min3.Text & ";"& Page1.calidadinterna3.SelectedItem & ";"& Page1.bitter3.Text & ";"& Page1.manchas3.Text & ";" & Page1.asoleado3.Text &  ";"& Page1.heridas3.Text & ";"& Page1.total3.Text
'
'	g=z & ";"& Page1.pallet2.Text & ";"& Page1.var2.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.plu2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
'	f=z & ";"& Page1.pallet1.Text & ";"& Page1.var1.Text &  ";"& Page1.marca1.SelectedItem & ";"& Page1.env1.Text & ";"& Page1.calidad1.SelectedItem &  ";"& Page1.sello1.Text & ";"&  Page1.peso1.Text & ";"& Page1.apariencia1.SelectedItem &  ";"& Page1.color1.Text & ";"& Page1.temp1.Text & ";"& Page1.plu1.Text & ";"& Page1.promedio1.Text & ";"& Page1.max1.Text & ";"& Page1.min1.Text & ";"& Page1.calidadinterna1.SelectedItem & ";"& Page1.bitter1.Text & ";"& Page1.manchas1.Text & ";" & Page1.asoleado1.Text &  ";"& Page1.heridas1.Text & ";"& Page1.total1.Text
'	y=Page3.emp1.SelectedItem
'	z=y.SubString2(0,2)
'	
'	e=z & ";"& Page3.pallet4.Text & ";"& Page3.var4.Text &  ";"& Page3.marca4.SelectedItem & ";"& Page3.env4.Text & ";"& Page3.calidad4.SelectedItem &  ";"& Page3.sello4.Text & ";"&  Page3.peso4.Text & ";"& Page3.apariencia4.SelectedItem &  ";"& Page3.color4.Text & ";"& Page3.temp4.Text & ";"& Page3.plu4.Text & ";"& Page3.promedio4.Text & ";"& Page3.max4.Text & ";"& Page3.min4.Text & ";"& Page3.calidadinterna4.SelectedItem & ";"& Page3.bitter4.Text & ";"& Page3.manchas4.Text & ";" & Page3.asoleado4.Text &  ";"& Page3.heridas4.Text & ";"& Page3.total4.Text
'	d=z & ";"& Page3.pallet3.Text & ";"& Page3.var3.Text &  ";"& Page3.marca3.SelectedItem & ";"& Page3.env3.Text & ";"& Page3.calidad3.SelectedItem &  ";"& Page3.sello3.Text & ";"&  Page3.peso3.Text & ";"& Page3.apariencia3.SelectedItem &  ";"& Page3.color3.Text & ";"& Page3.temp3.Text & ";"& Page3.plu3.Text & ";"& Page3.promedio3.Text & ";"& Page3.max3.Text & ";"& Page3.min3.Text & ";"& Page3.calidadinterna3.SelectedItem & ";"& Page3.bitter3.Text & ";"& Page3.manchas3.Text & ";" & Page3.asoleado3.Text &  ";"& Page3.heridas3.Text & ";"& Page3.total3.Text
'	c=z & ";"& Page3.pallet2.Text & ";"& Page3.var2.Text &  ";"& Page3.marca2.SelectedItem & ";"& Page3.env2.Text & ";"& Page3.calidad2.SelectedItem &  ";"& Page3.sello2.Text & ";"&  Page3.peso2.Text & ";"& Page3.apariencia2.SelectedItem &  ";"& Page3.color2.Text & ";"& Page3.temp2.Text & ";"& Page3.plu2.Text & ";"& Page3.promedio2.Text & ";"& Page3.max2.Text & ";"& Page3.min2.Text & ";"& Page3.calidadinterna2.SelectedItem & ";"& Page3.bitter2.Text & ";"& Page3.manchas2.Text & ";" & Page3.asoleado2.Text &  ";"& Page3.heridas2.Text & ";"& Page3.total2.Text
'	a=z & ";"& Page3.pallet1.Text & ";"& Page3.var1.Text &  ";"& Page3.marca1.SelectedItem & ";"& Page3.env1.Text & ";"& Page3.calidad1.SelectedItem &  ";"& Page3.sello1.Text & ";"&  Page3.peso1.Text & ";"& Page3.apariencia1.SelectedItem &  ";"& Page3.color1.Text & ";"& Page3.temp1.Text & ";"& Page3.plu1.Text & ";"& Page3.promedio1.Text & ";"& Page3.max1.Text & ";"& Page3.min1.Text & ";"& Page3.calidadinterna1.SelectedItem & ";"& Page3.bitter1.Text & ";"& Page3.manchas1.Text & ";" & Page3.asoleado1.Text &  ";"& Page3.heridas1.Text & ";"& Page3.total1.Text
'
'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)
'
'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)
'
'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)
'
'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)
'	
'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)
If com1=True Then 
	y=Page4.emp1.SelectedItem
    z=y.SubString2(0,2)
		a=z & ";"& Page4.pallet1.Text & ";"& Page4.temp1.Text & ";"& Page4.plu1.Text & ";"& Page4.promedio1.Text & ";"& Page4.Max1.Text & ";"& Page4.Min1.Text
		
	y=Page4.emp2.SelectedItem
	z=y.SubString2(0,2)
	
		e=z & ";"& Page4.pallet2.Text & ";"& Page4.temp2.Text & ";"& Page4.plu2.Text & ";"& Page4.promedio2.Text & ";"& Page4.Max2.Text & ";"& Page4.Min2.Text
	
	y=Page4.emp3.SelectedItem
	z=y.SubString2(0,2)
	
		h=z & ";"& Page4.pallet3.Text & ";"& Page4.temp3.Text & ";"& Page4.plu3.Text & ";"& Page4.promedio3.Text & ";"& Page4.Max3.Text & ";"& Page4.Min3.Text
	y=Page4.emp4.SelectedItem
	z=y.SubString2(0,2)
		k=z & ";"& Page4.pallet4.Text & ";"& Page4.temp4.Text & ";"& Page4.plu4.Text & ";"& Page4.promedio4.Text & ";"& Page4.Max4.Text & ";"& Page4.Min4.Text
	
	y=Page4.emp5.SelectedItem
	z=y.SubString2(0,2)
		o=z & ";"& Page4.pallet5.Text & ";"& Page4.temp5.Text & ";"& Page4.plu5.Text & ";"& Page4.promedio5.Text & ";"& Page4.Max5.Text & ";"& Page4.Min5.Text
	y=Page4.emp6.SelectedItem
	z=y.SubString2(0,2)
		r=z & ";"& Page4.pallet6.Text & ";"& Page4.temp6.Text & ";"& Page4.plu6.Text & ";"& Page4.promedio6.Text & ";"& Page4.Max6.Text & ";"& Page4.Min6.Text
End If
	If com2=True Then
	
	
	
	
	y=Page5.emp1.SelectedItem
	z=y.SubString2(0,2)
	'
		c=z & ";"& Page5.pallet1.Text & ";"& Page5.temp1.Text & ";"& Page5.plu1.Text & ";"& Page5.promedio1.Text & ";"& Page5.Max1.Text & ";"& Page5.Min1.Text
	y=Page5.emp2.SelectedItem
	z=y.SubString2(0,2)
		f=z & ";"& Page5.pallet2.Text & ";"& Page5.temp2.Text & ";"& Page5.plu2.Text & ";"& Page5.promedio2.Text & ";"& Page5.Max2.Text & ";"& Page5.Min2.Text
		y=Page5.emp3.SelectedItem
	z=y.SubString2(0,2)
		u=z & ";"& Page5.pallet3.Text & ";"& Page5.temp3.Text & ";"& Page5.plu3.Text & ";"& Page5.promedio3.Text & ";"& Page5.Max3.Text & ";"& Page5.Min3.Text
	y=Page5.emp4.SelectedItem
	z=y.SubString2(0,2)
		m=z & ";"& Page5.pallet4.Text & ";"& Page5.temp4.Text & ";"& Page5.plu4.Text & ";"& Page5.promedio4.Text & ";"& Page5.Max4.Text & ";"& Page5.Min4.Text
		y=Page5.emp5.SelectedItem 
	z=y.SubString2(0,2)
		p=z & ";"& Page5.pallet5.Text & ";"& Page5.temp5.Text & ";"& Page5.plu5.Text & ";"& Page5.promedio5.Text & ";"& Page5.Max5.Text & ";"& Page5.Min5.Text
	y=Page5.emp6.SelectedItem
	z=y.SubString2(0,2)
	    s=z & ";"& Page5.pallet6.Text & ";"& Page5.temp6.Text & ";"& Page5.plu6.Text & ";"& Page5.promedio6.Text & ";"& Page5.Max6.Text & ";"& Page5.Min6.Text
	
	
	
	
	End If
	If com3=True Then
	
	
	y=Page6.emp1.SelectedItem
	z=y.SubString2(0,2)
	'
		d=z & ";"& Page6.pallet1.Text & ";"& Page6.temp1.Text & ";"& Page6.plu1.Text & ";"& Page6.promedio1.Text  & ";"& Page6.Max1.Text& ";"& Page6.Min1.Text
	
	
	
	y=Page6.emp2.SelectedItem
	z=y.SubString2(0,2)
		g=z & ";"& Page6.pallet2.Text & ";"& Page6.temp2.Text & ";"& Page6.plu2.Text & ";"& Page6.promedio2.Text & ";"& Page6.Max2.Text& ";"& Page6.Min2.Text
	
	
	y=Page6.emp3.SelectedItem
	
	z=y.SubString2(0,2)
		j=z & ";"& Page6.pallet3.Text & ";"& Page6.temp3.Text & ";"& Page6.plu3.Text & ";"& Page6.promedio3.Text  & ";"& Page6.Max3.Text& ";"& Page6.Min3.Text
	
	y=Page6.emp4.SelectedItem
	z=y.SubString2(0,2)
		n=z & ";"& Page6.pallet4.Text & ";"& Page6.temp4.Text & ";"& Page6.plu4.Text & ";"& Page6.promedio4.Text  & ";"& Page6.Max4.Text& ";"& Page6.Min4.Text
	y=Page6.emp5.SelectedItem
	
	z=y.SubString2(0,2)
		q=z & ";"& Page6.pallet5.Text & ";"& Page6.temp5.Text & ";"& Page6.plu5.Text & ";"& Page6.promedio5.Text  & ";"& Page6.Max5.Text& ";"& Page6.Min5.Text
	
	y=Page6.emp6.SelectedItem
	z=y.SubString2(0,2)
		t=z & ";"& Page6.pallet6.Text & ";"& Page6.temp6.Text & ";"& Page6.plu6.Text & ";"& Page6.promedio6.Text  & ";"& Page6.Max6.Text & ";"& Page6.Min6.Text

End If









'	aa=z & ";"& Page1.pallet1.Text & ";"& Page1.var1.Text &  ";"& Page1.marca1.SelectedItem & ";"& Page1.env1.Text & ";"& Page1.calidad1.SelectedItem &  ";"& Page1.sello1.Text & ";"&  Page1.peso1.Text & ";"& Page1.apariencia1.SelectedItem &  ";"& Page1.color1.Text & ";"& Page1.temp1.Text & ";"& Page1.plu1.Text & ";"& Page1.promedio1.Text & ";"& Page1.max1.Text & ";"& Page1.min1.Text & ";"& Page1.calidadinterna1.SelectedItem & ";"& Page1.bitter1.Text & ";"& Page1.manchas1.Text & ";" & Page1.asoleado1.Text &  ";"& Page1.heridas1.Text & ";"& Page1.total1.Text
'	y=Page1.emp2.SelectedItem
'	z=y.SubString2(0,2)
'	ab=z & ";"& Page1.pallet2.Text & ";"& Page1.var2.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
'	y=Page1.emp3.SelectedItem
'	z=y.SubString2(0,2)
'	ac=z & ";"& Page1.pallet3.Text & ";"& Page1.var3.Text &  ";"& Page1.marca2.SelectedItem & ";"& Page1.env2.Text & ";"& Page1.calidad2.SelectedItem &  ";"& Page1.sello2.Text & ";"&  Page1.peso2.Text & ";"& Page1.apariencia2.SelectedItem &  ";"& Page1.color2.Text & ";"& Page1.temp2.Text & ";"& Page1.promedio2.Text & ";"& Page1.max2.Text & ";"& Page1.min2.Text & ";"& Page1.calidadinterna2.SelectedItem & ";"& Page1.bitter2.Text & ";"& Page1.manchas2.Text & ";" & Page1.asoleado2.Text &  ";"& Page1.heridas2.Text & ";"& Page1.total2.Text
'	y=Page1.emp4.SelectedItem
'	z=y.SubString2(0,2)
'	ad=z & ";"& Page1.pallet4.Text & ";"& Page1.var4.Text &  ";"& Page1.marca4.SelectedItem & ";"& Page1.env4.Text & ";"& Page1.calidad4.SelectedItem &  ";"& Page1.sello4.Text & ";"&  Page1.peso4.Text & ";"& Page1.apariencia4.SelectedItem &  ";"& Page1.color4.Text & ";"& Page1.temp4.Text & ";"& Page1.plu4.Text & ";"& ";"& Page1.promedio4.Text & ";"& Page1.max4.Text & ";"& Page1.min4.Text & ";"& Page1.calidadinterna4.SelectedItem & ";"& Page1.bitter4.Text & ";"& Page1.manchas4.Text & ";" & Page1.asoleado4.Text &  ";"& Page1.heridas4.Text & ";"& Page1.total4.Text
'	
'	
		'a=b & c & d & f & e '& g '& h 
'	h="Informe" & ";" & "fecha" & ";" & "M"& ";" & "Grado" & ";" &"Empresa"& ";" & "Sello" & ";"
	If com3=True Or com2=True Or com1=True Then
	
	
		i="Empresa" & ";" & "Pallet" & ";" & "Temp." & ";" &  "Plu" & ";" & "Promedio"  & ";"& "Maximo" & ";" & "Minimo" ' & ";"  & "Peso" & ";" & "Ap.inicial" & ";" &"Color " & ";" & "Temp." & ";"  & "plu" & ";" & "Prom."& ";" & "Max." & ";" & "Min." & ";" & "Cal.Interna" & ";"  & "Bitter" & ";"  & "Manchas" & ";"  & "Asoleado" & ";" &  "Heridas" & ";" & "Total"
'	j="papel"& ";" & "%ele1" & ";" & "%ele2" & ";" & "%ele3" & ";" & "emb"& ";" &"Up" & ";"& "obs" & ";"  & "dano" & ";"  & "RECHAZO" & ";"
'	k="Carpocapsa" & ";" & "Bicho de cesto" & ";" & "Piojo de SJose" & ";" &  "Cochinilla" & ";" & "Agamuzado" & ";" & "Psillido" & ";" & "Oidio" & ";" & "Sarna" & ";" & "Trips" & ";" & "Otros" & ";" & "%Otros" & ";" & "Golpes" & ";" & "Heridas Pedunc" & ";" & "Cracking" & ";" & "Bitter Pit" & ";" & "Lenticelosis" & ";" & "Escaldadura" & ";" & "Golpe de granizo" & ";" &"Mancha de helada" & ";" & "Rameado" & ";" & "Asoleada" & ";" & "Deformada" & ";" &"Fitotoxicidad" & ";" & "Caliz amarillo" & ";" & "Fruta madura" & ";" & "Corazon a/m" & ";" & "Fuera de tam" & ";" & "Sin pedunc" & ";" & "otros2" & ";" & "%otros2"
'	p= h & i & j & k
	'writer.Initialize(File.OpenOutput(File.DirRootExternal & "/Ftp3" ,z & "e" & id.Text &".csv",False))
'	writer.Initialize(File.OpenOutput( ftp3 ,"enc" & id.Text &".csv",False))
''	writer.
'	writer.WriteLine(k)
'	writer.WriteLine(b)
'	writer.Close
	'writer2.Initialize(File.OpenOutput(File.DirRootExternal & "/Calidad/Bak" ,z & "e" & id.Text &".csv",False))
	writer2.Initialize(File.OpenOutput( ftp3 ,"adc" & id.Text &".csv",False))
	writer2.WriteLine(i)
	writer2.WriteLine(a)
	writer2.WriteLine(e)
	writer2.WriteLine(h)
	writer2.WriteLine(k)
	writer2.WriteLine(o)
	writer2.WriteLine(r)
	writer2.WriteLine(c)
	writer2.WriteLine(f)
	writer2.WriteLine(u)
	writer2.WriteLine(m)
	writer2.WriteLine(p)
	writer2.WriteLine(s)
	writer2.WriteLine(d)
	writer2.WriteLine(g)
	writer2.WriteLine(j)
	writer2.WriteLine(n)
	writer2.WriteLine(q)
	writer2.WriteLine(t)
'	writer2.WriteLine(s)
'	writer2.WriteLine(t)
'	writer2.WriteLine(u)
'	writer2.WriteLine(v)
'	writer2.WriteLine(w)
'	writer2.WriteLine(x)
'	writer2.WriteLine(aa)
'	writer2.WriteLine(ab)
'	writer2.WriteLine(ac)
'	writer2.WriteLine(ad)
'	
'	
'	
'	
	writer2.Close
		End If
		
	'sumanum
End Sub
Sub final3
	 'genera el archivo .txt
	Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t, u ,v ,w,x ,y,z,aa,ab,ac,ad   As String
	'Dim writer As TextWriter
	Dim writer2 As  TextWriter
	'Dim writer3 As TextWriter
	''y=emp.SelectedItem
	'z=y.SubString2(0,2)
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	'bak =rp.GetSafeDirDefaultExternal("bak")
	'Page1.

'	y=Page4.emp1.SelectedItem
'	z=y.SubString2(0,2)

	'y=Page4.emp1.SelectedItem
'z=""'y.SubString2(0,2)
'
'	a
	i="Pallet" & ";" & "Peso1" & ";" &   "Peso2" & ";" & "Peso3" & ";" &  "Peso4"& ";"&  "Peso5"&";"& "Peso6" & ";" &   "Peso7" & ";" & "Peso8" & ";" &  "Peso9" & ";"&  "Peso10"& ";"&"Peso11"& ";" &"Peso12"

If bol1=True Then
	c = Page7.pallet1.text & ";" & Page7.Peso1b.text & ";" & Page7.Peso2b.text & ";" & Page7.Peso3b.text & ";" & Page7.Peso4b.text & ";" & Page7.Peso5b.text & ";" & Page7.Peso6b.text & ";" & Page7.Peso7b.text & ";" & Page7.Peso8b.text & ";" & Page7.Peso9b.text & ";" & Page7.Peso10b.text & ";" & Page7.Peso11b.text & ";" & Page7.Peso12b.text
	d = Page7.Pallet2.text & ";" & Page7.Peso1a.text & ";" & Page7.Peso2a.text & ";" & Page7.Peso3a.text & ";" & Page7.Peso4a.text & ";" & Page7.Peso5a.text & ";" & Page7.Peso6a.text & ";" & Page7.Peso7a.text & ";" & Page7.Peso8a.text & ";" & Page7.Peso9a.text & ";" & Page7.Peso10a.text & ";" & Page7.Peso11a.text & ";" & Page7.Peso12a.text
	e = Page7.Pallet3.text & ";" & Page7.Peso1c.text & ";" & Page7.Peso2c.text & ";" & Page7.Peso3c.text & ";" & Page7.Peso4c.text & ";" & Page7.Peso5c.text & ";" & Page7.Peso6c.text & ";" & Page7.Peso7c.text & ";" & Page7.Peso8c.text & ";" & Page7.Peso9c.text & ";" & Page7.Peso10c.text & ";" & Page7.Peso11c.text & ";" & Page7.Peso12c.text
	f = Page7.Pallet4.text & ";" & Page7.Peso1d.text & ";" & Page7.Peso2d.text & ";" & Page7.Peso3d.text & ";" & Page7.Peso4d.text & ";" & Page7.Peso5d.text & ";" & Page7.Peso6d.text & ";" & Page7.Peso7d.text & ";" & Page7.Peso8d.text & ";" & Page7.Peso9d.text & ";" & Page7.Peso10d.text & ";" & Page7.Peso11d.text & ";" & Page7.Peso12d.text
End If


If bol2=True Then
	g = Page8.Pallet1.text &  ";" & Page8.Peso1b.text & ";" & Page8.Peso2b.text & ";" & Page8.Peso3b.text & ";" & Page8.Peso4b.text & ";" & Page8.Peso5b.text & ";" & Page8.Peso6b.text & ";" & Page8.Peso7b.text & ";" & Page8.Peso8b.text & ";" & Page8.Peso9b.text & ";" & Page8.Peso10b.text & ";" & Page8.Peso11b.text & ";" & Page8.Peso12b.text
	h = Page8.Pallet2.text & ";" & Page8.Peso1a.text & ";" & Page8.Peso2a.text & ";" & Page8.Peso3a.text & ";" & Page8.Peso4a.text & ";" & Page8.Peso5a.text & ";" & Page8.Peso6a.text & ";" & Page8.Peso7a.text & ";" & Page8.Peso8a.text & ";" & Page8.Peso9a.text & ";" & Page8.Peso10a.text & ";" & Page8.Peso11a.text & ";" & Page8.Peso12a.text
	j = Page8.Pallet3.text & ";" & Page8.Peso1c.text & ";" & Page8.Peso2c.text & ";" & Page8.Peso3c.text & ";" & Page8.Peso4c.text & ";" & Page8.Peso5c.text & ";" & Page8.Peso6c.text & ";" & Page8.Peso7c.text & ";" & Page8.Peso8c.text & ";" & Page8.Peso9c.text & ";" & Page8.Peso10c.text & ";" & Page8.Peso11c.text & ";" & Page8.Peso12c.text
	k = Page8.Pallet4.text & ";" & Page8.Peso1d.text & ";" & Page8.Peso2d.text & ";" & Page8.Peso3d.text & ";" & Page8.Peso4d.text & ";" & Page8.Peso5d.text & ";" & Page8.Peso6d.text & ";" & Page8.Peso7d.text & ";" & Page8.Peso8d.text & ";" & Page8.Peso9d.text & ";" & Page8.Peso10d.text & ";" & Page8.Peso11d.text & ";" & Page8.Peso12d.text


End If







'
		'a=b & c & d & f & e '& g '& h 
'	h="Informe" & ";" & "fecha" & ";" & "M"& ";" & "Grado" & ";" &"Empresa"& ";" & "Sello" & ";"
	'i="Empresa" & ";" & "Pallet" & ";" & "Temp." & ";" &  "Plu" & ";" & "Promedio" & ";" & "Minimo" & ";"& "Maximo"  ' & ";"  & "Peso" & ";" & "Ap.inicial" & ";" &"Color " & ";" & "Temp." & ";"  & "plu" & ";" & "Prom."& ";" & "Max." & ";" & "Min." & ";" & "Cal.Interna" & ";"  & "Bitter" & ";"  & "Manchas" & ";"  & "Asoleado" & ";" &  "Heridas" & ";" & "Total" 
'	j="papel"& ";" & "%ele1" & ";" & "%ele2" & ";" & "%ele3" & ";" & "emb"& ";" &"Up" & ";"& "obs" & ";"  & "dano" & ";"  & "RECHAZO" & ";"
'	k="Carpocapsa" & ";" & "Bicho de cesto" & ";" & "Piojo de SJose" & ";" &  "Cochinilla" & ";" & "Agamuzado" & ";" & "Psillido" & ";" & "Oidio" & ";" & "Sarna" & ";" & "Trips" & ";" & "Otros" & ";" & "%Otros" & ";" & "Golpes" & ";" & "Heridas Pedunc" & ";" & "Cracking" & ";" & "Bitter Pit" & ";" & "Lenticelosis" & ";" & "Escaldadura" & ";" & "Golpe de granizo" & ";" &"Mancha de helada" & ";" & "Rameado" & ";" & "Asoleada" & ";" & "Deformada" & ";" &"Fitotoxicidad" & ";" & "Caliz amarillo" & ";" & "Fruta madura" & ";" & "Corazon a/m" & ";" & "Fuera de tam" & ";" & "Sin pedunc" & ";" & "otros2" & ";" & "%otros2"
'	p= h & i & j & k
	'writer.Initialize(File.OpenOutput(File.DirRootExternal & "/Ftp3" ,z & "e" & id.Text &".csv",False))
'	writer.Initialize(File.OpenOutput( ftp3 ,"enc" & id.Text &".csv",False))
''	writer.
'	writer.WriteLine(k)
'	writer.WriteLine(b)
'	writer.Close
If bol1=True Or bol2= True Then
	'writer2.Initialize(File.OpenOutput(File.DirRootExternal & "/Calidad/Bak" ,z & "e" & id.Text &".csv",False))
	writer2.Initialize(File.OpenOutput( ftp3 ,"BOL" & id.Text &".csv",False))
	writer2.WriteLine(i)
	writer2.WriteLine(c)
	writer2.WriteLine(d)
	writer2.WriteLine(e)
	writer2.WriteLine(f)
	writer2.WriteLine(g)
	writer2.WriteLine(h)
	writer2.WriteLine(j)
	writer2.WriteLine(k)
'	writer2.WriteLine(u)
'	writer2.WriteLine(m)
'	writer2.WriteLine(p)
'	writer2.WriteLine(s)
'	writer2.WriteLine(d)
'	writer2.WriteLine(g)
'	writer2.WriteLine(j)
'	writer2.WriteLine(n)
'	writer2.WriteLine(q)
'	writer2.WriteLine(t)
''	writer2.WriteLine(s)
''	writer2.WriteLine(t)
''	writer2.WriteLine(u)
''	writer2.WriteLine(v)
''	writer2.WriteLine(w)
''	writer2.WriteLine(x)
''	writer2.WriteLine(aa)
''	writer2.WriteLine(ab)
''	writer2.WriteLine(ac)
''	writer2.WriteLine(ad)
'	
'	
'	
'	
	writer2.Close
		End If
		
	'sumanum
End Sub
Sub foto As Boolean 'averigua si saco foto
	Dim a,b,c,d,e,f,h,i As Boolean
	Dim savefile,savefile1,savefile2,savefile3, savefile4,savefile5,savefile6,savefile7,savefile8 As String
	'Dim de,em As String
	
	'de=emp.SelectedItem
	'em=de.SubString2(0,2)
	'fot7009_6.jpg
	 savefile= "fot" & id.Text & "_1" & ".jpg"
	savefile1= "fot" & id.Text & "_2" & ".jpg"
	savefile2= "fot" & id.Text & "_3" & ".jpg"
	savefile3= "fot" & id.Text & "_4" & ".jpg"
	savefile4= "fot" & id.Text & "_5" & ".jpg"
	savefile5= "fot" & id.Text & "_6" & ".jpg"
	savefile6= "fot" & id.Text & "_7" & ".jpg"
	savefile7= "fot" & id.Text & "_8" & ".jpg"
	'savefile2= "D5e" & id.Text& "b" & ".jpg"
	
	ftp3 = rp.GetSafeDirDefaultExternal("Ftp3")


	
	'savedir = File.DirRootExternal  & "/Ftp2"
	a=File.Exists (ftp3, savefile)
	b=File.Exists (ftp3, savefile1)
	c=File.Exists (ftp3, savefile2)
	d=File.Exists (ftp3, savefile3)
	e=File.Exists (ftp3, savefile4)
	f=File.Exists (ftp3, savefile5)
	h=File.Exists (ftp3, savefile6)
	i=File.Exists (ftp3, savefile7)
	
	If File.Exists (ftp3, savefile) = False Or  File.Exists (ftp3, savefile1) = False Or File.Exists (ftp3, savefile2) = False Or File.Exists (ftp3, savefile3) = False Or  File.Exists (ftp3, savefile4) = False Or File.Exists (ftp3, savefile5) = False Or  File.Exists (ftp3, savefile6) = False Or File.Exists (ftp3, savefile7) = False Then
		'Msgbox("Foto no sacada","ok")
		
		MsgboxAsync("Foto no sacada","ok")
		Return False
	Else
		MsgboxAsync("Fotos ok","ok")
		Return True
		
	End If
End Sub

Sub valid As  Boolean ''valida cajas de texto y combos
	Dim a,b,c,d,e As Boolean
	a=False
	b=False
	c=False
	d=False
	
	a=id.Text="" Or fecha.Text ="" Or cliente.Text="" Or hora.text="" 
	b=conten.Text=""  Or vapor.Text="" Or destino.Text="" Or cant.Text="" Or tecnico.Text=""
	'c=tam.Text="" Or var.Text="" Or tempe.Text="" Or tempe.Text="" Or lote.Text=""
	'd=emb.Text="" Or up.SelectedIndex=0
	'valida si tiene al menos una categoria de  daño
	
	If a=True Or b= True Or carg1=False Or carg2=False   Then'Or c=True Or d=True Then
		Msgbox("Debe completar la primera pantalla o las 8 obligatorias","ERROR")
		Return False
	End If
	Return True
	
	
End Sub
	
'
'Sub test_click	
'	blanqueo2

'	
'	'End Sub

Private Sub Button1_Click
'	If Page1.valid=True Then 
'	ToastMessageShow("Initializing PDF Writer",True)
'	End If
	'final2
	'final3
	fotollenar
End Sub

Private Sub test_Click
' validad primera
' validad segunda
' validad 3ra
' validar 8 fotos
' final
' informe chico
' y ftpr correo u
' aumentar en 1 informe
' volver a 0 las fotos
' iniciar devuelta
 'final
	prueba_Click
	
	
' informe2
 'informe3
End Sub