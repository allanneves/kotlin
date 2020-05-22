package enumclasses

fun main() {
    val olympics = Olympics()

    println("You finished first and won a ${olympics.getMedal(1)} medal.")
    println("You finished second and won a ${olympics.getMedal(2)} medal.")
    println("You finished third and won a ${olympics.getMedal(3)} medal.")
    println("You finished seventh and won ${olympics.getMedal(7)} medals.")
    println("=================================================================")
    println("You won the gold medal by finishing ${olympics.getPositionFromMedal(Medal.GOLD)}st")
    println("You won the silver medal by finishing ${olympics.getPositionFromMedal(Medal.SILVER)}nd")
    println("You won the bronze medal by finishing ${olympics.getPositionFromMedal(Medal.BRONZE)}rd")
    println("You won ${olympics.getPositionFromMedal(Medal.NO)} medals.")
}

class Olympics {
    fun getMedal(position: Int) : Medal {
        return when(position) {
            1 -> Medal.GOLD
            2 -> Medal.SILVER
            3 -> Medal.BRONZE
            else -> Medal.NO
        }
    }

    fun getPositionFromMedal(medal: Medal) : String {
        return when (medal) {
            Medal.NO -> "zero"
            else -> medal.place.toString()
        }
    }
}

enum class Medal(val place: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NO(4)
}