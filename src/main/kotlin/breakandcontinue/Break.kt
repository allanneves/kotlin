package breakandcontinue

fun main() {

    val evenNumbers = listOf(2, 8, 4, 7, 6, 10)
    for (number in evenNumbers) {
        if (number % 2 != 0) {
            println("Only even numbers should be in the list. Terminating now.")
            break
        }
        println("Half of $number is ${number / 2}")
    }
}