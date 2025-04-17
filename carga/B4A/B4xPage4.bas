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
'	Private defec As String
'	Private defec2 As String
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
	Public temp1 As EditText
	Public temp2 As EditText
	Public temp3 As EditText
	Public temp4 As EditText
	Public temp5 As EditText
	Public temp6 As EditText
	Public promedio1 As EditText
	Public promedio2 As EditText
	Public promedio3 As EditText
	Public promedio4 As EditText
	Public promedio5 As EditText
	Public promedio6 As EditText
	Public max1 As EditText
	Public max2 As EditText
	Public max3 As EditText
	Public max4 As EditText
	Public max5 As EditText
	Public max6 As EditText
	Public min1 As EditText
	Public min2 As EditText
	Public min3 As EditText
	Public min4 As EditText
	Public min5 As EditText
	Public min6 As EditText
	Public plu1 As EditText
	Public plu2 As EditText
	Public plu3 As EditText
	Public plu4 As EditText
	Public plu5 As EditText
	Public plu6 As EditText
	
	
	

	

	
	
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private Button6 As Button
	
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
	Public marca5 As Spinner
	Public marca6 As Spinner
	
	Public env1 As EditText
	Public env2 As EditText
	Public env3 As EditText
	Public env4 As EditText
	Public env5 As EditText
	Public env6 As EditText
	
	Public calidad1 As Spinner
	Public calidad2 As Spinner
	Public calidad3 As Spinner
	Public calidad4 As Spinner
	Public calidad5 As Spinner
	Public calidad6 As Spinner

	Public sello1 As EditText
	Public sello2 As EditText
	Public sello3 As EditText
	Public sello4 As EditText
	Public sello5 As EditText
	Public sello6 As EditText
	
	Public date1 As Button
	Public date2 As Button
	Public date3 As Button
	Public date4 As Button
	Public date5 As Button
	Public date6 As Button

	Public peso1 As EditText
	Public peso2 As EditText
	Public peso3 As EditText
	Public peso4 As EditText
	
	Public peso5 As EditText
	Public peso6 As EditText
	
	Public apariencia1 As Spinner
	Public apariencia2 As Spinner
	Public apariencia3 As Spinner
	Public apariencia4 As Spinner
	Public apariencia5 As Spinner
	Public apariencia6 As Spinner
	
	Public color1 As EditText
	Public color2 As EditText
	Public color3 As EditText
	Public color4 As EditText
	
	Public color5 As EditText
	Public color6 As EditText
	
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
	Public calidinterna3 As Spinner
	Public calidinterno4 As  Spinner
	Public calidinterna1 As  Spinner
	Public calidinterna2 As  Spinner
	
	Public calidinterna5 As  Spinner
	Public calidinterna6 As  Spinner
	
	



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

	Private lbl19 As Label
	Private Button5 As Button
	Private Button7 As Button
	Private Button8 As Button
	Private Button9 As Button
	
	Private Label31 As Label
	Private Label34 As Label
	Private Label35 As Label
	Private Label36 As Label
	Private Label81 As Label
	Private Label82 As Label
	Private label99 As Label
	
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
	
	ScrollView1.Panel.LoadLayout("carg2finalmod3")'("carga2bbbb3x")
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
	Panel2.Color=Colors.RGB(131,222,210)
	Label30.Text="Datos Carga 1"
	'lblPage1Title.Text="Datos Carga 1"
	Label3.Text="Datos Carga 2"
	Label19.Text="Datos Carga 3"
	lbl19.Text="Datos Carga 4"
	Label6.Text="Datos Carga 5"
	Label20.Text="Datos Carga 6"
	B4XPages.SetTitle(Me, "Datos Cargas 1 -6")
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	MainPage.com1=True
	Log("COM1")
	Log(MainPage.COM1)
	
	
	
#if B4a
	ScrollView1.Panel.Height = Panel2.Height
	
	
	#End If
	
	'load the layout to Root
	
'	B4XPages.AddMenuItem(Me, "Info")
'	B4XPages.AddMenuItem(Me, "Daños")
'	B4XPages.AddMenuItem(Me, "Camara")
'	B4XPages.AddMenuItem(Me, "Terminar")
	B4XPages.AddMenuItem(Me, "Info")
'	B4XPages.AddMenuItem(Me, "Carga1")
'	B4XPages.AddMenuItem(Me, "Carga2")
'	B4XPages.AddMenuItem(Me, "Carga3")
'	B4XPages.AddMenuItem(Me, "Carga4")
'	B4XPages.AddMenuItem(Me, "Carga5")
'	B4XPages.AddMenuItem(Me, "Carga6")
	B4XPages.AddMenuItem(Me, "Carga7")
	B4XPages.AddMenuItem(Me, "Camara")

	Bmp.Initialize(File.DirAssets, "android48.png")
	Dim list2 As List
	Dim list3 As List
	
	list2 = File.ReadList(cargas, "marc.txt")
	
	list3 = File.ReadList(cargas, "emp.txt")''emp
	
	
	'Dim list1,list2 As List
	
	'list1 = File.ReadList(cargas, "marc.txt")
	
	emp1.AddAll(list3)
	emp2.AddAll(list3)
	emp3.AddAll(list3)
	emp4.AddAll(list3)
	emp5.AddAll(list3)
	emp6.AddAll(list3)

	

End Sub
Sub valid As  Boolean ''valida cajas de texto y combos
	Dim a,b,c,d,e As Boolean
	a=False
	b=False
	c=False
	d=False
	a=emp1.SelectedIndex=0 Or emp2.SelectedIndex=0 Or emp3.SelectedIndex=0 Or emp4.SelectedIndex=0 Or marca1.SelectedIndex=0 Or marca2.SelectedIndex=0 Or marca3.SelectedIndex=0 Or marca4.SelectedIndex=0
	b=calidad1.SelectedIndex=0 Or calidad2.SelectedIndex=0 Or calidad3.SelectedIndex=0 Or calidad4.SelectedIndex=0 Or apariencia1.SelectedIndex=0 Or apariencia2.SelectedIndex=0 Or apariencia3.SelectedIndex=0 Or apariencia4.SelectedIndex=0

	c= pallet1.Text="" Or pallet2.Text="" Or pallet3.Text="" Or pallet4.Text="" Or env1.Text="" Or env2.Text="" Or env3.Text="" Or env4.Text="" Or peso1.Text="" Or peso2.Text="" Or peso3.Text="" Or peso4.Text=""
	d= color1.Text="" Or color2.Text="" Or color3.Text="" Or color4.Text="" Or temp1.Text="" Or temp2.Text="" Or temp3.Text="" Or temp4.Text="" Or  var1.Text="" Or var2.Text="" Or var3.Text="" Or var4.Text="" Or sello1.Text="" Or sello2.Text="" Or sello3.Text="" Or sello4.Text=""
	
	
	'c=tam.Text="" Or var.Text="" Or tempe.Text="" Or tempe.Text="" Or lote.Text=""
	'd=emb.Text="" Or up.SelectedIndex=0
	'valida si tiene al menos una categoria de  daño
	
	If a=True Or b= True Or c=True Or d=True Then
		Msgbox("Debe completar los datos","ERROR")
		Return False
	End If
	Return True
	
	
End Sub

'control de los digitos

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
Sub peso5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso5.Text = Old
	End If
End Sub
Sub peso6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		peso6.Text = Old
	End If
End Sub
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

Sub plu5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu5.Text = Old
	End If
End Sub

Sub plu6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		plu6.Text = Old
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
Sub env5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env5.Text = Old
	End If
End Sub

Sub env6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		env6.Text = Old
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

Sub color5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color5.Text = Old
	End If
End Sub

Sub color6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		color6.Text = Old
	End If
End Sub
Sub temp1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp1.Text = Old
	End If
End Sub
Sub temp2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp2.Text = Old
	End If
End Sub
Sub temp3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp3.Text = Old
	End If
End Sub
Sub temp4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp4.Text = Old
	End If
End Sub
Sub temp5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp5.Text = Old
	End If
End Sub
Sub temp6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		temp6.Text = Old
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
Sub min4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min4.Text = Old
	End If
End Sub

Sub max4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max4.Text = Old
	End If
End Sub

Sub promedio5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio5.Text = Old
	End If
End Sub
Sub min5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min5.Text = Old
	End If
End Sub

Sub max5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max5.Text = Old
	End If
End Sub

Sub promedio6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		promedio6.Text = Old
	End If
End Sub
Sub min6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		min6.Text = Old
	End If
End Sub

Sub max6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 4 Then
		max6.Text = Old
	End If
End Sub







Sub bitter1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter1.Text = Old
	End If
End Sub

Sub manchas1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas1.Text = Old
	End If
End Sub

Sub asoleado1_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado1.Text = Old
	End If
End Sub
Sub heridas_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		heridas1.Text = Old
	End If
End Sub
Sub bitter2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter2.Text = Old
	End If
End Sub

Sub manchas2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas2.Text = Old
	End If
End Sub

Sub asoleado2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado2.Text = Old
	End If
End Sub
Sub heridas2_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		heridas2.Text = Old
	End If
End Sub


Sub bitter3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter3.Text = Old
	End If
End Sub

Sub manchas3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas3.Text = Old
	End If
End Sub

Sub asoleado3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado3.Text = Old
	End If
End Sub
Sub heridas3_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		heridas3.Text = Old
	End If
End Sub




Sub bitter4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter4.Text = Old
	End If
End Sub

Sub manchas4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas4.Text = Old
	End If
End Sub

Sub asoleado4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado4.Text = Old
	End If
End Sub
Sub heridas4_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		heridas4.Text = Old
	End If
End Sub



Sub bitter5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter5.Text = Old
	End If
End Sub

Sub manchas5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas5.Text = Old
	End If
End Sub

Sub asoleado5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado5.Text = Old
	End If
End Sub
Sub heridas5_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		heridas5.Text = Old
	End If
End Sub

Sub bitter6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		bitter6.Text = Old
	End If
End Sub

Sub manchas6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		manchas6.Text = Old
	End If
End Sub

Sub asoleado6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
		asoleado6.Text = Old
	End If
End Sub
Sub heridas6_TextChanged (Old As String, New As String)'hacer 234
	If New.Length > 3 Then
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
	If Tag = "Daños" Then
		B4XPages.ShowPage("Page 1")
	End If
	If Tag = "Camara" Then
		B4XPages.ShowPage("Page 2")
	End If
	If Tag = "Terminar" Then
		'terminar
		B4XPages.ShowPage("MainPage")
		
	End If
End Sub

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
	
	If valid =True Then
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

public Sub blanqueo
	
	plu1.text=""
	plu2.text=""
	plu3.text=""
	plu4.text=""
	plu5.text=""
	plu6.text=""
	
	
	pallet1.Text=""
	pallet2.Text=""
	pallet3.Text=""
	pallet4.Text=""
	pallet5.Text=""
	pallet6.Text=""
	

	temp1.Text=""
	temp2.Text=""
	temp3.Text=""
	temp4.Text=""
	temp5.Text=""
	temp6.Text=""
	promedio1.Text=""
	promedio2.Text=""
	promedio3.Text=""
	promedio4.Text=""
	promedio5.Text=""
	promedio6.Text=""
	max1.Text=""
	max2.Text=""
	max3.Text=""
	max4.Text=""
	min1.Text=""
	min2.Text=""
	min3.Text=""
	min4.Text=""
	min5.Text=""
	min6.Text=""
	
	emp1.SelectedIndex=0
	emp2.SelectedIndex=0
	emp3.SelectedIndex=0
	emp4.SelectedIndex=0
	emp5.SelectedIndex=0
	emp6.SelectedIndex=0
	
	

End Sub
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

	y=emp1.SelectedItem
	z=y.SubString2(0,2)
	'
	a=z & ";"& pallet1.Text & ";"& temp1.Text & ";"& plu1.Text & ";"& promedio1.Text & ";"& min1.Text & ";"& max1.Text



'	c=z & ";"& Page5.pallet1.Text & ";"& Page5.temp1.Text & ";"& Page5.plu1.Text & ";"& Page5.promedio1.Text & ";"& Page5.Min1.Text & ";"& Page5.Max1.Text
'	
'	d=z & ";"& Page6.pallet1.Text & ";"& Page6.temp1.Text & ";"& Page6.plu1.Text & ";"& Page6.promedio1.Text & ";"& Page6.Min1.Text & ";"& Page6.Max1.Text
''	
	e=z & ";"& pallet2.Text & ";"& temp2.Text & ";"& plu2.Text & ";"& promedio2.Text & ";"& min2.Text & ";"& max2.Text
'	f=z & ";"& Page5.pallet2.Text & ";"& Page5.temp2.Text & ";"& Page5.plu2.Text & ";"& Page5.promedio2.Text & ";"& Page5.Min2.Text & ";"& Page5.Max2.Text
'	g=z & ";"& Page6.pallet2.Text & ";"& Page6.temp2.Text & ";"& Page6.plu2.Text & ";"& Page6.promedio2.Text & ";"& Page6.Min2.Text & ";"& Page6.Max2.Text
''	
	h=z & ";"& pallet3.Text & ";"& temp3.Text & ";"& plu3.Text & ";"& promedio3.Text & ";"& min3.Text & ";"& max3.Text
'	u=z & ";"& Page5.pallet3.Text & ";"& Page5.temp3.Text & ";"& Page5.plu3.Text & ";"& Page5.promedio3.Text & ";"& Page5.Min3.Text & ";"& Page5.Max3.Text
'	j=z & ";"& Page6.pallet3.Text & ";"& Page6.temp3.Text & ";"& Page6.plu3.Text & ";"& Page6.promedio3.Text & ";"& Page6.Min3.Text & ";"& Page6.Max3.Text
''	
	k=z & ";"& pallet4.Text & ";"& temp4.Text & ";"& plu4.Text & ";"& promedio4.Text & ";"& min4.Text & ";"& max4.Text
'	m=z & ";"& Page5.pallet4.Text & ";"& Page5.temp4.Text & ";"& Page5.plu4.Text & ";"& Page5.promedio4.Text & ";"& Page5.Min4.Text & ";"& Page5.Max4.Text
'	n=z & ";"& Page6.pallet4.Text & ";"& Page6.temp4.Text & ";"& Page6.plu4.Text & ";"& Page6.promedio4.Text & ";"& Page6.Min4.Text & ";"& Page6.Max4.Text
''	
	o=z & ";"& pallet5.Text & ";"& temp5.Text & ";"& plu5.Text & ";"& promedio5.Text & ";"& min5.Text & ";"& max5.Text
'	p=z & ";"& Page5.pallet5.Text & ";"& Page5.temp5.Text & ";"& Page5.plu5.Text & ";"& Page5.promedio5.Text & ";"& Page5.Min5.Text & ";"& Page5.Max5.Text
'	q=z & ";"& Page6.pallet5.Text & ";"& Page6.temp5.Text & ";"& Page6.plu5.Text & ";"& Page6.promedio5.Text & ";"& Page6.Min5.Text & ";"& Page6.Max5.Text
''	
	r=z & ";"& pallet6.Text & ";"& temp6.Text & ";"& plu6.Text & ";"& promedio6.Text & ";"& min6.Text & ";"& max6.Text
'	s=z & ";"& Page5.pallet6.Text & ";"& Page5.temp6.Text & ";"& Page5.plu6.Text & ";"& Page5.promedio6.Text & ";"& Page5.Min6.Text & ";"& Page5.Max6.Text
'	t=z & ";"& Page6.pallet6.Text & ";"& Page6.temp6.Text & ";"& Page6.plu6.Text & ";"& Page6.promedio6.Text & ";"& Page6.Min6.Text & ";"& Page6.Max6.Text
'
'
'
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
'	
'	
	'a=b & c & d & f & e '& g '& h
'	h="Informe" & ";" & "fecha" & ";" & "M"& ";" & "Grado" & ";" &"Empresa"& ";" & "Sello" & ";"
	i="Empresa" & ";" & "Pallet" & ";" & "Temp." & ";" &  "Plu" & ";" & "Promedio" & ";" & "Minimo" & ";"& "Maximo"  ' & ";"  & "Peso" & ";" & "Ap.inicial" & ";" &"Color " & ";" & "Temp." & ";"  & "plu" & ";" & "Prom."& ";" & "Max." & ";" & "Min." & ";" & "Cal.Interna" & ";"  & "Bitter" & ";"  & "Manchas" & ";"  & "Asoleado" & ";" &  "Heridas" & ";" & "Total"
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
	writer2.Initialize(File.OpenOutput( ftp3 ,"adc" & "zz" &".csv",False))
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
Private Sub Button4_Click
	'calc_Click
End Sub
Private Sub Button2_Click
	
	
	

	emp1.SelectedIndex=4
	emp2.SelectedIndex=2
	emp3.SelectedIndex=1
	emp4.SelectedIndex=3
	emp5.SelectedIndex=4
	emp6.SelectedIndex=5
	pallet1.text="22222"
	pallet2.text="333333"
	pallet3.text="444444"
	pallet4.text="55555"
	pallet5.text="66666"
	pallet6.text="777777"
	temp1.text="47.6"
	temp2.text="48.6"
	temp3.text="49.6"
	temp4.text="50.6"
	temp5.text="51.6"
	temp6.text="52.6"
	promedio1.text="53.6"
	promedio2.text="54.6"
	promedio3.text="55.6"
	promedio4.text="56.6"
	promedio5.text="57.6"
	promedio6.text="58.6"
	max1.text="59.6"
	max2.text="60.6"
	max3.text="61.6"
	max4.text="62.6"
	max5.text="63.6"
	max6.text="64.6"
	min1.text="65.6"
	min2.text="66.6"
	min3.text="67.6"
	min4.text="68.6"
	min5.text="69.6"
	min6.text="70.6"
	plu1.text="aaa"
	plu2.text="bbb"
	plu3.text="ccc"
	plu4.text="ddd"
	plu5.text="eee"
	plu6.text="fff"
'final2

End Sub



Private Sub Button3_Click
	
	
		
	
	
	
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
	If emp5. SelectedIndex=0 Then
		emp5.SelectedIndex =1
		
	End If
	If emp6.SelectedIndex =0 Then
		emp6.SelectedIndex=1
		
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
	
	If pallet5.text ="" Then
		pallet5.text="S/D"
	End If
	If pallet6.text ="" Then
		pallet6.text="S/D"
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
	
	
	If temp5.text ="" Then
		temp5.text="S/D"
	End If
	If temp6.text ="" Then
		temp6.text="S/D"
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
	
	
	If plu5.text ="" Then
		plu5.text="S/D"
	End If
	
	If plu6.text ="" Then
		plu6.text="S/D"
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
	If max6.text ="" Then
		max6.text="S/D"
	End If
	If max5.text ="" Then
		max5.text="S/D"
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
	If min5.text ="" Then
		min5.text="S/D"
	End If
	If min6.text ="" Then
		min6.text="S/D"
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
	If promedio5.text ="" Then
		promedio5.text="S/D"
	End If
	If promedio6.text ="" Then
		promedio6.text="S/D"
	End If
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
End Sub
