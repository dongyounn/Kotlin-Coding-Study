package study.programmers


fun solution3(n: Int): Int =
     StringBuffer(n.toString(3)).reverse().toString().toInt(3)


fun main(args: Array<String>) {
    print(
        solution3(
            125
        )
    )
}