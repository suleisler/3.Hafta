package com.example.a3hafta

fun main(){
    var list= arrayListOf<Int>(1,2,3,4,5,6,7,8)

    for(i in 0 until list.size/2){
        var temp= list[i]
        list[i]=list[list.size-1-i]
        list[list.size-1-i]=temp



    }
    for (i in 0 until list.size){
        print("${list[i]}  ")
    }


}