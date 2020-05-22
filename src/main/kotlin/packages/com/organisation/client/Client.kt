package packages.com.organisation.client

import packages.com.organisation.hello.sayHi

fun getName() {
    println("Please enter your name:")
    val name = readLine()?:""
    sayHi(name)
}