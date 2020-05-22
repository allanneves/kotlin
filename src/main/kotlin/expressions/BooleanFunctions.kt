package expressions

fun main() {

    val animals = arrayListOf<String>()
    if (animals.isEmpty()) {
        animals.add("dog")
    }
    println(animals)

    // Some functions you might not expect to return a boolean, like arraylist.add
    val cars = arrayListOf("fiesta", "golf", "s90")
    if (cars.add("a4"))
        println("a4 was successfully added!")
}