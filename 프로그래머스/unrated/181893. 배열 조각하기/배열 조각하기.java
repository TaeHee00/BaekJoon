import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] query) {
        List<Integer> answer = new ArrayList<>();
        for (int a: arr) {
            answer.add(a);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = answer.subList(0, query[i] + 1);
            } else {
                answer = answer.subList(query[i], answer.size());
            }
        }
        return answer;
    }
}