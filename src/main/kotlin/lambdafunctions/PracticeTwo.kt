package lambdafunctions

fun main() {
    val messageFromDatabase = { personName : String -> "From DB: $personName"}
    val messageFromEmail = { personName : String -> "From Email: $personName"}

    val customers = arrayListOf("John", "Paul", "Michelle")

    val databaseMessages = sendCustomMessage(customers, messageFromDatabase)
    val emailMessages = sendCustomMessage(customers, messageFromEmail)
    val websiteMessages = sendCustomMessage(customers) {personName : String -> "From Website: $personName"}

    println(customers)
    println(databaseMessages)
    println(emailMessages)
    println(websiteMessages)
}

fun sendCustomMessage(customers: Collection<String>, message: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()
    for (customer in customers) {
        messages.add(message(customer))
    }

    return messages
}