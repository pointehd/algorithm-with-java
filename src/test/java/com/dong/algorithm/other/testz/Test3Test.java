package com.dong.algorithm.other.testz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    @Test
    void test() {
        int[] histogram = {2,2,2,3};
        int result = 4;
        int solutionResult = new Test3().solution(histogram);
        assertEquals(result, solutionResult);
    }

    @Test
    void test1() {
        int[] histogram = {6,5,7,3,4,2};
        int result = 12;
        int solutionResult = new Test3().solution(histogram);
        assertEquals(result, solutionResult);
    }

}