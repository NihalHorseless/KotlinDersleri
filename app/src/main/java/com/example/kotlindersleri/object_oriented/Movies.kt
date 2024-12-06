package com.example.kotlindersleri.object_oriented

class Movies(var id: Int,
             var name: String,
             var price: Double) {
    init {
        println("Movie Object has been created!")
    }

     fun movieInfo() {
         println("Id:${id}")
         println("Name:${name}")
         println("Price:${price}")
    }
    // Side Effect: Bir metod ile sınıf değişkenlerini değiştirmek
}