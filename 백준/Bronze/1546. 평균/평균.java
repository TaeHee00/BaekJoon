import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] lecture = new int[1001];
        double sum = 0;
        double max = -1;

        for (int i = 0; i < num; i++){
            int temp = scanner.nextInt();
            max = Math.max(max, temp);
            lecture[i] = temp;
        }
        for (int i = 0; i < num; i++){
            sum += lecture[i] / max * 100;
        }

        System.out.println(sum / num);
    }
}