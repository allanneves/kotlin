package basics

fun main() {

    println(true && true)
    println(true && false)

    println(true || false)
    println(false || true)
    println(false || false)

    println(!true)
    println(!false)

    val toys = 2
    val brokenToys = 1
    val notBrokenToys = toys - brokenToys

    val canGetNewToy = toys < 5 && notBrokenToys >= 1
    println("Will the child get a new toy? $canGetNewToy")

    val numberOfCows = 3
    val cowProducesMilk = 0

    val numberOfChildren = 0
    val familyMembers = numberOfChildren + 1

    val canReceiveFunding = ((numberOfCows <= 5) && (cowProducesMilk > 0)) || (familyMembers >= 3)
    println("Will the family receive funding? $canReceiveFunding")

}