package functions.parttwo

fun main() {
    sayHi("John")
    sayHi("Michael", "Mary", "James", "Fiona", "Bob")

    println(sum(1))
    println(sum(5, 5))
    println(sum(10, 10, 10))
    println(sum(200, 200))

    println(sumFunctional(10, 10, 10))
    println(sumFunctional(200, 200))
}

fun sayHi(vararg names: String) {
    for (name in names) {
        println("Hi $name")
    }
}

fun sum(vararg numbers: Int): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun sumFunctional(vararg numbers: Int) = numbers.sumBy { it }