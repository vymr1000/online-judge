package com.onlineJudge.programmers.implementation.PlainSquare;

/*
 *  프로그래머스 LEVEL 2 멀쩡한 사각형
 *  https://school.programmers.co.kr/learn/courses/30/lessons/62048
 *
 * */
public class PlainSquare {

    public long solution(int w, int h) {

        Long width = (long) w;
        Long height = (long) h;
        long a = width;
        long b = height;

        if (width >= height) {
            a = height;
            b = width;
        }

        return width * height - (width + height - gcd(a, b));
    }

    long gcd(long a, long b) {

        while (b > 0) {
            long temp = a;
            a = b;
            b = temp % b;
        }

        return a;
    }
}
