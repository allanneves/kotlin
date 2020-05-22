package dataclasses

fun main() {
    val customers = arrayListOf<CustomerInformation>()
    customers.add(CustomerInformation("John Lynch", "john@gmail.com", listOf("Toy", "TV")))
    customers.add(CustomerInformation("Laura", "laura@hotmail.com", listOf("Makeup", "Dress")))
    customers.add(CustomerInformation("Michael", "michael@yahoo.com", listOf("Tennis Racket", "PS4")))

    customers.add(customers[0].copy(name = "John O'Connell", email = "joconnell@gmail.com"))
    sendEmail(customers)
}

data class CustomerInformation(
    val name: String,
    val email: String,
    val wishList: List<String>
)

fun sendEmail(customers: ArrayList<CustomerInformation>) {
    customers.forEach {
        println(it)
        println("Sending an e-mail to ${it.email}")
        println()
    }
}