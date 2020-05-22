package casting

fun main() {
    val tvs = listOf(Samsung(), Sony())
    tvSwitcher(tvs)
}

interface TV {
    fun switchOn()
    fun switchOff()
}

class Samsung : TV {
    override fun switchOn() {
        println("Samsung TV : Switching On")
    }

    fun switchOnVoiceCommand() {
        println("Samsung TV: Switching On Voice Command")
    }

    override fun switchOff() {
        println("Samsung TV: Switching Off")
    }
}

class Sony : TV {
    override fun switchOn() {
        println("Sony TV: Switching On")
    }

    fun switchOnGoogleAssistant() {
        println("Sony TV: Switching On Google Assistant")
    }

    override fun switchOff() {
        println("Sony TV: Switching Off")
    }
}

fun tvSwitcher(tvs: List<TV>) {
    tvs.forEach {
        it.switchOn()

        (it as? Sony)?.switchOnGoogleAssistant()
        (it as? Samsung)?.switchOnVoiceCommand()

        it.switchOff()
    }
}