class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ct=0;
        int m=arr1.length;
        int n=arr2.length;
        for(int i=0;i<m;i++)
        {
            boolean valid=true;
            for(int j=0;j<n;j++)
            {
                int val=Math.abs(arr1[i]-arr2[j]);
                 if(val<=d)
                 {
                   valid=false;
                   break;
                 }
                 
            }
            if(valid)
            {
                ct++;
            }

        }
        return ct;
    }
}