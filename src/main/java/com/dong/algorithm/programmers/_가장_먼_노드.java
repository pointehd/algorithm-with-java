package com.dong.algorithm.programmers;

import java.util.*;

/**
 * 프로그래머스 : 가장 먼 노드
 * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/49189
 */
public class _가장_먼_노드 {

    int[] nodeDistinct;

    public int solution2(int n, int[][] edges) {
        nodeDistinct = new int[n + 1];

        List<List<Integer>> nodeRelation = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            nodeRelation.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            nodeRelation.get(edge[0]).add(edge[1]);
            nodeRelation.get(edge[1]).add(edge[0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        nodeDistinct[1] = 1;
        queue.add(1);
        int max = 0;
        int maxCount = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int value : nodeRelation.get(node)) {
                if (nodeDistinct[value] == 0) {
                    nodeDistinct[value] = nodeDistinct[node] + 1;
                    queue.add(value);
                    if (max < nodeDistinct[value]) {
                        max = nodeDistinct[value];
                        maxCount = 1;
                    } else if (max == nodeDistinct[value]) {
                        maxCount++;
                    }
                    max = Math.max(nodeDistinct[value], max);
                }
            }
        }
        return maxCount;
    }

    /**
     * 테스트 8, 9 메모리초과
     */
    public int solution(int n, int[][] edges) {
        nodeDistinct = new int[n + 1];

        int[][] nodeRelation = new int[n + 1][n + 1];
        for (int[] edge : edges) {
            nodeRelation[edge[0]][edge[1]] = 1;
            nodeRelation[edge[1]][edge[0]] = 1;
        }

        Queue<Integer> queue = new LinkedList<>();
        nodeDistinct[1] = 1;
        queue.add(1);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (nodeRelation[node][i] == 1 && nodeDistinct[i] == 0) {
                    nodeDistinct[i] = nodeDistinct[node] + 1;
                    queue.add(i);
                }
            }
        }

        int max = Arrays.stream(nodeDistinct).max().getAsInt();
        long maxCount = Arrays.stream(nodeDistinct).filter((num) -> num == max).count();
        return (int) maxCount;
    }
}
