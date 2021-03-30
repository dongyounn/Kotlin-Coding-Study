import java.util.*


/*
* https://programmers.co.kr/learn/courses/30/lessons/42747
* H_INDEX
* */
fun solution20210330(citations: IntArray): Int {
    citations.sortedDescending().let {
        for (i in it.indices) {
            if (it[i] < i + 1)
                return i
        }
    }
    return citations.size
}

fun main(args: Array<String>) {
    solution20210330(
        intArrayOf(3, 0, 6, 1, 5)
    )
}