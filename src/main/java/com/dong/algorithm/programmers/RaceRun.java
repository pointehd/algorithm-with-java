package com.dong.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스: 달리기 경주
 * 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/178871
 */
public class RaceRun {

    /**
     * TestCase 10, 11, 12, 13 시간초과
     * */
    public String[] solution(String[] players, String[] callings) {
        for (String calling : callings) {
            for (int i = 0; i< players.length; i++) {
                if(calling.equals(players[i])) {
                    String tmp = players[i];
                    players[i] = players[i-1];
                    players[i-1] = tmp;
                    break;
                }
            }
        }
        return players;
    }

    /**
     *
     * */
    public String[] solution2(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        for(int i=0; i< players.length; i++){
            playerMap.put(players[i], i);
        }

        for (String calling : callings) {
            int callingIndex = playerMap.get(calling);

            playerMap.put(players[callingIndex-1], callingIndex);
            playerMap.put(calling, callingIndex-1);

            players[callingIndex] = players[callingIndex-1];
            players[callingIndex-1] = calling;
        }
        return players;
    }
}
