package com.dong.algorithm.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test4Test {


    @Test
    void test() {
        int a = 4;
        int b = 4;
        int c = 0;
        int d = 2;
        int e = 1;
        int f = 2;

        boolean result =new Test4().solution(a,b,c,d,e,f);

        assertTrue(result);
    }
    @Test
    void test1() {
        int a = 3;
        int b = 3;
        int c = 3;
        int d = 2;
        int e = 2;
        int f = 2;

        boolean result =new Test4().solution(a,b,c,d,e,f);

        assertTrue(result);
    }
    @Test
    void test2() {
        int a = 2;
        int b = 2;
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 2;

        boolean result =new Test4().solution(a,b,c,d,e,f);

        assertFalse(result);
    }
}