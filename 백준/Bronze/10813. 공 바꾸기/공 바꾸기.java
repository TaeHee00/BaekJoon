import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[101];
        int basketLength = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i <= basketLength; i++){
            basket[i] = i;
        }

        for (int i = 0; i < n; i++){
            int indexA = scanner.nextInt();
            int indexB = scanner.nextInt();
            int temp;
            temp = basket[indexA];
            basket[indexA] = basket[indexB];
            basket[indexB] = temp;
        }

        for (int i = 1; i <= basketLength; i++){
            System.out.printf("%d ", basket[i]);
        }
    }
}