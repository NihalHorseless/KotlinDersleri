package com.example.kotlindersleri.object_oriented

fun main() {
    val result = 5.multiply(5)
    println(result)
}

fun Int.multiply(num1: Int): Int {
    return this * num1
}