fun main() {
    print("Enter weight (in pounds): ")
    val weight = readLine()!!.toDouble()
    print("Enter height (in inches): ")
    val height = readLine()!!.toDouble()

    val bmi = weight * 703 / (height * height)

    println("Your BMI is: ${String.format("%.2f", bmi)}")

    if (bmi < 18.5) {
        println("You are underweight.")
    } else if (bmi < 25) {
        println("Your weight is within an optimal range for your height.")
    } else {
        println("You are overweight.")
    }
}
