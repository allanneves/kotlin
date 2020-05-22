package generics

fun main() {
    val iterator = Iterator<Collection<Any>>()
    iterator.iterate(listOf(1, "Hi", 10.5, 1000, 9.99999F, Debug()))
}

class Iterator<T: Collection<Any>> {
    fun iterate(collection : T) {
        collection.forEach { println("$it ")}
    }
}

class Debug {
    override fun toString(): String {
        return "toString() method of Debug class"
    }
}