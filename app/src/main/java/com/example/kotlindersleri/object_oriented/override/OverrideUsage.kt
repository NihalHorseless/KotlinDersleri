package com.example.kotlindersleri.object_oriented.override

fun main() {
    val animal = Animal()
    val mammal = Mammal()
    val dog = Dog()
    val cat = Cat()

    animal.sound()
    mammal.sound()
    dog.sound()
    cat.sound()
}