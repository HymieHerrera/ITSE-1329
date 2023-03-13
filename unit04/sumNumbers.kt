fun main() {
    print("Enter number between 1 and 50: ")
    val num = readLine()!!.toInt()

    if (num > 0 && num < 51) {
        var sum = 0
        for (i in 1..num) {
            sum += i
        }
        println("The total is $sum")
    } else {
        println("Invalid! Please enter a positive nonzero integer.")
    }
}
