package gettersandsetters

fun main() {
    val account = DifferentBankAccount()
    account.balance = 5000.0
    println("Current Account Balance: ${account.balance}. Interest Rate should be 0.5: ${account.interestRate}")

    account.balance = 700.0
    println("Current Account Balance: ${account.balance}. Interest Rate should be 1.0: ${account.interestRate}")

    account.balance = 15000.0
    println("Current Account Balance: ${account.balance}. Interest Rate should be 0.2: ${account.interestRate}")

    account.balance = 20000.0
    println("Current Account Balance: ${account.balance}. Interest Rate should be 0.2: ${account.interestRate}")
}

class DifferentBankAccount {
    var interestRate = 0.0
    var balance = 0.0
        set(value) {
            field = value
            calculateInterestRate()
        }

    private fun calculateInterestRate() {
        when {
            balance < 1000 -> interestRate = 1.0
            balance < 10000 -> interestRate = 0.5
            balance > 10000 -> interestRate = 0.2
        }
    }
}