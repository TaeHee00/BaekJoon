import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for (int j = 0; j < k; j++) {
                answer.add(sb.toString());
            }
        }
        return answer;
    }
}