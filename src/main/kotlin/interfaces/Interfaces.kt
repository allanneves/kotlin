package interfaces

// Interfaces are contracts that define classes fields
// and methods that will later define the behaviour of the class

fun main() {
    // You cannot create an object out of an interface because it is not a class
    // However, you can call its contract definition
    val oven : Oven? = null
    oven?.turnOn()
    oven?.turnOff()

    val siemens: Oven = Siemens()
    siemens.turnOn()
    siemens.cook(150)
    siemens.turnOff()

    val anyOven = getOven()
    anyOven.turnOn()
    anyOven.turnOff()
}

// Even though it is possible, we usually don't leave variables and implementation in an interface
// Interfaces are more commonly used to define methods with no implementation that will describe
// how a class that implements that interface behaves.
interface Oven {
    val temperature : Int

    fun turnOn()
    fun turnOff()
    fun cook(temperature : Int) {
        println("Cooking at $temperature degrees")
    }

    // An interface has no constructor as it is not a class and it just provides functionality to other objects
    // constructor()
}

class Siemens : Oven {
    override val temperature: Int = 180

    override fun turnOn() {
        println("Turning On")
    }

    override fun turnOff() {
        println("Turning Off")
    }
}

fun getOven() : Oven {
    return Siemens()
}