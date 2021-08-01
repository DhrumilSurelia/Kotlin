import java.util.*

fun main() {
    val power = 2.0
    val read = Scanner(System.`in`)
    print("Enter 1st Number : ")
    val num1 = read.nextDouble()
    /*Parsed to Double*/
    println("Number 1 : " + num1)
    print("Enter 2nd Number : ")
    val num2 = read.nextDouble()
    println("Number 2 : " + num2)
    val result = Math.pow(num1,power) + 2*num1*num2 + Math.pow(num2,power)
    /*Step 3 result*/
    println("Equation Answer : " + result)
    val resultsquared = Math.pow(result,power)
    /*Step 4 result*/
    println("Squared Answer : " + resultsquared)
    val resultroot = Math.sqrt(result)
    /*Step 5 result*/
    println("SquareRoot Answer : " + resultroot)
}
