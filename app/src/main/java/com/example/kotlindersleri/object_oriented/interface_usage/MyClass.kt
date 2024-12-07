package com.example.kotlindersleri.object_oriented.interface_usage

class MyClass() : MyInterface {
    override val saltAndPepper: String = "Bad Pops"

    override fun getSongLyrics(): String {
        return "Salt and pepper Baby"
    }

}