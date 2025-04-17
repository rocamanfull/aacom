B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=12.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
'
'Sub Process_Globals
'	'These global variables will be declared once when the application starts.
'	'These variables can be accessed from all modules.
'
'End Sub
'
'Sub Globals
'	'These global variables will be redeclared each time the activity is created.
'	'These variables can only be accessed from this module.
'
'End Sub
'
'Sub Activity_Create(FirstTime As Boolean)
'	'Do not forget to load the layout file created with the visual designer. For example:
'	'Activity.LoadLayout("Layout1")
'
'End Sub
'
'Sub Activity_Resume
'
'End Sub
'
'Sub Activity_Pause (UserClosed As Boolean)
'
'End Sub
Sub Process_Globals
    Private FTP As FTP
    Private carpetaLocal As String = File.DirRootExternal & "/MiCarpeta" ' Carpeta a subir
    Private archivos() As String
    Private indiceArchivo As Int = 0
    Private archivosFallidos As List
    Private ReintentoTimer As Timer
End Sub

Sub Activity_Create(FirstTime As Boolean)
    If FirstTime Then
        FTP.Initialize("FTP", "ftp.tuservidor.com", 21, "usuario", "contraseña")
        archivosFallidos.Initialize
        ReintentoTimer.Initialize("ReintentoTimer", 300000) ' 300,000 ms = 5 minutos
    End If
    SubirCarpeta()
End Sub

' Función para iniciar la subida de la carpeta
Sub SubirCarpeta()
    If File.Exists(carpetaLocal, "") Then
        archivos = File.ListFiles(carpetaLocal)
        If archivos.Length > 0 Then
            indiceArchivo = 0
            archivosFallidos.Clear ' Limpiar errores anteriores
            SubirSiguienteArchivo()
        Else
            Log("No hay archivos en la carpeta")
        End If
    Else
        Log("La carpeta no existe")
    End If
End Sub

' Subir un archivo y luego proceder con el siguiente
Sub SubirSiguienteArchivo()
    If indiceArchivo < archivos.Length Then
        Dim archivo As String = archivos(indiceArchivo)
        Log("Subiendo: " & archivo)
        FTP.UploadFile(carpetaLocal, archivo, False, "/MiCarpetaRemota/" & archivo)
    Else
        Log("Todos los archivos han sido procesados")
        MostrarErrores()
    End If
End Sub

' Evento de finalización de subida
Sub FTP_UploadCompleted(ServerPath As String, Success As Boolean)
    If Success Then
        Log("Subida exitosa: " & archivos(indiceArchivo))
    Else
        Log("Error al subir: " & archivos(indiceArchivo))
        archivosFallidos.Add(archivos(indiceArchivo)) ' Guardar archivo fallido
    End If
    indiceArchivo = indiceArchivo + 1
    SubirSiguienteArchivo() ' Continuar con el siguiente archivo
End Sub

' Mostrar errores y programar reintento
Sub MostrarErrores()
    If archivosFallidos.Size > 0 Then
        Dim mensaje As String = "No se pudieron subir los siguientes archivos:" & CRLF
        For Each archivo As String In archivosFallidos
            mensaje = mensaje & "- " & archivo & CRLF
        Next
        mensaje = mensaje & CRLF & "Se intentará nuevamente en 5 minutos. También puede reintentar ahora."
        Msgbox2(mensaje, "Error en la subida", "Reintentar ahora", "", "OK", Null)
        ReintentoTimer.Enabled = True ' Programar reintento automático
    Else
        Log("Todos los archivos se subieron correctamente")
        EliminarArchivosLocales()
    End If
End Sub

' Timer para reintentar automáticamente
Sub ReintentoTimer_Tick
    Log("Reintentando subida de archivos fallidos...")
    ReintentoTimer.Enabled = False ' Desactivar temporizador
    SubirArchivosFallidos()
End Sub

' Intentar subir solo los archivos fallidos
Sub SubirArchivosFallidos()
    If archivosFallidos.Size > 0 Then
        archivos = archivosFallidos.ToArray
        indiceArchivo = 0
        archivosFallidos.Clear ' Limpiar la lista de fallidos antes de reintentar
        SubirSiguienteArchivo()
    Else
        Log("No hay archivos pendientes por subir.")
    End If
End Sub
