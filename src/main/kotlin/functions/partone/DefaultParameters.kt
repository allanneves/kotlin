package functions.partone

fun main() {
    defaultParameters("Playing with default parameters.")
    defaultParameters()
    defaultGreet("Allan")
    defaultGreet("John", "Hello")
}

fun defaultParameters(message: String = "Failover to default message.") {
    println(message)
}

fun defaultGreet(name: String, message: String = "Hi ${name.length}") {
    println("$message $name")
}