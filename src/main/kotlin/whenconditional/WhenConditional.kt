package whenconditional

fun main() {

    println("Type the name of the animal that you would like to have: [cat, dog, bird]")
    when (readLine()?:"") {
        "cat" -> {
            println("Yes, you can have a cat")
        }
        "dog" -> {
            println("Yes, you can have a dog")
        }
        "bird" -> {
            println("Yes, you can have a bird")
        }
        else -> {
            println("Sorry, you cannot have this animal")
        }
    }

    println("Type a number to find whether it is odd or even:")
    var result = ""
    when((readLine()?.toInt()?:0) % 2) {
        0 -> result = "number is even"
        1 -> result = "number is odd"
    }
    println(result)

    val action = when("dog") {
        "cat" -> "feed it"
        "dog" -> "pet it"
        else -> "google it"
    }
    println(action)

    val month = "January"
    val days = when(month) {
        "January" -> 31
        "February" -> 28
        "March" -> 31
        else -> 30
    }
    println("January has $days days")

    val groupedDays = when(month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("January, March and May have $groupedDays days each")

    val name = "Anastasia"
    when (val length = name.length) {
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characters is medium")
        else -> println("A name with $length is long")
    }
}