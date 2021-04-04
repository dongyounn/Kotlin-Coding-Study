import java.util.*

/*
* https://programmers.co.kr/learn/courses/30/lessons/64061?language=kotlin
* 크레인 인형뽑기 게임
* */
fun solution20210404(board: Array<IntArray>, moves: IntArray): Int {
    var answer = 0
    val stack = Stack<Int>()
    moves.forEach {
        for (i in board.indices) {
            if (board[i][it - 1] != 0) {
                if (stack.isNotEmpty() && stack.peek() == board[i][it - 1]) {
                    answer += 2
                    stack.pop()
                } else {
                    stack.push(board[i][it - 1])
                }
                board[i][it - 1] = 0
                break
            }
        }
    }
    return answer
}


fun main(args: Array<String>) {
    val input = arrayOf(
        intArrayOf(0, 0, 0, 0, 0)
        , intArrayOf(0, 0, 1, 0, 3)
        , intArrayOf(0, 2, 5, 0, 1)
        , intArrayOf(4, 2, 4, 4, 2)
        , intArrayOf(3, 5, 1, 3, 1)
    )

    val moves = intArrayOf(1, 5, 3, 5, 1, 2, 1, 4)
    solution20210404(input, moves)
}