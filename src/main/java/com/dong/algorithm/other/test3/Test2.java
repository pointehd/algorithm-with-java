package com.dong.algorithm.other.test3;

class Test2 {

    public int solution(String[] moves) {
        int answer = 0;
        int[][] map = new int [2002][2002];

        int startX= 1000;
        int startY = 1000;

        map[startY][startX] = 1;
        for(String move: moves) {
            switch (move) {
                case "U" -> {
                    startY -= 2;
                    map[startY + 1][startX] = 1;
                }
                case "D" -> {
                    startY += 2;
                    map[startY - 1][startX] = 1;
                }
                case "L" -> {
                    startX -= 2;
                    map[startY][startX + 1] = 1;
                }
                case "R" -> {
                    startX += 2;
                    map[startY][startX - 1] = 1;
                }
                default -> {
                }
            }
            map[startY][startX] = 1;
        }


        for(int i=0; i< 2000; i++) {
            for(int j=0; j<2000; j++) {
                if(map[i][j] == 1
                        && map[i+1][j] ==1
                        && map[i+2][j] ==1
                        && map[i][j+1] ==1
                        && map[i][j+2] ==1
                        && map[i+2][j+1] ==1
                        && map[i+1][j+2] ==1
                        && map[i+2][j+2] ==1
                        ) {
                    answer +=1;
                }
            }
        }

        return answer;
    }

}
