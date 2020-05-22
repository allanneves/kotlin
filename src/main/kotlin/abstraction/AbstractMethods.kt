package abstraction

fun main() {
    val drinkingGlass : Glass = DrinkingGlass()
    drinkingGlass.drink()
}

// The Drinking Glass class must implement the method drink
class DrinkingGlass : Glass() {
    override fun drink() {
        println("Drinking from Drinking Glass")
    }
}

// The Wine Glass class must implement the method drink
class WineGlass : Glass() {
    override fun drink() {
        println("Drinking from Wine Glass")
    }
}

abstract class Glass {
    // An abstract method makes it mandatory for child classes to implement it
    abstract fun drink()
}
