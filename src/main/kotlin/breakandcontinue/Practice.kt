package breakandcontinue

fun main() {

    for (i in 1..5) {
        println("Please type the name of the animal you would like to bring to the shelter:")
        val userInput = readLine()?:""
        if (userInput.toLowerCase() == "snake") {
            println("Sorry, you cannot bring a snake to the shelter.")
            break
        }
        println("$userInput added to the shelter!")
    }

    val customers = listOf("Anna", "Bob", "Carol", "David")

    for (customer in customers) {
        if (customer.toLowerCase().startsWith("c")) {
            continue
        }
        println("Welcome $customer!")
    }

    while(true) {
        println("Please enter your age or \"stop\" to exit:")
        val userInput = readLine()?:""
        if (userInput.toLowerCase() == "stop")
            break

        val age = userInput.toInt()
        if(age < 18) {
            println("Sorry, people under the age of 18 are not allowed.")
            continue
        }

        println("Welcome!")
    }
}