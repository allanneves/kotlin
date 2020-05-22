package tictactoe

import kotlin.random.Random

var gameBoard = arrayListOf<ArrayList<String>>()

fun main() {
    for (i in 0..2) {
        val row = arrayListOf<String>()
        for (j in 0..2) {
            row.add(" ")
        }
        gameBoard.add(row)
    }

    printCurrentBoard()

    var continueGame = true
    do {
        println("Please enter a position (e.g. 1, 1)")
        val input = readLine() ?: ""
        var x = 0
        var y = 0

        try {
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()
            var skipRound = false

            if (gameBoard[x - 1][y - 1] != " ") {
                println("That position is already taken, try again")
                skipRound = true
            } else {
                gameBoard[x - 1][y - 1] = "X"
                printCurrentBoard()
            }

            if (!skipRound) {
                val playerWon = checkWinner(true)
                if (playerWon) {
                    println("\uD83C\uDF7E \uD83C\uDF8A \uD83C\uDF89 \uD83C\uDF7E \uD83C\uDF8A \uD83C\uDF89")
                    println("You won! Congratulations!")
                    continueGame = false
                }

                val boardFull = checkBoardFull()
                if (!playerWon && boardFull) {
                    println("It's a tie!")
                    continueGame = false
                }

                if (continueGame) {
                    placeComputerMove()
                    printCurrentBoard()
                    val computerWon = checkWinner(false)
                    if (computerWon) {
                        println("Computer Won!")
                        continueGame = false
                    }
                }
            }
        } catch (e: Exception) {
            println("Invalid input, please try again")
        }
    } while (continueGame)
}

fun checkWinner(player: Boolean): Boolean {
    var won = false
    val checkSymbol = if (player) "X" else "O"

    for (i in 0..2) {
        // Horizontal Wins
        if (gameBoard[i][0] == checkSymbol && gameBoard[i][1] == checkSymbol && gameBoard[i][2] == checkSymbol) {
            won = true
            break
        }

        //Vertical Wins
        if (gameBoard[0][i] == checkSymbol && gameBoard[1][i] == checkSymbol && gameBoard[2][i] == checkSymbol) {
            won = true
            break
        }
    }

    //Diagonal Wins
    if (gameBoard[0][0] == checkSymbol && gameBoard[1][1] == checkSymbol && gameBoard[2][2] == checkSymbol) {
        won = true
    }

    if (gameBoard[2][0] == checkSymbol && gameBoard[1][1] == checkSymbol && gameBoard[0][2] == checkSymbol) {
        won = true
    }

    return won
}

fun checkBoardFull() : Boolean {
    var boardFull = true

    for (i in 0..2) {
        for (j in 0..2) {
            if (gameBoard[i][j] == " ") {
                boardFull = false
                break
            }
        }
    }

    return boardFull
}

fun placeComputerMove() {
    var i = 0
    var j = 0

    do {
        j = Random.nextInt(3)
        i = Random.nextInt(3)

    } while (gameBoard[i][j] != " ")

    gameBoard[i][j] = "O"
}

fun printCurrentBoard() {
    println("-------------")
    for (i in 0..2) {
        for (j in 0..2) {
            when (gameBoard[i][j]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}
