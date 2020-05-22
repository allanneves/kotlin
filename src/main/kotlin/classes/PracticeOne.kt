package classes

fun main() {
    val leopard = Animal()
    val rhino = Animal()

    leopard.name = "Leopard"

    rhino.name = "Rhino"
    rhino.topSpeed = 5

    leopard.run()
    rhino.run()

    leopard.topSpeed = 100
    rhino.topSpeed = 33

    leopard.run()
    rhino.run()
}

class Animal {
    var name = ""
    var topSpeed = 20

    fun run() {
        println("A $name can run at $topSpeed km/h")
    }
}