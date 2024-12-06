package com.example.kotlindersleri.odevler

fun main() {
    // 1.Fonksiyon test
    println(kenarAcıHesapla(4))
    // 2.Fonksiyon test
    maasHesap(30)
    // 3.Fonksiyon test
    println(otoparkUcret(4))
    // 4.Fonksiyon test
    println("${kmToMil(2.56)} Mil")
    // 5.Fonksiyon test
    dikDortgenAlan(3.4,5.2)
    // 6.Fonksiyon test
    println(faktoryel(4))
    // 7.Fonksiyon test
    eHarfiHesapla("Yemek")
}

// 1.Fonksiyon
fun kenarAcıHesapla(kenarSayısı: Int): Int {
    if (kenarSayısı > 2) {
        return ((kenarSayısı - 2) * 180) / kenarSayısı
    } else {
        println("Hatalı kenar sayısı girdiniz")
        return 0
    }
}

// 2.Fonksiyon
fun maasHesap(gunSayısı: Int) {

    val toplamSaat = gunSayısı * 8
    val normalUcret = 40
    val mesaiUcret = 80

    when (toplamSaat) {
        in 151..Int.MAX_VALUE -> println("Maas Tutari: ${(150 * normalUcret) + ((toplamSaat - 150) * mesaiUcret)} TL")
        in 1..150 -> println("Maas Tutari: ${toplamSaat * normalUcret} TL")
        else -> println("Gecersiz gun degeri girdiniz!")
    }
}

// 3.Fonksiyon
fun otoparkUcret(saat: Int): Int {
    val sabitUcret = 50
    val saatlikUcret = 10
    if (sabitUcret > 1) {
        return (saat - 1) * saatlikUcret + sabitUcret
    } else if (saat == 1) {
        return sabitUcret
    } else {
        println("Gecersiz saat girdiniz!")
        return 0
    }
}

// 4.Fonksiyon
fun kmToMil(birim: Double): Double {
    return birim * 0.621
}

// 5.Fonksiyon
fun dikDortgenAlan(dikKenar: Double, yatayKenar: Double) {
    println("Alan: ${dikKenar * yatayKenar}")
}

// 6.Fonksiyon
fun faktoryel(sayı: Int): Int {
    if (sayı > 1) {
        return sayı * faktoryel(sayı - 1)
    } else if (sayı == 1) {
        return sayı
    } else {
        println("Gecersiz sayi girdiniz")
        return 0
    }
}

// 7.Fonksiyon
fun eHarfiHesapla(kelime: String) {
    var eHarfiSayısı = 0
    for (c in kelime) {
        if (c == 'e') {
            eHarfiSayısı++
        }
    }
    println("$kelime kelimesinde $eHarfiSayısı kere 'e' harfi geciyor")
}