package objects

/* Kotlin objects represent a single instance of that particular object (singleton)
   It is similar to having a static class in Java. One and only one object will be instantiated.
 */

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from the database")
    }
}

fun main() {
    DatabaseAccess.disconnect()

    if (DatabaseAccess.connected) {
        println("You are connected to the Database!")
    } else {
        println("You are disconnected, connecting now...")
        DatabaseAccess.connect()
    }
}