import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 5; i++){
            int num = sc.nextInt();
            if (num >= 40) result += num;
            else result += 40;
        }
        System.out.println(result / 5);
    }
}