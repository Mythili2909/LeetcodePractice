class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        
        for (int i = 0; i <= nums.length - 3; i++) {
            int fir = nums[i];
            int mid = nums[i + 1];
            int thi = nums[i + 2];
            
            if (mid % 2 == 0 && fir + thi == mid / 2) {
                count++;
            }
        }
        
        return count;
    }
}
