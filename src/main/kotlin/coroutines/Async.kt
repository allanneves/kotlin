package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime
import kotlin.random.Random

/*
    Just like launch, except it returns a result
    In the form a Deferred (Future)
    Deferred - a future promise of a returned value
    When we need the value, we call await(), which is a blocking call and check:
         1) if the value is available, it will return immediately
         2) if the value is not available, it will pause the thread until it is
*/

fun main() {
    runBlocking {
        val deferredNumber = async { getRandomNumber() }
        val deferredTime = async { getCurrentTime() }

        doHeavyProcessing()

        println("Waiting for Values")
        val randomNumber = deferredNumber.await()
        val currentTime = deferredTime.await()

        println("$randomNumber: $currentTime")
    }
}

suspend fun getRandomNumber(): Int {
    delay(2000)
    val randomNumber = Random.nextInt(100)
    println("Returning random number $randomNumber")
    return randomNumber
}

suspend fun getCurrentTime() : String {
    delay(3000)
    val timeMessage = "The current time is: ${LocalDateTime.now()}"
    println("Returning current time message: $timeMessage")
    return timeMessage
}

suspend fun doHeavyProcessing() {
    println("Doing some heavy processing..")
    delay(5000)
}