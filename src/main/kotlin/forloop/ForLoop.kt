package forloop

fun main() {

    val animals = listOf("Cat", "Dog", "Bear")
    for (animal in animals) {
        println("Feed the $animal")
    }

    for (i in 1..12) {
        val month = when(i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10-> "October"
            11-> "November"
            12-> "December"
            else -> ""
        }
        println("Month #$i is called $month")
    }

    for (i in 10 downTo 0) {
        println(i)
        val message = when (i) {
            9 -> "Start your engines!"
            6 -> "On your marks!"
            3 -> "Get set"
            0 -> "GO!"
            else -> "---"
        }
        println(message)
    }

    for (i in 10 downTo 0 step 3) {
        println("Value of i: $i")
    }
}