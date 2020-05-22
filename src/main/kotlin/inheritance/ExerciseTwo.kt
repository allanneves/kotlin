package inheritance

fun main() {
    val parakeet = Parakeet()
    parakeet.fly()
}

open class Bird() {
    open val color = "Grey"
    open val speed = 50

    open fun fly() {
        println("A $color bird can fly at up to $speed kph")
    }
}

class Parakeet : Bird() {
    override val color = "Green"
    override val speed = 65

    override fun fly() {
        super.fly()
        println("A ${super.color} bird can fly at up to ${super.speed} kph")
    }
}