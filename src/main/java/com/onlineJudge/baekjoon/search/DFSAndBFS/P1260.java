package com.onlineJudge.baekjoon.search.DFSAndBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 *  백준 S2 DFS와 BFS
 *  https://www.acmicpc.net/problem/1260
 *
 * */
public class P1260 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        // 노드 배열, 방문 배열 선언 및 초기화
        ArrayList<Integer>[] A = new ArrayList[N+1];
        boolean[] visited;

        for (int i = 1; i < N+1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(bf.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            A[v1].add(v2);
            A[v2].add(v1);
        }

        for (int i = 1; i < N+1; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[N+1];
        dfs(A, visited, start);
        System.out.println();

        visited = new boolean[N+1];
        bfs(A, visited, start);
        System.out.println();

    }

    private static void dfs(ArrayList<Integer>[] A, boolean[] visited, int v) {
        if (visited[v]) return;
        visited[v] = true;
        System.out.print(v + " ");
        for (int node: A[v]) {
            if (!visited[node]) {
                dfs(A, visited, node);
            }
        }
    }

    private static void bfs(ArrayList<Integer>[] A, boolean[] visited, int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int cur = queue.poll();
            System.out.print(cur + " ");

            for (int node: A[cur]) {
                if (!visited[node]) {
                    visited[node] = true;
                    queue.offer(node);
                }
            }
        }
    }
}
