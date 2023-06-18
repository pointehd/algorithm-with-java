package com.dong.algorithm.other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {


    @Test
    void test() {
        int[] numbers = {10,40,30,20};
        int k = 20;
        int result = 1;
        int solutionResult = new Test3().solution(numbers, k);

        assertEquals(result, solutionResult);
    }

}