import Questions.Rolsito

fun main() {
    println("¿Que rol eres?")

    println("Digita el 1 si eres gerente y 2 para empleado: ")
    val confir: Int = readln().toInt()
    val objeto = Rolsito(confir)
    objeto.mostrar()

}