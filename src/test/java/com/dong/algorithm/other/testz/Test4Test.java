package com.dong.algorithm.other.testz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4Test {

    @Test
    void test() {
        long[][] grid = {
                {2, 1, 1, 3, 5, 1},
                {1, 1, 3, 3, 5, 5},
                {8, 3, 3, 3, 1, 5},
                {3, 3, 3, 4, 4, 4},
                {3, 3, 4, 4, 4, 4},
                {1, 4, 4, 4, 4, 4}};
        int[] result = {3, 2};
        int[] solutionResult = new Test4().solution(grid);
        assertArrayEquals(result, solutionResult);
    }

    @Test
    void test1() {
        long[][] grid = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};
        int[] result = {1, 9};
        int[] solutionResult = new Test4().solution(grid);
        assertArrayEquals(result, solutionResult);
    }


    @Test
    void test2() {
        long[][] grid = {
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int[] result = {2, 4};
        int[] solutionResult = new Test4().solution(grid);
        assertArrayEquals(result, solutionResult);
    }


    }