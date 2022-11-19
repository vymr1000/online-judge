package com.onlineJudge.baekjoon.DataStructure.AbsHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 *  백준 S1 절대값 힙
 *  https://www.acmicpc.net/problem/11286
 *
 * */
public class P11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int abs1 = Math.abs(o1);
			int abs2 = Math.abs(o2);
			if (abs1 == abs2) {
				return o1 < o2 ? -1 : 1;
			} else  {
				return abs1 - abs2;
			}
		});

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(bf.readLine());
			if (num == 0) {
				if (pq.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(num);
			}
		}
	}
}
