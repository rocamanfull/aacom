B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@


Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim ScrollView1 As ScrollView
	Dim Bmp As Bitmap
	Dim Panel2 As Panel
	Public Page1 As B4XPage1
	Public Page2 As B4XPage2
	Public Provider As FileProvider
	'Provider.Initialize
	Private cargas,filedir,videofiledir As String
	Private rp As RuntimePermissions
	
	cargas = rp.GetSafeDirDefaultExternal("cargas")


	
	
	Private Label1 As Label
	Private Label10 As Label
	Private Label11 As Label
	Private Label12 As Label
	Private Label14 As Label
	Private Label15 As Label
	Private Label16 As Label
	Private Label17 As Label
	Private Label18 As Label
	Private Label19 As Label
	Private Label2 As Label
	Private Label20 As Label
	Private Label21 As Label
	Private Label22 As Label
	Private Label23 As Label
	Private Label24 As Label
	Private Label25 As Label
	Private Label26 As Label
	Private Label27 As Label
	Private Label28 As Label
	Private Label29 As Label
	Private Label3 As Label
	Private Label30 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private Label8 As Label
	Private Label9 As Label

	
'	
'	Public nd1 As EditText
'	Public nd10 As EditText
'	Public nd11 As EditText
'	Public nd13 As EditText
'	Public nd15 As EditText
'	Public nd16 As EditText
'	Public nd17 As EditText
'	Public nd18 As EditText
'	Public nd2 As EditText
'	Public nd3 As EditText
'	Public nd4 As EditText
'	Public nd5 As EditText
'	Public nd6 As EditText
'	Public nd7 As EditText
'	Public nd8 As EditText
'	Public nd9 As EditText
'	Public np1 As EditText
'	
'	Public np10 As EditText
'	Public np2 As EditText
'	Public np3 As EditText
'	Public np4 As EditText
'	Public np5 As EditText
'	Public np6 As EditText
'	Public np7 As EditText
'	Public np8 As EditText
'	Public np9 As EditText
'	Public otros As EditText
'	Public otros2 As EditText
'	Public pd1 As EditText
'	Public pd10 As EditText
'	Public pd11 As EditText
'	Public pd13 As EditText
'	Public pd14 As EditText
'	Public pd15 As EditText
'	Public pd16 As EditText
'	Public pd2 As EditText
'	Public pd3 As EditText
'	Public pd4 As EditText
'	Public pd5 As EditText
'	Public pd6 As EditText
'	Public pd7 As EditText
'	Public pd8 As EditText
'	Public pd18 As EditText
'	Public pd17 As EditText
'	Public pd9 As EditText
'	Public pp1 As EditText
'	Public pp10 As EditText
'	Public pp2 As EditText
'	Public pp3 As EditText
'	Public pp4 As EditText
'	Public pp5 As EditText
'	Public pp6 As EditText
'	Public pp7 As EditText
'	Public pp8 As EditText
'	Public pp9 As EditText
'	Public nd12 As EditText
'	Public nd14 As EditText
'	Public pd12 As EditText
	Private defec As String
	Private defec2 As String
'	

'	Public emp1 As Spinner
'	Public emp2 As Spinner
'	Public emp3 As Spinner
'	Public emp4 As Spinner

	Public pallet1 As EditText
	Public pallet2 As EditText
	Public pallet3 As EditText
	Public pallet4 As EditText

	
'	
'	Public var1 As EditText
'	Public var2 As EditText
'	Public var3 As EditText
'	Public var4 As EditText
'
'	Public marca1 As Spinner
'	Public marca2 As Spinner
'	Public marca3 As Spinner
'	Public marca4 As Spinner
'	
'	Public env1 As EditText
'	Public env2 As EditText
'	Public env3 As EditText
'	Public env4 As EditText
'	
'	Public calidad1 As Spinner
'	Public calidad2 As Spinner
'	Public calidad3 As Spinner
'	Public calidad4 As Spinner
'
	Public sello1 As EditText
	Public sello2 As EditText
	Public sello3 As EditText
	Public sello4 As EditText
'	
'	Public date1 As Button
'	Public date2 As Button
'	Public date3 As Button
'	Public date4 As Button
'
'	Public peso1 As EditText
'	Public peso2 As EditText
'	Public peso3 As EditText
'	Public peso4 As EditText
'	
'	Public apariencia1 As Spinner
'	Public apariencia2 As Spinner
'	Public apariencia3 As Spinner
'	Public apariencia4 As Spinner
'	
'	Public color1 As EditText
'	Public color2 As EditText
'	Public color3 As EditText
'	Public color4 As EditText
'	
'	Public temp1 As EditText
'	Public temp2 As EditText
'	Public temp3 As EditText
'	Public temp4 As EditText
'	
'	Public promedio1 As EditText
'	Public promedio2 As EditText
'	Public promedio3 As EditText
'	Public promedio4 As EditText
'
'	Public max1 As EditText
'	Public max2 As EditText
'	Public max3 As EditText
'	Public max4 As EditText
'
'	Public min1 As EditText
'	Public min2 As EditText
'	Public min3 As EditText
'	Public min4 As EditText
'	Public calidadinterna3 As Spinner
'	Public calidadinterna4 As  Spinner
'	Public calidadinterna1 As  Spinner
'	Public calidadinterna2 As  Spinner
'	
'
'	Public bitter3 As EditText
'	Public bitter4 As EditText
'	Public bitter1 As EditText
'	Public bitter2 As EditText
'
'	Public manchas1 As EditText
'	Public manchas2 As EditText
'	Public manchas3 As EditText
'	Public manchas4 As EditText
'	
'	Public asoleado1 As EditText
'	Public asoleado2 As EditText
'	Public asoleado3 As EditText
'	Public asoleado4 As EditText
'
'	Public heridas1 As EditText
'	Public heridas2 As EditText
'	Public heridas3 As EditText
'	Public heridas4 As EditText
'
'	Public total1 As EditText
'	Public total2 As EditText
'	Public total3 As EditText
'	Public total4 As EditText
'	Public max5 As EditText
'	Public max6 As EditText
'	Public min5 As EditText
'	Public min6 As EditText
'	Public pallet5 As EditText
'	Public pallet6 As EditText
'	Public plu1 As EditText
'	Public plu2 As EditText
'	Public plu3 As EditText
'	Public plu4 As EditText
'	Public plu5 As EditText
'	Public plu6 As EditText
'	Public promedio5 As EditText
'	Public promedio6 As EditText
'	Public temp5 As EditText
'	Public temp6 As EditText
'	
	
	

	
	

	

	
	
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private Button6 As Button
	
	





	Private Label13 As Label
	Private Label32 As Label
	Private Label33 As Label
	Private Label37 As Label
	Private Label38 As Label
	Private Label39 As Label
	Private Label4 As Label
	Private Label40 As Label
	Private Label41 As Label
	Private Label42 As Label
	Private Label43 As Label
	Private Label44 As Label
	Private Label45 As Label
	Private Label46 As Label
	Private Label47 As Label
	Private Label48 As Label
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
	Private Label72 As Label
	Private Label73 As Label
	Private Label74 As Label
	Private Label75 As Label
	Private Label76 As Label
	Private Label77 As Label
	Private Label78 As Label
	Private Label79 As Label
	Private Label80 As Label
	'Private Label81 As Label
	'Private Label82 As Label
	Private Label83 As Label
	Private Label84 As Label
	Private Label85 As Label
	Private Label86 As Label
	Private Label87 As Label
	Private Label88 As Label
	Private Label89 As Label
	Private Label90 As Label
	'Private Label91 As Label
	Private Label92 As Label
	Private Label93 As Label
	Private Label94 As Label
	Private Label95 As Label
	Private Label96 As Label
	Private lblPage1Title As Label
	
	


	Private Button1 As Button

	Private Label31 As Label
	Private Label34 As Label
	Private Label35 As Label
	Private Label36 As Label
	Private Label81 As Label
	Private label99 As Label
	
	
	Public peso10a As EditText
	Public peso10b As EditText
	Public peso10c As EditText
	Public peso10d As EditText
	Public peso11a As EditText
	Public peso11b As EditText
	Public peso11c As EditText
	Public peso11d As EditText
	Public peso12a As EditText
	Public peso12b As EditText
	Public peso12c As EditText
	Public peso12d As EditText
	Public peso1a As EditText
	Public peso1b As EditText
	Public peso1c As EditText
	Public peso1d As EditText
	Public peso2a As EditText
	Public peso2b As EditText
	Public peso2c As EditText
	Public peso2d As EditText
	Public peso3a As EditText
	Public peso3b As EditText
	Public peso3c As EditText
	Public peso3d As EditText
	Public peso4a As EditText
	Public peso4b As EditText
	Public peso4c As EditText
	Public peso4d As EditText
	Public peso5a As EditText
	Public peso5b As EditText
	Public peso5c As EditText
	Public peso5d As EditText
	Public peso6a As EditText
	Public peso6b As EditText
	Public peso6c As EditText
	Public peso6d As EditText
	Public peso7a As EditText
	Public peso7b As EditText
	Public peso7c As EditText
	Public peso7d As EditText
	Public peso8a As EditText
	Public peso8d As EditText
	Public peso8b As EditText
	Public peso8c As EditText
	Public peso9a As EditText
	Public peso9b As EditText
	Public peso9c As EditText
	Public peso9d As EditText
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'Root.LoadLayout("MainPage2")
	ScrollView1.Initialize(5000dip) ' Altura grande para permitir scroll
	Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)
	
	ScrollView1.Panel.LoadLayout("carg2peso2")'("carga2bbbb3x")
'	Page2.Initialize
'	B4XPages.AddPage("Page 2", Page2)
'	Page1.Initialize
'	B4XPages.AddPage("Page 1", Page1)
	'ScrollView1.Initialize(5000dip) ' Altura grande para permitir scroll
	'Root.AddView(ScrollView1, 0, 0, 100%x, 100%y) ' Agregar ScrollView a la vista principal

	' Panel interno dentro del ScrollView
	'Dim innerPanel As Panel
	'innerPanel.Initialize("")
	'ScrollView1.Panel.AddView(innerPanel, 0, 0, 100%x, 5000dip)
	Panel2.Color=Colors.RGB(222,184,135)
	
	lblPage1Title.Text="Bolsas Datos Carga 1"
	Label3.Text="Bolsas Datos Carga 2"
	Label19.Text="Bolsas Datos Carga 3"
	Label70.Text="Bolsas Datos Carga 4"
	B4XPages.SetTitle(Me, "Bolsas Datos Cargas 1-4")
	
	
#if B4a
	ScrollView1.Panel.Height = Panel2.Height
	
	
	#End If
	
	'load the layout to Root
	
'	B4XPages.AddMenuItem(Me, "Info")
'	B4XPages.AddMenuItem(Me, "Daños")
'	B4XPages.AddMenuItem(Me, "Camara")
'	B4XPages.AddMenuItem(Me, "Terminar")
	B4XPages.AddMenuItem(Me, "Info")
	B4XPages.AddMenuItem(Me, "Carga1")
	B4XPages.AddMenuItem(Me, "Carga2")
'	B4XPages.AddMenuItem(Me, "Carga3")
'	B4XPages.AddMenuItem(Me, "Carga4")
'	B4XPages.AddMenuItem(Me, "Carga5")
'	B4XPages.AddMenuItem(Me, "Carga6")
	B4XPages.AddMenuItem(Me, "Bolsa1")
	B4XPages.AddMenuItem(Me, "Bolsa2")
	'B4XPages.AddMenuItem(Me, "Carga7")
	B4XPages.AddMenuItem(Me, "Camara")
'	peg1.AddAll(Array As String("","Cochinilla","Carpocapsa","Corcho","Agamuzado","P.silido","Oidio","Trips","B.Cesto","A.Chata","P.s.jose","Pudricion","Biter.p.len","Escaldada","C.amarillo","C.acuoso","Erinosis","Sarna"))
'	peg2.AddAll(Array As String("","Cochinilla","Carpocapsa","Corcho","Agamuzado","P.silido","Oidio","Trips","B.Cesto","A.Chata","P.s.jose","Pudricion","Biter.p.len","Escaldada","C.amarillo","C.acuoso","Erinosis","Sarna"))
'	peg3.AddAll(Array As String("","Cochinilla","Carpocapsa","Corcho","Agamuzado","P.silido","Oidio","Trips","B.Cesto","A.Chata","P.s.jose","Pudricion","Biter.p.len","Escaldada","C.amarillo","C.acuoso","Erinosis","Sarna"))
'	peg4.AddAll(Array As String("","Cochinilla","Carpocapsa","Corcho","Agamuzado","P.silido","Oidio","Trips","B.Cesto","A.Chata","P.s.jose","Pudricion","Biter.p.len","Escaldada","C.amarillo","C.acuoso","Erinosis","Sarna"))
'	peg5.AddAll(Array As String("","Cochinilla","Carpocapsa","Corcho","Agamuzado","P.silido","Oidio","Trips","B.Cesto","A.Chata","P.s.jose","Pudricion","Biter.p.len","Escaldada","C.amarillo","C.acuoso","Erinosis","Sarna"))
'	df1.AddAll(Array As String("","Rolados","Machuc.","Heridas","Granizo","Asoleado","Fitotoxic.","Crackin","Deshidrat.","Madurez"))
'	df2.AddAll(Array As String("","Rolados","Machuc.","Heridas","Granizo","Asoleado","Fitotoxic.","Crackin","Deshidrat.","Madurez"))
'	df3.AddAll(Array As String("","Rolados","Machuc.","Heridas","Granizo","Asoleado","Fitotoxic.","Crackin","Deshidrat.","Madurez"))
'	df4.AddAll(Array As String("","Rolados","Machuc.","Heridas","Granizo","Asoleado","Fitotoxic.","Crackin","Deshidrat.","Madurez"))
'	df5.AddAll(Array As String("","Rolados","Machuc.","Heridas","Granizo","Asoleado","Fitotoxic.","Crackin","Deshidrat.","Madurez"))
'	dm1.AddAll(Array As String("","Mach.chico","Rameados","Cara B/roja","Sin color","Roces","Deform.","F.de tam."))
'	dm2.AddAll(Array As String("","Mach.chico","Rameados","Cara B/roja","Sin color","Roces","Deform.","F.de tam."))
'	dm3.AddAll(Array As String("","Mach.chico","Rameados","Cara B/roja","Sin color","Roces","Deform.","F.de tam."))
'	dm4.AddAll(Array As String("","Mach.chico","Rameados","Cara B/roja","Sin color","Roces","Deform.","F.de tam."))
'	dm5.AddAll(Array As String("","Mach.chico","Rameados","Cara B/roja","Sin color","Roces","Deform.","F.de tam."))
'	dl1.AddAll(Array As String("","Reflej.sol","M.heladas","Russeting"))
'	dl2.AddAll(Array As String("","Reflej.sol","M.heladas","Russeting"))
'	dl3.AddAll(Array As String("","Reflej.sol","M.heladas","Russeting"))
'	
	
	Bmp.Initialize(File.DirAssets, "android48.png")
	Dim list2 As List
	Dim list3 As List
	
	list2 = File.ReadList(cargas, "marc.txt")
	
	list3 = File.ReadList(cargas, "emp.txt")''emp
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	MainPage.bol1=True
	Log("carg1 es "& MainPage.carg1)
	Log("carg2 es "& MainPage.carg2)
	Log("bol1 es "& MainPage.bol1)
	Log("bol2 es "& MainPage.bol2)
	Log("super es "& MainPage.super)



	
	'Dim list1,list2 As List
	
	'list1 = File.ReadList(cargas, "marc.txt")
	
'	emp1.AddAll(list3)
'	emp2.AddAll(list3)
'	emp3.AddAll(list3)
'	emp4.AddAll(list3)
'	calidad1.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4"))
'	calidad2.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4"))
'	calidad3.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4"))
'	calidad4.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4"))
'	apariencia1.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	apariencia2.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	apariencia3.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	apariencia4.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	marca1.AddAll(list2)
'	
'	marca2.AddAll(list2)
'	
'	marca3.AddAll(list2)
'	
'	marca4.AddAll(list2)
'	calidadinterna1.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	calidadinterna2.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	calidadinterna3.AddAll(Array As String("","Buena","Regular","Mala"))
'	
'	calidadinterna4.AddAll(Array As String("","Buena","Regular","Mala"))
'	
	''
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	MainPage.bol1=True
	
	
	

End Sub
'Sub valid As  Boolean ''valida cajas de texto y combos
'	Dim a,b,c,d,e As Boolean
'	a=False
'	b=False
'	c=False
'	d=False
'	a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or emp3.SelectedIndex=0 Or emp4.SelectedIndex=0 Or marca1.SelectedIndex=0 Or marca2.SelectedIndex=0 Or marca3.SelectedIndex=0 Or marca4.SelectedIndex=0
'	b=calidad1.SelectedIndex=0 Or calidad2.SelectedIndex=0 Or calidad3.SelectedIndex=0 Or calidad4.SelectedIndex=0 Or apariencia1.SelectedIndex=0 Or apariencia2.SelectedIndex=0 Or apariencia3.SelectedIndex=0 Or apariencia4.SelectedIndex=0
'
'	c= pallet1.Text="" Or pallet2.Text="" Or pallet3.Text="" Or pallet4.Text="" Or env1.Text="" Or env2.Text="" Or env3.Text="" Or env4.Text="" Or peso1.Text="" Or peso2.Text="" Or peso3.Text="" Or peso4.Text=""
'	d= color1.Text="" Or color2.Text="" Or color3.Text="" Or color4.Text="" Or temp1.Text="" Or temp2.Text="" Or temp3.Text="" Or temp4.Text="" Or  var1.Text="" Or var2.Text="" Or var3.Text="" Or var4.Text="" Or sello1.Text="" Or sello2.Text="" Or sello3.Text="" Or sello4.Text=""
'	
'	
'	'c=tam.Text="" Or var.Text="" Or tempe.Text="" Or tempe.Text="" Or lote.Text=""
'	'd=emb.Text="" Or up.SelectedIndex=0
'	'valida si tiene al menos una categoria de  daño
'	
'	If a=True Or b= True Or c=True Or d=True Then
'		Msgbox("Debe completar los datos","ERROR")
'		Return False
'	End If
'	Return True
'	
'	
'End Sub
Sub final2 'genera el archivo .txt
	Dim a,b,c,d,e,f,g,h,i,j,k,l ,ll ,m ,n,o,p,q,r,s,t, u ,v ,w,x ,y,z,aa,ab,ac,ad,ftp3   As String
	Dim writer As TextWriter
	Dim writer2 As  TextWriter
	Dim writer3 As TextWriter
	''y=emp.SelectedItem
	'z=y.SubString2(0,2)
	Private rp As RuntimePermissions
	ftp3 =rp.GetSafeDirDefaultExternal("Ftp3")
	'bak =rp.GetSafeDirDefaultExternal("bak")
	'Page1.
	
'	k="INFORME" & ";" & "fecha" & ";" & "hora" & ";" & "cliente"& ";" & "NRO cont." & ";" & "vapor"  & ";" &   "destino"  & ";" &  "cantidad"  & ";"& "obs" & ";"& "tecnico"
'	b= id.text & ";" & fecha.text & ";" & hora.Text & ";" & cliente.Text & ";" & conten.Text & ";" & vapor.Text  & ";" &   destino.Text  & ";" &  cant.Text  & ";"& obs.Text & ";"& tecnico.Text
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

'	y=emp1.SelectedItem
'	z=y.SubString2(0,2)
'	'
'	






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
'	a="Pallet" & ";" & peso1.text & ";" &   "Peso2" & ";" & "Peso3" & ";" &  "Peso4"& ";"&  "Peso5"&";"& "Peso6" & ";" &   "Peso7" & ";" & "Peso8" & ";" &  "Peso9"& ";"&  "Peso10"& & ";"& "Peso11" & ";" &   "Peso12"
'	c="Pallet1" & ";" & "Peso1b" & ";" &   "Peso2b" & ";" & "Peso3b" & ";" &  "Peso4b"& ";"&  "Peso5b"&";"& "Peso6b" & ";" &   "Peso7b" & ";" & "Peso8b" & ";" &  "Peso9b"& ";"&  "Peso10b"& & ";"& "Peso11b" & ";" &   "Peso12b"
'	d="Pallet2" & ";" & "Peso1a" & ";" &   "Peso2a" & ";" & "Peso3a" & ";" &  "Peso4a"& ";"&  "Peso5a"&";"& "Peso6a" & ";" &   "Peso7a" & ";" & "Peso8a" & ";" &  "Peso9a"& ";"&  "Peso10a"& & ";"& "Peso11a" & ";" &   "Peso12a"
'	e="Pallet3" & ";" & "Peso1c" & ";" &   "Peso2c" & ";" & "Peso3c" & ";" &  "Peso4c"& ";"&  "Peso5c"&";"& "Peso6c" & ";" &   "Peso7c" & ";" & "Peso8c" & ";" &  "Peso9c"& ";"&  "Peso10c"& & ";"& "Peso11c" & ";" &   "Peso12c"
'	f="Pallet4" & ";" & "Peso1d" & ";" &   "Peso2d" & ";" & "Peso3d" & ";" &  "Peso4d"& ";"&  "Peso5d"&";"& "Peso6d" & ";" &   "Peso7d" & ";" & "Peso8d" & ";" &  "Peso9d"& ";"&  "Peso10d"& & ";"& "Peso11d" & ";" &   "Peso12d"
'	g="Pallet1" & ";" & "Peso1b" & ";" &   "Peso2b" & ";" & "Peso3b" & ";" &  "Peso4b"& ";"&  "Peso5b"&";"& "Peso6b" & ";" &   "Peso7b" & ";" & "Peso8b" & ";" &  "Peso9b"& ";"&  "Peso10b"& & ";"& "Peso11b" & ";" &   "Peso12b"
'	h="Pallet2" & ";" & "Peso1a" & ";" &   "Peso2a" & ";" & "Peso3a" & ";" &  "Peso4a"& ";"&  "Peso5a"&";"& "Peso6a" & ";" &   "Peso7a" & ";" & "Peso8a" & ";" &  "Peso9a"& ";"&  "Peso10a"& & ";"& "Peso11a" & ";" &   "Peso12a"
'	j="Pallet3" & ";" & "Peso1c" & ";" &   "Peso2c" & ";" & "Peso3c" & ";" &  "Peso4c"& ";"&  "Peso5c"&";"& "Peso6c" & ";" &   "Peso7c" & ";" & "Peso8c" & ";" &  "Peso9c"& ";"&  "Peso10c"& & ";"& "Peso11c" & ";" &   "Peso12c"
'	k="Pallet4" & ";" & "Peso1d" & ";" &   "Peso2d" & ";" & "Peso3d" & ";" &  "Peso4d"& ";"&  "Peso5d"&";"& "Peso6d" & ";" &   "Peso7d" & ";" & "Peso8d" & ";" &  "Peso9d"& ";"&  "Peso10d"& & ";"& "Peso11d" & ";" &   "Peso12d"
'	
'	
'	c=pallet1.text & ";" & "Peso1b.text" & ";" &   "Peso2b.text" & ";" & "Peso3b.text" & ";" &  "Peso4b.text"& ";"&  "Peso5b.text"&";"& "Peso6b.text" & ";" &   "Peso7b.text" & ";" & "Peso8b.text" & ";" &  "Peso9b.text"& ";"&  "Peso10b.text"& & ";"& "Peso11b.text" & ";" &   "Peso12b.text"
'	d="Pallet2.text" & ";" & "Peso1a.text" & ";" &   "Peso2a.text" & ";" & "Peso3a.text" & ";" &  "Peso4a.text"& ";"&  "Peso5a.text"&";"& "Peso6a.text" & ";" &   "Peso7a.text" & ";" & "Peso8a.text" & ";" &  "Peso9a.text"& ";"&  "Peso10a.text"& & ";"& "Peso11a.text" & ";" &   "Peso12a.text"
'	e="Pallet3.text" & ";" & "Peso1c.text" & ";" &   "Peso2c.text" & ";" & "Peso3c.text" & ";" &  "Peso4c.text"& ";"&  "Peso5c.text"&";"& "Peso6c.text" & ";" &   "Peso7c.text" & ";" & "Peso8c.text" & ";" &  "Peso9c.text"& ";"&  "Peso10c.text"& & ";"& "Peso11c.text" & ";" &   "Peso12c.text"
'	f="Pallet4.text" & ";" & "Peso1d.text" & ";" &   "Peso2d.text" & ";" & "Peso3d.text" & ";" &  "Peso4d.text"& ";"&  "Peso5d.text"&";"& "Peso6d.text" & ";" &   "Peso7d.text" & ";" & "Peso8d.text" & ";" &  "Peso9d.text"& ";"&  "Peso10d.text"& & ";"& "Peso11d.text" & ";" &   "Peso12d.text"
'	g="Pallet1.txt"  & ";" & "Peso1b.text" & ";" &   "Peso2b.text" & ";" & "Peso3b.text" & ";" &  "Peso4b.text"& ";"&  "Peso5b.text"&";"& "Peso6b.text" & ";" &   "Peso7b.text" & ";" & "Peso8b.text" & ";" &  "Peso9b.text"& ";"&  "Peso10b.text"& & ";"& "Peso11b.text" & ";" &   "Peso12b.text"
'	h="Pallet2.text" & ";" & "Peso1a.text" & ";" &   "Peso2a.text" & ";" & "Peso3a.text" & ";" &  "Peso4a.text"& ";"&  "Peso5a.text"&";"& "Peso6a.text" & ";" &   "Peso7a.text" & ";" & "Peso8a.text" & ";" &  "Peso9a.text"& ";"&  "Peso10a.text"& & ";"& "Peso11a.text" & ";" &   "Peso12a.text"
'	j="Pallet3.text" & ";" & "Peso1c.text" & ";" &   "Peso2c.text" & ";" & "Peso3c.text" & ";" &  "Peso4c.text"& ";"&  "Peso5c.text"&";"& "Peso6c.text" & ";" &   "Peso7c.text" & ";" & "Peso8c.text" & ";" &  "Peso9c.text"& ";"&  "Peso10c.text"& & ";"& "Peso11c.text" & ";" &   "Peso12c.text"
'	k="Pallet4.text" & ";" & "Peso1d.text" & ";" &   "Peso2d.text" & ";" & "Peso3d.text" & ";" &  "Peso4d.text"& ";"&  "Peso5d.text"&";"& "Peso6d.text" & ";" &   "Peso7d.text" & ";" & "Peso8d.text" & ";" &  "Peso9d.text"& ";"&  "Peso10d.text"& & ";"& "Peso11d.text" & ";" &   "Peso12d.text"
'	

	c = pallet1.text & ";" & peso1b.text & ";" & peso2b.text & ";" & peso3b.text & ";" & peso4b.text & ";" & peso5b.text & ";" & peso6b.text & ";" & peso7b.text & ";" & peso8b.text & ";" & peso9b.text & ";" & peso10b.text & ";" & peso11b.text & ";" & peso12b.text
	d = pallet2.text & ";" & peso1a.text & ";" & peso2a.text & ";" & peso3a.text & ";" & peso4a.text & ";" & peso5a.text & ";" & peso6a.text & ";" & peso7a.text & ";" & peso8a.text & ";" & peso9a.text & ";" & peso10a.text & ";" & peso11a.text & ";" & peso12a.text
	e = pallet3.text & ";" & peso1c.text & ";" & peso2c.text & ";" & peso3c.text & ";" & peso4c.text & ";" & peso5c.text & ";" & peso6c.text & ";" & peso7c.text & ";" & peso8c.text & ";" & peso9c.text & ";" & peso10c.text & ";" & peso11c.text & ";" & peso12c.text
	f = pallet4.text & ";" & peso1d.text & ";" & peso2d.text & ";" & peso3d.text & ";" & peso4d.text & ";" & peso5d.text & ";" & peso6d.text & ";" & peso7d.text & ";" & peso8d.text & ";" & peso9d.text & ";" & peso10d.text & ";" & peso11d.text & ";" & peso12d.text
'	g = pallet1.txt & ";" & peso1b.text & ";" & peso2b.text & ";" & peso3b.text & ";" & peso4b.text & ";" & peso5b.text & ";" & peso6b.text & ";" & peso7b.text & ";" & peso8b.text & ";" & peso9b.text & ";" & peso10b.text & ";" & peso11b.text & ";" & peso12b.text
'	h = pallet2.text & ";" & peso1a.text & ";" & peso2a.text & ";" & peso3a.text & ";" & peso4a.text & ";" & peso5a.text & ";" & peso6a.text & ";" & peso7a.text & ";" & peso8a.text & ";" & peso9a.text & ";" & peso10a.text & ";" & peso11a.text & ";" & peso12a.text
'	j = pallet3.text & ";" & peso1c.text & ";" & peso2c.text & ";" & peso3c.text & ";" & peso4c.text & ";" & peso5c.text & ";" & peso6c.text & ";" & peso7c.text & ";" & peso8c.text & ";" & peso9c.text & ";" & peso10c.text & ";" & peso11c.text & ";" & peso12c.text
'	k = pallet4.text & ";" & peso1d.text & ";" & peso2d.text & ";" & peso3d.text & ";" & peso4d.text & ";" & peso5d.text & ";" & peso6d.text & ";" & peso7d.text & ";" & Peso8d.text & ";" & peso9d.text & ";" & peso10d.text & ";" & peso11d.text & ";" & peso12d.text




	'a=b & c & d & f & e '& g '& h
'	h="Informe" & ";" & "fecha" & ";" & "M"& ";" & "Grado" & ";" &"Empresa"& ";" & "Sello" & ";"
'	i="Pallet" & ";" & "Peso1" & ";" &   "Peso1""Plu" & ";" & "Peso1" "Promedio" & ";" &  "Peso1""Minimo" & ";"&  "Peso1""Maximo"  ' & ";"  & "Peso" & ";" & "Ap.inicial" & ";" &"Color " & ";" & "Temp." & ";"  & "plu" & ";" & "Prom."& ";" & "Max." & ";" & "Min." & ";" & "Cal.Interna" & ";"  & "Bitter" & ";"  & "Manchas" & ";"  & "Asoleado" & ";" &  "Heridas" & ";" & "Total"
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
	writer2.Initialize(File.OpenOutput( ftp3 ,"bol" & "zz" &".csv",False))
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
		
		
	'sumanum
End Sub
'control de los digitos
Sub peso1a_TextChanged (Old As String, New As String)
	  LimitarTexto(peso1a, New) 
	   End Sub

Sub peso2a_TextChanged (Old As String, New As String)
	LimitarTexto(peso2a, New)
End Sub

Sub peso3a_TextChanged (Old As String, New As String)
	LimitarTexto(peso3a, New)
	End Sub
	
	
Sub peso4a_TextChanged (Old As String, New As String)
	 LimitarTexto(peso4a, New)
	 End Sub
Sub peso5a_TextChanged (Old As String, New As String)
	  LimitarTexto(peso5a, New)
	   End Sub
Sub peso6a_TextChanged (Old As String, New As String)
	  LimitarTexto(peso6a, New)
	  End Sub
Sub peso7a_TextChanged (Old As String, New As String)
	 LimitarTexto(peso7a, New)
	 
	 End Sub
Sub peso8a_TextChanged (Old As String, New As String)
	 LimitarTexto(peso8a, New) 
	 End Sub
Sub peso9a_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso9a, New)
	 End Sub
Sub peso10a_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso10a, New) : 
	 End Sub
Sub peso11a_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso11a, New) : 
	 End Sub
Sub peso12a_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso12a, New) : 
	 End Sub

Sub peso1b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso1b, New) : 
	 End Sub
Sub peso2b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso2b, New) : 
	 End Sub
Sub peso3b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso3b, New) : 
	 End Sub
Sub peso4b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso4b, New) : 
	 End Sub
Sub peso5b_TextChanged (Old As String, New As String) 
	: LimitarTexto(peso5b, New) : 
	End Sub
Sub peso6b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso6b, New) : 
	 End Sub
Sub peso7b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso7b, New) : 
	 End Sub
Sub peso8b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso8b, New) : 
	 End Sub
Sub peso9b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso9b, New) : 
	 End Sub
Sub peso10b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso10b, New) : 
	 End Sub
Sub peso11b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso11b, New) : 
	 End Sub
Sub peso12b_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso12b, New) : 
	 End Sub

Sub peso1c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso1c, New) : 
	 End Sub
Sub peso2c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso2c, New) : 
	 End Sub
Sub peso3c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso3c, New) : 
	 End Sub
Sub peso4c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso4c, New) :
	  End Sub
Sub peso5c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso5c, New) : 
	 End Sub
Sub peso6c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso6c, New) :
	  End Sub
Sub peso7c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso7c, New) : 
	 End Sub
Sub peso8c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso8c, New) : 
	 End Sub
Sub peso9c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso9c, New) :
	  End Sub
Sub peso10c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso10c, New) : 
	 End Sub
Sub peso11c_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso11c, New) :
	  End Sub
Sub peso12c_TextChanged (Old As String, New As String) 
	: LimitarTexto(peso12c, New) :
	 End Sub

Sub peso1d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso1d, New) : 
	 End Sub
Sub peso2d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso2d, New) :
	  End Sub
Sub peso3d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso3d, New) :
	  End Sub
Sub peso4d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso4d, New) :
	  End Sub
Sub peso5d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso5d, New) :
	  End Sub
Sub peso6d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso6d, New) :
	  End Sub
Sub peso7d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso7d, New) :
	  End Sub
Sub peso8d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso8d, New) :
	  End Sub
Sub peso9d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso9d, New) : 
	 End Sub
Sub peso10d_TextChanged (Old As String, New As String) 
	: LimitarTexto(peso10d, New) :
	 End Sub
Sub peso11d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso11d, New) :
	  End Sub
Sub peso12d_TextChanged (Old As String, New As String)
	 : LimitarTexto(peso12d, New) : 
	 End Sub
   
	   
	   	   
	' Función para limitar el texto a 4 caracteres
Sub LimitarTexto4(edt As EditText, New As String)
	If edt.Text.Length > 6 Then
		edt.Text = edt.Text.SubString2(0, 6)
		edt.SelectionStart = 6 ' Mantiene el cursor al final
	End If
End Sub
	   
	
Sub pallet1_TextChanged (Old As String, New As String)
	LimitarTexto4(pallet1, New)
End Sub

Sub pallet2_TextChanged (Old As String, New As String)
	LimitarTexto4(pallet2, New)
End Sub

Sub pallet3_TextChanged (Old As String, New As String)
	LimitarTexto4(pallet3, New)
End Sub
	
	
Sub pallet4_TextChanged (Old As String, New As String)
	LimitarTexto4(pallet4, New)
End Sub
'control de los digitos   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	' Función para limitar el texto a 4 caracteres
Sub LimitarTexto(edt As EditText, New As String)
	If edt.Text.Length > 4 Then
		edt.Text = edt.Text.SubString2(0, 4)
		edt.SelectionStart = 4 ' Mantiene el cursor al final
	End If
End Sub

Sub blaqueo
	
	' Borrar los campos de la columna "A"
	peso1a.Text = ""  : peso2a.Text = ""  : peso3a.Text = ""  : peso4a.Text = ""
	peso5a.Text = ""  : peso6a.Text = ""  : peso7a.Text = ""  : peso8a.Text = ""
	peso9a.Text = ""  : peso10a.Text = "" : peso11a.Text = "" : peso12a.Text = ""
	
	' Borrar los campos de la columna "B"
	peso1b.Text = ""  : peso2b.Text = ""  : peso3b.Text = ""  : peso4b.Text = ""
	peso5b.Text = ""  : peso6b.Text = ""  : peso7b.Text = ""  : peso8b.Text = ""
	peso9b.Text = ""  : peso10b.Text = "" : peso11b.Text = "" : peso12b.Text = ""
	
	' Borrar los campos de la columna "C"
	peso1c.Text = ""  : peso2c.Text = ""  : peso3c.Text = ""  : peso4c.Text = ""
	peso5c.Text = ""  : peso6c.Text = ""  : peso7c.Text = ""  : peso8c.Text = ""
	peso9c.Text = ""  : peso10c.Text = "" : peso11c.Text = "" : peso12c.Text = ""
	
	' Borrar los campos de la columna "D"
	peso1d.Text = ""  : peso2d.Text = ""  : peso3d.Text = ""  : peso4d.Text = ""
	peso5d.Text = ""  : peso6d.Text = ""  : peso7d.Text = ""  : peso8d.Text = ""
	peso9d.Text = ""  : peso10d.Text = "" : peso11d.Text = "" : peso12d.Text = ""
End Sub

Sub llenado
	' Asignar valores del 1 al 12 en la columna A
	peso1a.Text = "1"
	peso2a.Text = "2"
	peso3a.Text = "3"
	peso4a.Text = "4"
	peso5a.Text = "5"
	peso6a.Text = "6"
	peso7a.Text = "7"
	peso8a.Text = "8"
	peso9a.Text = "9"
	peso10a.Text = "10"
	peso11a.Text = "11"
	peso12a.Text = "12"
    
	' Asignar valores del 1 al 12 en la columna B
	peso1b.Text = "1"
	peso2b.Text = "2"
	peso3b.Text = "3"
	peso4b.Text = "4"
	peso5b.Text = "5"
	peso6b.Text = "6"
	peso7b.Text = "7"
	peso8b.Text = "8"
	peso9b.Text = "9"
	peso10b.Text = "10"
	peso11b.Text = "11"
	peso12b.Text = "12"
    
	' Asignar valores del 1 al 12 en la columna C
	peso1c.Text = "1"
	peso2c.Text = "2"
	peso3c.Text = "3"
	peso4c.Text = "4"
	peso5c.Text = "5"
	peso6c.Text = "6"
	peso7c.Text = "7"
	peso8c.Text = "8"
	peso9c.Text = "9"
	peso10c.Text = "10"
	peso11c.Text = "11"
	peso12c.Text = "12"
    
	' Asignar valores del 1 al 12 en la columna D
	peso1d.Text = "1"
	peso2d.Text = "2"
	peso3d.Text = "3"
	peso4d.Text = "4"
	peso5d.Text = "5"
	peso6d.Text = "6"
	peso7d.Text = "7"
	peso8d.Text = "8"
	peso9d.Text = "9"
	peso10d.Text = "10"
	peso11d.Text = "11"
	peso12d.Text = "12"
End Sub

Sub LlenarPesos
	If pallet1.Text.trim= "" Then pallet1.Text = "s/d"
	If pallet2.Text.Trim = "" Then pallet2.Text = "s/d"
	If pallet3.Text.Trim = "" Then pallet3.Text = "s/d"
	If pallet4.Text.Trim = "" Then pallet4.Text = "s/d"
	
	
	' Columna A
	If peso1a.Text.Trim = "" Then peso1a.Text = "s/d" 
	If peso2a.Text.Trim = "" Then peso2a.Text = "s/d"
	If peso3a.Text.Trim = "" Then peso3a.Text = "s/d" 
	If peso4a.Text.Trim = "" Then peso4a.Text = "s/d" 
	If peso5a.Text.Trim = "" Then peso5a.Text = "s/d"
	If peso6a.Text.Trim = "" Then peso6a.Text = "s/d"
	If peso7a.Text.Trim = "" Then peso7a.Text = "s/d"
	If peso8a.Text.Trim = "" Then peso8a.Text = "s/d"
	If peso9a.Text.Trim = "" Then peso9a.Text = "s/d" 
	If peso10a.Text.Trim = "" Then peso10a.Text = "s/d" 
	If peso11a.Text.Trim = "" Then peso11a.Text = "s/d"
	If peso12a.Text.Trim = "" Then peso12a.Text = "s/d" 
    
	' Columna B
	If peso1b.Text.Trim = "" Then peso1b.Text = "s/d" 
	If peso2b.Text.Trim = "" Then peso2b.Text = "s/d" 
	If peso3b.Text.Trim = "" Then peso3b.Text = "s/d" 
	If peso4b.Text.Trim = "" Then peso4b.Text = "s/d" 
	If peso5b.Text.Trim = "" Then peso5b.Text = "s/d"
	If peso6b.Text.Trim = "" Then peso6b.Text = "s/d" 
	If peso7b.Text.Trim = "" Then peso7b.Text = "s/d" 
	If peso8b.Text.Trim = "" Then peso8b.Text = "s/d" 
	If peso9b.Text.Trim = "" Then peso9b.Text = "s/d" 
	If peso10b.Text.Trim = "" Then peso10b.Text = "s/d"
	If peso11b.Text.Trim = "" Then peso11b.Text = "s/d"
	If peso12b.Text.Trim = "" Then peso12b.Text = "s/d" 
	' Columna C
	If peso1c.Text.Trim = "" Then peso1c.Text = "s/d"
	If peso2c.Text.Trim = "" Then peso2c.Text = "s/d"
	If peso3c.Text.Trim = "" Then peso3c.Text = "s/d" 
	If peso4c.Text.Trim = "" Then peso4c.Text = "s/d" 
	If peso5c.Text.Trim = "" Then peso5c.Text = "s/d" 
	If peso6c.Text.Trim = "" Then peso6c.Text = "s/d" 
	If peso7c.Text.Trim = "" Then peso7c.Text = "s/d" 
	If peso8c.Text.Trim = "" Then peso8c.Text = "s/d" 
	If peso9c.Text.Trim = "" Then peso9c.Text = "s/d" 
	If peso10c.Text.Trim = "" Then peso10c.Text = "s/d"
	If peso11c.Text.Trim = "" Then peso11c.Text = "s/d" 
	If peso12c.Text.Trim = "" Then peso12c.Text = "s/d" 
    
	' Columna D
	If peso1d.Text.Trim = "" Then peso1d.Text = "s/d" 
	If peso2d.Text.Trim = "" Then peso2d.Text = "s/d" 
	If peso3d.Text.Trim = "" Then peso3d.Text = "s/d" 
	If peso4d.Text.Trim = "" Then peso4d.Text = "s/d"
	If peso5d.Text.Trim = "" Then peso5d.Text = "s/d" 
	If peso6d.Text.Trim = "" Then peso6d.Text = "s/d" 
	If peso7d.Text.Trim = "" Then peso7d.Text = "s/d" 
	If peso8d.Text.Trim = "" Then peso8d.Text = "s/d" 
	If peso9d.Text.Trim = "" Then peso9d.Text = "s/d" 
	If peso10d.Text.Trim = "" Then peso10d.Text = "s/d" 
	If peso11d.Text.Trim = "" Then peso11d.Text = "s/d" 
	If peso12d.Text.Trim = "" Then peso12d.Text = "s/d" 


End Sub




Sub date1_Click 'libreria dialogs2
	Dim Dd As DateDialog
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	
	Dim ret As Int = Dd.Show("Fecha", "", "Yes", "", "",Bmp )
	
	sello1.Text=Dd.DayOfMonth & "/" & Dd.Month' & "/" & Dd.Year
	
	
	'ToastMessageShow(ret & " : " & Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
End Sub
Sub date2_Click 'libreria dialogs2
	Dim Dd As DateDialog
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	
	Dim ret As Int = Dd.Show("Fecha", "", "Yes", "", "",Bmp )
	
	sello2.Text=Dd.DayOfMonth & "/" & Dd.Month' & "/" & Dd.Year
	
	
	'ToastMessageShow(ret & " : " & Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
End Sub
Sub date3_Click 'libreria dialogs2
	Dim Dd As DateDialog
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	
	Dim ret As Int = Dd.Show("Fecha", "", "Yes", "", "",Bmp )
	
	sello3.Text=Dd.DayOfMonth & "/" & Dd.Month' & "/" & Dd.Year
	
	
	'ToastMessageShow(ret & " : " & Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
End Sub
Sub date4_Click 'libreria dialogs2
	Dim Dd As DateDialog
	Dd.Year = DateTime.GetYear(DateTime.Now)
	Dd.Month = DateTime.GetMonth(DateTime.Now)
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
	
	Dim ret As Int = Dd.Show("Fecha", "", "Yes", "", "",Bmp )
	
	sello4.Text=Dd.DayOfMonth & "/" & Dd.Month' & "/" & Dd.Year
	
	
	'ToastMessageShow(ret & " : " & Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
End Sub
'
'Sub B4XPage_MenuClick (Tag As String)
'	If Tag = "Info" Then
'		B4XPages.ShowPage("MainPage")
'	End If
'	If Tag = "Daños" Then
'		B4XPages.ShowPage("Page 1")
'	End If
'	If Tag = "Camara" Then
'		B4XPages.ShowPage("Page 2")
'	End If
'	If Tag = "Terminar" Then
'		'terminar
'		B4XPages.ShowPage("MainPage")
'		
'	End If
'End Sub

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
'Sub ceros 'comprueba si no hay nada lleno y pone caja de unidad de daños en 0
'	
'	If bitter1.Text="" Then
'		bitter1.Text="0"
'	End If
'	If bitter2.Text="" Then
'		bitter2.Text="0"
'	End If
'	If bitter3.Text="" Then
'		bitter3.Text="0"
'	End If
'	If bitter4.Text="" Then
'		bitter4.Text="0"
'	End If
'	If asoleado1.Text="" Then
'		asoleado1.Text="0"
'	End If
'	If asoleado2.Text="" Then
'		asoleado2.Text="0"
'	End If
'	If asoleado3.Text="" Then
'		asoleado3.Text="0"
'	End If
'	If asoleado4.Text="" Then
'		asoleado4.Text="0"
'	End If
'	If heridas1.Text="" Then
'		heridas1.Text="0"
'	End If
'	If heridas2.Text="" Then
'		heridas2.Text="0"
'	End If
'
'	If heridas3.Text="" Then
'		heridas3.Text="0"
'	End If
'
'	If heridas4.Text="" Then
'		heridas4.Text="0"
'	End If
'
'	If manchas1.Text="" Then
'		manchas1.Text="0"
'	End If
'	If manchas2.Text="" Then
'		manchas2.Text="0"
'	End If
'
'	If manchas3.Text="" Then
'		manchas3.Text="0"
'	End If
'
'	If manchas4.Text="" Then
'		manchas4.Text="0"
'	End If
'	
'	
''	If np1.Text="" Then
''		np1.Text="0"
''	End If
''	If np2.Text="" Then
''		np2.Text="0"
''	End If
''	If np3.Text="" Then
''		np3.Text="0"
''	End If
''	If np4.Text="" Then
''		np4.Text="0"
''	End If
''	If np5.Text="" Then
''		np5.Text="0"
''	End If
''	If np6.Text="" Then
''		np6.Text="0"
''	End If
''	If np7.Text="" Then
''		np7.Text="0"
''	End If
''	If np8.Text="" Then
''		np8.Text="0"
''	End If
''	If np9.Text="" Then
''		np9.Text="0"
''	End If
''	If np10.Text="" Then
''		np10.Text="0"
''	End If
''	If nd1.Text="" Then
''		nd1.Text="0"
''	End If
''	If nd2.Text="" Then
''		nd2.Text="0"
''	End If
''	If nd3.Text="" Then
''		nd3.Text="0"
''	End If
''	If nd4.Text="" Then
''		nd4.Text="0"
''	End If
''	If nd5.Text="" Then
''		nd5.Text="0"
''	End If
''	If nd6.Text="" Then
''		nd6.Text="0"
''	End If
''	If nd7.Text="" Then
''		nd7.Text="0"
''	End If
''	If nd8.Text="" Then
''		nd8.Text="0"
''	End If
''	If nd9.Text="" Then
''		nd9.Text="0"
''	End If
''	If nd10.Text="" Then
''		nd10.Text="0"
''	End If
''	If nd11.Text="" Then
''		nd11.Text="0"
''	End If
''	
''	If nd12.Text="" Then
''		nd12.Text="0"
''	End If
''	If nd13.Text="" Then
''		nd13.Text="0"
''	End If
''	If nd14.Text="" Then
''		nd14.Text="0"
''	End If
''	If nd15 .Text="" Then
''		nd15.Text="0"
''	End If
''	If nd16.Text="" Then
''		nd16.Text="0"
''	End If
''	If nd17.Text="" Then
''		nd17.Text="0"
''	End If
''	If nd18.Text="" Then
''		nd18.Text="0"
''	End If
''	
'End Sub
'Sub calc_Click
'	
'	If valid =True Then
'		MsgboxAsync("Datos validados","ok")
'		
'		ceros
'		total
'		'nocerosç
'	
'	
'		'Else
'		'	MsgboxAsync("nooo","chau")
'	End If
'End Sub
'
'Sub total''saca daños parciales y llena caja de textos parciales y daño total
'	
'	
'	'Dim b,c ,d ,danos,tama As Double
'	'tama=B4XPages.MainPage.tam.Text
'	
''	c=np1.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp1.Text=NumberFormat(d,0,2)
''	
''	c=np2.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp2.Text=NumberFormat(d,0,2)
''	
''	c=np3.Text
''	b=B4XPages.MainPage.tam.Text
''	
''	d=(c/b)*100
''	pp3.Text=NumberFormat(d,0,2)
''	
''	c=np4.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp4.Text=NumberFormat(d,0,2)
''	
''	c=np5.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp5.Text=NumberFormat(d,0,2)
''	
''	c=np6.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp6.Text=NumberFormat(d,0,2)
'	
''	c=np7.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp7.Text=NumberFormat(d,0,2)
''	
''	c=np8.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp8.Text=NumberFormat(d,0,2)
''	
''	c=np9.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp9.Text=NumberFormat(d,0,2)
''	
''	c=np10.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pp10.Text=NumberFormat(d,0,2)
''	
''	c=nd1.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd1.Text=NumberFormat(d,0,2)
''	
''	c=nd2.Text
''	b=B4XPages.MainPage.tam.Text
''	pd2.Text=NumberFormat(d,0,2)
''	
''	c=nd3.Text
''	b=B4XPages.MainPage.tam.Text
''	pd3.Text=NumberFormat(d,0,2)
''	
''	c=nd4.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd4.Text=NumberFormat(d,0,2)
''	
''	c=nd5.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd5.Text=NumberFormat(d,0,2)
''	
''	c=nd6.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd6.Text=NumberFormat(d,0,2)
''	
''	c=nd7.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd7.Text=NumberFormat(d,0,2)
''	
''	c=nd8.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd8.Text=NumberFormat(d,0,2)
''	
''	c=nd9.Text
''	b=tama
''	d=(c/b)*100
''	pd9.Text=NumberFormat(d,0,2)
''	
''	c=nd10.Text
''	b=B4XPages.MainPage.tam.Text
''	d=(c/b)*100
''	pd10.Text=NumberFormat(d,0,2)
''	
''	c=nd11.Text
''	b=tama
''	d=(c/b)*100
''	pd11.Text=NumberFormat(d,0,2)
''	
''	c=nd12.Text
''	b=tama
''	d=(c/b)*100
''	pd12.Text=NumberFormat(d,0,2)
''	
''	c=nd13.Text
''	b=tama
''	d=(c/b)*100
''	pd13.Text=NumberFormat(d,0,2)
''	
''	c=nd14.Text
''	b=tama
''	d=(c/b)*100
''	pd14.Text=NumberFormat(d,0,2)
''	
''	c=nd15.Text
''	b=tama
''	d=(c/b)*100
''	pd15.Text=NumberFormat(d,0,2)
''	
''	c=nd16.Text
''	b=tama
''	d=(c/b)*100
''	pd16.Text=NumberFormat(d,0,2)
''
''	c=nd17.Text
''	b=tama
''	d=(c/b)*100
''	pd17.Text=NumberFormat(d,0,2)
''	
''	c=nd18.Text
''	b=tama
''	d=(c/b)*100
''	pd18.Text=NumberFormat(d,0,2)
'total1.text = NumberFormat(bitter1.Text + manchas1.Text +asoleado1.Text +heridas1.Text,0,2 )
'
'total2.text = NumberFormat(bitter2.Text + manchas2.Text +asoleado2.Text +heridas2.Text,0,2 )
'total3.text = NumberFormat(bitter3.Text + manchas3.Text +asoleado3.Text +heridas3.Text,0,2 )
'
'total4.text = NumberFormat(bitter4.Text + manchas4.Text +asoleado4.Text +heridas4.Text,0,2 )
'
'	
'	
'
'	'defec.Text=NumberFormat( pp1.Text + pp2.Text + pp3.Text + pp4.Text + pp5.Text + pp6.Text + pp7.Text + pp8.Text + pp9.Text + pp10.Text + pd1.Text + pd2.Text + pd3.Text + pd4.Text + pd5.Text + pd6.Text + pd7.Text + pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text + pd17.Text + pd18.Text,0,2)
'	'B4XPages.MainPage.dano.Text=NumberFormat( pp1.Text + pp2.Text + pp3.Text + pp4.Text + pp5.Text + pp6.Text + pp7.Text + pp8.Text + pp9.Text + pp10.Text + pd1.Text + pd2.Text + pd3.Text + pd4.Text + pd5.Text + pd6.Text + pd7.Text + pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text + pd17.Text + pd18.Text,0,2)
'	
'	'defec2.text=NumberFormat(pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text+pd17.Text+pd18.Text,0,2)
'End Sub

Private Sub Button1_Click
	B4XPages.ShowPage("Page 2")
End Sub
Private Sub Button5_Click
	B4XPages.ShowPage("Page 2")
End Sub
Private Sub Button6_Click
	B4XPages.ShowPage("Page 2")
End Sub
Private Sub Button7_Click
	B4XPages.ShowPage("Page 2")
End Sub

public  Sub blanqueo

	pallet1.Text = ""
	pallet2.Text = ""
	pallet3.Text = ""
	pallet4.Text = ""

	peso10a.Text = ""
	peso10b.Text = ""
	peso10c.Text = ""
	peso10d.Text = ""
	peso11a.Text = ""
	peso11b.Text = ""
	peso11c.Text = ""
	peso11d.Text = ""
	peso12a.Text = ""
	peso12b.Text = ""
	peso12c.Text = ""
	peso12d.Text = ""
	peso1a.Text = ""
	peso1b.Text = ""
	peso1c.Text = ""
	peso1d.Text = ""
	peso2a.Text = ""
	peso2b.Text = ""
	peso2c.Text = ""
	peso2d.Text = ""
	peso3a.Text = ""
	peso3b.Text = ""
	peso3c.Text = ""
	peso3d.Text = ""
	peso4a.Text = ""
	peso4b.Text = ""
	peso4c.Text = ""
	peso4d.Text = ""
	peso5a.Text = ""
	peso5b.Text = ""
	peso5c.Text = ""
	peso5d.Text = ""
	peso6a.Text = ""
	peso6b.Text = ""
	peso6c.Text = ""
	peso6d.Text = ""
	peso7a.Text = ""
	peso7b.Text = ""
	peso7c.Text = ""
	peso7d.Text = ""
	peso8a.Text = ""
	peso8b.Text = ""
	peso8c.Text = ""
	peso8d.Text = ""
	peso9a.Text = ""
	peso9b.Text = ""
	peso9c.Text = ""
	peso9d.Text = ""

End Sub

'Private Sub Button4_Click
'	calc_Click
'End Sub
'Private Sub Button2_Click
'	pallet1.Text="1"
'pallet2.Text="1"
'pallet3.Text="1" 
'pallet4.Text="1"
'var1.Text="2"
' var2.Text="2" 
'var3.Text="2" 
' var4.Text="2" 
'env1.Text="3"
' env2.Text="3"
'env3.Text="3" 
' env4.Text="3" 
'peso1.Text="3" 
'peso2.Text="4"  
'peso3.Text="4" 
'peso4.Text="3" 
'color1.Text="av"  
'color2.Text="av" 
'color3.Text="av" 
'color4.Text="av" 
'calidadinterna1.Selectedindex=2
'calidadinterna2.Selectedindex=2
'calidadinterna3.Selectedindex=2
'calidadinterna4.Selectedindex=2
'
'	
'sello1.Text="17/1"
'sello2.Text="17/1"
'sello4.Text="17/1"
'sello3.Text="17/1"
'
'temp1.Text="1" 
'temp2.Text="2"  
'temp3.Text="3"  
'temp4.Text="4" 
'
'promedio1.Text="1" 
'promedio2.Text="2" 
'promedio3.Text="3" 
'promedio4.Text="4" 
'max1.Text="1"  
'max2.Text="1"
'max3.Text="2" 
'max4.Text="3" 
'min1.Text="4" 
'min2.Text="5"  
'min3.Text="1"  
'min4.Text="2" 
'emp1.SelectedIndex=1 
' emp2.SelectedIndex=1 
'emp3.SelectedIndex=1 
'emp4.SelectedIndex=1 
'marca1.SelectedIndex=1  
'marca2.SelectedIndex=2 
'marca3.SelectedIndex=3 
'marca4.SelectedIndex=4 
'calidad1.SelectedIndex=1  
'calidad2.SelectedIndex=2 
'calidad3.SelectedIndex=2 
'
'calidad4.SelectedIndex=1 
'
'apariencia1.SelectedIndex=2  
'apariencia2.SelectedIndex=3 
'	apariencia3.SelectedIndex=3
'	apariencia4.SelectedIndex=3
'
'End Sub
Private Sub llenar_Click
	pallet1.Text="22"
	pallet2.Text="33"
	pallet3.Text="44"
	pallet4.Text="55"
	
	
	
	peso10a.text="35.6"
	
	
	
	peso10b.text="35.6"
	peso10c.text="36.6"
	peso10d.text="37.6"
	peso11a.text="38.6"
	peso11b.text="39.6"
	peso11c.text="40.6"
	peso11d.text="41.6"
	peso12a.text="42.6"
	peso12b.text="43.6"
	peso12c.text="44.6"
	peso12d.text="45.6"
	peso1a.text="46.6"
	peso1b.text="47.6"
	peso1c.text="48.6"
	peso1d.text="49.6"
	peso2a.text="50.6"
	peso2b.text="51.6"
	peso2c.text="52.6"
	peso2d.text="53.6"
	peso3a.text="54.6"
	peso3b.text="55.6"
	peso3c.text="56.6"
	peso3d.text="57.6"
	peso4a.text="58.6"
	peso4b.text="59.6"
	peso4c.text="60.6"
	peso4d.text="61.6"
	peso5a.text="62.6"
	peso5b.text="63.6"
	peso5c.text="64.6"
	peso5d.text="65.6"
	peso6a.text="66.6"
	peso6b.text="67.6"
	peso6c.text="68.6"
	peso6d.text="69.6"
	peso7a.text="70.6"
	peso7b.text="71.6"
	peso7c.text="72.6"
	peso7d.text="73.6"
	peso8a.text="74.6"
	peso8d.text="75.6"
	peso8b.text="76.6"
	peso8c.text="77.6"
	peso9a.text="78.6"
	peso9b.text="79.6"
	peso9c.text="80.6"
	peso9d.text="81.6"
End Sub

Private Sub otra_Click
	LlenarPesos
End Sub