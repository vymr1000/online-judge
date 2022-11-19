package com.onlineJudge.baekjoon.DataStructure.Card2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
 *  백준 S4 카드2
 *  https://www.acmicpc.net/problem/2164
 *
 * */
public class P2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}
		System.out.println(queue.poll());
	}
}
