package interfaces

fun main() {
    val localRestaurant : Restaurant = LocalRestaurant()
    localRestaurant.serveFood()
    localRestaurant.provideBill()

    val fancyRestaurant : Restaurant = FancyRestaurant()
    fancyRestaurant.serveFood()
    fancyRestaurant.provideBill()
}

interface Restaurant {
    fun serveFood()
    fun provideBill()
}

class LocalRestaurant : Restaurant {
    override fun serveFood() {
        println("Serving Local Food")
    }

    override fun provideBill() {
        println("Please pay €20")
    }
}

class FancyRestaurant : Restaurant {
    override fun serveFood() {
        println("Serving Gourmet Food")
    }

    override fun provideBill() {
        println("Please pay €100")
    }

}