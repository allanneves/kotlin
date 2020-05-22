package companionobject

fun main() {
    println(Car.getDrivingInstructions())
}

class Car {
    companion object {
        fun getDrivingInstructions(): String {
            return "Drive Safe"
        }
    }
}