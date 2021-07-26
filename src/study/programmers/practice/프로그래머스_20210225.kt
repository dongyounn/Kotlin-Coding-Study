package study.programmers.practice

fun solution20210225(s: String): String {
    s.split(" ").map { it.toLong() }.sortedDescending().let {
        return "${it.minOrNull()} ${it.maxOrNull()}"
    }
}

fun main(args: Array<String>) {
    solution20210225("-1 -2 -3 -4")
}