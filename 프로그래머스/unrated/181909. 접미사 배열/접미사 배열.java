import java.util.*;

class Solution {
    public List<String> solution(String my_string) {
        List<String> answer = new ArrayList<>();
        
        for (int i = my_string.length() - 1; i >= 0; i--) {
            answer.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(answer);
        return answer;
    }
}