package com.example.kotlindersleri.object_oriented

fun main() {
    ucretHesapla(5,Konserve.MEDIUM)
}
fun ucretHesapla(adet:Int, boyut:Konserve) {
    when(boyut) {
        Konserve.SMALL -> println("Ucret: ${adet * 2} TL")
        Konserve.MEDIUM -> println("Ucret: ${adet * 3} TL")
        Konserve.LARGE -> println("Ucret: ${adet * 4} TL")
    }
}