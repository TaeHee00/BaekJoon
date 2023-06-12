import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int start, int end) {
        int[] answer = IntStream.rangeClosed(end, start)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}