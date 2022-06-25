package com.onlineJudge.programmers.hash;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MarathonTest {

    Marathon marathon = new Marathon();

    @Test
    public void runMarathon() {
        // 문제에서 주어진 input 1
        String[] inputValue1 = {"leo", "kiki", "eden"};
        // 문제에서 주어진 input 2
        String[] inputValue2 = {"eden", "kiki"};
        // 결과값
        String returnValue = "";
        // 기대값
        String expectedValue = 	"leo";

        // solution 함수 호출 결과값을 리턴받는다
        returnValue = marathon.solution(inputValue1, inputValue2);

        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }

}
