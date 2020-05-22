package hangman

val wordsToBeGuessed = listOf("bob", "table", "dublin")
var chosenWord = ""
var letters = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0
var isCorrectGuess = false

fun main() {
    setupGame()
    playGame()
}

fun setupGame() {
    chosenWord = pickARandomWord()
    letters = fillWithUnderscore()
    printGameStatus()
}

fun playGame() {
    do {
        val userGuess = readUserGuess()
        isCorrectGuess = false
        chosenWord.indices.forEach { i ->
            if (chosenWord[i] == userGuess && !letters.contains(userGuess)) {
                letters[i] = userGuess
                isCorrectGuess = true
            }
        }

        if (!isCorrectGuess) {
            mistakes++
        }

        printGameStatus()
    } while (remainingGuesses > 0 && letters.contains('_'))

    if (isCorrectGuess) {
        printCongratulations()
    } else {
        printGameStatus()
        printGameOver()
    }
}

fun pickARandomWord() = wordsToBeGuessed.random().toUpperCase()
fun fillWithUnderscore(): ArrayList<Char> = chosenWord.indices.map { '_' }.toList() as ArrayList<Char>

fun readUserGuess(): Char {
    println("Please enter a letter:")
    remainingGuesses--
    return readLine()?.toCharArray()?.get(0)?.toUpperCase() ?: 'A'
}

fun printGameStatus() {
    when (mistakes) {
        0 -> printZeroMistakes()
        1 -> printOneMistake()
        2 -> printTwoMistakes()
        3 -> printThreeMistakes()
        4 -> printFourMistakes()
        5 -> printFiveMistakes()
        6 -> printSixMistakes()
    }

    print("Word: ")
    letters.forEach { print("$it ") }
    println()
    println("You have $remainingGuesses guess(es) left \n")
}

fun printZeroMistakes() {
    println(
        """
            |------|-
            |      | 
            |        
            |        
            |        
            |        
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printOneMistake() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |        
            |        
            |        
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printTwoMistakes() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |      |  
            |      |  
            |        
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printThreeMistakes() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |     /|  
            |      |  
            |        
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printFourMistakes() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |     /|\  
            |      |  
            |        
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printFiveMistakes() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |     /|\  
            |      |  
            |     /  
           /|\        
          / | \
          
        """
            .trimIndent()
    )
}

fun printSixMistakes() {
    println(
        """
            |------|-
            |      | 
            |      O  
            |     /|\  
            |      |  
            |     / \ 
           /|\        
          / | \
        """
            .trimIndent()
    )
}

fun printGameOver() {
    println(
        """
           ____    _    __  __ _____    _____     _______ ____  
          / ___|  / \  |  \/  | ____|  / _ \ \   / / ____|  _ \ 
         | |  _  / _ \ | |\/| |  _|   | | | \ \ / /|  _| | |_) |
         | |_| |/ ___ \| |  | | |___  | |_| |\ V / | |___|  _ < 
          \____/_/   \_\_|  |_|_____|  \___/  \_/  |_____|_| \_\
          
          The word to be guessed is $chosenWord
        """
            .trimIndent()
    )
}

fun printCongratulations() {
    println(
        """
        ____    ____  ______    __    __     ____    __    ____  ______   .__   __. 
        \   \  /   / /  __  \  |  |  |  |    \   \  /  \  /   / /  __  \  |  \ |  | 
         \   \/   / |  |  |  | |  |  |  |     \   \/    \/   / |  |  |  | |   \|  | 
          \_    _/  |  |  |  | |  |  |  |      \            /  |  |  |  | |  . `  | 
            |  |    |  `--'  | |  `--'  |       \    /\    /   |  `--'  | |  |\   | 
            |__|     \______/   \______/         \__/  \__/     \______/  |__| \__| 
        """
            .trimIndent()
    )
}