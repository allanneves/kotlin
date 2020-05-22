package interfaces

fun main() {
    val coffeeShop = CoffeeShop()
    var coffee : Coffee
    for (i in 1..12) {
        coffee = coffeeShop.purchaseCoffee()
        println("$i ==========")
        coffee.wakeUp()
        coffee.quench()
    }
}

interface Coffee {
    fun quench()
    fun wakeUp()
}

class ArabicaCoffee : Coffee {
    override fun quench() {
        println("Quenching your Arabica Thirst")
    }

    override fun wakeUp() {
        println("Waking you up with some Arabica")
    }
}

class RobustaCoffee : Coffee {
    override fun quench() {
        println("Quenching your Robusta Thirst")
    }

    override fun wakeUp() {
        println("Waking you up with some Robusta")
    }

}

class CoffeeShop {
    fun purchaseCoffee() : Coffee {
        val randomNumber = System.currentTimeMillis() % 2
        return if (randomNumber == 0L) ArabicaCoffee() else RobustaCoffee()
    }
}