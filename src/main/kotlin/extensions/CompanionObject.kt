package extensions

fun main() {
    Book.printMe()
}

class Book {
    companion object{}
}

fun Book.Companion.printMe() {
    println("Car companion object")
}