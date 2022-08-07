package com.onlineJudge.programmers.implementation.ContinuousSequence;

/*
 *  TEST 연속 등차수열의 최대 길이 구하기
 *
 *
 * */
public class ContinuousSequence {
    public long solution(long[] arr) {
        long answer = 1;
        long[] d = new long[arr.length];
        long[] dp = new long[arr.length];
        long mx = 1;
        d[1] = arr[1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]- arr[i-1] == d[i-1]) {
                d[i] = d[i-1];
                answer++;
            } else {
                d[i] = arr[i]- arr[i-1];
                answer = 2;
            }
            dp[i] = answer;
            mx = Math.max(dp[i], mx);
        }
        answer = mx;
        return answer;
    }
}
