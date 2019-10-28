package Act4

class Empleado(var nombre: String, var sueldo: Double) {

    fun detalles() {
        println("$nombre tiene un sueldo de $sueldo")
    }
}

fun calcSueldos(empleados: MutableList<Empleado>) {
    val sueldos = empleados.sumByDouble {
        it.sueldo
    }
    println("Los gastos en sueldos de la empresa son :$sueldos")
}

fun main(args: Array<String>) {
    val empleados: MutableList<Empleado> = mutableListOf(
        Empleado("Pepe", 1000.0),
        Empleado("Juan", 3500.0),
        Empleado("Albert", 1500.0),
        Empleado("Luis",2000.0))

    empleados.forEach {
        it.detalles()
    }

    calcSueldos(empleados)

    empleados.add(Empleado("Pedro", 5000.0))

    println("-------------------------------")
    calcSueldos(empleados)
}



