package com.kt.homework

fun main() {
    // readLine() - ввод с консоли но возвр-ет string
//    val x = readLine()
//    println(readLine())

    println("Enter first number: ")
    val a = readLine().parseToInt()
    println("Enter second number: ")
    val b = readLine().parseToInt()
    println("Enter symbol: ")
    val sym = readLine()

    val sum = a + b
    val subtract = a - b
    val multiply = a * b
    val division = a / b


    when(sym) {
        "+" -> println("Sum: $sum")
        "-" -> println("Subtract: $subtract")
        "*" -> println("Multiplication: $multiply")
        "/" -> println("Division: $division")
        else -> {
            println("Enter +,-,*,/ symbols!")
        }
    }
}

private fun String?.parseToInt(): Int {
    if (this == null) return 0
    if (this == "") return 0

    return try {
        this.toInt()
    } catch (e: NumberFormatException) {
        println("exception= $e")
        return 0
    }
}
