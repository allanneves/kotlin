package abstraction

fun main() {
    val pug : Dog = Pug()
    val basset : Dog = BassetHound()
    val chihuahua : Dog = Chihuahua()

    listOf(pug, basset, chihuahua).forEach {
        it.canBark()
        it.canPlay()
        it.canRun()
        println(it.name)
        println("============")
    }
}

abstract class Dog {
    abstract fun canRun() : Boolean
    abstract fun canBark() : Boolean
    abstract fun canPlay() : Boolean

    val name: String
    constructor(name : String) {
        this.name = name
    }
}

class Pug : Dog("Pug") {
    override fun canRun(): Boolean {
        println("A Pug can Run")
        return true
    }

    override fun canBark(): Boolean {
        println("A Pug CANNOT Bark")
        return false
    }

    override fun canPlay(): Boolean {
        println("A Pug can Play")
        return true
    }
}

class BassetHound : Dog("Basset") {
    override fun canRun(): Boolean {
        println("A Basset CANNOT Run")
        return false
    }

    override fun canBark(): Boolean {
        println("A Basset can Bark")
        return true
    }

    override fun canPlay(): Boolean {
        println("A Basset can Play")
        return true
    }
}

class Chihuahua : Dog("Chihuahua") {
    override fun canRun(): Boolean {
        println("A Chihuahua can Run")
        return true
    }

    override fun canBark(): Boolean {
        println("A Chihuahua can Bark")
        return true
    }

    override fun canPlay(): Boolean {
        println("A Chihuahua CANNOT Play")
        return false
    }
}