package nestedclasses

fun main() {
    val computer = Computer()
    computer.bootUp()
}

private class Computer {
    private val os = OperatingSystem()

    fun bootUp() {
        println("Starting Computer..")
        os.start()
        println("Ready to Use..")
    }

    private inner class OperatingSystem {
        fun start() {
            println("Starting the Operating System..")
        }
    }
}