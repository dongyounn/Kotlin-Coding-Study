package study.programmers

fun solution_문자열밀(s: String, n: Int): String = String(s.map {
    if (it in 'A'..'Z' && it + n > 'Z') {
        ('A' + (n + it.toInt()) - 'Z'.toInt() - 1)
    } else if (it in 'a'..'z' && it + n > 'z') {
        ('a' + (n + it.toInt()) - 'z'.toInt() - 1)
    } else if (it == ' ') it
    else it + n
}.toCharArray())


fun main(args: Array<String>) {
    solution_문자열밀("asdb FZ", 1)
}