import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tc = scanner.nextInt();

        ArrayList<Integer> dp = new ArrayList<Integer>();
        dp.add(1);
        dp.add(2);
        dp.add(4);

        for (int i = 3; i < 11; i++){
            dp.add(i, dp.get(i - 1) + dp.get(i - 2) + dp.get(i - 3));
        }
        for (int i = 0; i < tc; i++) {
            int num = scanner.nextInt();
            System.out.println(dp.get(num - 1));
        }
    }
}