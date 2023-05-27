class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        
        if (Integer.parseInt(sb.toString()) >= 2 * a * b) {
            answer = Integer.parseInt(sb.toString());
        } else if (2 * a * b > Integer.parseInt(sb.toString())) {
            answer = 2 * a * b;
        }
        return answer;
    }
}