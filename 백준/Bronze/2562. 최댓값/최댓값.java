import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];

        for(int i = 0; i < 9; i++){
            num[i] = sc.nextInt();
        }

        int ex = 0;
        int exn = 0;
        for (int i = 0; i < num.length; i++){
            if (exn < num[i]) {
                ex = i + 1;
                exn = num[i];
            }
        }
        System.out.println(exn);
        System.out.println(ex);
    }
}