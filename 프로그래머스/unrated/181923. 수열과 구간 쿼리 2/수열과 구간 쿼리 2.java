import java.util.*;


class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for (int[] query: queries) {
            for(int i = 0; i < arr.length; i++) {
                if (query[0] <= i && i <= query[1]) {
                    list.add(arr[i]);
                }
            }
            answer[cnt] = list.stream()
                    .filter(n -> n > query[2])
                    .min(Comparator.comparing(n -> n))
                    .orElse(-1);
            cnt++;
            list.clear();
        }
        return answer;
    }
}