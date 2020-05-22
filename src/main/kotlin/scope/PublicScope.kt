package scope

/**
 * Public is the default scope and makes everything accessible
 * by all classes and functions
 */

open class Plate {
    public var type = "Round Plate"
    public fun pickUp() {
        println("Picking Up...")
    }
}

class MetalPlate : Plate() {
    public fun doTask() {
        println(type)
        pickUp()
    }
}

class CustomPlate {
    public fun doTask() {
        val plasticPlate = Plate()
        println(plasticPlate.type)
        plasticPlate.pickUp()
    }
}