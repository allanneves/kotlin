package interfaces

fun main() {
    val child = Child()
    child.raisePet()
}

interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun feed()
}

class Kitten : Pet {
    override var cutenessLevel = 10

    override fun startPlaying() {
        println("Running, jumping, meowing")
    }

    override fun feed() {
        println("Give Kitten treats")
    }
}

class Child {
    private val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
            pet.feed()
        }
    }
}

class PetStore {
    fun getPet(): Pet {
        return Kitten()
    }
}