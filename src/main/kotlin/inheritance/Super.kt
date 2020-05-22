package inheritance

fun main() {
    val corsa = OpelCorsa()
    val hilux = ToyotaHilux()

    corsa.startEngine()
    hilux.startEngine()
}

class OpelCorsa : Car() {
    override fun startEngine() {
        super.startEngine()
        println("Top Speed: ${super.topSpeed}")
    }
}

class ToyotaHilux : Car() {
    override val topSpeed = 150
    override fun startEngine() {
        println("Starting the Engine of the Toyota Hilux...")
        println("Top Speed: $topSpeed")
    }
}

open class Car {
    open val topSpeed = 100
    open fun startEngine() {
        println("Starting the Engine of the Car...")
    }

}
