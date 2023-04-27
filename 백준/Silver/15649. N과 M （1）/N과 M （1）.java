import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    static boolean[] check = new boolean[9];
    static int[] num_arr = new int[9];

    static StringBuilder sb = new StringBuilder();

    static int N;
    static int M;
    public static void nm(int m) {
        if (m == M) {
            for (int j = 0; j < M; j++) {
                sb.append(num_arr[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                num_arr[m] = i + 1;
                nm(m + 1);
                check[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        nm(0);
        System.out.println(sb.toString());
    }
}