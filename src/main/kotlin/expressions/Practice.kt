package expressions

fun main() {

    val guests = setOf("John", "Paul", "James")
    println("Type your name to have it checked in the guest list:")
    println(if (readLine()?:"" in guests) "Please come in!" else "Sorry, you're not in the guestlist")

    println("How many cats do you have?")
    val numberOfCats: Int = readLine()?.toInt()?:0
    val message = if (numberOfCats in 1..3)
        "You have few cats"
    else if (numberOfCats in 4..6)
        "You have several cats"
    else if (numberOfCats > 7)
        "You have many cats"
    else
        "invalid input"
    println(message)

    val animalsForAdoption = arrayListOf("Dog", "Cat", "Bird")
    while (animalsForAdoption.isNotEmpty()) {
        println("Which animal would you like to adopt? $animalsForAdoption")
        val userInput = readLine() ?: ""
        val removed = animalsForAdoption.remove(userInput)
        if (removed) println("Thank you! You've adopted a $userInput") else println("We don't have $userInput for adoption")
    }

    println("Enter your age:")
    val userAge: Int = readLine()?.toInt()?:0
    val ageMessage = if (userAge == 0) {
        "Zero is not a valid age, converting it to one. You are a child!"
    } else if (userAge in 1..13) {
        "You are a child"
    } else if (userAge in 14..18) {
        "You are a teenager"
    } else if (userAge in 18..120) {
        "You are an adult"
    } else {
        "Invalid Input"
    }
    println(ageMessage)
}