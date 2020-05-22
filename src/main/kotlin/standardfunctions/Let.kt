package standardfunctions

fun main() {
    val animals = listOf("Cat", "Dog", "Mouse", "Zebra", "Bear")

    animals.map { it.length }
        .filter { it > 3 }
        .let { filteredList ->
            println("My list: $filteredList")
            println("Size of list is ${filteredList.size}")
        }

    animals.map { it.length }
        .filter { it > 3 }
        .let(::println)

    // The most common use case for let is to run a block of code on something that is nullable.
    // The code below will run only if the variable name is not null
    val name = if (System.currentTimeMillis() % 2 == 0L) "Adam" else null
    name?.let {
        println("Your name is $it")
    }
}