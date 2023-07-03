package com.dong.algorithm.other.testz;

class Test1 {
    public long solution(long n) {
        long answer = 0;
        long i = n + 1;
        int remainder = 1;
        while(i < 100_000) {
            if( remainder == n) {
                break;
            }
            answer += i;
            i += n+1;
            remainder++;
        }
        return answer;
    }
}
