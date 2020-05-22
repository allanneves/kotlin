package basics

fun main(args: Array<String>) {

    println("Printing a regular String")
    println("Escaping the backslash \\")
    println("Escaping double quotes \"")
    println("capitalize the first word".capitalize())
    println("Decapitalize the first word".decapitalize())
    println("      There are way     too many spaces       ".trim())
    println("What is the length of this string?".length)
    println("Parrot and Crocodile".substring(14))
    println("Parrot and Crocodile".substring(3, 6))
    println("Parrot and Crocodile".toLowerCase().contains("croc"))
    println("Parrot and Crocodile".get(3))
    println("Parrot and Crocodile"[3])
    println("""
        (\(\
        (-.-)
        0_(")(")
    """.trimIndent())

    val customerName = "Allan"
    val products = 3
    val pricePerProduct = 30
    println("Hello $customerName, Welcome to the Store!")
    println("The total amount of your purchase is ${products * pricePerProduct}")
    println("Customer's Name length: ${customerName.length}")


}