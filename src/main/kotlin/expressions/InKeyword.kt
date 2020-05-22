package expressions

fun main() {

    val animals = listOf("cat", "dog", "bird")
    if ("cat" in animals) println("You have a cat!") else println("Cat is missing")

    if (3 in setOf(10,9,8,3)) println("3 is there") else println("3 is not there")

    if (15 in 1..10) {
        println("5 is in the range")
    } else {
        println("15 is not in the range")
    }

    val favouritePet = "dog"
    val availablePets = listOf("dog", "cat", "horse")
    if (favouritePet in availablePets) println("We have your next best friend") else println("Sorry, $favouritePet is not available")

    if ("alligator" !in availablePets)
        println("Alligator is not a pet")

    println("Please enter an integer number:")
    val userInput: Int = readLine()?.toInt()?:0
    if (userInput !in 0..9)
        println("Your number is not a single digit")

}