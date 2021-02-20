package study.hackerrank

import java.util.*

fun staircase(n: Int) {
    (1..n).forEach { i ->
        val stringBuilder = StringBuilder()
        for (j in 1..i) {
            stringBuilder.append("#")
        }
        println(stringBuilder.toString().padStart(n, ' '))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}