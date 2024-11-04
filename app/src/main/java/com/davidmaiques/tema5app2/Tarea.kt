package com.davidmaiques.tema5app2

import android.widget.TextView

data class Tarea(private var nombre: String,private var hora: String) {

    fun getNombre(): String{
        return nombre
    }

    fun getHora(): String{
        return hora
    }


}


class TareaDatos {
    companion object {
        val TAREAS = arrayListOf(
            Tarea("Correr 30 minutos", "08:00"),
            Tarea("Estudiar móviles", "10:00"),
            Tarea("Comer 4 rebanadas de manzana", "10:30"),
            Tarea("Asistir al taller de programación", "15:45"),
            Tarea("Quedar con Belén", "18:00")
        )
    }
}