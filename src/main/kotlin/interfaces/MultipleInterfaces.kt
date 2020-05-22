package interfaces

fun main() {
    val weekendPlayer = SportEnthusiast()
    weekendPlayer.jump()
    weekendPlayer.tackle()
    weekendPlayer.kick()
    weekendPlayer.run()
}

interface PlayFootball {
    fun kick()
    fun run()
}

interface PlayRugby {
    fun jump()
    fun tackle()
}

class SportEnthusiast : PlayRugby, PlayFootball {
    override fun kick() {
        println("Kicking any ball...")
    }

    override fun run() {
        println("Running the Rugby and Football pitches...")
    }

    override fun jump() {
        println("Jumping to head the football or catch the rugby ball...")
    }

    override fun tackle() {
        println("Tackling in Rugby and Committing a foul in Football...")
    }

}