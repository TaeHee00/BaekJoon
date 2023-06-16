class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        answer = answer.replaceAll("0", " ");

        int i = 0;
        while (i < answer.length() && Character.isWhitespace(answer.charAt(i))) {
            i++;
        }
        answer = answer.substring(i);
        answer = answer.replaceAll(" ", "0");
        return answer;
    }
}