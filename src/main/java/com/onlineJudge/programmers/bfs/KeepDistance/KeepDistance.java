package com.onlineJudge.programmers.bfs.KeepDistance;

import java.util.LinkedList;
import java.util.Queue;

/*
 *  프로그래머스 LEVEL 2 거리두기 확인하기
 *  https://school.programmers.co.kr/learn/courses/30/lessons/81302
 *
 * */
public class KeepDistance {

    public int[] solution(String[][] places) {
        int params = places.length;
        int[] answer = new int[params];

        for(int i=0; i<params; i++) {
            String[] place = places[i];
            int len = place.length;
            boolean isFalse = true;
            for(int r=0; r<len; r++) {
                for(int c=0; c<len; c++) {
                    // 탐색의 시작점은 'P' 일떄
                    if (place[r].charAt(c) == 'P') {
                        // BFS 탐색 메소드 호출
                        if(!bfs(r, c, place)) {
                            isFalse = false;
                        }
                    }
                }
            }
            answer[i] = isFalse ? 1 : 0;
        }

        return answer;
    }

    // BFS 탐색 메소드
    public boolean bfs(int r, int c, String[] place) {
        int[] DR = {-1, 1, 0, 0};
        int[] DC = {0, 0, -1, 1};
        // 인접 방문 위치를 담을 큐
        Queue<Pos> q = new LinkedList<>();
        // 최초 탐색 시작 위치 r, c를 담는다
        q.offer(new Pos(r, c));

        // 인접 위치를 담을 큐가 소진될 까지 반복
        while(!q.isEmpty()) {
            Pos cur = q.poll();
            for(int i=0; i<4; i++) {
                int nextr = cur.r + DR[i];
                int nextc = cur.c + DC[i];

                // 각 좌표는 범위를 넘지 않으며 시작위치는 스킵한다
                if(nextr < 0
                        || nextr >= 5
                        || nextc < 0
                        || nextc >= 5
                        || (nextr == r && nextc == c)
                ) {
                    continue;
                }

                // 거리를 구하는 공식
                int d = Math.abs(nextr - r) + Math.abs(nextc - c);

                // 좌표간 거리가 2이하면서 P가 근처에 있다면 문제가 요구하는 거리두기 요건에 어긋나는 것
                if (place[nextr].charAt(nextc) == 'P' && d <= 2) {
                    return false;
                }
                // 'O'라면 해당 위치를 담아 탐색한다
                else if (place[nextr].charAt(nextc) == 'O' && d < 2) {
                    q.offer(new Pos(nextr, nextc));
                }
            }
        }
        return true;
    }

    // 2차원 배열 위치를 담는 클래스
    static class Pos {
        int r;
        int c;

        public Pos(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

}
