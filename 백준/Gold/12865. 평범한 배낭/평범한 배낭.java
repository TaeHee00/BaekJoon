import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    static int[][] bag;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        bag = new int[N + 1][2];
        dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            bag[i][0] = Integer.parseInt(st1.nextToken());
            bag[i][1] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 1; i <= K; i++) { // 1 ~ K 무게
            for (int j = 1; j <= N; j++) { // 아이템
                dp[j][i] = dp[j - 1][i];
                if (i - bag[j][0] >= 0) { // (들 수 있는 무게 - 아이템의 무게)가 0 이상일 경우
                    dp[j][i] = Math.max(dp[j - 1][i], bag[j][1] + dp[j - 1][i - bag[j][0]]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}