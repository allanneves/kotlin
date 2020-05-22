package classes

fun main() {
    val modernJetPack: JetPack = JetPack()

    modernJetPack.burn(10)
    modernJetPack.burn(5)
    modernJetPack.burn(15)

    modernJetPack.stop(2)
    modernJetPack.stop(3)
    modernJetPack.stop(5)
    modernJetPack.stop(5)
}

class JetPack {
    private var currentHeight = 0

    fun burn(seconds: Int) {
        currentHeight += seconds
        printCurrentHeight()
    }

    fun stop(seconds: Int) {
        when {
            (currentHeight == 0) -> println("Your current height is $currentHeight. You cannot go below that.")
            (currentHeight - 3 * seconds) <= 0 -> currentHeight = 0
            else -> currentHeight -= 3 * seconds
        }
        printCurrentHeight()
    }

    private fun printCurrentHeight() {
        println("Current Height: $currentHeight")
    }
}