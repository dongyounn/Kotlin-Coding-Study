package study.programmers.practice

fun solution(arr: IntArray, divisor: Int): IntArray {
    val result = ArrayList<Int>()

    arr.map {
        if (it.rem(divisor) == 0) {
            result.add(it)
        }
    }
    return if (result.size == 0) intArrayOf(-1) else result.toIntArray().sortedArray()
}

fun main(args: Array<String>) {
    solution(intArrayOf(5, 9, 7, 10), 5)
}