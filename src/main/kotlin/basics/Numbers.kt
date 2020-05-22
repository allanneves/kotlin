package basics

fun main(args: Array<String>) {
    val price = 34
    val items = 3
    val totalPrice = price * items

    println("totalPrice = $totalPrice")

    /**
     * Integer Types
     *
     * Type   |  Size(bits) |                    Min                  |                     Max
     * ---------------------------------------------------------------------------------------------------
     * Byte        8                                      -128                                         127
     * Short      16                                    -32768                                       32767
     * Int        32                       -2147483648 (-2^31)                       2147483647 (2^31 - 1)
     * Long       64        -9,223,372,036,854,775,808 (-2^64)        9,223,372,036,854,775,807 (2^64 - 1)
     */

    /**
     * Decimal Types:
     *
     * Type    |    Size(bits)    |   Decimal Digits
     *------------------------------------------------
     * Float           32                  6-7
     * Double          64                15-16
     */

    /**
     * Types in Memory
     *
     * Byte   ->  8 bits ->  1 0 0 1 0 1 1 0
     * Short  -> 16 bits ->  1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     * Int    -> 32 bits ->  1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     * Float  -> 32 bits ->  1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     *
     * Long   -> 64 bits ->  1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     *                       1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     *
     * Double -> 64 bits ->  1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     *                       1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1 1 0 1 0 0 0 0 1 0 1 1 0 0 1 0 1
     *
     * Which number is that?
     *
     *  <----- multiply from right to left -------
     *    1    1    0    1    1    0    0    1
     *         *    *    *    *    *    *    *
     *   +/-  2^6  2^5  2^4  2^3  2^2  2^1  2^0
     *    +    64  32   16    8    4    2    1
     *
     *      (1*64)+(0*32)+(1*16)+(1*8)+(0*4)+(0*2)+(1*1) = 89 (positive as the first bit is 1)
     */

    val itemCode = 5  //Int
    println(itemCode::class.java) // prints out the variable type

    val numberOfPeople = 7500000000  //Long
    println(numberOfPeople::class.java)

    val retailPrice = 29.99  //Double
    println(retailPrice::class.java)

    val pi = 3.1415926535    //Double
    println(pi::class.java)

    println("Please enter a number:")
    val input = readLine()?:""
    val integer = input.toInt()
    val double = 2.50
    val calculation = (integer * double)
    println("calculation variable type = $calculation - ${calculation::class.java}")
}