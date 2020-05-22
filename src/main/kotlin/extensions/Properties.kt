package extensions

fun main() {
    val text = "This is a text that can overflow so I define a safety threshold in my project"
    val screen = text.substring(0, text.safeLength)
    println(screen)
}

val String.safeLength: Int
    get() {
        println("Logging Information: String can overflow so this method has been called")
        return 32
    }