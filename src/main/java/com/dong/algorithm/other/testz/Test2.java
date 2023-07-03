package com.dong.algorithm.other.testz;

import java.util.*;
import java.util.stream.Collectors;

class Test2 {
    public int[] solution(int[][] data) {
        int[] result = new int[data.length];
        List<int[]> list = new ArrayList<>(Arrays.stream(data).collect(Collectors.toList())); // .toList() java 16기능
        list.sort(Comparator.comparingInt(d -> d[1]));

        int time = list.get(0)[1];
        for (int i = 0; i < data.length; i++) {
            int index = 0;
            int[] target = list.get(index);
            for (int j = 1; j < list.size(); j++) {
                int[] tmp = list.get(j);
                if (time < tmp[1]) {
                    break;
                }
                if (target[2] > tmp[2]) {
                    target = tmp;
                    index = j;
                }
            }
            list.remove(index);
            time += target[2];
            result[i] = target[0];
        }
        return result;
    }
}
