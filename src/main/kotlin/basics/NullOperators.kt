package basics

fun main() {

    var carName: String? = "Fiesta"
    carName = null // OK

    var carBrand = "Ford"
    // carBrand = null // Compilation error

    // the below will always return the string length
    // since cityName is certainly not null
    val cityName = "Austin"
    println(cityName.length)

    // returns either null if stateName is null or
    // the actual string length
    var stateName :String? = "Texas"
    println(stateName?.length)
    stateName = null
    println(stateName?.length)

    // Operations can be chained
    println(stateName?.length?.toString())

    // stateName?.length = null
    // therefore
    // stateName?.length?.toString() = null

    /*
    * Operation            Non-null Operator       Replacement Method
    * -------------------------------------------------------------------
    * Addition                   +                      ?.plus()
    * Subtraction                -                      ?.minus()
    * Multiplication             *                      ?.times()
    * Division                   /                      ?.div()
    * Remainder                  %                      ?.rem()
    *
    * */
    val number :Int? = 10
    println(number?.plus(3))   // 13
    println(number?.minus(3))  // 7
    println(number?.times(3))  // 30
    println(number?.div(3))    // 3
    println(number?.rem(3))    // 1

    var tvModel:String? = "Samsung"
    println("tv model: ${tvModel?.substring(3,6)}")

    var averagePrice:Double? = 3.5
    var priceInSixMonths = averagePrice?.times(6)?.toFloat()
    println("princeInSixMonths: $priceInSixMonths of type ${priceInSixMonths!!::class.java}")

    println("Enter your Name:")
    var username = readLine()
    println("This is the length of your name: ${username?.length}")

    println("Type an number with a decimal value:")
    val userInput = readLine()
    val result = userInput?.toDouble()?.times(7)?.toString()
    println("Here is your result: $result and this is the length of that String: ${result?.length}")
}