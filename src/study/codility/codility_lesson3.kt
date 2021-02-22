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
    A.forEach{
        tempValue += it
        if (tempValue != sumValue){
            resultArray.add(abs(sumValue - (tempValue*2)))
        }
    }
    return resultArray.sorted()[0]
}
