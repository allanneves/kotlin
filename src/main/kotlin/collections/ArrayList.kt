package collections

fun main() {

    // A mutable (changeable) List

    val colors = arrayListOf("blue", "red")
    println(colors)

    val cars : ArrayList<String> = arrayListOf("fiesta", "corsa")
    println(cars)

    val cities = arrayListOf<String>()
    cities.add("Paris")
    cities.add("Moscow")
    println(cities)

    cities.remove("Paris")
    println(cities)

    cities.addAll(colors)
    println(cities)

    cities.removeAll(colors)
    println(cities)

    cities.removeAt(0)
    println(cities)

    // if the list contains duplicate elements, the remove function only removes the first element

    cities.add("New York")
    cities.add("Budapest")
    cities.add("New York")
    println(cities)
    cities.remove("New York")
    println(cities)
}