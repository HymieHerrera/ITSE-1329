fun main(args: Array<String>) {
    val cookiesPerBag = 40
    val caloriesPerCookie = 300 / 10
    
    println("Enter number of cookies eaten: ")
    val cookiesEaten = readLine()!!.toInt()
    val totalCalories = cookiesEaten * caloriesPerCookie
    
    println("Your calorie intake was: $totalCalories")
}