package casting

import extensions.printHorizontalLine

fun main() {
    val cat: Cat = Cat()

    /* Upcasting happens here. We are casting from a more specialized to a less specialized class.
    We explicitly say that the animal is of type Animal but we could've omitted that as the compiled knows it */
    var someAnimal: Animal = cat

    /* Even though the explicitly said that animal is a cat, the upcast hides the specialized implementation.
    That means that we cannot call the meow method in animal:
    animal.meow() */
    someAnimal.eat()

    val dog: Dog = Dog()
    someAnimal = dog
    someAnimal.eat()

    String.printHorizontalLine()

    /* Both cat and dog are polymorphic, meaning that they represent an animal. Thus, due to polymorphism
    we can call the feed() method in AnimalFeeder without worrying about the specific type. An upcast happens
    here to guarantee that only the type Animal is being passed to feed() */
    AnimalFeeder.feed(listOf(cat, dog))

    /* All Objects are polymorphic because each one inherits from Any at least.*/
    String.printHorizontalLine()

    /* What if we want to have the Animal (superclass) to run a method of a Bear (subclass)? We have to cast it */
    val otherAnimal: Animal = Bear()
    (otherAnimal as Bear).growl()

    String.printHorizontalLine()

    /* Be careful with ClassCastException. Above, we assigned the instance of Bear to 'otherAnimal',
       we then cast it to Bear as the compiler knows that 'Animal' doesn't contain the method growl. We could
       cast 'otherAnimal' to a different Animal, the compiler wouldn't have complained, and a ClassCastException
       would have been thrown only in Runtime as shown below.*/
    try {
        (otherAnimal as Cat)
    } catch (e: ClassCastException) {
        println("Catching a ClassCastException")
    }

    String.printHorizontalLine()

    /* As a rule of thumb, always check for the type before downcasting an object in order to avoid Runtime Exceptions*/
    if (otherAnimal is Cat) {
        otherAnimal.meow()
    } else {
        println("Cannot cast animal to Cat. Current type: ${otherAnimal.javaClass}")
    }

    String.printHorizontalLine()

    /* In Kotlin we can use the as? operator to assign a value to 'bird' only if 'otherAnimal' can be converted to 'Bird'.
       This is really powerful when combined with the Elvis Operator as we can avoid the Exception and have a second action
       in case the conversion fails. */
    val bird = otherAnimal as? Bird
    bird?.chirp() ?: println("Animal is not a bird so we don't do anything. It also does not throw a ClassCastException")
}

abstract class Animal {
    abstract fun eat()
}

class Cat : Animal() {
    override fun eat() {
        println("The cat is eating!")
    }

    fun meow() {
        println("Meow!")
    }
}

class Dog : Animal() {
    override fun eat() {
        println("The dog is eating!")
    }
}

class Bear : Animal() {
    override fun eat() {
        println("The bear is eating!")
    }

    fun growl() {
        println("G-r-r-r-r-r-r-r-r!")
    }
}

class Bird : Animal() {
    override fun eat() {
        println("The bird is eating!")
    }

    fun chirp() {
        println("Chirping!")
    }
}

sealed class AnimalFeeder {
    companion object {
        fun feed(animals: List<Animal>) {
            animals.forEach { it.eat() }
        }
    }
}