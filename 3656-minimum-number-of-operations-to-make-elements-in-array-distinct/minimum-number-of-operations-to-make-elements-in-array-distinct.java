import java.util.HashSet;

class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;

        while (true) {
            HashSet<Integer> set = new HashSet<>();
            boolean hasDuplicates = false;

            for (int num : nums) {
                if (num != -1 && !set.add(num)) {
                    hasDuplicates = true;
                    break;
                }
            }

            if (!hasDuplicates) {
                break;
            }

       
            int removeCount = 0;
            for (int i = 0; i < nums.length && removeCount < 3; i++) {
                if (nums[i] != -1) {
                    nums[i] = -1; 
                    removeCount++;
                }
            }

            count++;
        }

        return count;
    }
}
