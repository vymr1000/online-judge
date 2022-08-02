package com.onlineJudge.programmers.implementation.Traffic;

import java.util.ArrayList;
import java.util.List;



public class Traffic {

    public int solution(String[] lines) {
        int answer = 0;
        List<Jobs> jobs = new ArrayList<Jobs>();
        List<Double> tps = new ArrayList<>();

        // 완료시간을 초로 바꿔주기 위한 코드
        for (String s : lines) {
            String logs = s.substring(11).replace(":", "").replace("s", "");
            int sec = Integer.parseInt(logs.substring(0,2)) * 3600
                     + Integer.parseInt(logs.substring(2,4)) * 60
                     + Integer.parseInt(logs.substring(4,6));

            String[] executeInfo = (sec + logs.substring(6)).split(" ");
            double endTime = Double.parseDouble(executeInfo[0]);
            double executeTime = Double.parseDouble(executeInfo[1]);
            double startTime = endTime - executeTime + 0.001;
            jobs.add(new Jobs(startTime, endTime));
        }

        for (int i=0; i< lines.length; i++) {
            answer = 0;
            double range = jobs.get(i).startTime + 1;
            for (int j=0; j<lines.length; j++) {
                if(jobs.get(j).endTime < range && jobs.get(j).startTime >= jobs.get(i).startTime
                || jobs.get(j).endTime < range && jobs.get(j).endTime >= jobs.get(i).startTime
                || jobs.get(j).endTime >= range && jobs.get(j).startTime <= jobs.get(i).startTime) {
                    System.out.println(jobs.get(j).startTime + " - " + jobs.get(j).endTime);
                    answer += 1;
                }
            }
            System.out.println(answer);
        }

        System.out.println(answer);
        return answer;
    }

    // 샐힝시간을 담는 클래스
    class Jobs {
        double startTime;
        double endTime;

        public Jobs(double startTime, double endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
