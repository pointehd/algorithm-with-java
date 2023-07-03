package com.dong.algorithm.other.testz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Test1Test {


    @Test
    void test() {
        long n = 2;
        long result =3;
        long solutionResult = new Test1().solution(n);

        Assertions.assertEquals(result, solutionResult);
    }
}
