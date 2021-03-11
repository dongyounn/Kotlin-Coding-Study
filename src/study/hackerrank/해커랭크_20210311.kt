package study.hackerrank

import java.util.*
//https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true

// Complete the findDigits function below.
fun findDigits(n: Int): Int {
    return n.toString().toCharArray().map {
        if (it.toString().toInt() != 0) {
            if (n.rem(it.toString().toInt()) == 0) 1 else 0
        } else 0
    }.sum()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val result = findDigits(n)

        println(result)
    }
}
