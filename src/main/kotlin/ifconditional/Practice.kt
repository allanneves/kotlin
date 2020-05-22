package ifconditional

fun main() {

    println("Please type an integer number:")
    val userInput = readLine() ?: "0"
    val digitsCount = userInput.toInt()
    // The division of one-digit numbers (0-9) by 10 always results in zero (0.1 - 0.9), with that we know that there is only one digit
    val outcome =
        if (digitsCount / 10 == 0) "The number you typed has one digit" else "The number you typed has more than one digit"
    println(outcome)

    val responseCode = 304
    val message = if (responseCode / 100 == 1) {
        "Information Response"
    } else if (responseCode / 100 == 2) {
        "Success"
    } else if (responseCode / 100 == 3) {
        "Redirect"
    } else if (responseCode / 100 == 4) {
        "Client Error"
    } else if (responseCode / 100 == 5) {
        "Server Error"
    } else {
        "Unexpected Error"
    }

    println(message)

    println("What was the student's score?")
    val userInputScore = readLine() ?: ""
    val userScore = userInputScore.toInt()

    if (userScore < 0 || userScore > 100) {
        println("$userScore is not a valid score")
    } else {
        val grade = if (userScore >= 90) {
            "A"
        } else if (userScore >= 80) {
            "B"
        } else if (userScore >= 70) {
            "C"
        } else if (userScore >= 60) {
            "D"
        } else if (userScore >= 50) {
            "E"
        } else {
            "everything else"
        }

        println("Based on the user score, their grade is $grade")
    }


}