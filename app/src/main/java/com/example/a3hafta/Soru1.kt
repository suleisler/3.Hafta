package com.example.a3hafta

fun main() {
    val numara = listOf(1, 2, 3, 4, 5)
    var toplam=0
    for(sayi in numara){
        toplam+=sayi
    }
    println("Listedeki Elemanların Toplamı: $toplam ")
}
