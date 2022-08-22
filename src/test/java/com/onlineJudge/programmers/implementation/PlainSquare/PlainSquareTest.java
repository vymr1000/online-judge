package com.onlineJudge.programmers.implementation.PlainSquare;

import com.onlineJudge.programmers.implementation.Traffic.Traffic;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlainSquareTest {
    @Test
    public void runPlainSquare() {
        PlainSquare plainSquare = new PlainSquare();

        int w = 8;
        int h = 12;


        // 결과값
        long returnValue;
        // 기대값
        long expectedValue = 80;

        // solution 함수 호출 결과값을 리턴받는다
        returnValue = plainSquare.solution(w, h);
        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }
}