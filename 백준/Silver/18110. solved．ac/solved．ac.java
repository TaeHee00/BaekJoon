import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        // 입력 받기
        int numOfProblem = Integer.parseInt(bf.readLine());;
        List<Integer> review = new ArrayList<>();
        for (int i = 0; i < numOfProblem; i++){
            review.add(Integer.parseInt(bf.readLine()));
        }
        if (review.size() == 0) {
            System.out.println(0);
            return;
        }

        // 15% 반올림 (절사평균)
        int roundNum = (int)Math.round(numOfProblem * 0.15);
        Collections.sort(review);
        for (int i = roundNum; i < review.size() - roundNum; i++){
            total += review.get(i);
        }
        System.out.println((Math.round((float) total / (review.size() - roundNum * 2))));
    }
}