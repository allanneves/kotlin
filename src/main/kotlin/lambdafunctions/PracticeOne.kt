package lambdafunctions

fun main() {
    val numbers = arrayListOf(100, 25, 2000, 47)
    val numbersDividedByThen = doMathOperationOnEvenNumbers(numbers, divideByThen)
    println("Divided by Then: $numbersDividedByThen")
    val multipliedByTwo = doMathOperationOnEvenNumbers(numbers) { number -> number * 2 }
    println("Multiplied by Two: $multipliedByTwo")
}

fun doMathOperationOnEvenNumbers(numbers: ArrayList<Int>, operation: (Int) -> Int) : ArrayList<Int> {
    for (i in 0 until numbers.size) {
        if (isEven(numbers[i])) {
            numbers[i] = operation(numbers[i])
        }
    }

    return numbers
}

val divideByThen = { number: Int -> number / 10 }
fun isEven (number : Int) = number % 2 == 0