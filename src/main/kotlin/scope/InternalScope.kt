package scope

/**
 * Internal allows access to everything that is in the same package.
 * In the example below, the class Motorcycle that inherits from Vehicle and the
 * class CustomVehicle that instantiates a Vehicle access the properties type and drive.
 */

open class Vehicle {
    internal var type = "Drivable Vehicle"
    internal fun drive() {
        println("Driving...")
    }
}

class Motorcycle : Vehicle() {
    fun start() {
        println(type)
        drive()
    }
}

class CustomVehicle {
    fun drive() {
        val quadriCycle = Vehicle()
        println(quadriCycle.type)
        quadriCycle.drive()
    }
}