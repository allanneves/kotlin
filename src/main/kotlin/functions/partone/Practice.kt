package functions.partone

import kotlin.math.round

fun main() {
    for (i in 1..10) {
        printHello()
    }

    for (i in 1..3) {
        multiplyBySeventeen()
    }

    for (i in 1..3) {
        displayGreetingMessage()
    }

    for (i in 1..3) {
        println("${i * 5} + ${i * 9} = ${addition(i * 5, i * 9)}")
    }

    var products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
    println("Current Prices: $products")
    products = taxProducts(products)
    println("Prices After 20% Tax: $products")
}

fun printHello() {
    println("Hello, How are you?")
}

fun multiplyBySeventeen() {
    println("Please type a number that will be multiplied by 17:")
    val userInput = readLine() ?: ""
    val number = userInput.toInt()
    println("$number * 17 = ${number * 17}")
}

fun displayGreetingMessage() {
    println("What is your name?")
    val name = readLine() ?: ""
    println("What is your birth year?")
    val birthYear = readLine()?.toInt() ?: 0
    println("Welcome $name! Your username is ${name.toLowerCase()}$birthYear")
    println("You are ${2020.minus(birthYear).minus(1)} or ${2020.minus(birthYear)} old")
}

fun addition(first: Int, second: Int) = first + second

fun taxProducts(products : HashMap<String, Double>) : HashMap<String, Double> {
    for (product in products) {
        val taxedPrice = product.value * 1.2 // adds 20%
        product.setValue(round(taxedPrice))
    }

    return products
}