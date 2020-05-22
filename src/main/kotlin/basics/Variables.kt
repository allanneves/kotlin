package basics

fun main(args: Array<String>) {

    var mutable = "I can change!"
    println(mutable)
    mutable = "You changed me!"
    println(mutable)

    val immutable = "You cannot change me!"
    //immutable = "Trying to change an immutable variable"
    println(immutable)

    var stringInference = "This is a String"
    //stringInference = 10

    var numberInference = 10
    //numberInference = "This is a Number"

    val dogName = "Dollar"
    println("my dog's name is $dogName")
    println("my dog's name length is ${dogName.length}")
    println("$dogName is ${1 + 2} years old")

    val clientName = "John"
    println("Hello $clientName, welcome to the store")

    val apples = 3
    val oranges = 7
    val strawberries = 2
    val numberOfDays = 2
    println("There are on average ${(apples + oranges + strawberries) / numberOfDays} fruits for $numberOfDays days")

    val customer = "Mary"
    val products = 3
    val priceOfEachProduct = 30
    println("Hello $customer, your purchase will cost you ${products * priceOfEachProduct}")
}