package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 백준 : 최대 힙
 * https://www.acmicpc.net/problem/11279
 */
public class _11279 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            int lineNum = Integer.parseInt(br.readLine());
            if (lineNum == 0) {
                if (queue.isEmpty()) {
                    result.append("0\n");
                } else {
                    result.append(queue.poll()).append("\n");
                }
            }else {
                queue.add(lineNum);
            }
        }
        System.out.println(result);
        br.close();
    }
}
