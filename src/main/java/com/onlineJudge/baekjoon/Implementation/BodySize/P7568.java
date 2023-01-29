package com.onlineJudge.baekjoon.Implementation.BodySize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7568 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] bodies = new int[N][2];
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			bodies[i][0] = Integer.parseInt(st.nextToken());
			bodies[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				if (bodies[j][0] > bodies[i][0]
					&& bodies[j][1] > bodies[i][1]) {
					rank += 1;
				}
			}
			result.append(rank).append(" ");
		}
		System.out.println(result);
	}
}
