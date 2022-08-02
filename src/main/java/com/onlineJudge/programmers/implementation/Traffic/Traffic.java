package com.onlineJudge.programmers.implementation.Traffic;

/*
 *  프로그래머스 LEVEL 3 추석트래픽
 *  https://school.programmers.co.kr/learn/courses/30/lessons/17676
 *
 * */
public class Traffic {

    public int solution(String[] lines) {
        int answer = 0;

        int[] startJobs = new int[lines.length];
        int[] endJobs = new int[lines.length];

        for (int i = 0; i < lines.length; i++) {
            // logs = "2016-09-15 20:59:57.421 0.351s"
            String[] logs = lines[i].split(" ");
            // logTimes = "20:59:57.421"
            String[] times = logs[1].split(":");
            // 실행시간
            int executeTime = (int) (Double.parseDouble(logs[2].substring(0, logs[2].length()-1)) * 1000);

            // 시간을 초로 환산
            double HH = Double.parseDouble(times[0])*3600;
            double MM = Double.parseDouble(times[1])*60;
            double SS = Double.parseDouble(times[2]);

            endJobs[i] = (int) ((HH + MM + SS) * 1000);
            startJobs[i] = endJobs[i] - executeTime + 1;
        }

        for (int i = 0; i < lines.length; i++) {
            int endRange = endJobs[i];
            int cnt = 1;
            for (int j = i+1; j < lines.length; j++) {
                /*
                * 직전 job의 끝을 기준으로
                *   1. 반복문의 job이 진행중인지
                *   2. 반복문의 job이 끝난후 1초 사이에 시작된건지
                * */
                if(startJobs[j] <= endRange && endJobs[j] >= endRange
                        || startJobs[j] < endRange + 1000 ) {
                    cnt++;
                }
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

}
