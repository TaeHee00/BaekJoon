import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        for (int[] query: queries) {
            int start = query[0];
            int end = query[1];

            // 시작 인덱스부터 끝 인덱스까지의 문자들을 뒤집기
            while (start < end) {
                String temp = list.get(start);
                list.set(start, list.get(end));
                list.set(end, temp);
                start++;
                end--;
            }
        }
        answer = String.join("", list);
        return answer;
    }
}