package classes

fun main() {
    val garage = Garage()
    val car = garage.car
    car.drive()
}

class Garage {
    val car = Vehicle()
}

class Vehicle {
    fun drive() {
        println("Driving the Vehicle")
    }
}
