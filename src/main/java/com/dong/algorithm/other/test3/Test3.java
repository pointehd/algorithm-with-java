package com.dong.algorithm.other.test3;

public class Test3 {

    static int MAX_NODE = 32;

    public int solution(String S1, String S2) {
        int answer = 0;
        int[][] s1Map = new int[MAX_NODE][MAX_NODE];
        int[][] s2Map = new int[MAX_NODE][MAX_NODE];

        return answer;
    }

    class Image32 {
        int[][] map;

        public Image32(String quadTree) {
            this.map = new int[MAX_NODE][MAX_NODE];
            String[] commends = quadTree.split("");
            int commendInx = 0;
        }

        private void commandIdx(String[] commands, int index, int size) {
            if(index > commands.length) {
                return;
            }
            String commend = commands[index];
            if (commend.equals('p')) {

            }
        }

        public void print() {
            for (int[] row : map) {
                for (int num : row) {
                    System.out.print(num);
                }
                System.out.println();
            }
        }


    }
}
