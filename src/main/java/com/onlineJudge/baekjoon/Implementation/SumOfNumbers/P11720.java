package com.onlineJudge.baekjoon.Implementation.SumOfNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *  백준 B4 숫자의 합
 *  https://www.acmicpc.net/problem/11720
 *
 * */
public class P11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(st.nextToken());
		int result = 0;

		String num = bf.readLine();
		char[] array = num.toCharArray();

		for (char c : array) {
			result += c - '0';
		}
		System.out.println(result);
	}
}
