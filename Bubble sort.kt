package com.example.task1

fun main(args: Array<String>) {


    val numberslist = bubbleSort(intArrayOf(9,8, 1,2,3,4,6,5))
    for (element in numberslist) {
        println(element)
    }
}
fun bubbleSort(arr:IntArray):IntArray{
    var exchange = true
    while(exchange){
        exchange = false
        for(i in 0 until arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                exchange = true
            }
        }
    }
    return arr
}




