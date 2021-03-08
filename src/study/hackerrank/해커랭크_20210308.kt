package study.hackerrank

import java.util.*
import kotlin.math.abs

/*
* https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
*
* */
// Complete the hurdleRace function below.
fun hurdleRace(k: Int, height: Array<Int>): Int {
    k.minus(height.max()!!).let {
        return if (it >= 0) {
            0
        }else
            abs(it)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val height = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
