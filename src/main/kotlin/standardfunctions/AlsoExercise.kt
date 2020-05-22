package standardfunctions

fun main() {
    val motorcycle = Motorcycle("Kawasaki", "Z750")
        .apply {
            buildMotorcycle()
        }.also {
            println("Notifying the Police that the ${it.manufacturer} Motorcycle has been built..")
        }

    motorcycle.ride()
}

class Motorcycle(val manufacturer: String, val model: String) {

    fun buildMotorcycle() {
        println("Building Motorcycle..")
    }

    fun ride() {
        println("Riding a $manufacturer $model..")
    }
}