package com.example.activity


fun main(){
    // we call the function
    makeCoffee()
    makeCoffee()
    makeCoffee()

}
// we define the function
fun makeCoffee(){
    println("Please enter your name: ")
    var name = readln()
    println("How many spoons of sugar do you want?")
    var sugarCount = readln().toInt()

    if (sugarCount < 1) {
        println("$name, you have not added any spoon of sugar")
    }else if (sugarCount > 1) {
        println("Coffee with $sugarCount spoons of sugar for $name")
    }else{
        println("Coffee with $sugarCount spoon of sugar for $name")
    }
}