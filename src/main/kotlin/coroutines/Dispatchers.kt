package coroutines

import kotlinx.coroutines.*

/*
    A dispatcher determines which thread or thread pool the coroutine runs on.
    Different dispatchers are available depending on the task specificity.

    Common Dispatchers:
      1) Main:
            - Main thread update in UI driven applications (e.g. Android)
            - Main dispatcher needs to be defined in Gradle
      2) Default:
            - Useful for CPU intensive work
      3) IO:
            - Useful for network communication or reading/writing files
      4) Unconfined:
            - Starts the coroutine in the inherited dispatcher that called it
      5) newSingleThreadContext("MyThread")
            - Forces creation of a new thread
*/

fun main() {
    runBlocking {
        /*
        - The below won't run if we don't provide the dependency in Gradle:
        launch(Dispatchers.Main) {
            println("Main dispatcher. Thread: ${Thread.currentThread().name}")
        }
        */

        launch(Dispatchers.Unconfined) {
            println("::Unconfined1::${Thread.currentThread().name}")
            delay(100)
            println("::Unconfined2::${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default) {
            println("::Default::${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO) {
            println("::IO::${Thread.currentThread().name}")
        }

        launch(newSingleThreadContext("Custom Thread")) {
            println("::newSingleThreadContext::${Thread.currentThread().name}")
        }
    }
}