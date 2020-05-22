package classes

fun main() {
    val myCar: Car = Car()
    val yourCar = Car()

    myCar.manufacturer = "BMW"
    yourCar.manufacturer = "Toyota"

    myCar.start()
    myCar.drive(50)

    yourCar.start()
    yourCar.drive(75)

    myCar.topSpeed = 150
    yourCar.topSpeed = 170
}

class Car {
    var manufacturer: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $manufacturer")
    }

    fun drive(speed: Int) {
        println("Driving at a speed of $speed")
    }
}