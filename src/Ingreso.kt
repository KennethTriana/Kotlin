import Questions.IniciosSesion
import Modelos.Usuario

fun main() {
    println("Digite el nombre de tu usuario: ")
    val confirmarIngreso: String = readln()

    val usuarioExistente = Usuario()

    val confirmar = IniciosSesion(confirmarIngreso, usuarioExistente)
    confirmar.mostrarIngreso()
}