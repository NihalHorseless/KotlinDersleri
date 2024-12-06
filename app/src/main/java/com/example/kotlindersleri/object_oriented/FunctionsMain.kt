package com.example.kotlindersleri.object_oriented

fun main() {
    val f = Functions()

    f.greetings()

    val output = f.greetings2()
    println(output)

    println(f.greetings3("Zeynep"))

    f.addUp(1.2,2.3,"Susanne")
}