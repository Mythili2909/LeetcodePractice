class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int [][]dp=new int[n+1][m+1];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return help(s1,s2,n,m,dp);
    }
    public int help(String s1,String s2,int i,int j,int[][] dp)
    {
        int insert=0,del=0,rep=0;
        if(i==0) return j;
        if(j==0) return i;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            dp[i][j]= help(s1,s2,i-1,j-1,dp);
        }
        else
        {
            insert=1+help(s1,s2,i,j-1,dp);
            del=1+help(s1,s2,i-1,j,dp);
            rep=1+help(s1,s2,i-1,j-1,dp);
            dp[i][j]=Math.min(insert,Math.min(del,rep));
        }
        return dp[i][j];
    }
}