package com.kt.homework

import java.util.Scanner

// Бакытбекова Алтынай

fun main() {
    val map = hashMapOf(
        "Anna" to 774332211, "Marina" to 500445566, "Alina" to 990213456, "Sasha" to 70998877
    )
    println("Введите кол-во записей: ")
    val kolZapisi = readLine().parseToInt()
    val iterator = (1..kolZapisi).iterator()
    val read = Scanner(System.`in`)
    iterator.forEach {
        println("Введите имя и номер: ")
        val name = read.next()
        val phone = read.nextInt()
        map[name] = phone
    }


     do {
         println("Введите имя: ")
         val key = readLine()
        if (key in map.keys){
            println("$key = ${map[key]}")
        } else {
            println("Не найдено")
        }
    } while (key != "exit")
    read.close()
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

