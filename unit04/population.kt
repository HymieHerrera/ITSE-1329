fun main() {
    print("Enter the starting number of organisms: ")
    var numOrg = readLine()?.toIntOrNull()

    while (numOrg == null || numOrg < 2) {
        println("Invalid input. Please enter a number greater than or equal to 2.")
        print("Enter the starting number of organisms: ")
        numOrg = readLine()?.toIntOrNull()
    }

    print("Enter the average daily population increase (as a percentage): ")
    var dailyInc = readLine()?.toDoubleOrNull()

    while (dailyInc == null || dailyInc < 0) {
        println("Please enter a positive number.")
        print("Enter the average daily population increase (as a percentage): ")
        dailyInc = readLine()?.toDoubleOrNull()
    }

    print("Enter the number of days they will increase by: ")
    var numDays = readLine()?.toIntOrNull()

    while (numDays == null || numDays < 1) {
        println("Please enter a number greater than 0.")
        print("Enter the number of days they will multiply: ")
        numDays = readLine()?.toIntOrNull()
    }

    var population = numOrg
    println("The starting size of the population: $population")

    for (day in 2..numDays) {
        population += (dailyInc / 100 * population).toInt()
        println("The population after $day days is: $population")
    }
}
