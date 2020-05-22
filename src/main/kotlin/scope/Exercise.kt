package scope

fun main() {
    val franchise = Franchise()
    franchise.prepareBurger()
}

class Franchise : Restaurant() {
    fun prepareBurger() {
        println("Preparing Burger")
        println(super.provideRecipe())
    }
}

open class Restaurant {
    protected fun provideRecipe() = "Original Burger Recipe"
}
