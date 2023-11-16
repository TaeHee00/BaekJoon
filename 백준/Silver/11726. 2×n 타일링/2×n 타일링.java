import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    static final HashMap<Integer, Integer> dp = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        dp.put(1, 1);
        dp.put(2, 2);
        dp.put(3, 3);

        for (int i = 4; i <= N; i++) {
            dp.put(i, (dp.get(i - 1) + dp.get(i - 2)) % 10007);
        }

        System.out.println(dp.get(N));
    }
}