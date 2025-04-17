B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
' PageTextFields.bas (Clase B4XPage para la página con cajas de texto)

Sub Class_Globals
	Private Root As B4XView ' Contenedor raíz de la página
	Private ScrollView1 As ScrollView ' ScrollView para desplazamiento
End Sub

' Inicializar la página
Public Sub Initialize
End Sub

' Método que se llama cuando la página es creada
Public Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("LayoutPage") ' Debes crear este layout en blanco en el Designer

	' Inicializar el ScrollView y configurarlo
	ScrollView1.Initialize(5000dip) ' Altura grande para permitir scroll
	Root.AddView(ScrollView1, 0, 0, 100%x, 100%y) ' Agregar ScrollView a la vista principal

	' Panel interno dentro del ScrollView
	Dim innerPanel As Panel
	innerPanel.Initialize("")
	ScrollView1.Panel.AddView(innerPanel, 0, 0, 100%x, 5000dip)

	' Bucle para crear 100 cajas de texto
	Dim topOffset As Int = 10dip
	For i = 1 To 100
		Dim txtField As EditText
		txtField.Initialize("txtField")
		txtField.Hint = "Campo " & i ' Texto de sugerencia
		txtField.TextSize = 16 ' Tamaño de texto
		txtField.SingleLine = True
		txtField.Gravity = Gravity.CENTER_VERTICAL + Gravity.LEFT
		innerPanel.AddView(txtField, 10dip, topOffset, 90%x, 60dip)

		topOffset = topOffset + 70dip ' Espacio entre cada caja
	Next

	' Ajuste la altura del innerPanel al final
	innerPanel.Height = topOffset
End Sub
