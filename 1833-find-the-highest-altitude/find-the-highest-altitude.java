class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int maxalt=0;
        for(int i=0;i<gain.length;i++)
        {
            alt+=gain[i];
            if(maxalt<alt)
            {
                maxalt=alt;
            }
        }
        return maxalt;
        
    }
}