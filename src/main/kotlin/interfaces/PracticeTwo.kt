package interfaces

import kotlin.random.Random

fun main() {
    val carFactory = CarFactory()
    var car: Car
    for (i in 1..12) {
        car = carFactory.provideCar()
        println("$i ==================")
        car.drive()
        car.park()
    }
}

interface Car {
    val topSpeed : Int
    fun drive()
    fun park()
}

class MercedesAClass : Car {
    override val topSpeed: Int = 150

    override fun drive() {
        println("Driving a Mercedes A Class which top speed is $topSpeed")
    }

    override fun park() {
        println("Parking a Mercedes A Class")
    }
}

class BmwX3 : Car {
    override val topSpeed: Int = 200

    override fun drive() {
        println("Driving a BMW X3 which top speed is $topSpeed")
    }

    override fun park() {
        println("Parking a BMW X3")
    }
}

class CarFactory {
    fun provideCar() : Car {
        return runLogicToFindBestCar()
    }

    private fun runLogicToFindBestCar() : Car {
        val fleetNumber = Random.nextInt().rem(2)
        return if (fleetNumber == 0) MercedesAClass() else BmwX3()
    }
}