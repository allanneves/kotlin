package basics

fun main(args: Array<String>) {
    val cats = 3 //Int
    val longCats = cats.toLong() //Long

    println("cats remain Int: ${cats::class.java}")
    println("longCats have the conversion assigned to it : ${longCats::class.java}")

    val dogs = 5
    val byteDogs = dogs.toByte()
    println("byteDogs = ${byteDogs::class.java}")

    val floatDogs = dogs.toFloat()
    println("floatDogs = ${floatDogs::class.java}")

    val people = 750000000000
    val peopleBug = people.toInt()

    // Converting a larger variable into a smaller variable will lead to data corruption
    println("people = ${people::class.java}  value = $people")
    println("peopleBug = ${peopleBug::class.java}  value = $peopleBug")

    // Any variable of any type can be converted into a String in Kotlin
    val integer = 10
    val float = 32F
    val double = 9090.1

    println("integer = ${integer::class.java}")
    println("float = ${float::class.java}")
    println("double = ${double::class.java}")

    val convertedInteger = integer.toString()
    val convertedFloat = float.toString()
    val convertedDouble = double.toString()

    println("convertedInteger = ${convertedInteger::class.java}")
    println("convertedFloat = ${convertedFloat::class.java}")
    println("convertedDouble = ${convertedDouble::class.java}")

    println()
    println()

    println("Enter a number between 0 and 128 that will be converted to different types (press \"q\" to exit:")
    var input = readLine()?:"q"
    while (input != "q") {
        val inputByte = input.toByte()
        val inputShort = input.toShort()
        val inputInt = input.toInt()
        val inputLong = input.toLong()
        val inputFloat = input.toFloat()
        val inputDouble = input.toDouble()

        println("""
            inputByte value: $inputByte - type: ${inputByte::class.java}
            inputShort value: $inputShort - type: ${inputShort::class.java}
            inputInt value: $inputInt - type: ${inputInt::class.java}
            inputLong value: $inputLong - type: ${inputLong::class.java}
            inputFloat value: $inputFloat - type: ${inputFloat::class.java}
            inputDouble value: $inputDouble - type: ${inputDouble::class.java}
        """.trimIndent())

        input = readLine()?:"q"
    }

    val pi = 4.14159
    println("pi - type: ${pi::class.java} - value: $pi")

    val piFloat = pi.toFloat()
    println("piFloat - type: ${piFloat::class.java} - value: $piFloat")

    val piInt = pi.toInt()
    println("piInt - type: ${piInt::class.java} - value: $piInt")

    val piString = pi.toString()
    println("piString = ${piString::class.java} - value: $piString")

    println("Enter a Double:")
    val doubleNumber = readLine()?:""
    val newPi = 3.14159
    val result = doubleNumber.toDouble() * newPi
    println("$result is a ${result::class.java}")

}