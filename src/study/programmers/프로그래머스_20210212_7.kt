package study.programmers

fun solution33(s: String): Int =
    s.removePrefix("+").toInt()

fun main(args: Array<String>) {
    solution33("+12412")
}