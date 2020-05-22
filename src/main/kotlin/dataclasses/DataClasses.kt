package dataclasses

/*
* - Commonly created just for storing data (like POJOs in Java)
* - Primary constructor must have at least one parameter
* - All primary constructor parameters need to be val or var
* - Data classes can have a body but they are usually not required
*
* Automatically generate class methods
*    - equals() or == : Compares data not object references
*    - toString() : Prints out data info instead of the instance reference
*    - copy(): Creates a copy with only some desired data changed
* */

data class User(
    val name: String,
    val email: String,
    val password: String
)

fun main() {
    val user1 = User("John", "john@gmail.com", "hash123")
    val user2 = User("John", "john@gmail.com", "hash123")
    println("User1: $user1")
    println("User2: $user2")
    println("This reference is true in opposite to regular classes: ${user1 == user2}")
    println("Data Classes '==' compare the data and not the object reference")
    println()

    val user3 = user1.copy(email = "johnone@gmail.com")
    println("Original User: $user1")
    println("Copied User: $user3")
}