package nestedclasses

fun main() {
    val car = Car()
    car.drive()
}

class Car {
    private val engine = Engine() // accessing the inner class
    private val carModel = "Ford Fiesta"
    var speed = 0

    fun drive() {
        println("Starting the Car at $speed kph")
        engine.run()
    }

    private inner class Engine {
        private val rpm = 3000
        fun run() {
            this@Car.speed = 150 // accessing the outer class
            println("Driving a ${this@Car.carModel}")
            println("Current Speed: ${this@Car.speed}")
            println("Engine is running at $rpm rpm..")
        }
    }
}