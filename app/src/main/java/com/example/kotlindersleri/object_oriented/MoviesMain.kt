package com.example.kotlindersleri.object_oriented

fun main() {
    // Nesne oluşturma
    val movie1 = Movies(1, "GoodFellas", 15.70)
    movie1.movieInfo()

    println("-------------------------------------")

    val movie2 = Movies(2, "Taxi Driver", 24.50)
    movie2.movieInfo()

}