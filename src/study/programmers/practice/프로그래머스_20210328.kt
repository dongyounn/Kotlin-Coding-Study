import java.util.*


/*
* https://programmers.co.kr/learn/courses/30/lessons/42840?language=kotlin
* 모의고사
* */
fun solution20210328(answers: IntArray): IntArray {
    val answer = mutableListOf<Int>()
    val first = intArrayOf(1, 2, 3, 4, 5)
    val second = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
    val third = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    val cntList = mutableListOf(Pair(1, 0), Pair(2, 0), Pair(3, 0))
    answers.mapIndexed { index, i ->
        if (i == first[index % first.size]) {
            cntList[0] = Pair(1, cntList[0].second + 1)
        }
        if (i == second[index % second.size]) {
            cntList[1] = Pair(2, cntList[1].second + 1)
        }
        if (i == third[index % third.size]) {
            cntList[2] = Pair(3, cntList[2].second + 1)
        }
    }
    cntList.sortWith(Comparator { o1, o2 -> return@Comparator o2.second - o1.second })
    cntList.map {
        if (it.second == cntList[0].second) {
            answer.add(it.first)
        }
    }
    answer.sort()
    return answer.toIntArray()

}


fun main(args: Array<String>) {
    solution20210328(intArrayOf(1, 2, 3, 4, 5))
}