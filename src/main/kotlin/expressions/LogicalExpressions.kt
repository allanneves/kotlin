package expressions

fun main() {
    if (326 / 72 * 15 + 93 % 13 == 65) {
        println("Math is easy")
    } else {
        println("Math is hard")
    }

    val haveCat = true
    val haveDog = false
    if (haveCat && haveDog) {
        println("Cat should run!")
    } else {
        println("It's fine!")
    }

    val age = 23
    if (age >= 18) println("Can drink alcohol") else println("Illegal to drink alcohol")
}