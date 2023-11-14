import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    static int[][] house;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        // 3
        // 26 40 83
        // 49 60 57
        // 13 89 99
        // 1h 09m 15s 0
        int N = Integer.parseInt(st.nextToken());
        // [N][0 ~ 2] 0 = R, 1 = G, 2 = B
        house = new int[N][3];
        dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());


            int R = Integer.parseInt(st1.nextToken());
            int G = Integer.parseInt(st1.nextToken());
            int B = Integer.parseInt(st1.nextToken());
            house[i] = new int[]{R, G, B};
            dp[i] = new int[]{R, G, B};
        }

        for (int i = 1; i < N; i++) { // dp의 계층
            for (int j = 0; j < 3; j++) { // dp[n] 위치에서 R, G, B 위치
                int minIdx = 0;
                int minVal = 9999999;
                for (int k = 0; k < 3; k++) { // 최소 값을 구하기 위한 반복문
                    if (k == j) continue;
                    if (minVal > dp[i - 1][k]) {
                        minIdx = k;
                        minVal = dp[i - 1][k];
                    }
                }
                dp[i][j] = dp[i - 1][minIdx] + house[i][j];
            }
        }
        System.out.println(Arrays.stream(dp[N - 1]).min().getAsInt());
    }
}