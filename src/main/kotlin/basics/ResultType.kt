package basics

fun main(args: Array<String>) {

    /*
    * The largest type will always have the result type of an operation.
    * Byte < Short < Int < Long < Float < Double
    * */

    val a:Short = 6
    val b:Int = 2
    val r = a * b
    println(r::class.java)

    val x:Long = 8374622
    val y:Float = 12.44F
    val z = x / y
    println(z::class.java)

    val p:Float = 177.4F
    val q:Double = 15123.1231231324234
    val v = p * q
    println(v::class.java)
}