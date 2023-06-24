class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while (true) {
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                    continue;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] *= 2;
                    arr[i]++;
                    continue;
                }
                cnt++;
            }
            answer++;
            if (cnt == arr.length) {
                answer--;
                break;
            }
        }
        return answer;
    }
}