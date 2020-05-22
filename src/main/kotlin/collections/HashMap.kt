package collections

fun main() {

    val countries = hashMapOf(Pair("USA", "Washington D.C."), Pair("Brazil", "Brasilia"), Pair("Ireland", "Dublin"))

    // Two different ways to add a key/value pair to a map
    countries.put("Germany", "Berlin")
    countries["Germany"] = "Berlin"

    val asianCountries = mapOf(Pair("India", "Dheli"), Pair("Japan", "Tokyo"))
    countries.putAll(asianCountries)

    println(countries)

    // The keys are just a Set so Maps implementations are also unique and without order.
    // Ordering really does not matter as the intention of a map is to retrieve values by unique keys

    countries.remove("Brazil")
    countries["Ireland"] = "Replacing"
    countries.replace("Ireland", "Capital")
    println(countries)

    countries.clear()
    println(countries)
}