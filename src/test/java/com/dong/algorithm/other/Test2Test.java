package com.dong.algorithm.other;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    @Test
    void test() {
        int n = 6;
        int k = 17;
        int[][] roads = {{5, 4, 6}, {5, 2, 5}, {0, 4, 2}, {2, 3, 3}, {1, 2, 7}, {0, 1, 3}};
        int[] result = {1, 2, 3};

        int[] solutionResult = new Test2().solution(n, k, roads);

        Arrays.stream(solutionResult).forEach(System.out::println);

        assertArrayEquals(result, solutionResult);
    }

}