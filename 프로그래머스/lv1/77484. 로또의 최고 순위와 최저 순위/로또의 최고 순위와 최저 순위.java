import java.util.ArrayList;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int detect_cnt = 0;
        int cnt = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < win_nums.length; i++) {
            nums.add(win_nums[i]);
        }

        for (int i = 0; i < lottos.length; i++) {
            if (nums.indexOf(lottos[i]) != -1) {
                // 선택한 번호가 당첨번호에 있는 경우
                detect_cnt++;
                nums.remove(nums.indexOf(lottos[i]));
            } else if (lottos[i] == 0) {
                cnt++;
            }
        }

        if (nums.isEmpty()) {
            answer[0] = 1;
            answer[1] = 1;
        } else {
            if (cnt == win_nums.length || detect_cnt == 0) {
                answer[1] = win_nums.length - detect_cnt;
            } else {
                answer[1] = win_nums.length - detect_cnt + 1;
            }
            if (cnt <= nums.size()) {
                detect_cnt += cnt;
            } else {
                detect_cnt += nums.size();
            }
            if (detect_cnt == 0) {
                answer[0] = win_nums.length - detect_cnt;
            } else {
                answer[0] = win_nums.length - detect_cnt + 1;
            }
        }
        return answer;
    }
}