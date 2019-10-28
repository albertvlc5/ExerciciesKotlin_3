package Act6

data class Fecha(val dia: Int, val mes: Int, val año: Int)

fun añadirTareaAgenda(agenda: MutableMap<Fecha, String>) {
        println("Introduzca las tareas y la fecha :")
        print("Introduzca el día:")
        val dia = readLine()!!.toInt()
        print("Introduzca el mes:")
        val mes = readLine()!!.toInt()
        print("Introduzca el año:")
        val año = readLine()!!.toInt()

        print("Introduzca la tarea a realiar:")
        val tarea = readLine()!!.toString()
        agenda[Fecha(dia, mes, año)] = tarea

}

fun verAgenda(agenda: MutableMap<Fecha, String>) {
    for((fecha, tarea) in agenda) {

        println("El dia:  ${fecha.dia}/${fecha.mes}/${fecha.año}")
        println("Programadas las siguientes tareas: $tarea")

    }
}

fun consultarFechaAgenda(agenda: MutableMap<Fecha, String>) {
    println("Introduzca el dia concreto que quiere consultar : ")
    print("Introduzca el día:")
    val dia = readLine()!!.toInt()
    print("Introduzca el mes:")
    val mes = readLine()!!.toInt()
    print("Introduzca el año:")
    val año = readLine()!!.toInt()

    val fecha = Fecha(dia, mes, año)

    if (fecha in agenda)
        println("Tareas programadas: ${agenda[fecha]}")
    else
        println("Tiene el dia libre, 0 tareas programadas")
}

fun main() {
    val agenda: MutableMap<Fecha, String> = mutableMapOf()

    añadirTareaAgenda(agenda)
    println("--------------------------")
    verAgenda(agenda)
    println("--------------------------")
    añadirTareaAgenda(agenda)
    println("--------------------------")
    consultarFechaAgenda(agenda)
}