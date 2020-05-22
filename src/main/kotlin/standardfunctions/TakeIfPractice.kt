package standardfunctions

fun main() {
    val numbers = listOf(10, 5, 7, 22, 812, 1, 88, 127, 100)
    val evenNumbers = arrayListOf<Int>()
    fun isEven(number: Int) = number % 2 == 0

    numbers.forEach { number ->
        number.takeIf { isEven(number) }?.let { evenNumbers.add(number) }
    }

    println(evenNumbers)
}