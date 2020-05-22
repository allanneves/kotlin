package standardfunctions

fun main() {

    val clients = arrayListOf<String?>()

    while (true) {
        println("Please enter the customer name or 'Stop' to exit:")
        val customerName = readLine()
        if (customerName?.toLowerCase().equals("stop")) break

        customerName?.let {
            if (it.isEmpty()) {
                clients.add(null)
            } else {
                clients.add(it)
            }
        }
    }

    clients.forEach {
        print("Client Name Without let: ${it?.capitalize()} ")
        it?.let {
            print("---> With let: ${it.capitalize()}")
        }

        println()
    }
}