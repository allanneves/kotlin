package inheritance

fun main() {
    val josh = Son()
    val michael = GrandSon()

    josh.printNames()
    println("=====================")
    michael.printNames()
}

open class Son() {
    open val firstName = "Josh"
    open val lastName = "Smith"

    open fun printNames() {
        println("My name is: $firstName $lastName")
    }
}

class GrandSon : Son() {
    override val firstName = "Michael"
    override val lastName = "Collins"

    override fun printNames() {
        super.printNames()
        println("My Father's name is: ${super.firstName} ${super.lastName}")
    }
}