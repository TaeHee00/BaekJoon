class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int temp = 0;
        for (int i = 0; i < my_string.length(); i++) {
            temp++;
            if (i % m == 0) {
                temp = 1;
            } 
            if (temp == c) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}