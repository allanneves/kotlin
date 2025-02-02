package functions.partone

fun main() {
    for (i in 1..10) {
        doubleNumber(i)
    }

    val customers = listOf("Michael", "Charles", "John", "Jessica")
    sayHello(customers)

    double(10, "10 * 2 =")
    double(8)
}

fun doubleNumber(number: Int) {
    println("$number * 2 = ${number * 2}")
}

fun sayHello(names: Collection<String>) {
    for (name in names) {
        println("Hello $name, how are you?")
    }
}

fun double(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}