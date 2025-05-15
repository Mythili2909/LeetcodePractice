import java.util.*;

class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int left = 0;
        for (int i = 0; i < n; i++) {
            int right = totalSum - left - arr[i]; 
            ans[i] = Math.abs(left - right);
            left += arr[i];
        }

        return ans;
    }
}
