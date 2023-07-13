import java.util.*;

class Solution {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        answer.add(Long.valueOf(x));
        for (int i = 1; i < n; i++) {
            answer.add(answer.get(i - 1) + x);
        }
        return answer;
    }
}