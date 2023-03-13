fun main() {
    print("Enter a string: ")
    val str = readLine()

    print("Enter a character: ")
    val kar = readLine()?.getOrNull(0)

    if (str != null && kar != null) {
        val count = str.count { it == kar }
        println("The letter '$kar' appears in the string '$str' $count times.")
    } else {
        println("Invalid! Use a String and Letter.")
    }
}
