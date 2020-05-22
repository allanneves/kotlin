package exceptions

fun main() {

    println("Please enter a number:")
    val userInput = readLine()

    try {
        println("$userInput multiplied by five is ${userInput?.toInt()?.times(5)}")
    } catch (e: Exception) {
        println("You must enter a number. The value '$userInput' is not a number")
    }

    println("How many kilometers have you run today?")
    val kilometersRan = readLine()

    try {
        val milesRan = kilometersRan?.toDouble()?.times(0.62)
        println("You have run $kilometersRan km / $milesRan miles")
    } catch (e: Exception) {
        println("Could not convert the distance you ran from kilometers to miles. \nCause: ${e.localizedMessage}")
    }

    println("Which product would you like to buy?")
    val productName = readLine()
    println("How many of $productName would you like to buy?")
    val productQuantity = readLine()
    val productPrice = 9.99

    try {
        val total = productQuantity?.toInt()?.times(productPrice)
        println("The total amount of your purchase is $total")
    } catch (e: Exception) {
        println("An exception has occurred: ${e.localizedMessage}")
        e.printStackTrace()
    } finally {
        println("Transaction Completed")
    }
}