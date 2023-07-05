class Solution {
    public int[][] solution(int n) {
        int[] dx = { 0, 1, 0, -1 };
        int[] dy = { 1, 0, -1, 0 };
        int[][] grid = new int[n][n];
        boolean[][] visited = new boolean[n][n];

        int pos = 0;
        int x = 0;
        int y = 0;
        for(int i = 1; i <= n * n; i++) {
            grid[x][y] = i;
            visited[x][y] = true;
            if (x + dx[pos] >= n || y + dy[pos] >= n || x + dx[pos] < 0 || y + dy[pos] < 0 || visited[x + dx[pos]][y + dy[pos]]) {
                pos = (pos + 1) % 4;
            }
            x += dx[pos];
            y += dy[pos];

        }
        return grid;
    }
}