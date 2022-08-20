// Kotlin Bsasic Program to ADD two Numbers
fun main(){
    calculate(28,12)
    calculate(18,32)
    calculate(48,22)


}

fun calculate(firstNumber : Int, secondNumber: Int){
    printStartingPart()
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is ${firstNumber+secondNumber}")
    println("Subtraction of them us ${firstNumber-secondNumber}")
    
}

fun printStartingPart(){
    println("")
    println("*****************************")
    println("CalBot Started")
    println("")
}

fun printEndingPart(){
	println("")
    println("CallBot Ended")
    println("*****************************")
    println("")    
}
