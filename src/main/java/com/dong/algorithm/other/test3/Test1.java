package com.dong.algorithm.other.test3;

class Test1 {
    public int solution(int[][] p) {
        int count = 0;

        int[][] matchGraph = new int[1001][1001];
        for (int[] array : p) {
            matchGraph[array[0]][array[1]] = 1;
            if(matchGraph[array[1]][array[0]] == 1) {
                count++;
            }
        }

        return count;
    }
}
