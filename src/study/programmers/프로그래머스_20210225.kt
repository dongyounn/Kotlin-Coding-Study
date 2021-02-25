package study.programmers

fun solution20210225(s: String): String {
    s.split(" ").map { it.toLong() }.sortedDescending().let {
        return "${it.min()} ${it.max()}"
    }
}

fun main(args: Array<String>) {
    solution20210225("-1 -2 -3 -4")
}