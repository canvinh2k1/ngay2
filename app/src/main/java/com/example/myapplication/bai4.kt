package com.example.myapplication
fun main(args: Array<String>) {
    val a : Int = readLine()!!.toInt()
    val b : Int = readLine()!!.toInt()
    var i : Int
    for (i in a..b) {
        if(check(i)) {
            print("$i, ")
        }
    }
}

