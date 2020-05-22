package thiskeyword

fun main() {
    val table = Table()
    table.printCurrentDimensions()
    table.updateDimensions(100, 50)
    table.printCurrentDimensions()
}

class Table {
    private var height = 0
    private var size = 0

    fun updateDimensions(height : Int, size : Int) {
        this.height = height
        this.size = size
    }

    fun printCurrentDimensions() {
        println("Height: ${this.height}\nSize: ${this.size}\n")
    }
}