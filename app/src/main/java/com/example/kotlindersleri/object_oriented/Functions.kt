package com.example.kotlindersleri.object_oriented

class Functions {
    // IOS protocol(Inteface) tabanlı
    // Android fonksiyon(method) tabanlı
    // void
   fun greetings() { // Swift(func)
       val output = "Greetings Sire"
        println(output)

   }
    // return
    fun greetings2(): String { // Swift(func)
        val output = "Greetings Sire"
        return output

    }

    // parametreli
    fun greetings3(output: String): String { // Swift(func)
        return "Greetings $output"

    }

    // overloading
    fun addUp(num1: Int,num2: Int) {
        println("Result : ${num1+num2}")
    }
    fun addUp(num1: Double,num2: Double) {
        println("Result : ${num1+num2}")
    }
    fun addUp(num1: Double,num2: Double,name:String) {
        println("Result : $name ${num1+num2}")
    }
}