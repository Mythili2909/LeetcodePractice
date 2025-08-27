class Solution {
    public int maxProfit(int[] arr) {
        int mint=arr[0];
        int profit=0;
        for(int i=0;i<arr.length;i++)
        {
            int cost=arr[i]-mint;
            if(cost>profit)
            {
                profit=cost;
            }
            if(arr[i]<mint)
            {
                mint=arr[i];
            }
        }
        return profit;
        
    }
}
