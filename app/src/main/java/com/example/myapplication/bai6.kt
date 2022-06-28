package com.example.myapplication

fun main(args: Array<String>) {
    var n : Int = readLine()!!.toInt()
    print(tongchuso(n))
}
fun tongchuso(n : Int) : Int {
    var sum = 0
    var b = n
    while(b != 0) {
        var a = b % 10
        sum += a
        b /= 10
    }
    return sum
}