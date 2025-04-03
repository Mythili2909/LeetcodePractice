class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        if (n < 3) return 0;

        int[] maxBefore = new int[n];
        maxBefore[0] = nums[0];

        for (int i = 1; i < n; i++) {
            maxBefore[i] = Math.max(maxBefore[i - 1], nums[i]);
        }

        int[] maxAfter = new int[n];
        maxAfter[n - 1] = nums[n - 1];

        for (int k = n - 2; k >= 0; k--) {
            maxAfter[k] = Math.max(maxAfter[k + 1], nums[k]);
        }

        long maxValue = 0;
        for (int j = 1; j < n - 1; j++) {
            long maxI = maxBefore[j - 1];
            long maxK = maxAfter[j + 1];
            maxValue = Math.max(maxValue, (maxI - nums[j]) * maxK);
        }

        return maxValue;
    }
}
