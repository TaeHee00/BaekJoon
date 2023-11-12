import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // N = 세로, M = 가로
    static int N, M;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dy = {-1, 1, 0, 0}; //상, 하, 좌, 우
    static int[] dx = {0, 0, -1, 1};
    static int pictureCnt = 0;
    static int maxPictureSize = 0;
    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            grid = new int[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    grid[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {

                    if (!visited[y][x] && grid[y][x] == 1) {
                        int cnt = BFS(y, x);
                        if (cnt > maxPictureSize) {
                            maxPictureSize = cnt;
                        }
                        pictureCnt++;
                    }
                }
            }

            System.out.println(pictureCnt + " " + maxPictureSize);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    static int BFS(int y, int x) {
        Queue<int[]> q = new LinkedList<>();
        int cnt = 0;
        q.add(new int[]{y, x});

        while(!q.isEmpty()) {
            int[] now = q.poll();
            cnt++;
            visited[now[0]][now[1]] = true;

            for (int i = 0; i < 4; i++) {
                int nextY = now[0] + dy[i];
                int nextX = now[1] + dx[i];

                if (nextY >= 0 && nextX >= 0 && nextY < N && nextX < M && // 유효한 위치 인가
                        !visited[nextY][nextX] && grid[nextY][nextX] == 1) { // 방문X + 그림이 있는 위치인가
                    q.add(new int[]{nextY, nextX});
                    visited[nextY][nextX] = true;
                }
            }
        }

        return cnt;
    }
}