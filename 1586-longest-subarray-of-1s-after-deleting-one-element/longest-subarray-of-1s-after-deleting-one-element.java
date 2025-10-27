public class Solution {

    public int longestSubarray(int[] nums) {
        int left = 0;        // Left pointer for the sliding window
        int maxLen = 0;      // Maximum length of the subarray
        int zerosCount = 0;  // Count of zeros in the current window

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            // If there are more than one zero, move the left pointer to reduce the window size
            while (zerosCount > 1) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++;
            }

            // Update the maximum length (we subtract 1 because we have to delete one element)
            maxLen = Math.max(maxLen, right - left + 1 - 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[] nums1 = {1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums1));  // Output: 3
        
        int[] nums2 = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        System.out.println(solution.longestSubarray(nums2));  // Output: 5
        
        int[] nums3 = {1, 1, 1};
        System.out.println(solution.longestSubarray(nums3));  // Output: 2
    }
}
