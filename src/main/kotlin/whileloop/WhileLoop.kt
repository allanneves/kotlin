package whileloop

fun main() {

    val puzzlePieces = 20
    var piecesPlaced = 1
    while (piecesPlaced <= puzzlePieces) {
        println("While / Placing piece number $piecesPlaced")
        piecesPlaced++
    }

    piecesPlaced = 1
    do {
        println("Do While / Placing piece number $piecesPlaced")
        piecesPlaced++
    } while (piecesPlaced <= puzzlePieces)

    val cats = listOf("Tigger", "Smokey", "Sassy", "Patch", "Sammy")
    var count = 0;
    while (count < cats.size) {
        println("Hello ${cats[count]}")
        count++
    }

    println("Enter a number to calculate its factorial:")
    val userInput = readLine() ?: "0"
    var number = userInput.toInt()
    var result = 1L
    while (number > 0) {
        result *= number
        number--
    }
    println("The factorial of $userInput is $result")

    println("Please enter a large integer number:")
    var userInt = readLine()?.toInt()?:0
    while (userInt >= 0) {
        if (userInt % 7 == 0) print("$userInt ")
        userInt--
    }

    print("\n\n")

    var row = 0
    var column = 0
    val matrixSize = 10
    while(row < matrixSize) {
        while (column < matrixSize) {
            print("$row,$column\t\t")
            column++
        }
        row++
        column = 0
        println()
    }
}