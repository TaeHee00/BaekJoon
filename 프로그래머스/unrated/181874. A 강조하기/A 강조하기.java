class Solution {
    public String solution(String myString) {
        String answer = myString;
        answer = answer.toLowerCase();
        answer = answer.replaceAll("a", "A");
        return answer;
    }
}