package study.codility

fun solution(N: Int): Int {
    var tempValue = 0
    val resultList = ArrayList<Int>()
    N.toString(2).toList().forEach {
        if (it == '0') {
            tempValue += 1
        }else{
            resultList.add(tempValue)
            tempValue = 0
        }
    }
    return resultList.sortedDescending()[0]
}

fun main(args: Array<String>) {
    solution(529)
}
