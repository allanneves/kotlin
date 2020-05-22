package basics

fun main() {

    /*
     *  !!. A developer guarantee that the variable is not null
     *
     *  WARNING: This bypasses all the language checks for null safety
     *  and can trigger a program crash.
     *
     *  Normally you will never ever use this operator. Just use it if you are 100% that the value is not null
     */

    val carModel:String? = null
    println(carModel!!.length)

    // if the value is null the program will crash like regular Java NPE
}