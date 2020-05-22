package basics

import kotlin.random.Random

fun main(args: Array<String>) {
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))

    println(Random.nextDouble(300.0))
}