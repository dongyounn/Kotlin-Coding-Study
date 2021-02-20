package study.programmers.retry

/*
* https://programmers.co.kr/learn/courses/30/lessons/12915
* 문자열 내 마음대로 정렬하기
* 복습
* */

fun solution202102215(strings: Array<String>, n: Int): Array<String> =
    strings.sortedWith(Comparator { o1, o2 ->
        if (o1[n] == o2[n]) o1.compareTo(o2) else o1[n].compareTo(o2[n])
    }
    ).toTypedArray()

fun main(array: Array<String>) {
    solution202102215(arrayOf("sun", "bed", "car"), 1)
}