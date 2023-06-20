class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] li = binomial.split(" ");
        int n1 = Integer.parseInt(li[0]);
        int n2 = Integer.parseInt(li[2]);
        if(li[1].equals("+")) {
            answer = n1 + n2;
        }else if (li[1].equals("-")) {
            answer = n1 - n2;
        }else {
            answer = n1 * n2;
        }    
        return answer;
    }
}