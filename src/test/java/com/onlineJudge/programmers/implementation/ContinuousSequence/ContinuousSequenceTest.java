package com.onlineJudge.programmers.implementation.ContinuousSequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContinuousSequenceTest {
    @Test
    public void runContinuousSequence() {
        ContinuousSequence continuousSequence = new ContinuousSequence();

        long[] inputValue = {
                2, 3, 4, -1, -6, -11, 1
        };

        // 결과값
        long returnValue;
        // 기대값
        long expectedValue = 4;

        // solution 함수 호출 결과값을 리턴받는다
        returnValue = continuousSequence.solution(inputValue);
        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }
}
