class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            arr[i]++;
            if (arr[i] < 10) {
                return arr;
            }
            arr[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
