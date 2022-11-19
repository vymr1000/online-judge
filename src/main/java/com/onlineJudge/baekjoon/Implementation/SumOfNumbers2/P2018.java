package com.onlineJudge.baekjoon.Implementation.SumOfNumbers2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  백준 S5 수들의 합 5
 *  https://www.acmicpc.net/problem/2018
 *
 * */
public class P2018 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int num = Integer.parseInt(st.nextToken());
		int j;
		int count = 1;
		int[] arr = new int[num+1];
		for (int i = 1; i <= num; i++) {
			arr[i] = i;
		}

		for (int i = 1; i <= num; i++) {
			int sum = arr[i];
			j = i + 1;
			while(sum < num) {
				sum += arr[j];
				if (sum == num) {
					count += 1;
				}
				j += 1;
			}
		}
		System.out.println(count);
	}
}
