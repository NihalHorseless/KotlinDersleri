package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19
    val isim = "Ahmet"
    val ka = "admin"
    val s = 123
    val sayı = 10

    if (yas >= 18) {
        println("You are not a minor")
    } else {
        println("You are a minor so DNE")
    }

    if (isim == "Ahmet") {
        println("Merhaba Ahmet")
    } else if (isim == "Zeynep") {
        println("Zeynep hoşgeldin")
    } else {
        println("Kimsiniz")
    }

    if (ka == "admin" && s == 123) {
        println("Authorized")
    } else {
        println("Wrong credentials, please enter valid credentials")
    }

    if (sayı == 10 || sayı == 11) {
        println("Sayı 10 ya da 11'dir")
    } else {
        println("Sayı 10 ya da 11 değildir")
    }

    // When (Switch-Case)
    val x = 1

    when(x) {
        1-> println("x 1'e eşittir")
        2-> println("x 2'ye eşittir")
        else -> println("Böyle bir sayı yoktur")
    }

}