package collections

fun main() {

    val numbers = hashSetOf(3, 4, null, 83, 56)
    val newNumbers = setOf(83, 345, 56)
    numbers.retainAll(newNumbers)
    println("The intersection (elements that are common) between numbers and newNumbers is $numbers")

    numbers.clear()
    println(numbers)
    println(numbers.isEmpty())

    val primeNumbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println("Is 21 a prime number? ${primeNumbers.contains(21)}")
    println("Is 13 a prime number? ${primeNumbers.contains(13)}")

    val myDrinks = hashSetOf("water", "coke", "beer", "orange juice")
    val theirDrinks = hashSetOf("water", "orange juice", "pineapple juice", "milk")
    myDrinks.retainAll(theirDrinks)
    println("These are the drinks that we both can enjoy: $myDrinks")
}