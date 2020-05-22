package lambdafunctions

fun main() {
    val numbers = setOf(1, 100, 99, 64, 9, 32, 1500, 81, 151, 284, 196)
    println(findDoubleDigitIntegers(numbers))

    val names = setOf("Allan", "Paul", "Anna", "Josh", "Robert", "Bob")
    println(sortByLastLetter(names))

    println(findBiggestMiddleDigit(numbers))
}

fun findDoubleDigitIntegers(numbers : Collection<Int>) = numbers.filter { it in 10..99 }
fun sortByLastLetter(names : Collection<String>) = names.sortedBy { it[it.length-1] }
fun findBiggestMiddleDigit(numbers : Collection<Int>) = numbers.filter { it in 100..999 }.maxBy { it.div(10).rem(10) }