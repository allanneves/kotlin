package functions.partone

fun main() {
    val doubleOfFive = double(5)
    println("The double of five is $doubleOfFive")

    val radius = 63
    println("A circle with a radius of $radius has an area of ${calculateCircleArea(
        radius
    )}")
    println("A circle with a radius of $radius has an area of ${calculateCircleAreaShorthand(
        radius
    )}")

    val names = listOf("Anthony", "William", "Jessica")
    names.forEach { println(personalizedGreeting(it)) }
}

fun double(number: Int = 0): Int {
    return number * 2
}

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun calculateCircleAreaShorthand(radius: Int) = 3.1415 * radius * radius

fun personalizedGreeting(name: String = "Unknown"): String {
    val greeting = when (name[0]) {
        'A' -> "How are you $name?"
        'W' -> "What's up $name?"
        else -> "Hi $name!"
    }

    return greeting
}