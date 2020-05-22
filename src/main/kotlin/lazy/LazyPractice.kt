package lazy

import java.time.LocalDateTime

fun main() {
    println("Variable Creation: ${LocalDateTime.now()}")
    val randomNumbers: List<Int> by lazy { generateRandomNumbers() }

    println("Would you like to generate list of one thousand numbers? (y/n)")
    val userInput = readLine()?:""

    if (userInput == "y") println(randomNumbers)
}

fun generateRandomNumbers() : List<Int> {
    println("Actual Method Call (Lazy Initialization of the Variable): ${LocalDateTime.now()}")
    return (1..1000).toList().shuffled()
}