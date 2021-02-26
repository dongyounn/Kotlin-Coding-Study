package study.programmers

fun solution20210226(numbers: String): Int {
    val resultList = ArrayList<Int>()

    val numberList = numbers.toList()

    for (i in numberList.indices) {
        for (it in i..numberList.size.minus(1)) {
            val number = StringBuilder(i).append(it).toString().toInt()
            var isTrue = false
            for (n in 2..number) {
                if (number.rem(n) == 0) {
                    isTrue = false
                    break
                } else isTrue = true
            }
            if (isTrue) {
                resultList.add(it)
            }
        }
    }
    return resultList.distinct().count()
}

fun main(args: Array<String>) {
    solution20210226("17")
}