//The formula says to divide the interest rate by n.  But it seems that it should be divided by 100 to get the actual percentage instead.  As anything else grossly inflates the amount.

import kotlin.math.pow

fun main() {
  print("The amount of principal originally deposited into the account: ")
  val principal = readLine()!!.toDouble()
  print("The annual interest rate paid by the account: ")
  val interestRate = readLine()!!.toDouble()
  print(
      "The number of times per year that the interest is compounded (For example, if interest is compounded monthly, enter 12. If interest is compounded quarterly, enter 4.): "
  )
  val compoundingFrequency = readLine()!!.toDouble()
  print("The number of years the account will be left to earn interest: ")
  val years = readLine()!!.toInt()

  val amount =
      principal * (1 + (interestRate / 100)).pow(compoundingFrequency * years)
  println("After $years years there will be $\$%.2f  in the account".format(amount))
}
