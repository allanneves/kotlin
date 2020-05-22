package lambdafunctions

import java.time.LocalDateTime

fun main() {
    val names = arrayListOf("Mary", "Kate", "Mike")
    sayHello(names, casualGreet)
    sayHello(names, formalGreet)
    sayHello(names, { name: String -> println("Hello $name from an inline lambda") })
    sayHello(names) { name: String -> println("Hello $name from a lambda outside the parentheses") }
    sayHello(arrayListOf("Mary", "Kate", "Mike")) { name: String -> println("Hello $name from just one line of code") }
}

//A High Order Function is a Function that takes another Function as a parameter
fun sayHello(names: ArrayList<String>, runFeature: (String) -> Unit) {
    for (name in names) {
        runFeature(name)
    }
}

val casualGreet = { name: String -> println("Hello $name") }
val formalGreet = { name: String -> println("Hello Sir/Madam $name. This is the current time: ${LocalDateTime.now()}") }