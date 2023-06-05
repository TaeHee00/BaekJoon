import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = IntStream.of(arr)
            .boxed()
            .collect(Collectors.toList());
        
        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i) >= 50 && answer.get(i) % 2 == 0) {
                answer.set(i, (int)answer.get(i) / 2);
            } else if (answer.get(i) < 50 && answer.get(i) % 2 == 1) {
                answer.set(i, answer.get(i) * 2);
            }
        }
        return answer;
    }
}