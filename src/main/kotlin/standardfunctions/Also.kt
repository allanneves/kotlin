package standardfunctions

fun main() {
    Airplane().apply {
        speed = 100
        fly()
    }.also {airplane ->
        println("Debug: Plane Took Off!")
        println("Debug: Plane Info - ${airplane.speed}")
    }
}

class Airplane {
    var speed = 0
    val manufacturer = "Airbus"
    val model = "A380"

    fun fly() {
        println("$manufacturer $model is flying at a speed of $speed mph")
    }
}