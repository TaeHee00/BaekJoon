import java.util.*;

class Solution {
    public List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for (String str: intStrs) {
            String stoi = str.substring(s, s+l);
            int intstr = Integer.parseInt(stoi);
            if (intstr > k) {
                answer.add(intstr);
            }
        }
        return answer;
    }
}