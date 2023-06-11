package com.dong.algorithm.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 : 섬 연결하기
 * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42861
 *
 * Kruskal 알고리즘을 이용한 구현
 * */
public class ConnectIslands {
    static int[] nodes;

    public static int solution(int n, int[][] costs) {
        int result = 0;
        nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = i;
        }


        Arrays.sort(costs, (o1, o2) -> o1[2] - o2[2]);

        int count = 0;
        for(int[] cost : costs){
            if(nodes[cost[0]] != nodes[cost[1]]) {
                result += cost[2];
                count ++;
                nodeCheck(nodes[cost[0]], nodes[cost[1]]);
            }
            if(count == n-1){
                break;
            }
        }

        return result;
    }

    public static void nodeCheck(int before, int after) {
        for (int i=0; i< nodes.length; i++){
            if(before == nodes[i]) {
                nodes[i] = after;
            }
        }
    }
}
