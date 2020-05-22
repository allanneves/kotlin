package generics

import extensions.printHorizontalLine

fun main() {
    val doubleUtils = Utils<Double>()
    val intUtils = Utils<Int>()
    val charUtils = Utils<Char>()
    val listUtils = Utils<List<Any>>()

    val convertedDouble = doubleUtils.convertToString(10.582398)
    val convertedInt = intUtils.convertToString(10000)
    val convertedChar = charUtils.convertToString('B')
    val convertedList = listUtils.convertToString(listOf(3, 10, 9, 5))

    String.printHorizontalLine()

    println("""
        Converted Double: $convertedDouble - ${convertedDouble.javaClass}
        Converted Int: $convertedInt - ${convertedInt.javaClass}
        Converted Char: $convertedChar - ${convertedChar.javaClass}
        Converted List: $convertedList - ${convertedList.javaClass}
    """.trimIndent())
}

class Utils<T> {

    fun convertToString(value : T) : String {
        val stringResult = value.toString()
        println("$value converted to String: $stringResult  - Length: ${stringResult.length}")
        return stringResult
    }
}