package study.codility

import kotlin.math.abs

/*
* https://app.codility.com/c/run/trainingEVH8XM-UH2/
* */
fun solution20210307(A: IntArray): Int {
    val sortedList = A.sortedDescending()
    for (i in 0..sortedList.size - 2) {
        val result = abs(sortedList[i].minus(sortedList[i.plus(1)])) != 1
        if (result) return 0
    }
    return 1
}

fun main(args: Array<String>) {
    solution20210307(intArrayOf(4, 1, 3, 2))
}
