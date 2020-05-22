package standardfunctions

fun main() {
    val clients = listOf("John", "Alan", "Aaron", "Michael", "Robert")
    val clientsNotStartingWithA = arrayListOf<String>()

    clients.forEach { client ->
            client.takeUnless {
                client.toLowerCase().startsWith("a")
            }?.let {
                clientsNotStartingWithA.add(client)
            }
        }

    println("Clients not starting with A: $clientsNotStartingWithA")
}