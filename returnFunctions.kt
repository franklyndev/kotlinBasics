package com.example.returnfunctions

fun main(){
    println("Enter a number: ")
    val num1 = readln().toInt()
    println("Enter another number: ")
    val num2 = readln().toInt()
    val myResult = divide(num1, num2)
    println("The result of the  is division= $myResult")

}

fun divide(num1: Int, num2: Int): Double{
    val resultdivide = num1/num2.toDouble()
    return resultdivide
}

fun add(num1 : Int, num2 : Int): Int{
    var result = num1 + num2
    return result
}