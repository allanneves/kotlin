package extensions

fun main() {
    val customers = arrayListOf("John", "Michael", "Andrew")
    println(customers.getSizeMessage())

    val numbers = listOf(1, 10, 22, 17, 9)
    println(numbers.getSizeMessage())
}

fun List<Any>.getSizeMessage() = "The list contains ${this.size} element(s): $this"