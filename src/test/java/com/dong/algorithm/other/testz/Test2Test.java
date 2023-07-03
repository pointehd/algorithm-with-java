package com.dong.algorithm.other.testz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {

    @Test
    void test() {
        int[][] data = {{1, 0, 5},
                {2, 2, 2},
                {3, 3, 1},
                {4, 4, 1},
                {5, 10, 2}
        };
        int[] result = {1, 3, 4, 2, 5};
        int[] solutionResult = new Test2().solution(data);

        assertArrayEquals(result, solutionResult);
    }

    @Test
    void test1() {
        int[][] data = {
                {1, 0, 3}, {2, 1, 3}, {3, 3, 2}, {4, 9, 1}, {5, 10, 2}
        };
        int[] result = {1, 3, 2, 4, 5};
        int[] solutionResult = new Test2().solution(data);

        assertArrayEquals(result, solutionResult);
    }

    @Test
    void test2() {
        int[][] data = {
                {1, 2, 10}, {2, 5, 8}, {3, 6, 9}, {4, 20, 6}, {5, 25, 5}
        };
        int[] result = {1, 2, 4, 5, 3};
        int[] solutionResult = new Test2().solution(data);

        assertArrayEquals(result, solutionResult);
    }

}