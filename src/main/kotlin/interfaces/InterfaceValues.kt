package interfaces

interface ConcertHall {
    var peopleAllowed : Int// = 10 you cannot initialize values in an interface

    fun increaseCapacity(capacity : Int) {
        peopleAllowed = capacity  // However, you can update a value through a method
    }
}