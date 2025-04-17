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
	Private Label31 As Label
	Private Label32 As Label
	Private Label33 As Label
	Private Label34 As Label
	Private Label35 As Label
	Private Label36 As Label
	Private Label38 As Label
	Private Label39 As Label
	Private Label4 As Label
	Private Label40 As Label
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
	Private Label70 As Label
	Private label72 As Label
	Private Label73 As Label
	Private Label74 As Label
	Private Label75 As Label
	Private Label76 As Label
	Private Label77 As Label
	Private Label78 As Label
	Private Label79 As Label
	Private Label80 As Label
	Private Label81 As Label
	Private Label83 As Label
	Private Label84 As Label
	Private Label85 As Label
	Private Label86 As Label
	Private label88 As Label
	Private label99 As Label

	
	
	

	
	Public pallet1 As EditText
	Public pallet2 As EditText
	Public pallet3 As EditText
	Public pallet4 As EditText
	

'	Public emp1 As Spinner
'	Public emp2 As Spinner
'	Public emp3 As Spinner
'	Public emp4 As Spinner
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
'	Public sello1 As EditText
'	Public sello2 As EditText
'	Public sello3 As EditText
'	Public sello4 As EditText
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
'
'	Public calidadinterna3 As Spinner
'	Public calidadinterno4 As  Spinner
'	Public calidadinterna1 As  Spinner
'	Public calidadinterna2 As  Spinner
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
'	
	
	
	

	
	

	

	
	
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private Button6 As Button
	
	





'
	Private lblPage1Title As Label
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
	


	Private Button1 As Button

	Private llenar As Button
	Private otra As Button
	Private otra2 As Button
	
	
	Private Label1 As Label
	Private Label10 As Label
	Private Label15 As Label
	Private Label19 As Label
	Private label2 As Label
	Private Label20 As Label
	Private Label22 As Label
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
	Panel2.Color=Colors.RGB(255,245,238)
	
	lblPage1Title.Text="Datos Carga 5"
	Label3.Text="Datos Carga 6"
	Label19.Text="Datos Carga 7"
	Label70.Text="Datos Carga 8"
	B4XPages.SetTitle(Me, "Datos Cargas 5-8")
	
	
	
	
	Dim MainPage As B4XMainPage = B4XPages.GetPage("MainPage")
	MainPage.bol2=True
	Log("carg1 es "& MainPage.carg1)
	Log("carg2 es "& MainPage.carg2)
	Log("bol1 es "& MainPage.bol1)
	Log("bol2 es "& MainPage.bol2)
	Log("super es "& MainPage.super)
	
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
	B4XPages.AddMenuItem(Me, "Bolsa1")
	B4XPages.AddMenuItem(Me, "Bolsa2")
	'B4XPages.AddMenuItem(Me, "Carga7")
	B4XPages.AddMenuItem(Me, "Camara")

	
	Bmp.Initialize(File.DirAssets, "android48.png")
	Dim list2 As List
	Dim list3 As List
	
	list2 = File.ReadList(cargas, "marc.txt")
	
	list3 = File.ReadList(cargas, "emp.txt")''emp
	
	
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
'	
	
	
	

End Sub
'Sub valid As  Boolean ''valida cajas de texto y combos ACa no se valida queda como recuerdo
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
'Sub total''saca daños parciales y llena caja de textos parciales y daño total Solo queda como recuerdo
'	
'	
'
'
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

public Sub blanqueo
	
	
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

Private Sub Button4_Click
	'calc_Click
End Sub
Private Sub Button2_Click
	
End Sub



Sub LlenarPesos
	' Columna A
	If pallet1.Text.trim= "" Then pallet1.Text = "s/d"
	If pallet2.Text.Trim = "" Then pallet2.Text = "s/d"
	If pallet3.Text.Trim = "" Then pallet3.Text = "s/d"
	If pallet4.Text.Trim = "" Then pallet4.Text = "s/d"
	
	
	
	
	
	If peso1a.Text.trim= "" Then peso1a.Text = "s/d"
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




Private Sub otra2_Click
	
End Sub

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


Private Sub otra_Click
	LlenarPesos
End Sub