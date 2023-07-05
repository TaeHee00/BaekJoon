import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        int[] ka = Arrays.stream(arr).distinct().toArray();
        int len = ka.length;
        for (int i = 0; i < k; i++) {
            if (len != 0) {
                len--;
                answer.add(ka[i]);
            } else {
                answer.add(-1);
            }
        }
        return answer;
    }
}