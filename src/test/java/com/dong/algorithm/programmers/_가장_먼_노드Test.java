package com.dong.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _가장_먼_노드_Test {

    @Test
    public void test() {
        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int result = 3;

        int solutionResult = new _가장_먼_노드().solution2(n, vertex);

        assertEquals(result, solutionResult);
    }

}