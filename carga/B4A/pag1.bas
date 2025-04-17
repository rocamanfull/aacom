B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private xui As XUI 'ignore
	Dim ScrollView1 As ScrollView
	Dim Panel1 As Panel
	
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage2")
	ScrollView1.Panel.LoadLayout("page3")
#if B4a
	ScrollView1.Panel.Height = Panel1.Height
	#End If
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.