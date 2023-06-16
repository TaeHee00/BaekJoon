import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        List<Integer> indicesList = new ArrayList<>();
        for (int n: indices) {
            indicesList.add(n);
        }
        for (int i = 0; i < my_string.length(); i++) {
            if (!indicesList.contains(i)){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}