fun main() {
  val min = 1
  val max = 100
  val randNum = (Math.random() * (max - min + 1)).toInt() + min
  var guessCounter: Int = 0


    // Ask the user to guess the number
    println("Guess the number between 1 and 100:")
    var guess = 0
    do {
        // Get user input
        val userInput = readLine()!!.toInt()
        guessCounter++

        // Check user input against random number
        when {
            userInput < randNum -> println("Too low, try again.")
            userInput > randNum -> println("Too high, try again.")
            else -> {
                guess = 1
                println("That's right! The number was $randNum you guessed it in $guessCounter tries,")
            }
        }
    } while (guess == 0)
}
