package forloop

fun main() {

    for(i in 1..10) {
        println("$i: Hello From My For")
    }

    var sum = 0;
    for (i in 1..100) {
        sum += i
    }
    println("The sum of all numbers between 1 and 100 is $sum")

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    customers.forEach { (name, purchases) -> println("$name you made $purchases purchases") }

    for (customerName in customers.keys) {
        val purchases = customers[customerName]
        println("Dear $customerName, you purchased $purchases items")
    }

    println("Please enter a year:")
    val userInput = readLine()?:""
    val year = userInput.toInt()
    val isLeapYear = (year % 4) == 0

    for (i in 1..12) {
        val message = when (i) {
            1 -> "January: 31 days"
            2 -> if (isLeapYear) "February: 29 days" else "February: 28 days"
            3 -> "March: 31 days"
            4 -> "April: 30 days"
            5 -> "May: 31 days"
            6 -> "June: 30 days"
            7 -> "July: 31 days"
            8 -> "August: 31 days"
            9 -> "September: 30 days"
            10 -> "October: 31 days"
            11 -> "November: 30 days"
            12 -> "December: 31 days"
            else -> ""
        }
        println(message)
    }
}