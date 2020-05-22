package whileloop

fun main() {

    var userInput = 0
    while (userInput < 100) {
        println("Enter any number that is greater than 100:")
        userInput = readLine()?.toInt() ?: 0
    }
    println("Great, $userInput is greater than 100")

    var finished = false
    do {
        println("Please enter a number greater than 100")
        val input = readLine() ?: ""
        val number = input.toInt()
        if (number > 100) {
            println("Thanks")
            finished = true
        } else {
            println("$number is not greater than 100. Please try again")
        }
    } while (!finished)

    finished = false
    do {
        println("Please enter a number")
        val input = readLine() ?: ""
        val number = input.toInt()

        var factorial = 1
        var i = 1
        while (i <= number) {
            factorial *= i
            i++
        }

        if (factorial < 3_000_000) {
            println("$number! = $factorial is smaller than 3.000.000. Please try again.")
        } else {
            println("$number! = $factorial")
            finished = true
        }
    } while (!finished)

    val users = hashSetOf(Pair(1, "john"), Pair(2, "bob"), Pair(3, "alice"))
    finished = false
    do {
        println("These are the current users:")
        users.forEach { println("${it.first} - ${it.second}") }
        println("Please enter your username:")
        val username = readLine()?:""

        val userExist = users.map { it.second }.contains(username)
        if (userExist) {
            println("This username is taken, please choose a different one.")
        } else {
            println("Great! You are now a user.")
            val lastId = users.maxBy { it.first }?.first
            users.add(Pair(lastId?.plus(1)?:0, username))
            finished = true
            println("These are the current users:")
            users.forEach { println("${it.first} - ${it.second}") }
        }
    } while (!finished)

}