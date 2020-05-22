package coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/*
Scope - Creates, Runs and Provides Coroutines lifecycle events
Context - the Scope provides a Context in which the Coroutine runs
Suspending Functions - Functions that can be run in a coroutine (can be suspended)
Jobs - a handle on a coroutine
Deferred - a future result of a coroutine
Dispatcher - manages which thread(s) the coroutine runs on
Error Handling
* */


fun main() {
    GlobalScope.launch {
        delay(3000)
        println("World!")
        println("Thread 1")
    }

    print("Hello, ")
    Thread.sleep(5000)
    println("Thread 2")
}