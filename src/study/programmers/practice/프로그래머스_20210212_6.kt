package study.programmers.practice

fun solution(n: Long): Long {

    return String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}