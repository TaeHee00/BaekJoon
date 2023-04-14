import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strList = str.split(" ");
        
        if (strList.length == 0) {
            System.out.println(0);
            System.exit(0);
        }
        if (strList[0] == ""){
            System.out.println(strList.length - 1);
        }else{
            
            System.out.println(strList.length);
        }
    }
}