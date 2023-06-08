package com.dong.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AssignmentProgressTest {

    AssignmentProgress assignmentProgress = new AssignmentProgress();



    @Test
    public void progressTestCase1() {
        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        String[] result = {"korean", "english", "math"};

        String[] solutionResult = assignmentProgress.solution(plans);

        assertArrayEquals(result, solutionResult);
    }

    @Test
    public void progressTestCase2() {
        String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        String[] result = {"science", "history", "computer", "music"};

        String[] solutionResult = assignmentProgress.solution(plans);

        assertArrayEquals(result, solutionResult);
    }
    @Test
    public void progressTestCase3() {
        String[][] plans = {{"aaa", "12:00", "20"}, {"bbb", "12:10", "30"}, {"ccc", "12:40", "10"}};
        String[] result = {"bbb", "ccc", "aaa"};

        String[] solutionResult = assignmentProgress.solution(plans);

        assertArrayEquals(result, solutionResult);
    }

}