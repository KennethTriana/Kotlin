package Questions

class Rolsito (val estado: Int){
    fun mostrar() {
        if (estado == 1) {
            println("Usted es Gerente")
        }
        else if (estado == 2) {
            println("Usted es empleado")
        }
        else {
            println("Usted no exite en los roles")
        }
    }
}