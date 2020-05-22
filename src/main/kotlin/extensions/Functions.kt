package extensions

fun main() {
    val siteName = "kotlin lang"
    println(siteName.toUrl())
}

fun String.toUrl() = "https://www.${this.toLowerCase().trim().replace(" ", "")}.org"
fun String.Companion.printHorizontalLine() = println("================================================")