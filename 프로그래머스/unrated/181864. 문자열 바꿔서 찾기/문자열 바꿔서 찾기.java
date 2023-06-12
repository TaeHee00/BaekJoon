class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replaceAll("A", "b");
        myString = myString.replaceAll("B", "A");
        myString = myString.replaceAll("b", "B");
        
        if(myString.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}