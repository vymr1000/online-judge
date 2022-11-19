package com.onlineJudge.baekjoon.Search.ConnectedElements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 *  백준 S2 연결요소의 개수 - DFS
 *  https://www.acmicpc.net/problem/11724
 *
 * */
public class P11724 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;

        // 노드 배열, 방문 배열 선언 및 초기화
        ArrayList<Integer>[] A = new ArrayList[N+1];
        boolean[] visited = new boolean[N+1];

        for (int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<>();
        }

        // 무방향그래프 세팅
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            A[v1].add(v2);
            A[v2].add(v1);
        }

        // 시작점 설정 - DFS 탐색
        for (int i = 1; i < N+1; i++) {
            if (!visited[i]) {
                dfs(A, visited, i);
                answer++;
            }
        }

        System.out.println(answer);

    }

    private static void dfs(ArrayList<Integer>[] A, boolean[] visited, int v) {
        if (visited[v]) return;
        visited[v] = true;

        for (int node: A[v]) {
            if (!visited[node]) {
                dfs(A, visited, node);
            }
        }
    }
}
