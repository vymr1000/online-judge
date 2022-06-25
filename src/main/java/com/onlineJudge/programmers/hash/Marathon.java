package com.onlineJudge.programmers.hash;

import java.util.Map;
import java.util.HashMap;

public class Marathon {
    public String solution(String[] p, String[] c) {
        String answer = "";
        Map<String, Integer> runners = new HashMap<>();
        for (String e : p) {
            runners.put(e, runners.getOrDefault(e, 0) + 1);
        }

        for (String e : c) {
            if (runners.containsKey(e)) {
                runners.put(e, runners.get(e)-1);
            }
        }

        for( String e: runners.keySet() ){
            if (runners.get(e) == 1) {
                answer = e;
            }
        }
        return answer;
    }
}