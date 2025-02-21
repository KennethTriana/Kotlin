package Models

import java.util.Calendar
import java.util.Date

class Productos {
    var nombre = "Pomar"
    var fecha_entrada: Date
    var fecha_vence: Date

    var estado = "Bueno"
    var cantidad = 15
    var precio_entrada = 2.400
    var precio_salida = 3.200

    init {
        val calendarEntrada = Calendar.getInstance()
        calendarEntrada.set(2025, 1, 19)
        fecha_entrada = calendarEntrada.time

        val calendarVence = Calendar.getInstance()
        calendarVence.set(2025, 1, 25)
        fecha_vence = calendarVence.time
    }
}