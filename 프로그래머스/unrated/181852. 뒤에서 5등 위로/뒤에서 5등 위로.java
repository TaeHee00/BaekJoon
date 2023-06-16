import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for (int n: num_list) {
            answer.add(n);
        }
        Collections.sort(answer);
        for (int i = 0; i < 5; i++) {
            answer.remove(0);
        }
        return answer;
    }
}