package collections

fun main() {

    val numbers = setOf(2, 55, 12, 10, 0, 99, 733, null)
    println("Numbers Size shoult be eight: ${numbers.size}")

    println("Contains fifty-five? ${numbers.contains(55)}")
    println("Contains null? ${numbers.contains(null)}")
    println("Contains ten? ${numbers.contains(10)}")
    println("Contains seven? ${numbers.contains(7)}")

    val numbersQuery = setOf(55, 12, 10, 0)
    println("Does the main set contain all elements of the query? ${numbers.containsAll(numbersQuery)}")

    println("Is the set of numbers empty? ${numbers.isEmpty()}")
    println(setOf<Int>().isEmpty())
}