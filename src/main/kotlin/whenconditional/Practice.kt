package whenconditional

fun main() {

    println("How many meals do you have per day?")
    val mealsPerDay: Int = readLine()?.toInt() ?: 0
    val message = when (mealsPerDay) {
        3 -> "Congratulations! You have the recommended amount of meals per day"
        in 0..2 -> "You should increase the number of meals you have per day"
        else -> "You should decrease the number of meals you have per day"
    }
    println(message)

    println("What is the hour of the day (24-hour clock)?")
    when(readLine()?.toInt()?:0) {
        in 6..11 -> println("Morning")
        in 12..14 -> println("Noon")
        in 15..17 -> println("Afternoon")
        in 18..21 -> println("Evening")
        else -> println("Night")
    }

    println("Type your name:")
    val userName = readLine()?:""
    when(val firstLetter = userName.substring(0,1)) {
        in "A".."C" -> println("Your entry $firstLetter: Hello From A to C")
        in "D".."F" -> println("Your entry $firstLetter: Hello From D to F")
        else -> println("Your entry $firstLetter: Hello from everything else")
    }

    when(userName[0]) {
        'A', 'B', 'C' -> println("Hello $userName")
        'D', 'E', 'F' -> println("Hello $userName, how are you doing?")
        else -> println("Hi")
    }
}