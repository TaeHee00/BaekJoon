import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',};
        HashMap<Character, Integer> result = new HashMap<>();
        String word = sc.next();
        Arrays.stream(alp).forEach(a -> result.put(a, 0));

        for (int i = 0; i < word.length(); i++) {
            result.put(word.charAt(i), result.get(word.charAt(i)) + 1);
        }
        Set<Character> characters = result.keySet();
        characters.forEach(c -> System.out.print(result.get(c) + " "));
    }
}