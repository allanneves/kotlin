package sealedclasses

fun main() {
    when (getVehicle()) {
        is Car -> println("Drive..")
        is Motorcycle -> println("Ride..")
    }
}

fun getVehicle(): Vehicle {
    return if (System.currentTimeMillis() % 2 == 0L) {
        Bmw()
    } else {
        Kawasaki()
    }
}


/*
* A sealed class can have subclasses, but all of them must be declared in the same file as the sealed class itself.
* (Before Kotlin 1.1, the rules were even more strict: classes had to be nested inside the declaration of the sealed class).
*
* https://kotlinlang.org/docs/reference/sealed-classes.html
* */
sealed class Vehicle
open class Car : Vehicle()
open class Motorcycle : Vehicle()

class Bmw : Car()
class Kawasaki : Motorcycle()

