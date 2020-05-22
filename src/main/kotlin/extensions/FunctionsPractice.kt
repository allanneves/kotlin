package extensions

import java.time.LocalDateTime

fun main() {
    val logMessage: String = "Starting Up the Application"
    val processingPower: Float = 1000F
    val cpuCores: Int = 2

    println("Log Message: ${logMessage.appendDateTime()}")
    println("Processing Power: ${processingPower.getTwentyFivePercent()}")
    println("CPU Cores: ${cpuCores.triple()}")

    println(3.getAppName())
    println(2.5.getAppName())
    println("Hello".getAppName())
}

fun String.appendDateTime() = "$this - ${LocalDateTime.now()}"
fun Float.getTwentyFivePercent(): Float = this * 0.25F
fun Int.triple() = this * 3
fun Any.getAppName() = "My App"