class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        if(n==3 && arr[n-1]==1)
        {
            return true;
        }
        for(int i=0;i<n-2;i++)
        {
            if(n>3 && arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0)
            {
                return true;
            }
            
        }
        return false;
    }
}