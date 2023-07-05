import java.math.*;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger ba = new BigInteger(a);
        BigInteger bb = new BigInteger(b);
        answer = ba.add(bb).toString();
        return answer;
    }
}