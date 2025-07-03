import java.util.*;

class Solution {
    public int findCircleNum(int[][] grid) {
        int n = grid.length;
        boolean[] vis = new boolean[n];
        int ct = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                bfs(grid, vis, i);
                ct++;
            }
        }
        return ct;
    }

    public void bfs(int[][] grid, boolean[] vis, int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int j = 0; j < grid.length; j++) {  // ✅ Fixed this line: changed ',' to ';'
                if (grid[node][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }
}
