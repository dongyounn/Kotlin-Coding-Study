package study.programmers.practice

fun solution4(n: Long): IntArray =n.toString().reversed().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toIntArray()

fun main(args: Array<String>) {
    solution4(12345)
}