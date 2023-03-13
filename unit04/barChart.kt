fun main() {
    //constant variables
    val SALES_PER_ASTERISK = 100
    val sales = IntArray(5)

    // read the sales for each store from the user
    for (i in 0..4) {
        print("Enter today's sales for store ${i + 1}: ")
        sales[i] = readLine()?.toIntOrNull() ?: 0
    }
    println("")
    // display the sales bar chart
    println("SALES BAR CHART")
    for (i in 0..4) {
        print("Store ${i + 1}: ")
        for (j in 1..(sales[i] / SALES_PER_ASTERISK)) {
            print("*")
        }
        println()
    }
}
