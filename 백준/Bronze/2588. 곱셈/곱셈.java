import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        int b = scanner.nextInt();

        int b100 = b/100;
        int b10 = (b/10)%10;
        int b1 = b%10;
        int sam = b1 * a;
        int sa = b10 * a;
        int o = b100 * a;
        System.out.println(sam);
        System.out.println(sa);
        System.out.println(o);
        System.out.println(sam + (sa*10) + (o*100));
    }
}