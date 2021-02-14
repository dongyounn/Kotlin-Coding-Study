package programmers.day1

fun solution8(x: Int, n: Int): LongArray {
    val result = ArrayList<Long>()
    for (i in 1 .. n) {
        result.add(x.toLong().times(i))
    }
    return result.toLongArray()
}

fun main(args: Array<String>) {

}