package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 백준 : N번째 큰 수
 * link : https://www.acmicpc.net/problem/2075
 * */
public class _2075 {

    /**
     * Memory: 354,428 KB
     * Time : 1,040 ms
     * 이게 맞네?? 조건들 다무시하고 했는데.. 성능은 좋지 않지만 다른 코드를 봐도 크게 차이 나지 않는다.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            Arrays.stream(br.readLine().split(" ")).map(Long::parseLong).forEach(queue::add);
        }

        for (int i = 0; i < n-1; i++) {
            queue.poll();
        }

        System.out.println(queue.poll());
        br.close();
    }


    public void otherSolution() throws IOException {

        var br = new BufferedReader(new InputStreamReader(System.in));
        var queue = new PriorityQueue<Integer>();
        var numberOfLine = Integer.parseInt(br.readLine());

        var stack = new Stack<String>();
        for(int i = 0 ; i < numberOfLine; i++){
            stack.push(br.readLine());
        }

        for(int j = 0 ; j < numberOfLine; j++){
            var st = new StringTokenizer(stack.pop());
            if(j == 0){
                for(int i = 0; i < numberOfLine; i++){
                    var element = Integer.parseInt(st.nextToken());
                    queue.offer(element);
                }
                continue;
            }

            var flagCount = 0;
            for(int i = 0 ; i < numberOfLine; i++){
                var element = Integer.parseInt(st.nextToken());
                if(queue.peek() > element){
                    flagCount++;
                    continue;
                }
                queue.offer(element);
                queue.poll();
            }
            if(flagCount == numberOfLine){
                break;
            }
        }

        System.out.println(queue.poll());

    }
}
