package com.dong.algorithm.other.testz;

import java.util.ArrayList;
import java.util.List;

class Test4 {

    long[][] grid = null;

    public int[] solution(long[][] grid) {
        int[][] type = {
                {-1, -1},
                {1, 1},
                {-1, 1},
                {1, -1}
        };

        this.grid = grid;
        int height = grid.length;
        int width = grid[0].length;
        int count = height * width;
        int maxResult = 1;
        int max = Math.min(height, width) / 2;

        int size = 1;

        List<List<int[]>> dp = new ArrayList<>();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

            }
        }
        int[] result = {maxResult, count};
        return result;
    }

    public boolean match(int startWidth, int startHeight, int size, int[] type) {

        return true;
    }
}
