package enumclasses

fun main() {
    decide(Color.BLUE)

    println("Enum: ${Temperature.FAHRENHEIT}")
    println("Name: ${Temperature.FAHRENHEIT.name}")
    println("Position: ${Temperature.FAHRENHEIT.ordinal}")
    println("Degrees: ${Temperature.FAHRENHEIT.degrees}")

    println("========================================")

    println("Enum: ${Temperature.CELSIUS}")
    println("Name: ${Temperature.CELSIUS.name}")
    println("Position: ${Temperature.CELSIUS.ordinal}")
    println("Degrees: ${Temperature.CELSIUS.degrees}")

    println("========================================")

    println("Enum: ${Temperature.KELVIN}")
    println("Name: ${Temperature.KELVIN.name}")
    println("Position: ${Temperature.KELVIN.ordinal}")
    println("Degrees: ${Temperature.KELVIN.degrees}")
}

fun decide(color: Color) {
    when (color) {
        Color.RED -> println("You chose Red")
        Color.BLUE -> println("You chose Blue")
        Color.GREEN -> println("You chose Green")
    }
}

enum class Color {
    RED,
    GREEN,
    BLUE
}

enum class Temperature(val degrees : Double) {
    CELSIUS(30.0),
    FAHRENHEIT(86.0),
    KELVIN(303.15)
}