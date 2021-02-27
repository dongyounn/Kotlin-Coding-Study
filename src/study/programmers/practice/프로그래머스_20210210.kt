package study.programmers.practice

import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue
import kotlin.collections.ArrayList


fun solution333(progresses: IntArray, speeds: IntArray): IntArray {
    val dayList: Queue<Int> = ConcurrentLinkedQueue()
    val listSize = progresses.size
    for (i in 0 until listSize.minus(1)) {
        var day = 0
        var complete: Int
        for (j in progresses[i]..100) {
            complete = j.plus(speeds[i])
            if (complete >= 100) {
                day += 1
            }
        }
        dayList.add(day)
    }

    var answer = intArrayOf()
    return answer
}

fun solution222(numbers: IntArray): IntArray {
    val result = ArrayList<Int>()

    for (i in numbers.indices) {
        for (j in numbers.indices) {
            if (i != j) {
                result.add(numbers[i].plus(numbers[j]))
            }
        }
    }
    return result.distinct().sorted().toIntArray()
}
