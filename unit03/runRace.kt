fun main() {
    println("Enter the names of three runners, and their run times!")
    print("Enter the name of the first runner: ")
    val name1 = readLine()!!
    print("How long did it take for $name1 (in minutes) to finish the race: ")
    val time1 = readLine()!!.toDouble()
    print("Enter the name of the second runner: ")
    val name2 = readLine()!!
    print("How long did it take for $name2 (in minutes) to finish the race: ")
    val time2 = readLine()!!.toDouble()
    print("Enter the name of the third runner: ")
    val name3 = readLine()!!
    print("How long did it take for $name3 (in minutes) to finish the race: ")
    val time3 = readLine()!!.toDouble()
    val runners = listOf("$name1:$time1", "$name2:$time2", "$name3:$time3")
    val sortedRunners = runners.sortedBy { it.split(":")[1].toDouble() }
    println("From the top of the race order to last the finish was:")
    for ((index, runner) in sortedRunners.withIndex()) {
        val name = runner.split(":")[0]
        val time = runner.split(":")[1]
        println("${index + 1}. $name finished in $time minutes")
    }
}
