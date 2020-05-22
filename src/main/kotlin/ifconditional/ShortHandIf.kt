package ifconditional

fun main() {

    val number = 24
    var isEven : String? = null

    // Traditional If Clause
    if (number % 2 == 0) {
        isEven = "Number is Even"
    } else {
        isEven = "Number is Odd"
    }

    // If-Clause with no curly braces for when there is one conditional only
    if (number % 2 == 0)
        isEven = "Number is Even"
    else
        isEven = "Number is Odd"

    // Shorthand if expression
    if (number % 2 == 0) isEven = "Number is Even (Shorthand)" else isEven = "Number is Odd (Shorthand)"
    println(isEven)

    // Extracting a Shorthand if to a value
    val isEvenOrOdd = if (number % 2 == 0) "Number is Even (value)" else "Number is Odd (value)"
    println(isEvenOrOdd)
}