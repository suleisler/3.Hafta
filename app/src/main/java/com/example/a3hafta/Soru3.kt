package com.example.a3hafta

fun main(){
    val list1= arrayListOf<Int>(1,3,5,7,9)
    val list2= arrayListOf<Int>(2,4,6,8,10)

    var list3= mutableListOf<Int>()
    list3.addAll(list1)
    list3.addAll(list2)

    println(list3)
    //var siraliList=list3.sorted()
    //println(siraliList)

    for(i in list3.indices){
        for(j in 0 until list3.size-i-1){
            if(list3[j] > list3[j+1]){
               var temp=list3[j]
               list3[j]=list3[j+1]
              list3[j+1]=temp
            }
        }

    }
    println(list3)

}
