package functions.parttwo

fun main() {
    awardPrize(hashMapOf(Pair("John", 100.0), Pair("Leo", 50.0)))
    greet()
}

fun awardPrize(bankAccounts: HashMap<String, Double?>) {
    fun doubleAccountBalance(balance: Double?) = balance?.times(2)

    for (bankAccount in bankAccounts.keys) {
        bankAccounts[bankAccount] = doubleAccountBalance(bankAccounts[bankAccount])
    }

    println(bankAccounts)
}

fun greet() {
    while (true) {
        println("Please enter your name:")
        val name = readLine() ?: ""
        if (name.isNotEmpty()) printGreeting(name) else break
    }
}

fun printGreeting(name: String) = println("Hello $name!")