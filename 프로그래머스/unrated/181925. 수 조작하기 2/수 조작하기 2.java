class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int temp = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - temp == 1) {
                answer += "w";
            } else if (temp - numLog[i] == 1) {
                answer += "s";
            } else if (numLog[i] - temp == 10) {
                answer += "d";
            } else if (temp - numLog[i] == 10) {
                answer += "a";
            }
            temp = numLog[i];
        }
        return answer;
    }
}