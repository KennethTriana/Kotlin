package Questions

import Modelos.Usuario

class IniciosSesion(val estadod: String, val usuario: Usuario) {
    fun mostrarIngreso() {
        if (estadod == usuario.nombres) {
            println("Ya ingresó.")
        } else {
            println("Usted no se encuentra en el sistema, gracias.")
        }
    }
}