package breakandcontinue

fun main() {

    val evenNumbers = listOf(2, 8, 4, 7, 6, 9, 10)
    for (number in evenNumbers) {
        if (number % 2 != 0) {
            println("$number is an odd number, skipping to the next one.")
            continue
        }
        println("Half of $number is ${number / 2}")
    }
}