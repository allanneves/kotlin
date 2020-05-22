package sealedclasses

import kotlin.random.Random

fun main() {
    when (getLotteryPrize()) {
        is SportsCar -> println("You won a Sports Car!")
        is Holiday -> println("You won a Holiday!")
        is GiftCard -> println("You won a Gift Card!")
    }
}

fun getLotteryPrize(): LotteryPrize {
    return when (Random.nextInt(3)) {
        0 -> Maserati()
        1 -> FranceHoliday()
        else -> TenDollars()
    }
}

sealed class LotteryPrize
sealed class SportsCar : LotteryPrize()
sealed class Holiday : LotteryPrize()
sealed class GiftCard : LotteryPrize()

class Maserati : SportsCar()
class FranceHoliday : Holiday()
class TenDollars : GiftCard()