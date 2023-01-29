package com.onlineJudge.baekjoon.Search.MeetingRoom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 *  백준 S1 회의실배정
 *  https://www.acmicpc.net/problem/1931
 *
 * */
public class P1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][2];
		int count = 1;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			A[i][0] = Integer.parseInt(st.nextToken());
			A[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(A, (o1, o2) -> {
			if(o1[1] == o2[1]) {
				return o1[0] - o2[0];
			}
			return o1[1] - o2[1];
		});

		int end = A[0][1];
		for (int i = 1; i < N; i++) {
			if(A[i][0] >= end) {
				end = A[i][1];
				count += 1;
			}
		}
		System.out.println(count);
	}
}
