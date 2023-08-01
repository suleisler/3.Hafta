package com.example.a3hafta

fun main(){
    val list= listOf(1,2,3,4,5,6,7,8,9)
    for(i in list){
        if (i%2!=0){
            println( "Tek sayılar : $i")
        }
    }
}