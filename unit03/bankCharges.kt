fun main() {
    val baseFee = 10.0
    print("Enter the number of checks written this month: ")
    val numChecks = readLine()!!.toInt()
    val checkFee = when {
        numChecks < 20 -> numChecks * 0.1
        numChecks < 40 -> numChecks * 0.08
        numChecks < 60 -> numChecks * 0.06
        else -> numChecks * 0.04
    }
    val totalFee = baseFee + checkFee
    println("The bank's service fees for the month are $$totalFee")
}
