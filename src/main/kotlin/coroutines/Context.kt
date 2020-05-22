package coroutines

import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
A set of data that relates to the coroutine
All coroutines have an associated context
Important elements of a context:
   - Dispatcher: which thread the coroutine is run on
   - Job: handle on the coroutine lifecycle
*/

fun main() {
    runBlocking {
        launch(CoroutineName("firstCoroutine")) {
            println("This is run from ${this.coroutineContext[CoroutineName.Key]}")
        }
    }
}