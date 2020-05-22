package abstraction

fun main() {
    val bosch : Oven = Bosch()
    val roaster: Oven = Roaster()

    bosch.cook()
    bosch.roast()

    roaster.cook()
    roaster.roast()
}

abstract class Oven(protected val topCookingTemperature: Int = 100) {
    protected val averageCookingSpeed = 5
    abstract fun cook()
    abstract fun roast()
}

class Bosch : Oven(200) {
    override fun cook() {
        println("Bosch is cooking at $topCookingTemperature Degrees Celsius and Speed of $averageCookingSpeed")
    }

    override fun roast() {
        println("Bosch is roasting at $topCookingTemperature Degrees Celsius and Speed of $averageCookingSpeed")
    }
}

class Roaster : Oven() {
    override fun cook() {
        println("This Roaster Cannot Cook")
    }

    override fun roast() {
        println("Roaster is roasting at $topCookingTemperature Degrees Celsius and Speed of $averageCookingSpeed")
    }

}