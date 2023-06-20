import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        for (int n: arr) {
            answer.add(n);
        }
        
        
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                answer.set(j, answer.get(j) + 1);
            }
        }
        return answer;
    }
}