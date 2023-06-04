import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = new ArrayList<>();
        for (int[] query: queries) {
            for(int i = 0; i < arr.length; i++) {
                if (query[0] <= i && i <= query[1] && i % query[2] == 0) {
                    arr[i]++;
                    // list.add(arr[i]);
                }
            }
        }
        return arr;
    }
}