package standardfunctions

import kotlin.random.Random

fun main() {
    for (i in 1..10) {
        val number = Random.nextInt(100)
        val evenOrNull = number.takeIf { it % 2 == 0 }
        println("The number is $number and the result should be null if it is an odd number: $evenOrNull")
        println()
    }
}