package lambdafunctions

fun main() {
    val clients = listOf("Anna", "Bob", "Carol", "Joanna")

    // for each element
    clients.forEach { println("Hello $it") }

    // filter by a given predicate (contains "nn")
    clients.filter { it.contains("nn") }.forEach { println("Hello $it") }

    // apply to each element of the collection
    clients.map { it.length }.forEach { println("size: $it") }
    val sizes = clients.map { it.length }
    println("Name sizes: $sizes")

    // sort by a defined predicate
    clients.sortedBy { it.length }.forEach { println("smallest: $it") }

    // get the max of a certain predicate
    val longestName = clients.maxBy { it.length }
    println("Longest Name: $longestName")

    // get the mix of a certain predicate
    val shortestName = clients.minBy { it.length }
    println("Shortest Name: $shortestName")

    val randomNumbers = listOf(34, 67, 76, 45, 3435, 345, 67, 23, 5, 3, 56, 324, 5, 43, 90)

    val subset = randomNumbers.map {
        if (it % 2 == 0)
            it / 2
        else
            it * 2
    }
        .filter { it > 25 }

    println(subset)
}