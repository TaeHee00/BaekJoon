class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int square = 0;
        
        for (int n: num_list) {
            multiple *= n;
            square += n;
        }
        square = (int) Math.pow(square, 2);
        
        if (multiple < square) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}