import java.util.*;

class Solution {
    public List<String> solution(String myString) {
        List<String> answer = new ArrayList<>();
        for (String s: myString.split("x")) {
            if (!s.equals("")) {
                answer.add(s);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}