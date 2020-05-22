package interfaces

fun main() {
    var foodOrder: Food = FastFoodRestaurant().buyFood()
    foodOrder.eat()

    foodOrder = FrenchRestaurant().todaySpecial()
    foodOrder.eat()
}

interface Food {
    fun eat()
}

class FrenchFood : Food {
    override fun eat() {
        println("French food will feed AND delight you")
    }
}

class FrenchRestaurant {
    fun todaySpecial() : Food {
        return FrenchFood()
    }
}

class FastFood : Food {
    override fun eat() {
        println("Fast food will feed you")
    }
}

class FastFoodRestaurant {
    fun buyFood() : Food {
        return FastFood()
    }
}