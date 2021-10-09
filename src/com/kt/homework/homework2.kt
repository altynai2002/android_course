package com.kt.homework


// Бакытбекова Алтынай

fun main() {
    var i = 0
    val array1 = IntArray(4)
    println("Введите числа: ")
//    insert elements
    while(i < array1.size)
    {
        array1[i] = readLine().parseToInt()
        i++
    }
//    compare elements
    if (array1[0] + array1[1] == array1[2] + array1[3]) {
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