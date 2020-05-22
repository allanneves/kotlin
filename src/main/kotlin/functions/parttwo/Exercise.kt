package functions.parttwo

fun main() {
    feedAnimal("Bear")
    feedAnimal(listOf("Chicken", "Dog", "Cat"))

    sendMessage("Hey There!")
    sendMessage("Hey There!", 3)
    sendMessage(10)

    addTax("Coffee", 4.99)
    addTax(mapOf(Pair("Cake", 3.99), Pair("Fuzzy Drink", 1.60)))
}

fun feedAnimal(animals: Collection<String>) {
    for (animal in animals) {
        feedAnimal(animal)
    }
}
fun feedAnimal(animal : String) {
    println("$animal is now fed.")
}

fun sendMessage(message : String) = println("'$message' has a length of: ${message.length}")
fun sendMessage(message : String, size : Int) = println("'$message' cut to $size: ${message.subSequence(0, size)}")
fun sendMessage(size: Int) {
    var message = ""
    for (i in 1..size) {
        message += "a"
    }
    println("The following message has $size characters: $message")
}

fun addTax(products : Map<String, Double>) = products.forEach { addTax(it.key, it.value) }
fun addTax(product : String, price : Double) = println("The final cost of $product is ${price.times(1.2)}")
