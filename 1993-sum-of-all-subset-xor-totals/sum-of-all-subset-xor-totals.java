public class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currXor) {
        if (index == nums.length) {
            return currXor;
        }
        int include = dfs(nums, index + 1, currXor ^ nums[index]);
        int exclude = dfs(nums, index + 1, currXor);
        return include + exclude;
    }
}
