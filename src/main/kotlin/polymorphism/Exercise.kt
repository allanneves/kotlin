package polymorphism

fun main() {
    val tv = TV()
    tv.tune(10)
    tv.tune(5, true)
    tv.tune(19, false, "2020-04-28 11:00:00", "2020-04-29 18:00:00")
}

class TV {
    fun tune(channel: Int) {
        println("Playing channel $channel")
    }

    fun tune(channel : Int, enableInformation : Boolean) {
        if (enableInformation) println("Playing channel $channel with subtitles and channel info.") else tune(channel)
    }

    fun tune(channel: Int, enableInformation: Boolean, startDate: String, endDate: String) {
        println("Showing programs that are avaible between $startDate and $endDate")
        tune(channel, enableInformation)
    }
}