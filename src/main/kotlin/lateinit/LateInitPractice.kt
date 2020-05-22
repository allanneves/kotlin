package lateinit

fun main() {
    val ireland = Country().apply { setName("Republic Of Ireland") }
    val irelandName = ireland.getName()
    println("The country name is $irelandName")

    val unitedKingdom = Country()
    // Should throw an exception
    val unitedKingdomName = unitedKingdom.getName()
}

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = this.name
}