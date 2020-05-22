package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
Functions that can be run in a coroutine
Make callbacks seamless
*/

var anyVariableInTheApp = 0

fun main() {
    GlobalScope.launch { completeMessage()}
    GlobalScope.launch { improveMessage()}
    print("Hello, ")
    Thread.sleep(2000)
    println("There have been $anyVariableInTheApp calls so far!")
}

suspend fun completeMessage() {
    delay(500)
    println("World!")

    // No need for waiting between threads, synchronization or semaphores.
    // The coroutine will access the variable from another thread seamlessly
    anyVariableInTheApp++
}

suspend fun improveMessage() {
    delay(1000)
    println("Suspend functions are cool!")
    anyVariableInTheApp++
}