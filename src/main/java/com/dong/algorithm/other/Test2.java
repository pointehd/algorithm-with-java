package com.dong.algorithm.other;

import java.util.*;

public class Test2 {

    public Set<Integer> set;
    List<List<Node>> nodes;

    private static int[] DEFAULT_RESULT = {-1};

    public int[] solution(int n, int k, int[][] roads) {
        set = new HashSet<>();
        nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new ArrayList<>());
        }
        for (int[] road : roads) {
            int start = road[0];
            int end = road[1];
            int length = road[2];
            nodes.get(start).add(new Node(end, length));
            nodes.get(end).add(new Node(start, length));
        }
        findNextNodeBfsRecursive(0, k);
        List<Integer> checkNode = new ArrayList<>(set);
        int[] result = checkNode.stream().sorted().mapToInt(Integer::intValue).toArray();

        return checkNode.isEmpty() ? DEFAULT_RESULT : result;
    }

    public void findNextNodeBfsRecursive(int start, int time) {
        if (time == 0) {
            set.add(start);
            return;
        }
        if (time < 0) {
            return;
        }
        for (Node node : nodes.get(start)) {
            findNextNodeBfsRecursive(node.node, time - node.time);
        }
    }

    class Node {
        int node;
        int time;

        public Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
}
