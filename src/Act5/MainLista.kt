package Act5
//Creacion con metodo
fun dimealtura(): Float {
    print("Dime una altura:")
    val altura = readLine()!!.toFloat()
    return altura
}
fun main(args: Array<String>) {
  //Creacion lista sin metodo
    /*var lista:MutableList<Double> = mutableListOf()

    for (i in 0..4) {
        print("Introduzca su altura $i :")
        var nuevoValor: Double = readLine()!!.toDouble()
        lista.add(nuevoValor)

    }*/

    val listaalturas: List<Float> = List(5) {
        dimealtura()
    }
    val promedio = listaalturas.average()

    println("La altura media de las personas introducidas es $promedio")

    val mediaalto = listaalturas.count {
        it > promedio
    }
    val mediabajo = listaalturas.count {
        it < promedio
    }

    println("Hay  $mediaalto personas más altas que el  promedio ")
    println("Hay $mediabajo personas mas bajas que el promedio ")
}