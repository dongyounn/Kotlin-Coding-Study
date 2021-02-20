package study.hackerrank

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    var times = 1
    do {
        if (x1.plus(v1.times(times)) == x2.plus(v2.times(times))) {
            return "YES"
        }
        times++
    } while (times * v1 <= 1000000000 || times * v2 <= 1000000000)
    return "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
