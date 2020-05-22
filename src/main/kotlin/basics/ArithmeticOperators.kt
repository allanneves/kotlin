package basics

fun main(args: Array<String>) {

    // Plus operator
    println("Hi" + " John")
    println(5 + 2)

    // Minus operator
    println(5 - 2)

    // Multiplication operator
    println(5 * 2)

    // Division operator
    println(5 / 2)
    println(5f / 2f)

    // Modulus (remainder) operator
    println(5 % 2)

    // Increment operator
    var cats = 5
    cats++
    println("I now have $cats cats")

    // Decrement operator
    cats--
    println("A cat passed away. I now have $cats cats")

    // Increment/Decrement caveat
    var dogs = 2
    println("I have ${dogs++} dogs") // two dogs - the increment will happen later
    println("I have $dogs dogs") // three dogs - the increment already happened in the line above
    println("I have ${++dogs} dogs") // four dogs - it will first increment and then print

    var bikes = 5
    bikes += 3
    println(bikes)
    bikes -= 1
    println(bikes)
    bikes *= 2
    println(bikes)
    bikes /= 2
    println(bikes)
    bikes %= 2
    println(bikes)

    val l = 76.254
    val m = 3.867

    println("$l plus $m is ${l + m}")
    println("$l minus $m is ${l - m}")
    println("$l multiplied by $m is ${l * m}")
    println("$l divided by $m is ${l / m}")
    println("$l mod $m is ${l % m}")

    val kiloPrice = 29.99
    val purchaseAmount = 1F/3
    println("The person will have to spend ${kiloPrice * purchaseAmount}")

    println("Enter your bank account amount:")
    val bankAccountAmount = readLine()?:""
    println("You won a prize that triples your bank account. Your account balance now is ${bankAccountAmount.toDouble() * 3}")

    println("Enter your bank account amount:")
    val amount = readLine()?:""
    val amountDouble = amount.toDouble()
    val interest = (1.055 * 1.055 * 1.055 * 1.055 * 1.055)
    val amountAfter5Years = interest * amountDouble
    println("After 5 years you will have $amountAfter5Years")
}