package exceptions

fun main() {
    println("Please enter a number:")
    val userInput = readLine()

    try {
        println(userInput?.toInt())
    } catch (e: Exception) {
        e.printStackTrace() // The stack trace doesn't get printed automatically
        println("An exception has occurred: \n${e.localizedMessage}")
    }
}