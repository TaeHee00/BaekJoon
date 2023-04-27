import java.util.Scanner;



public class Main {
    static long sum = 1L;
    public static Long factorial(int num){
        if (num <= 0) {
            return sum;
        }

        sum *= num;

        return factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(factorial(scanner.nextInt()));
    }
}