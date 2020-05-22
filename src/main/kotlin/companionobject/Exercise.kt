package companionobject

fun main() {
    val oreilly = Editor("O'Reilly")
    val programmingBook = Book(oreilly)
    println(programmingBook.editor.editorName)

    val genericBook = Book(Book.getDefaultEditor())
    println(genericBook.editor.editorName)
}

class Book(val editor: Editor) {
    companion object {
        fun getDefaultEditor() = Editor("Default Editor")
    }
}

class Editor(val editorName: String)