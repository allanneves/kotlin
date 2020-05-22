package gettersandsetters

fun main() {
    val polo = Car()
    polo.name = "Volkswagen Polo"
    println("Car's current name: ${polo.name}")
    println("Car's current speed: ${polo.speed}")

    polo.speed = 100
    println("Car's new name: ${polo.name}")
    println("Car's speed (still enforced by getter): ${polo.speed}")
}
class Car {
    var name = "Generic Vehicle"
    var speed: Int
        get() = 50
        set(value) {
            name = "High Speed Car $value"
            println("Dangerous! Setting also the name to: $name")
        }
}

