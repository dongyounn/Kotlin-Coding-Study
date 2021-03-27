package study.hackerrank

import java.util.*
import kotlin.math.floor

//https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true

fun main(args: Array<String>) {
    val keyboard = Scanner(System.`in`)
    val num = keyboard.nextInt()
    var people = 5
    var sum = 0
    for (i in 0 until num) {
        people = floor(people / 2.toDouble()).toInt()
        sum += people
        people *= 3
    }
    println(sum)
}