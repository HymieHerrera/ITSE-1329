fun main() {
    print("Enter the mass of the object in kilograms: ")
    val mass = readLine()!!.toDouble()

    val weight = mass * 9.8

    println("The weight of the object is $weight Newtons.")

    if (weight > 1000) {
        println("The object is too heavy.")
    } else if (weight == 1000.0) {
        println("The weight of the object is exactly 1000 Newtons.")
    } else if (weight < 10) {
        println("The object is too light.")
    }
}

// No matter how much I tested I couldn't get it to equal 1000 newtons despite whatever weight I chose.  But, I don't like the too heavy, too light split with no just right option in case of a possible error
