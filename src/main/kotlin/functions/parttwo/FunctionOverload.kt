package functions.parttwo

fun main() {
    val threeTimesTwo = multiply(3)
    println(threeTimesTwo)

    val threeTimesFive = multiply(3, 5)
    println(threeTimesFive)

    val threeTimesTwenty = multiply(3, 20, false)
    println(threeTimesTwenty)

    multiply(3, 20, true)

    sayHello("John")
    sayHello(listOf("Anna", "Bob", "Carol"))
}

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier
fun multiply(number: Int, multiplier: Int, log: Boolean): Int {
    if (log) println("$number * $multiplier = ${number * multiplier}")
    return number * multiplier
}

fun sayHello(name: String) = println("Hi there $name")
fun sayHello(names: Collection<String>) = names.forEach { println("Hi there $it") }