package com.onlineJudge.programmers.bfs.KeepDistance;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeepDistanceTest {

    @Test
    public void runKeepDistance() {
        KeepDistance keepDistance = new KeepDistance();

        String[][] inputValue = {
                {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}
                , {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}
                , {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}
                , {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}
                , {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };

        // 결과값
        int[] returnValue;
        // 기대값
        int[] expectedValue = {1, 0, 1, 1, 1};

        // solution 함수 호출 결과값을 리턴받는다
        returnValue = keepDistance.solution(inputValue);
        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }
}