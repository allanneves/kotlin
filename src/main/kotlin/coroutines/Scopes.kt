package coroutines

import kotlinx.coroutines.*

fun main() {
    println("1) The code below will block the execution")

    runBlocking {
        launch {
            delay(5000)
            println("2) RunBlocking creates a scope and runs a coroutine in a blocking way.")
        }

        GlobalScope.launch {
            delay(8000)
            println("3) GlobalScope is the scope of a coroutine of the entire application. It's not used very often. If running in the background," +
                    "it will just stop when the application stops.")
        }

        coroutineScope {
            delay(10000)
            println("4) CoroutineScope creates a new scope and does not complete until all children coroutines complete")
        }
    }

    println("5) Program execution will now continue")
}