package com.kt.homework

// Бакытбекова Алтынай

fun main() {
    val array1 = intArrayOf(1, 10, 4, -2, 0, 6, 15, -45).bubbleSort()
//    array1.forEach{ println(it) }
    println(array1.toList())
}

fun IntArray.bubbleSort(): IntArray {
    var size = this.size
    for(i in 0 until size){
        for (j in 1 until size - i) {
            if (this[j - 1] > this[j]) {
                this.swap(j, j - 1)
            }
        }
    }
    return this
}

fun IntArray.swap(idx: Int, idy: Int) {
    val temp = this[idx]
    this[idx] = this[idy]
    this[idy] = temp
}
