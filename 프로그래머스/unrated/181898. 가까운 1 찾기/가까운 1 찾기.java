import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        String sn = "";
        for (int i = idx; i < arr.length; i++) {
            sn += String.valueOf(arr[i]);
        }
        answer = sn.indexOf('1') == -1 ? -1 : sn.indexOf('1') + idx ;
        return answer;
    }
}