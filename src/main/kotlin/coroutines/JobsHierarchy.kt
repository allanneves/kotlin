package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val parentJob = launch {
            println("Outer Job Launched!")
            val firstChildrenJob = launch {
                println("First Children Job Launched!")
                delay(3000)
                println("First Children Job is Finishing!")
            }

            firstChildrenJob.invokeOnCompletion { println("First Children Job Completed!") }

            val secondChildrenJob = launch {
                println("Second Children Job Launched!")
                delay(3000)
                println("Second Children Job is Finishing!")
            }

            secondChildrenJob.invokeOnCompletion { println("Second Children Job Completed!") }
        }

        delay(500)
        println("Parent Job will be cancelled!")
        parentJob.cancel()
    }
}