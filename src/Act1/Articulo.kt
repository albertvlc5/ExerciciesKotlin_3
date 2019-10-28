package Act1

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

fun imprimir(articulos: Array<Articulo>) {
    for(articulo in articulos){
        println("Identificador del articulo: ${articulo.codigo} " )
        println("Informacion articulo: ${articulo.descripcion}")
        println("Precio actual: ${articulo.precio}")
        println("------------------------")
    }
}

fun aumentarPrecio(articulos: Array<Articulo>) {
    for(articulo in articulos)
        articulo.precio = (0.10f * articulo.precio ) + articulo.precio
}

fun main() {
    val articulos: Array<Articulo> = arrayOf(
        Articulo(1, "Camisetas", 19.9f),
        Articulo(2, "Pantalones", 25.5f),
        Articulo(3, "Sudaderas", 35.0f),
        Articulo(4, "Chaquetas", 40.0f),
        Articulo(5, "Calcetines", 5.50f))


    println("Muestrame los articulos de la tienda:")
    imprimir(articulos)

    println("-------------------------------------")
    aumentarPrecio(articulos)

    println("Si augmentamos un 10% del precio a todos los articulos nuevos :")
    imprimir(articulos)
}