import Questions.MyBoolean

fun main() {
    val Venta = "Si"
println("¿Desea realizar la venta?")

println("Confirma con Si o No:")
val confir: String = readln()

if (confir == Venta) {
    val objeto = MyBoolean(estado = true)
    objeto.mostrar()
} else {
    val otrobjeto = MyBoolean(estado = false)
    otrobjeto.mostrar()
}
}