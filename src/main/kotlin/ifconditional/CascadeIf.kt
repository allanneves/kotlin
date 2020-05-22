package ifconditional

fun main() {

    println("Please enter an animal:")
    val animal = readLine()?:""
    val action = if (animal == "dog") {
        "pet it"
    } else if (animal == "cat") {
        "feed it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it"
    }

    println("If you come across a $animal you should $action")
}