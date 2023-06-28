package com.dong.algorithm.other;

class Test4 {

    public boolean solution(int a, int b, int c, int d, int e, int f) {
        int usableA = a - d;
        int usableB = b - e;
        int usableC = c - f;

        int sum = usableCount(usableA) + usableCount(usableB) + usableCount(usableC);
        return sum >= 0 ;
    }

    public int usableCount(int n) {
        if (n < 0) {
            return n;
        }
        return n / 2;
    }
}
