package study.programmers.practice


fun solution22(n: Int): Int {
    return n.toString().sumBy { it.toInt() -48 }

}

fun main(args: Array<String>) {
    solution(1293)
}