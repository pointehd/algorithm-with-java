package com.dong.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _의상Test {

    @Test
    public void test1() {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int result = 5;

        int solutionResult = _의상.solution(clothes);
        assertEquals(result, solutionResult);
    }


    @Test
    public void test2() {
        String[][] clothes =  {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int result = 3;

        int solutionResult = _의상.solution(clothes);
        assertEquals(result, solutionResult);

    }


}