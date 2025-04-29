class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        long res = 0;
        int left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == maxVal) {
                count++;
            }

            while (count >= k) {
                if (nums[left] == maxVal) {
                    count--;
                }
                left++;
            }

            res += left;
        }

        return res;
    }
}
