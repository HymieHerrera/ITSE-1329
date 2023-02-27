fun main() {
    print("Enter a number between 1 and 10: ")
    val number = readLine()!!.toInt()
    val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
    if (number in 1..10) {
        println("The Roman numeral version of $number is ${romanNumerals[number]}")
    } else {
        println("Error: Number must be between 1 and 10")
    }
}
