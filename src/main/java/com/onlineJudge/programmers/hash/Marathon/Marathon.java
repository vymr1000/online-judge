package com.onlineJudge.programmers.hash.Marathon;

import java.util.Map;
import java.util.HashMap;

/*
* 프로그래머스 LEVEL 1 완주하지 못한 선수
* https://school.programmers.co.kr/learn/courses/30/lessons/42576
*
* */
public class Marathon {
    public String solution(String[] p, String[] c) {
        String answer = "";
        Map<String, Integer> runners = new HashMap<>();

        // 중복을 허용하기 때문에 getOrDefault 메소드로 값을 가져와 1을 더해준다
        for (String e: p) {
            runners.put(e, runners.getOrDefault(e, 0) + 1);
        }

        // 완주자를 containsKey 메소드로 체크하고 값을 가져가 1을 빼준다
        for (String e: c) {
            if (runners.containsKey(e)) {
                runners.put(e, runners.get(e)-1);
            }
        }

        // 문제에서의 조건이 완주하지 못한 선수는 단 한명이라는 조건이 있다.
        for(String e: runners.keySet()){
            if (runners.get(e) == 1) {
                answer = e;
            }
        }
        return answer;
    }
}