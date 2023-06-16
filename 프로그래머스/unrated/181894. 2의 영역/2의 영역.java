import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            answer.add(-1);
            return answer;
        }
        for (int i = list.get(0); i <= list.get(list.size() - 1); i++) {
            answer.add(arr[i]);
        }
        return answer;
    }
}