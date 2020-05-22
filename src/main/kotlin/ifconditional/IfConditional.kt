package ifconditional

fun main() {

    println("Is it night time?")
    val input = readLine()
    val night = input?.toBoolean()?:false

    if (night) {
        println("It is night!")
    } else {
        println("It is day!")
    }

    println("Type your account balance:")
    var clientFunds:Int = readLine()?.toInt()?:0
    val price = 50
    var clientProducts = 0
    if (clientFunds > price) {
        clientFunds -= price
        clientProducts += 1
        println("You now have $clientFunds and purchased $clientProducts products")
    } else {
        println("You have insufficient funds")
    }

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true
    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy cat")
        }
    } else {
        println("Ask pet store to get cat")
    }

    val hasEggs = false
    val hasBacon = false
    if (hasEggs) {
        val eggsCost = 12 * 5
        if (hasBacon) {
            val baconCost = 2 * 20
            println("You bought 12 eggs and 2 packs of bacon and spent ${eggsCost + baconCost} in total")
        } else {
            println("You bought 12 eggs and spent $eggsCost")
        }
    } else {
        println("You haven't bought anything because there are no eggs")
    }

    println("Do you have your keys with you (Yes/No)?")
    val userInputKeys = readLine()?:""
    val hasKeys = userInputKeys.equals("yes", true)
    if (hasKeys) {
        println("Starting the engine!")
    } else {
        println("You need the keys to start the engine")
    }

    println("What hour of the day is it (0-23) ?")
    val userInputHour: Int = readLine()?.toInt()?:10

    if (userInputHour == 12) {
        println("$userInputHour p.m.")
    } else {
        if (userInputHour > 12) {
            println("${userInputHour-12} p.m.")
        } else if (userInputHour < 12) {
            println("$userInputHour a.m.")
        }
    }
}