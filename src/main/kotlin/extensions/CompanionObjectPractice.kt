package extensions

fun main() {
    String.printClassNameMessage()
}

fun String.Companion.printClassNameMessage() = println("This is a ${this.javaClass.canonicalName}")