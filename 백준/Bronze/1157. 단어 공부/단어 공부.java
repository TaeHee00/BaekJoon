import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next().toUpperCase();
        int[] eng = new int[26];

        for (int i = 0; i < str.length(); i++){
            int temp = str.charAt(i) - 65;
            eng[temp]++;
        }

        int max = -1;
        char res = '?';
        for (int i = 0; i < eng.length; i++){
            if (eng[i] > max){
                max = eng[i];
                res = (char) (i + 65);
            }else if (eng[i] == max){
                res = '?';
            }
        }
        System.out.println(res);
    }
}