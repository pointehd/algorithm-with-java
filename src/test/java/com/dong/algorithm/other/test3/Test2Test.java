package com.dong.algorithm.other.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2Test {


    @Test
    void test() {
        String[] moves = {"U","R","D","L","U","R","D","L"};
        int r = 1;
        int result = new Test2().solution(moves);

        assertEquals(r, result);
    }


    @Test
    void test1() {
        String[] moves = {
                "U",
                "U",
                "R",
                "D",
                "L",
                "L",
                "L",
                "U",
                "R",
                "D",
                "D",
                "D",
                "L",
                "U",
                "R",
                "R",
                "R",
                "D",
                "L",
                "U",
        };
        int r = 5;
        int result = new Test2().solution(moves);

        assertEquals(r, result);
    }

    @Test
    void test2() {
        String[] moves = {"U","R","D","L","U","R","D","L"};
        int r = 1;
        int result = new Test2().solution(moves);

        assertEquals(r, result);
    }

}