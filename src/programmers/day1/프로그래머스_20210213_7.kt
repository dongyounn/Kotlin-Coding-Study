import kotlin.math.abs
class Solution {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var rHand = intArrayOf(3,0)
        var lHand = intArrayOf(3,2)
        var r = 0
        var l = 0
        for (i in numbers){
            var target = intArrayOf()
            target = if (i == 0){
                intArrayOf(3,1)
            } else {
                intArrayOf( (i-1)/3 , (i-1)%3 )
            }
            if (target[1] == 0){
                lHand = target
                answer += "L"
            } else if (target[1]==2){
                rHand = target
                answer += "R"
            }
            else{
                l = abs(lHand[0] - target[0]) + abs(lHand[1] - target[1])
                r = abs(rHand[0] - target[0]) + abs(rHand[1] - target[1])
                if (l < r) {
                    lHand = target
                    answer += "L"
                } else if (r < l){
                    rHand = target
                    answer += "R"
                }
                else{
                    if(hand == "right") {
                        rHand = target
                        answer += "R"
                    }
                    else {
                        lHand = target
                        answer += "L"
                    }
                }
            }
        }

        return answer
    }
}