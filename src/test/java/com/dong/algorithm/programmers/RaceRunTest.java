package com.dong.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceRunTest {

    RaceRun raceRun = new RaceRun();

    @Test
    public void testSolution() {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result ={"mumu", "kai", "mine", "soe", "poe"};

        String[] solutionResult = raceRun.solution2(players, callings);

        assertArrayEquals(solutionResult, result);
    }

}