package functions.parttwo

fun main() {
    sayHello(4, "Derek", "Matthew", "Fiona")
}

fun sayHello(times : Int, vararg names : String) {
    names.forEach {
        for (i in 1..times) {
            println("$i: Hello $it")
        }
        println()
    }
}