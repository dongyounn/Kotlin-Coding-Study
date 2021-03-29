import java.util.*


/*
* https://programmers.co.kr/learn/courses/30/lessons/12949
* 행렬의 곱셈
* */
fun solution20210329(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.map {
        arr2.map { j ->
            it.zip(j).map {
                it.first.times(it.second)
            }.sum()
        }.toIntArray()
    }.toTypedArray()
}

fun solution202103291(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    val answer = Array(arr1.size) { IntArray(arr2.first().size) { 0 } }
    for (row in arr1.indices) {
        for (col2 in arr2.first().indices) {
            for (col in arr1[row].indices) {
                answer[row][col2] += arr1[row][col] * arr2[col][col2]
            }
        }
    }
    return answer
}

fun main(args: Array<String>) {
//    solution20210329(
//        arrayOf(intArrayOf(1, 4), intArrayOf(3, 2), intArrayOf(4, 1)),
//        arrayOf(intArrayOf(3, 3), intArrayOf(3, 3))
//    )

    solution202103291(
        arrayOf(intArrayOf(2, 3, 2), intArrayOf(4, 2, 4), intArrayOf(3, 1, 4)),
        arrayOf(intArrayOf(5, 4, 3), intArrayOf(2, 4, 1), intArrayOf(3, 1, 1))
    )
}