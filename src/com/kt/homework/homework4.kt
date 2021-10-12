package com.kt.homework

fun main() {
    println("Enter string: ")
    val string1 = readLine()
    var a = 0
    if (string1 != null) {
        for(i in string1.indices){
            a++
        }
    }
    println("Кол-во цифр в строке: $a")
}