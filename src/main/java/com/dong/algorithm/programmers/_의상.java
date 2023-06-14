package com.dong.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스: 의상
 * link : https://school.programmers.co.kr/learn/courses/30/lessons/42578
 */
public class _의상 {

    public static int solution(String[][] clothes) {
        Map<String, Integer> clothCollector = new HashMap<>();
        for (String[] cloth : clothes) {
            clothCollector.put(cloth[1], clothCollector.getOrDefault(cloth[1], 0) + 1);
        }
        int result = 1;
        for (Map.Entry<String, Integer> cloth : clothCollector.entrySet()) {
            result *= cloth.getValue() + 1;
        }
        return result - 1;
    }
}
