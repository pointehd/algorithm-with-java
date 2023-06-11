package com.dong.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectIslandsTest {

    @Test
    public void testConnectIslands() {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};
        int result = 4;

        int solutionResult = ConnectIslands.solution(n, costs);
        assertEquals(result, solutionResult);
    }

}