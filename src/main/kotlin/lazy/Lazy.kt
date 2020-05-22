package lazy

import kotlin.random.Random

fun main() {
    val someReallyLargeVariable: String by lazy { "An expensive computation" }

    if (Random.nextInt() % 2 == 0) {
        println("The variable needs to be accessed and will be initialized (assigned) at this point: $someReallyLargeVariable")
    }
}