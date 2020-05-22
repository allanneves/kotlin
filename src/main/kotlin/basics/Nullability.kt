package basics

fun main() {

    val herName: String = "Lilly" // this variable cannot be null so it must be given a value
    val hisName: String? = null
    val theName: String?

    println(herName)
    println(hisName)
    //println(theName) //compilation error - the variable must be initialized

    var catName = "Fluffy"
    // catName = null // a null valuable cannot be assigned to a variable that hasn't been flagged as nullable (?)

    var dogName: String? = "Chonkers"
    dogName = null

    val test: String
}