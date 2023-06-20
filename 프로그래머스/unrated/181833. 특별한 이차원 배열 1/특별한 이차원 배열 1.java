import java.util.*;

class Solution {
    public List<List<Integer>> solution(int n) {
        List<List<Integer>> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> il = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    il.add(1);
                } else {
                    il.add(0);
                }
            }
            answer.add(il);
        }
        return answer;
    }
}