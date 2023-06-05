import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        List<Integer> list = IntStream.of(num_list)
            .boxed()
            .collect(Collectors.toList());
        int answer = 0;
        if (list.contains(n)) {
            answer = 1;
        }
        return answer;
    }
}