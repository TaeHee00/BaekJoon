import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;

        Map<Integer, Integer> lengthMap = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (String str: strArr) {
            if (lengthMap.containsKey(str.length())) {
                int len = lengthMap.get(str.length());
                lengthMap.put(str.length(), (Integer)len + 1);
                set.add(str.length());
            } else {
                lengthMap.put(str.length(), 1);
            }
        }

        for (Integer s: set) {
            if (answer <  lengthMap.get(s)) {
                answer = lengthMap.get(s);
            }
        }
        return answer;
    }
}