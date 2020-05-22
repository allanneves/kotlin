package constructors

fun main() {
    val bmw = Car("BMW", 230)

    val boeing737 = Airplane()
    println("Boeing 737 - model ${boeing737.model} and top speed ${boeing737.topSpeed}")

    val boeing767 = Airplane("767")
    println("Boeing 767 - model ${boeing767.model} and top speed ${boeing767.topSpeed}")

    val boeing777 = Airplane("777", 1000)
    println("Boeing 777 - model ${boeing777.model} and top speed ${boeing777.topSpeed}")
}

class Car(var model : String, var topSpeed: Int) {
    // other parameters, methods and class body
}

class Airplane {
    var model: String? = null
    var topSpeed = 100

    constructor() {
        model = "Not Specified"
        topSpeed = 150
    }

    constructor(modelName : String) {
        model = modelName
        topSpeed = 170
    }

    constructor(modelName: String, maximumSpeed: Int) {
        model = modelName
        topSpeed = maximumSpeed
    }
}