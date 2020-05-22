package lateinit

fun main() {

    /* lateinit allows us to create variables without initializing them, as we do in Java. It is a promise that we will
       initialize them later. It is better used on dependency injection and unit tests and generally speaking
       we should avoid using it in simple programs without a specific reason.*/
    lateinit var initializeLater: String
    initializeLater = initializeFunction()
    println(initializeLater)

    /* An Exception will be thrown If we fail to initialize the variable */
    lateinit var failToInitialize:String
    println(failToInitialize)
}

fun initializeFunction(): String {
    return "Initialization Logic!"
}