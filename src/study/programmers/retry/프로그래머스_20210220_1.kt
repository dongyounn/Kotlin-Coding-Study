package study.programmers.retry

// K번째 수
// https://programmers.co.kr/learn/courses/30/lessons/42748
// 복습

fun solution202102201(array: IntArray, commands: Array<IntArray>): IntArray {
    val result = ArrayList<Int>()
    commands.forEach {
        result.add(
            array.toMutableList()
                .subList(it[0].minus(1), it[1])
                .sorted()[it[2]
                .minus(1)]
        )
    }
    return result.toIntArray()
}

class 참고 {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        return commands.map { command ->
            array.slice(IntRange(command[0] - 1, command[1] - 1)).sorted()[command[2] - 1]
        }
            .toIntArray()
    }
}

fun main(array: Array<String>) {
    solution202102201(
        intArrayOf(1, 5, 2, 6, 3, 7, 4),
        arrayOf(intArrayOf(2, 5, 3), intArrayOf(4, 4, 1), intArrayOf(1, 7, 3))
    )
}