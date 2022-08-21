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


// Return Types
fun main(){
    println("Total is ${getAddition(25,40)}")
    showGreeting()
    showThanks()
}

fun getAddition(num1:Int, num2:Int) = num1+num2

fun showGreeting():Unit{
    println("Welcome!")
}

fun showThanks(){
    println("Thank You!")
}

// Overloaded Functions
fun main(){
    showGreeting()
    showGreeting("Mohsin","Bengaluru")
    showGreeting("Khan",11)
    
}
fun showGreeting(){
    println("Welcome!")
}
fun showGreeting(name:String,city:String="London"){
    println("Welcome! $name from $city")
}
fun showGreeting(name:String, count:Int){
    println("Welcome! $name, your index is $count")
}
