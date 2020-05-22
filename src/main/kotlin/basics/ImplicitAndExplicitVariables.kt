package basics

fun main(args: Array<String>) {

    val cats = 3 // Implicit - Integer
    println("cats = ${cats::class.java}")

    val dogs:Byte = 5 // Explicit - Byte
    println("dogs = ${dogs::class.java}")

    val price = 39.99 // Implicit - Double
    println("price = ${price::class.java}")

    val days:Short = 20000
    println("days = ${days::class.java}")

    val temperature:Int = 22 // Explicit - Int
    println("temperature = ${temperature::class.java}")

    val life:Long = 42
    println("life = ${life::class.java}")

    val age = 42L
    println("age = ${age::class.java}")

    val moneyDouble = 33.50
    println("moneyDouble = ${moneyDouble::class.java}")

    val money:Float = 33.50F
    println("money = ${money::class.java}")
}