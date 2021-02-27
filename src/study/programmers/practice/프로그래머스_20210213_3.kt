package study.programmers.practice

fun solution8(x: Int) =
    x.rem(x.toString().split("").filterNot { it == "" }.sumBy { it.toInt() }) == 0


fun main(args: Array<String>) {

}