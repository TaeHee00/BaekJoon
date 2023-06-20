import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int n: arr) {
            list.add(n);
        }
        
        for (int dn: delete_list) {
            if (list.contains(dn)) {
                list.remove((Integer) dn);
            }
        }
        return list;
    }
}
