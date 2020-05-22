package standardfunctions

fun main() {
    println("What's your name?")
    val clientName = readLine()?:""
    val coffee = CoffeeShop().sellCoffee(clientName)
    coffee.drink()
}

class CoffeeShop {
    fun sellCoffee(clientName: String): Coffee {
        return Coffee().apply {
            this.clientName = clientName
            this.brewingMethod = BREWING_METHOD.INFUSION
            prepareCoffee()
        }
    }
}

class Coffee {
    var clientName = ""
    var brewingMethod = BREWING_METHOD.POUR_OVER

    fun prepareCoffee() {
        println("Brewing the coffee using the ${brewingMethod.name} method.")
    }

    fun drink() {
        println("$clientName is drinking coffee brewed through ${brewingMethod.name}")
    }
}

enum class BREWING_METHOD {
    POUR_OVER,
    INFUSION
}