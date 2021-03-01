package study.programmers.utils

// 최대공약수 계산 함수
fun gcd(a: Int, b: Int): Int {
    return if (a.rem(b) == 0) {
        b
    } else
        gcd(b, a.rem(b))
}

// 최소공배수 계산 함수
fun lcm(a: Int, b: Int): Int {
    return a.times(b).div(gcd(a, b))
}