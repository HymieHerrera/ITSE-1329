fun main() {
  val min = 1
  val max = 100
  val randNum = (Math.random() * (max - min + 1)).toInt() + min

    // Number Guessing Loop.  Exits when randNum variable is guessed correctly
    println("Guess the number between 1 and 100:")
    var guess = 0
    do {
        // Get user input
        val userInput = readLine()!!.toInt()

        // Check user input against random number
        when {
            userInput < randNum -> println("Too low, try again.")
            userInput > randNum -> println("Too high, try again.")
            else -> {
                guess = 1
                println("That's right! The number was $randNum")
            }
        }
    } while (guess == 0)
}
