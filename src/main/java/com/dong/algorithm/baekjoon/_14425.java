package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 백준 : 문자열 집합
 * 링크 : https://www.acmicpc.net/problem/14425
 */
public class _14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] numStrArray = line.split(" ");
        int n = Integer.parseInt(numStrArray[0]);
        int m = Integer.parseInt(numStrArray[1]);


        Set<String> groups = new HashSet<>();

        int result = 0;
        for (int i = 0; i < n; i++) {
            groups.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            if (groups.contains(br.readLine())) {
                result++;
            }
        }
        System.out.println(result);

        br.close();
    }
}
