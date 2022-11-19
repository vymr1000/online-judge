package com.onlineJudge.baekjoon.Implementation.SumOfIntervals2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  백준 S1 구간 합 구하기5
 *  https://www.acmicpc.net/problem/11660
 *
 * */
public class P11660 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] nums = new int[1025][1025];
		int[][] S = new int[1025][1025];
		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 1; j <= M; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= M; j++) {
				S[i][j] = S[i-1][j] + S[i][j-1] - S[i-1][j-1] + nums[i][j];
			}
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int result = 0;

			result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
			System.out.println(result);
		}


	}
}
