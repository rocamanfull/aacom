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

	Public plu1 As EditText
	Public plu2 As EditText
	Public plu3 As EditText
	Public plu4 As EditText
	Public llenar As Button
	
	
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

	
	
	Public nd1 As EditText
	Public nd10 As EditText
	Public nd11 As EditText
	Public nd13 As EditText
	Public nd15 As EditText
	Public nd16 As EditText
	Public nd17 As EditText
	Public nd18 As EditText
	Public nd2 As EditText
	Public nd3 As EditText
	Public nd4 As EditText
	Public nd5 As EditText
	Public nd6 As EditText
	Public nd7 As EditText
	Public nd8 As EditText
	Public nd9 As EditText
	Public np1 As EditText
	Public np10 As EditText
	Public np2 As EditText
	Public np3 As EditText
	Public np4 As EditText
	Public np5 As EditText
	Public np6 As EditText
	Public np7 As EditText
	Public np8 As EditText
	Public np9 As EditText
	Public otros As EditText
	Public otros2 As EditText
	Public pd1 As EditText
	Public pd10 As EditText
	Public pd11 As EditText
	Public pd13 As EditText
	Public pd14 As EditText
	Public pd15 As EditText
	Public pd16 As EditText
	Public pd2 As EditText
	Public pd3 As EditText
	Public pd4 As EditText
	Public pd5 As EditText
	Public pd6 As EditText
	Public pd7 As EditText
	Public pd8 As EditText
	Public pd18 As EditText
	Public pd17 As EditText
	Public pd9 As EditText
	Public pp1 As EditText
	Public pp10 As EditText
	Public pp2 As EditText
	Public pp3 As EditText
	Public pp4 As EditText
	Public pp5 As EditText
	Public pp6 As EditText
	Public pp7 As EditText
	Public pp8 As EditText
	Public pp9 As EditText
	Public nd12 As EditText
	Public nd14 As EditText
	Public pd12 As EditText
	Private defec As String
	Private defec2 As String
'	

	Public emp1 As Spinner
	Public emp2 As Spinner
	Public emp3 As Spinner
	Public emp4 As Spinner

	Public emp5 As Spinner
	Public emp6 As Spinner

	Public pallet1 As EditText
	Public pallet2 As EditText
	Public pallet3 As EditText
	Public pallet4 As EditText

	Public pallet5 As EditText
	Public pallet6 As EditText

	
	
	Public var1 As EditText
	Public var2 As EditText
	Public var3 As EditText
	Public var4 As EditText

	Public var5 As EditText
	Public var6 As EditText

	Public marca1 As Spinner
	Public marca2 As Spinner
	Public marca3 As Spinner
	Public marca4 As Spinner
	
	Public env1 As EditText
	Public env2 As EditText
	Public env3 As EditText
	Public env4 As EditText
	
	Public calidad1 As Spinner
	Public calidad2 As Spinner
	Public calidad3 As Spinner
	Public calidad4 As Spinner

	Public sello1 As EditText
	Public sello2 As EditText
	Public sello3 As EditText
	Public sello4 As EditText
	
	Public date1 As Button
	Public date2 As Button
	Public date3 As Button
	Public date4 As Button

	Public peso1 As EditText
	Public peso2 As EditText
	Public peso3 As EditText
	Public peso4 As EditText
	
	Public apariencia1 As Spinner
	Public apariencia2 As Spinner
	Public apariencia3 As Spinner
	Public apariencia4 As Spinner
	
	Public color1 As EditText
	Public color2 As EditText
	Public color3 As EditText
	Public color4 As EditText
	
	Public temp1 As EditText
	Public temp2 As EditText
	Public temp3 As EditText
	Public temp4 As EditText
	
	Public promedio1 As EditText
	Public promedio2 As EditText
	Public promedio3 As EditText
	Public promedio4 As EditText

	Public max1 As EditText
	Public max2 As EditText
	Public max3 As EditText
	Public max4 As EditText

	Public min1 As EditText
	Public min2 As EditText
	Public min3 As EditText
	Public min4 As EditText

	Public bitter3 As EditText
	Public bitter4 As EditText
	Public bitter1 As EditText
	Public bitter2 As EditText

	Public bitter5 As EditText
	Public bitter6 As EditText

	Public manchas1 As EditText
	Public manchas2 As EditText
	Public manchas3 As EditText
	Public manchas4 As EditText
	
	Public manchas5 As EditText
	Public manchas6 As EditText
	
	Public asoleado1 As EditText
	Public asoleado2 As EditText
	Public asoleado3 As EditText
	Public asoleado4 As EditText
	Public asoleado5 As EditText
	Public asoleado6 As EditText

	Public heridas1 As EditText
	Public heridas2 As EditText
	Public heridas3 As EditText
	Public heridas4 As EditText

	Public heridas5 As EditText
	Public heridas6 As EditText

	Public total1 As EditText
	Public total2 As EditText
	Public total3 As EditText
	Public total4 As EditText
	
	Public total5 As EditText
	Public total6 As EditText
	
	
	
	Public calidadinterna3 As Spinner
	Public calidadinterna4 As  Spinner
	Public calidadinterna1 As  Spinner
	Public calidadinterna2 As  Spinner

	
	

	

	
	
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

End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub
private Sub B4XPage_Appear
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	If MainPage.carg2=False Then
		Log("`page3 es falsa")
	End If
	MainPage.carg2=True
	If MainPage.carg2=True Then
		Log("page3 es ok")
	End If
	If MainPage.master=False Then
	Log("master 3 es false ")
	End If
	If MainPage.master=True Then
	Log("master es true")
		llenar.Enabled=True
		llenar.Visible = True
'		Page3.llenar.visible =True
'		Page3.llenar.enabled=True
	End If
End Sub
'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'Root.LoadLayout("MainPage2")
	ScrollView1.Initialize(5000dip) ' Altura grande para permitir scroll
	Root.AddView(ScrollView1, 0, 0, 100%x, 100%y)
	
	ScrollView1.Panel.LoadLayout("carg2finalmod6")'("carga2bbbb3x")
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
	Panel2.Color=Colors.RGB(240,205,140)
	
	lblPage1Title.Text="Datos Carga 5"
	Label3.Text="Datos Carga 6"
	Label19.Text="Datos Carga 7"
	Label70.Text="Datos Carga 8"
	B4XPages.SetTitle(Me, "Datos Cargas  5- 8")
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	'MainPage.carg2=True
	If MainPage.carg2=False Then
		Log("CARG2 es falsa")
	End If
	MainPage.carg2=True
	If MainPage.carg1=True Then
		Log("CARG2es ok")
	End If
	llenar.Enabled=False
	llenar.Visible = False
	
	If MainPage.master=True Then
	
		llenar.Enabled=True
		llenar.Visible = True
'		Page3.llenar.visible =True
'		Page3.llenar.enabled=True
	End If
	
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
	
	'list2 = File.ReadList(cargas, "marc.txt")
	filedir=File.DirAssets

	'list3 = File.ReadList(cargas, "emp.txt")''emp
	list2 = File.ReadList(filedir, "marc.txt")
	list3 = File.ReadList(filedir, "emp.txt")''e
	
	'Dim list1,list2 As List
	
	'list1 = File.ReadList(cargas, "marc.txt")
	
	emp1.AddAll(list3)
	emp2.AddAll(list3)
	emp3.AddAll(list3)
	emp4.AddAll(list3)
	calidad1.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4","S/D"))
	calidad2.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4","S/D"))
	calidad3.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4","S/D"))
	calidad4.AddAll(Array As String("","ELE1","ELE2","ELE3","ELE4","S/D"))
	apariencia1.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	apariencia2.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	apariencia3.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	apariencia4.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	marca1.AddAll(list2)
	
	marca2.AddAll(list2)
	
	marca3.AddAll(list2)
	
	marca4.AddAll(list2)
	calidadinterna1.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	calidadinterna2.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	calidadinterna3.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	calidadinterna4.AddAll(Array As String("","Buena","Regular","Mala","S/D"))
	
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	MainPage.carg2=True
	
	

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
Sub valid2 As  Boolean ''valida cajas de texto y combos se dejan afuera ver....
	Dim a,b,c,d,e As Boolean
	a=False
	b=False
	c=False
	d=False
	a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or emp3.SelectedIndex=0 Or emp4.SelectedIndex=0 Or marca1.SelectedIndex=0 Or marca2.SelectedIndex=0 Or marca3.SelectedIndex=0 Or marca4.SelectedIndex=0 Or promedio1.Text="" Or promedio2.Text="" Or promedio3.Text="" Or promedio4.Text="" Or max1.Text="" Or max2.Text="" Or max3.Text="" Or max4.Text="" Or min1.Text="" Or min2.Text="" Or min3.Text="" Or min4.Text=""
	
	b=calidad1.SelectedIndex=0 Or calidad2.SelectedIndex=0 Or calidad3.SelectedIndex=0 Or calidad4.SelectedIndex=0 Or apariencia1.SelectedIndex=0 Or apariencia2.SelectedIndex=0 Or apariencia3.SelectedIndex=0 Or apariencia4.SelectedIndex=0

	c= pallet1.Text="" Or pallet2.Text="" Or pallet3.Text="" Or pallet4.Text="" Or env1.Text="" Or env2.Text="" Or env3.Text="" Or env4.Text="" Or peso1.Text="" Or peso2.Text="" Or peso3.Text="" Or peso4.Text="" Or calidadinterna1.SelectedIndex=0 Or calidadinterna2.SelectedIndex=0 Or calidadinterna3.SelectedIndex=0 Or calidadinterna4.SelectedIndex=0
	
	d= color1.Text="" Or color2.Text="" Or color3.Text="" Or color4.Text="" Or temp1.Text="" Or temp2.Text="" Or temp3.Text="" Or temp4.Text="" Or  var1.Text="" Or var2.Text="" Or var3.Text="" Or var4.Text="" Or  plu1.Text="" Or plu2.Text="" Or plu3.Text="" Or plu4.Text="" Or sello1.Text="" Or sello2.Text="" Or sello3.Text="" Or sello4.Text=""
	
	'c=tam.Text="" Or var.Text="" Or tempe.Text="" Or tempe.Text="" Or lote.Text=""
	'd=emb.Text="" Or up.SelectedIndex=0
	'valida si tiene al menos una categoria de  daño
	
	If a=True Or b= True Or c=True Or d=True Then
		Msgbox("Debe completar los datos pagina 2 ","ERROR")
		Return False
	End If
	Return True
	
	
End Sub
'control de los digitos
Sub plu1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu1.Text = Old
	End If
End Sub
Sub plu2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu2.Text = Old
	End If
End Sub

Sub plu3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu3.Text = Old
	End If
End Sub
Sub plu4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu4.Text = Old
	End If
End Sub
Sub peso1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso1.Text = Old
	End If
End Sub
Sub peso2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso2.Text = Old
	End If
End Sub
Sub peso3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso3.Text = Old
	End If
End Sub
Sub peso4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso4.Text = Old
	End If
End Sub


Sub env1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env1.Text = Old
	End If
End Sub

Sub env2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env2.Text = Old
	End If
End Sub

Sub env3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env3.Text = Old
	End If
End Sub

Sub env4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env4.Text = Old
	End If
End Sub

Sub color1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color1.Text = Old
	End If
End Sub

Sub color2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color2.Text = Old
	End If
End Sub

Sub color3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color3.Text = Old
	End If
End Sub

Sub color4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color4.Text = Old
	End If
End Sub
Sub temp1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 5 Then
		temp1.Text = Old
	End If
End Sub
Sub temp2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 5 Then
		temp2.Text = Old
	End If
End Sub
Sub temp3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 5 Then
		temp3.Text = Old
	End If
End Sub
Sub temp4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 5 Then
		temp4.Text = Old
	End If
End Sub

Sub promedio1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio1.Text = Old
	End If
End Sub

Sub max1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max1.Text = Old
	End If
End Sub

Sub min1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min1.Text = Old
	End If
End Sub

Sub promedio2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio2.Text = Old
	End If
End Sub

Sub max2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max2.Text = Old
	End If
End Sub

Sub min2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min2.Text = Old
	End If
End Sub

Sub promedio3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio3.Text = Old
	End If
End Sub

Sub max3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max3.Text = Old
	End If
End Sub

Sub min3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min3.Text = Old
	End If
End Sub

Sub promedio4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio4.Text = Old
	End If
End Sub

Sub max4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max4.Text = Old
	End If
End Sub

Sub min4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min4.Text = Old
	End If
End Sub

Sub bitter1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter1.Text = Old
	End If
End Sub

Sub manchas1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas1.Text = Old
	End If
End Sub

Sub asoleado1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		asoleado1.Text = Old
	End If
End Sub
Sub heridas_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas1.Text = Old
	End If
End Sub
Sub bitter2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter2.Text = Old
	End If
End Sub

Sub manchas2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas2.Text = Old
	End If
End Sub

Sub asoleado2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		asoleado2.Text = Old
	End If
End Sub
Sub heridas2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas2.Text = Old
	End If
End Sub


Sub bitter3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter3.Text = Old
	End If
End Sub

Sub manchas3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas3.Text = Old
	End If
End Sub

Sub asoleado3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		asoleado3.Text = Old
	End If
End Sub
Sub heridas3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas3.Text = Old
	End If
End Sub
Sub bitter4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter4.Text = Old
	End If
End Sub

Sub manchas4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas4.Text = Old
	End If
End Sub

Sub asoleado4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado4.Text = Old
	End If
End Sub
Sub heridas4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas4.Text = Old
	End If
End Sub

Sub bitter5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter5.Text = Old
	End If
End Sub

Sub manchas5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas5.Text = Old
	End If
End Sub

Sub asoleado5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		asoleado5.Text = Old
	End If
End Sub
Sub heridas5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas5.Text = Old
	End If
End Sub

Sub bitter6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		bitter6 .Text = Old
	End If
End Sub

Sub manchas6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		manchas6.Text = Old
	End If
End Sub

Sub asoleado6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		asoleado6.Text = Old
	End If
End Sub
Sub heridas6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		heridas6.Text = Old
	End If
End Sub





Sub var1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var1.Text = Old
	End If
End Sub
Sub var2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var2.Text = Old
	End If
End Sub

Sub var3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var3.Text = Old
	End If
End Sub
Sub var4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var4.Text = Old
	End If
End Sub

Sub var5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var5.Text = Old
	End If
End Sub
Sub var6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		var6.Text = Old
	End If
End Sub

Sub pallet1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet1.Text = Old
	End If
End Sub

Sub pallet2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet2.Text = Old
	End If
End Sub
Sub pallet3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet3.Text = Old
	End If
End Sub

Sub pallet4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet4.Text = Old
	End If
End Sub

Sub pallet5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet5.Text = Old
	End If
End Sub

Sub pallet6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 6 Then
		pallet6.Text = Old
	End If
End Sub

'fin del control de digitos


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
'Sub B4XPage_MenuClick (Tag As String)
'	If Tag = "Info" Then
'		B4XPages.ShowPage("MainPage")
'	End If
'	If Tag ="Carga1" Then
'		B4XPages.ShowPage("Page 1")
'	End If
'	If Tag ="Carga2" Then
'		B4XPages.ShowPage("Page 3")
'	End If
'	If Tag ="Carga3" Then
'		B4XPages.ShowPage("Page 4")
'	End If
'	If Tag ="Carga4" Then
'		B4XPages.ShowPage("Page 5")
'	End If
'	If Tag ="Carga5" Then
'		B4XPages.ShowPage("Page 6")
'	End If
'	If Tag ="Carga6" Then
'		B4XPages.ShowPage("Page 7")
'	End If
'	If Tag ="Carga7" Then
'		B4XPages.ShowPage("Page 8")
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

Sub ceros 'comprueba si no hay nada lleno y pone caja de unidad de daños en 0
	
	If bitter1.Text="" Then
		bitter1.Text="0"
	End If
	If bitter2.Text="" Then
		bitter2.Text="0"
	End If
	If bitter3.Text="" Then
		bitter3.Text="0"
	End If
	If bitter4.Text="" Then
		bitter4.Text="0"
	End If
	If asoleado1.Text="" Then
		asoleado1.Text="0"
	End If
	If asoleado2.Text="" Then
		asoleado2.Text="0"
	End If
	If asoleado3.Text="" Then
		asoleado3.Text="0"
	End If
	If asoleado4.Text="" Then
		asoleado4.Text="0"
	End If
	If heridas1.Text="" Then
		heridas1.Text="0"
	End If
	If heridas2.Text="" Then
		heridas2.Text="0"
	End If

	If heridas3.Text="" Then
		heridas3.Text="0"
	End If

	If heridas4.Text="" Then
		heridas4.Text="0"
	End If

	If manchas1.Text="" Then
		manchas1.Text="0"
	End If
	If manchas2.Text="" Then
		manchas2.Text="0"
	End If

	If manchas3.Text="" Then
		manchas3.Text="0"
	End If

	If manchas4.Text="" Then
		manchas4.Text="0"
	End If
	
	
'	If np1.Text="" Then
'		np1.Text="0"
'	End If
'	If np2.Text="" Then
'		np2.Text="0"
'	End If
'	If np3.Text="" Then
'		np3.Text="0"
'	End If
'	If np4.Text="" Then
'		np4.Text="0"
'	End If
'	If np5.Text="" Then
'		np5.Text="0"
'	End If
'	If np6.Text="" Then
'		np6.Text="0"
'	End If
'	If np7.Text="" Then
'		np7.Text="0"
'	End If
'	If np8.Text="" Then
'		np8.Text="0"
'	End If
'	If np9.Text="" Then
'		np9.Text="0"
'	End If
'	If np10.Text="" Then
'		np10.Text="0"
'	End If
'	If nd1.Text="" Then
'		nd1.Text="0"
'	End If
'	If nd2.Text="" Then
'		nd2.Text="0"
'	End If
'	If nd3.Text="" Then
'		nd3.Text="0"
'	End If
'	If nd4.Text="" Then
'		nd4.Text="0"
'	End If
'	If nd5.Text="" Then
'		nd5.Text="0"
'	End If
'	If nd6.Text="" Then
'		nd6.Text="0"
'	End If
'	If nd7.Text="" Then
'		nd7.Text="0"
'	End If
'	If nd8.Text="" Then
'		nd8.Text="0"
'	End If
'	If nd9.Text="" Then
'		nd9.Text="0"
'	End If
'	If nd10.Text="" Then
'		nd10.Text="0"
'	End If
'	If nd11.Text="" Then
'		nd11.Text="0"
'	End If
'	
'	If nd12.Text="" Then
'		nd12.Text="0"
'	End If
'	If nd13.Text="" Then
'		nd13.Text="0"
'	End If
'	If nd14.Text="" Then
'		nd14.Text="0"
'	End If
'	If nd15 .Text="" Then
'		nd15.Text="0"
'	End If
'	If nd16.Text="" Then
'		nd16.Text="0"
'	End If
'	If nd17.Text="" Then
'		nd17.Text="0"
'	End If
'	If nd18.Text="" Then
'		nd18.Text="0"
'	End If
'	
End Sub
Sub calc_Click
	
	If valid2 =True Then
		MsgboxAsync("Datos validados","ok")
		
		ceros
		total
		'nocerosç
	
	
		'Else
		'	MsgboxAsync("nooo","chau")
	End If
End Sub

Sub total''saca daños parciales y llena caja de textos parciales y daño total
	
	
	'Dim b,c ,d ,danos,tama As Double
	'tama=B4XPages.MainPage.tam.Text
	
'	c=np1.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp1.Text=NumberFormat(d,0,2)
'	
'	c=np2.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp2.Text=NumberFormat(d,0,2)
'	
'	c=np3.Text
'	b=B4XPages.MainPage.tam.Text
'	
'	d=(c/b)*100
'	pp3.Text=NumberFormat(d,0,2)
'	
'	c=np4.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp4.Text=NumberFormat(d,0,2)
'	
'	c=np5.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp5.Text=NumberFormat(d,0,2)
'	
'	c=np6.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp6.Text=NumberFormat(d,0,2)
	
'	c=np7.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp7.Text=NumberFormat(d,0,2)
'	
'	c=np8.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp8.Text=NumberFormat(d,0,2)
'	
'	c=np9.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp9.Text=NumberFormat(d,0,2)
'	
'	c=np10.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pp10.Text=NumberFormat(d,0,2)
'	
'	c=nd1.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd1.Text=NumberFormat(d,0,2)
'	
'	c=nd2.Text
'	b=B4XPages.MainPage.tam.Text
'	pd2.Text=NumberFormat(d,0,2)
'	
'	c=nd3.Text
'	b=B4XPages.MainPage.tam.Text
'	pd3.Text=NumberFormat(d,0,2)
'	
'	c=nd4.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd4.Text=NumberFormat(d,0,2)
'	
'	c=nd5.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd5.Text=NumberFormat(d,0,2)
'	
'	c=nd6.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd6.Text=NumberFormat(d,0,2)
'	
'	c=nd7.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd7.Text=NumberFormat(d,0,2)
'	
'	c=nd8.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd8.Text=NumberFormat(d,0,2)
'	
'	c=nd9.Text
'	b=tama
'	d=(c/b)*100
'	pd9.Text=NumberFormat(d,0,2)
'	
'	c=nd10.Text
'	b=B4XPages.MainPage.tam.Text
'	d=(c/b)*100
'	pd10.Text=NumberFormat(d,0,2)
'	
'	c=nd11.Text
'	b=tama
'	d=(c/b)*100
'	pd11.Text=NumberFormat(d,0,2)
'	
'	c=nd12.Text
'	b=tama
'	d=(c/b)*100
'	pd12.Text=NumberFormat(d,0,2)
'	
'	c=nd13.Text
'	b=tama
'	d=(c/b)*100
'	pd13.Text=NumberFormat(d,0,2)
'	
'	c=nd14.Text
'	b=tama
'	d=(c/b)*100
'	pd14.Text=NumberFormat(d,0,2)
'	
'	c=nd15.Text
'	b=tama
'	d=(c/b)*100
'	pd15.Text=NumberFormat(d,0,2)
'	
'	c=nd16.Text
'	b=tama
'	d=(c/b)*100
'	pd16.Text=NumberFormat(d,0,2)
	'
'	c=nd17.Text
'	b=tama
'	d=(c/b)*100
'	pd17.Text=NumberFormat(d,0,2)
'	
'	c=nd18.Text
'	b=tama
'	d=(c/b)*100
'	pd18.Text=NumberFormat(d,0,2)
	total1.text = NumberFormat(bitter1.Text + manchas1.Text +asoleado1.Text +heridas1.Text,0,2 )

	total2.text = NumberFormat(bitter2.Text + manchas2.Text +asoleado2.Text +heridas2.Text,0,2 )
	total3.text = NumberFormat(bitter3.Text + manchas3.Text +asoleado3.Text +heridas3.Text,0,2 )

	total4.text = NumberFormat(bitter4.Text + manchas4.Text +asoleado4.Text +heridas4.Text,0,2 )

	
	

	'defec.Text=NumberFormat( pp1.Text + pp2.Text + pp3.Text + pp4.Text + pp5.Text + pp6.Text + pp7.Text + pp8.Text + pp9.Text + pp10.Text + pd1.Text + pd2.Text + pd3.Text + pd4.Text + pd5.Text + pd6.Text + pd7.Text + pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text + pd17.Text + pd18.Text,0,2)
	'B4XPages.MainPage.dano.Text=NumberFormat( pp1.Text + pp2.Text + pp3.Text + pp4.Text + pp5.Text + pp6.Text + pp7.Text + pp8.Text + pp9.Text + pp10.Text + pd1.Text + pd2.Text + pd3.Text + pd4.Text + pd5.Text + pd6.Text + pd7.Text + pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text + pd17.Text + pd18.Text,0,2)
	
	'defec2.text=NumberFormat(pd8.Text + pd9.Text + pd10.Text + pd11.Text +pd12.Text + pd13.Text + pd14.Text + pd15.Text + pd16.Text+pd17.Text+pd18.Text,0,2)
End Sub

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

public Sub blanqueo2
	pallet1.Text=""
	pallet2.Text=""
	pallet3.Text=""
	pallet4.Text=""
	var1.Text=""
	var2.Text=""
	var3.Text=""
	var4.Text=""
	env1.Text=""
	env2.Text=""
	env3.Text=""
	env4.Text=""
	peso1.Text=""
	peso2.Text=""
	peso3.Text=""
	peso4.Text=""
	color1.Text=""
	color2.Text=""
	color3.Text=""
	color4.Text=""

	temp1.Text=""
	temp2.Text=""
	temp3.Text=""
	temp4.Text=""
	plu1.Text=""
	plu2.Text=""
	plu3.Text=""
	plu4.Text=""
	promedio1.Text=""
	promedio2.Text=""
	promedio3.Text=""
	promedio4.Text=""
	max1.Text=""
	max2.Text=""
	max3.Text=""
	max4.Text=""
	min1.Text=""
	min2.Text=""
	min3.Text=""
	min4.Text=""
	emp1.SelectedIndex=0
	emp2.SelectedIndex=0
	emp3.SelectedIndex=0
	emp4.SelectedIndex=0
	marca1.SelectedIndex=0
	marca2.SelectedIndex=0
	marca3.SelectedIndex=0
	marca4.SelectedIndex=0
	calidad1.SelectedIndex=0
	calidad2.SelectedIndex=0
	calidad3.SelectedIndex=0

	calidad4.SelectedIndex=0

	apariencia1.SelectedIndex=0
	apariencia2.SelectedIndex=0
	apariencia3.SelectedIndex=0
	apariencia4.SelectedIndex=0
	calidadinterna1.SelectedIndex=1 'Text=""
	calidadinterna2.SelectedIndex=1 'Text=""
	calidadinterna3.SelectedIndex=1 'Text=""
	calidadinterna4.SelectedIndex=1 'Text=""
	sello1.Text=""
	sello2.Text=""
	sello4.Text=""
	sello3.Text=""
	
	bitter1.Text=""
	manchas1.Text=""
	asoleado1.Text=""
	heridas1.Text=""
	total1.Text=""
	bitter2.Text=""
	manchas2.Text=""
	asoleado2.Text=""
	heridas2.Text=""
	total2.Text=""
	bitter3.Text=""
	manchas3.Text=""
	asoleado3.Text=""
	heridas3.Text=""
	total3.Text=""
	bitter4.Text=""
	manchas4.Text=""
	asoleado4.Text=""
	heridas4.Text=""
	total4.Text=""
	
	
	
	
	
	

End Sub

Private Sub Button4_Click
	calc_Click
End Sub
Private Sub Button2_Click
	pallet1.Text="1"
	pallet2.Text="1"
	pallet3.Text="1"
	pallet4.Text="1"
	var1.Text="2"
	var2.Text="2"
	var3.Text="2"
	var4.Text="2"
	env1.Text="3"
	env2.Text="3"
	env3.Text="3"
	env4.Text="3"
	peso1.Text="3"
	peso2.Text="4"
	peso3.Text="4"
	peso4.Text="3"
	color1.Text="av"
	color2.Text="av"
	color3.Text="av"
	color4.Text="av"
	calidadinterna1.SelectedIndex=1 'Text="1"
	calidadinterna2.SelectedIndex=1 'Text="1"
	calidadinterna3.SelectedIndex=1 'Text="1"
	calidadinterna4.SelectedIndex=1 'Text="3"
	sello1.Text="17/1"
	sello2.Text="17/1"
	sello4.Text="17/1"
	sello3.Text="17/1"

	temp1.Text="1"
	temp2.Text="2"
	temp3.Text="3"
	temp4.Text="4"
	plu1.Text="1"
	plu2.Text="2"
	plu3.Text="3"
	plu4.Text="4"
	promedio1.Text="1"
	promedio2.Text="2"
	promedio3.Text="3"
	promedio4.Text="4"
	max1.Text="1"
	max2.Text="1"
	max3.Text="2"
	max4.Text="3"
	min1.Text="4"
	min2.Text="5"
	min3.Text="1"
	min4.Text="2"
	emp1.SelectedIndex=1
	emp2.SelectedIndex=1
	emp3.SelectedIndex=1
	emp4.SelectedIndex=1
	marca1.SelectedIndex=1
	marca2.SelectedIndex=2
	marca3.SelectedIndex=3
	marca4.SelectedIndex=4
	calidad1.SelectedIndex=1
	calidad2.SelectedIndex=2
	calidad3.SelectedIndex=2

	calidad4.SelectedIndex=1

	apariencia1.SelectedIndex=2
	apariencia2.SelectedIndex=3
	apariencia3.SelectedIndex=3
	apariencia4.SelectedIndex=3


End Sub

Private Sub llenar_Click
		
	If  marca1.SelectedIndex=0 Then
		marca1.SelectedIndex =1
	End If
	If  marca2.SelectedIndex=0 Then
		marca2.SelectedIndex =1
	End If
	If  marca3.SelectedIndex=0 Then
		marca3.SelectedIndex =1
	End If
	If  marca4.SelectedIndex=0 Then
		marca4.SelectedIndex =1
	End If
	
	If calidad1.SelectedIndex=0 Then
		calidad1.SelectedIndex=5
	End If
	If calidad2.SelectedIndex=0 Then
		calidad2.SelectedIndex=5
	End If
	If calidad3.SelectedIndex=0 Then
		calidad3.SelectedIndex=5
	End If
	If calidad4.SelectedIndex=0 Then
		calidad4.SelectedIndex=5
	End If
	
	If emp1.SelectedIndex =0 Then
		emp1.SelectediNDEX =1
	End If
	If emp2.SelectedIndex =0 Then
		emp2.SelectediNDEX =1
	End If
	If emp3. SelectedIndex=0 Then
		emp3.SelectedIndex =1
		
	End If
	If emp4.SelectedIndex =0 Then
		emp4.SelectedIndex=1
		
	End If
	
	If apariencia1.SelectedIndex =0 Then
		apariencia1.SelectediNDEX =4
	End If
	
	If apariencia2.SelectedIndex =0 Then
		apariencia2.SelectediNDEX =4
	End If
	If apariencia3. SelectedIndex=0 Then
		apariencia3.SelectedIndex =4
		
	End If
	If apariencia4.SelectedIndex =0 Then
		apariencia4.SelectedIndex=4
		
	End If
	
	If calidadinterna1.SelectedIndex =0 Then
		calidadinterna1.SelectediNDEX =4
	End If
	If calidadinterna2.SelectedIndex =0 Then
		calidadinterna2.SelectediNDEX =4
	End If
	If calidadinterna3. SelectedIndex=0 Then
		calidadinterna3.SelectedIndex =4
		
	End If
	If calidadinterna4.SelectedIndex =0 Then
		calidadinterna4.SelectedIndex=4
		
	End If
	
	If pallet1.text ="" Then
		pallet1.text="S/D"
	End If
	
	If pallet2.text ="" Then
		pallet2.text="S/D"
	End If
	If pallet3.text ="" Then
		pallet3.text="S/D"
	End If
	If pallet4.text ="" Then
		pallet4.text="S/D"
	End If
	If env1.text ="" Then
		env1.text="S/D"
	End If
	If env2.text ="" Then
		env2.text="S/D"
	End If
	If env3.text ="" Then
		env3.text="S/D"
	End If
	If env4.text ="" Then
		env4.text="S/D"
	End If
	If var1.text ="" Then
		var1.text="S/D"
	End If
	If var2.text ="" Then
		var2.text="S/D"
	End If
	If var3.text ="" Then
		var3.text="S/D"
	End If
	If var4.text ="" Then
		var4.text="S/D"
	End If
	
	If temp1.text ="" Then
		temp1.text="S/D"
	End If
	
	If temp2.text ="" Then
		temp2.text="S/D"
	End If
	If temp3.text ="" Then
		temp3.text="S/D"
	End If
	If temp4.text ="" Then
		temp4.text="S/D"
	End If
	
	If color1.text ="" Then
		color1.text="S/D"
	End If
	
	If color2.text ="" Then
		color2.text="S/D"
	End If
	If color3.text ="" Then
		color3.text="S/D"
	End If
	If color4.text ="" Then
		color4.text="S/D"
	End If
	
	If peso1.text ="" Then
		peso1.text="S/D"
	End If
	If peso2.text ="" Then
		peso2.text="S/D"
	End If
	If peso3.text ="" Then
		peso3.text="S/D"
	End If
	If peso4.text ="" Then
		peso4.text="S/D"
	End If
	
	
	If plu1.text ="" Then
		plu1.text="S/D"
	End If
	
	If plu2.text ="" Then
		plu2.text="S/D"
	End If
	If plu3.text ="" Then
		plu3.text="S/D"
	End If
	If plu4.text ="" Then
		plu4.text="S/D"
	End If
	
	If sello1.text ="" Then
		sello1.text="S/D"
	End If
	If sello2.text ="" Then
		sello2.text="S/D"
	End If
	If sello3.text ="" Then
		sello3.text="S/D"
	End If
	If sello4.text ="" Then
		sello4.text="S/D"
	End If
	
	
	If max1.text ="" Then
		max1.text="S/D"
	End If
	If max2.text ="" Then
		max2.text="S/D"
	End If
	If max3.text ="" Then
		max3.text="S/D"
	End If
	If max4.text ="" Then
		max4.text="S/D"
	End If
	
	If min1.text ="" Then
		min1.text="S/D"
	End If
	If min2.text ="" Then
		min2.text="S/D"
	End If
	If min3.text ="" Then
		min3.text="S/D"
	End If
	If min4.text ="" Then
		min4.text="S/D"
	End If
	
	If promedio1.text ="" Then
		promedio1.text="S/D"
	End If
	If promedio2.text ="" Then
		promedio2.text="S/D"
	End If
	If promedio3.text ="" Then
		promedio3.text="S/D"
	End If
	If promedio4.text ="" Then
		promedio4.text="S/D"
	End If
	
	
End Sub
