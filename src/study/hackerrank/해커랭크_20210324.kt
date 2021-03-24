package study.hackerrank

import java.util.*
import kotlin.math.abs

// Complete the beautifulDays function below.
//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true

fun beautifulDays(i: Int, j: Int, k: Int): Int = (i..j).filter {
    abs(it.minus(it.toString().reversed().toInt())).rem(k) == 0
}.count()


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val ijk = scan.nextLine().split(" ")

    val i = ijk[0].trim().toInt()

    val j = ijk[1].trim().toInt()

    val k = ijk[2].trim().toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
