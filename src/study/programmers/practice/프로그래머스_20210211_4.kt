package study.programmers.practice

fun solution2(s: String): String {
    return if (s.length.rem(2) == 1) {
        s.substring((s.length / 2), s.length / 2 + 1)
    } else
        s.substring((s.length / 2 - 1), (s.length / 2) + 1)
}

fun main(args: Array<String>) {
    print(
        solution2(
            "abcde2"
        )
    )
}