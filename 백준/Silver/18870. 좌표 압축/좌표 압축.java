import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int[] origin = new int[num];
        int[] sorted = new int[num];
        HashMap<Integer, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < num; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        int cnt = 0;
        for (Integer s : sorted) {
            if (!hm.containsKey(s)) {
                hm.put(s, cnt);
                cnt++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            sb.append(hm.get(key)).append(" ");
        }

        System.out.println(sb);
    }
}