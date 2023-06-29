package com.dong.algorithm.other.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test3Test {

    @Test
    void test() {
        String s1 = "ppwwwbpbbwwbw";
        String s2 = "pwdbwpwwbw";
        int answer = 640;
        int solutionAnswer = new Test3().solution(s1, s2);

        assertEquals(answer, solutionAnswer);
    }

    @Test
    void test1() {
        String s1 = "b";
        String s2 = "w";
        int answer = 1024;
        int solutionAnswer = new Test3().solution(s1, s2);

        assertEquals(answer, solutionAnswer);
    }

}