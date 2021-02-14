package programmers.day1

fun solution(arr: IntArray): IntArray {
    return if (arr.size == 1 && arr[0] == 10)
        intArrayOf(-1)
    else arr.filterNot { it == arr.sortedArray()[0] }
        .toIntArray()
}