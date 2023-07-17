import java.util.*;

class Solution {
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            answer.add(Integer.parseInt(String.valueOf(sb.charAt(i))));
        }
        return answer;
    }
}