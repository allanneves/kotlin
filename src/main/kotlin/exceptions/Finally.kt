package exceptions

fun main() {

    // The finally block is executed whether or not an exception occurred

    val userInput = readLine()

    try {
        println(userInput?.toInt())
    } catch (e : Exception) {
        e.printStackTrace()
        println("An exception happened: ${e.localizedMessage}")
    } finally {
        println("All processes have run")
    }
}