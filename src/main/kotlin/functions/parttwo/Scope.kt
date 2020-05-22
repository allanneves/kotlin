package functions.parttwo

fun main() {
    val year = 2015
    testScope()
    println("Reading year variable from the main function: $year")
}

fun testScope() {
    val year = 1985
    println("Reading year variable from the testScope function: $year")
}