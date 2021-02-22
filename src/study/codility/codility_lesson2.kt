package study.codility

fun solution(A: IntArray, K: Int): IntArray {
    val listSize = A.size - 1
    val resultMap = HashMap<Int, Int>()
    val movePoint = K.rem(listSize + 1)
    A.mapIndexed { index, i ->
        val nextPoint = if (index.plus(movePoint) > listSize) {
            index.plus(movePoint).minus(1).minus(listSize)
        } else
            index.plus(movePoint)
        resultMap.put(nextPoint, i)
    }
    return resultMap.toSortedMap().values.toIntArray()
}

fun main(args: Array<String>) {
    solution(intArrayOf(1, 2, 3, 4), 4)
}

fun solution(A: IntArray): Int {
    // write your code in Kotlin
    val distinctValue = A.distinct()
    val sortedList = A.sortedArray()
    for (i in distinctValue) {
        if (sortedList.count { it == i }.rem(2) == 0) {
            return i
        }
    }
    return 0
}