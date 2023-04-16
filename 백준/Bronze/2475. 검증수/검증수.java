import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        sc.nextLine();
        int square = n * n + n1 * n1 + n2 * n2 + n3 * n3 + n4 * n4;
        System.out.println(square % 10);
    }
}