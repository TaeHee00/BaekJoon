class Solution {
    public int solution(int a, int b) {
        String answer = "";
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append(aString);
        sb.append(bString);
        sb2.append(bString);
        sb2.append(aString);
        if (sb.toString().equals(sb2.toString())) {
            // 같음
            answer = sb.toString();
        } else {
            // 다름
            if (Integer.parseInt(sb.toString()) > Integer.parseInt(sb2.toString())) {
                answer = sb.toString();
            } else {
                answer = sb2.toString();
            }
        }
        return Integer.parseInt(answer);
    }
}