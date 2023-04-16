import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[101][101];
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                matrix[i][j] += scanner.nextInt();
            }
        }

        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}