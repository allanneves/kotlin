package standardfunctions

fun main() {
    val store = Store()
    with(store) {
        shoes = 100
        shirts = 550
        jackets = 28
        inventory()
    }
}

class Store {
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun inventory() {
        println("""
            Shoes : $shoes
            Shirts: $shirts
            Jackets: $jackets
            ==========================
        """.trimIndent())
    }
}