class Solution {
    public int candy(int[] r) {
        int n = r.length;
        int[] c = new int[n];

        for (int i = 0; i < n - 1; ++i) {
            if(r[i] < r[i + 1])
                if(c[i] >= c[i+1])
                    c[i+1] = c[i] + 1;
        }

        for (int i = n - 1; i > 0; --i) {
            if(r[i] < r[i - 1])
                if(c[i] >= c[i-1])
                    c[i-1] = c[i] + 1;
        }        

        int ans = n;
        for(int i = 0; i < n; ++i)
            ans+= c[i];

        return ans;
    }
}