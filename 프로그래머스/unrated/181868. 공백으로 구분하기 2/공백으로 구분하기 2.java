import java.util.*;
import java.util.stream.*;

class Solution {
    public List<String> solution(String my_string) {
        System.out.println(my_string.trim());
        List<String> answer = Arrays.stream(my_string.split(" "))
                .filter(s -> !Objects.equals(s, ""))
                .collect(Collectors.toList());
        return answer;
    }
}