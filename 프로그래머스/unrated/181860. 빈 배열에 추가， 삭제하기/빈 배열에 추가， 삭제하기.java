import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] arr, boolean[] flag) {
        Deque<Integer> answer = new LinkedList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.offerLast(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.pollLast();
                }
            }
        }
        return answer;
    }
}