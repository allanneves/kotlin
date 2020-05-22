package lazy

import java.time.LocalDateTime

fun main() {
    val bannedUsers = listOf("Michael", "John", "Anna", "James", "Mary", "")
    val user : User by lazy { User() }
    println("User variable creation without instance: ${LocalDateTime.now()}")
    println("Please enter your username:")

    val userInput = readLine()?:""
    if (!bannedUsers.contains(userInput)) {
        user.username = userInput
        user.welcome()
    }
}

class User {

    init {
        println("Class Initialization: ${LocalDateTime.now()}")
    }

    lateinit var username: String

    fun welcome() {
        println("Welcome $username!")
    }
}