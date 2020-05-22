package functions.partone

fun main() {

    println("Please type the name of an animal:")
    val animal = readLine() ?: ""
    println("The lifespan of a $animal is ${getAnimalLifespan(animal)} years")
}

fun getAnimalLifespan(animal: String): Int {
    return when (animal) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}