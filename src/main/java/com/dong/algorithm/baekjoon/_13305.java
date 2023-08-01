package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 백준 : https://www.acmicpc.net/problem/13305
 * 주유소
 */
class _13305 {


    private static void solution(int node, List<Long> distances, List<Long> nodeOilPrice) {
        long minPrice = nodeOilPrice.get(0);
        long price = 0;
        for (int i = 0; i < node - 1; i++) {
            if (minPrice > nodeOilPrice.get(i)) {
                minPrice = nodeOilPrice.get(i);
            }
            price += (minPrice * distances.get(i));

        }
        System.out.println(price);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nodeSize = Integer.parseInt(br.readLine());
        List<Long> distances = Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toList();
        List<Long> nodeOilPrice = Arrays.stream(br.readLine().split(" "))
                .map(Long::parseLong)
                .toList();

        solution(nodeSize, distances, nodeOilPrice);
    }
}
