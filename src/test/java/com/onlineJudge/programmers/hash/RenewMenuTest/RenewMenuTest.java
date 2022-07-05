package com.onlineJudge.programmers.hash.RenewMenuTest;

import com.onlineJudge.programmers.hash.Marathon.Marathon;
import com.onlineJudge.programmers.hash.RenewMenu.RenewMenu;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class RenewMenuTest {

    @Test
    public void runRenewMenu() {
        RenewMenu renewMenu = new RenewMenu();
        String[] inputValue1 = new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] inputValue2 = new int[]{2, 3, 4};
        // 결과값
        List<String> returnValue = new ArrayList<String>();
        // 기대값
        List<String> expectedValue = new ArrayList<String>(Arrays.asList("AC", "ACDE", "BCFG", "CDE"));
        // solution 함수 호출 결과값을 리턴받는다
        returnValue = renewMenu.solution(inputValue1, inputValue2);
        // 결과값과 기대값 비교한다
        Assertions.assertThat(returnValue).isEqualTo(expectedValue);
    }

}
