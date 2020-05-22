package forloop

fun main() {

    for (i in 0..9) {
        for (j in 0..9) {
            print("$i,$j \t")
        }
        println()
    }

    println()

    val matrixSize = 9
    for (i in 0..matrixSize) {
        for (j in 0..matrixSize) {
            if (i == j) {
                print("diagonal\t")
            } else {
                print("$i,$j   \t\t")
            }
        }
        println()
    }

    println("Please enter a number:")
    val userInput = readLine() ?: "0"
    val maxValue = userInput.toInt()
    for (i in maxValue downTo 0) {
        if (i % 7 == 0) {
            println("$i is divisible by seven.")
        }
    }

    println()

    for (i in 0..9) {
        print("$i: ")
        for (j in 0..i) {
            print("🙂 ")
        }
        println()
    }

    println("Please enter a new number:")
    val userChoice = readLine() ?: "0"
    val size = userChoice.toInt()

    for (i in 1..size) {
        for (j in 1..size)
            when (i * j % 3) {
                0 -> print("😃 ")
                1 -> print("🥴 ")
                2 -> print("😱 ")
            }
        println()
    }
}