package com.example.kotlindersleri.variables

fun main() {

    var ogrenciAdı = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.89
    var ogrenciBasHarf = 'A'
    var ogrenciDevamDurum = true

    println(" - Öğrenci - ")
    println("Ad: $ogrenciAdı")
    println("Yas: $ogrenciYas")
    println("Boy: $ogrenciBoy cm")
    println("Baş Harf: $ogrenciBasHarf")
    println("Devam Durumu: $ogrenciDevamDurum")

    // Constants

    var sayı = 23
    println(sayı)
    sayı = 45
    println(sayı)

    val numara = 25
    println(numara)
   // numara = 45

    // Type Casting
    val d = 55.46
    // To Int
    val sonuc1 = d.toInt()
    println(sonuc1)
    // To String
    val sonuc2 = d.toString()
    println(sonuc2.javaClass.name)
    // From String to Int (with orNull)
    val yazı = "67+"

    val sonuc3 = yazı.toIntOrNull()
    print(sonuc3)

}