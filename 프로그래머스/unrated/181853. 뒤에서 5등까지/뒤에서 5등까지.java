import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int n: num_list) {
            list.add(n);
        }
        Collections.sort(list);
        for (int i = 0; i < 5; i++) {
            answer.add(list.get(i));
        }
        return answer;
    }
}