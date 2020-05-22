package basics

fun main() {
    /**
     * ?: The Elvis operator guarantees a result is returned
     * Either the actual result for a non-null variable, or a default value
     */

    val catName:String? = null
    println(catName)
    println(catName?:"This cat has no name")

    var dogName:String? = null
    dogName = "Boris"
    println(dogName?:"This dog has no name")

    /**
     * After an elvis operator, there is no need for null safety
     * because the elvis operator guarantees a value
     */
    println(catName?:"This cat has no name".length)
    println(dogName.length)

    println("Type a message to someone or leave it blank to get the greeting:")
    val userInput = readLine()
    println(userInput?:"Welcome to the system!")

    println("Type a number")
    val userNumberInput = readLine()
    val inputTimesFive = userNumberInput?.toInt()!! * 5
    println("You number $userInput times 5 is $inputTimesFive")

    val productCost = 29.99
    println("How many products do you want to buy?")
    val prd : String? = null
    val numberOfProducts = prd?.toInt()?:3
    println("Purchase total: ${productCost * numberOfProducts}")
}