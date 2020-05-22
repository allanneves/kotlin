package generics

import extensions.printHorizontalLine

fun main() {
    val box = Box<String>()
    box.display("Content")
    box.display(12.1)
    String.printHorizontalLine()

    val mailbox = Box<Mail>()
    mailbox.display(Mail())
    String.printHorizontalLine()

    val michael = Tuple("Michael", 10)
    michael.printRandomKey("Some Random Key")
    michael.printRandomValue(20)
    michael.printKeyAndValue()
    String.printHorizontalLine()

    val id = Tuple(100F, "One Hundred")
    id.printRandomKey(20F)
    id.printRandomValue("Twenty")
    id.printKeyAndValue()
    String.printHorizontalLine()

    val number = Tuple(10.0, 20)
    number.printRandomKey(50.0)
    number.printRandomValue(100)
    number.printKeyAndValue()
}

class Box<T> {
    fun display(item : T) {
        println("Generic: $item")
    }

    fun display(item : Double) {
        println("Double: $item")
    }
}

class Mail {
    override fun toString(): String {
        return "Calling the toString() of Mail"
    }
}

class Tuple<K, V>(val key: K, val value: V) {

    fun printKeyAndValue() {
        println("Key: $key / Value: $value")
    }

    fun printRandomKey(key : K) {
        println("Random Key: $key")
    }

    fun printRandomValue(value: V) {
        println("Random Value: $value")
    }
}