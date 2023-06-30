package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 백준 : 에너지 드링크
 * 링크 : https://www.acmicpc.net/problem/20115
 */
public class _20115 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] drinks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxIndex =0;
        for ( int i=1; i< drinks.length; i++){
            if( drinks[maxIndex] < drinks[i]) {
                maxIndex = i;
            }
        }

        double sum = 0;
        for(int i =0; i< drinks.length; i++) {
            if( i == maxIndex) {
                continue;
            }
            sum += drinks[i] / 2.0;
        }
        sum += drinks[maxIndex];
        System.out.println(sum);
        br.close();
    }
}
