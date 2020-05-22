package initblock

fun main() {
    val chrome = WebBrowser()
}

class WebBrowser {
    init {
        println("#######################")
        println("RUNNING INIT BLOCK")
        println("#######################")
        println("Loading https://www.google.com")
    }
}