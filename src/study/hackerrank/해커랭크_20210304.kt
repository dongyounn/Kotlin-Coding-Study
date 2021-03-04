package study.hackerrank

import java.util.*
/*
* https://www.hackerrank.com/challenges/sock-merchant/problem?h_r=next-challenge&h_v=zen&isFullScreen=true
* */
// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var result = 0
    ar.distinct().forEach {
        result += ar.filter { j -> j == it }.count().div(2)
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
