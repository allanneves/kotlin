package collections

fun main() {

    val cities = arrayListOf("New York", "Austin", "Budapest", "Tokyo", "Rio de Janeiro", "Austin")
    cities.set(0, "Minneapolis")
    println(cities)

    val firstThreeCities = cities.subList(0,3)
    println(firstThreeCities)
    println(firstThreeCities::class.java)

    cities.clear()
    println(cities)
    println("is cities list empty? ${cities.isEmpty()}")

    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
    println("Michael finished on position number ${winners.indexOf("Michael") + 1}")

    val defaultPrinterColors = listOf("red", "green", "blue")
    val randomPrinter = listOf("red", "blue")
    println("Can the random printer print a document? ${randomPrinter.containsAll(defaultPrinterColors)}")

    val ingredients = arrayListOf("Chicken", "Egg", "Mozzarella", "Pepper")
    ingredients.set(ingredients.indexOf("Mozzarella"), "Blue Cheese")
    ingredients[ingredients.indexOf("Blue Cheese")] = "Parmesan Cheese"
    println(ingredients)

    val animals = arrayListOf("zebra", "lion", "chimp", "elephant")
    animals.add("panda")
    println("Animals at the zoo: $animals")
    animals.remove("lion")
    println("The Lion has been sold to a different zoo. These are the current animals: $animals")
    println("Does the zoo have both elephants and giraffes? ${animals.contains("elephant") && animals.contains("giraffe")}")

    val compareAnimals = listOf("elephant", "chimp")
    println("Does the zoo have both elephants and giraffes? ${animals.containsAll(compareAnimals)}")
}