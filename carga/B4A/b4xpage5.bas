B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
'Sub Class_Globals
'	Private Root As B4XView 'ignore
'	Private xui As XUI 'ignore
'End Sub
'
''You can add more parameters here.
'Public Sub Initialize As Object
'	Return Me
'End Sub
'
''This event will be called once, before the page becomes visible.
'Private Sub B4XPage_Created (Root1 As B4XView)
'	Root = Root1
'	'load the layout to Root
'	
'End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
'#Region Project Attributes
'    #MainFormWidth: 600
'    #MainFormHeight: 400
'#End Region

Sub Class_Globals
	Private Root As B4XView 'ign
	Private FTP As FTP
    Private carpetaLocal As String = File.DirRootExternal & "/MiCarpeta"
    Private archivos() As String
    Private archivosFallidos As List
    Private indiceArchivo As Int
    Private ReintentoTimer As Timer
    Private xui As XUI
    Private ListView As ListView
    Private btnSubir As B4XView
End Sub

Public Sub Initialize
    ' Inicializar objetos
    archivosFallidos.Initialize
    ReintentoTimer.Initialize("ReintentoTimer", 300000) ' Reintentar en 5 minutos
End Sub

Public Sub B4XPage_Created (Root1 As B4XView)
    Root = Root1
    Root.LoadLayout("MainPage3") ' Asegúrate de tener un diseño con ListView y btnSubir
    
    ' Configurar FTP
    FTP.Initialize("FTP", "ftp.tuservidor.com", 21, "usuario", "contraseña")

'    ' Cargar archivos en ListView
'    CargarArchivos()
'    
'    ' Evento botón subir
'    btnSubir.SetText("Subir Carpeta")
'    btnSubir.SetOnClickListener(Me, "SubirCarpeta")
End Sub

' Cargar archivos en la lista visual
'Sub CargarArchivos
'	
'    If File.Exists(carpetaLocal, "") Then
'        archivos = File.ListFiles(carpetaLocal)
'        ListView.Clear
'        For Each archivo As String In archivos
'            ListView.AddTextItem(archivo, archivo)
'        Next
'    Else
'        xui.MsgboxAsync("La carpeta no existe.", "Error")
'    End If
'End Sub

'' Iniciar la subida de la carpeta
'Sub SubirCarpeta()
'    If archivos.Length > 0 Then
'        indiceArchivo = 0
'        archivosFallidos.Clear
'        SubirSiguienteArchivo()
'    Else
'        xui.MsgboxAsync("No hay archivos para subir.", "Información")
'    End If
'End Sub

'' Subir un archivo y luego el siguiente
'Sub SubirSiguienteArchivo()
'    If indiceArchivo < archivos.Length Then
'        Dim archivo As String = archivos(indiceArchivo)
'        Log("Subiendo: " & archivo)
'        FTP.UploadFile(carpetaLocal, archivo, False, "/MiCarpetaRemota/" & archivo)
'    Else
'        MostrarErrores()
'    End If
'End Sub
'
'' Evento de finalización de subida
'Sub FTP_UploadCompleted(ServerPath As String, Success As Boolean)
'    If Success Then
'        Log("Subida exitosa: " & archivos(indiceArchivo))
'    Else
'        Log("Error al subir: " & archivos(indiceArchivo))
'        archivosFallidos.Add(archivos(indiceArchivo))
'    End If
'    indiceArchivo = indiceArchivo + 1
'    SubirSiguienteArchivo()
'End Sub
'
'' Mostrar errores y programar reintento
'Sub MostrarErrores()
'    If archivosFallidos.Size > 0 Then
'        Dim mensaje As String = "No se pudieron subir los siguientes archivos:" & CRLF
'        For Each archivo As String In archivosFallidos
'            mensaje = mensaje & "- " & archivo & CRLF
'        Next
'        mensaje = mensaje & CRLF & "Se intentará nuevamente en 5 minutos."
'        xui.MsgboxAsync(mensaje, "Error en la subida")
'        ReintentoTimer.Enabled = True ' Programar reintento
'    Else
'        xui.MsgboxAsync("Todos los archivos se subieron correctamente.", "Éxito")
'        EliminarArchivosLocales()
'    End If
'End Sub
'
'' Reintento automático después de 5 minutos
'Sub ReintentoTimer_Tick
'    Log("Reintentando subida de archivos fallidos...")
'    ReintentoTimer.Enabled = False
'    SubirArchivosFallidos()
'End Sub
'
'' Intentar subir solo los archivos fallidos
'Sub SubirArchivosFallidos()
'    If archivosFallidos.Size > 0 Then
'        archivos = archivosFallidos.ToArray
'        indiceArchivo = 0
'        archivosFallidos.Clear
'        SubirSiguienteArchivo()
'    Else
'        Log("No hay archivos pendientes por subir.")
'    End If
'End Sub
'
'' Eliminar archivos locales después de la subida exitosa
'Sub EliminarArchivosLocales()
'    For Each archivo As String In archivos
'        If archivosFallidos.IndexOf(archivo) = -1 Then ' Solo borrar los subidos correctamente
'            File.Delete(carpetaLocal, archivo)
'            Log("Archivo eliminado: " & archivo)
'        End If
'    Next
'    Log("Carpeta limpiada")
'End Sub
