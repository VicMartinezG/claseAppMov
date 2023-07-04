package com.example.amazon.util

object FireStoreCollection{
    val NOTA = "nota"
    val USUARIO = "usuario"
}

object FireDatabase{
    val FECHA = "fecha"
    val USER = "user_id"
}

object SharedPrefConstants{
    val LOCAL_SHARED_PREF = "local_shared_pref"
    val USER_SESSION = "user_session"
}

object FirebaseStorageConstant{
    val ROOT_DIRECTORY = "app"
    val NOTA_IMAGE = "nota_image"
}

enum class HomeTab(val index:Int, val key:String ){
    NOTAS(0, "notas"),
    TAREAS(1, "tareas")
}