package com.kt.homework


// Бакытбекова Алтынай

fun main() {
    println("Введите числа: ")
//    insert elements
    val num = readLine().parseToInt()

//    compare elements
    if (num / 10 == (num % 10) * 100 + num / 100) {
        println("Счастливое число")
    } else {
        println("Hecчастливое число")
    }
//    to see elements in console
//    array1.forEach { println(it) }
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