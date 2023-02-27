fun main() {
    println("Enter three names, and I'll alphabatize them!")
    print("Enter the first name: ")
    val name1 = readLine()!!
    print("Enter the second name: ")
    val name2 = readLine()!!
    print("Enter the third name: ")
    val name3 = readLine()!!


    val alphanames = listOf(name1, name2, name3).sorted()
    println("The names in alphabetical order are:")
    for (name in alphanames) {
        println(name)
    }
}
