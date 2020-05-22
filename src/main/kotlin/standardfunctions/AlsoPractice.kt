package standardfunctions

fun main() {
    val bookRegistry = BookRegistry()

    Book().apply {
        println("Enter the book name:")
        name = readLine()?:""
        printHardCopy()
    }.also {
        bookRegistry.printedBooks.add(it)
        println("Book Successfully Printed")
        sendEmail("user@books.com")
    }
}

class Book {
    var name = ""

    fun printHardCopy() {
        println("Printing Book")
    }
}

class BookRegistry {
    val printedBooks = arrayListOf<Book>()
}

fun sendEmail(address : String) {
    println("Sending e-mail to $address...")
}