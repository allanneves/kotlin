package scope

/**
 * Private limits the scope to the class.
 * Below, only the Airplane class will access the field type and
 * the method fly.
 */

open class Airplane {
    private var type = "Airbus"
    private fun fly() {
        println("Flying...")
    }
}

class MyAirplane : Airplane() {
    fun takeOff() {
        //println(type)
        //fly()
    }
}

class FlyingMachine {
    fun start() {
        val airplane = Airplane()
        //println(airplane.type)
        //airplane.fly()
    }
}