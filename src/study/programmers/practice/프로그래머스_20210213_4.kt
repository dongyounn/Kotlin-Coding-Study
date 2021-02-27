package study.programmers.practice

fun solution9(num: Int): Int {
    var tempNum = num
    var result = 0
    if (num == 1) {
        return 0
    }
    do {
        tempNum = when (tempNum.rem(2)) {
            1 -> {
                tempNum * 3 + 1
            }
            else -> {
                tempNum / 2
            }
        }
        result++
        if (result == 500) {
            return -1
        }
    } while (tempNum != 1)

    return result
}

fun main(args: Array<String>) {
    solution9(1)
}