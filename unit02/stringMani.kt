//Hymie Herrera String Manipulator Feb 12
fun main() {
    print("What is the name of your favorite city: ")
    val cityName = readLine()!!

    val citylen = cityName.length
    val cityUpper = cityName.toUpperCase()
    val cityLower = cityName.toLowerCase()
    val cityFirst = cityName.first()

    println("Character length: $citylen")
    println("Uppercase: $cityUpper")
    println("Lowercase: $cityLower")
    println("First character of your favorite city: $cityFirst")
}
