package com.dong.algorithm.other.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test1Test {


    @Test
    void test() {
        int[][] p ={{1,3}, {3,1},{3,5},{2,5},{5,3}};
        int r = 2;
        int result = new Test1().solution(p);
        assertEquals(r, result);
    }

}