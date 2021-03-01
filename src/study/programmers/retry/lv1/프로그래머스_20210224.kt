package study.programmers.retry.lv1

/*
* x만큼 간격이 있는 n개의 숫자
* https://programmers.co.kr/learn/courses/30/lessons/12954
* 복습
* */

fun solution20210224(x: Int, n: Int): LongArray =
    (1..n.toLong()).map { x.times(it) }.toLongArray()


fun main(args: Array<String>) {
    solution20210224(2, 5)
}