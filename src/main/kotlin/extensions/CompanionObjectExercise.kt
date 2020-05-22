package extensions

fun main() {
    Double.printClassNameMessage()
}

fun Double.Companion.printClassNameMessage() = println("This is a ${this.javaClass.name}")