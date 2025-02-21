import Modelos.Usuario
import Questions.ClaseBoolean

fun main() {
    val usuarioRegistrado = Usuario()

    println("Danos el ID de tu usuario que se encuentra, por favor:")
    val confi: Int = readln().toInt()

    if (confi == usuarioRegistrado.id) {
        val miObjeto = ClaseBoolean(usuarioRegistrado, true)
        miObjeto.mostrarEstado()
    } else {
        println("Usted no se encuentra en el sistema, gracias.")
    }
}
