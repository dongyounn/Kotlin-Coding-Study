package study.programmers

fun solution1(a: Int, b: Int): Long {
    var result: Long = 0
    val firstValue = a.toLong()
    val secondValue = b.toLong()
    when {
        firstValue == secondValue -> {
            return secondValue
        }
        firstValue > secondValue -> {
            for (i in secondValue..firstValue) {
                result = result.plus(i)
            }
        }
        firstValue < secondValue -> {
            for (j in firstValue..secondValue) {
                result = result.plus(j)
            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    print(
        study.programmers.solution3(
            125
        )
    )
}