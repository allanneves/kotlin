package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
 A .launch() returns a Job
 A Job allows us to manipulate the coroutine lifecycle
 Live in the hierarchy of other Jobs
 Can access lifecycle variables and methods (cancel/join)
 If a Job is cancelled, all its parents and children will be cancelled too
* */

fun main() {
    runBlocking {
        val job = launch {
            delay(3000)
            println("1) Job Launched!")
        }

        job.invokeOnCompletion { println("2) Job is Completed! Either cancelled or finished") }

        delay(500)
        println("3) Job will be cancelled")
        job.cancel()
    }
}