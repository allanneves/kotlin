package polymorphism

// Static Polymorphism is achieve through method overloading

fun main() {
    val dad = Dad()

    dad.say("Hello from one method!")
    dad.say()
    dad.say("Third way of calling the method!", 3)
    dad.say(true)
}

class Dad() {
    fun say(message: String) {
        println("Dad says: $message")
    }

    fun say() {
        println("Dad says: Hello from no parameters!")
    }

    fun say(message: String, times: Int) {
        for(i in 1..times) {
            println("Dad says: $message")
        }
    }

    fun say(explain : Boolean) {
        if (explain) {
            println("We are implementing polymorphism by having different behaviours for the same method by changing the parameters we pass to the method call")
            println("This is called static polymorphism is differs from dynamic as we are in a controlled scope and no one is overriding the method.")
        }
    }
}