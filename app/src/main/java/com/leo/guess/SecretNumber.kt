package com.leo.guess

import java.util.Random


class SecretNumber {
    var secret = Random().nextInt(10) + 1
    var count = 0


    fun validate(number: Int): Int {
        count++
        return secret - number
    }
}

fun main() {
    var secretNumber = SecretNumber()
    println(secretNumber.secret)
    println(" ${secretNumber.validate(5)} count ${secretNumber.count}")
}