package abstraction

fun main() {
    // The class Vessel is abstract and cannot be instantiated
    // val vessel = Vessel()

    val jug: Vessel = Jug()
    val bottle: Vessel = Bottle()

    jug.pour()
    bottle.pour()

    // This won't work as bottle is declared as a Vessel above.
    // Vessel is in a higher level and doesn't know about the fill method.
    // bottle.fill()
}

abstract class Vessel {
    fun pour() {
        println("Pouring Liquid")
    }
}

class Jug : Vessel() {

}

class Bottle : Vessel() {
    fun fill() {
        println("Filling Bottle")
    }
}