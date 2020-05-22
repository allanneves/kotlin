package functions.parttwo

fun main() {
    feed("dog")
    feed(listOf("cat", "beaver", "cow", "bird"))

    messageLength("Hi, this is a very lengthy message")
    messageLength("Hi, this is a very lengthy message", 11)
    println(messageLength(10))
}

fun feed(animal: String) = println("${animal.capitalize()} needs food")
fun feed(animals: Collection<String>) = animals.map { feed(it) }

fun messageLength(message: String) = println("Number of characters: ${message.length}")
fun messageLength(message: String, size : Int) = println("From 0 to $size: '${message.substring(0, size)}'")
fun messageLength(size: Int) = (1..size).asSequence().map { it.toString() }.map { "a" }.joinToString { it }.replace(", ", "", true)