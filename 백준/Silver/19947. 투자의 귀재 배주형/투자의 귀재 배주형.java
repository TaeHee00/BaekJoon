import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money, year;
        money = scanner.nextInt();
        year = scanner.nextInt();
        
        // dp에 각 year당 가장 많이 이자를 받는 경우를 저장함
        long[] dp = new long[year + 1];
        dp[0] = money;

        for(int i = 1; i <= year; i++){
            dp[i] = (long)Math.floor(dp[i-1] * 1.05);
            
            if(i >= 3)
                dp[i] = Math.max((long)Math.floor(dp[i-3] * 1.2), dp[i]);
            if(i >= 5)
                dp[i] = Math.max((long)Math.floor(dp[i-5] * 1.35), dp[i]);
        }

        System.out.println(dp[year]);
    }
}