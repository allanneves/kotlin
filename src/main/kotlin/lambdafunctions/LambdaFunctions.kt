package lambdafunctions


fun displayNameFunction(name: String) {
    println("Hello $name")
}

val displayNameLambda = { name: String -> println("Hello $name") }