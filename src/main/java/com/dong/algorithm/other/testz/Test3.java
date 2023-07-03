package com.dong.algorithm.other.testz;

class Test3 {

    public int solution(int[] histogram) {
        int answer = -1;

        int size = histogram.length;
        for(int i =0; i< size -2; i++){
            for (int j =i+2; j < size; j++) {
                int width = j - i -1;
                int height = Math.min(histogram[i], histogram[j]);
                answer = Math.max(width * height, answer);
            }
        }
        return answer;
    }
}
