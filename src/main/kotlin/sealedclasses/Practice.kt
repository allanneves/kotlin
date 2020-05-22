package sealedclasses

fun main() {
    when (getTool()) {
        is CarpentryTool.Chisel -> println("Chopping Out")
        is CarpentryTool.NailPuller -> println("Pulling Nails")
    }
}

fun getTool(): CarpentryTool {
    return if (System.currentTimeMillis() % 2 == 0L) {
        CarpentryTool.Chisel()
    } else {
        CarpentryTool.NailPuller()
    }
}

sealed class CarpentryTool {
    class Chisel : CarpentryTool()
    class NailPuller : CarpentryTool()
}