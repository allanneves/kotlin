package standardfunctions

fun main() {
    with(Person()) {
        firstName = "James"
        lastName = "Panora"
        age = 31
        printPersonInformation()
    }
}

class Person {
    var firstName: String? = null
    var lastName: String? = null
    var age : Int? = null

    fun printPersonInformation() {
        println(
            """
                 First Name: $firstName
                 Last Name: $lastName
                 Age: $age
                 ==========================
            """.trimIndent()
        )
    }
}