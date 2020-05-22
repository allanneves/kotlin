package collections

fun main() {

    val colors = listOf("blue", "red", "green", "blue", "amber", "blue")
    println("Size: ${colors.size}")
    println("Contains Blue? ${colors.contains("blue")}")
    println("Contains Purple? ${colors.contains("purple")}")

    val desiredColors = listOf("green", "amber")
    println("Constains desired colors: $desiredColors ? ${colors.containsAll(desiredColors)}")
    println("Index of blue: ${colors.indexOf("blue")}")
    println("Last Index of blue: ${colors.lastIndexOf("blue")}")

    val animals = listOf("Dog", "Cat", "Duck")
    println("${animals.size} animals in your list.")
    println("${animals[1]} is the second animal of your list")

    val customers : ArrayList<String> = arrayListOf("John", "Mark", "Brian", "Eddie")
    customers.add("Haftor")
    customers.remove("Brian")
    println(customers)
    customers.removeAt(0)
    println(customers)

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val unwantedItems : List<String> = listOf("pen", "paper", "mug", "phone")
    items.removeAll(unwantedItems)
    println(items)
}