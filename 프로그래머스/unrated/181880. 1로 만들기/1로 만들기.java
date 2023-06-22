class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int i_num = 0;
        for (int num: num_list) {
            i_num = num;
            while (true) {
                if (i_num == 1) {
                    break;
                }
                if (i_num % 2 == 0) {
                    i_num /= 2;
                } else {
                    i_num -= 1;
                    i_num /= 2;
                }
                answer++;
            }
        }
        return answer;
    }
}