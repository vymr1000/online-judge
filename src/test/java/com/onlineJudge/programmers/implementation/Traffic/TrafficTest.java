package com.onlineJudge.programmers.implementation.Traffic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrafficTest {

    @Test
    public void runTraffic() {
        Traffic traffic = new Traffic();

        String[] inputValue = {
                "2016-09-15 20:59:57.421 0.351s"
                , "2016-09-15 20:59:58.233 1.181s"
                , "2016-09-15 20:59:58.299 0.8s"
                , "2016-09-15 20:59:58.688 1.041s"
                , "2016-09-15 20:59:59.591 1.412s"
                , "2016-09-15 21:00:00.464 1.466s"
                , "2016-09-15 21:00:00.741 1.581s"
                , "2016-09-15 21:00:00.748 2.31s"
                , "2016-09-15 21:00:00.966 0.381s"
                , "2016-09-15 21:00:02.066 2.62s"
        };


        // 결과값
        int returnValue = 7;
        // 기대값
        int expectedValue = 7;

        // solution 함수 호출 결과값을 리턴받는다
        returnValue = traffic.solution(inputValue);
        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }
}
