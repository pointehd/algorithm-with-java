package com.dong.algorithm.baekjoon;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _11725Test {


    @Test
    public void test1() {
        int size = 8;
        List<Integer> numList = List.of(4, 3, 6, 8, 7, 5, 2, 1);
        List<String> result = List.of("+", "+", "+", "+", "-", "-", "+", "+", "-", "+", "+", "-", "-", "-", "-", "-");

        List<String> solutionResult = _11725.solution(size, numList);
        assertIterableEquals(result, solutionResult);
    }

    @Test
    public void test2() {
        int size = 5;
        List<Integer> numList = List.of(1,2,5,3,4);
        List<String> result = List.of("NO");

        List<String> solutionResult = _11725.solution(size, numList);

        assertIterableEquals(result, solutionResult);
    }


}

