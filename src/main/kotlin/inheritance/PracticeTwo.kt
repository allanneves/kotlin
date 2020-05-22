package inheritance

fun main() {
    val airbus = Airbus()
    airbus.speed = 500.0

    val boeing = Boeing()
    boeing.speed = 800.0

    airbus.ascend(20.0)
    airbus.descend(15.0)

    boeing.ascend(55.5)
    boeing.descend(22.5)
}

class Airbus : Airplane() {
    override var name = "Airbus"
}
class Boeing : Airplane() {
    override var name = "Boeing"
}

open class Airplane {
    private var altitude = 0.0
    open var name = ""
    var speed = 0.0

    fun ascend(meters : Double) {
        altitude += meters
        printSpeedAndAltitude()
    }

    fun descend(meters : Double) {
        if (altitude - meters != 0.0) {
            altitude -= meters
            printSpeedAndAltitude()
        }
    }

    private fun printSpeedAndAltitude() {
        println("$name is flying. Its maximum speed is $speed and current altitude is $altitude")
    }
}