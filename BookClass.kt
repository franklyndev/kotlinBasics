package com.example.bookclass

fun main(){
    var myBook = Book(title = "Unknown", author = "Anonymous", yearPublished = 2025)
    println("The book ${myBook.title}, written by author ${myBook.author}, published in ${myBook.yearPublished}")
    var customBook = Book(title = "1984", author = "George Orwell", yearPublished = 1949)
    println("Custom book: ")
    println("The book ${customBook.title}, written by author ${customBook.author}, published in ${customBook.yearPublished} ")




}