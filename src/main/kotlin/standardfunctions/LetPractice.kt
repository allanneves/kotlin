package standardfunctions

fun main() {
    doubleNumber()
    fillAnimalList()
}

fun doubleNumber() {
    println("Please enter a number:")
    val number = readLine()
    number?.let {
        println("The double of your number is: ${it.toInt().times(2)}")
    }
}

fun fillAnimalList() {
    val animals = arrayListOf<String?>()

    for (i in 1..3) {
        println("Please enter an animal name:")
        readLine()?.let {
            if (it.isEmpty()) {
                animals.add(null)
            } else {
                animals.add(it)
            }
        }
    }

    animals.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}