import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[10][10];
        int maxX = 0, maxY = 0;
        int maxNum = -1;

        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                int num = scanner.nextInt();
                if (maxNum != Math.max(maxNum, num)){
                    maxNum = Math.max(maxNum, num);
                    maxX = i;
                    maxY = j;
                }
            }
        }
        System.out.printf("%d\n%d %d", maxNum, maxX, maxY);
    }
}