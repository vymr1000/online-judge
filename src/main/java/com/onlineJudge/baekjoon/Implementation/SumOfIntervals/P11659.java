package com.onlineJudge.baekjoon.Implementation.SumOfIntervals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  백준 S4 구간 합 구하기4
 *  https://www.acmicpc.net/problem/11659
 *
 * */
public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 문자열을 입력 받는다. 공백을 기준으로 문자열 split한다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[N+1];

        // 문자열을 입력 받는다. 공백을 기준으로 문자열 split한다.
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int i = 0; i < M; i++) {
            // 문자열을 입력 받는다. 공백을 기준으로 문자열 split한다.
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            int k = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[k] - S[j-1]);
        }
    }
}
