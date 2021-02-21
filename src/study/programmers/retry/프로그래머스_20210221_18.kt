package study.programmers.retry
/*
* 이진 변환 반복하기
* https://programmers.co.kr/learn/courses/30/lessons/70129
* 복습
* */

fun solution2021022118(s: String): IntArray {
    var prevStr = s
    var currStr = s
    var cnt = 0
    var convert = 0
    while (currStr != "1") {
        currStr = String(prevStr.toList().filterNot { it == '0' }.toCharArray())
        cnt += (prevStr.length - currStr.length)
        prevStr = currStr.length.toString(2)
        convert += 1
    }
    return intArrayOf(convert, cnt)
}

fun main(args: Array<String>) {
    solution2021022118("110010101001")
}