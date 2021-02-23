package study.codility

import kotlin.math.abs

fun solution(X: Int, Y: Int, D: Int): Int {
    // write your code in Kotlin
    return (Y.minus(X)).div(D).plus(if ((Y.minus(X).rem(D) > 0)) 1 else 0)
}

fun solution2(A: IntArray): Int {
    // write your code in Kotlin
    var tempValue = 0
    val sumValue = A.sum()
    val resultArray = ArrayList<Int>()
    A.forEach {
        tempValue += it
        if (tempValue != sumValue) {
            resultArray.add(abs(sumValue - (tempValue * 2)))
        }
    }
    return resultArray.sorted()[0]
}

fun solution3(A: IntArray): Int {
    // write your code in Kotlin
    val sortedArray = A.sortedArray()
    for (i in 0..sortedArray.size.minus(1)) {
        if (
            i != sortedArray.size.minus(1)
            && sortedArray[i] - sortedArray[i + 1] != -1
        ) {
            return sortedArray[i].plus(1)
        }
    }
    return 1
}

fun main(args: Array<String>) {
    solution3(intArrayOf(2, 3, 1, 5))
}