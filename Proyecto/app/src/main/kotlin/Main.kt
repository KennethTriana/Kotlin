import Models.Usuarios
import Models.Productos
import Models.Categoria
import Models.Factura
import Questions.MyBoolean

fun main() {
    val DatosUsuarios = Models.Usuarios()
    println(DatosUsuarios.nombres)
    println(DatosUsuarios.apellidos)
    println(DatosUsuarios.correo)
    println(DatosUsuarios.contrasena)
    println(DatosUsuarios.telefono)
    println(DatosUsuarios.direccion)

    val categoria = Models.Categoria()
    println(categoria.nombre)
    println(categoria.descripcion)

    val productos = Models.Productos()
    println(productos.nombre)
    println(productos.fecha_entrada)
    println(productos.fecha_vence)
    println(productos.estado)
    println(productos.cantidad)
    println(productos.precio_entrada)
    println(productos.precio_salida)

    val factura = Models.Factura()
    println(factura.fecha)
    println(factura.monto_total)
    println(factura.precio_unitario)

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