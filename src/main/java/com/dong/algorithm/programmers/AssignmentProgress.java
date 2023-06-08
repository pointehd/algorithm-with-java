package com.dong.algorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;


/**
 * 프로그래머스: 과제 진행하기
 * 문제 : https://school.programmers.co.kr/learn/courses/30/lessons/176962?language=java
 */
class AssignmentProgress {

    public String[] solution(String[][] plans) {
        List<String> result = new ArrayList<>();
        List<Assinment> assinmentList = new ArrayList<>();
        for (String[] plan : plans) {
            assinmentList.add(Assinment.of(plan));
        }

        assinmentList.sort(Comparator.comparingInt(a -> a.time));

        Stack<Assinment> stack = new Stack<>();
        int beforeTime = assinmentList.get(0).time;
        for (Assinment assinment : assinmentList) {
            int time = assinment.time - beforeTime;
            beforeTime = assinment.time;
            while (time != 0) {
                if (stack.empty()) {
                    break;
                }
                Assinment peek = stack.peek();
                time = time - peek.solvedTime;
                if (time < 0) {
                    peek.solvedTime = -time;
                    time = 0;
                } else {
                    Assinment pop = stack.pop();
                    result.add(pop.name);
                }
            }
            stack.push(assinment);
        }
        while (!stack.empty()) {
            Assinment pop = stack.pop();
            result.add(pop.name);
        }

        return result.toArray(new String[0]);
    }

    static class Assinment {
        String name;
        int time;
        int solvedTime;

        public Assinment(String name, int time, int solvedTime) {
            this.name = name;
            this.time = time;
            this.solvedTime = solvedTime;
        }

        public static Assinment of(String[] plan) {
            String[] times = plan[1].split(":");
            return new Assinment(plan[0], Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]), Integer.parseInt(plan[2]));
        }

        @Override
        public String toString() {
            return String.format("%s %s %s", name, time, solvedTime);
        }
    }
}
