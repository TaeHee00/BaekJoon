import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] arr) {
        int i = 0;
        Deque<Integer> answer = new LinkedList<>();

        while (i < arr.length) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
            } else if (answer.getLast() == arr[i]) {
                answer.pollLast();
            } else {
                answer.offerLast(arr[i]);
            }
            
            i++;
        }
        
        if (answer.isEmpty()) {
            answer.offerLast(-1);
        }
        return answer;
    }
}