package study.hackerrank

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var min = 0
    var max = 0
    var minValue = scores[0]
    var maxValue = scores[0]

    scores.forEach {
        if (minValue < it) {
            min += 1
            minValue = it
        }
        if (maxValue > it) {
            max += 1
            maxValue = it
        }
    }

    return arrayOf(max, min)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
