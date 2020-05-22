package standardfunctions

fun main() {
    val oddNumbers = arrayListOf<Int?>()
    println("Please enter 10 numbers:")

    for (i in 1..10) {
        println("$i: Please enter the number:")
        val userInput = readLine()?.toInt() ?: 0

        userInput.takeIf { isOdd(it) }
            .takeUnless { it == 3 || it == 13 }
            ?.let { oddNumbers.add(it) }
    }

    println("This list should only contain odd numbers and never the numbers 3 or 13:")
    println(oddNumbers)
}

fun isOdd(number: Int) = number % 2 != 0