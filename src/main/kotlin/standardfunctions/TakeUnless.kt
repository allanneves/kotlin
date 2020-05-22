package standardfunctions

fun main() {
    val names = listOf("Michael", "Laura", "John", "Richard")
    val selectedNames = arrayListOf<String?>()

    names.forEach {
        val anythingButLaura = it.takeUnless { it == "Laura" }
        println("Variable should be null: $anythingButLaura")
        selectedNames.add(anythingButLaura)
    }

    println("Selected Names: $selectedNames")
}