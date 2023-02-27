fun main() {
    print("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine().equals("yes", ignoreCase = true)
    print("Is anyone in your party a vegan? ")
    val isVegan = readLine().equals("yes", ignoreCase = true)
    print("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine().equals("yes", ignoreCase = true)

    println("Here are your restaurant choices:\n")
    if (!isVegetarian && !isVegan && !isGlutenFree) {
        println("Joe's Gourmet Burgers")
    }
    if (isVegetarian && !isVegan && isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
    if (isVegetarian && isVegan && isGlutenFree) {
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
    if (isVegetarian && !isVegan && !isGlutenFree) {
        println("Main Street Pizza Company")
        println("Corner Cafe")
        println("Mama's Fine Italian")
        println("The Chef's Kitchen")
    }
    if (isVegetarian && isVegan && !isGlutenFree) {
        println("Corner Cafe")
        println("The Chef's Kitchen")
    }
}
