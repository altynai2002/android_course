package com.kt.homework

// Бакытбекова Алтынай

fun main() {
    // readLine() - ввод с консоли но возвр-ет string


    println("Enter first number: ")
    val a = readLine().parseToInt()
    println("Enter second number: ")
    val b = readLine().parseToInt()
    println("Enter symbol: ")
    val sym = readLine()

    when(sym) {
        "+" -> println("result: ${a + b}")
        "-" -> println("result: ${a - b}")
        "*" -> println("result: ${a * b}")
        "/" -> println("result: ${divisionByZero(a, b)}")
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

private fun divisionByZero(a: Int, b: Int): String {
    return try {
        (a / b).toString()
    } catch (e: ArithmeticException) {
        return "exception= $e"
    }
}