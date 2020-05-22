package polymorphism

fun main() {
    val translator = Translator()
    translator.sayHello()
    translator.sayHello("ch")
    translator.sayHello("fr")
    translator.sayHello("de")
}

class Translator {
    fun sayHello() {
        println("English: Hello!")
    }

    fun sayHello(language: String) {
        when (language) {
            "fr" -> println("French: Bonjour!")
            "ch" -> println("Chinese: Ni Hao!")
            else -> println("Language not found!")
        }
    }
}