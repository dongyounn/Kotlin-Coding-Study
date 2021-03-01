package study.programmers.retry.lv2

/*
* 가장 큰 수
* https://programmers.co.kr/learn/courses/30/lessons/42746
* 복습
* */

fun solution202102282(numbers: IntArray): String {
    val stringBuilder = StringBuilder()
    numbers.sortedWith(Comparator { o1, o2 -> "$o2$o1".toInt() - "$o1$o2".toInt() }).forEach {
        stringBuilder.append(it.toString())
    }
    stringBuilder.toString().let {
        return if (it.replace("0", "").isEmpty()) {
            "0"
        } else it
    }
}

fun main(args: Array<String>) {
    solution202102282(
        intArrayOf(6, 10, 2)
    )
}