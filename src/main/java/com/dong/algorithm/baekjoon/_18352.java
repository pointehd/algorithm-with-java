package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

/**
 * 백준: 특정 거리의 도시 찾기
 * link : https://www.acmicpc.net/problem/18352
 */
public class _18352 {


    /**
     * Memory : 340,104 KB
     * RunTime :1,292 ms
     * 다른사람 코드는 우선 순위 큐를 이용하여 결과 값을 도출했음.
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        var st = new StringTokenizer(line);

        int cityCount = Integer.parseInt(st.nextToken());
        int nodeCount = Integer.parseInt(st.nextToken());
        int distinct = Integer.parseInt(st.nextToken());
        int startCity = Integer.parseInt(st.nextToken());

        int[] cityDistinctArray = new int[cityCount + 1];
        List<List<Integer>> metrix = new ArrayList<>();
        IntStream.range(0, cityCount + 1).forEach((i) -> {
            metrix.add(new ArrayList<>());
        });

        for (int i = 0; i < nodeCount; i++) {
            String[] startAndEnd = br.readLine().split(" ");
            int start = Integer.parseInt(startAndEnd[0]);
            int end = Integer.parseInt(startAndEnd[1]);
            metrix.get(start).add(end);
        }

        // bfs
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startCity);
        cityDistinctArray[startCity] = 1;
        while (!queue.isEmpty()) {
            int now = queue.poll();
            if(cityDistinctArray[now] > distinct){
                continue;
            }
            for (int num : metrix.get(now)) {
                if (cityDistinctArray[num] == 0) {
                    queue.add(num);
                    cityDistinctArray[num] = cityDistinctArray[now] +1;
                }
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for(int i =0; i<= cityCount; i++) {
            if(cityDistinctArray[i] == distinct+1) {
                resultBuilder.append(i).append("\n");
            }
        }
        System.out.println(resultBuilder.length() == 0 ? "-1": resultBuilder);
        br.close();
    }
}
