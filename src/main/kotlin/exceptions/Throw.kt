package exceptions

fun main() {

    val userInput = readLine()

    try {
        println(userInput?.toInt())
    } catch (e: Exception) {
        throw IllegalStateException("You should enter a number.")
    }
}