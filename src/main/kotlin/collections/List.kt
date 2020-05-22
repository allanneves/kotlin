package collections

fun main() {

    // Ordered collection that can contain duplicate elements
    val colors = listOf("blue", "yellow", "red")
    println(colors)

    // if we create an empty list, we must specify the element type
    val vehicles = listOf<String>()
    println(vehicles)

    // a list can contain duplicate elements
    val duplicateColors = listOf("blue", "blue", "red", "yellow", "blue", "green")
    println(duplicateColors)

    // a list can also contain nulls
    val tvBrands = listOf("samsung", "lg", null, "sharp", null)
    println(tvBrands)

    println("First color: ${colors[0]}")
    println("Second color: ${colors[1]}")
    println("Third color: ${colors[2]}")
//    println("Index that is greater than the size of the list color: ${colors[5]}")

    println("The Java way of accessing the index: ${colors.get(0)}")
    println("The size of the TV Brands list is ${tvBrands.size}")
}