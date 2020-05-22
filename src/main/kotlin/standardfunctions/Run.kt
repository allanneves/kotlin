package standardfunctions

fun main() {
    val iPhone = Phone().run {
        price = 1200
        currency = "USD"
        manufacturer = "Apple"
        model = "iPhone XS"
        this
    }

    iPhone.printPhoneInfo()

    run {
        val galaxy = Phone()
        galaxy.manufacturer = "Samsung"
        galaxy.model = "S10"
        galaxy.price = 1000
        galaxy.currency = "EUR"
        galaxy.printPhoneInfo()
    }
}

class Phone {
    var price = 500
    var currency = "EUR"
    var manufacturer = "Generic Manufacturer"
    var model = "Generic Model"

    fun printPhoneInfo() {
        println("$manufacturer $model costs $price $currency")
    }
}