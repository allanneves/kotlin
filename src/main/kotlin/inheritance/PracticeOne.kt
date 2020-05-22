package inheritance

fun main() {
    val genericLaptop = Laptop()
    genericLaptop.run()

    val macBookPro = MacBook()
    macBookPro.screenSizeInInches = 15
    macBookPro.name = "MacBook Pro"
    macBookPro.run()
}

open class Laptop {
    var screenSizeInInches = 17
    var name = "Generic Laptop"
    private val speed = 1200

    fun run() {
        println("Starting up...")
        println("Screen Size : $screenSizeInInches")
        println("Speed: $speed")
        println("Name: $name")
        println()
    }
}

class MacBook : Laptop(){
}