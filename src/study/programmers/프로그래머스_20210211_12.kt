package study.programmers

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    return arr1.zip(arr2).map {
        it.first.zip(it.second).map { value ->
            value.first.plus(value.second)
        }.toIntArray()
    }.toTypedArray()
}