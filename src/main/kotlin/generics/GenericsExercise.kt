package generics

fun main() {
    val controller = VehicleController<Car>()
    controller.performAction(Car())
}

class VehicleController<T> {

    fun performAction(value : T) {
        when (value) {
            is Car -> value.drive()
            is Train -> value.ride()
        }
    }
}

class Car {
    fun drive() {
        println("Driving..")
    }
}

class Train {
    fun ride() {
        println("Riding..")
    }
}