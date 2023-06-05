import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));
        linkedHashSet.add(a);
        linkedHashSet.add(b);
        linkedHashSet.add(c);
        linkedHashSet.add(d);
        List<Integer> setList = linkedHashSet.stream()
                .collect(Collectors.toList());

        int answer = 0;
        if (setList.size() == 1) {
            answer = 1111 * a;
        } else if (setList.size() == 2 &&
                ((Collections.frequency(list, setList.get(0)) == 3) ||
                        (Collections.frequency(list, setList.get(0)) == 1))) {

            int freq = list.stream()
                            .filter(n -> Collections.frequency(list, n) == 3)
                            .findFirst()
                            .get();
            for (int hs: setList) {
                if (freq != hs) {
                    answer = (int) Math.pow((10 * freq + hs), 2);
                }
            }
        } else if (setList.size() == 2) {
            answer = (setList.get(0) + setList.get(1)) * Math.abs(setList.get(0) - setList.get(1));
        } else if (setList.size() == 3) {
            int freq = list.stream()
                    .filter(n -> Collections.frequency(list, n) == 2)
                    .findFirst()
                    .get();
            answer = 1;
            for (int n: setList) {
                if (n != freq) {
                    answer *= n;
                }
            }
        } else {
            answer = list.stream()
                    .mapToInt(x -> x)
                    .min()
                    .orElseThrow();
        }
        return answer;
    }
}