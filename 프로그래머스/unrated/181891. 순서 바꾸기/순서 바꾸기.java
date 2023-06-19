import java.util.*;

class Solution {
    public Deque<Integer> solution(int[] num_list, int n) {
        Deque<Integer> dq = new LinkedList<>();
        for (int num: num_list) {
            dq.addLast(num);
        }

        for (int i = 0; i < n; i++) {
            int first = dq.removeFirst();
            dq.addLast(first);
        }
        return dq;
    }
}