package coroutines

import kotlinx.coroutines.*

/*
    Exception behaviour depends on the coroutine builder
    - Launch
        - Propagates through the parent child hierarchy
        - The exception will be thrown immediately and jobs will fail
        - Use try-catch or an exception handler
    - Async
        - Exceptions are deferred until the result is consumed
        - If the result is not consumed, the exception is never thrown
        - Try-catch in the coroutine or in the await() call
*/

fun main() {
    exceptionInLaunchOperator()
    exceptionInAsync()
}

fun exceptionInLaunchOperator() {
    runBlocking {
        val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
            println("Exception Handled: ${throwable.localizedMessage}")
        }

        val job = GlobalScope.launch(exceptionHandler) {
            println("Throwing Exception from Job")
            throw IndexOutOfBoundsException("Exception in Coroutine")
        }

        job.join()
    }
}

fun exceptionInAsync() {
    runBlocking {
        val deferred = GlobalScope.async {
            println("Throwing Exception from Async")
            throw ArithmeticException("Exception in Async")
        }

        try {
            deferred.await()
        } catch (e: ArithmeticException) {
            println("Handled ArithmeticException: ${e.localizedMessage}")
        }
    }

}