package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 백준 : 트리순회
 * 링크 : https://www.acmicpc.net/problem/1991
 *
 * 처음엔 나눠서 전위 중위 후위 를 따로 돌렸는데 한번에 다 가능하다.
 * */
public class _1991 {

    static StringBuilder sb1, sb2, sb3;

    public static List<String> solution(Tree root) {
        List<String> result = new ArrayList<>();
        sb1 = new StringBuilder();
        sb2 = new StringBuilder();
        sb3 = new StringBuilder();

        read(root);

        result.add(sb1.toString());
        result.add(sb2.toString());
        result.add(sb3.toString());

        return result;
    }

    /**
     * 처음엔 나눠했는데 한꺼번에 돌려도 가능하다.
     * */
    public static void read(Tree root) {
        if(root == null) {
            return ;
        }
        sb1.append(root.alpha);
        read(root.left);
        sb2.append(root.alpha);
        read(root.right);
        sb3.append(root.alpha);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeCount = Integer.parseInt(br.readLine());

        Map<String, Tree> treeMap = new HashMap<>();
        Tree root = new Tree("A");
        treeMap.put("A", root);
        for(int i =0; i< nodeCount; i++){
            String line = br.readLine();
            String[] nodes = line.split(" ");
            Tree parent = treeMap.get(nodes[0]);
            if(!nodes[1].equals(".")) {
                Tree left = new Tree(nodes[1]);
                treeMap.put(nodes[1], left);
                parent.setLeft(left);
            }
            if(!nodes[2].equals(".")) {
                Tree right = new Tree(nodes[2]);
                treeMap.put(nodes[2], right);
                parent.setRight(right);
            }
        }
        br.close();

        solution(root)
                .forEach(System.out::println);
    }


    static class Tree {
        String alpha;
        Tree left;
        Tree right;
        public Tree(String alpha) {
            this.alpha = alpha;
        }
        public void setLeft(Tree left) {
            this.left = left;
        }
        public void setRight(Tree right) {
            this.right = right;
        }
    }
}
