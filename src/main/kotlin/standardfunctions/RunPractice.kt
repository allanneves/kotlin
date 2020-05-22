package standardfunctions

fun main() {

    val japaneseRestaurant = Restaurant().run {
        standardDish.name = "Sushi"
        dailySpecialDish.name = "Wagyu Beef"
        this
    }

    japaneseRestaurant.printMenu()

    run {
        val restaurant = Restaurant()
        restaurant.printMenu()
    }
}

class Restaurant {
    val standardDish : Dish = StandardDish()
    val dailySpecialDish : Dish = DailySpecialDish()

    fun printMenu() {
        println(
            """
                Standard Dish: ${standardDish.name}
                Today's Special: ${dailySpecialDish.name}
                ==========================================
            """.trimIndent()
        )
    }

    abstract class Dish {
        abstract var name : String
    }

    class StandardDish : Dish() {
        override var name = "Pasta Alla Genovese"
    }

    class DailySpecialDish : Dish() {
        override var name = "Escargots a la Bourguignonne"
    }
}