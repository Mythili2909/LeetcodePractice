class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        Queue<int[]> q=new LinkedList<>();
        int ct=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1' && !vis[i][j])
                {
                    bfs(grid,n,m,q,i,j,vis);
                    ct++;
                }
            }
        }
        return ct;
    }
    public void bfs(char[][] grid,int n,int m,Queue<int[]> q,int srx,int sry,boolean[][] vis)
    {
        q.offer(new int[]{srx,sry});
        vis[srx][sry]=true;

        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        
        while(!q.isEmpty())
        {
            int[] node=q.poll();
            int x=node[0];
            int y=node[1];
            for(int d=0;d<4;d++)
            {
                int newx=x+dx[d];
                int newy=y+dy[d];
            
                if(newx>=0 && newx<n && newy>=0 && newy<m && grid[newx][newy]=='1' && !vis[newx][newy])
                {
                    q.offer(new int[]{newx,newy});
                    vis[newx][newy]=true;
                }
            }
            
        }
    }
}