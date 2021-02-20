package study.programmers

fun solution1(s: String): String {
    return s.split(" ").joinToString("") {
        it.mapIndexed { i, j ->
            when (i % 2) {
                0 -> j.toLowerCase()
                else -> j.toUpperCase()
            }
        }.joinToString("")
    }
}

fun main(args: Array<String>) {
    solution1("try hello world")
}