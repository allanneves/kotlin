package basics

fun main(args: Array<String>) {

    println("Enter your name:")
    println("Hello ${readLine()}, welcome to my system.")

    println("Type something and press Enter")
    val input = readLine()
    println("You wrote: $input")

    println("Type a number:")
    val number = readLine()?:""
    println("You typed: ${number.toInt()}")

    println("Type a number that will be multiplied by 5:")
    val numberByFive = readLine()?:""
    val result = numberByFive.toInt() * 5
    println("$numberByFive multiplied by 5: $result")

    println("What year were you born?")
    val year = readLine()?:""
    println("You are likely to be ${2019 - year.toInt()}")
}