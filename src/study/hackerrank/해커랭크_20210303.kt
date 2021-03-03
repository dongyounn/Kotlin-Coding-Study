package study.hackerrank


/*
* https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true
* 해커랭크
* */
fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    b.minus((bill.sum().minus(bill[k])).div(2)).let {
        println(
            if (it == 0) {
                "Bon Appetit"
            } else
                it.toString()
        )
    }
}

fun main(args: Array<String>) {
    val nk = readLine()!!.trimEnd().split(" ")

    val n = nk[0].toInt()

    val k = nk[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    println(bonAppetit(bill, k, b))
}
