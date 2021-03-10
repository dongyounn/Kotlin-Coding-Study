package study.hackerrank

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */
//https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true
fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var v = 0
    var lvl = 0 // current level
    for (c in path.toCharArray()) {
        if (c == 'U') ++lvl
        if (c == 'D') --lvl
        if (lvl == 0 && c == 'U') ++v
    }
    return v
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
