package standardfunctions

fun main() {
    Laptop().run {
        turnOff()
        turnOn()
    }
}

class Laptop {

    fun turnOn() {
        println("Turning the Laptop On...")
    }

    fun turnOff() {
        println("Turning the Laptop Off...")
    }
}