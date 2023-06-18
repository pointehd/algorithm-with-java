package com.dong.algorithm.other;

public class Test1 {

    public int solution(long n) {
        long digits = 1;
        long count = 9;
        long start = 1;

        while (n > count * digits) {
            n -= count * digits;
            digits += 1;
            count *= 10;
            start *= 10;
        }
        long num = start + (n-1) / digits;
        long digitIndex = ((n-1) % digits);

        long result = 0;
        for (int i=0; i< digits - digitIndex; i++){
            result = num % 10;
            num /= 10;
        }
        return (int)result;
    }

}
