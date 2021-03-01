package study.programmers.retry.lv1

//두 개 뽑아서 더하기
//https://programmers.co.kr/learn/courses/30/lessons/68644
//복습
fun solution20210220(numbers: IntArray): IntArray {
    val reqSize = numbers.size.minus(1)
    val result = ArrayList<Int>()

    numbers.forEachIndexed { index, i ->
        for (idx in 0..reqSize) {
            if (idx != index) {
                result.add(i.plus(numbers[idx]))
            }
        }
    }
    return result.toSortedSet().toIntArray()
}

fun 참고(numbers: IntArray): IntArray {
    val list = numbers.toList()
    return list.withIndex().flatMap { i -> list.withIndex().map { j -> i to j } }
        .filter { it.first.index != it.second.index }
        .map { it.first.value + it.second.value }
        .toSortedSet()
        .toIntArray()
}

fun main(array: Array<String>) {
    solution20210220(intArrayOf(2, 1, 3, 4, 1))
}