import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = new String[5];

        for (int i = 0; i < 5; i++){
            str[i] = scanner.next();
        }

        // 문자가 존재하는지 확인은 length로
        for (int i = 0; i < 15; i++){
            for (int j = 0; j < 5; j++){
                if (str[j].length() > i){
                    System.out.printf("%c", str[j].charAt(i));
                }
            }
        }
    }
}