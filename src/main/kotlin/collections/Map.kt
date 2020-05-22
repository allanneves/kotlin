package collections

fun main() {

    // A map is a set of key-value pairs
    // Keys are unique, values can be duplicates

    val count = mapOf(Pair("John", "one"), Pair("Mike", "two"), Pair("Fred", "three"))
    println(count)
    println(count.get("John"))
    println(count["Mike"])
    println(count.keys)
    println(count.values)

    val emptyMap = mapOf<Int, String>()
    println(emptyMap)

    count
}