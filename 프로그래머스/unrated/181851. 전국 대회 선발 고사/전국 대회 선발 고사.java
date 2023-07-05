import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Boolean> m = new HashMap<>();
        Map<Integer, Integer> mi = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            m.put(rank[i], attendance[i]);
            mi.put(rank[i], i);
        }
        List<Integer> li = new ArrayList<>();
        int cnt = 0;
        for (int i = 1; i <= rank.length && cnt < 3; i++) {
            if (m.get(i)) {
                cnt++;
                li.add(i);
            }
        }

        answer = 10000 * mi.get(li.get(0)) + 100 * mi.get(li.get(1)) + mi.get(li.get(2));
        return answer;
    }
}