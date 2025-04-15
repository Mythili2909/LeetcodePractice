class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] indexInNums2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            indexInNums2[nums2[i]] = i;
        }

        int[] mapped = new int[n];
        for (int i = 0; i < n; i++) {
            mapped[i] = indexInNums2[nums1[i]];
        }

        long[] leftSmaller = new long[n];
        long[] rightGreater = new long[n];

        FenwickTree bitLeft = new FenwickTree(n);
        FenwickTree bitRight = new FenwickTree(n);

        for (int i = 0; i < n; i++) {
            leftSmaller[i] = bitLeft.query(mapped[i]);
            bitLeft.update(mapped[i], 1);
        }

        for (int i = n - 1; i >= 0; i--) {
            rightGreater[i] = bitRight.query(n - 1) - bitRight.query(mapped[i]);
            bitRight.update(mapped[i], 1);
        }

        long totalTriplets = 0;
        for (int i = 0; i < n; i++) {
            totalTriplets += leftSmaller[i] * rightGreater[i];
        }

        return totalTriplets;
    }

    // Binary Indexed Tree (Fenwick Tree)
    static class FenwickTree {
        private int[] tree;
        private int size;

        public FenwickTree(int n) {
            size = n + 2;
            tree = new int[size];
        }

        public void update(int index, int value) {
            index++; // BIT is 1-indexed
            while (index < size) {
                tree[index] += value;
                index += index & -index;
            }
        }

        public int query(int index) {
            index++;
            int result = 0;
            while (index > 0) {
                result += tree[index];
                index -= index & -index;
            }
            return result;
        }
    }
}
