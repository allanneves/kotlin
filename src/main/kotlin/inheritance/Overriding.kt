package inheritance

fun main() {
    val mark = Father()
    println("Mark's Hair color: ${mark.hairColor}")
    println("Mark's Native Language: ${mark.nativeLanguage}")
    mark.say("Hi!")

    val claire = Mother()
    println("Claire's Hair color: ${claire.hairColor}")
    println("Claire's Native Language: ${claire.nativeLanguage}")
    claire.say("Hi!")
}

open class Parent(val nativeLanguage: String, val gender : String) {
    open val hairColor = "Brown"

    open fun say(message : String) = println("Parent says: $message")
}

class Father : Parent("English", "Male")

class Mother : Parent("Deutsch", "Female") {
    override val hairColor: String = "Blonde"

    override fun say(message: String) {
        println("Mother says: $message")
    }
}