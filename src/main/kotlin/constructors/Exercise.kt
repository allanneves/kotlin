package constructors

const val shirtPrice: Double = 20.0

fun main() {
    val unknown = UserAccount()
    val joseph = UserAccount("Joseph")
    val brian = UserAccount("Brian", 150.0)
    val mary = UserAccount("Mary", 2456.75)
}

class UserAccount {
    private var name = "Unknown"
    private var balance = 0.0

    constructor() {
        canAffordAShirt()
    }

    constructor(name: String) {
        this.name = name
        canAffordAShirt()
    }

    constructor(name: String, balance: Double) {
        this.name = name
        this.balance = balance
        canAffordAShirt()
    }

    private fun canAffordAShirt() {
        val shirtsValueForBalance = balance.div(shirtPrice)
        val canAfford = shirtsValueForBalance >= 1.0
        if (canAfford) {
            println("Hi $name. You can afford ${shirtsValueForBalance.toInt()} shirts. Your balance is $balance.")
        } else {
            println("Hi $name. Your balance is $balance and you cannot afford a shirt.")
        }
    }
}