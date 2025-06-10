import java.util.*;
public class RatInMaze {
    public static void solve(int i, int j, int[][] a, int n, List<String> ans, String move, int[][] vis, int[] di, int[] dj) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }

        String dir = "DLRU";
        for (int ind = 0; ind < 4; ind++) {
            int nexti = i + di[ind];
            int nextj = j + dj[ind];

            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n &&
                vis[nexti][nextj] == 0 && a[nexti][nextj] == 1) {
                vis[i][j] = 1;
                solve(nexti, nextj, a, n, ans, move + dir.charAt(ind), vis, di, dj);
                vis[i][j] = 0;
            }
        }
    }

    public static List<String> findPath(int[][] m, int n) {
        List<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        int[] di = {+1, 0, 0, -1}; // D, L, R, U
        int[] dj = {0, -1, +1, 0};

        if (m[0][0] == 1) {
            solve(0, 0, m, n, ans, "", vis, di, dj);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        List<String> paths = findPath(maze, maze.length);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
