import java.util.*


/*
* https://programmers.co.kr/learn/courses/30/lessons/42842
* 카펫
* */
fun solution20210331(brown: Int, yellow: Int): IntArray {
    return (1..yellow)
        .filter { yellow % it == 0 }
        .first { brown == (yellow / it * 2) + (it * 2) + 4 }
        .let { intArrayOf(yellow / it + 2, it + 2) }
}

fun main(args: Array<String>) {
    solution20210331(
        10, 2
    )
}