package com.example.bookclass

import java.time.Year

class Book(val title: String, val author: String, val yearPublished : Int) {
    init {

    }
    fun customBook(title: String, author: String, yearPublished: Int){
        print("Title: ")
        readln()
        print("Author: ")
        readln()
        print("Year Published ")
        readln().toInt()

    }
}