package polymorphism

// Dynamic Polymorphism is achieve through method overriding

fun main() {
    val mom : Mom = Mom()
    mom.say("Hi!")

    val daughter : Mom = Daughter()
    daughter.say("Hi!")
}

open class Mom() {
    open fun say(message: String) {
        println("Default message of the parent class: $message")
    }
}

class Daughter : Mom() {
    override fun say(message: String) {
        println("The method of the Child class overrides the parent and implements a different behaviour for the same method. This is dynamic polymorphism")
        println("This is the message: $message")
    }
}