package Questions
import Modelos.Usuario

class ClaseBoolean (val usuario: Usuario, val estado: Boolean) {
    fun mostrarEstado() {
        if (estado) {
            println("El usuario con ID ${usuario.id} sí está en el sistema con el nombre de ${usuario.nombres}. Muchas gracias.")
        }
    }
}
