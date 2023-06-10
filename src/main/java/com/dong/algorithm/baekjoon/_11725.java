package com.dong.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * 백준 : https://www.acmicpc.net/problem/1874
 * */
public class _11725 {

    public static List<String> solution(int size, List<Integer> numberList) {
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 1; i <= size; i++) {
            stack.push(i);
            result.add("+");
            while (!stack.isEmpty() && numberList.get(index).equals(stack.peek())) {
                stack.pop();
                result.add("-");
                index += 1;
            }
        }
        if (!stack.isEmpty()) {
            return List.of("NO");
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputNumbers = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            inputNumbers.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        List<String> results = solution(count, inputNumbers);
        results.forEach(System.out::println);
    }
}
