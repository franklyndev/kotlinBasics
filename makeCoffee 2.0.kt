package com.example.activity



fun main(){
    // we call the function
    println("Please enter your name: ")
    var name = readln()
    println("How many spoons of sugar do you want?")
    var sugarCount = readln().toInt()

    makeCoffee(sugarCount, name)

}
// we define the function
fun makeCoffee(sugarCount : Int, name : String){

    if (sugarCount < 1) {
        println("$name, you have not added any spoon of sugar")
    }else if (sugarCount > 1) {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }else{
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
}