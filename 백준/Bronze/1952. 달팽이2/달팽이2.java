import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        boolean[][] isVisited = new boolean[N][M];
        // dx, dy -> index = 0 [UP]
        //        -> index = 1 [RIGHT]
        //        -> index = 2 [DOWN]
        //        -> index = 3 [LEFT]
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        // count 꺽은 횟수 / sum 방문한 칸 수 / index 다음칸 인덱스
        int count = 0, sum = 0, index = 0, nowX = 0, nowY = 0;
        isVisited[nowX][nowY] = true;
        sum++;

        while(true){
            // 다음으로 이동할 칸 설정
            int newX = nowX + dx[index];
            int newY = nowY + dy[index];

            // 이미 모든 칸을 다녀갔을 경우
            // (총 방문 횟수가 모든 칸의 합과 동일할 경우)
            if (sum == N * M){
                System.out.println(count);
                break;
            }

            // 다음 위치가 배열 내부에서 이동가능한 위치인지 확인
            // 이미 방문한 위치인지 확인
            if (newX >= 0 && newY >= 0 &&
                    newX < N && newY < M &&
                    !isVisited[newX][newY]){
                // 방문 카운트를 올리고 isVisited에 현재 위치에 방문 체크
                sum++;
                isVisited[newX][newY] = true;
                nowX = newX;
                nowY = newY;
            }else{
                // 다음 위치가 배열 범위를 벗어나거나 이미 방문한 경우
                // 방향을 변경 (방향을 변경했으므로 count++)
                // 방향전환 배열을 벗어나지 않도록 % 4 로 내부 순환
                index = (index + 1) % 4;
                count++;
            }
        }
    }
}