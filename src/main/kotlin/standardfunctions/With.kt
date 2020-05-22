package standardfunctions

fun main() {
    with(Car()) {
        this.speed = 80
        this.drive()
    }

    with(Car()) {
        speed = 50
        drive()
        println("Parking the Car")
    }
}

class Car {
    var speed: Int? = null

    fun drive() {
        println("Driving the Car at $speed kph")
    }
}