import java.util.*;

class Solution {
    public List<List<Integer>> solution(int[][] arr) {
        List<List<Integer>> answer = new ArrayList<>();
        int max = 0;
        for (int[] nList: arr) {
            max = Math.max(max, nList.length);
        }
        max = Math.max(max, arr.length);
        for (int i = 0; i < max; i++) {
            List<Integer> xList = new ArrayList<>();
            for (int j = 0; j < max; j++) {
                if (arr.length - 1 < i || arr[i].length - 1 < j) {
                    xList.add(0);
                } else {
                    xList.add(arr[i][j]);
                }
            }
            answer.add(xList);
        }

        return answer;
    }
}