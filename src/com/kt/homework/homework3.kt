package com.kt.homework

// Бакытбекова Алтынай

fun main() {
    val array1 = intArrayOf(1, 10, 4, -2, 0, 6, 15, -45).bubbleSort()
//    array1.forEach{ println(it) }
    println(array1.toList())
}

fun IntArray.bubbleSort(): IntArray {
    var swap = true
    var array = this.size-1
    while(swap){
        swap = false
        for(i in 0 until array){
            if(this[i] > this[i+1]){
                val t = this[i]
                this[i] = this[i+1]
                this[i + 1] = t
                swap = true
            }
        }
        array--
    }
    return this
}

