import java.util.*;

class Solution {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();
        answer.add(names[0]);
        for (int i = 1; i < names.length; i++) {
            if (i % 5 == 0) {
                answer.add(names[i]);
            }
        }
        return answer;
    }
}