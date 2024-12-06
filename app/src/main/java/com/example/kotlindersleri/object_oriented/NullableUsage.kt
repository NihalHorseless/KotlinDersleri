package com.example.kotlindersleri.object_oriented

import androidx.compose.ui.text.toUpperCase

fun main() {
    // Nullable - Null Safety - Optional(Swift)

    // Assignment
    var letter : String? = null
    letter = "Greetings"

    // Exhibit 1
    println("Exhibit 1: ${letter?.uppercase()}")

    // Exhibit 2
  //  println("Exhibit 2: ${letter!!.uppercase()}")

    // Exhibit 3
    if(letter != null) {
        println("Exhibit 3: ${letter.uppercase()}")
    }
    else {
        println("It's null!!")
    }
    // Exhibit 4
    letter?.let {
        println("Exhibit 4: ${it.uppercase()}")
    }

}