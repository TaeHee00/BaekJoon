import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // [최대로 나올 수 있는 종이의 수][x시작, x끝, y시작, y끝]
        int[][] paper = new int[101][101];
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            for (int j = x; j < x + 10; j++){
                for (int k = y; k < y + 10; k++){
                    // 0일 경우에만 넓이에 추가
                    // 1일 경우에는 이미 다른 색종이와 겹치는 경우
                    if(paper[j][k] == 0){
                        paper[j][k]++;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);


    }
}