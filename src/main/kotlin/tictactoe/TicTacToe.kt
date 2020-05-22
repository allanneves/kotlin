package tictactoe

const val boardRows = 5
const val boardColumns = 9
var board = Array(boardRows) { Array(boardColumns) { ' ' } }
var playableRows = arrayListOf(0, 2, 4)
var playableColumns = arrayListOf(0, 4, 8)
var turns = playableColumns.size * playableRows.size
val firstDiagonal = listOf(Pair(0, 0), Pair(2, 4), Pair(4, 8))
val secondDiagonal = listOf(Pair(0, 8), Pair(2, 4), Pair(4, 0))
var currentPosition = Pair(0, 0)
var currentUserSymbol = '@'

fun main() {
    setupBoard()
    playGame()
}

fun playGame() {
    while (!hasWinner() && turns > 0) {
        userTurn()
        machineTurn()
    }

    if (currentUserSymbol == 'X') {
        println("You win")
    } else {
        println("You lose")
    }
}

fun hasWinner(): Boolean {
    return isARowVictory() || isAColumnVictory() || isADiagonalVictory()
}

fun isARowVictory(): Boolean {
    val currentRow = currentPosition.first
    return playableColumns.filter { board[currentRow][it] == currentUserSymbol }.size == 3
}

fun isAColumnVictory(): Boolean {
    val currentColumn = currentPosition.second
    return playableRows.filter { board[it][currentColumn] == currentUserSymbol }.size == 3
}

fun isADiagonalVictory(): Boolean {
    val isFirstAVictory = firstDiagonal.filter { board[it.first][it.second] == currentUserSymbol }.size == 3
    val isSecondAVictory = secondDiagonal.filter { board[it.first][it.second] == currentUserSymbol }.size == 3
    return isFirstAVictory || isSecondAVictory
}

fun userTurn() {
    var validMove = false

    while (!validMove) {
        println("Please type the row number: ")
        val row = readLine()?.toInt() ?: 0

        println("Please type the column number: ")
        val column = readLine()?.toInt() ?: 0

        if (playableRows.contains(row) && playableColumns.contains(column)) {
            if (board[row][column] == ' ') {
                board[row][column] = 'X'
                currentPosition = Pair(row, column)
                currentUserSymbol = 'X'
                turns--
                validMove = true
            } else {
                println("Invalid move. You have to use an empty position")
            }
        } else {
            println("Your choice is out of the game scope. Type a valid empty position")
        }
    }

    printBoard()

}

fun machineTurn() {
    var validMove = false
    while (!validMove) {
        val randomRow = playableRows.random()
        val randomColumn = playableColumns.random()
        if (board[randomRow][randomColumn] == ' ') {
            board[randomRow][randomColumn] = 'O'
            currentPosition = Pair(randomRow, randomColumn)
            currentUserSymbol = 'O'
            turns--
            validMove = true
        }
    }

    printBoard()
}

fun printBoard() {
    for (row in board) {
        for (column in row) {
            print(column)
        }
        println()
    }

    print("\n\n")
}

fun setupBoard() {
    for (row in 0 until boardRows) {
        for (column in 0 until boardColumns) {
            if (row == 1 || row == 3) {
                board[row][column] = '-'
            } else when (column) {
                2, 6 -> board[row][column] = '|'
            }
        }
    }

    printExampleBoard()
}

fun printExampleBoard() {
    println(
        """
            Welcome to Tic-Tac-Toe.
            To play, you have to enter the coordinates of your choice as exemplified below:
             
            [0,0] | [0,4] | [0,8]
            -----   -----   -----
            [2,0] | [2,4] | [2,8]
            -----   -----   -----
            [4,0] | [4,4] | [4,8]
            
            You will be identified by 'X' and the machine by 'O'
            
        """.trimIndent()
    )

    println()
}