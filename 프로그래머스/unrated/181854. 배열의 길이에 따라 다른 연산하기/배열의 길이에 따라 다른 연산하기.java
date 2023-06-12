import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int n) {
        List<Integer> answer = new ArrayList<>();
        
        if (arr.length % 2 != 0) {
            for(int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer.add(arr[i] + n);
                } else {
                    answer.add(arr[i]);
                }
            }
        } else {
            for(int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer.add(arr[i] + n);
                } else {
                    answer.add(arr[i]);
                }
            }
        }
        return answer;
    }
}