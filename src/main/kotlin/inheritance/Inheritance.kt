package inheritance

fun main() {
    val corgi = Corgi()
    corgi.bark()
    corgi.play()
    corgi.size = 10
    println("Size: ${corgi.size}")
}

class Corgi: Dog() {

}

// The open keyword makes a class inheritable
open class Dog {
    var size : Int = 0

    fun bark() {
        println("Barking")
    }

    fun play() {
        println("Playing")
    }
}