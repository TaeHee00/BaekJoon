public class Main {

    static final int[] dp = new int[1001];

    public static void main(String[] args) throws Exception {
        int N = read();
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        System.out.println(dp[N]);
    }

    static int read() throws Exception{
        int c=0,n=0;
        while(true){
            c=System.in.read()-48;
            if(c < 0 || c  > 9) return n;
            n=n*10+c;
        }
    }
}