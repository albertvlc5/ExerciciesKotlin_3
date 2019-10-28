package Act3

var lista = List(100, { ((Math.random() * 21)).toInt() })
var contador1 = 0
var contador2 = 0
var contador3 = 0
var contador4= 0

fun main() {

    println("La lista sobre la cual vamos a operar es: $lista")

    if (lista.contains(20))
        println("La lista creada tiene el 20")
    else
        println("La lista no tiene el 20")

    lista.forEach {
        when(it) {
            in (1..4) -> contador1++
            in (5..8) -> contador2++
            in (10..13) -> contador3++
            in (13..19) -> contador4++
        }
    }

    println("La lista tiene en el rango (1-4): $contador1 valores")
    println("La lista tiene en el rango (5-8): $contador2 valores")
    println("La lista tiene en el rango (10-13): $contador3 valores")
    println("La lista tiene en el rango (10-13): $contador4 valores")

}



