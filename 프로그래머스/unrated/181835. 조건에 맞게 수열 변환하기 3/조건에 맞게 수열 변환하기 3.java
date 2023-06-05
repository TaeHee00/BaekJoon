import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Integer> solution(int[] arr, int k) {
        List<Integer> answer = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());;
        if (k % 2 == 0) {
            answer = answer.stream()
                    .map(n -> n + k)
                    .collect(Collectors.toList());
        } else {
            answer = answer.stream()
                    .map(n -> n * k)
                    .collect(Collectors.toList());
        }
        return answer;
    }
}