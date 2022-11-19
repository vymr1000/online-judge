package com.onlineJudge.baekjoon.DataStructure.MaxHeap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
 *  백준 S2 최대힙
 *  https://www.acmicpc.net/problem/11279
 *
 * */
public class P11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		/*
		o1 < o2 형태
		음수: o1 o2 순서
		0: 두 개의 원소가 같은 경우
		양수: o2 o1 순서
		* */
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 < o2 ? 1 : -1
		);
		int N = Integer.parseInt(st.nextToken());

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
