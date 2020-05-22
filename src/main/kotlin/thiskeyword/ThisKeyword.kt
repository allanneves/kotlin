package thiskeyword

fun main() {
    val note = PostItNote()
    note.printMessage()
    note.updateMessage("Meeting at 5")
    note.printMessage()
}

class PostItNote() {
    private var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(this.message)
    }
}