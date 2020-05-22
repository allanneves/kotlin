package functions.parttwo

fun main() {
    listAnimals()
    // listOneAnimal() This function is inside the outer function and not accessible here
}

fun listAnimals() {
    fun listOneAnimal(animal : String) {
        println("I have a $animal")
    }

    val myAnimals = listOf("dog", "cat", "cow", "horse")
    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}