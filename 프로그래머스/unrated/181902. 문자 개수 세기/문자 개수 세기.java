import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            int finalI = i;
            long cnt = my_string.chars()
                    .filter(s -> (int) s == finalI)
                    .count();
            answer.add((int) cnt);
        }
        for (int i = 97; i <= 122; i++) {
            int finalI = i;
            long cnt = my_string.chars()
                    .filter(s -> (int) s == finalI)
                    .count();
            answer.add((int) cnt);
        }

        return answer;
    }
}