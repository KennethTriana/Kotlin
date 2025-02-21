package Questions

class MyBoolean (val estado: Boolean){
    fun mostrar() {
        if (estado) {
            println("Venta realizada con exito.")
        } else {
            println("Se ha cancelado la venta.")
        }
    }
}