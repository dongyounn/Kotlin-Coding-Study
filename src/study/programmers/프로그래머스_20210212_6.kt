package study.programmers

fun solution(n: Long): Long {

    return String(n.toString().toCharArray().sortedArrayDescending()).toLong()
}