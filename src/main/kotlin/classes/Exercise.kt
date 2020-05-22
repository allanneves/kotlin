package classes

fun main() {
    val calculator = Calculator()
    println("0 + 10 = ${calculator.add(10.0)}")
    println("10 * 50 = ${calculator.mul(50.0)}")
    println("500 - 475 = ${calculator.sub(475.0)}")
    println("25 / 2.5 = ${calculator.div(2.5)}")
    println("Reset: ${calculator.reset()}")
    println("0 + 15 = ${calculator.add(15.0)}")
    println("15 + 30 = ${calculator.add(30.0)}")
    println("Reset: ${calculator.reset()}")
}

class Calculator {
    private var total: Double = 0.0

    fun add(number : Double) : Double {
        total += number
        return total
    }

    fun sub(number: Double) : Double {
        total -= number
        return total
    }

    fun mul(number: Double) : Double {
        total *= number
        return total
    }

    fun div(number: Double) : Double {
        total /= number
        return total
    }

    fun reset() : Double {
        total = 0.0
        return total
    }

}