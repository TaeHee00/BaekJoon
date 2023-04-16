import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num = new BigInteger("1");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        num = num.multiply(BigInteger.valueOf(a));
        num = num.multiply(BigInteger.valueOf(b));
        num = num.multiply(BigInteger.valueOf(c));

        int[] res = new int[10];
        String strNum = String.valueOf(num);
        for (int i = 0; i < strNum.length(); i++){
            res[Integer.parseInt(String.valueOf(strNum.charAt(i)))] += 1;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(res[i]);
        }
    }
}