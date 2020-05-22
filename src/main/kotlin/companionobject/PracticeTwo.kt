package companionobject

import kotlin.random.Random

fun main() {
    val correctKey = Lock.createKey()
    val lock = Lock(correctKey)
    lock.unlock(correctKey)

    val fakeKey = Lock.createKey()
    lock.unlock(fakeKey)
}

class Lock(key: Key) {
    private val secretCode: String

    init {
        this.secretCode = generateSecretCode()
        key.secretCode = this.secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun unlock(key: Key) {
        if (this.secretCode == key.secretCode) {
            println("Lock is Open!")
        } else {
            println("Key cannot unlock it!")
        }
    }

    private fun generateSecretCode(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }
}

class Key {
    var secretCode: String = ""
        set(value) {
            // guarantee that it will be set just once
            if (field == "") field = value
        }
}