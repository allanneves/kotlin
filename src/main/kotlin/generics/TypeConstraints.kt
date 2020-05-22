package generics

fun main() {
    val toyBoxOne = ToyBox<Doll>()
    val doll = Doll()
    toyBoxOne.pick(doll)

    val toyBoxTwo = ToyBox<Ball>()
    val ball = Ball()
    toyBoxTwo.pick(ball)

    /*
    The below will fail. Even though the method pick takes a generic parameter, the
    class has a restricted type which is the abstract class Toy
    toyBoxOne.pick(ball)
    toyBoxTwo.pick(doll)
    */

    /*
    The same happens with the code below. The class ToyBox is restricted to types
    of the abstract class Toy. The allowed types are: Toy, Doll or Ball
    val toyBoxThree = ToyBox<String>()
     */
}

abstract class Toy {
    abstract fun play()
}

class Doll : Toy() {
    override fun play() {
        println("Playing with the Doll")
    }
}

class Ball : Toy() {
    override fun play() {
        println("Playing with the Ball")
    }
}

class ToyBox<T : Toy> {
    fun pick(toy: T) {
        toy.play()
    }
}