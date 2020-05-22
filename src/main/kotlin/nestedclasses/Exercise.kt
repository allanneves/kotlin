package nestedclasses

fun main() {
    val airplane = Airplane()
    airplane.takeOff()
}

class Airplane {
    private val firstEngine = Engine(1)
    private val secondEngine = Engine(2)

    fun takeOff() {
        println("Getting ready for take off!")
        firstEngine.start()
        secondEngine.start()
        println("Tha plane took off!")
    }

    private inner class Engine(val serialNumber : Int) {
        fun start() {
            println("Engine $serialNumber is running..")
        }
    }
}