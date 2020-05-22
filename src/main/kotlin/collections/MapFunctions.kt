package collections

fun main() {

    val countries = hashMapOf(Pair("USA", "Washington D.C."), Pair("Brazil", "Brasilia"), Pair("Ireland", "Dublin"))

    println("This map has a size of ${countries.size}")
    println("Does the map contain Ireland as a key? ${countries.containsKey("Ireland")}")
    println("Does the map contain Germany as a key? ${countries.containsKey("Germany")}")
    println("Does the map contain the value \"Dublin\"? ${countries.containsValue("Dublin")}")
    println("Does the map contain the value \"Paris\"? ${countries.containsValue("Paris")}")
    println("Is the map empty? ${countries.isEmpty()}")
    println("Does the map have any key/value pairs? ${countries.isNotEmpty()}")


    val numbersInFrench = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))
    println("The number two translated to French is ${numbersInFrench[2]}")
    println("The number three translated to French is ${numbersInFrench[3]}")
    numbersInFrench[4] = "quatre"
    println(numbersInFrench)

    val customersPurchases = mapOf(Pair("John", 1), Pair("Alice",5), Pair("Bob", 3))
    println("is Alice a customer? ${customersPurchases.containsKey("Alice")}")
    println("How many products did Alice buy? ${customersPurchases["Alice"]} products")
    println("Is Michael a customer? ${customersPurchases.containsKey("Michael")}")

    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 5248
    println("How many people attended in total on 25 and 26 Sept? ${attendance["25 Sept"]?.plus(attendance["26 Sept"]?:0)}")
    println("Is 22 Sept available? ${attendance.containsKey("22 Sept")}")


}