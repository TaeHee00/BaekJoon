import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean isL = false;
            for (String s: String.valueOf(i).split("")){
                if (s.equals("5") || s.equals("0")) {
                    isL = true;
                } else {
                    isL = false;
                    break;
                }
            }
            if (isL) {
                answer.add(i);
            }
        }
        if (answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}