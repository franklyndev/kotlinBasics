package com.example.classesobjects

class Dog(val name: String, val breed : String) {

    init {
        bark(name)

    }

    fun bark(name: String){
        var barking = ("$name says Woof Woof")
        println(barking)
    }

}