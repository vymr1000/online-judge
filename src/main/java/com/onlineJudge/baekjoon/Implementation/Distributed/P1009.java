package com.onlineJudge.baekjoon.Implementation.Distributed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  백준 B2 분산처리
 *  https://www.acmicpc.net/problem/1009
 *
 * */
public class P1009 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		long T = Integer.parseInt(st.nextToken());
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(bf.readLine());
			long A = Integer.parseInt(st.nextToken());
			long B = Integer.parseInt(st.nextToken());
			long result = A;
			B = B % 4 + 4;
			for (int j = 2; j <= B; j++) {
				result = (result * A) % 10;
			}
			if (result == 0) {
				result = 10;
			}
			System.out.println(result);
		}
	}
}
