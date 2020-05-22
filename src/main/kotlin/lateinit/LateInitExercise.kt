package lateinit

fun main() {
    lateinit var message: String
    val primeNumbers = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23)
    message = "The randomly chosen prime number is ${selectRandomNumber(primeNumbers)}"
    println(message)
}

fun selectRandomNumber(numbers: List<Int>) = numbers.random()