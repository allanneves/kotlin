package standardfunctions

fun main() {
    val house = House().apply {
        rooms = 2
        color = "White"
        printHouseInfo()
    }

    println("House Object Reference: $house")
}

class House {
    var rooms = 4
    var color = "Matte Black"

    fun printHouseInfo() {
        println("The House color is $color and it has $rooms room(s)")
    }
}