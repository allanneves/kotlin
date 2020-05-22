package scope

fun main() {
    val myLock = EncryptionLock(40)

    println("Does the key 34 unlock my lock: ${myLock.unlock(34)}")
    println("Does the key 45 unlock my lock: ${myLock.unlock(45)}")
    println("Does the key 70 unlock my lock: ${myLock.unlock(70)}")
    println("Does the key 89 unlock my lock: ${myLock.unlock(89)}")
    println("Does the key 136 unlock my lock: ${myLock.unlock(136)}")
}

class EncryptionLock(private val encryptionKey : Int) {

    public fun unlock(publicKey : Int) = encryptionFormula(publicKey) == encryptionKey

    private fun encryptionFormula(publicKey: Int) = publicKey / 2 + 5
}