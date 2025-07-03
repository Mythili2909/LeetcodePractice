class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        int ori=image[sr][sc]; 
        if (ori == color) return image;
        int n=image.length;
        int m=image[0].length;
        dfs(image,n,m,sr,sc,color,ori);
        return image;

    }
    public void dfs(int[][] image,int n,int m,int sr,int sc,int color,int ori)
    {
        if (sr < 0 || sr >= n || sc < 0 || sc >= m) return;
        if(image[sr][sc]!=ori)
        {
            return;
        }
        image[sr][sc]=color;

        dfs(image,n,m,sr+1,sc,color,ori);
        dfs(image,n,m,sr-1,sc,color,ori);
        dfs(image,n,m,sr,sc+1,color,ori);
        dfs(image,n,m,sr,sc-1,color,ori);
    }
}