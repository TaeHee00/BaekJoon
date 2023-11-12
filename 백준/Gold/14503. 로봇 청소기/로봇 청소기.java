import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    // N = 세로, M = 가로
    static int N, M;
    static int[][] grid;
    static boolean[][] visited;
    public static int[] dy = {-1, 0, 1, 0}; // 북,동,남,서
    public static int[] dx = {0, 1, 0, -1};
    static int cnt = 0;
    static int startY;
    static int startX;
    static int direction;
    static Stack<int[]> s = new Stack<>();
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            grid = new int[N][M];
            visited = new boolean[N][M];

            StringTokenizer st2 = new StringTokenizer(br.readLine());

            startY = Integer.parseInt(st2.nextToken());
            startX = Integer.parseInt(st2.nextToken());
            direction = Integer.parseInt(st2.nextToken());

            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    grid[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            clean(startY, startX, direction);

            System.out.println(cnt);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void clean(int row, int col, int direction) {
        // 1. 현재 위치를 청소한다.
        if (grid[row][col] == 0) {
            grid[row][col] = 2;
            cnt++;
        }

        // 2. 왼쪽방향부터 차례대로 탐색을 진행한다.
        boolean flag = false;
        int origin = direction;
        for (int i = 0; i < 4; i++) {
            int next_d = (direction + 3) % 4;
            int next_r = row + dy[next_d];
            int next_c = col + dx[next_d];

            if (next_r > 0 && next_c > 0 && next_r < N && next_c < M) {
                if (grid[next_r][next_c] == 0) {   // 아직 청소하지 않은 공간이라면
                    clean(next_r, next_c, next_d);
                    flag = true;
                    break;
                }
            }
            direction = (direction + 3) % 4;
        }

        // 네 방향 모두 청소가 되어있거나 벽인 경우
        if (!flag) {
            int next_d = (origin + 2) % 4;
            int next_br = row + dy[next_d];
            int next_bc = col + dx[next_d];

            if (next_br > 0 && next_bc > 0 && next_br < N && next_bc < M) {
                if (grid[next_br][next_bc] != 1) {
                    clean(next_br, next_bc, origin); // 바라보는 방향 유지한 채 후진
                }
            }
        }
    }
}