import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[101];
        int basketLength = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int startIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();
            int ballNum = scanner.nextInt();

            for (int j = startIndex; j <= endIndex; j++){
                basket[j] = ballNum;
            }
        }

        for (int i = 1; i <= basketLength; i++){
            System.out.printf("%d ", basket[i]);
        }
    }
}