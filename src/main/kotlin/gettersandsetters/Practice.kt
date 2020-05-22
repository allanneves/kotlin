package gettersandsetters

fun main() {

    /*
    * Adding logic to getters and setters is often considered a bad practice.
    * Please, be sure that you know your use case well before doing this sort of implementation.
    * */
    val customerAccount = BankAccount()
    customerAccount.amount = 10.0
    customerAccount.amount = 4.50
    customerAccount.amount = 11.0

    customerAccount.printStatement()
    customerAccount.printStatement()
}

class BankAccount {
    private var creditRating = 0
    var amount: Double = 0.0
        get() {
            creditRating -= 1
            return field
        }
        set(value) {
            field = value
            creditRating += 1
        }

    fun printStatement() {
        println("Your current credit rating is $creditRating and your balance is $amount")
    }
}