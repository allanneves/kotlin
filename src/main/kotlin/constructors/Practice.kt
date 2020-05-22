package constructors

fun main() {
    val dinnerTable = Table()
    val coffeeTable = Table(4)
    val gardenTable = Table(6, 200)

    println("Dinner Table has ${dinnerTable.legs} legs and a height of ${dinnerTable.height} centimeters")
    println("Coffee Table has ${coffeeTable.legs} legs and a height of ${coffeeTable.height} centimeters")
    println("Garden Table has ${gardenTable.legs} legs and a height of ${gardenTable.height} centimeters")
}

class Table {
    var legs: Int? = null
    var height: Int? = null

    constructor() {
        legs = 4
        height = 100
    }

    constructor(numberOfLegs : Int) {
        legs = numberOfLegs
        height = 50
    }

    constructor(numberOfLegs: Int, heightValue: Int) {
        legs = numberOfLegs
        height = heightValue
    }
}