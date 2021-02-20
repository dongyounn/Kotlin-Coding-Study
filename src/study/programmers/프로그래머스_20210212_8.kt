package study.programmers

fun solution11(n: Int): Int {
    val resultList = ArrayList<Int>()
    for (i in 1..n) {
        if (n.rem(i) == 1) {
            resultList.add(i)
        }
    }
    return resultList.sum()
}

fun main(args: Array<String>) {
    solution11(5)
}