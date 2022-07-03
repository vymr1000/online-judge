package com.onlineJudge.programmers.hash.RenewMenu;

import java.util.*;

public class RenewMenu {
    // 메뉴를 담을 StringBuilder 선언
    StringBuffer sb = new StringBuffer();
    // 베스트 메뉴가 될수 있는 모든 후보를 담을 Map 선언
    Map<String, Integer> menuCombList = new HashMap<String, Integer>();
    // 베스트 메뉴를 담을 List 선언
    List<String> bestMenu = new ArrayList<String>();

    public List<String> solution(String[] orders, int[] course) {
        // 주문한 메뉴를 가지고 조합결과를 만들기 위해 char 배열을 선언
        char[] arr = {};

        for (int j=0; j<course.length; j++) {
            // 메뉴조합 가짓수를 가져오면서 베스트 메뉴 후보를 클리어 해준다.
            menuCombList = new HashMap<String, Integer>();
            // 가장 많은 주문수를 담기 위한 정수 선언
            int mx = Integer.MIN_VALUE;

            // 손님들이 주문한 메뉴를 반복하면서 조합을 만들고 메뉴 구성에 대한 카운트를 한다
            for (int i=0; i<orders.length; i++) {
                // 손님들이 주문했던 메뉴를 char 배열로 변환
                arr = orders[i].toCharArray();
                // 각 메뉴구성을 정렬해준다 -> WX와 XW는 동일한 구성으로 생각하기 때문
                Arrays.sort(arr);
                // 조합 경우의 수를 구하고 menuCombList 에서 찾아 카운팅 해준다
                combination(arr, new boolean[arr.length], 0, 0, course[j]);
                // HashMap에서 Value로 정렬하기 위한 key 리스트 선언
                List<String> keySet = new ArrayList<>(menuCombList.keySet());
                // Value로 정렬
                Collections.sort(keySet, (o1, o2) -> (menuCombList.get(o2).compareTo(menuCombList.get(o1))));
            }
            // menuCombList 에서 가장 큰 Value를 저장한다
            for(Map.Entry<String,Integer> entry: menuCombList.entrySet()){
                mx = Math.max(mx, entry.getValue());
            }

            // 2이상이면서 최대값을 찾아 해당 메뉴를 bestMenu에 넣어준다
            for(Map.Entry<String,Integer> entry: menuCombList.entrySet()){
                if(mx >=2 && entry.getValue() == mx) {
                    bestMenu.add(entry.getKey());
                }
            }
        }
        // bestMenu도 정렬해준다
        Collections.sort(bestMenu);
        return bestMenu;
    }

    // 조합을 구하는 함수
    public void combination(char[] arr, boolean[] visited, int start, int depth, int r) {
        if(depth == r) {
            for(int i=0; i<arr.length; i++) {
                if(visited[i]) sb.append(String.valueOf(arr[i]));
            }
            menuCombList.put(String.valueOf(sb), menuCombList.getOrDefault(String.valueOf(sb), 0) + 1);
            return;
        }
        for(int i=start; i<arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                sb.delete(0, sb.length());
                visited[i] = false;
            }
        }
        return;
    }
}
