class Solution {
    public String triangleType(int[] nums) {
        String res = "";
        if (nums[0] + nums[1] <= nums[2] || nums[1] + nums[2] <= nums[0] || nums[0] + nums[2] <= nums[1]) {
            return "none";
        }

        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            res = "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2]) {
            res = "isosceles";
        } else {
            res = "scalene";
        }

        return res;
    }
}
