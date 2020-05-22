package casting

import kotlin.random.Random

fun main() {
    val fileName = "content.txt"

    for (i in 1..5) {
        print("Attempt $i: ")
        val networkService: NetworkService = getNetworkService()
        (networkService as? FTPService)
            ?.transferFile(fileName)
            ?:println("We want to transfer the file through FTP only")
    }
}

abstract class NetworkService {
    abstract fun transferFile(file: String)
}

class FTPService : NetworkService() {
    override fun transferFile(file: String) {
        println("Transferring $file file via FTP")
    }
}

class HTTPService : NetworkService() {
    override fun transferFile(file: String) {
        println("Transferring $file file via HTTP")
    }
}

fun getNetworkService(): NetworkService {
    return if (Random.nextInt() % 2 == 0) {
        FTPService()
    } else {
        HTTPService()
    }
}