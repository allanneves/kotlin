package initblock

fun main() {
    val bmwX3 = Car()
}

class Car {
    val model: String? = "BMW X3"
    val topSpeed = 100

    init {
        println("#######################")
        println("RUNNING INIT BLOCK")
        println("#######################")
        println("The init block provides functionality in addition to the primary constructor.")
        println("This block runs before anything else in the class")
        println("Model $model has a top speed of $topSpeed")
    }

    constructor() {
        println("#######################")
        println("RUNNING CONSTRUCTOR BLOCK")
        println("#######################")
    }
}