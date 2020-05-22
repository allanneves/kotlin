package breakandcontinue

fun main() {

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0) {
                println("$i is divisible by three, stopping execution. Breaking to the outer loop")
                break@loop
            }
            println("$i,$j")
        }
    }
}