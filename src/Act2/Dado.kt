package Act2

class Dado (var valor: Int = 1){

    fun valorDado() {
        println("Tiró, y salio el numero: $valor")
    }
    fun tirarDado() {
        valor = ((Math.random() * 6) + 1).toInt()
    }
}

fun main() {

    var dados: Array<Dado> = arrayOf(
        Dado(),
        Dado(),
        Dado(),
        Dado(),
        Dado())

    for(i in dados) {
        i.tirarDado()
    }
    for(i in dados) {
        i.valorDado()
    }
}