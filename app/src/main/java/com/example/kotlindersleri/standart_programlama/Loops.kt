package com.example.kotlindersleri.standart_programlama

fun main() {
    // For Each
    for(i in 1..3) {
        println("Loop 1: $i")
    }
    // While

    var sayac = 1
    while (sayac<4) {
        println("Loop 2: $sayac")
        sayac++
    }

    // 10 ile 20 arasında 5'er artsın
    // step
    for(a in 10..20 step 5) {
        println("Loop 4: $a")
    }
    // 20 ile 10 arasında 5'er azalsın
    // DownTo
    for(a in 20 downTo 10 step 5) {
        println("Loop 4.2: $a")
    }

    for(i in 1..5) {
        if(i == 3) {
            break
        }
        println("Loop 5: $i")
    }
    for(i in 1..5) {
        if(i == 3) {
            continue
        }
        println("Loop 6: $i")
    }

}