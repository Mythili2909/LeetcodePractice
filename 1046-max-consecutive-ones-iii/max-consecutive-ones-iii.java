public class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLength = 0;
        int zeroCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // If we encounter a zero, increment the zeroCount
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // If the number of zeros exceeds k, move the left pointer
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // Calculate the maximum length of 1's
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
