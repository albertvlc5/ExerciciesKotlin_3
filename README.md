# ExerciciesKotlin_3

## 3º BLOQUE.
---

### Actividad 1

Se tiene la declaración del siguiente data class:
```
data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)
```
Definir un Array con 4 elmentos de tipo Articulo.
Implementar dos funciones, una que le enviemos el Array y nos muestre todos sus componentes, y otra que también reciba el Array de artículos y proceda a aumentar en 10% a todos los productos.

### Actividad 2

Declarar una clase Dado que tenga como propiedad su valor y dos métodos que permitan tirar el dado e imprimir su valor.
En la main definir un Array con 5 objetos de tipo Dado.
Tirar los 5 dados e imprimir los valores de cada uno.

### Actividad 3

Crear una lista inmutable de 100 elementos enteros con valores aleatorios comprendidos entre 0 y 20.
contar cuantos hay comprendidos entre 1 y 4, 5 y 8 y cuantos entre 10 y 13.
Imprimir si el valor 20 está presente en la lista.

### Actividad 4

Confeccionar una clase que represente un Empleado. Definir como propiedades su nombre y su sueldo.
Definir una lista mutable con tres empleados.
Imprimir los datos de los empleados.
Calcular cuanto gasta la empresa en sueldos.
Agregar un nuevo empleado a la lista y calcular nuevamente el gasto en sueldos.
### Actividad 5

Cargar por teclado y almacenar en una lista inmutable las alturas de 5 personas (valores Float)
Obtener el promedio de las mismas. Contar cuántas personas son más altas que el promedio y cuántas más bajas

### Actividad 6

Confeccionar una agenda. Utilizar un MutableMap cuya clave sea de la clase Fecha:
```
data class Fecha(val dia: Int, val mes: Int, val año: Int)
```
Como valor en el mapa almacenar un String.
Implementar las siguientes funciones:
1) Carga de datos en la agenda.
2) Listado completo de la agenda.
3) Consulta de una fecha.
