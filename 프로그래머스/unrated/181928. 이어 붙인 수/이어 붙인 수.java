class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for (int n: num_list) {
            if (n % 2 == 0) {
                even += String.valueOf(n);
            } else {
                odd += String.valueOf(n);
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}