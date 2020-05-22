package classes

fun main() {
    val calculator = Math()
    val firstNumber = 10
    val secondNumber = 2

    println("$firstNumber + $secondNumber = ${calculator.add(firstNumber, secondNumber)}")
    println("$firstNumber - $secondNumber = ${calculator.sub(firstNumber, secondNumber)}")
    println("$firstNumber * $secondNumber = ${calculator.mul(firstNumber, secondNumber)}")
    println("$firstNumber / $secondNumber = ${calculator.div(firstNumber, secondNumber)}")
}

class Math {
    fun add(first : Int, second : Int) = first + second
    fun sub(first: Int, second: Int) = first - second
    fun mul(first: Int, second: Int) = first * second
    fun div(first: Int, second: Int) = first / second
}